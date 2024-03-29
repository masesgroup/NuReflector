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
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;


/**
 * The base .NET class managing Org.BouncyCastle.Math.EC.ECPoint, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.ECPoint" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Math.EC.ECPoint</a>
 */
public class ECPoint extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Math.EC.ECPoint
     */
    public static final String className = "Org.BouncyCastle.Math.EC.ECPoint";
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
    public ECPoint(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ECPoint}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ECPoint} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ECPoint cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ECPoint(from.getJCOInstance());
    }

    // Constructors section
    
    public ECPoint() throws Throwable {
    }

    
    // Methods section
    
    public boolean Equals(ECPoint other) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsNormalized() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsNormalized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValid() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsValid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetEncoded() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetEncoded");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetEncoded = 0; indexGetEncoded < resultingArrayList.size(); indexGetEncoded++ ) {
				resultingArray[indexGetEncoded] = (byte)resultingArrayList.get(indexGetEncoded);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetEncoded(boolean compressed) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetEncoded", compressed);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetEncoded = 0; indexGetEncoded < resultingArrayList.size(); indexGetEncoded++ ) {
				resultingArray[indexGetEncoded] = (byte)resultingArrayList.get(indexGetEncoded);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement GetZCoord(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetZCoord = (JCObject)classInstance.Invoke("GetZCoord", index);
            return new ECFieldElement(objGetZCoord);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement[] GetZCoords() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ECFieldElement> resultingArrayList = new ArrayList<ECFieldElement>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetZCoords");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ECFieldElement(resultingObject));
            }
            ECFieldElement[] resultingArray = new ECFieldElement[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Add(ECPoint b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", b == null ? null : b.getJCOInstance());
            return new ECPoint(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint GetDetachedPoint() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDetachedPoint = (JCObject)classInstance.Invoke("GetDetachedPoint");
            return new ECPoint(objGetDetachedPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Multiply(BigInteger b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMultiply = (JCObject)classInstance.Invoke("Multiply", b == null ? null : b.getJCOInstance());
            return new ECPoint(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Negate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNegate = (JCObject)classInstance.Invoke("Negate");
            return new ECPoint(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Normalize() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNormalize = (JCObject)classInstance.Invoke("Normalize");
            return new ECPoint(objNormalize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint ScaleX(ECFieldElement scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objScaleX = (JCObject)classInstance.Invoke("ScaleX", scale == null ? null : scale.getJCOInstance());
            return new ECPoint(objScaleX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint ScaleXNegateY(ECFieldElement scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objScaleXNegateY = (JCObject)classInstance.Invoke("ScaleXNegateY", scale == null ? null : scale.getJCOInstance());
            return new ECPoint(objScaleXNegateY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint ScaleY(ECFieldElement scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objScaleY = (JCObject)classInstance.Invoke("ScaleY", scale == null ? null : scale.getJCOInstance());
            return new ECPoint(objScaleY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint ScaleYNegateX(ECFieldElement scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objScaleYNegateX = (JCObject)classInstance.Invoke("ScaleYNegateX", scale == null ? null : scale.getJCOInstance());
            return new ECPoint(objScaleYNegateX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Subtract(ECPoint b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSubtract = (JCObject)classInstance.Invoke("Subtract", b == null ? null : b.getJCOInstance());
            return new ECPoint(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint ThreeTimes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objThreeTimes = (JCObject)classInstance.Invoke("ThreeTimes");
            return new ECPoint(objThreeTimes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint TimesPow2(int e) throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTimesPow2 = (JCObject)classInstance.Invoke("TimesPow2", e);
            return new ECPoint(objTimesPow2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint Twice() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTwice = (JCObject)classInstance.Invoke("Twice");
            return new ECPoint(objTwice);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECPoint TwicePlus(ECPoint b) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTwicePlus = (JCObject)classInstance.Invoke("TwicePlus", b == null ? null : b.getJCOInstance());
            return new ECPoint(objTwicePlus);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsCompressed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompressed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInfinity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInfinity");
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

    public ECFieldElement getAffineXCoord() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AffineXCoord");
            return new ECFieldElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement getAffineYCoord() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AffineYCoord");
            return new ECFieldElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement getXCoord() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XCoord");
            return new ECFieldElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECFieldElement getYCoord() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("YCoord");
            return new ECFieldElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}