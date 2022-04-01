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
import system.data.common.DbCommand;
import mysql.data.mysqlclient.MySqlConnection;
import mysql.data.mysqlclient.MySqlTransaction;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import mysql.data.mysqlclient.MySqlDataReader;
import system.data.CommandBehavior;
import mysql.data.mysqlclient.MySqlParameter;
import system.AsyncCallback;
import mysql.data.mysqlclient.MySqlAttributeCollection;
import mysql.data.mysqlclient.MySqlParameterCollection;
import system.data.CommandType;
import system.data.UpdateRowSource;


/**
 * The base .NET class managing MySql.Data.MySqlClient.MySqlCommand, MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlCommand" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlCommand</a>
 */
public class MySqlCommand extends DbCommand  {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySql.Data.MySqlClient.MySqlCommand
     */
    public static final String className = "MySql.Data.MySqlClient.MySqlCommand";
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
    public MySqlCommand(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySqlCommand}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySqlCommand} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySqlCommand cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySqlCommand(from.getJCOInstance());
    }

    // Constructors section
    
    public MySqlCommand() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlCommand(java.lang.String cmdText, MySqlConnection connection, MySqlTransaction transaction) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText, connection == null ? null : connection.getJCOInstance(), transaction == null ? null : transaction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlCommand(java.lang.String cmdText, MySqlConnection connection) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText, connection == null ? null : connection.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlCommand(java.lang.String cmdText) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public int EndExecuteNonQuery(IAsyncResult asyncResult) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("EndExecuteNonQuery", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteNonQuery() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.IndexOutOfRangeException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteNonQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDataReader EndExecuteReader(IAsyncResult result) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndExecuteReader = (JCObject)classInstance.Invoke("EndExecuteReader", result == null ? null : result.getJCOInstance());
            return new MySqlDataReader(objEndExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDataReader ExecuteReaderNewMySqlCommand() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.diagnostics.tracing.EventSourceException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.ArrayTypeMismatchException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader");
            return new MySqlDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDataReader ExecuteReaderNewMySqlCommand(CommandBehavior behavior) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, mysql.data.mysqlclient.MySqlException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.ArrayTypeMismatchException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader", behavior == null ? null : behavior.getJCOInstance());
            return new MySqlDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlParameter CreateParameterNewMySqlCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateParameter = (JCObject)classInstance.Invoke("CreateParameter");
            return new MySqlParameter(objCreateParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginExecuteNonQuery() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.IndexOutOfRangeException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginExecuteNonQuery = (JCObject)classInstance.Invoke("BeginExecuteNonQuery");
            return new IAsyncResultImplementation(objBeginExecuteNonQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginExecuteNonQuery(AsyncCallback callback, NetObject stateObject) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.IndexOutOfRangeException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginExecuteNonQuery = (JCObject)classInstance.Invoke("BeginExecuteNonQuery", callback, stateObject == null ? null : stateObject.getJCOInstance());
            return new IAsyncResultImplementation(objBeginExecuteNonQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginExecuteReader() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.ObjectDisposedException, system.threading.SynchronizationLockException, system.ArrayTypeMismatchException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginExecuteReader = (JCObject)classInstance.Invoke("BeginExecuteReader");
            return new IAsyncResultImplementation(objBeginExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginExecuteReader(CommandBehavior behavior) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.IndexOutOfRangeException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginExecuteReader = (JCObject)classInstance.Invoke("BeginExecuteReader", behavior == null ? null : behavior.getJCOInstance());
            return new IAsyncResultImplementation(objBeginExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, mysql.data.mysqlclient.MySqlException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ExecuteScalar() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, mysql.data.mysqlclient.MySqlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException, system.IndexOutOfRangeException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteScalar = (JCObject)classInstance.Invoke("ExecuteScalar");
            return new NetObject(objExecuteScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DisposeNewMySqlCommand() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getEnableCaching() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableCaching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableCaching(boolean EnableCaching) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnableCaching", EnableCaching);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPrepared() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPrepared");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCacheAge() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CacheAge");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCacheAge(int CacheAge) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CacheAge", CacheAge);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLastInsertedId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("LastInsertedId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastInsertedId(long LastInsertedId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastInsertedId", LastInsertedId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlAttributeCollection getAttributes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new MySqlAttributeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlConnection getConnectionNewMySqlCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new MySqlConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(MySqlConnection Connection) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Connection", Connection == null ? null : Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlParameterCollection getParametersNewMySqlCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new MySqlParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlTransaction getTransactionNewMySqlCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new MySqlTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(MySqlTransaction Transaction) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transaction", Transaction == null ? null : Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}