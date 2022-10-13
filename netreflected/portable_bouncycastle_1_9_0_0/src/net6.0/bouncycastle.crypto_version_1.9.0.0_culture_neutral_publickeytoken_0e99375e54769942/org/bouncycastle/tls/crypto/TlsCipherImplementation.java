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

package org.bouncycastle.tls.crypto;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.crypto.TlsEncodeResult;


/**
 * The base .NET class managing Org.BouncyCastle.Tls.Crypto.TlsCipher, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.Crypto.TlsCipher" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.Crypto.TlsCipher</a>
 */
public class TlsCipherImplementation extends NetObject implements TlsCipher {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Tls.Crypto.TlsCipher
     */
    public static final String className = "Org.BouncyCastle.Tls.Crypto.TlsCipher";
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
    public TlsCipherImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TlsCipher}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TlsCipher} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TlsCipher ToTlsCipher(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TlsCipherImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public int GetCiphertextDecodeLimit(int plaintextLimit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetCiphertextDecodeLimit", plaintextLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetCiphertextEncodeLimit(int plaintextLength, int plaintextLimit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetCiphertextEncodeLimit", plaintextLength, plaintextLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPlaintextLimit(int ciphertextLimit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetPlaintextLimit", ciphertextLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsDecodeResult DecodeCiphertext(long seqNo, short recordType, ProtocolVersion recordVersion, byte[] ciphertext, int offset, int len) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDecodeCiphertext = (JCObject)classInstance.Invoke("DecodeCiphertext", seqNo, recordType, recordVersion == null ? null : recordVersion.getJCOInstance(), ciphertext, offset, len);
            return new TlsDecodeResult(objDecodeCiphertext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsDecodeResult DecodeCiphertext(long dupParam0, short dupParam1, ProtocolVersion dupParam2, JCORefOut dupParam3, int dupParam4, int dupParam5) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDecodeCiphertext = (JCObject)classInstance.Invoke("DecodeCiphertext", dupParam0, dupParam1, dupParam2 == null ? null : dupParam2.getJCOInstance(), dupParam3.getJCRefOut(), dupParam4, dupParam5);
            return new TlsDecodeResult(objDecodeCiphertext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsEncodeResult EncodePlaintext(long seqNo, short contentType, ProtocolVersion recordVersion, int headerAllocation, byte[] plaintext, int offset, int len) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEncodePlaintext = (JCObject)classInstance.Invoke("EncodePlaintext", seqNo, contentType, recordVersion == null ? null : recordVersion.getJCOInstance(), headerAllocation, plaintext, offset, len);
            return new TlsEncodeResult(objEncodePlaintext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TlsEncodeResult EncodePlaintext(long dupParam0, short dupParam1, ProtocolVersion dupParam2, int dupParam3, JCORefOut dupParam4, int dupParam5, int dupParam6) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEncodePlaintext = (JCObject)classInstance.Invoke("EncodePlaintext", dupParam0, dupParam1, dupParam2 == null ? null : dupParam2.getJCOInstance(), dupParam3, dupParam4.getJCRefOut(), dupParam5, dupParam6);
            return new TlsEncodeResult(objEncodePlaintext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RekeyDecoder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RekeyDecoder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RekeyEncoder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RekeyEncoder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getUsesOpaqueRecordType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UsesOpaqueRecordType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}