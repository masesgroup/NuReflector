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
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import org.bouncycastle.x509.store.IX509Store;
import org.bouncycastle.x509.store.IX509StoreImplementation;
import org.bouncycastle.cms.SignerInformationStore;


/**
 * The base .NET class managing Org.BouncyCastle.Cms.CmsSignedGenerator, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cms.CmsSignedGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cms.CmsSignedGenerator</a>
 */
public class CmsSignedGenerator extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Cms.CmsSignedGenerator
     */
    public static final String className = "Org.BouncyCastle.Cms.CmsSignedGenerator";
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
    public CmsSignedGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CmsSignedGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CmsSignedGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CmsSignedGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CmsSignedGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public CmsSignedGenerator() throws Throwable {
    }



    
    // Methods section
    
    public IDictionary GetGeneratedDigests() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGeneratedDigests = (JCObject)classInstance.Invoke("GetGeneratedDigests");
            return new IDictionaryImplementation(objGetGeneratedDigests);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAttributeCertificates(IX509Store store) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.cms.CmsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddAttributeCertificates", store == null ? null : store.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCertificates(IX509Store certStore) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, org.bouncycastle.security.certificates.CertificateEncodingException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.cms.CmsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddCertificates", certStore == null ? null : certStore.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCrls(IX509Store crlStore) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, org.bouncycastle.security.certificates.CrlException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, org.bouncycastle.cms.CmsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddCrls", crlStore == null ? null : crlStore.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSigners(SignerInformationStore signerStore) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSigners", signerStore == null ? null : signerStore.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getUseDerForCerts() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseDerForCerts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseDerForCerts(boolean UseDerForCerts) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseDerForCerts", UseDerForCerts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseDerForCrls() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseDerForCrls");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseDerForCrls(boolean UseDerForCrls) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseDerForCrls", UseDerForCrls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}