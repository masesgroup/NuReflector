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
import org.bouncycastle.asn1.Asn1Object;
import org.bouncycastle.crypto.parameters.KeyParameter;


/**
 * The base .NET class managing Org.BouncyCastle.Security.ParameterUtilities, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.ParameterUtilities" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.ParameterUtilities</a>
 */
public class ParameterUtilities extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Security.ParameterUtilities
     */
    public static final String className = "Org.BouncyCastle.Security.ParameterUtilities";
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
    public ParameterUtilities(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ParameterUtilities}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ParameterUtilities} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ParameterUtilities cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ParameterUtilities(from.getJCOInstance());
    }

    // Constructors section
    
    public ParameterUtilities() throws Throwable {
    }



    
    // Methods section
    
    public static Asn1Encodable GenerateParameters(DerObjectIdentifier algID, SecureRandom random) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateParameters = (JCObject)classType.Invoke("GenerateParameters", algID == null ? null : algID.getJCOInstance(), random == null ? null : random.getJCOInstance());
            return new Asn1Encodable(objGenerateParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Asn1Encodable GenerateParameters(java.lang.String algorithm, SecureRandom random) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateParameters = (JCObject)classType.Invoke("GenerateParameters", algorithm, random == null ? null : random.getJCOInstance());
            return new Asn1Encodable(objGenerateParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GetCipherParameters(DerObjectIdentifier algOid, ICipherParameters key, Asn1Object asn1Params) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCipherParameters = (JCObject)classType.Invoke("GetCipherParameters", algOid == null ? null : algOid.getJCOInstance(), key == null ? null : key.getJCOInstance(), asn1Params == null ? null : asn1Params.getJCOInstance());
            return new ICipherParametersImplementation(objGetCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters GetCipherParameters(java.lang.String algorithm, ICipherParameters key, Asn1Object asn1Params) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCipherParameters = (JCObject)classType.Invoke("GetCipherParameters", algorithm, key == null ? null : key.getJCOInstance(), asn1Params == null ? null : asn1Params.getJCOInstance());
            return new ICipherParametersImplementation(objGetCipherParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICipherParameters WithRandom(ICipherParameters cp, SecureRandom random) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objWithRandom = (JCObject)classType.Invoke("WithRandom", cp == null ? null : cp.getJCOInstance(), random == null ? null : random.getJCOInstance());
            return new ICipherParametersImplementation(objWithRandom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(DerObjectIdentifier algOid, byte[] keyBytes, int offset, int length) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", algOid == null ? null : algOid.getJCOInstance(), keyBytes, offset, length);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(DerObjectIdentifier dupParam0, JCORefOut dupParam1, int dupParam2, int dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(DerObjectIdentifier algOid, byte[] keyBytes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", algOid == null ? null : algOid.getJCOInstance(), keyBytes);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(DerObjectIdentifier dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(java.lang.String algorithm, byte[] keyBytes, int offset, int length) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", algorithm, keyBytes, offset, length);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(java.lang.String dupParam0, JCORefOut dupParam1, int dupParam2, int dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", dupParam0, dupParam1.getJCRefOut(), dupParam2, dupParam3);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(java.lang.String algorithm, byte[] keyBytes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", algorithm, keyBytes);
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static KeyParameter CreateKeyParameter(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKeyParameter = (JCObject)classType.Invoke("CreateKeyParameter", dupParam0, dupParam1.getJCRefOut());
            return new KeyParameter(objCreateKeyParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetCanonicalAlgorithmName(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetCanonicalAlgorithmName", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}