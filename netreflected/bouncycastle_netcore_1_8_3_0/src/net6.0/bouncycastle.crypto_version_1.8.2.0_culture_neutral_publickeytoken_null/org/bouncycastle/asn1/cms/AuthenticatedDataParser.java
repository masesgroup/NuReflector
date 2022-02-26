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

package org.bouncycastle.asn1.cms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.Asn1SequenceParser;
import org.bouncycastle.asn1.Asn1SequenceParserImplementation;
import org.bouncycastle.asn1.Asn1OctetString;
import org.bouncycastle.asn1.Asn1SetParser;
import org.bouncycastle.asn1.Asn1SetParserImplementation;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.DerInteger;


/**
 * The base .NET class managing Org.BouncyCastle.Asn1.Cms.AuthenticatedDataParser, BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Cms.AuthenticatedDataParser" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.Cms.AuthenticatedDataParser</a>
 */
public class AuthenticatedDataParser extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Asn1.Cms.AuthenticatedDataParser
     */
    public static final String className = "Org.BouncyCastle.Asn1.Cms.AuthenticatedDataParser";
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
    public AuthenticatedDataParser(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AuthenticatedDataParser}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AuthenticatedDataParser} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AuthenticatedDataParser cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AuthenticatedDataParser(from.getJCOInstance());
    }

    // Constructors section
    
    public AuthenticatedDataParser() throws Throwable {
    }

    public AuthenticatedDataParser(Asn1SequenceParser seq) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(seq == null ? null : seq.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Asn1OctetString GetMac() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMac = (JCObject)classInstance.Invoke("GetMac");
            return new Asn1OctetString(objGetMac);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Asn1SetParser GetAuthAttrs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAuthAttrs = (JCObject)classInstance.Invoke("GetAuthAttrs");
            return new Asn1SetParserImplementation(objGetAuthAttrs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Asn1SetParser GetRecipientInfos() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRecipientInfos = (JCObject)classInstance.Invoke("GetRecipientInfos");
            return new Asn1SetParserImplementation(objGetRecipientInfos);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Asn1SetParser GetUnauthAttrs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUnauthAttrs = (JCObject)classInstance.Invoke("GetUnauthAttrs");
            return new Asn1SetParserImplementation(objGetUnauthAttrs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContentInfoParser GetEnapsulatedContentInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEnapsulatedContentInfo = (JCObject)classInstance.Invoke("GetEnapsulatedContentInfo");
            return new ContentInfoParser(objGetEnapsulatedContentInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OriginatorInfo GetOriginatorInfo() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOriginatorInfo = (JCObject)classInstance.Invoke("GetOriginatorInfo");
            return new OriginatorInfo(objGetOriginatorInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AlgorithmIdentifier GetDigestAlgorithm() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDigestAlgorithm = (JCObject)classInstance.Invoke("GetDigestAlgorithm");
            return new AlgorithmIdentifier(objGetDigestAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AlgorithmIdentifier GetMacAlgorithm() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, system.OutOfMemoryException, org.bouncycastle.asn1.Asn1ParsingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMacAlgorithm = (JCObject)classInstance.Invoke("GetMacAlgorithm");
            return new AlgorithmIdentifier(objGetMacAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DerInteger getVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Version");
            return new DerInteger(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}