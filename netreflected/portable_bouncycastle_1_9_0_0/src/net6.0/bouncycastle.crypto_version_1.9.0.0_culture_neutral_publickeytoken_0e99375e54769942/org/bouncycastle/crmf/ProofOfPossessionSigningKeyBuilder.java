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

package org.bouncycastle.crmf;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.crmf.CertRequest;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.crmf.PopoSigningKey;
import org.bouncycastle.crypto.ISignatureFactory;
import org.bouncycastle.crypto.ISignatureFactoryImplementation;
import org.bouncycastle.crmf.ProofOfPossessionSigningKeyBuilder;
import org.bouncycastle.crmf.PKMacBuilder;
import org.bouncycastle.asn1.x509.GeneralName;


/**
 * The base .NET class managing Org.BouncyCastle.Crmf.ProofOfPossessionSigningKeyBuilder, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crmf.ProofOfPossessionSigningKeyBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crmf.ProofOfPossessionSigningKeyBuilder</a>
 */
public class ProofOfPossessionSigningKeyBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crmf.ProofOfPossessionSigningKeyBuilder
     */
    public static final String className = "Org.BouncyCastle.Crmf.ProofOfPossessionSigningKeyBuilder";
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
    public ProofOfPossessionSigningKeyBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProofOfPossessionSigningKeyBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProofOfPossessionSigningKeyBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProofOfPossessionSigningKeyBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProofOfPossessionSigningKeyBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ProofOfPossessionSigningKeyBuilder() throws Throwable {
    }

    public ProofOfPossessionSigningKeyBuilder(CertRequest certRequest) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certRequest == null ? null : certRequest.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProofOfPossessionSigningKeyBuilder(SubjectPublicKeyInfo pubKeyInfo) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pubKeyInfo == null ? null : pubKeyInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public PopoSigningKey Build(ISignatureFactory signer) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build", signer == null ? null : signer.getJCOInstance());
            return new PopoSigningKey(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProofOfPossessionSigningKeyBuilder SetPublicKeyMac(PKMacBuilder generator, char[] password) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArithmeticException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.OverflowException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetPublicKeyMac = (JCObject)classInstance.Invoke("SetPublicKeyMac", generator == null ? null : generator.getJCOInstance(), password);
            return new ProofOfPossessionSigningKeyBuilder(objSetPublicKeyMac);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProofOfPossessionSigningKeyBuilder SetPublicKeyMac(PKMacBuilder dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArithmeticException, system.IndexOutOfRangeException, org.bouncycastle.security.SecurityUtilityException, system.OverflowException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetPublicKeyMac = (JCObject)classInstance.Invoke("SetPublicKeyMac", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new ProofOfPossessionSigningKeyBuilder(objSetPublicKeyMac);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProofOfPossessionSigningKeyBuilder SetSender(GeneralName name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSender = (JCObject)classInstance.Invoke("SetSender", name == null ? null : name.getJCOInstance());
            return new ProofOfPossessionSigningKeyBuilder(objSetSender);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}