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

package org.bouncycastle.asn1.cmp;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.Asn1Encodable;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.Asn1Object;
import org.bouncycastle.asn1.cmp.CmpCertificate;
import org.bouncycastle.asn1.IAsn1Choice;
import org.bouncycastle.asn1.IAsn1ChoiceImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Asn1.Cmp.CmpCertificate, BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Cmp.CmpCertificate" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Cmp.CmpCertificate</a>
 */
public class CmpCertificate extends Asn1Encodable implements org.bouncycastle.asn1.IAsn1Choice {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Asn1.Cmp.CmpCertificate
     */
    public static final String className = "Org.BouncyCastle.Asn1.Cmp.CmpCertificate";
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
    public CmpCertificate(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CmpCertificate}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CmpCertificate} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CmpCertificate cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CmpCertificate(from.getJCOInstance());
    }

    // Constructors section
    
    public CmpCertificate() throws Throwable {
    }

    public CmpCertificate(AttributeCertificate x509v2AttrCert) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(x509v2AttrCert == null ? null : x509v2AttrCert.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CmpCertificate(X509CertificateStructure x509v3PKCert) throws Throwable, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(x509v3PKCert == null ? null : x509v3PKCert.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Asn1Object ToAsn1Object() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToAsn1Object = (JCObject)classInstance.Invoke("ToAsn1Object");
            return new Asn1Object(objToAsn1Object);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CmpCertificate GetInstance(NetObject obj) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, system.OutOfMemoryException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInstance = (JCObject)classType.Invoke("GetInstance", obj == null ? null : obj.getJCOInstance());
            return new CmpCertificate(objGetInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsX509v3PKCert() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsX509v3PKCert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AttributeCertificate getX509v2AttrCert() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("X509v2AttrCert");
            return new AttributeCertificate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateStructure getX509v3PKCert() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("X509v3PKCert");
            return new X509CertificateStructure(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}