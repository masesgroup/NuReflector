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
import microsoft.entityframeworkcore.metadata.internal.PropertyBase;
import system.reflection.PropertyInfo;
import system.reflection.FieldInfo;
import microsoft.entityframeworkcore.metadata.internal.EntityType;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.ServiceParameterBinding;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.infrastructure.DebugView;
import microsoft.entityframeworkcore.metadata.internal.InternalServicePropertyBuilder;
import microsoft.entityframeworkcore.metadata.internal.TypeBase;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.ServiceProperty, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.ServiceProperty" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.ServiceProperty</a>
 */
public class ServiceProperty extends PropertyBase  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.ServiceProperty
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.ServiceProperty";
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
    public ServiceProperty(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServiceProperty}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServiceProperty} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServiceProperty cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceProperty(from.getJCOInstance());
    }

    // Constructors section
    
    public ServiceProperty() throws Throwable {
    }

    public ServiceProperty(java.lang.String name, PropertyInfo propertyInfo, FieldInfo fieldInfo, EntityType declaringEntityType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name, propertyInfo == null ? null : propertyInfo.getJCOInstance(), fieldInfo == null ? null : fieldInfo.getJCOInstance(), declaringEntityType == null ? null : declaringEntityType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ServiceParameterBinding SetParameterBinding(ServiceParameterBinding parameterBinding, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetParameterBinding = (JCObject)classInstance.Invoke("SetParameterBinding", parameterBinding == null ? null : parameterBinding.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new ServiceParameterBinding(objSetParameterBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRemovedFromModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetRemovedFromModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIReadOnlyServiceProperty method available in IReadOnlyServiceProperty to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIReadOnlyServiceProperty to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionServiceProperty method available in IConventionServiceProperty to obtain an object with an invocable method
     */
    @Deprecated 
    public ServiceParameterBinding SetParameterBinding(ServiceParameterBinding parameterBinding, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionServiceProperty to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsInModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DebugView getDebugView() throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DebugView");
            return new DebugView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityType getDeclaringEntityType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringEntityType");
            return new EntityType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalServicePropertyBuilder getBuilder() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Builder");
            return new InternalServicePropertyBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceParameterBinding getParameterBinding() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ParameterBinding");
            return new ServiceParameterBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParameterBinding(ServiceParameterBinding ParameterBinding) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ParameterBinding", ParameterBinding == null ? null : ParameterBinding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}