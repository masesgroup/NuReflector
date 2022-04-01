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

package org.bouncycastle.cms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.cms.CmsSignedGenerator;
import org.bouncycastle.security.SecureRandom;
import system.io.Stream;
import org.bouncycastle.crypto.AsymmetricKeyParameter;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.cms.CmsAttributeTableGenerator;
import org.bouncycastle.cms.CmsAttributeTableGeneratorImplementation;
import org.bouncycastle.x509.X509Certificate;


/**
 * The base .NET class managing Org.BouncyCastle.Cms.CmsSignedDataStreamGenerator, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cms.CmsSignedDataStreamGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cms.CmsSignedDataStreamGenerator</a>
 */
public class CmsSignedDataStreamGenerator extends CmsSignedGenerator  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Cms.CmsSignedDataStreamGenerator
     */
    public static final String className = "Org.BouncyCastle.Cms.CmsSignedDataStreamGenerator";
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
    public CmsSignedDataStreamGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CmsSignedDataStreamGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CmsSignedDataStreamGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CmsSignedDataStreamGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CmsSignedDataStreamGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public CmsSignedDataStreamGenerator() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CmsSignedDataStreamGenerator(SecureRandom rand) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rand == null ? null : rand.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public Stream Open(Stream outStream, boolean encapsulate, Stream dataOutputStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", outStream == null ? null : outStream.getJCOInstance(), encapsulate, dataOutputStream == null ? null : dataOutputStream.getJCOInstance());
            return new Stream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream Open(Stream outStream, boolean encapsulate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", outStream == null ? null : outStream.getJCOInstance(), encapsulate);
            return new Stream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream Open(Stream outStream, java.lang.String signedContentType, boolean encapsulate, Stream dataOutputStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.asn1.Asn1Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", outStream == null ? null : outStream.getJCOInstance(), signedContentType, encapsulate, dataOutputStream == null ? null : dataOutputStream.getJCOInstance());
            return new Stream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream Open(Stream outStream, java.lang.String signedContentType, boolean encapsulate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", outStream == null ? null : outStream.getJCOInstance(), signedContentType, encapsulate);
            return new Stream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream Open(Stream outStream) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", outStream == null ? null : outStream.getJCOInstance());
            return new Stream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddDigests(IEnumerable digestOids) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddDigests", digestOids == null ? null : digestOids.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddDigests(java.lang.String... digestOids) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddDigests", (java.lang.Object)digestOids);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddDigests(JCORefOut dupParam0) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddDigests", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, byte[] subjectKeyID, java.lang.String digestOid, AttributeTable signedAttr, AttributeTable unsignedAttr) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), subjectKeyID, digestOid, signedAttr == null ? null : signedAttr.getJCOInstance(), unsignedAttr == null ? null : unsignedAttr.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter dupParam0, JCORefOut dupParam1, java.lang.String dupParam2, AttributeTable dupParam3, AttributeTable dupParam4) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, byte[] subjectKeyID, java.lang.String digestOid, CmsAttributeTableGenerator signedAttrGenerator, CmsAttributeTableGenerator unsignedAttrGenerator) throws Throwable, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), subjectKeyID, digestOid, signedAttrGenerator == null ? null : signedAttrGenerator.getJCOInstance(), unsignedAttrGenerator == null ? null : unsignedAttrGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter dupParam0, JCORefOut dupParam1, java.lang.String dupParam2, CmsAttributeTableGenerator dupParam3, CmsAttributeTableGenerator dupParam4) throws Throwable, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, byte[] subjectKeyID, java.lang.String encryptionOid, java.lang.String digestOid, CmsAttributeTableGenerator signedAttrGenerator, CmsAttributeTableGenerator unsignedAttrGenerator) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), subjectKeyID, encryptionOid, digestOid, signedAttrGenerator == null ? null : signedAttrGenerator.getJCOInstance(), unsignedAttrGenerator == null ? null : unsignedAttrGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter dupParam0, JCORefOut dupParam1, java.lang.String dupParam2, java.lang.String dupParam3, CmsAttributeTableGenerator dupParam4, CmsAttributeTableGenerator dupParam5) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance(), dupParam5 == null ? null : dupParam5.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, byte[] subjectKeyID, java.lang.String encryptionOid, java.lang.String digestOid) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), subjectKeyID, encryptionOid, digestOid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter dupParam0, JCORefOut dupParam1, java.lang.String dupParam2, java.lang.String dupParam3) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2, dupParam3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, byte[] subjectKeyID, java.lang.String digestOid) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), subjectKeyID, digestOid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter dupParam0, JCORefOut dupParam1, java.lang.String dupParam2) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String digestOid, AttributeTable signedAttr, AttributeTable unsignedAttr) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1ParsingException, system.InvalidOperationException, org.bouncycastle.asn1.Asn1Exception, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), digestOid, signedAttr == null ? null : signedAttr.getJCOInstance(), unsignedAttr == null ? null : unsignedAttr.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String digestOid, CmsAttributeTableGenerator signedAttrGenerator, CmsAttributeTableGenerator unsignedAttrGenerator) throws Throwable, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, system.InvalidOperationException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), digestOid, signedAttrGenerator == null ? null : signedAttrGenerator.getJCOInstance(), unsignedAttrGenerator == null ? null : unsignedAttrGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String encryptionOid, java.lang.String digestOid, AttributeTable signedAttr, AttributeTable unsignedAttr) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, system.InvalidOperationException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), encryptionOid, digestOid, signedAttr == null ? null : signedAttr.getJCOInstance(), unsignedAttr == null ? null : unsignedAttr.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String encryptionOid, java.lang.String digestOid, CmsAttributeTableGenerator signedAttrGenerator, CmsAttributeTableGenerator unsignedAttrGenerator) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), encryptionOid, digestOid, signedAttrGenerator == null ? null : signedAttrGenerator.getJCOInstance(), unsignedAttrGenerator == null ? null : unsignedAttrGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String encryptionOid, java.lang.String digestOid) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, system.InvalidOperationException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.RankException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), encryptionOid, digestOid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigner(AsymmetricKeyParameter privateKey, X509Certificate cert, java.lang.String digestOid) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1ParsingException, system.InvalidOperationException, org.bouncycastle.asn1.Asn1Exception, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.SignatureException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigner", privateKey == null ? null : privateKey.getJCOInstance(), cert == null ? null : cert.getJCOInstance(), digestOid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetBufferSize(int bufferSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetBufferSize", bufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}