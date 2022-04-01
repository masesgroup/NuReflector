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
import org.bouncycastle.asn1.cmp.PkiMessage;
import org.bouncycastle.cmp.GeneralPkiMessage;
import org.bouncycastle.crmf.PKMacBuilder;
import org.bouncycastle.crypto.IVerifierFactory;
import org.bouncycastle.crypto.IVerifierFactoryImplementation;
import org.bouncycastle.x509.X509Certificate;
import org.bouncycastle.asn1.cmp.PkiBody;
import org.bouncycastle.asn1.cmp.PkiHeader;


/**
 * The base .NET class managing Org.BouncyCastle.Cmp.ProtectedPkiMessage, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cmp.ProtectedPkiMessage" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Cmp.ProtectedPkiMessage</a>
 */
public class ProtectedPkiMessage extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Cmp.ProtectedPkiMessage
     */
    public static final String className = "Org.BouncyCastle.Cmp.ProtectedPkiMessage";
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
    public ProtectedPkiMessage(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProtectedPkiMessage}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProtectedPkiMessage} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProtectedPkiMessage cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProtectedPkiMessage(from.getJCOInstance());
    }

    // Constructors section
    
    public ProtectedPkiMessage() throws Throwable {
    }

    public ProtectedPkiMessage(PkiMessage pkiMessage) throws Throwable, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pkiMessage == null ? null : pkiMessage.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProtectedPkiMessage(GeneralPkiMessage pkiMessage) throws Throwable, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pkiMessage == null ? null : pkiMessage.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Verify(PKMacBuilder pkMacBuilder, char[] password) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OutOfMemoryException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Verify", pkMacBuilder == null ? null : pkMacBuilder.getJCOInstance(), password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Verify(PKMacBuilder dupParam0, JCORefOut dupParam1) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OutOfMemoryException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, org.bouncycastle.security.SecurityUtilityException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Verify", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Verify(IVerifierFactory verifierFactory) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Verify", verifierFactory == null ? null : verifierFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PkiMessage ToAsn1Message() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToAsn1Message = (JCObject)classInstance.Invoke("ToAsn1Message");
            return new PkiMessage(objToAsn1Message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate[] GetCertificates() throws Throwable, system.ArgumentNullException, system.io.IOException, system.io.EndOfStreamException, system.ArgumentException, org.bouncycastle.asn1.Asn1Exception, system.InvalidOperationException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.security.certificates.CertificateParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<X509Certificate> resultingArrayList = new ArrayList<X509Certificate>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCertificates");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new X509Certificate(resultingObject));
            }
            X509Certificate[] resultingArray = new X509Certificate[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasPasswordBasedMacProtected() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasPasswordBasedMacProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PkiBody getBody() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Body");
            return new PkiBody(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PkiHeader getHeader() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Header");
            return new PkiHeader(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}