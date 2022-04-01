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
import system.data.entity.infrastructure.DbCompiledModel;
import system.data.entity.core.objects.ObjectContext;
import system.data.entity.DbSet;
import system.data.entity.infrastructure.DbEntityEntry;
import system.data.entity.Database;
import system.data.entity.infrastructure.DbChangeTracker;
import system.data.entity.infrastructure.DbContextConfiguration;


/**
 * The base .NET class managing System.Data.Entity.DbContext, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.DbContext" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.DbContext</a>
 */
public class DbContext extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.DbContext
     */
    public static final String className = "System.Data.Entity.DbContext";
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
    public DbContext(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DbContext}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DbContext} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DbContext cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DbContext(from.getJCOInstance());
    }

    // Constructors section
    
    public DbContext() throws Throwable {
    }

    public DbContext(DbConnection existingConnection, boolean contextOwnsConnection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.TypeLoadException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotImplementedException, system.data.entity.core.ProviderIncompatibleException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(existingConnection == null ? null : existingConnection.getJCOInstance(), contextOwnsConnection));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContext(DbConnection existingConnection, DbCompiledModel model, boolean contextOwnsConnection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.TypeLoadException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotImplementedException, system.data.entity.core.ProviderIncompatibleException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(existingConnection == null ? null : existingConnection.getJCOInstance(), model == null ? null : model.getJCOInstance(), contextOwnsConnection));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContext(ObjectContext objectContext, boolean dbContextOwnsObjectContext) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.TypeLoadException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(objectContext == null ? null : objectContext.getJCOInstance(), dbContextOwnsObjectContext));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContext(java.lang.String nameOrConnectionString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.data.entity.core.ProviderIncompatibleException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(nameOrConnectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContext(java.lang.String nameOrConnectionString, DbCompiledModel model) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.data.entity.core.ProviderIncompatibleException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(nameOrConnectionString, model == null ? null : model.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public int SaveChanges() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.MulticastNotSupportedException, system.data.entity.validation.DbEntityValidationException, system.ObjectDisposedException, system.data.entity.infrastructure.CommitFailedException, system.data.entity.infrastructure.DbUpdateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("SaveChanges");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbSet Set(NetType entityType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSet = (JCObject)classInstance.Invoke("Set", entityType == null ? null : entityType.getJCOInstance());
            return new DbSet(objSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbEntityEntry Entry(NetObject entity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.data.entity.core.EntityException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEntry = (JCObject)classInstance.Invoke("Entry", entity == null ? null : entity.getJCOInstance());
            return new DbEntityEntry(objEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public Database getDatabase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Database");
            return new Database(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbChangeTracker getChangeTracker() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ChangeTracker");
            return new DbChangeTracker(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContextConfiguration getConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Configuration");
            return new DbContextConfiguration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}