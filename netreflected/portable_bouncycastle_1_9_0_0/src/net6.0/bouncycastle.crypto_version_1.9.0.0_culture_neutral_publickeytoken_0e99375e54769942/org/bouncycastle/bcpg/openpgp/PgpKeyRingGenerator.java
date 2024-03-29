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
import org.bouncycastle.bcpg.openpgp.PgpKeyPair;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTag;
import org.bouncycastle.bcpg.openpgp.PgpSignatureSubpacketVector;
import org.bouncycastle.security.SecureRandom;
import org.bouncycastle.bcpg.HashAlgorithmTag;
import org.bouncycastle.bcpg.openpgp.PgpPublicKeyRing;
import org.bouncycastle.bcpg.openpgp.PgpSecretKeyRing;


/**
 * The base .NET class managing Org.BouncyCastle.Bcpg.OpenPgp.PgpKeyRingGenerator, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.OpenPgp.PgpKeyRingGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.OpenPgp.PgpKeyRingGenerator</a>
 */
public class PgpKeyRingGenerator extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Bcpg.OpenPgp.PgpKeyRingGenerator
     */
    public static final String className = "Org.BouncyCastle.Bcpg.OpenPgp.PgpKeyRingGenerator";
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
    public PgpKeyRingGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PgpKeyRingGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PgpKeyRingGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PgpKeyRingGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PgpKeyRingGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public PgpKeyRingGenerator() throws Throwable {
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, boolean utf8PassPhrase, char[] passPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.IndexOutOfRangeException, org.bouncycastle.bcpg.openpgp.PgpException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), utf8PassPhrase, passPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, byte[] rawPassPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), rawPassPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, char[] passPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.OverflowException, system.IndexOutOfRangeException, org.bouncycastle.bcpg.openpgp.PgpException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.FormatException, system.io.IOException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), passPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, char[] passPhrase, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.OverflowException, system.ArgumentNullException, system.IndexOutOfRangeException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentException, org.bouncycastle.security.SecurityUtilityException, system.ArgumentOutOfRangeException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), passPhrase, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, HashAlgorithmTag hashAlgorithm, boolean utf8PassPhrase, char[] passPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.IndexOutOfRangeException, org.bouncycastle.bcpg.openpgp.PgpException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), utf8PassPhrase, passPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, HashAlgorithmTag hashAlgorithm, byte[] rawPassPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), rawPassPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpKeyRingGenerator(int certificationLevel, PgpKeyPair masterKey, java.lang.String id, SymmetricKeyAlgorithmTag encAlgorithm, HashAlgorithmTag hashAlgorithm, char[] passPhrase, boolean useSha1, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, SecureRandom rand) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.OverflowException, system.IndexOutOfRangeException, org.bouncycastle.bcpg.openpgp.PgpException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.FormatException, system.io.IOException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificationLevel, masterKey == null ? null : masterKey.getJCOInstance(), id, encAlgorithm == null ? null : encAlgorithm.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), passPhrase, useSha1, hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public PgpPublicKeyRing GeneratePublicKeyRing() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGeneratePublicKeyRing = (JCObject)classInstance.Invoke("GeneratePublicKeyRing");
            return new PgpPublicKeyRing(objGeneratePublicKeyRing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PgpSecretKeyRing GenerateSecretKeyRing() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateSecretKeyRing = (JCObject)classInstance.Invoke("GenerateSecretKeyRing");
            return new PgpSecretKeyRing(objGenerateSecretKeyRing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair, HashAlgorithmTag hashAlgorithm, HashAlgorithmTag primaryKeyBindingHashAlgorithm) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), primaryKeyBindingHashAlgorithm == null ? null : primaryKeyBindingHashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair, HashAlgorithmTag hashAlgorithm) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, HashAlgorithmTag hashAlgorithm, HashAlgorithmTag primaryKeyBindingHashAlgorithm) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance(), hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), primaryKeyBindingHashAlgorithm == null ? null : primaryKeyBindingHashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets, HashAlgorithmTag hashAlgorithm) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance(), hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair, PgpSignatureSubpacketVector hashedPackets, PgpSignatureSubpacketVector unhashedPackets) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance(), hashedPackets == null ? null : hashedPackets.getJCOInstance(), unhashedPackets == null ? null : unhashedPackets.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubKey(PgpKeyPair keyPair) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.bcpg.openpgp.PgpException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSubKey", keyPair == null ? null : keyPair.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}