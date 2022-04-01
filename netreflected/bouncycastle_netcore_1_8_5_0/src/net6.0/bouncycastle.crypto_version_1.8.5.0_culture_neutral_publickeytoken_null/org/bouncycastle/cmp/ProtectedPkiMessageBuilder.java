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

package org.bouncycastle.cmp;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cmp.ProtectedPkiMessage;
import org.bouncycastle.crypto.IMacFactory;
import org.bouncycastle.crypto.IMacFactoryImplementation;
import org.bouncycastle.crypto.ISignatureFactory;
import org.bouncycastle.crypto.ISignatureFactoryImplementation;
import org.bouncycastle.cmp.ProtectedPkiMessageBuilder;
import org.bouncycastle.x509.X509Certificate;
import org.bouncycastle.asn1.cmp.InfoTypeAndValue;
import org.bouncycastle.asn1.cmp.PkiBody;
import org.bouncycastle.asn1.cmp.PkiFreeText;
import org.bouncycastle.asn1.DerGeneralizedTime;


/**
 * The base .NET class managing Org.BouncyCastle.Cmp.ProtectedPkiMessageBuilder, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cmp.ProtectedPkiMessageBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cmp.ProtectedPkiMessageBuilder</a>
 */
public class ProtectedPkiMessageBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Cmp.ProtectedPkiMessageBuilder
     */
    public static final String className = "Org.BouncyCastle.Cmp.ProtectedPkiMessageBuilder";
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
    public ProtectedPkiMessageBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProtectedPkiMessageBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProtectedPkiMessageBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProtectedPkiMessageBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProtectedPkiMessageBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ProtectedPkiMessageBuilder() throws Throwable {
    }

    public ProtectedPkiMessageBuilder(int pvno, GeneralName sender, GeneralName recipient) throws Throwable, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pvno, sender == null ? null : sender.getJCOInstance(), recipient == null ? null : recipient.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder(GeneralName sender, GeneralName recipient) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(sender == null ? null : sender.getJCOInstance(), recipient == null ? null : recipient.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ProtectedPkiMessage Build(IMacFactory factory) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build", factory == null ? null : factory.getJCOInstance());
            return new ProtectedPkiMessage(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessage Build(ISignatureFactory signatureFactory) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build", signatureFactory == null ? null : signatureFactory.getJCOInstance());
            return new ProtectedPkiMessage(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder AddCmpCertificate(X509Certificate certificate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddCmpCertificate = (JCObject)classInstance.Invoke("AddCmpCertificate", certificate == null ? null : certificate.getJCOInstance());
            return new ProtectedPkiMessageBuilder(objAddCmpCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder AddGeneralInfo(InfoTypeAndValue genInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddGeneralInfo = (JCObject)classInstance.Invoke("AddGeneralInfo", genInfo == null ? null : genInfo.getJCOInstance());
            return new ProtectedPkiMessageBuilder(objAddGeneralInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetBody(PkiBody body) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetBody = (JCObject)classInstance.Invoke("SetBody", body == null ? null : body.getJCOInstance());
            return new ProtectedPkiMessageBuilder(objSetBody);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetFreeText(PkiFreeText freeText) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetFreeText = (JCObject)classInstance.Invoke("SetFreeText", freeText == null ? null : freeText.getJCOInstance());
            return new ProtectedPkiMessageBuilder(objSetFreeText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetMessageTime(DerGeneralizedTime generalizedTime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetMessageTime = (JCObject)classInstance.Invoke("SetMessageTime", generalizedTime == null ? null : generalizedTime.getJCOInstance());
            return new ProtectedPkiMessageBuilder(objSetMessageTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetRecipKID(byte[] id) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetRecipKID = (JCObject)classInstance.Invoke("SetRecipKID", (java.lang.Object)id);
            return new ProtectedPkiMessageBuilder(objSetRecipKID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetRecipKID(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetRecipKID = (JCObject)classInstance.Invoke("SetRecipKID", (java.lang.Object)dupParam0.getJCRefOut());
            return new ProtectedPkiMessageBuilder(objSetRecipKID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetRecipNonce(byte[] nonce) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetRecipNonce = (JCObject)classInstance.Invoke("SetRecipNonce", (java.lang.Object)nonce);
            return new ProtectedPkiMessageBuilder(objSetRecipNonce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetRecipNonce(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetRecipNonce = (JCObject)classInstance.Invoke("SetRecipNonce", (java.lang.Object)dupParam0.getJCRefOut());
            return new ProtectedPkiMessageBuilder(objSetRecipNonce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetSenderKID(byte[] id) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSenderKID = (JCObject)classInstance.Invoke("SetSenderKID", (java.lang.Object)id);
            return new ProtectedPkiMessageBuilder(objSetSenderKID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetSenderKID(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSenderKID = (JCObject)classInstance.Invoke("SetSenderKID", (java.lang.Object)dupParam0.getJCRefOut());
            return new ProtectedPkiMessageBuilder(objSetSenderKID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetSenderNonce(byte[] nonce) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSenderNonce = (JCObject)classInstance.Invoke("SetSenderNonce", (java.lang.Object)nonce);
            return new ProtectedPkiMessageBuilder(objSetSenderNonce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetSenderNonce(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSenderNonce = (JCObject)classInstance.Invoke("SetSenderNonce", (java.lang.Object)dupParam0.getJCRefOut());
            return new ProtectedPkiMessageBuilder(objSetSenderNonce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetTransactionId(byte[] tid) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetTransactionId = (JCObject)classInstance.Invoke("SetTransactionId", (java.lang.Object)tid);
            return new ProtectedPkiMessageBuilder(objSetTransactionId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessageBuilder SetTransactionId(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetTransactionId = (JCObject)classInstance.Invoke("SetTransactionId", (java.lang.Object)dupParam0.getJCRefOut());
            return new ProtectedPkiMessageBuilder(objSetTransactionId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}