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

package microsoft.aspnetcore.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.aspnetcore.hosting.IWebHost;
import microsoft.aspnetcore.hosting.IWebHostImplementation;
import microsoft.aspnetcore.hosting.IWebHostBuilder;
import microsoft.aspnetcore.hosting.IWebHostBuilderImplementation;
import microsoft.extensions.configuration.IConfiguration;
import microsoft.extensions.configuration.IConfigurationImplementation;
import microsoft.aspnetcore.hosting.server.IServer;
import microsoft.aspnetcore.hosting.server.IServerImplementation;
import system.TimeSpan;


/**
 * The base .NET class managing Microsoft.AspNetCore.Hosting.HostingAbstractionsWebHostBuilderExtensions, Microsoft.AspNetCore.Hosting.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Hosting.HostingAbstractionsWebHostBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Hosting.HostingAbstractionsWebHostBuilderExtensions</a>
 */
public class HostingAbstractionsWebHostBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.Hosting.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.Hosting.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.Hosting.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.Hosting.Abstractions";
    /**
     * Qualified class name: Microsoft.AspNetCore.Hosting.HostingAbstractionsWebHostBuilderExtensions
     */
    public static final String className = "Microsoft.AspNetCore.Hosting.HostingAbstractionsWebHostBuilderExtensions";
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
    public HostingAbstractionsWebHostBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HostingAbstractionsWebHostBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HostingAbstractionsWebHostBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HostingAbstractionsWebHostBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HostingAbstractionsWebHostBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public HostingAbstractionsWebHostBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static IWebHost Start(IWebHostBuilder hostBuilder, java.lang.String... urls) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objStart = (JCObject)classType.Invoke("Start", hostBuilder == null ? null : hostBuilder.getJCOInstance(), urls);
            return new IWebHostImplementation(objStart);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHost Start(IWebHostBuilder dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objStart = (JCObject)classType.Invoke("Start", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new IWebHostImplementation(objStart);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder CaptureStartupErrors(IWebHostBuilder hostBuilder, boolean captureStartupErrors) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCaptureStartupErrors = (JCObject)classType.Invoke("CaptureStartupErrors", hostBuilder == null ? null : hostBuilder.getJCOInstance(), captureStartupErrors);
            return new IWebHostBuilderImplementation(objCaptureStartupErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder PreferHostingUrls(IWebHostBuilder hostBuilder, boolean preferHostingUrls) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPreferHostingUrls = (JCObject)classType.Invoke("PreferHostingUrls", hostBuilder == null ? null : hostBuilder.getJCOInstance(), preferHostingUrls);
            return new IWebHostBuilderImplementation(objPreferHostingUrls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder SuppressStatusMessages(IWebHostBuilder hostBuilder, boolean suppressStatusMessages) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSuppressStatusMessages = (JCObject)classType.Invoke("SuppressStatusMessages", hostBuilder == null ? null : hostBuilder.getJCOInstance(), suppressStatusMessages);
            return new IWebHostBuilderImplementation(objSuppressStatusMessages);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseConfiguration(IWebHostBuilder hostBuilder, IConfiguration configuration) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseConfiguration = (JCObject)classType.Invoke("UseConfiguration", hostBuilder == null ? null : hostBuilder.getJCOInstance(), configuration == null ? null : configuration.getJCOInstance());
            return new IWebHostBuilderImplementation(objUseConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseContentRoot(IWebHostBuilder hostBuilder, java.lang.String contentRoot) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseContentRoot = (JCObject)classType.Invoke("UseContentRoot", hostBuilder == null ? null : hostBuilder.getJCOInstance(), contentRoot);
            return new IWebHostBuilderImplementation(objUseContentRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseEnvironment(IWebHostBuilder hostBuilder, java.lang.String environment) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseEnvironment = (JCObject)classType.Invoke("UseEnvironment", hostBuilder == null ? null : hostBuilder.getJCOInstance(), environment);
            return new IWebHostBuilderImplementation(objUseEnvironment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseServer(IWebHostBuilder hostBuilder, IServer server) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseServer = (JCObject)classType.Invoke("UseServer", hostBuilder == null ? null : hostBuilder.getJCOInstance(), server == null ? null : server.getJCOInstance());
            return new IWebHostBuilderImplementation(objUseServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseShutdownTimeout(IWebHostBuilder hostBuilder, TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseShutdownTimeout = (JCObject)classType.Invoke("UseShutdownTimeout", hostBuilder == null ? null : hostBuilder.getJCOInstance(), timeout == null ? null : timeout.getJCOInstance());
            return new IWebHostBuilderImplementation(objUseShutdownTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseStartup(IWebHostBuilder hostBuilder, java.lang.String startupAssemblyName) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseStartup = (JCObject)classType.Invoke("UseStartup", hostBuilder == null ? null : hostBuilder.getJCOInstance(), startupAssemblyName);
            return new IWebHostBuilderImplementation(objUseStartup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseUrls(IWebHostBuilder hostBuilder, java.lang.String... urls) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseUrls = (JCObject)classType.Invoke("UseUrls", hostBuilder == null ? null : hostBuilder.getJCOInstance(), urls);
            return new IWebHostBuilderImplementation(objUseUrls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseUrls(IWebHostBuilder dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseUrls = (JCObject)classType.Invoke("UseUrls", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new IWebHostBuilderImplementation(objUseUrls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebHostBuilder UseWebRoot(IWebHostBuilder hostBuilder, java.lang.String webRoot) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseWebRoot = (JCObject)classType.Invoke("UseWebRoot", hostBuilder == null ? null : hostBuilder.getJCOInstance(), webRoot);
            return new IWebHostBuilderImplementation(objUseWebRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}