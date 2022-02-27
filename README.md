# Welcome to NuReflector

[![CI_BUILD](https://github.com/masesgroup/NuReflector/actions/workflows/build.yaml/badge.svg)](https://github.com/masesgroup/NuReflector/actions/workflows/build.yaml) [![CI_MAVEN](https://github.com/masesgroup/NuReflector/actions/workflows/maven.yaml/badge.svg)](https://github.com/masesgroup/NuReflector/actions/workflows/maven.yaml) [![CI_PULLREQUEST](https://github.com/masesgroup/NuReflector/actions/workflows/pullrequest.yaml/badge.svg)](https://github.com/masesgroup/NuReflector/actions/workflows/pullrequest.yaml) [![CI_RELEASE](https://github.com/masesgroup/NuReflector/actions/workflows/release.yaml/badge.svg)](https://github.com/masesgroup/NuReflector/actions/workflows/release.yaml) [![CI_WEEKLYBUILD](https://github.com/masesgroup/NuReflector/actions/workflows/weekly_build.yaml/badge.svg)](https://github.com/masesgroup/NuReflector/actions/workflows/weekly_build.yaml)

|NuReflector | NuReflectorCLI |
|---	|---	|
|[![NuReflector nuget](https://img.shields.io/nuget/v/MASES.NuReflector)](https://www.nuget.org/packages/MASES.NuReflector) [![downloads](https://img.shields.io/nuget/dt/MASES.NuReflector)](https://www.nuget.org/packages/MASES.NuReflector) | [![NuReflectorCLI nuget](https://img.shields.io/nuget/v/MASES.NuReflectorCLI)](https://www.nuget.org/packages/MASES.NuReflectorCLI) [![downloads](https://img.shields.io/nuget/dt/MASES.NuReflectorCLI)](https://www.nuget.org/packages/MASES.NuReflectorCLI) |

Engine to produce Maven artifacts from NuGet packages. It is based on [JCOReflector](https://github.com/masesgroup/JCOReflector).

This project adheres to the Contributor [Covenant code of conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code. Please report unacceptable behavior to coc_reporting@masesgroup.com.

## Scope of the project

This project aims to create a set of Maven artifacts to direct access, from a JVM, all the features available in the corresponding NuGet package.

The approach gives more than one benefit:
* all implemented features are availables at no extra implementation costs;
* avoids any third party communication protocol implementation;
* Documentation is shared.

## Runtime engine

NuReflector uses [JCOReflector](https://github.com/masesgroup/JCOReflector), and indeed [JCOBridge](https://www.jcobridge.com) with its [features](https://www.jcobridge.com/features/), to obtain many benefits:
* **Cyber-security**: 
  * [JVM](https://en.wikipedia.org/wiki/Java_virtual_machine) and [CLR, or CoreCLR,](https://en.wikipedia.org/wiki/Common_Language_Runtime) runs in the same process, but are insulated from each other;
  * JCOBridge does not make any code injection into CLR or JVM;
  * JCOBridge does not use any other communication mechanism than JNI;
  * JVM inherently inherits the cyber-security levels of running .NET (CLR); 
* **Direct access the CLR from any JVM application**: 
  * No need to learn new APIs: we try to expose the same .NET APIs in Java style;
  * No extra validation cycle: bug fix, improvements, new features are immediately available;
  * Documentation is shared.

Have a look at the following resources:
- [Release notes](https://www.jcobridge.com/release-notes/)
- [Commercial info](https://www.jcobridge.com/pricing/)
- [![JCOBridge nuget](https://img.shields.io/nuget/v/MASES.JCOBridge)](https://www.nuget.org/packages/MASES.JCOBridge)

## Maven artifacts versioning limitation

Considering the following facts:

1. Packages available on NuGet.org does not change if the version is the same. So in principle Maven artifacts could use the same version of NuGet packages.
2. Maven packages are generated using the Java classes reflected from JCOReflector engine. Stating from point 1, even if NuGet package content does not change, applying different versions, or options, of JCOReflector engine on the NuGet package assemblies, the reflected classes could be different.
3. Different Java classes associated to Maven package produce different artifacts, but public Maven repositories does not accept to republish artifacts with the same version.

The actual implementation generates **SNAPSHOT** Maven artifacts, until we found a way to publish different Maven artifacts in _Release_ mode considering both NuGet package version and JCOReflector version.
The actual behavior is:
- The Maven package version has the same NuGet package version;
- The dependency within the POM stores the JCOReflector version used;
- The file JCOReflectorOptions.java under org.mases.jcobridge.netreflection namespace stores the options used.

## **Important notes** on packages

Read below chapters carefully.

### Maven artifact requirement for runtime

**The artifacts themself do not install the associated NuGet packages. The final user must downloads separately the NuGet packages and make assemblies available to the engine.**

### Copyright notice

Source code, Maven POM and artifacts published are generated starting from public nuget packages available on [NuGet.org](https://nuget.org). 
**All trademarks, product names, and company names or logos are the property of their respective owners.**
To effectively use each Maven artifact the final user must accept the license associated to the reflected NuGet package.
If there is any infringment of copyright report an issue.

### Documentation

The documentation available in the generated POM and therein in the published artifact is read from the original NuGet package.
The engine try, at its best, to report, in all ways, the source of any text read from the NuGet package.

The javadoc produced from the engine can be incorrect due to a constraint in JCOReflector engine.
