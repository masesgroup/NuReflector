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
import microsoft.entityframeworkcore.metadata.internal.ModelConfiguration;
import microsoft.entityframeworkcore.metadata.internal.PropertyConfiguration;
import microsoft.entityframeworkcore.metadata.ITypeMappingConfiguration;
import microsoft.entityframeworkcore.metadata.ITypeMappingConfigurationImplementation;
import microsoft.entityframeworkcore.metadata.IMutableProperty;
import microsoft.entityframeworkcore.metadata.IMutablePropertyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.ModelConfiguration, Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.ModelConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.ModelConfiguration</a>
 */
public class ModelConfiguration extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.ModelConfiguration
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.ModelConfiguration";
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
    public ModelConfiguration(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ModelConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ModelConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ModelConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ModelConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public ModelConfiguration() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean IsEmpty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsIgnored(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsIgnored", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveIgnored(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RemoveIgnored", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveProperty(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RemoveProperty", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelConfiguration Validate() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objValidate = (JCObject)classInstance.Invoke("Validate");
            return new ModelConfiguration(objValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyConfiguration FindProperty(NetType type) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindProperty = (JCObject)classInstance.Invoke("FindProperty", type == null ? null : type.getJCOInstance());
            return new PropertyConfiguration(objFindProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyConfiguration FindTypeMapping(NetType type) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTypeMapping = (JCObject)classInstance.Invoke("FindTypeMapping", type == null ? null : type.getJCOInstance());
            return new PropertyConfiguration(objFindTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyConfiguration GetOrAddProperty(NetType type) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOrAddProperty = (JCObject)classInstance.Invoke("GetOrAddProperty", type == null ? null : type.getJCOInstance());
            return new PropertyConfiguration(objGetOrAddProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyConfiguration GetOrAddTypeMapping(NetType type) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOrAddTypeMapping = (JCObject)classInstance.Invoke("GetOrAddTypeMapping", type == null ? null : type.getJCOInstance());
            return new PropertyConfiguration(objGetOrAddTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITypeMappingConfiguration FindTypeMappingConfiguration(NetType scalarType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTypeMappingConfiguration = (JCObject)classInstance.Invoke("FindTypeMappingConfiguration", scalarType == null ? null : scalarType.getJCOInstance());
            return new ITypeMappingConfigurationImplementation(objFindTypeMappingConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddIgnored(NetType type) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddIgnored", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConfigureProperty(IMutableProperty property) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConfigureProperty", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}