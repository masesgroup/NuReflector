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

package microsoft.aspnetcore.signalr;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.aspnetcore.connections.ConnectionContext;
import system.TimeSpan;
import microsoft.extensions.logging.ILoggerFactory;
import microsoft.extensions.logging.ILoggerFactoryImplementation;
import system.threading.tasks.ValueTask;
import microsoft.aspnetcore.signalr.protocol.HubMessage;
import system.threading.CancellationToken;
import microsoft.aspnetcore.signalr.SerializedHubMessage;
import microsoft.aspnetcore.http.features.IFeatureCollection;
import microsoft.aspnetcore.http.features.IFeatureCollectionImplementation;
import microsoft.aspnetcore.signalr.protocol.IHubProtocol;
import microsoft.aspnetcore.signalr.protocol.IHubProtocolImplementation;
import system.security.claims.ClaimsPrincipal;


/**
 * The base .NET class managing Microsoft.AspNetCore.SignalR.HubConnectionContext, Microsoft.AspNetCore.SignalR.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.SignalR.HubConnectionContext" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.SignalR.HubConnectionContext</a>
 */
public class HubConnectionContext extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.SignalR.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.SignalR.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.SignalR.Core
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.SignalR.Core";
    /**
     * Qualified class name: Microsoft.AspNetCore.SignalR.HubConnectionContext
     */
    public static final String className = "Microsoft.AspNetCore.SignalR.HubConnectionContext";
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
    public HubConnectionContext(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HubConnectionContext}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HubConnectionContext} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HubConnectionContext cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HubConnectionContext(from.getJCOInstance());
    }

    // Constructors section
    
    public HubConnectionContext() throws Throwable {
    }

    public HubConnectionContext(ConnectionContext connectionContext, TimeSpan keepAliveInterval, ILoggerFactory loggerFactory) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.tasks.TaskSchedulerException, system.ArgumentNullException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionContext == null ? null : connectionContext.getJCOInstance(), keepAliveInterval == null ? null : keepAliveInterval.getJCOInstance(), loggerFactory == null ? null : loggerFactory.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ValueTask WriteAsync(HubMessage message, CancellationToken cancellationToken) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NullReferenceException, system.diagnostics.tracing.EventSourceException, system.threading.AbandonedMutexException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteAsync = (JCObject)classInstance.Invoke("WriteAsync", message == null ? null : message.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new ValueTask(objWriteAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask WriteAsync(SerializedHubMessage message, CancellationToken cancellationToken) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NullReferenceException, system.diagnostics.tracing.EventSourceException, system.threading.AbandonedMutexException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.globalization.CultureNotFoundException, system.threading.SemaphoreFullException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteAsync = (JCObject)classInstance.Invoke("WriteAsync", message == null ? null : message.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new ValueTask(objWriteAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IFeatureCollection getFeatures() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Features");
            return new IFeatureCollectionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IHubProtocol getProtocol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Protocol");
            return new IHubProtocolImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProtocol(IHubProtocol Protocol) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Protocol", Protocol == null ? null : Protocol.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClaimsPrincipal getUser() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("User");
            return new ClaimsPrincipal(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConnectionId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ConnectionId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserIdentifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("UserIdentifier");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserIdentifier(java.lang.String UserIdentifier) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UserIdentifier", UserIdentifier);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CancellationToken getConnectionAborted() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectionAborted");
            return new CancellationToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}