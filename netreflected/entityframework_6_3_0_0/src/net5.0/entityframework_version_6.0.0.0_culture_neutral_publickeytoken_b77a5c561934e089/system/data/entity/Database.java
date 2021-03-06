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

package system.data.entity;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbConnection;
import system.data.entity.TransactionalBehavior;
import system.data.entity.DbContextTransaction;
import system.data.IsolationLevel;
import system.data.entity.infrastructure.DbRawSqlQuery;
import system.data.common.DbTransaction;
import system.data.entity.infrastructure.IDbConnectionFactory;
import system.data.entity.infrastructure.IDbConnectionFactoryImplementation;


/**
 * The base .NET class managing System.Data.Entity.Database, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Database" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Database</a>
 */
public class Database extends NetObject  {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.Database
     */
    public static final String className = "System.Data.Entity.Database";
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
    public Database(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Database}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Database} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Database cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Database(from.getJCOInstance());
    }

    // Constructors section
    
    public Database() throws Throwable {
    }



    
    // Methods section
    
    public boolean CompatibleWithModel(boolean throwIfNoMetadata) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.data.entity.core.ProviderIncompatibleException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.data.entity.core.MetadataException, system.data.entity.core.MappingException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CompatibleWithModel", throwIfNoMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CreateIfNotExists() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.entity.core.ProviderIncompatibleException, system.MissingMemberException, system.threading.SynchronizationLockException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionException, system.data.entity.modelconfiguration.ModelValidationException, system.xml.XmlException, system.data.entity.validation.DbEntityValidationException, system.data.entity.infrastructure.DbUpdateException, system.data.DataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CreateIfNotExists");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Delete() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.entity.core.ProviderIncompatibleException, system.MissingMemberException, system.threading.SynchronizationLockException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Delete(DbConnection existingConnection) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.data.entity.core.ProviderIncompatibleException, system.MissingMemberException, system.data.entity.modelconfiguration.ModelValidationException, system.data.entity.core.MappingException, system.xml.XmlException, system.data.entity.core.MetadataException, system.threading.SynchronizationLockException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Delete", existingConnection == null ? null : existingConnection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Delete(java.lang.String nameOrConnectionString) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.configuration.ConfigurationException, system.data.entity.core.ProviderIncompatibleException, system.NotSupportedException, system.MissingMemberException, system.data.entity.modelconfiguration.ModelValidationException, system.data.entity.core.MappingException, system.xml.XmlException, system.data.entity.core.MetadataException, system.threading.SynchronizationLockException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Delete", nameOrConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Exists() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.entity.core.ProviderIncompatibleException, system.MissingMemberException, system.threading.SynchronizationLockException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Exists");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Exists(DbConnection existingConnection) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.data.entity.core.ProviderIncompatibleException, system.transactions.TransactionException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Exists", existingConnection == null ? null : existingConnection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Exists(java.lang.String nameOrConnectionString) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NotSupportedException, system.configuration.ConfigurationException, system.data.entity.core.ProviderIncompatibleException, system.transactions.TransactionException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Exists", nameOrConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteSqlCommand(TransactionalBehavior transactionalBehavior, java.lang.String sql, NetObject... parameters) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteSqlCommand", transactionalBehavior == null ? null : transactionalBehavior.getJCOInstance(), sql, toObjectFromArray(parameters));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteSqlCommand(java.lang.String sql, NetObject... parameters) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteSqlCommand", sql, toObjectFromArray(parameters));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContextTransaction BeginTransaction() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction");
            return new DbContextTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContextTransaction BeginTransaction(IsolationLevel isolationLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", isolationLevel == null ? null : isolationLevel.getJCOInstance());
            return new DbContextTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbRawSqlQuery SqlQuery(NetType elementType, java.lang.String sql, NetObject... parameters) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSqlQuery = (JCObject)classInstance.Invoke("SqlQuery", elementType == null ? null : elementType.getJCOInstance(), sql, toObjectFromArray(parameters));
            return new DbRawSqlQuery(objSqlQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Create() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.data.entity.core.ProviderIncompatibleException, system.InvalidOperationException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.MissingMemberException, system.xml.XmlException, system.data.entity.validation.DbEntityValidationException, system.data.entity.infrastructure.DbUpdateException, system.data.DataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Create");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(boolean force) throws Throwable, system.ArgumentException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.entity.core.ProviderIncompatibleException, system.threading.SynchronizationLockException, system.configuration.ConfigurationErrorsException, system.data.DataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", force);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UseTransaction(DbTransaction transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.MissingMemberException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UseTransaction", transaction == null ? null : transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DbConnection getConnection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new DbConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContextTransaction getCurrentTransaction() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentTransaction");
            return new DbContextTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDbConnectionFactory getDefaultConnectionFactory() throws Throwable, system.ArgumentException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DefaultConnectionFactory");
            return new IDbConnectionFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setDefaultConnectionFactory(IDbConnectionFactory DefaultConnectionFactory) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("DefaultConnectionFactory", DefaultConnectionFactory == null ? null : DefaultConnectionFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}