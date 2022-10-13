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

package org.bouncycastle.asn1.crmf;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.crmf.CertTemplateBuilder;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.DerBitString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.DerInteger;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.crmf.OptionalValidity;


/**
 * The base .NET class managing Org.BouncyCastle.Asn1.Crmf.CertTemplateBuilder, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Crmf.CertTemplateBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Crmf.CertTemplateBuilder</a>
 */
public class CertTemplateBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Asn1.Crmf.CertTemplateBuilder
     */
    public static final String className = "Org.BouncyCastle.Asn1.Crmf.CertTemplateBuilder";
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
    public CertTemplateBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CertTemplateBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CertTemplateBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CertTemplateBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CertTemplateBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public CertTemplateBuilder() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public CertTemplate Build() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build");
            return new CertTemplate(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetExtensions(X509Extensions extens) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetExtensions = (JCObject)classInstance.Invoke("SetExtensions", extens == null ? null : extens.getJCOInstance());
            return new CertTemplateBuilder(objSetExtensions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetIssuer(X509Name name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIssuer = (JCObject)classInstance.Invoke("SetIssuer", name == null ? null : name.getJCOInstance());
            return new CertTemplateBuilder(objSetIssuer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetIssuerUID(DerBitString uid) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIssuerUID = (JCObject)classInstance.Invoke("SetIssuerUID", uid == null ? null : uid.getJCOInstance());
            return new CertTemplateBuilder(objSetIssuerUID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetPublicKey(SubjectPublicKeyInfo spki) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetPublicKey = (JCObject)classInstance.Invoke("SetPublicKey", spki == null ? null : spki.getJCOInstance());
            return new CertTemplateBuilder(objSetPublicKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetSerialNumber(DerInteger ser) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSerialNumber = (JCObject)classInstance.Invoke("SetSerialNumber", ser == null ? null : ser.getJCOInstance());
            return new CertTemplateBuilder(objSetSerialNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetSigningAlg(AlgorithmIdentifier aid) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSigningAlg = (JCObject)classInstance.Invoke("SetSigningAlg", aid == null ? null : aid.getJCOInstance());
            return new CertTemplateBuilder(objSetSigningAlg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetSubject(X509Name name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSubject = (JCObject)classInstance.Invoke("SetSubject", name == null ? null : name.getJCOInstance());
            return new CertTemplateBuilder(objSetSubject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetSubjectUID(DerBitString uid) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSubjectUID = (JCObject)classInstance.Invoke("SetSubjectUID", uid == null ? null : uid.getJCOInstance());
            return new CertTemplateBuilder(objSetSubjectUID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetValidity(OptionalValidity v) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetValidity = (JCObject)classInstance.Invoke("SetValidity", v == null ? null : v.getJCOInstance());
            return new CertTemplateBuilder(objSetValidity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertTemplateBuilder SetVersion(int ver) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetVersion = (JCObject)classInstance.Invoke("SetVersion", ver);
            return new CertTemplateBuilder(objSetVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}