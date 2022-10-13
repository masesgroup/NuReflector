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

package org.bouncycastle.crypto.signers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.crypto.IAsymmetricBlockCipher;
import org.bouncycastle.crypto.IAsymmetricBlockCipherImplementation;
import org.bouncycastle.crypto.IDigest;
import org.bouncycastle.crypto.IDigestImplementation;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.DerObjectIdentifier;
import org.bouncycastle.crypto.IRsa;
import org.bouncycastle.crypto.IRsaImplementation;
import org.bouncycastle.crypto.ICipherParameters;
import org.bouncycastle.crypto.ICipherParametersImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Crypto.Signers.RsaDigestSigner, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Signers.RsaDigestSigner" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Signers.RsaDigestSigner</a>
 */
public class RsaDigestSigner extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crypto.Signers.RsaDigestSigner
     */
    public static final String className = "Org.BouncyCastle.Crypto.Signers.RsaDigestSigner";
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
    public RsaDigestSigner(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RsaDigestSigner}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RsaDigestSigner} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RsaDigestSigner cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RsaDigestSigner(from.getJCOInstance());
    }

    // Constructors section
    
    public RsaDigestSigner() throws Throwable {
    }

    public RsaDigestSigner(IAsymmetricBlockCipher rsaEngine, IDigest digest, AlgorithmIdentifier algId) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rsaEngine == null ? null : rsaEngine.getJCOInstance(), digest == null ? null : digest.getJCOInstance(), algId == null ? null : algId.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RsaDigestSigner(IDigest digest, DerObjectIdentifier digestOid) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(digest == null ? null : digest.getJCOInstance(), digestOid == null ? null : digestOid.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RsaDigestSigner(IDigest digest, AlgorithmIdentifier algId) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(digest == null ? null : digest.getJCOInstance(), algId == null ? null : algId.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RsaDigestSigner(IDigest digest) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(digest == null ? null : digest.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RsaDigestSigner(IRsa rsa, IDigest digest, DerObjectIdentifier digestOid) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rsa == null ? null : rsa.getJCOInstance(), digest == null ? null : digest.getJCOInstance(), digestOid == null ? null : digestOid.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RsaDigestSigner(IRsa rsa, IDigest digest, AlgorithmIdentifier algId) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rsa == null ? null : rsa.getJCOInstance(), digest == null ? null : digest.getJCOInstance(), algId == null ? null : algId.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean VerifySignature(byte[] signature) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("VerifySignature", (java.lang.Object)signature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifySignature(JCORefOut dupParam0) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("VerifySignature", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GenerateSignature() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GenerateSignature");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGenerateSignature = 0; indexGenerateSignature < resultingArrayList.size(); indexGenerateSignature++ ) {
				resultingArray[indexGenerateSignature] = (byte)resultingArrayList.get(indexGenerateSignature);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BlockUpdate(byte[] input, int inOff, int length) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BlockUpdate", input, inOff, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BlockUpdate(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BlockUpdate", dupParam0.getJCRefOut(), dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Init(boolean forSigning, ICipherParameters parameters) throws Throwable, org.bouncycastle.security.InvalidKeyException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Init", forSigning, parameters == null ? null : parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Update(byte input) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Update", input);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getAlgorithmName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AlgorithmName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}