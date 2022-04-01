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

package microsoft.entityframeworkcore;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.DbFunctions;
import system.net.IPAddress;
import system.net.networkinformation.PhysicalAddress;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.NpgsqlNetworkDbFunctionsExtensions, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.NpgsqlNetworkDbFunctionsExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.NpgsqlNetworkDbFunctionsExtensions</a>
 */
public class NpgsqlNetworkDbFunctionsExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.NpgsqlNetworkDbFunctionsExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.NpgsqlNetworkDbFunctionsExtensions";
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
    public NpgsqlNetworkDbFunctionsExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NpgsqlNetworkDbFunctionsExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NpgsqlNetworkDbFunctionsExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NpgsqlNetworkDbFunctionsExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NpgsqlNetworkDbFunctionsExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public NpgsqlNetworkDbFunctionsExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean ContainedBy(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainedBy", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainedByOrEqual(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainedByOrEqual", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Contains(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Contains", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsOrContainedBy(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsOrContainedBy", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsOrEqual(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsOrEqual", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThan(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThan", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThan(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThan", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThanOrEqual(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThanOrEqual", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThanOrEqual(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThanOrEqual", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThan(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThan", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThan(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThan", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThanOrEqual(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThanOrEqual", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThanOrEqual(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThanOrEqual", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SameFamily(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SameFamily", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Family(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Family", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int MaskLength(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("MaskLength", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Subtract(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Subtract", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress Add(DbFunctions _, IPAddress inet, int value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), value);
            return new IPAddress(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress BitwiseAnd(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseAnd = (JCObject)classType.Invoke("BitwiseAnd", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
            return new IPAddress(objBitwiseAnd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress BitwiseNot(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseNot = (JCObject)classType.Invoke("BitwiseNot", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
            return new IPAddress(objBitwiseNot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress BitwiseOr(DbFunctions _, IPAddress inet, IPAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseOr = (JCObject)classType.Invoke("BitwiseOr", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), other == null ? null : other.getJCOInstance());
            return new IPAddress(objBitwiseOr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress Broadcast(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBroadcast = (JCObject)classType.Invoke("Broadcast", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
            return new IPAddress(objBroadcast);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress HostMask(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHostMask = (JCObject)classType.Invoke("HostMask", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
            return new IPAddress(objHostMask);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress Netmask(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNetmask = (JCObject)classType.Invoke("Netmask", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
            return new IPAddress(objNetmask);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress SetMaskLength(DbFunctions _, IPAddress inet, int length) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetMaskLength = (JCObject)classType.Invoke("SetMaskLength", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), length);
            return new IPAddress(objSetMaskLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IPAddress Subtract(DbFunctions _, IPAddress inet, int value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance(), value);
            return new IPAddress(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PhysicalAddress BitwiseAnd(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseAnd = (JCObject)classType.Invoke("BitwiseAnd", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
            return new PhysicalAddress(objBitwiseAnd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PhysicalAddress BitwiseNot(DbFunctions _, PhysicalAddress macaddr) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseNot = (JCObject)classType.Invoke("BitwiseNot", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance());
            return new PhysicalAddress(objBitwiseNot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PhysicalAddress BitwiseOr(DbFunctions _, PhysicalAddress macaddr, PhysicalAddress other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseOr = (JCObject)classType.Invoke("BitwiseOr", _ == null ? null : _.getJCOInstance(), macaddr == null ? null : macaddr.getJCOInstance(), other == null ? null : other.getJCOInstance());
            return new PhysicalAddress(objBitwiseOr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PhysicalAddress Set7BitMac8(DbFunctions _, PhysicalAddress macAddress) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSet7BitMac8 = (JCObject)classType.Invoke("Set7BitMac8", _ == null ? null : _.getJCOInstance(), macAddress == null ? null : macAddress.getJCOInstance());
            return new PhysicalAddress(objSet7BitMac8);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PhysicalAddress Truncate(DbFunctions _, PhysicalAddress macAddress) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTruncate = (JCObject)classType.Invoke("Truncate", _ == null ? null : _.getJCOInstance(), macAddress == null ? null : macAddress.getJCOInstance());
            return new PhysicalAddress(objTruncate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Abbreviate(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("Abbreviate", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Host(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("Host", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Text(DbFunctions _, IPAddress inet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("Text", _ == null ? null : _.getJCOInstance(), inet == null ? null : inet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}