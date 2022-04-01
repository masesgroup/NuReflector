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

package microsoft.extensions.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.extensions.hosting.IHostBuilder;
import microsoft.extensions.hosting.IHostBuilderImplementation;
import system.threading.tasks.Task;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Microsoft.Extensions.Hosting.HostingHostBuilderExtensions, Microsoft.Extensions.Hosting, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Hosting.HostingHostBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Hosting.HostingHostBuilderExtensions</a>
 */
public class HostingHostBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.Hosting, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.Hosting, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.Hosting
     */
    public static final String assemblyShortName = "Microsoft.Extensions.Hosting";
    /**
     * Qualified class name: Microsoft.Extensions.Hosting.HostingHostBuilderExtensions
     */
    public static final String className = "Microsoft.Extensions.Hosting.HostingHostBuilderExtensions";
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
    public HostingHostBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HostingHostBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HostingHostBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HostingHostBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HostingHostBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public HostingHostBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static IHostBuilder UseConsoleLifetime(IHostBuilder hostBuilder) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseConsoleLifetime = (JCObject)classType.Invoke("UseConsoleLifetime", hostBuilder == null ? null : hostBuilder.getJCOInstance());
            return new IHostBuilderImplementation(objUseConsoleLifetime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IHostBuilder UseContentRoot(IHostBuilder hostBuilder, java.lang.String contentRoot) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseContentRoot = (JCObject)classType.Invoke("UseContentRoot", hostBuilder == null ? null : hostBuilder.getJCOInstance(), contentRoot);
            return new IHostBuilderImplementation(objUseContentRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IHostBuilder UseEnvironment(IHostBuilder hostBuilder, java.lang.String environment) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseEnvironment = (JCObject)classType.Invoke("UseEnvironment", hostBuilder == null ? null : hostBuilder.getJCOInstance(), environment);
            return new IHostBuilderImplementation(objUseEnvironment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task RunConsoleAsync(IHostBuilder hostBuilder, CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRunConsoleAsync = (JCObject)classType.Invoke("RunConsoleAsync", hostBuilder == null ? null : hostBuilder.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRunConsoleAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}