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

package org.bouncycastle.tls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsHeartbeat;
import org.bouncycastle.tls.TlsHeartbeatImplementation;
import org.bouncycastle.tls.TlsKeyExchangeFactory;
import org.bouncycastle.tls.TlsKeyExchangeFactoryImplementation;
import org.bouncycastle.tls.TlsCloseable;
import org.bouncycastle.tls.TlsCloseableImplementation;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Tls.AbstractTlsPeer, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.AbstractTlsPeer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.AbstractTlsPeer</a>
 */
public class AbstractTlsPeer extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Tls.AbstractTlsPeer
     */
    public static final String className = "Org.BouncyCastle.Tls.AbstractTlsPeer";
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
    public AbstractTlsPeer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AbstractTlsPeer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AbstractTlsPeer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AbstractTlsPeer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AbstractTlsPeer(from.getJCOInstance());
    }

    // Constructors section
    
    public AbstractTlsPeer() throws Throwable {
    }

    
    // Methods section
    
    public boolean AllowLegacyResumption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("AllowLegacyResumption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RequiresCloseNotify() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RequiresCloseNotify");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RequiresExtendedMasterSecret() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RequiresExtendedMasterSecret");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldCheckSigAlgOfPeerCerts() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldCheckSigAlgOfPeerCerts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldUseExtendedMasterSecret() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldUseExtendedMasterSecret");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldUseExtendedPadding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldUseExtendedPadding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldUseGmtUnixTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldUseGmtUnixTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetHeartbeatPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("GetHeartbeatPolicy");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short[] GetPskKeyExchangeModes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPskKeyExchangeModes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            short[] resultingArray = new short[resultingArrayList.size()];
            for(int indexGetPskKeyExchangeModes = 0; indexGetPskKeyExchangeModes < resultingArrayList.size(); indexGetPskKeyExchangeModes++ ) {
				resultingArray[indexGetPskKeyExchangeModes] = (short)resultingArrayList.get(indexGetPskKeyExchangeModes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetHandshakeTimeoutMillis() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetHandshakeTimeoutMillis");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMaxCertificateChainLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetMaxCertificateChainLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMaxHandshakeMessageSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetMaxHandshakeMessageSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] GetCipherSuites() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCipherSuites");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
            for(int indexGetCipherSuites = 0; indexGetCipherSuites < resultingArrayList.size(); indexGetCipherSuites++ ) {
				resultingArray[indexGetCipherSuites] = (int)resultingArrayList.get(indexGetCipherSuites);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtocolVersion[] GetProtocolVersions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ProtocolVersion> resultingArrayList = new ArrayList<ProtocolVersion>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetProtocolVersions");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ProtocolVersion(resultingObject));
            }
            ProtocolVersion[] resultingArray = new ProtocolVersion[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsHeartbeat GetHeartbeat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetHeartbeat = (JCObject)classInstance.Invoke("GetHeartbeat");
            return new TlsHeartbeatImplementation(objGetHeartbeat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsKeyExchangeFactory GetKeyExchangeFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKeyExchangeFactory = (JCObject)classInstance.Invoke("GetKeyExchangeFactory");
            return new TlsKeyExchangeFactoryImplementation(objGetKeyExchangeFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyAlertRaised(short alertLevel, short alertDescription, java.lang.String message, NetException cause) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyAlertRaised", alertLevel, alertDescription, message, cause == null ? null : cause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyAlertReceived(short alertLevel, short alertDescription) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyAlertReceived", alertLevel, alertDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyCloseHandle(TlsCloseable closeHandle) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyCloseHandle", closeHandle == null ? null : closeHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyHandshakeBeginning() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyHandshakeBeginning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyHandshakeComplete() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyHandshakeComplete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifySecureRenegotiation(boolean secureRenegotiation) throws Throwable, system.IndexOutOfRangeException, org.bouncycastle.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifySecureRenegotiation", secureRenegotiation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public TlsCrypto getCrypto() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Crypto");
            return new TlsCryptoImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}