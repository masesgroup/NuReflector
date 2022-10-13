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
import org.bouncycastle.crypto.AsymmetricKeyParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import system.io.Stream;


/**
 * The base .NET class managing Org.BouncyCastle.Security.PublicKeyFactory, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.PublicKeyFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Security.PublicKeyFactory</a>
 */
public class PublicKeyFactory extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Security.PublicKeyFactory
     */
    public static final String className = "Org.BouncyCastle.Security.PublicKeyFactory";
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
    public PublicKeyFactory(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PublicKeyFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PublicKeyFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PublicKeyFactory cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PublicKeyFactory(from.getJCOInstance());
    }

    // Constructors section
    
    public PublicKeyFactory() throws Throwable {
    }



    
    // Methods section
    
    public static AsymmetricKeyParameter CreateKey(byte[] keyInfoData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException, system.NullReferenceException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKey = (JCObject)classType.Invoke("CreateKey", (java.lang.Object)keyInfoData);
            return new AsymmetricKeyParameter(objCreateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AsymmetricKeyParameter CreateKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException, system.NullReferenceException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKey = (JCObject)classType.Invoke("CreateKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new AsymmetricKeyParameter(objCreateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AsymmetricKeyParameter CreateKey(SubjectPublicKeyInfo keyInfo) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, system.FormatException, org.bouncycastle.asn1.Asn1ParsingException, system.ArithmeticException, system.NullReferenceException, system.NotSupportedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKey = (JCObject)classType.Invoke("CreateKey", keyInfo == null ? null : keyInfo.getJCOInstance());
            return new AsymmetricKeyParameter(objCreateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AsymmetricKeyParameter CreateKey(Stream inStr) throws Throwable, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, org.bouncycastle.asn1.Asn1Exception, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, org.bouncycastle.asn1.Asn1ParsingException, system.ArithmeticException, system.NullReferenceException, system.NotSupportedException, org.bouncycastle.security.SecurityUtilityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateKey = (JCObject)classType.Invoke("CreateKey", inStr == null ? null : inStr.getJCOInstance());
            return new AsymmetricKeyParameter(objCreateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}