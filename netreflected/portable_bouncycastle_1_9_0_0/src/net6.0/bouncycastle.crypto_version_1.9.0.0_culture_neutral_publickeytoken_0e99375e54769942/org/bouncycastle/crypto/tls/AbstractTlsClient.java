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

package org.bouncycastle.crypto.tls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.crypto.tls.AbstractTlsPeer;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsAuthenticationImplementation;
import org.bouncycastle.crypto.tls.TlsCipher;
import org.bouncycastle.crypto.tls.TlsCipherImplementation;
import org.bouncycastle.crypto.tls.TlsCompression;
import org.bouncycastle.crypto.tls.TlsCompressionImplementation;
import org.bouncycastle.crypto.tls.TlsKeyExchange;
import org.bouncycastle.crypto.tls.TlsKeyExchangeImplementation;
import org.bouncycastle.crypto.tls.TlsSession;
import org.bouncycastle.crypto.tls.TlsSessionImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.collections.IList;
import system.collections.IListImplementation;
import org.bouncycastle.crypto.tls.TlsClientContext;
import org.bouncycastle.crypto.tls.TlsClientContextImplementation;
import org.bouncycastle.crypto.tls.NewSessionTicket;
import org.bouncycastle.crypto.tls.ProtocolVersion;


/**
 * The base .NET class managing Org.BouncyCastle.Crypto.Tls.AbstractTlsClient, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Tls.AbstractTlsClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Tls.AbstractTlsClient</a>
 */
public class AbstractTlsClient extends AbstractTlsPeer  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crypto.Tls.AbstractTlsClient
     */
    public static final String className = "Org.BouncyCastle.Crypto.Tls.AbstractTlsClient";
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
    public AbstractTlsClient(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AbstractTlsClient}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AbstractTlsClient} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AbstractTlsClient cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AbstractTlsClient(from.getJCOInstance());
    }

    // Constructors section
    
    public AbstractTlsClient() throws Throwable {
    }

    
    // Methods section
    
    public byte[] GetCompressionMethods() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCompressionMethods");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetCompressionMethods = 0; indexGetCompressionMethods < resultingArrayList.size(); indexGetCompressionMethods++ ) {
				resultingArray[indexGetCompressionMethods] = (byte)resultingArrayList.get(indexGetCompressionMethods);
            }
            return resultingArray;
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

    public TlsAuthentication GetAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAuthentication = (JCObject)classInstance.Invoke("GetAuthentication");
            return new TlsAuthenticationImplementation(objGetAuthentication);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsCipher GetCipher() throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCipher = (JCObject)classInstance.Invoke("GetCipher");
            return new TlsCipherImplementation(objGetCipher);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsCompression GetCompression() throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCompression = (JCObject)classInstance.Invoke("GetCompression");
            return new TlsCompressionImplementation(objGetCompression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsKeyExchange GetKeyExchange() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKeyExchange = (JCObject)classInstance.Invoke("GetKeyExchange");
            return new TlsKeyExchangeImplementation(objGetKeyExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsSession GetSessionToResume() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSessionToResume = (JCObject)classInstance.Invoke("GetSessionToResume");
            return new TlsSessionImplementation(objGetSessionToResume);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDictionary GetClientExtensions() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, org.bouncycastle.crypto.tls.TlsFatalAlert, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetClientExtensions = (JCObject)classInstance.Invoke("GetClientExtensions");
            return new IDictionaryImplementation(objGetClientExtensions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList GetClientSupplementalData() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetClientSupplementalData = (JCObject)classInstance.Invoke("GetClientSupplementalData");
            return new IListImplementation(objGetClientSupplementalData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Init(TlsClientContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Init", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyNewSessionTicket(NewSessionTicket newSessionTicket) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyNewSessionTicket", newSessionTicket == null ? null : newSessionTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifySelectedCipherSuite(int selectedCipherSuite) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifySelectedCipherSuite", selectedCipherSuite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifySelectedCompressionMethod(byte selectedCompressionMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifySelectedCompressionMethod", selectedCompressionMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyServerVersion(ProtocolVersion serverVersion) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyServerVersion", serverVersion == null ? null : serverVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifySessionID(byte[] sessionID) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifySessionID", (java.lang.Object)sessionID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifySessionID(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifySessionID", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ProcessServerExtensions(IDictionary serverExtensions) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.EndOfStreamException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ProcessServerExtensions", serverExtensions == null ? null : serverExtensions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ProcessServerSupplementalData(IList serverSupplementalData) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ProcessServerSupplementalData", serverSupplementalData == null ? null : serverSupplementalData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsFallback() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtocolVersion getClientHelloRecordLayerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientHelloRecordLayerVersion");
            return new ProtocolVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtocolVersion getClientVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientVersion");
            return new ProtocolVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtocolVersion getMinimumVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinimumVersion");
            return new ProtocolVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}