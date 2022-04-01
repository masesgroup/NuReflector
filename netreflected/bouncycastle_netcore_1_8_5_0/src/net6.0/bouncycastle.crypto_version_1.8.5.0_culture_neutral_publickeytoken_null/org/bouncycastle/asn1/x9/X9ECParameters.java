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

package org.bouncycastle.asn1.x9;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.asn1.Asn1Encodable;
import org.bouncycastle.asn1.Asn1Sequence;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.BigInteger;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.asn1.Asn1Object;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9Curve;
import org.bouncycastle.asn1.x9.X9FieldID;


/**
 * The base .NET class managing Org.BouncyCastle.Asn1.X9.X9ECParameters, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.X9.X9ECParameters" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Asn1.X9.X9ECParameters</a>
 */
public class X9ECParameters extends Asn1Encodable  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Asn1.X9.X9ECParameters
     */
    public static final String className = "Org.BouncyCastle.Asn1.X9.X9ECParameters";
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
    public X9ECParameters(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link X9ECParameters}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link X9ECParameters} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static X9ECParameters cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new X9ECParameters(from.getJCOInstance());
    }

    // Constructors section
    
    public X9ECParameters() throws Throwable {
    }

    public X9ECParameters(Asn1Sequence seq) throws Throwable, system.FormatException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, org.bouncycastle.asn1.Asn1Exception, system.OutOfMemoryException, org.bouncycastle.asn1.Asn1ParsingException, system.ArithmeticException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(seq == null ? null : seq.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECParameters(ECCurve curve, X9ECPoint g, BigInteger n, BigInteger h, byte[] seed) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(curve == null ? null : curve.getJCOInstance(), g == null ? null : g.getJCOInstance(), n == null ? null : n.getJCOInstance(), h == null ? null : h.getJCOInstance(), seed));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECParameters(ECCurve curve, X9ECPoint g, BigInteger n, BigInteger h) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(curve == null ? null : curve.getJCOInstance(), g == null ? null : g.getJCOInstance(), n == null ? null : n.getJCOInstance(), h == null ? null : h.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECParameters(ECCurve curve, ECPoint g, BigInteger n, BigInteger h, byte[] seed) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(curve == null ? null : curve.getJCOInstance(), g == null ? null : g.getJCOInstance(), n == null ? null : n.getJCOInstance(), h == null ? null : h.getJCOInstance(), seed));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECParameters(ECCurve curve, ECPoint g, BigInteger n, BigInteger h) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(curve == null ? null : curve.getJCOInstance(), g == null ? null : g.getJCOInstance(), n == null ? null : n.getJCOInstance(), h == null ? null : h.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECParameters(ECCurve curve, ECPoint g, BigInteger n) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(curve == null ? null : curve.getJCOInstance(), g == null ? null : g.getJCOInstance(), n == null ? null : n.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public byte[] GetSeed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSeed");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSeed = 0; indexGetSeed < resultingArrayList.size(); indexGetSeed++ ) {
				resultingArray[indexGetSeed] = (byte)resultingArrayList.get(indexGetSeed);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Asn1Object ToAsn1Object() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToAsn1Object = (JCObject)classInstance.Invoke("ToAsn1Object");
            return new Asn1Object(objToAsn1Object);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static X9ECParameters GetInstance(NetObject obj) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, system.OutOfMemoryException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInstance = (JCObject)classType.Invoke("GetInstance", obj == null ? null : obj.getJCOInstance());
            return new X9ECParameters(objGetInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public X9Curve getCurveEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurveEntry");
            return new X9Curve(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9ECPoint getBaseEntry() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseEntry");
            return new X9ECPoint(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X9FieldID getFieldIDEntry() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FieldIDEntry");
            return new X9FieldID(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BigInteger getH() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("H");
            return new BigInteger(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BigInteger getN() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("N");
            return new BigInteger(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECCurve getCurve() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Curve");
            return new ECCurve(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint getG() throws Throwable, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.ArithmeticException, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("G");
            return new ECPoint(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}