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

package castle.dynamicproxy.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.serialization.StreamingContext;
import system.runtime.serialization.SerializationInfo;
import castle.dynamicproxy.ModuleScope;


/**
 * The base .NET class managing Castle.DynamicProxy.Serialization.ProxyObjectReference, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Serialization.ProxyObjectReference" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Serialization.ProxyObjectReference</a>
 */
public class ProxyObjectReference extends NetObject  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.DynamicProxy.Serialization.ProxyObjectReference
     */
    public static final String className = "Castle.DynamicProxy.Serialization.ProxyObjectReference";
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
    public ProxyObjectReference(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProxyObjectReference}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProxyObjectReference} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProxyObjectReference cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProxyObjectReference(from.getJCOInstance());
    }

    // Constructors section
    
    public ProxyObjectReference() throws Throwable {
    }



    
    // Methods section
    
    public NetObject GetRealObject(StreamingContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRealObject = (JCObject)classInstance.Invoke("GetRealObject", context == null ? null : context.getJCOInstance());
            return new NetObject(objGetRealObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject RecreateClassProxy() throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.NotSupportedException, castle.dynamicproxy.InvalidMixinConfigurationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, castle.dynamicproxy.ProxyGenerationException, system.runtime.serialization.SerializationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRecreateClassProxy = (JCObject)classInstance.Invoke("RecreateClassProxy");
            return new NetObject(objRecreateClassProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject RecreateInterfaceProxy(java.lang.String generatorType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.IndexOutOfRangeException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.NotSupportedException, castle.dynamicproxy.InvalidMixinConfigurationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, castle.dynamicproxy.ProxyGenerationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRecreateInterfaceProxy = (JCObject)classInstance.Invoke("RecreateInterfaceProxy", generatorType);
            return new NetObject(objRecreateInterfaceProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetObjectData", info == null ? null : info.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDeserialization(NetObject sender) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.serialization.SerializationException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.reflection.TargetException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnDeserialization", sender == null ? null : sender.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ResetScope() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ResetScope");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetScope(ModuleScope scope) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetScope", scope == null ? null : scope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static ModuleScope getModuleScope() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ModuleScope");
            return new ModuleScope(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}