/*
 *  MIT License
 *
 *  Copyright (c) 2023 MASES s.r.l.
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

using MASES.JCOReflectorEngine;
using MASES.NuReflector;
using System;
using System.Reflection;
using System.Text;

namespace MASES.NuReflectorCLI
{
    class Program
    {
        static void showHelp(string errorString = null)
        {
            var assembly = typeof(Program).Assembly;
#if NETCOREAPP3_1
            var title = "NuReflector CLI - CLI interface for NuReflector Engine (.NET Core)";
#elif NET5_0
            var title = "NuReflector CLI - CLI interface for NuReflector Engine (.NET 5)";
#elif NET6_0
            var title = "NuReflector CLI - CLI interface for NuReflector Engine (.NET 6)";
#elif NETFRAMEWORK
            var title = "NuReflector CLI - CLI interface for NuReflector Engine (.NET Framework)";
#else
#error Unable to identify .NET engine
#endif

            Console.WriteLine(title + " - Version " + assembly.GetName().Version.ToString());
            Console.WriteLine(assembly.GetName().Name + " ...");
            Console.WriteLine();
            if (!string.IsNullOrEmpty(errorString))
            {
                Console.WriteLine("Error: {0}", errorString);
            }
            Console.WriteLine();
#if !GITHUB_ACTIONS
            try
            {
                Console.WriteLine(Reflector.GetArgumentHelp());
            }
            catch { }
#endif
        }

        static void Main(string[] args)
        {
            Reflector.SetHandler(AppendToConsole, EndOperation);

            if (args.Length == 0)
            {
                showHelp();
                Environment.ExitCode = -1;
                return;
            }

            try
            {
                Reflector.Execute(args);
            }
            catch (ReflectionTypeLoadException rtle)
            {
                StringBuilder sb = new StringBuilder();
                sb.AppendLine(rtle.Message);
                if (rtle.InnerException != null)
                {
                    sb.AppendLine($"InnerException: {rtle.InnerException.Message}");
                }
                if (rtle.Types != null)
                {
                    sb.AppendLine("Types:");
                    foreach (var item in rtle.Types)
                    {
                        sb.AppendLine($"  {item}");
                    }
                }
                if (rtle.LoaderExceptions != null)
                {
                    sb.AppendLine("LoaderExceptions:");
                    foreach (var item in rtle.LoaderExceptions)
                    {
                        sb.AppendLine($"  {item.Message}");
                    }
                }
                showHelp(sb.ToString());
                Environment.ExitCode = -1;
                return;
            }
            catch (Exception e)
            {
                showHelp(e.Message);
                Environment.ExitCode = -1;
                return;
            }
        }

        private static void AppendToConsole(string format, params object[] args)
        {
            Console.WriteLine(format, args);
        }

        private static void EndOperation(object sender, EndOperationEventArgs args)
        {
            Console.WriteLine(args.Report);
            if (args.Failed) Environment.Exit(-1);
        }
    }
}
