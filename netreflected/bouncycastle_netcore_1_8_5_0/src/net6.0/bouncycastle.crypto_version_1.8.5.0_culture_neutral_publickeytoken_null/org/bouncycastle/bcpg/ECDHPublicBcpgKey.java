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

package org.bouncycastle.bcpg;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.bcpg.ECPublicBcpgKey;
import org.bouncycastle.asn1.DerObjectIdentifier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.bcpg.HashAlgorithmTag;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTag;
import org.bouncycastle.bcpg.BcpgInputStream;
import org.bouncycastle.bcpg.BcpgOutputStream;


/**
 * The base .NET class managing Org.BouncyCastle.Bcpg.ECDHPublicBcpgKey, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.ECDHPublicBcpgKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.ECDHPublicBcpgKey</a>
 */
public class ECDHPublicBcpgKey extends ECPublicBcpgKey  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Bcpg.ECDHPublicBcpgKey
     */
    public static final String className = "Org.BouncyCastle.Bcpg.ECDHPublicBcpgKey";
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
    public ECDHPublicBcpgKey(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ECDHPublicBcpgKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ECDHPublicBcpgKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ECDHPublicBcpgKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ECDHPublicBcpgKey(from.getJCOInstance());
    }

    // Constructors section
    
    public ECDHPublicBcpgKey() throws Throwable {
    }

    public ECDHPublicBcpgKey(DerObjectIdentifier oid, ECPoint point, HashAlgorithmTag hashAlgorithm, SymmetricKeyAlgorithmTag symmetricKeyAlgorithm) throws Throwable, system.FormatException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(oid == null ? null : oid.getJCOInstance(), point == null ? null : point.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), symmetricKeyAlgorithm == null ? null : symmetricKeyAlgorithm.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDHPublicBcpgKey(BcpgInputStream bcpgIn) throws Throwable, system.io.IOException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, system.OutOfMemoryException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(bcpgIn == null ? null : bcpgIn.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Encode(BcpgOutputStream bcpgOut) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Encode", bcpgOut == null ? null : bcpgOut.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public byte getReserved() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("Reserved");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HashAlgorithmTag getHashAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HashAlgorithm");
            return new HashAlgorithmTag(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SymmetricKeyAlgorithmTag getSymmetricKeyAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SymmetricKeyAlgorithm");
            return new SymmetricKeyAlgorithmTag(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}