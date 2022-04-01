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

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.entityframeworkcore.metadata.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.internal.ForeignKey;
import microsoft.entityframeworkcore.metadata.internal.InternalModelBuilder;
import microsoft.entityframeworkcore.metadata.internal.EntityType;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.metadata.internal.InternalForeignKeyBuilder;
import microsoft.entityframeworkcore.metadata.internal.InternalEntityTypeBuilder;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionForeignKeyBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionForeignKeyBuilderImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.InternalForeignKeyBuilder, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalForeignKeyBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalForeignKeyBuilder</a>
 */
public class InternalForeignKeyBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.InternalForeignKeyBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.InternalForeignKeyBuilder";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }
    /**
     * Internal constructor. Use with caution 
     */
    public InternalForeignKeyBuilder(java.lang.Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public java.lang.Object getJCOInstance() {
        return classInstance;
    }

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link InternalForeignKeyBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link InternalForeignKeyBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static InternalForeignKeyBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InternalForeignKeyBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public InternalForeignKeyBuilder() throws Throwable {
    }

    public InternalForeignKeyBuilder(ForeignKey foreignKey, InternalModelBuilder modelBuilder) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(foreignKey == null ? null : foreignKey.getJCOInstance(), modelBuilder == null ? null : modelBuilder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public InternalForeignKeyBuilder Attach(InternalEntityTypeBuilder entityTypeBuilder) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.RankException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAttach = (JCObject)classInstance.Invoke("Attach", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance());
            return new InternalForeignKeyBuilder(objAttach);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder DependentEntityType(EntityType dependentEntityType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDependentEntityType = (JCObject)classInstance.Invoke("DependentEntityType", dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objDependentEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasEntityTypes(EntityType principalEntityType, EntityType dependentEntityType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasEntityTypes = (JCObject)classInstance.Invoke("HasEntityTypes", principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasEntityTypes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigation(MemberInfo property, boolean pointsToPrincipal, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigation = (JCObject)classInstance.Invoke("HasNavigation", property == null ? null : property.getJCOInstance(), pointsToPrincipal, configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigation(java.lang.String name, boolean pointsToPrincipal, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigation = (JCObject)classInstance.Invoke("HasNavigation", name, pointsToPrincipal, configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigations(MemberInfo navigationToPrincipal, MemberInfo navigationToDependent, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigations = (JCObject)classInstance.Invoke("HasNavigations", navigationToPrincipal == null ? null : navigationToPrincipal.getJCOInstance(), navigationToDependent == null ? null : navigationToDependent.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigations(MemberInfo navigationToPrincipal, MemberInfo navigationToDependent, EntityType principalEntityType, EntityType dependentEntityType, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigations = (JCObject)classInstance.Invoke("HasNavigations", navigationToPrincipal == null ? null : navigationToPrincipal.getJCOInstance(), navigationToDependent == null ? null : navigationToDependent.getJCOInstance(), principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigations(java.lang.String navigationToPrincipalName, java.lang.String navigationToDependentName, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigations = (JCObject)classInstance.Invoke("HasNavigations", navigationToPrincipalName, navigationToDependentName, configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder HasNavigations(java.lang.String navigationToPrincipalName, java.lang.String navigationToDependentName, EntityType principalEntityType, EntityType dependentEntityType, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNavigations = (JCObject)classInstance.Invoke("HasNavigations", navigationToPrincipalName, navigationToDependentName, principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objHasNavigations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder PrincipalEntityType(EntityType principalEntityType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPrincipalEntityType = (JCObject)classInstance.Invoke("PrincipalEntityType", principalEntityType == null ? null : principalEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalForeignKeyBuilder(objPrincipalEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalForeignKeyBuilder ReuniquifyImplicitProperties(boolean force) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.FormatException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReuniquifyImplicitProperties = (JCObject)classInstance.Invoke("ReuniquifyImplicitProperties", force);
            return new InternalForeignKeyBuilder(objReuniquifyImplicitProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemberInfo FindCompatibleClrMember(java.lang.String navigationName, EntityType sourceType, EntityType targetType, boolean shouldThrow) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindCompatibleClrMember = (JCObject)classType.Invoke("FindCompatibleClrMember", navigationName, sourceType == null ? null : sourceType.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance(), shouldThrow);
            return new MemberInfo(objFindCompatibleClrMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowForConflictingNavigation(IReadOnlyForeignKey foreignKey, IReadOnlyEntityType principalEntityType, IReadOnlyEntityType dependentEntityType, java.lang.String navigationToDependent, java.lang.String navigationToPrincipal) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.ArgumentException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ThrowForConflictingNavigation", foreignKey == null ? null : foreignKey.getJCOInstance(), principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), navigationToDependent, navigationToPrincipal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowForConflictingNavigation(IReadOnlyForeignKey foreignKey, java.lang.String newInverseName, boolean newToPrincipal) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ThrowForConflictingNavigation", foreignKey == null ? null : foreignKey.getJCOInstance(), newInverseName, newToPrincipal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetEntityTypes(IConventionEntityType principalEntityType, IConventionEntityType dependentEntityType, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetNavigation(MemberInfo property, boolean pointsToPrincipal, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetNavigation(java.lang.String name, boolean pointsToPrincipal, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetNavigations(MemberInfo navigationToPrincipal, MemberInfo navigationToDependent, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetNavigations(java.lang.String navigationToPrincipalName, java.lang.String navigationToDependentName, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionForeignKeyBuilder HasEntityTypes(IConventionEntityType principalEntityType, IConventionEntityType dependentEntityType, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionForeignKeyBuilder HasNavigation(MemberInfo property, boolean pointsToPrincipal, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionForeignKeyBuilder HasNavigation(java.lang.String name, boolean pointsToPrincipal, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionForeignKeyBuilder HasNavigations(MemberInfo navigationToPrincipal, MemberInfo navigationToDependent, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionForeignKeyBuilder method available in IConventionForeignKeyBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionForeignKeyBuilder HasNavigations(java.lang.String navigationToPrincipalName, java.lang.String navigationToDependentName, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionForeignKeyBuilder to obtain the full interface.");
    }


    
    // Properties section
    


    // Instance Events section
    

}