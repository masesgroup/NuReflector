# Welcome to NuReflector

Engine to produce Maven artifacts from NuGet packages. It is based on [JCOReflector](https://github.com/masesgroup/JCOReflector).

This project adheres to the Contributor [Covenant code of conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code. Please report unacceptable behavior to coc_reporting@masesgroup.com.

## Maven artifacts versioning limitation

Considering the following facts:

- Packages available on NuGet.org does not change if the version is the same. So in principle Maven artifacts can use the same version of NuGet packages.
- Maven packages are generated using the Java classes reflected from JCOReflector engine. Even if NuGet package does not change, applying different versions, or options, of JCOReflector engine on the NuGet package assemblies, the reflected classes can be different.
- Public Maven repositories does not accept to republish artifacts with the same version.

The Maven artifacts are produced as SNAPSHOT, until we found a way to publish different Maven artifacts in _Release_ mode considering both NuGet package version and JCOReflector version.
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
The engine try at the best to report, in all ways, the source of any text used outside the one introduced from the engine itself.

The javadoc produced from the engine can be incorrect due to a constraint in JCOReflector engine.