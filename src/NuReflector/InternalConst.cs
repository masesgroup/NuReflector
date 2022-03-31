/*
 *  MIT License
 *
 *  Copyright (c) 2022 MASES s.r.l.
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

using System;

namespace MASES.NuReflector
{
    class InternalConst
    {
        public const string DefaultFeed = "https://api.nuget.org/v3/index.json";
        public const string DefaultSite = "https://www.nuget.org/packages";
        public const string DefaultCommonSourceFolder = "netreflected";

        public class POM
        {
            public const string ParentPOMOriginalFile = "defaultParentPOM.template";
            public const string POMOriginalFile = "defaultPOM.template";

            public const string POM_ARTIFACTID_PLACEHOLDER = "POM_ARTIFACTID_PLACEHOLDER";
            public const string POM_PARENT_NAME_PLACEHOLDER = "POM_PARENT_NAME_PLACEHOLDER";
            public const string POM_NAME_PLACEHOLDER = "POM_NAME_PLACEHOLDER";
            public const string POM_ADDITIONAL_MODULES_PLACEHOLDER = "POM_ADDITIONAL_MODULES_PLACEHOLDER";

            public static readonly string POMModuleTemplate = "    <module>{0}</module>";

            public static readonly string POMDependencyTemplate = "    <dependency>" + Environment.NewLine +
                                                                  "      <groupId>com.masesgroup</groupId> " + Environment.NewLine +
                                                                  "      <artifactId>{0}_{1}</artifactId>" + Environment.NewLine +
                                                                  "      <version>{2}</version>" + Environment.NewLine +
                                                                  "    </dependency>";

            public static readonly string POMDescriptionTemplate = "The original version of the package, and description below, is available at the following address: {0}/{1}/{2}" + Environment.NewLine;
        }
        public class Framework
        {
            public const string All = "All";

            public const string NetStandardRuntime = ".NETStandard";
#if NETCOREAPP3_1
            public static Version Version = new Version(3, 1, 0);
#elif NET5_0
            public static Version Version = new Version(5, 0, 0);
#elif NET6_0
            public static Version Version = new Version(6, 0, 0);
#elif NETFRAMEWORK
            public static Version Version = new Version(4, 0, 0);
#else
#error Unable to identify .NET engine
#endif
        }
    }
}
