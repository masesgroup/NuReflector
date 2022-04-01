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

package org.bouncycastle.x509;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.x509.X509Certificate;
import org.bouncycastle.crypto.AsymmetricKeyParameter;
import org.bouncycastle.security.SecureRandom;
import org.bouncycastle.crypto.ISignatureFactory;
import org.bouncycastle.crypto.ISignatureFactoryImplementation;
import org.bouncycastle.asn1.x509.X509Name;
import system.DateTime;
import org.bouncycastle.math.BigInteger;


/**
 * The base .NET class managing Org.BouncyCastle.X509.X509V1CertificateGenerator, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.X509.X509V1CertificateGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.X509.X509V1CertificateGenerator</a>
 */
public class X509V1CertificateGenerator extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.X509.X509V1CertificateGenerator
     */
    public static final String className = "Org.BouncyCastle.X509.X509V1CertificateGenerator";
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
    public X509V1CertificateGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link X509V1CertificateGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link X509V1CertificateGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static X509V1CertificateGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new X509V1CertificateGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public X509V1CertificateGenerator() throws Throwable, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public X509Certificate Generate(AsymmetricKeyParameter privateKey, SecureRandom random) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.security.certificates.CertificateParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerate = (JCObject)classInstance.Invoke("Generate", privateKey == null ? null : privateKey.getJCOInstance(), random == null ? null : random.getJCOInstance());
            return new X509Certificate(objGenerate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate Generate(AsymmetricKeyParameter privateKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.security.certificates.CertificateParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerate = (JCObject)classInstance.Invoke("Generate", privateKey == null ? null : privateKey.getJCOInstance());
            return new X509Certificate(objGenerate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate Generate(ISignatureFactory signatureCalculatorFactory) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.globalization.CultureNotFoundException, system.FormatException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.security.certificates.CertificateParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerate = (JCObject)classInstance.Invoke("Generate", signatureCalculatorFactory == null ? null : signatureCalculatorFactory.getJCOInstance());
            return new X509Certificate(objGenerate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetIssuerDN(X509Name issuer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetIssuerDN", issuer == null ? null : issuer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNotAfter(DateTime date) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetNotAfter", date == null ? null : date.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNotBefore(DateTime date) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetNotBefore", date == null ? null : date.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPublicKey(AsymmetricKeyParameter publicKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPublicKey", publicKey == null ? null : publicKey.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSerialNumber(BigInteger serialNumber) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSerialNumber", serialNumber == null ? null : serialNumber.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSignatureAlgorithm(java.lang.String signatureAlgorithm) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSignatureAlgorithm", signatureAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSubjectDN(X509Name subject) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSubjectDN", subject == null ? null : subject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IEnumerable getSignatureAlgNames() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SignatureAlgNames");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}