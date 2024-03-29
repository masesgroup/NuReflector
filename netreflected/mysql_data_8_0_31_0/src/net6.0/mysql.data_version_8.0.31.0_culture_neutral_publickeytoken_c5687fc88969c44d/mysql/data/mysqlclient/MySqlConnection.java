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

package mysql.data.mysqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbConnection;
import mysql.data.mysqlclient.MySqlCommand;
import mysql.data.mysqlclient.MySqlSchemaCollection;
import mysql.data.mysqlclient.MySqlTransaction;
import system.data.IsolationLevel;
import system.data.DataTable;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import mysql.data.mysqlclient.MySqlConnection;
import system.transactions.Transaction;
import system.data.ConnectionState;
import mysql.data.mysqlclient.FidoActionCallback;
import mysql.data.mysqlclient.MySqlInfoMessageEventHandler;


/**
 * The base .NET class managing MySql.Data.MySqlClient.MySqlConnection, MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlConnection" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlConnection</a>
 */
public class MySqlConnection extends DbConnection  {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySql.Data.MySqlClient.MySqlConnection
     */
    public static final String className = "MySql.Data.MySqlClient.MySqlConnection";
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
    public MySqlConnection(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySqlConnection}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySqlConnection} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySqlConnection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySqlConnection(from.getJCOInstance());
    }

    // Constructors section
    
    public MySqlConnection() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlConnection(java.lang.String connectionString) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Ping() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Ping");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlCommand CreateCommandNewMySqlConnection() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCommand = (JCObject)classInstance.Invoke("CreateCommand");
            return new MySqlCommand(objCreateCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlSchemaCollection GetSchemaCollection(java.lang.String collectionName, java.lang.String[] restrictionValues) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, mysql.data.mysqlclient.MySqlException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.ObjectDisposedException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchemaCollection = (JCObject)classInstance.Invoke("GetSchemaCollection", collectionName, restrictionValues);
            return new MySqlSchemaCollection(objGetSchemaCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlSchemaCollection GetSchemaCollection(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, mysql.data.mysqlclient.MySqlException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.ObjectDisposedException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchemaCollection = (JCObject)classInstance.Invoke("GetSchemaCollection", dupParam0, dupParam1.getJCRefOut());
            return new MySqlSchemaCollection(objGetSchemaCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlTransaction BeginTransactionNewMySqlConnection() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction");
            return new MySqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlTransaction BeginTransaction(IsolationLevel iso, java.lang.String scope) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", iso == null ? null : iso.getJCOInstance(), scope);
            return new MySqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema");
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName, java.lang.String[] restrictionValues) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, mysql.data.mysqlclient.MySqlException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.ObjectDisposedException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", collectionName, restrictionValues);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, mysql.data.mysqlclient.MySqlException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.ObjectDisposedException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", dupParam0, dupParam1.getJCRefOut());
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", collectionName);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ChangeDataBaseAsync(java.lang.String databaseName, CancellationToken cancellationToken) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeDataBaseAsync = (JCObject)classInstance.Invoke("ChangeDataBaseAsync", databaseName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objChangeDataBaseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ChangeDataBaseAsync(java.lang.String databaseName) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeDataBaseAsync = (JCObject)classInstance.Invoke("ChangeDataBaseAsync", databaseName);
            return new Task(objChangeDataBaseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ClearAllPoolsAsync() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClearAllPoolsAsync = (JCObject)classInstance.Invoke("ClearAllPoolsAsync");
            return new Task(objClearAllPoolsAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ClearAllPoolsAsync(CancellationToken cancellationToken) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClearAllPoolsAsync = (JCObject)classInstance.Invoke("ClearAllPoolsAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objClearAllPoolsAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ClearPoolAsync(MySqlConnection connection, CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.AccessViolationException, mysql.data.mysqlclient.MySqlException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClearPoolAsync = (JCObject)classInstance.Invoke("ClearPoolAsync", connection == null ? null : connection.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objClearPoolAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ClearPoolAsync(MySqlConnection connection) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.AccessViolationException, mysql.data.mysqlclient.MySqlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClearPoolAsync = (JCObject)classInstance.Invoke("ClearPoolAsync", connection == null ? null : connection.getJCOInstance());
            return new Task(objClearPoolAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CloseAsyncNewMySqlConnection() throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCloseAsync = (JCObject)classInstance.Invoke("CloseAsync");
            return new Task(objCloseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CloseAsync(CancellationToken cancellationToken) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCloseAsync = (JCObject)classInstance.Invoke("CloseAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCloseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelQuery(int timeout) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.text.regularexpressions.RegexMatchTimeoutException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelQuery", timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ChangeDatabase(java.lang.String databaseName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.reflection.AmbiguousMatchException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ChangeDatabase", databaseName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearAllPools() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearAllPools");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearPool(MySqlConnection connection) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.text.regularexpressions.RegexMatchTimeoutException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.AccessViolationException, mysql.data.mysqlclient.MySqlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearPool", connection == null ? null : connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.collections.generic.KeyNotFoundException, system.ArgumentOutOfRangeException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OverflowException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.net.sockets.SocketException, mysql.data.mysqlclient.MySqlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DisposeNewMySqlConnection() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnlistTransaction(Transaction transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.RankException, system.OverflowException, system.net.sockets.SocketException, mysql.data.mysqlclient.MySqlException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnlistTransaction", transaction == null ? null : transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Open");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsPasswordExpired() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPasswordExpired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseCompression() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseCompression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getServerThread() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ServerThread");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addFidoActionRequested(FidoActionCallback handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("FidoActionRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFidoActionRequested(FidoActionCallback handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("FidoActionRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addInfoMessage(MySqlInfoMessageEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInfoMessage(MySqlInfoMessageEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}