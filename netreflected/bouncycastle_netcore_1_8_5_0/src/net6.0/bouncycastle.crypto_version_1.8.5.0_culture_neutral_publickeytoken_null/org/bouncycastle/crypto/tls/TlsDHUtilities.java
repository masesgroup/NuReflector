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

package org.bouncycastle.crypto.tls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.crypto.parameters.DHParameters;
import org.bouncycastle.crypto.parameters.DHPublicKeyParameters;
import org.bouncycastle.crypto.parameters.DHPrivateKeyParameters;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.security.SecureRandom;
import system.io.Stream;
import org.bouncycastle.crypto.tls.TlsDHVerifier;
import org.bouncycastle.crypto.tls.TlsDHVerifierImplementation;
import org.bouncycastle.math.BigInteger;


/**
 * The base .NET class managing Org.BouncyCastle.Crypto.Tls.TlsDHUtilities, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Tls.TlsDHUtilities" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Tls.TlsDHUtilities</a>
 */
public class TlsDHUtilities extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crypto.Tls.TlsDHUtilities
     */
    public static final String className = "Org.BouncyCastle.Crypto.Tls.TlsDHUtilities";
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
    public TlsDHUtilities(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TlsDHUtilities}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TlsDHUtilities} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TlsDHUtilities cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TlsDHUtilities(from.getJCOInstance());
    }

    // Constructors section
    
    public TlsDHUtilities() throws Throwable {
    }

    
    // Methods section
    
    public static boolean AreCompatibleParameters(DHParameters a, DHParameters b) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("AreCompatibleParameters", a == null ? null : a.getJCOInstance(), b == null ? null : b.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsDheCipherSuites(int[] cipherSuites) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsDheCipherSuites", (java.lang.Object)cipherSuites);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsDheCipherSuites(JCORefOut dupParam0) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsDheCipherSuites", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDheCipherSuite(int cipherSuite) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDheCipherSuite", cipherSuite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ReadNegotiatedDheGroupsServerExtension(byte[] extensionData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("ReadNegotiatedDheGroupsServerExtension", (java.lang.Object)extensionData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ReadNegotiatedDheGroupsServerExtension(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("ReadNegotiatedDheGroupsServerExtension", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] CalculateDHBasicAgreement(DHPublicKeyParameters publicKey, DHPrivateKeyParameters privateKey) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CalculateDHBasicAgreement", publicKey == null ? null : publicKey.getJCOInstance(), privateKey == null ? null : privateKey.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCalculateDHBasicAgreement = 0; indexCalculateDHBasicAgreement < resultingArrayList.size(); indexCalculateDHBasicAgreement++ ) {
				resultingArray[indexCalculateDHBasicAgreement] = (byte)resultingArrayList.get(indexCalculateDHBasicAgreement);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] CreateNegotiatedDheGroupsClientExtension(byte[] dheGroups) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CreateNegotiatedDheGroupsClientExtension", (java.lang.Object)dheGroups);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateNegotiatedDheGroupsClientExtension = 0; indexCreateNegotiatedDheGroupsClientExtension < resultingArrayList.size(); indexCreateNegotiatedDheGroupsClientExtension++ ) {
				resultingArray[indexCreateNegotiatedDheGroupsClientExtension] = (byte)resultingArrayList.get(indexCreateNegotiatedDheGroupsClientExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] CreateNegotiatedDheGroupsClientExtension(JCORefOut dupParam0) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CreateNegotiatedDheGroupsClientExtension", (java.lang.Object)dupParam0.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateNegotiatedDheGroupsClientExtension = 0; indexCreateNegotiatedDheGroupsClientExtension < resultingArrayList.size(); indexCreateNegotiatedDheGroupsClientExtension++ ) {
				resultingArray[indexCreateNegotiatedDheGroupsClientExtension] = (byte)resultingArrayList.get(indexCreateNegotiatedDheGroupsClientExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] CreateNegotiatedDheGroupsServerExtension(byte dheGroup) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CreateNegotiatedDheGroupsServerExtension", dheGroup);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateNegotiatedDheGroupsServerExtension = 0; indexCreateNegotiatedDheGroupsServerExtension < resultingArrayList.size(); indexCreateNegotiatedDheGroupsServerExtension++ ) {
				resultingArray[indexCreateNegotiatedDheGroupsServerExtension] = (byte)resultingArrayList.get(indexCreateNegotiatedDheGroupsServerExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetNegotiatedDheGroupsClientExtension(IDictionary extensions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetNegotiatedDheGroupsClientExtension", extensions == null ? null : extensions.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetNegotiatedDheGroupsClientExtension = 0; indexGetNegotiatedDheGroupsClientExtension < resultingArrayList.size(); indexGetNegotiatedDheGroupsClientExtension++ ) {
				resultingArray[indexGetNegotiatedDheGroupsClientExtension] = (byte)resultingArrayList.get(indexGetNegotiatedDheGroupsClientExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] ReadNegotiatedDheGroupsClientExtension(byte[] extensionData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("ReadNegotiatedDheGroupsClientExtension", (java.lang.Object)extensionData);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexReadNegotiatedDheGroupsClientExtension = 0; indexReadNegotiatedDheGroupsClientExtension < resultingArrayList.size(); indexReadNegotiatedDheGroupsClientExtension++ ) {
				resultingArray[indexReadNegotiatedDheGroupsClientExtension] = (byte)resultingArrayList.get(indexReadNegotiatedDheGroupsClientExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] ReadNegotiatedDheGroupsClientExtension(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("ReadNegotiatedDheGroupsClientExtension", (java.lang.Object)dupParam0.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexReadNegotiatedDheGroupsClientExtension = 0; indexReadNegotiatedDheGroupsClientExtension < resultingArrayList.size(); indexReadNegotiatedDheGroupsClientExtension++ ) {
				resultingArray[indexReadNegotiatedDheGroupsClientExtension] = (byte)resultingArrayList.get(indexReadNegotiatedDheGroupsClientExtension);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short GetNegotiatedDheGroupsServerExtension(IDictionary extensions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("GetNegotiatedDheGroupsServerExtension", extensions == null ? null : extensions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AsymmetricCipherKeyPair GenerateDHKeyPair(SecureRandom random, DHParameters dhParams) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateDHKeyPair = (JCObject)classType.Invoke("GenerateDHKeyPair", random == null ? null : random.getJCOInstance(), dhParams == null ? null : dhParams.getJCOInstance());
            return new AsymmetricCipherKeyPair(objGenerateDHKeyPair);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DHParameters GetParametersForDHEGroup(short dheGroup) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetParametersForDHEGroup = (JCObject)classType.Invoke("GetParametersForDHEGroup", dheGroup);
            return new DHParameters(objGetParametersForDHEGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DHParameters ReadDHParameters(Stream input) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.EndOfStreamException, system.FormatException, system.ArithmeticException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReadDHParameters = (JCObject)classType.Invoke("ReadDHParameters", input == null ? null : input.getJCOInstance());
            return new DHParameters(objReadDHParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DHParameters ReceiveDHParameters(TlsDHVerifier dhVerifier, Stream input) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.io.EndOfStreamException, system.FormatException, system.ArithmeticException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReceiveDHParameters = (JCObject)classType.Invoke("ReceiveDHParameters", dhVerifier == null ? null : dhVerifier.getJCOInstance(), input == null ? null : input.getJCOInstance());
            return new DHParameters(objReceiveDHParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DHPrivateKeyParameters GenerateEphemeralClientKeyExchange(SecureRandom random, DHParameters dhParams, Stream output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateEphemeralClientKeyExchange = (JCObject)classType.Invoke("GenerateEphemeralClientKeyExchange", random == null ? null : random.getJCOInstance(), dhParams == null ? null : dhParams.getJCOInstance(), output == null ? null : output.getJCOInstance());
            return new DHPrivateKeyParameters(objGenerateEphemeralClientKeyExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DHPrivateKeyParameters GenerateEphemeralServerKeyExchange(SecureRandom random, DHParameters dhParams, Stream output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateEphemeralServerKeyExchange = (JCObject)classType.Invoke("GenerateEphemeralServerKeyExchange", random == null ? null : random.getJCOInstance(), dhParams == null ? null : dhParams.getJCOInstance(), output == null ? null : output.getJCOInstance());
            return new DHPrivateKeyParameters(objGenerateEphemeralServerKeyExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger ReadDHParameter(Stream input) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.io.EndOfStreamException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReadDHParameter = (JCObject)classType.Invoke("ReadDHParameter", input == null ? null : input.getJCOInstance());
            return new BigInteger(objReadDHParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddNegotiatedDheGroupsClientExtension(IDictionary extensions, byte[] dheGroups) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddNegotiatedDheGroupsClientExtension", extensions == null ? null : extensions.getJCOInstance(), dheGroups);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddNegotiatedDheGroupsClientExtension(IDictionary dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddNegotiatedDheGroupsClientExtension", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddNegotiatedDheGroupsServerExtension(IDictionary extensions, byte dheGroup) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.crypto.tls.TlsFatalAlert {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddNegotiatedDheGroupsServerExtension", extensions == null ? null : extensions.getJCOInstance(), dheGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteDHParameter(BigInteger x, Stream output) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteDHParameter", x == null ? null : x.getJCOInstance(), output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteDHParameters(DHParameters dhParameters, Stream output) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteDHParameters", dhParameters == null ? null : dhParameters.getJCOInstance(), output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}