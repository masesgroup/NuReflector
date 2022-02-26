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

package org.bouncycastle.bcpg.openpgp;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.bcpg.PublicKeyAlgorithmTag;
import org.bouncycastle.crypto.AsymmetricKeyParameter;
import system.DateTime;
import org.bouncycastle.bcpg.PublicKeyPacket;
import org.bouncycastle.bcpg.openpgp.PgpPublicKey;
import org.bouncycastle.bcpg.openpgp.PgpSignature;
import org.bouncycastle.bcpg.openpgp.PgpUserAttributeSubpacketVector;
import system.io.Stream;


/**
 * The base .NET class managing Org.BouncyCastle.Bcpg.OpenPgp.PgpPublicKey, BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.OpenPgp.PgpPublicKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.OpenPgp.PgpPublicKey</a>
 */
public class PgpPublicKey extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Bcpg.OpenPgp.PgpPublicKey
     */
    public static final String className = "Org.BouncyCastle.Bcpg.OpenPgp.PgpPublicKey";
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
    public PgpPublicKey(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PgpPublicKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PgpPublicKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PgpPublicKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PgpPublicKey(from.getJCOInstance());
    }

    // Constructors section
    
    public PgpPublicKey() throws Throwable {
    }

    public PgpPublicKey(PublicKeyAlgorithmTag algorithm, AsymmetricKeyParameter pubKey, DateTime time) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, org.bouncycastle.bcpg.openpgp.PgpException, system.InvalidCastException, org.bouncycastle.security.SecurityUtilityException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(algorithm == null ? null : algorithm.getJCOInstance(), pubKey == null ? null : pubKey.getJCOInstance(), time == null ? null : time.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpPublicKey(PublicKeyPacket publicPk) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.bcpg.openpgp.PgpException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(publicPk == null ? null : publicPk.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsRevoked() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsRevoked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] CalculateFingerprint(PublicKeyPacket publicPk) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.bcpg.openpgp.PgpException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CalculateFingerprint", publicPk == null ? null : publicPk.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCalculateFingerprint = 0; indexCalculateFingerprint < resultingArrayList.size(); indexCalculateFingerprint++ ) {
				resultingArray[indexCalculateFingerprint] = (byte)resultingArrayList.get(indexCalculateFingerprint);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetEncoded() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetEncoded");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetEncoded = 0; indexGetEncoded < resultingArrayList.size(); indexGetEncoded++ ) {
				resultingArray[indexGetEncoded] = (byte)resultingArrayList.get(indexGetEncoded);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetFingerprint() throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFingerprint");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetFingerprint = 0; indexGetFingerprint < resultingArrayList.size(); indexGetFingerprint++ ) {
				resultingArray[indexGetFingerprint] = (byte)resultingArrayList.get(indexGetFingerprint);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetTrustData() throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetTrustData");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetTrustData = 0; indexGetTrustData < resultingArrayList.size(); indexGetTrustData++ ) {
				resultingArray[indexGetTrustData] = (byte)resultingArrayList.get(indexGetTrustData);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetValidSeconds() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetValidSeconds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey AddCertification(PgpPublicKey key, PgpSignature certification) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddCertification = (JCObject)classType.Invoke("AddCertification", key == null ? null : key.getJCOInstance(), certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objAddCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey AddCertification(PgpPublicKey key, PgpUserAttributeSubpacketVector userAttributes, PgpSignature certification) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddCertification = (JCObject)classType.Invoke("AddCertification", key == null ? null : key.getJCOInstance(), userAttributes == null ? null : userAttributes.getJCOInstance(), certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objAddCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey AddCertification(PgpPublicKey key, java.lang.String id, PgpSignature certification) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddCertification = (JCObject)classType.Invoke("AddCertification", key == null ? null : key.getJCOInstance(), id, certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objAddCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey RemoveCertification(PgpPublicKey key, PgpSignature certification) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveCertification = (JCObject)classType.Invoke("RemoveCertification", key == null ? null : key.getJCOInstance(), certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objRemoveCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey RemoveCertification(PgpPublicKey key, PgpUserAttributeSubpacketVector userAttributes, PgpSignature certification) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveCertification = (JCObject)classType.Invoke("RemoveCertification", key == null ? null : key.getJCOInstance(), userAttributes == null ? null : userAttributes.getJCOInstance(), certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objRemoveCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey RemoveCertification(PgpPublicKey key, PgpUserAttributeSubpacketVector userAttributes) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveCertification = (JCObject)classType.Invoke("RemoveCertification", key == null ? null : key.getJCOInstance(), userAttributes == null ? null : userAttributes.getJCOInstance());
            return new PgpPublicKey(objRemoveCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey RemoveCertification(PgpPublicKey key, java.lang.String id, PgpSignature certification) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveCertification = (JCObject)classType.Invoke("RemoveCertification", key == null ? null : key.getJCOInstance(), id, certification == null ? null : certification.getJCOInstance());
            return new PgpPublicKey(objRemoveCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PgpPublicKey RemoveCertification(PgpPublicKey key, java.lang.String id) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveCertification = (JCObject)classType.Invoke("RemoveCertification", key == null ? null : key.getJCOInstance(), id);
            return new PgpPublicKey(objRemoveCertification);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricKeyParameter GetKey() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArithmeticException, system.FormatException, org.bouncycastle.bcpg.openpgp.PgpException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKey = (JCObject)classInstance.Invoke("GetKey");
            return new AsymmetricKeyParameter(objGetKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetKeySignatures() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKeySignatures = (JCObject)classInstance.Invoke("GetKeySignatures");
            return new IEnumerableImplementation(objGetKeySignatures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetSignatures() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignatures = (JCObject)classInstance.Invoke("GetSignatures");
            return new IEnumerableImplementation(objGetSignatures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetSignaturesForId(java.lang.String id) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignaturesForId = (JCObject)classInstance.Invoke("GetSignaturesForId", id);
            return new IEnumerableImplementation(objGetSignaturesForId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetSignaturesForUserAttribute(PgpUserAttributeSubpacketVector userAttributes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignaturesForUserAttribute = (JCObject)classInstance.Invoke("GetSignaturesForUserAttribute", userAttributes == null ? null : userAttributes.getJCOInstance());
            return new IEnumerableImplementation(objGetSignaturesForUserAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetSignaturesOfType(int signatureType) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignaturesOfType = (JCObject)classInstance.Invoke("GetSignaturesOfType", signatureType);
            return new IEnumerableImplementation(objGetSignaturesOfType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetUserAttributes() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUserAttributes = (JCObject)classInstance.Invoke("GetUserAttributes");
            return new IEnumerableImplementation(objGetUserAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable GetUserIds() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUserIds = (JCObject)classInstance.Invoke("GetUserIds");
            return new IEnumerableImplementation(objGetUserIds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Encode(Stream outStr) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Encode", outStr == null ? null : outStr.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsEncryptionKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEncryptionKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMasterKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsMasterKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBitStrength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BitStrength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValidDays() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ValidDays");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getKeyId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("KeyId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicKeyAlgorithmTag getAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Algorithm");
            return new PublicKeyAlgorithmTag(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicKeyPacket getPublicKeyPacket() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PublicKeyPacket");
            return new PublicKeyPacket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getCreationTime() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CreationTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}