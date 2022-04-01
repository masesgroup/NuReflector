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

package org.bouncycastle.math.ec.rfc7748;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.UInt32;


/**
 * The base .NET class managing Org.BouncyCastle.Math.EC.Rfc7748.X448Field, BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.Rfc7748.X448Field" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.Rfc7748.X448Field</a>
 */
public class X448Field extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.5.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Math.EC.Rfc7748.X448Field
     */
    public static final String className = "Org.BouncyCastle.Math.EC.Rfc7748.X448Field";
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
    public X448Field(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link X448Field}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link X448Field} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static X448Field cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new X448Field(from.getJCOInstance());
    }

    // Constructors section
    
    public X448Field() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsZeroVar(UInt32[] x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsZeroVar", (java.lang.Object)toObjectFromArray(x));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SqrtRatioVar(UInt32[] u, UInt32[] v, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SqrtRatioVar", toObjectFromArray(u), toObjectFromArray(v), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32[] Create() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<UInt32> resultingArrayList = new ArrayList<UInt32>();
            JCObject resultingObjects = (JCObject)classType.Invoke("Create");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new UInt32(resultingObject));
            }
            UInt32[] resultingArray = new UInt32[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Add(UInt32[] x, UInt32[] y, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Add", toObjectFromArray(x), toObjectFromArray(y), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddOne(UInt32[] z, int zOff) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddOne", toObjectFromArray(z), zOff);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddOne(UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddOne", (java.lang.Object)toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Carry(UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Carry", (java.lang.Object)toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CNegate(int negate, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CNegate", negate, toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Copy(UInt32[] x, int xOff, UInt32[] z, int zOff) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Copy", toObjectFromArray(x), xOff, toObjectFromArray(z), zOff);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CSwap(int swap, UInt32[] a, UInt32[] b) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CSwap", swap, toObjectFromArray(a), toObjectFromArray(b));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Decode(byte[] x, int xOff, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Decode", x, xOff, toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Decode(JCORefOut dupParam0, int dupParam1, UInt32[] dupParam2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Decode", dupParam0.getJCRefOut(), dupParam1, toObjectFromArray(dupParam2));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Encode(UInt32[] x, byte[] z, int zOff) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Encode", toObjectFromArray(x), z, zOff);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Encode(UInt32[] dupParam0, JCORefOut dupParam1, int dupParam2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Encode", toObjectFromArray(dupParam0), dupParam1.getJCRefOut(), dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Inv(UInt32[] x, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Inv", toObjectFromArray(x), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Mul(UInt32[] x, UInt32 y, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Mul", toObjectFromArray(x), y == null ? null : y.getJCOInstance(), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Mul(UInt32[] x, UInt32[] y, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Mul", toObjectFromArray(x), toObjectFromArray(y), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Negate(UInt32[] x, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Negate", toObjectFromArray(x), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Normalize(UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Normalize", (java.lang.Object)toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void One(UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("One", (java.lang.Object)toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sqr(UInt32[] x, int n, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Sqr", toObjectFromArray(x), n, toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sqr(UInt32[] x, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Sqr", toObjectFromArray(x), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sub(UInt32[] x, UInt32[] y, UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Sub", toObjectFromArray(x), toObjectFromArray(y), toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Zero(UInt32[] z) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Zero", (java.lang.Object)toObjectFromArray(z));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}