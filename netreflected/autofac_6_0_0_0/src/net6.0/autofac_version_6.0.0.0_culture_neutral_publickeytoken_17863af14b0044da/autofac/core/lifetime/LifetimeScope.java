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

package autofac.core.lifetime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import autofac.util.Disposable;
import autofac.core.IComponentRegistry;
import autofac.core.IComponentRegistryImplementation;
import autofac.ILifetimeScope;
import autofac.ILifetimeScopeImplementation;
import system.Guid;
import autofac.ResolveRequest;
import autofac.core.IDisposer;
import autofac.core.IDisposerImplementation;
import autofac.core.ISharingLifetimeScope;
import autofac.core.ISharingLifetimeScopeImplementation;


/**
 * The base .NET class managing Autofac.Core.Lifetime.LifetimeScope, Autofac, Version=6.0.0.0, Culture=neutral, PublicKeyToken=17863af14b0044da.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Autofac.Core.Lifetime.LifetimeScope" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Autofac.Core.Lifetime.LifetimeScope</a>
 */
public class LifetimeScope extends Disposable  {
    /**
     * Fully assembly qualified name: Autofac, Version=6.0.0.0, Culture=neutral, PublicKeyToken=17863af14b0044da
     */
    public static final String assemblyFullName = "Autofac, Version=6.0.0.0, Culture=neutral, PublicKeyToken=17863af14b0044da";
    /**
     * Assembly name: Autofac
     */
    public static final String assemblyShortName = "Autofac";
    /**
     * Qualified class name: Autofac.Core.Lifetime.LifetimeScope
     */
    public static final String className = "Autofac.Core.Lifetime.LifetimeScope";
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
    public LifetimeScope(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LifetimeScope}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LifetimeScope} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LifetimeScope cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LifetimeScope(from.getJCOInstance());
    }

    // Constructors section
    
    public LifetimeScope() throws Throwable {
    }

    public LifetimeScope(IComponentRegistry componentRegistry, NetObject tag) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(componentRegistry == null ? null : componentRegistry.getJCOInstance(), tag == null ? null : tag.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LifetimeScope(IComponentRegistry componentRegistry) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(componentRegistry == null ? null : componentRegistry.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ILifetimeScope BeginLifetimeScope() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginLifetimeScope = (JCObject)classInstance.Invoke("BeginLifetimeScope");
            return new ILifetimeScopeImplementation(objBeginLifetimeScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILifetimeScope BeginLifetimeScope(NetObject tag) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginLifetimeScope = (JCObject)classInstance.Invoke("BeginLifetimeScope", tag == null ? null : tag.getJCOInstance());
            return new ILifetimeScopeImplementation(objBeginLifetimeScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetSharedInstance(Guid id, JCORefOut<NetObject> value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetSharedInstance", id == null ? null : id.getJCOInstance(), value.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetService(NetType serviceType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", serviceType == null ? null : serviceType.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ResolveComponent(ResolveRequest request) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, autofac.core.DependencyResolutionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveComponent = (JCObject)classInstance.Invoke("ResolveComponent", request == null ? null : request.getJCOInstance());
            return new NetObject(objResolveComponent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IComponentRegistry getComponentRegistry() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ComponentRegistry");
            return new IComponentRegistryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposer getDisposer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Disposer");
            return new IDisposerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISharingLifetimeScope getParentLifetimeScope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ParentLifetimeScope");
            return new ISharingLifetimeScopeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISharingLifetimeScope getRootLifetimeScope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RootLifetimeScope");
            return new ISharingLifetimeScopeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}