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

package org.bouncycastle.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.Asn1Encodable;
import org.bouncycastle.asn1.DerObjectIdentifier;
import org.bouncycastle.security.SecureRandom;
import org.bouncycastle.crypto.ICipherParameters;
import org.bouncycastle.crypto.ICipherParametersImplementation;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Security.PbeUtilities, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.PbeUtilities" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.PbeUtilities</a>
 */
public class PbeUtilities extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Security.PbeUtilities
     */
    public static final String className = "Org.BouncyCastle.Security.PbeUtilities";
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
    public PbeUtilities(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PbeUtilities}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PbeUtilities} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PbeUtilities cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PbeUtilities(from.getJCOInstance());
    }

    // Constructors section
    
    public PbeUtilities() throws Throwable {
    }



    
    // Methods section
    
    public static boolean IsOpenSsl(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsOpenSsl", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPbeAlgorithm(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPbeAlgorithm", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPkcs12(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPkcs12", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPkcs5Scheme1(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPkcs5Scheme1", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPkcs5Scheme2(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPkcs5Scheme2", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(DerObjectIdentifier algorithmOid, byte[] salt, int iterationCount) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", algorithmOid == null ? null : algorithmOid.getJCOInstance(), salt, iterationCount);
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(DerObjectIdentifier dupParam0, JCORefOut dupParam1, int dupParam2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2);
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(DerObjectIdentifier cipherAlgorithm, DerObjectIdentifier hashAlgorithm, byte[] salt, int iterationCount, SecureRandom secureRandom) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", cipherAlgorithm == null ? null : cipherAlgorithm.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), salt, iterationCount, secureRandom == null ? null : secureRandom.getJCOInstance());
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(DerObjectIdentifier dupParam0, DerObjectIdentifier dupParam1, JCORefOut dupParam2, int dupParam3, SecureRandom dupParam4) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut(), dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance());
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(java.lang.String algorithm, byte[] salt, int iterationCount) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", algorithm, salt, iterationCount);
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateAlgorithmParameters(java.lang.String dupParam0, JCORefOut dupParam1, int dupParam2) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateAlgorithmParameters = (JCObject)classType.Invoke("GenerateAlgorithmParameters", dupParam0, dupParam1.getJCRefOut(), dupParam2);
            return new Asn1Encodable(objGenerateAlgorithmParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DerObjectIdentifier GetObjectIdentifier(java.lang.String mechanism) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetObjectIdentifier = (JCObject)classType.Invoke("GetObjectIdentifier", mechanism);
            return new DerObjectIdentifier(objGetObjectIdentifier);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(DerObjectIdentifier algorithmOid, char[] password, boolean wrongPkcs12Zero, Asn1Encodable pbeParameters) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algorithmOid == null ? null : algorithmOid.getJCOInstance(), password, wrongPkcs12Zero, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(DerObjectIdentifier dupParam0, JCORefOut dupParam1, boolean dupParam2, Asn1Encodable dupParam3) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(DerObjectIdentifier algorithmOid, char[] password, Asn1Encodable pbeParameters) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algorithmOid == null ? null : algorithmOid.getJCOInstance(), password, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(DerObjectIdentifier dupParam0, JCORefOut dupParam1, Asn1Encodable dupParam2) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(AlgorithmIdentifier algID, char[] password, boolean wrongPkcs12Zero) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algID == null ? null : algID.getJCOInstance(), password, wrongPkcs12Zero);
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(AlgorithmIdentifier dupParam0, JCORefOut dupParam1, boolean dupParam2) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2);
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(AlgorithmIdentifier algID, char[] password) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algID == null ? null : algID.getJCOInstance(), password);
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(AlgorithmIdentifier dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(java.lang.String algorithm, char[] password, boolean wrongPkcs12Zero, Asn1Encodable pbeParameters) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algorithm, password, wrongPkcs12Zero, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(java.lang.String dupParam0, JCORefOut dupParam1, boolean dupParam2, Asn1Encodable dupParam3) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0, dupParam1.getJCRefOut(), dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(java.lang.String algorithm, char[] password, Asn1Encodable pbeParameters) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", algorithm, password, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GenerateCipherParameters(java.lang.String dupParam0, JCORefOut dupParam1, Asn1Encodable dupParam2) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateCipherParameters = (JCObject)classType.Invoke("GenerateCipherParameters", dupParam0, dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new ICipherParametersImplementation(objGenerateCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateEngine(DerObjectIdentifier algorithmOid) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngine = (JCObject)classType.Invoke("CreateEngine", algorithmOid == null ? null : algorithmOid.getJCOInstance());
            return new NetObject(objCreateEngine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateEngine(AlgorithmIdentifier algID) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.NotSupportedException, system.InvalidCastException, org.bouncycastle.security.SecurityUtilityException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngine = (JCObject)classType.Invoke("CreateEngine", algID == null ? null : algID.getJCOInstance());
            return new NetObject(objCreateEngine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateEngine(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngine = (JCObject)classType.Invoke("CreateEngine", algorithm);
            return new NetObject(objCreateEngine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetEncodingName(DerObjectIdentifier oid) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetEncodingName", oid == null ? null : oid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static ICollection getAlgorithms() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Algorithms");
            return new ICollectionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}