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

package firebirdsql.data.firebirdclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbDataReader;
import firebirdsql.data.firebirdclient.FbDataReader;
import system.Single;
import system.data.DataTable;
import system.DateTime;
import system.Decimal;
import system.Guid;
import system.threading.tasks.Task;
import system.threading.tasks.ValueTask;


/**
 * The base .NET class managing FirebirdSql.Data.FirebirdClient.FbDataReader, FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbDataReader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbDataReader</a>
 */
public class FbDataReader extends DbDataReader  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.FirebirdClient.FbDataReader
     */
    public static final String className = "FirebirdSql.Data.FirebirdClient.FbDataReader";
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
    public FbDataReader(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FbDataReader}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FbDataReader} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FbDataReader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FbDataReader(from.getJCOInstance());
    }

    // Constructors section
    
    public FbDataReader() throws Throwable {
    }



    
    // Methods section
    
    public boolean GetBoolean(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetBoolean", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDBNull(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDBNull", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsExpression(FbDataReader r) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsExpression", r == null ? null : r.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean NextResult() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("NextResult");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Read() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Read");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte GetByte(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Invoke("GetByte", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char GetChar(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Invoke("GetChar", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetDouble(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("GetDouble", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetInt16(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("GetInt16", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetInt32(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetInt32", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOrdinal(java.lang.String name) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetOrdinal", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetProviderSpecificValues(NetObject[] values) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetProviderSpecificValues", (java.lang.Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetValues(NetObject[] values) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetValues", (java.lang.Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int i, long dataIndex, byte[] buffer, int bufferIndex, int length) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetBytes", i, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int dupParam0, long dupParam1, JCORefOut dupParam2, int dupParam3, int dupParam4) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetBytes", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3, dupParam4);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int i, long dataIndex, char[] buffer, int bufferIndex, int length) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetChars", i, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int dupParam0, long dupParam1, JCORefOut dupParam2, int dupParam3, int dupParam4) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetChars", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3, dupParam4);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetInt64(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetInt64", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetFloat(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFloat = (JCObject)classInstance.Invoke("GetFloat", i);
            return new Single(objGetFloat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchemaTable() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.data.sqltypes.SqlNullValueException, system.OperationCanceledException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchemaTable = (JCObject)classInstance.Invoke("GetSchemaTable");
            return new DataTable(objGetSchemaTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDateTime(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDateTime = (JCObject)classInstance.Invoke("GetDateTime", i);
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal GetDecimal(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDecimal = (JCObject)classInstance.Invoke("GetDecimal", i);
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid GetGuid(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGuid = (JCObject)classInstance.Invoke("GetGuid", i);
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetProviderSpecificValue(int i) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProviderSpecificValue = (JCObject)classInstance.Invoke("GetProviderSpecificValue", i);
            return new NetObject(objGetProviderSpecificValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int i) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", i);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetDataTypeName(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetDataTypeName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetName(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetString", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CloseAsync() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCloseAsync = (JCObject)classInstance.Invoke("CloseAsync");
            return new Task(objCloseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask DisposeAsync() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDisposeAsync = (JCObject)classInstance.Invoke("DisposeAsync");
            return new ValueTask(objDisposeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetFieldType(int i) throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFieldType = (JCObject)classInstance.Invoke("GetFieldType", i);
            return new NetType(objGetFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetProviderSpecificFieldType(int i) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProviderSpecificFieldType = (JCObject)classInstance.Invoke("GetProviderSpecificFieldType", i);
            return new NetType(objGetProviderSpecificFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}