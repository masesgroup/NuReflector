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
import grpc.core.ChannelCredentials;
import grpc.core.CallCredentials;
import grpc.core.KeyCertificatePair;
import grpc.core.VerifyPeerCallback;


/**
 * The base .NET class managing Grpc.Core.ChannelCredentialsConfiguratorBase, Grpc.Core.Api, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Grpc.Core.ChannelCredentialsConfiguratorBase" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Grpc.Core.ChannelCredentialsConfiguratorBase</a>
 */
public class ChannelCredentialsConfiguratorBase extends NetObject  {
    /**
     * Fully assembly qualified name: Grpc.Core.Api, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad
     */
    public static final String assemblyFullName = "Grpc.Core.Api, Version=2.0.0.0, Culture=neutral, PublicKeyToken=d754f35622e28bad";
    /**
     * Assembly name: Grpc.Core.Api
     */
    public static final String assemblyShortName = "Grpc.Core.Api";
    /**
     * Qualified class name: Grpc.Core.ChannelCredentialsConfiguratorBase
     */
    public static final String className = "Grpc.Core.ChannelCredentialsConfiguratorBase";
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
    public ChannelCredentialsConfiguratorBase(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ChannelCredentialsConfiguratorBase}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ChannelCredentialsConfiguratorBase} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ChannelCredentialsConfiguratorBase cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ChannelCredentialsConfiguratorBase(from.getJCOInstance());
    }

    // Constructors section
    
    public ChannelCredentialsConfiguratorBase() throws Throwable {
    }

    
    // Methods section
    
    public void SetCompositeCredentials(NetObject state, ChannelCredentials channelCredentials, CallCredentials callCredentials) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCompositeCredentials", state == null ? null : state.getJCOInstance(), channelCredentials == null ? null : channelCredentials.getJCOInstance(), callCredentials == null ? null : callCredentials.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInsecureCredentials(NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetInsecureCredentials", state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSslCredentials(NetObject state, java.lang.String rootCertificates, KeyCertificatePair keyCertificatePair, VerifyPeerCallback verifyPeerCallback) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSslCredentials", state == null ? null : state.getJCOInstance(), rootCertificates, keyCertificatePair == null ? null : keyCertificatePair.getJCOInstance(), verifyPeerCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}