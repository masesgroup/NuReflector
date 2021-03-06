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

package mongodb.bson;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.Single;
import system.Decimal;
import system.UInt32;
import system.UInt64;
import mongodb.bson.Decimal128;
import system.SByte;
import system.UInt16;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.DateTime;
import system.TypeCode;
import system.IConvertible;
import system.IConvertibleImplementation;


/**
 * The base .NET class managing MongoDB.Bson.Decimal128, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Decimal128" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Decimal128</a>
 */
public class Decimal128 extends ValueType implements system.IConvertible {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.Decimal128
     */
    public static final String className = "MongoDB.Bson.Decimal128";
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
    public Decimal128(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Decimal128}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Decimal128} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Decimal128 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Decimal128(from.getJCOInstance());
    }

    // Constructors section
    
    public Decimal128() throws Throwable {
    }

    public Decimal128(double value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(int value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(long value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(Single value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(Decimal value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(UInt32 value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128(UInt64 value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(Decimal128 other) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(Decimal128 x, Decimal128 y) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsInfinity(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsInfinity", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsNaN(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsNaN", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsNegative(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsNegative", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsNegativeInfinity(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsNegativeInfinity", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPositiveInfinity(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPositiveInfinity", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsQNaN(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsQNaN", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsSNaN(Decimal128 d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSNaN", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsZero(Decimal128 d) throws Throwable, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsZero", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean TryParse(java.lang.String s, JCORefOut<Decimal128> result) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.ObjectDisposedException, system.RankException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.text.regularexpressions.RegexMatchTimeoutException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("TryParse", s, result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ToByte(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("ToByte", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToDouble(Decimal128 d) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.NullReferenceException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("ToDouble", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short GetExponent(Decimal128 d) throws Throwable, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("GetExponent", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ToInt16(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("ToInt16", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Compare(Decimal128 x, Decimal128 y) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Compare", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(Decimal128 other) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ToInt32(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ToInt32", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ToInt64(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("ToInt64", d == null ? null : d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 FromComponents(boolean isNegative, short exponent, UInt64 significandHighBits, UInt64 significandLowBits) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromComponents = (JCObject)classType.Invoke("FromComponents", isNegative, exponent, significandHighBits == null ? null : significandHighBits.getJCOInstance(), significandLowBits == null ? null : significandLowBits.getJCOInstance());
            return new Decimal128(objFromComponents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 FromIEEEBits(UInt64 highBits, UInt64 lowBits) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromIEEEBits = (JCObject)classType.Invoke("FromIEEEBits", highBits == null ? null : highBits.getJCOInstance(), lowBits == null ? null : lowBits.getJCOInstance());
            return new Decimal128(objFromIEEEBits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 Negate(Decimal128 x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", x == null ? null : x.getJCOInstance());
            return new Decimal128(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", s);
            return new Decimal128(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SByte ToSByte(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToSByte = (JCObject)classType.Invoke("ToSByte", d == null ? null : d.getJCOInstance());
            return new SByte(objToSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single ToSingle(Decimal128 d) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.NullReferenceException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToSingle = (JCObject)classType.Invoke("ToSingle", d == null ? null : d.getJCOInstance());
            return new Single(objToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal ToDecimal(Decimal128 d) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToDecimal = (JCObject)classType.Invoke("ToDecimal", d == null ? null : d.getJCOInstance());
            return new Decimal(objToDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 ToUInt16(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt16 = (JCObject)classType.Invoke("ToUInt16", d == null ? null : d.getJCOInstance());
            return new UInt16(objToUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 ToUInt32(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt32 = (JCObject)classType.Invoke("ToUInt32", d == null ? null : d.getJCOInstance());
            return new UInt32(objToUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 GetIEEEHighBits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIEEEHighBits = (JCObject)classInstance.Invoke("GetIEEEHighBits");
            return new UInt64(objGetIEEEHighBits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 GetIEEELowBits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIEEELowBits = (JCObject)classInstance.Invoke("GetIEEELowBits");
            return new UInt64(objGetIEEELowBits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 GetSignificandHighBits(Decimal128 d) throws Throwable, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSignificandHighBits = (JCObject)classType.Invoke("GetSignificandHighBits", d == null ? null : d.getJCOInstance());
            return new UInt64(objGetSignificandHighBits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 GetSignificandLowBits(Decimal128 d) throws Throwable, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSignificandLowBits = (JCObject)classType.Invoke("GetSignificandLowBits", d == null ? null : d.getJCOInstance());
            return new UInt64(objGetSignificandLowBits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 ToUInt64(Decimal128 d) throws Throwable, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt64 = (JCObject)classType.Invoke("ToUInt64", d == null ? null : d.getJCOInstance());
            return new UInt64(objToUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean ToBoolean(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public byte ToByte(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public char ToChar(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public double ToDouble(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public short ToInt16(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public int ToInt32(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public long ToInt64(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public SByte ToSByte(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public Single ToSingle(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public DateTime ToDateTime(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public Decimal ToDecimal(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject ToType(NetType conversionType, IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String ToString(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public TypeCode GetTypeCode() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public UInt16 ToUInt16(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public UInt32 ToUInt32(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertible method available in IConvertible to obtain an object with an invocable method
     */
    @Deprecated 
    public UInt64 ToUInt64(IFormatProvider provider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertible to obtain the full interface.");
    }


    
    // Properties section
    
    public static Decimal128 getMaxValue() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MaxValue");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getMinValue() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MinValue");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getNegativeInfinity() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("NegativeInfinity");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getOne() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("One");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getPositiveInfinity() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("PositiveInfinity");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getQNaN() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("QNaN");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getSNaN() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SNaN");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal128 getZero() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Zero");
            return new Decimal128(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}