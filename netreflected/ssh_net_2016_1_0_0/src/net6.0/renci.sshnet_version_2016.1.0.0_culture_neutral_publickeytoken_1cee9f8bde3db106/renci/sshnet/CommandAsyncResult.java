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

package renci.sshnet;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.WaitHandle;


/**
 * The base .NET class managing Renci.SshNet.CommandAsyncResult, Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.CommandAsyncResult" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.CommandAsyncResult</a>
 */
public class CommandAsyncResult extends NetObject  {
    /**
     * Fully assembly qualified name: Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106
     */
    public static final String assemblyFullName = "Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106";
    /**
     * Assembly name: Renci.SshNet
     */
    public static final String assemblyShortName = "Renci.SshNet";
    /**
     * Qualified class name: Renci.SshNet.CommandAsyncResult
     */
    public static final String className = "Renci.SshNet.CommandAsyncResult";
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
    public CommandAsyncResult(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CommandAsyncResult}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CommandAsyncResult} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CommandAsyncResult cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CommandAsyncResult(from.getJCOInstance());
    }

    // Constructors section
    
    public CommandAsyncResult() throws Throwable {
    }



    
    // Methods section
    

    
    // Properties section
    
    public boolean getCompletedSynchronously() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CompletedSynchronously");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompletedSynchronously(boolean CompletedSynchronously) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CompletedSynchronously", CompletedSynchronously);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompleted() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompleted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsCompleted(boolean IsCompleted) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsCompleted", IsCompleted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBytesReceived() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BytesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBytesReceived(int BytesReceived) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BytesReceived", BytesReceived);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBytesSent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BytesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBytesSent(int BytesSent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BytesSent", BytesSent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getAsyncState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AsyncState");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAsyncState(NetObject AsyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AsyncState", AsyncState == null ? null : AsyncState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WaitHandle getAsyncWaitHandle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AsyncWaitHandle");
            return new WaitHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAsyncWaitHandle(WaitHandle AsyncWaitHandle) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AsyncWaitHandle", AsyncWaitHandle == null ? null : AsyncWaitHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}