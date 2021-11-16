/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

using MASES.CLIParser;
using MASES.JCOReflectorEngine;
using Newtonsoft.Json;
using NuGet.Common;
using NuGet.Frameworks;
using NuGet.Packaging;
using NuGet.Packaging.Core;
using NuGet.Protocol;
using NuGet.Protocol.Core.Types;
using NuGet.Versioning;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Threading;

namespace MASES.NuReflector
{
    /// <summary>
    /// Public entry point for the reflector
    /// </summary>
    public static class Reflector
    {
        public class CLIParam
        {
            // CommonArgs
            public const string PackagesFile = "PackagesFile";
            public const string NuGetFeed = "Feed";
            public const string PackageId = "PackageId";
            public const string PackageVersion = "PackageVersion";
            public const string PreRelease = "PreRelease";
            public const string CommonSourceFolder = "CommonSourceFolder";
            public const string POMProjectTemplateFile = "POMProjectTemplateFile";
            public const string POMTemplateFile = "POMTemplateFile";
            public const string POMStaging = "POMStaging";
        }

        public static readonly Parser Parser = Parser.CreateInstance(new Settings()
        {
            DefaultType = ArgumentType.Double
        });

        static Reflector()
        {
            JobManager.ErrorReporting = ErrorReportingType.Both;
            JobManager.SetHandler(appendToConsole, endOperation);
            arguments = prepareArguments();
            Parser.Add(arguments);
        }

        static appendToConsoleHandler AppendToConsoleHandler;
        static EventHandler<EndOperationEventArgs> EndOperationHandler;

        /// <summary>
        /// Sets the operations handler 
        /// </summary>
        /// <param name="appendToConsoleHandler">Handler for logging purpose</param>
        /// <param name="endOperationHandler">Handler for completed operations</param>
        public static void SetHandler(appendToConsoleHandler appendToConsoleHandler, EventHandler<EndOperationEventArgs> endOperationHandler)
        {
            AppendToConsoleHandler = appendToConsoleHandler;
            EndOperationHandler = endOperationHandler;
        }

        static void appendToConsole(string format, params object[] args)
        {
            AppendToConsoleHandler?.Invoke(format, args);
        }

        static bool propagateInCaseOfError = false;
        static void endOperation(object sender, EndOperationEventArgs args)
        {
            bool execute = !args.Failed || propagateInCaseOfError;
            if (execute) EndOperationHandler?.Invoke(sender, args);
        }

        static IArgumentMetadata[] arguments = null;
        static IArgumentMetadata[] prepareArguments()
        {
            return new IArgumentMetadata[]
            {
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.PackagesFile,
                    Help = "The file containing the list of packages to be analyzed.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.NuGetFeed,
                    Default = InternalConst.DefaultFeed,
                    Help = "The feed to be contacted.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.PackageId,
                    Help = "The package name to be reflected.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.PackageVersion,
                    Default = null,
                    Help = "The package name to be reflected, otherwise the latest version will be used.",
                },
                new ArgumentMetadata<bool>()
                {
                    Name = CLIParam.PreRelease,
                    Default = false,
                    Help = "Find pre release version.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.CommonSourceFolder,
                    Default = InternalConst.DefaultCommonSourceFolder,
                    Help = "The source folder to use to put reflected classes based on PackageId.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.POMTemplateFile,
                    Default = null,
                    Help = "The source POM template to use when generating the POM for the package.",
                },
                new ArgumentMetadata<string>()
                {
                    Name = CLIParam.POMProjectTemplateFile,
                    Default = null,
                    Help = "The source POM template to use when generating the super-project POM for the package.",
                },
                new ArgumentMetadata<POMStagingType>()
                {
                    Name = CLIParam.POMStaging,
                    Default = POMStagingType.Snapshot,
                    Help = "The source POM template to use when generating the super-project POM for the package.",
                },
            };
        }

        public static void Execute(params string[] args)
        {
            var lastParsedArguments = Parser.Parse(args);

            var feed = lastParsedArguments.Get<string>(CLIParam.NuGetFeed);
            var packageId = lastParsedArguments.Get<string>(CLIParam.PackageId);
            var packageVersion = lastParsedArguments.Get<string>(CLIParam.PackageVersion);
            var prerelease = lastParsedArguments.Get<bool>(CLIParam.PreRelease);
            var sourceFolder = lastParsedArguments.Get<string>(CLIParam.CommonSourceFolder);
            sourceFolder = Path.Combine(JobManager.RootFolder, sourceFolder);
            var pomTemplateFile = lastParsedArguments.Get<string>(CLIParam.POMTemplateFile);
            if (string.IsNullOrEmpty(pomTemplateFile))
            {
                pomTemplateFile = Path.GetTempFileName();
                using (var stream = typeof(Reflector).Assembly.GetManifestResourceStream(typeof(Reflector).Namespace + "." + InternalConst.POM.POMOriginalFile))
                {
                    using (var sr = new StreamReader(stream))
                    {
                        File.WriteAllText(pomTemplateFile, sr.ReadToEnd());
                    }
                }
            }

            var pomProjectTemplateFile = lastParsedArguments.Get<string>(CLIParam.POMProjectTemplateFile);
            if (string.IsNullOrEmpty(pomProjectTemplateFile))
            {
                pomProjectTemplateFile = Path.GetTempFileName();
                using (var stream = typeof(Reflector).Assembly.GetManifestResourceStream(typeof(Reflector).Namespace + "." + InternalConst.POM.ParentPOMOriginalFile))
                {
                    using (var sr = new StreamReader(stream))
                    {
                        File.WriteAllText(pomProjectTemplateFile, sr.ReadToEnd());
                    }
                }
            }

            Generator.Staging = lastParsedArguments.Get<POMStagingType>(CLIParam.POMStaging);

            List<string> parsedPackages = new List<string>();

            if (lastParsedArguments.Exist(CLIParam.PackagesFile))
            {
                var fileName = lastParsedArguments.Get<string>(CLIParam.PackagesFile);
                var content = File.ReadAllText(fileName);
                var packages = JsonConvert.DeserializeObject<PackagesDefinition>(content);

                foreach (var item in packages.Packages)
                {
                    if (Execute(sourceFolder, pomProjectTemplateFile, pomTemplateFile, item.PackageId, feed, item.PackageVersion, item.PreRelease))
                    {
                        parsedPackages.Add(item.PackageId);
                    }
                }
            }
            else if (!string.IsNullOrEmpty(packageId))
            {
                if (Execute(sourceFolder, pomProjectTemplateFile, pomTemplateFile, packageId, feed, packageVersion, prerelease))
                {
                    parsedPackages.Add(packageId);
                }
            }
            else throw new ArgumentException("Neighter PackageId nor PackagesFile found in command line.");

            // now build the Maven super project
            StringBuilder sb = new StringBuilder();
            foreach (var item in parsedPackages)
            {
                sb.AppendLine(string.Format(InternalConst.POM.POMModuleTemplate, item.ToLowerInvariant() + "_" + JobManager.RuntimeFolder + ".xml"));
            }
            var pomProjectTemplate = File.ReadAllText(pomProjectTemplateFile);
            var pomProject = pomProjectTemplate.Replace(InternalConst.POM.POM_ADDITIONAL_MODULES_PLACEHOLDER, sb.ToString())
                                               .Replace(InternalConst.POM.POM_PARENT_NAME_PLACEHOLDER, JobManager.RuntimeFolder + " Master Project")
                                               .Replace(InternalConst.POM.POM_ARTIFACTID_PLACEHOLDER, JobManager.RuntimeFolder);
            var pomProjectName = Path.Combine(sourceFolder, JobManager.RuntimeFolder + ".xml");
            File.WriteAllText(pomProjectName, pomProject);
            appendToConsole($"Master POM created in {pomProjectName}");
        }

        public static bool Execute(string sourceFolder, string pomProjectTemplateFile, string pomTemplateFile, string packageId, string feed = InternalConst.DefaultFeed, string packageVersion = null, bool usePreRelease = false)
        {
            IList<PackageIdentity> parsedPackages = new List<PackageIdentity>();
            if (Generator.Execute(parsedPackages, sourceFolder, pomTemplateFile, packageId, feed, packageVersion, usePreRelease))
            {
                StringBuilder sb = new StringBuilder();
                foreach (var item in parsedPackages)
                {
                    sb.AppendLine(string.Format(InternalConst.POM.POMModuleTemplate, item.ToFolder() + "/src/" + JobManager.RuntimeFolder + ".xml"));
                }
                var pomProjectTemplate = File.ReadAllText(pomProjectTemplateFile);
                var pomProject = pomProjectTemplate.Replace(InternalConst.POM.POM_ADDITIONAL_MODULES_PLACEHOLDER, sb.ToString())
                                                   .Replace(InternalConst.POM.POM_PARENT_NAME_PLACEHOLDER, packageId + " " + JobManager.RuntimeFolder + " Master Project")
                                                   .Replace(InternalConst.POM.POM_ARTIFACTID_PLACEHOLDER, packageId.ToLowerInvariant());
                var pomProjectName = Path.Combine(sourceFolder, packageId.ToLowerInvariant() + "_" + JobManager.RuntimeFolder + ".xml");
                File.WriteAllText(pomProjectName, pomProject);
                appendToConsole($"Master package POM created in {pomProjectName}");
                return true;
            }
            appendToConsole($"Failed to parse {packageId}");
            return false;
        }

        public static string GetArgumentHelp()
        {
            int newPadding = Parser.PaddingFromArguments();
            Parser.Settings.DefaultDescriptionPadding = newPadding;
            StringBuilder sb = new StringBuilder(Parser.HelpInfo());
            sb.AppendLine();
            sb.AppendLine("----------------------JCOReflector arguments----------------------");
            sb.AppendLine();
            sb.AppendLine(JobManager.GetArgumentHelp());
            return sb.ToString();
        }

        static bool checkFramework(this NuGetFramework framework)
        {
            return framework == NuGetFramework.AnyFramework
#if NET6_0_OR_GREATER
                                || framework.Framework == InternalConst.Framework.NetStandardRuntime // .NETStandard fallback to .NET 6
#endif
                                || (framework.Framework == JobManager.RuntimeName && framework.Version >= InternalConst.Framework.Version);
        }

        static string ToFolder(string packageId, NuGetVersion packageVersion)
        {
            return (packageId.ToLowerInvariant() + "_" + packageVersion.Version.ToString()).Replace('.', '_');
        }

        static string ToFolder(this PackageIdentity package)
        {
            return (package.Id.ToLowerInvariant() + "_" + package.Version.Version.ToString()).Replace('.', '_');
        }

        class Generator
        {
            public static POMStagingType Staging { get; set; }

            internal readonly string POMTemplateFile = null;
            internal readonly string SourceFolder = null;
            readonly ReflectorEventArgs reflectArg = null;
            readonly POMBuilderEventArgs POMArg = null;
            readonly string ReflectorEngineVersion = JobManager.EngineVersion.ToString();

            public static bool Execute(IList<PackageIdentity> parsedPackaged, string sourceFolder, string pomTemplateFile, string packageId, string feed = InternalConst.DefaultFeed, string packageVersion = null, bool usePreRelease = false)
            {
                var generator = new Generator(sourceFolder, pomTemplateFile, packageId, feed, packageVersion, usePreRelease);
                return generator.DownloadAndPrepare(parsedPackaged, packageId, feed, packageVersion, usePreRelease);
            }

            public Generator(string sourceFolder, string pomTemplateFile, string packageId, string feed = InternalConst.DefaultFeed, string packageVersion = null, bool usePreRelease = false)
            {
                SourceFolder = sourceFolder;
                POMTemplateFile = pomTemplateFile;

                reflectArg = new ReflectorEventArgs(JCOReflectorEngine.LogLevel.Error)
                {
                    JobType = JobTypes.Reflect,
                    SplitFolderByAssembly = true,
                    ForceRebuild = true,
                    UseParallelBuild = true,
                    AvoidHierarchyTraversing = true,
                    CreateExceptionThrownClause = true,
                    ExceptionThrownClauseDepth = 10,
                    EnableAbstract = true,
                    EnableArray = true,
                    EnableDuplicateMethodNativeArrayWithJCRefOut = true,
                    EnableInheritance = true,
                    EnableInterfaceInheritance = true,
                    EnableRefOutParameters = true,
                    AvoidReportAndStatistics = true,
                };

                POMArg = new POMBuilderEventArgs()
                {
                    JobType = JobTypes.CreatePOM,
                    POMType = POMType.Extension,
                    POMStagingType = Staging,
                    AvoidJCOReflectorFolder = true,
                    POMArtifactId = packageId.ToLowerInvariant() + "_" + JobManager.RuntimeFolder,
                    POMName = packageId.ToLowerInvariant(),
                    POMFileName = pomTemplateFile
                };
            }

            public bool DownloadAndPrepare(IList<PackageIdentity> parsedPackages, string packageId, string feed = InternalConst.DefaultFeed, string packageVersion = null, bool usePreRelease = false)
            {
                return DownloadAndPrepare(parsedPackages, packageId, feed, packageVersion == null ? null : new NuGetVersion(packageVersion), usePreRelease);
            }

            public bool DownloadAndPrepare(IList<PackageIdentity> parsedPackages, string packageId, string feed = InternalConst.DefaultFeed, NuGetVersion packageVersion = null, bool usePreRelease = false)
            {
                ILogger logger = NullLogger.Instance;
                CancellationToken cancellationToken = CancellationToken.None;

                SourceCacheContext cache = new SourceCacheContext();
                SourceRepository repository = Repository.Factory.GetCoreV3(feed);
                FindPackageByIdResource resource = repository.GetResource<FindPackageByIdResource>();
                if (packageVersion == null)
                {
                    appendToConsole($"Searching latest version of package {packageId}");
                    Version version = new Version();
                    var tsk = resource.GetAllVersionsAsync(packageId, cache, logger, cancellationToken);
                    tsk.Wait();
                    foreach (var item in tsk.Result)
                    {
                        if (!usePreRelease && item.IsPrerelease) continue;
                        if (item.Version > version)
                        {
                            version = item.Version;
                        }
                    }
                    packageVersion = new NuGetVersion(version);
                }

                using (MemoryStream packageStream = new MemoryStream())
                {
                    appendToConsole($"Downloading package {packageId} {packageVersion}");

                    var tsk = resource.CopyNupkgToStreamAsync(
                        packageId,
                        packageVersion,
                        packageStream,
                        cache,
                        logger,
                        cancellationToken);
                    tsk.Wait();

                    if (!tsk.Result)
                    {
                        appendToConsole($"Failed to download package {packageId}:{packageVersion}");
                        return false;
                    }

                    string tempFolder = string.Empty;
#if DEBUG
                    var tempPath = @"D:\TEMPPackage";
#else
                    var tempPath = Path.GetTempPath();
#endif
                    tempFolder = Path.Combine(tempPath, packageId);

                    StringBuilder dependencies = new StringBuilder();

                    using (PackageArchiveReader packageReader = new PackageArchiveReader(packageStream))
                    {
                        FrameworkSpecificGroup libItemToAnalyze = null;
                        Version version = new Version();
                        foreach (FrameworkSpecificGroup libItem in packageReader.GetLibItems())
                        {
                            if (libItem.TargetFramework.checkFramework() && libItem.TargetFramework.Version > version)
                            {
                                if (libItem.HasEmptyFolder) continue;
                                appendToConsole($"Storing temporary {libItem.TargetFramework} of {packageId}:{packageVersion}");
                                version = libItem.TargetFramework.Version;
                                libItemToAnalyze = libItem;
                            }
                        }

                        if (libItemToAnalyze == null)
                        {
                            appendToConsole($"No items found in package {packageId} which match Framework criteria");
                            return false;
                        }

                        foreach (var depItem in packageReader.GetPackageDependencies())
                        {
                            if (depItem.TargetFramework.checkFramework() && depItem.TargetFramework.Version == version)
                            {
                                foreach (var packItem in depItem.Packages)
                                {
                                    var nuVersion = packItem.VersionRange.IsMaxInclusive ? packItem.VersionRange.MaxVersion : packItem.VersionRange.MinVersion;
                                    appendToConsole($"Analyzing dependency package {packItem.Id} {nuVersion}");
                                    try
                                    {
                                        if (Execute(parsedPackages, SourceFolder, POMTemplateFile, packItem.Id, feed, nuVersion.Version.ToString(), nuVersion.IsPrerelease))
                                        {
                                            dependencies.AppendLine(string.Format(InternalConst.POM.POMDependencyTemplate,
                                                                                  packItem.Id.ToLowerInvariant(),
                                                                                  JobManager.RuntimeFolder,
                                                                                  nuVersion.Version.ToString() + (Staging == POMStagingType.Release ? string.Empty : "-SNAPSHOT")));
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        appendToConsole($"Analyzing dependency package {packItem.Id} {nuVersion} failed with error {e.Message}");
                                    }
                                }
                            }
                        }

                        var destFolder = Path.Combine(SourceFolder, ToFolder(packageId, packageVersion));

                        bool cleanupFolder = false;
                        bool executeReflection = true;
                        PackageDefinition pkgStored = null;
                        var packageIdentityFile = Path.Combine(destFolder, packageId + ".json");
                        if (File.Exists(packageIdentityFile))
                        {
                            var content = File.ReadAllText(packageIdentityFile);
                            pkgStored = JsonConvert.DeserializeObject<PackageDefinition>(content);
                            if (pkgStored.ReflectorEngineVersion == ReflectorEngineVersion 
                                && packageVersion.Version <= Version.Parse(pkgStored.PackageVersion)
#if NETCOREAPP3_1
#error Not supported due to missing JCOReflector Maven Artifact
#elif NET5_0
                                && pkgStored.Net5Done
#elif NET6_0
                                && pkgStored.Net6Done
#elif NETFRAMEWORK
                                && pkgStored.NetFrameworkDone
#else
#error Unable to identify .NET engine
#endif
                                )
                            {
                                appendToConsole($"Already updated package {packageId} {packageVersion}");
                                executeReflection = false;
                            }

                            if (pkgStored.ReflectorEngineVersion != ReflectorEngineVersion
#if NETCOREAPP3_1
#error Not supported due to missing JCOReflector Maven Artifact
#elif NET5_0
                                && pkgStored.Net5Done
#elif NET6_0
                                && pkgStored.Net6Done
#elif NETFRAMEWORK
                                && pkgStored.NetFrameworkDone
#else
#error Unable to identify .NET engine
#endif
                                )
                            {
                                appendToConsole($"Already updated package {packageId} {packageVersion}");
                                cleanupFolder = true;
                            }
                        }

                        if (cleanupFolder)
                        {
                            var folderToDelete = Path.Combine(destFolder, "src", JobManager.RuntimeFolder);
                            if (Directory.Exists(folderToDelete))
                            {
                                try
                                {
                                    Directory.Delete(folderToDelete, true);
                                }
                                catch (Exception e)
                                {
                                    appendToConsole($"Failed to remove package folder {folderToDelete}: {e.Message}");
                                }
                            }
                        }

                        if (executeReflection)
                        {
                            List<string> items = new List<string>();
                            appendToConsole($"Analyzing {libItemToAnalyze.TargetFramework} of {packageId}:{packageVersion}");
                            foreach (var folder in libItemToAnalyze.Items)
                            {
                                if (!folder.EndsWith(".dll")) continue; // filter only DLL
                                var file = Path.Combine(tempFolder, folder);
                                file = file.Replace('\\', '/');
                                var res = packageReader.ExtractFile(folder, file, logger);
                                appendToConsole($"Exported assembly {res}");
                                items.Add(file);
                            }

                            if (items.Count == 0)
                            {
                                appendToConsole($"No items found in package {packageId}");
                                return false;
                            }

                            if (pkgStored == null)
                            {
                                pkgStored = new PackageDefinition()
                                {
                                    PackageId = packageId,
                                    PackageVersion = packageVersion.Version.ToString(),
                                    PreRelease = usePreRelease
                                };
                            }

                            reflectArg.SourceFolder = destFolder;
                            reflectArg.AssemblyNames = items.ToArray();

                            JobManager.RunJob(reflectArg, true);

                            pkgStored.ReflectorEngineVersion = ReflectorEngineVersion;
#if NETCOREAPP3_1
#error Not supported due to missing JCOReflector Maven Artifact
#elif NET5_0
                            pkgStored.Net5Done = true;
#elif NET6_0
                            pkgStored.Net6Done = true;
#elif NETFRAMEWORK
                            pkgStored.NetFrameworkDone = true;
#else
#error Unable to identify .NET engine
#endif
                            var packageIdentity = JsonConvert.SerializeObject(pkgStored);

                            if (!Directory.Exists(reflectArg.SourceFolder))
                            {
                                Directory.CreateDirectory(reflectArg.SourceFolder);
                            }

                            File.WriteAllText(Path.Combine(reflectArg.SourceFolder, packageId + ".json"), packageIdentity);
                        }

                        var packIdentity = new PackageIdentity(packageId, packageVersion);

                        if (!parsedPackages.Contains(packIdentity)) parsedPackages.Add(packIdentity);

                        POMArg.SourceFolder = destFolder;
                        POMArg.POMVersion = packageVersion.Version.ToString();

                        var desc = packageReader.NuspecReader.GetDescription();
                        StringBuilder descBuilder = new StringBuilder(string.Format(InternalConst.POM.POMDescriptionTemplate,
                                                                                        InternalConst.DefaultSite,
                                                                                        packageId.ToLowerInvariant(),
                                                                                        packageVersion.Version.ToString()));
                        if (!string.IsNullOrEmpty(desc))
                        {
                            descBuilder.AppendLine(desc.Replace("\"", "&quot;")
                                                       .Replace("'", "&apos;")
                                                       .Replace("<", "&lt;")
                                                       .Replace(">", "&gt;")
                                                       .Replace("&", "&amp;"));
                        }
                        POMArg.POMDescription = descBuilder.ToString();
                        POMArg.POMAdditionalDependencies = dependencies.ToString();

                        JobManager.RunJob(POMArg, true);
                    }
                }

                return true;
            }
        }
    }
}