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

package castle.dynamicproxy.generators.emitters;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import castle.dynamicproxy.generators.emitters.AbstractTypeEmitter;
import system.reflection.EventAttributes;
import castle.dynamicproxy.generators.emitters.MethodEmitter;
import system.reflection.MethodAttributes;
import system.reflection.MethodInfo;
import system.reflection.MemberInfo;


/**
 * The base .NET class managing Castle.DynamicProxy.Generators.Emitters.EventEmitter, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.Emitters.EventEmitter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.Emitters.EventEmitter</a>
 */
public class EventEmitter extends NetObject  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.DynamicProxy.Generators.Emitters.EventEmitter
     */
    public static final String className = "Castle.DynamicProxy.Generators.Emitters.EventEmitter";
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
    public EventEmitter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventEmitter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventEmitter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventEmitter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventEmitter(from.getJCOInstance());
    }

    // Constructors section
    
    public EventEmitter() throws Throwable {
    }

    public EventEmitter(AbstractTypeEmitter typeEmitter, java.lang.String name, EventAttributes attributes, NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(typeEmitter == null ? null : typeEmitter.getJCOInstance(), name, attributes == null ? null : attributes.getJCOInstance(), type == null ? null : type.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public MethodEmitter CreateAddMethod(java.lang.String addMethodName, MethodAttributes attributes, MethodInfo methodToOverride) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateAddMethod = (JCObject)classInstance.Invoke("CreateAddMethod", addMethodName, attributes == null ? null : attributes.getJCOInstance(), methodToOverride == null ? null : methodToOverride.getJCOInstance());
            return new MethodEmitter(objCreateAddMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodEmitter CreateRemoveMethod(java.lang.String removeMethodName, MethodAttributes attributes, MethodInfo methodToOverride) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateRemoveMethod = (JCObject)classInstance.Invoke("CreateRemoveMethod", removeMethodName, attributes == null ? null : attributes.getJCOInstance(), methodToOverride == null ? null : methodToOverride.getJCOInstance());
            return new MethodEmitter(objCreateRemoveMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureValidCodeBlock() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnsureValidCodeBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Generate() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Generate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public MemberInfo getMember() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Member");
            return new MemberInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getReturnType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReturnType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}