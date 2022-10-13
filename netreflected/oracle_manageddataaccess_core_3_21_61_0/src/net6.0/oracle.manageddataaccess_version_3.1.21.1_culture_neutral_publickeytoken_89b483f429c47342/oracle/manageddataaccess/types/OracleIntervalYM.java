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

package oracle.manageddataaccess.types;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import oracle.manageddataaccess.types.OracleIntervalYM;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.XmlSchema;
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.xml.serialization.IXmlSerializable;
import system.xml.serialization.IXmlSerializableImplementation;


/**
 * The base .NET class managing Oracle.ManagedDataAccess.Types.OracleIntervalYM, Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Types.OracleIntervalYM" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Types.OracleIntervalYM</a>
 */
public class OracleIntervalYM extends ValueType implements system.xml.serialization.IXmlSerializable {
    /**
     * Fully assembly qualified name: Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.ManagedDataAccess
     */
    public static final String assemblyShortName = "Oracle.ManagedDataAccess";
    /**
     * Qualified class name: Oracle.ManagedDataAccess.Types.OracleIntervalYM
     */
    public static final String className = "Oracle.ManagedDataAccess.Types.OracleIntervalYM";
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
    public OracleIntervalYM(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OracleIntervalYM}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OracleIntervalYM} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OracleIntervalYM cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OracleIntervalYM(from.getJCOInstance());
    }

    // Constructors section
    
    public OracleIntervalYM() throws Throwable {
    }

    public OracleIntervalYM(byte[] binData) throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)binData));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleIntervalYM(double totalYears) throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(totalYears));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleIntervalYM(int years, int months) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(years, months));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleIntervalYM(long totalMonths) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(totalMonths));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleIntervalYM(java.lang.String intervalStr) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(intervalStr));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static boolean Equals(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Equals", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThan(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThan", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GreaterThanOrEqual(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GreaterThanOrEqual", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThan(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThan", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean LessThanOrEqual(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LessThanOrEqual", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean NotEquals(OracleIntervalYM value1, OracleIntervalYM value2) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("NotEquals", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject obj) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleIntervalYM Parse(java.lang.String intervalStr) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", intervalStr);
            return new OracleIntervalYM(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleIntervalYM SetPrecision(OracleIntervalYM value1, int yearPrecision) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.RankException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, oracle.manageddataaccess.types.OracleNullValueException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetPrecision = (JCObject)classType.Invoke("SetPrecision", value1 == null ? null : value1.getJCOInstance(), yearPrecision);
            return new OracleIntervalYM(objSetPrecision);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlQualifiedName GetXsdType(XmlSchemaSet schemaSet) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetXsdType = (JCObject)classType.Invoke("GetXsdType", schemaSet == null ? null : schemaSet.getJCOInstance());
            return new XmlQualifiedName(objGetXsdType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public XmlSchema GetSchema() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void ReadXml(XmlReader reader) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void WriteXml(XmlWriter writer) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getBinData() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, oracle.manageddataaccess.types.OracleNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("BinData");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexBinData = 0; indexBinData < resultingArrayList.size(); indexBinData++ ) {
				resultingArray[indexBinData] = (byte)resultingArrayList.get(indexBinData);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalYears() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, oracle.manageddataaccess.types.OracleNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalYears");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMonths() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, oracle.manageddataaccess.types.OracleNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Months");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getYears() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, oracle.manageddataaccess.types.OracleNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Years");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getValue() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, oracle.manageddataaccess.types.OracleTypeException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, oracle.manageddataaccess.types.OracleNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}