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
import microsoft.entityframeworkcore.metadata.internal.SkipNavigation;
import microsoft.entityframeworkcore.metadata.internal.InternalModelBuilder;
import microsoft.entityframeworkcore.metadata.internal.ForeignKey;
import microsoft.entityframeworkcore.metadata.internal.InternalSkipNavigationBuilder;
import microsoft.entityframeworkcore.metadata.internal.InternalEntityTypeBuilder;
import microsoft.entityframeworkcore.metadata.internal.EntityType;
import system.reflection.FieldInfo;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.IConventionForeignKey;
import microsoft.entityframeworkcore.metadata.IConventionForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionSkipNavigation;
import microsoft.entityframeworkcore.metadata.IConventionSkipNavigationImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionSkipNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionSkipNavigationBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilderImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.InternalSkipNavigationBuilder, Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalSkipNavigationBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalSkipNavigationBuilder</a>
 */
public class InternalSkipNavigationBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.InternalSkipNavigationBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.InternalSkipNavigationBuilder";
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
    public InternalSkipNavigationBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link InternalSkipNavigationBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link InternalSkipNavigationBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static InternalSkipNavigationBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InternalSkipNavigationBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public InternalSkipNavigationBuilder() throws Throwable {
    }

    public InternalSkipNavigationBuilder(SkipNavigation metadata, InternalModelBuilder modelBuilder) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(metadata == null ? null : metadata.getJCOInstance(), modelBuilder == null ? null : modelBuilder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public InternalSkipNavigationBuilder Attach(InternalEntityTypeBuilder entityTypeBuilder, EntityType targetEntityType, InternalSkipNavigationBuilder inverseBuilder) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.RankException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAttach = (JCObject)classInstance.Invoke("Attach", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), targetEntityType == null ? null : targetEntityType.getJCOInstance(), inverseBuilder == null ? null : inverseBuilder.getJCOInstance());
            return new InternalSkipNavigationBuilder(objAttach);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalSkipNavigationBuilder HasFieldNewInternalSkipNavigationBuilder(FieldInfo fieldInfo, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldInfo == null ? null : fieldInfo.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalSkipNavigationBuilder(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalSkipNavigationBuilder HasFieldNewInternalSkipNavigationBuilder(java.lang.String fieldName, ConfigurationSource configurationSource) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldName, configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalSkipNavigationBuilder(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalSkipNavigationBuilder HasForeignKey(ForeignKey foreignKey, ConfigurationSource configurationSource) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasForeignKey = (JCObject)classInstance.Invoke("HasForeignKey", foreignKey == null ? null : foreignKey.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalSkipNavigationBuilder(objHasForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalSkipNavigationBuilder HasInverse(SkipNavigation inverse, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasInverse = (JCObject)classInstance.Invoke("HasInverse", inverse == null ? null : inverse.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalSkipNavigationBuilder(objHasInverse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetForeignKey(IConventionForeignKey foreignKey, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetInverse(IConventionSkipNavigation inverse, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionSkipNavigationBuilder HasField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionSkipNavigationBuilder HasField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionSkipNavigationBuilder HasForeignKey(IConventionForeignKey foreignKey, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionSkipNavigationBuilder method available in IConventionSkipNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionSkipNavigationBuilder HasInverse(IConventionSkipNavigation inverse, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionSkipNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionPropertyBaseBuilder method available in IConventionPropertyBaseBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionPropertyBaseBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionPropertyBaseBuilder method available in IConventionPropertyBaseBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean CanSetField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionPropertyBaseBuilder to obtain the full interface.");
    }


    
    // Properties section
    


    // Instance Events section
    

}