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

package grpc.core;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import grpc.core.ChannelBase;
import grpc.core.ChannelCredentials;
import grpc.core.CallInvoker;
import system.threading.tasks.Task;
import grpc.core.ChannelState;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Grpc.Core.Channel, Grpc.Core, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Grpc.Core.Channel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Grpc.Core.Channel</a>
 */
public class Channel extends ChannelBase  {
    /**
     * Fully assembly qualified name: Grpc.Core, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad
     */
    public static final String assemblyFullName = "Grpc.Core, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad";
    /**
     * Assembly name: Grpc.Core
     */
    public static final String assemblyShortName = "Grpc.Core";
    /**
     * Qualified class name: Grpc.Core.Channel
     */
    public static final String className = "Grpc.Core.Channel";
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
    public Channel(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Channel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Channel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Channel cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Channel(from.getJCOInstance());
    }

    // Constructors section
    
    public Channel() throws Throwable {
    }

    public Channel(java.lang.String target, ChannelCredentials credentials) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.MulticastNotSupportedException, system.io.IOException, system.NotImplementedException, system.ObjectDisposedException, system.threading.ThreadAbortException, system.resources.MissingManifestResourceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(target, credentials == null ? null : credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Channel(java.lang.String host, int port, ChannelCredentials credentials) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.AggregateException, system.MulticastNotSupportedException, system.io.IOException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, credentials == null ? null : credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public CallInvoker CreateCallInvoker() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCallInvoker = (JCObject)classInstance.Invoke("CreateCallInvoker");
            return new CallInvoker(objCreateCallInvoker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ChannelState getState() throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new ChannelState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getResolvedTarget() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ResolvedTarget");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CancellationToken getShutdownToken() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ShutdownToken");
            return new CancellationToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}