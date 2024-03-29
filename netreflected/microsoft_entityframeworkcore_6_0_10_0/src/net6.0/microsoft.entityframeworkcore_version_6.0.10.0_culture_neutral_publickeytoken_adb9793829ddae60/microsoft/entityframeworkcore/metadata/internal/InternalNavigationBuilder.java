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
import microsoft.entityframeworkcore.metadata.internal.Navigation;
import microsoft.entityframeworkcore.metadata.internal.InternalModelBuilder;
import microsoft.entityframeworkcore.metadata.internal.InternalNavigationBuilder;
import system.reflection.FieldInfo;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.builders.IConventionNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionNavigationBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilderImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.InternalNavigationBuilder, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalNavigationBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.InternalNavigationBuilder</a>
 */
public class InternalNavigationBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.InternalNavigationBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.InternalNavigationBuilder";
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
    public InternalNavigationBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link InternalNavigationBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link InternalNavigationBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static InternalNavigationBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InternalNavigationBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public InternalNavigationBuilder() throws Throwable {
    }

    public InternalNavigationBuilder(Navigation metadata, InternalModelBuilder modelBuilder) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(metadata == null ? null : metadata.getJCOInstance(), modelBuilder == null ? null : modelBuilder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public InternalNavigationBuilder HasFieldNewInternalNavigationBuilder(FieldInfo fieldInfo, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldInfo == null ? null : fieldInfo.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalNavigationBuilder(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalNavigationBuilder HasFieldNewInternalNavigationBuilder(java.lang.String fieldName, ConfigurationSource configurationSource) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldName, configurationSource == null ? null : configurationSource.getJCOInstance());
            return new InternalNavigationBuilder(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionNavigationBuilder method available in IConventionNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionNavigationBuilder HasField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionNavigationBuilder to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionNavigationBuilder method available in IConventionNavigationBuilder to obtain an object with an invocable method
     */
    @Deprecated 
    public IConventionNavigationBuilder HasField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionNavigationBuilder to obtain the full interface.");
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