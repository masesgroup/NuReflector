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

package org.bouncycastle.crypto.agreement.jpake;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.math.BigInteger;
import org.bouncycastle.crypto.IDigest;
import org.bouncycastle.crypto.IDigestImplementation;
import org.bouncycastle.security.SecureRandom;


/**
 * The base .NET class managing Org.BouncyCastle.Crypto.Agreement.JPake.JPakeUtilities, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Agreement.JPake.JPakeUtilities" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Agreement.JPake.JPakeUtilities</a>
 */
public class JPakeUtilities extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crypto.Agreement.JPake.JPakeUtilities
     */
    public static final String className = "Org.BouncyCastle.Crypto.Agreement.JPake.JPakeUtilities";
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
    public JPakeUtilities(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link JPakeUtilities}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link JPakeUtilities} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static JPakeUtilities cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new JPakeUtilities(from.getJCOInstance());
    }

    // Constructors section
    
    public JPakeUtilities() throws Throwable {
    }

    
    // Methods section
    
    public static BigInteger CalculateA(BigInteger p, BigInteger q, BigInteger gA, BigInteger x2s) throws Throwable, system.ArithmeticException, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateA = (JCObject)classType.Invoke("CalculateA", p == null ? null : p.getJCOInstance(), q == null ? null : q.getJCOInstance(), gA == null ? null : gA.getJCOInstance(), x2s == null ? null : x2s.getJCOInstance());
            return new BigInteger(objCalculateA);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateGA(BigInteger p, BigInteger gx1, BigInteger gx3, BigInteger gx4) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateGA = (JCObject)classType.Invoke("CalculateGA", p == null ? null : p.getJCOInstance(), gx1 == null ? null : gx1.getJCOInstance(), gx3 == null ? null : gx3.getJCOInstance(), gx4 == null ? null : gx4.getJCOInstance());
            return new BigInteger(objCalculateGA);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateGx(BigInteger p, BigInteger g, BigInteger x) throws Throwable, system.ArithmeticException, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateGx = (JCObject)classType.Invoke("CalculateGx", p == null ? null : p.getJCOInstance(), g == null ? null : g.getJCOInstance(), x == null ? null : x.getJCOInstance());
            return new BigInteger(objCalculateGx);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateKeyingMaterial(BigInteger p, BigInteger q, BigInteger gx4, BigInteger x2, BigInteger s, BigInteger B) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateKeyingMaterial = (JCObject)classType.Invoke("CalculateKeyingMaterial", p == null ? null : p.getJCOInstance(), q == null ? null : q.getJCOInstance(), gx4 == null ? null : gx4.getJCOInstance(), x2 == null ? null : x2.getJCOInstance(), s == null ? null : s.getJCOInstance(), B == null ? null : B.getJCOInstance());
            return new BigInteger(objCalculateKeyingMaterial);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateMacTag(java.lang.String participantId, java.lang.String partnerParticipantId, BigInteger gx1, BigInteger gx2, BigInteger gx3, BigInteger gx4, BigInteger keyingMaterial, IDigest digest) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateMacTag = (JCObject)classType.Invoke("CalculateMacTag", participantId, partnerParticipantId, gx1 == null ? null : gx1.getJCOInstance(), gx2 == null ? null : gx2.getJCOInstance(), gx3 == null ? null : gx3.getJCOInstance(), gx4 == null ? null : gx4.getJCOInstance(), keyingMaterial == null ? null : keyingMaterial.getJCOInstance(), digest == null ? null : digest.getJCOInstance());
            return new BigInteger(objCalculateMacTag);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateS(char[] password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateS = (JCObject)classType.Invoke("CalculateS", (java.lang.Object)password);
            return new BigInteger(objCalculateS);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateS(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateS = (JCObject)classType.Invoke("CalculateS", (java.lang.Object)dupParam0.getJCRefOut());
            return new BigInteger(objCalculateS);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger CalculateX2s(BigInteger q, BigInteger x2, BigInteger s) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateX2s = (JCObject)classType.Invoke("CalculateX2s", q == null ? null : q.getJCOInstance(), x2 == null ? null : x2.getJCOInstance(), s == null ? null : s.getJCOInstance());
            return new BigInteger(objCalculateX2s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger GenerateX1(BigInteger q, SecureRandom random) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateX1 = (JCObject)classType.Invoke("GenerateX1", q == null ? null : q.getJCOInstance(), random == null ? null : random.getJCOInstance());
            return new BigInteger(objGenerateX1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger GenerateX2(BigInteger q, SecureRandom random) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateX2 = (JCObject)classType.Invoke("GenerateX2", q == null ? null : q.getJCOInstance(), random == null ? null : random.getJCOInstance());
            return new BigInteger(objGenerateX2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BigInteger[] CalculateZeroKnowledgeProof(BigInteger p, BigInteger q, BigInteger g, BigInteger gx, BigInteger x, java.lang.String participantId, IDigest digest, SecureRandom random) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ArithmeticException, system.InvalidOperationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<BigInteger> resultingArrayList = new ArrayList<BigInteger>();
            JCObject resultingObjects = (JCObject)classType.Invoke("CalculateZeroKnowledgeProof", p == null ? null : p.getJCOInstance(), q == null ? null : q.getJCOInstance(), g == null ? null : g.getJCOInstance(), gx == null ? null : gx.getJCOInstance(), x == null ? null : x.getJCOInstance(), participantId, digest == null ? null : digest.getJCOInstance(), random == null ? null : random.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new BigInteger(resultingObject));
            }
            BigInteger[] resultingArray = new BigInteger[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateGa(BigInteger ga) throws Throwable, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateGa", ga == null ? null : ga.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateGx4(BigInteger gx4) throws Throwable, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateGx4", gx4 == null ? null : gx4.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateMacTag(java.lang.String participantId, java.lang.String partnerParticipantId, BigInteger gx1, BigInteger gx2, BigInteger gx3, BigInteger gx4, BigInteger keyingMaterial, IDigest digest, BigInteger partnerMacTag) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateMacTag", participantId, partnerParticipantId, gx1 == null ? null : gx1.getJCOInstance(), gx2 == null ? null : gx2.getJCOInstance(), gx3 == null ? null : gx3.getJCOInstance(), gx4 == null ? null : gx4.getJCOInstance(), keyingMaterial == null ? null : keyingMaterial.getJCOInstance(), digest == null ? null : digest.getJCOInstance(), partnerMacTag == null ? null : partnerMacTag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateNotNull(NetObject obj, java.lang.String description) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateNotNull", obj == null ? null : obj.getJCOInstance(), description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateParticipantIdsDiffer(java.lang.String participantId1, java.lang.String participantId2) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateParticipantIdsDiffer", participantId1, participantId2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateParticipantIdsEqual(java.lang.String expectedParticipantId, java.lang.String actualParticipantId) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateParticipantIdsEqual", expectedParticipantId, actualParticipantId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ValidateZeroKnowledgeProof(BigInteger p, BigInteger q, BigInteger g, BigInteger gx, BigInteger[] zeroKnowledgeProof, java.lang.String participantId, IDigest digest) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.ArithmeticException, org.bouncycastle.crypto.CryptoException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ValidateZeroKnowledgeProof", p == null ? null : p.getJCOInstance(), q == null ? null : q.getJCOInstance(), g == null ? null : g.getJCOInstance(), gx == null ? null : gx.getJCOInstance(), toObjectFromArray(zeroKnowledgeProof), participantId, digest == null ? null : digest.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}