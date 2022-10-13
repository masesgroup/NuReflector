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

package org.bouncycastle.math.ec;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.math.ec.AbstractF2mFieldElement;
import org.bouncycastle.math.BigInteger;
import org.bouncycastle.math.ec.F2mFieldElement;
import org.bouncycastle.math.ec.ECFieldElement;


/**
 * The base .NET class managing Org.BouncyCastle.Math.EC.F2mFieldElement, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.F2mFieldElement" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.F2mFieldElement</a>
 */
public class F2mFieldElement extends AbstractF2mFieldElement  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Math.EC.F2mFieldElement
     */
    public static final String className = "Org.BouncyCastle.Math.EC.F2mFieldElement";
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
    public F2mFieldElement(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link F2mFieldElement}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link F2mFieldElement} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static F2mFieldElement cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new F2mFieldElement(from.getJCOInstance());
    }

    // Constructors section
    
    public F2mFieldElement() throws Throwable {
    }

    public F2mFieldElement(int m, int k1, int k2, int k3, BigInteger x) throws Throwable, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(m, k1, k2, k3, x == null ? null : x.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public F2mFieldElement(int m, int k, BigInteger x) throws Throwable, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(m, k, x == null ? null : x.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(F2mFieldElement other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TestBitZero() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TestBitZero");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BigInteger ToBigInteger() throws Throwable, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToBigInteger = (JCObject)classInstance.Invoke("ToBigInteger");
            return new BigInteger(objToBigInteger);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Add(ECFieldElement b) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", b == null ? null : b.getJCOInstance());
            return new ECFieldElement(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement AddOne() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddOne = (JCObject)classInstance.Invoke("AddOne");
            return new ECFieldElement(objAddOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Divide(ECFieldElement b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDivide = (JCObject)classInstance.Invoke("Divide", b == null ? null : b.getJCOInstance());
            return new ECFieldElement(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Invert() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvert = (JCObject)classInstance.Invoke("Invert");
            return new ECFieldElement(objInvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Multiply(ECFieldElement b) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMultiply = (JCObject)classInstance.Invoke("Multiply", b == null ? null : b.getJCOInstance());
            return new ECFieldElement(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement MultiplyMinusProduct(ECFieldElement b, ECFieldElement x, ECFieldElement y) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMultiplyMinusProduct = (JCObject)classInstance.Invoke("MultiplyMinusProduct", b == null ? null : b.getJCOInstance(), x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new ECFieldElement(objMultiplyMinusProduct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement MultiplyPlusProduct(ECFieldElement b, ECFieldElement x, ECFieldElement y) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMultiplyPlusProduct = (JCObject)classInstance.Invoke("MultiplyPlusProduct", b == null ? null : b.getJCOInstance(), x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new ECFieldElement(objMultiplyPlusProduct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Negate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNegate = (JCObject)classInstance.Invoke("Negate");
            return new ECFieldElement(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Sqrt() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSqrt = (JCObject)classInstance.Invoke("Sqrt");
            return new ECFieldElement(objSqrt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Square() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSquare = (JCObject)classInstance.Invoke("Square");
            return new ECFieldElement(objSquare);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement SquareMinusProduct(ECFieldElement x, ECFieldElement y) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSquareMinusProduct = (JCObject)classInstance.Invoke("SquareMinusProduct", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new ECFieldElement(objSquareMinusProduct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement SquarePlusProduct(ECFieldElement x, ECFieldElement y) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSquarePlusProduct = (JCObject)classInstance.Invoke("SquarePlusProduct", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new ECFieldElement(objSquarePlusProduct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement SquarePow(int pow) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSquarePow = (JCObject)classInstance.Invoke("SquarePow", pow);
            return new ECFieldElement(objSquarePow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement Subtract(ECFieldElement b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSubtract = (JCObject)classInstance.Invoke("Subtract", b == null ? null : b.getJCOInstance());
            return new ECFieldElement(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CheckFieldElements(ECFieldElement a, ECFieldElement b) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CheckFieldElements", a == null ? null : a.getJCOInstance(), b == null ? null : b.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getK1() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("K1");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getK2() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("K2");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getK3() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("K3");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getM() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("M");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRepresentation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Representation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}