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

package microsoft.entityframeworkcore.infrastructure;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.infrastructure.CoreOptionsExtension;
import microsoft.entityframeworkcore.infrastructure.RelationalOptionsExtension;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptions;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptionsImplementation;
import system.data.common.DbConnection;
import microsoft.entityframeworkcore.QuerySplittingBehavior;
import microsoft.extensions.dependencyinjection.IServiceCollection;
import microsoft.extensions.dependencyinjection.IServiceCollectionImplementation;
import microsoft.entityframeworkcore.infrastructure.DbContextOptionsExtensionInfo;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Infrastructure.RelationalOptionsExtension, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.RelationalOptionsExtension" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.RelationalOptionsExtension</a>
 */
public class RelationalOptionsExtension extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Infrastructure.RelationalOptionsExtension
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Infrastructure.RelationalOptionsExtension";
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
    public RelationalOptionsExtension(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalOptionsExtension}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalOptionsExtension} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalOptionsExtension cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalOptionsExtension(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalOptionsExtension() throws Throwable {
    }

    
    // Methods section
    
    public static CoreOptionsExtension WithDefaultWarningConfiguration(CoreOptionsExtension coreOptionsExtension) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objWithDefaultWarningConfiguration = (JCObject)classType.Invoke("WithDefaultWarningConfiguration", coreOptionsExtension == null ? null : coreOptionsExtension.getJCOInstance());
            return new CoreOptionsExtension(objWithDefaultWarningConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RelationalOptionsExtension Extract(IDbContextOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExtract = (JCObject)classType.Invoke("Extract", options == null ? null : options.getJCOInstance());
            return new RelationalOptionsExtension(objExtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithConnection(DbConnection connection) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithConnection = (JCObject)classInstance.Invoke("WithConnection", connection == null ? null : connection.getJCOInstance());
            return new RelationalOptionsExtension(objWithConnection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithConnectionString(java.lang.String connectionString) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithConnectionString = (JCObject)classInstance.Invoke("WithConnectionString", connectionString);
            return new RelationalOptionsExtension(objWithConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithMigrationsAssembly(java.lang.String migrationsAssembly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithMigrationsAssembly = (JCObject)classInstance.Invoke("WithMigrationsAssembly", migrationsAssembly);
            return new RelationalOptionsExtension(objWithMigrationsAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithMigrationsHistoryTableName(java.lang.String migrationsHistoryTableName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithMigrationsHistoryTableName = (JCObject)classInstance.Invoke("WithMigrationsHistoryTableName", migrationsHistoryTableName);
            return new RelationalOptionsExtension(objWithMigrationsHistoryTableName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithMigrationsHistoryTableSchema(java.lang.String migrationsHistoryTableSchema) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithMigrationsHistoryTableSchema = (JCObject)classInstance.Invoke("WithMigrationsHistoryTableSchema", migrationsHistoryTableSchema);
            return new RelationalOptionsExtension(objWithMigrationsHistoryTableSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithUseQuerySplittingBehavior(QuerySplittingBehavior querySplittingBehavior) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithUseQuerySplittingBehavior = (JCObject)classInstance.Invoke("WithUseQuerySplittingBehavior", querySplittingBehavior == null ? null : querySplittingBehavior.getJCOInstance());
            return new RelationalOptionsExtension(objWithUseQuerySplittingBehavior);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalOptionsExtension WithUseRelationalNulls(boolean useRelationalNulls) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithUseRelationalNulls = (JCObject)classInstance.Invoke("WithUseRelationalNulls", useRelationalNulls);
            return new RelationalOptionsExtension(objWithUseRelationalNulls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyServices(IServiceCollection services) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyServices", services == null ? null : services.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Validate(IDbContextOptions options) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Validate", options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getUseRelationalNulls() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseRelationalNulls");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbContextOptionsExtensionInfo getInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Info");
            return new DbContextOptionsExtensionInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public java.lang.String getConnectionString() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ConnectionString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMigrationsAssembly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MigrationsAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMigrationsHistoryTableName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MigrationsHistoryTableName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMigrationsHistoryTableSchema() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MigrationsHistoryTableSchema");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}