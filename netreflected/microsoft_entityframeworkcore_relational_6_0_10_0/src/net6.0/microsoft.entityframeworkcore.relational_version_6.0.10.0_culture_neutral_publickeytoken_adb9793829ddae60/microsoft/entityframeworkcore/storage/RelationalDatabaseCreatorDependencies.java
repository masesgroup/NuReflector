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

package microsoft.entityframeworkcore.storage;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.storage.IRelationalConnection;
import microsoft.entityframeworkcore.storage.IRelationalConnectionImplementation;
import microsoft.entityframeworkcore.migrations.IMigrationsModelDiffer;
import microsoft.entityframeworkcore.migrations.IMigrationsModelDifferImplementation;
import microsoft.entityframeworkcore.migrations.IMigrationsSqlGenerator;
import microsoft.entityframeworkcore.migrations.IMigrationsSqlGeneratorImplementation;
import microsoft.entityframeworkcore.migrations.IMigrationCommandExecutor;
import microsoft.entityframeworkcore.migrations.IMigrationCommandExecutorImplementation;
import microsoft.entityframeworkcore.storage.ISqlGenerationHelper;
import microsoft.entityframeworkcore.storage.ISqlGenerationHelperImplementation;
import microsoft.entityframeworkcore.storage.IExecutionStrategy;
import microsoft.entityframeworkcore.storage.IExecutionStrategyImplementation;
import microsoft.entityframeworkcore.storage.IExecutionStrategyFactory;
import microsoft.entityframeworkcore.storage.IExecutionStrategyFactoryImplementation;
import microsoft.entityframeworkcore.infrastructure.ICurrentDbContext;
import microsoft.entityframeworkcore.infrastructure.ICurrentDbContextImplementation;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLogger;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLoggerImplementation;
import microsoft.entityframeworkcore.storage.RelationalDatabaseCreatorDependencies;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Storage.RelationalDatabaseCreatorDependencies, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Storage.RelationalDatabaseCreatorDependencies" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Storage.RelationalDatabaseCreatorDependencies</a>
 */
public class RelationalDatabaseCreatorDependencies extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Storage.RelationalDatabaseCreatorDependencies
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Storage.RelationalDatabaseCreatorDependencies";
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
    public RelationalDatabaseCreatorDependencies(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalDatabaseCreatorDependencies}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalDatabaseCreatorDependencies} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalDatabaseCreatorDependencies cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalDatabaseCreatorDependencies(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalDatabaseCreatorDependencies() throws Throwable {
    }

    public RelationalDatabaseCreatorDependencies(IModel model, IRelationalConnection connection, IMigrationsModelDiffer modelDiffer, IMigrationsSqlGenerator migrationsSqlGenerator, IMigrationCommandExecutor migrationCommandExecutor, ISqlGenerationHelper sqlGenerationHelper, IExecutionStrategy executionStrategy, IExecutionStrategyFactory executionStrategyFactory, ICurrentDbContext currentContext, IRelationalCommandDiagnosticsLogger commandLogger) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(model == null ? null : model.getJCOInstance(), connection == null ? null : connection.getJCOInstance(), modelDiffer == null ? null : modelDiffer.getJCOInstance(), migrationsSqlGenerator == null ? null : migrationsSqlGenerator.getJCOInstance(), migrationCommandExecutor == null ? null : migrationCommandExecutor.getJCOInstance(), sqlGenerationHelper == null ? null : sqlGenerationHelper.getJCOInstance(), executionStrategy == null ? null : executionStrategy.getJCOInstance(), executionStrategyFactory == null ? null : executionStrategyFactory.getJCOInstance(), currentContext == null ? null : currentContext.getJCOInstance(), commandLogger == null ? null : commandLogger.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(RelationalDatabaseCreatorDependencies other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalDatabaseCreatorDependencies <Clone>$() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject obj<Clone>$ = (JCObject)classInstance.Invoke("<Clone>$");
            return new RelationalDatabaseCreatorDependencies(obj<Clone>$);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IRelationalCommandDiagnosticsLogger getCommandLogger() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CommandLogger");
            return new IRelationalCommandDiagnosticsLoggerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandLogger(IRelationalCommandDiagnosticsLogger CommandLogger) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandLogger", CommandLogger == null ? null : CommandLogger.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICurrentDbContext getCurrentContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentContext");
            return new ICurrentDbContextImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrentContext(ICurrentDbContext CurrentContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrentContext", CurrentContext == null ? null : CurrentContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IModel getModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new IModelImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModel(IModel Model) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Model", Model == null ? null : Model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMigrationCommandExecutor getMigrationCommandExecutor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MigrationCommandExecutor");
            return new IMigrationCommandExecutorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMigrationCommandExecutor(IMigrationCommandExecutor MigrationCommandExecutor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MigrationCommandExecutor", MigrationCommandExecutor == null ? null : MigrationCommandExecutor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMigrationsModelDiffer getModelDiffer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ModelDiffer");
            return new IMigrationsModelDifferImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelDiffer(IMigrationsModelDiffer ModelDiffer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ModelDiffer", ModelDiffer == null ? null : ModelDiffer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMigrationsSqlGenerator getMigrationsSqlGenerator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MigrationsSqlGenerator");
            return new IMigrationsSqlGeneratorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMigrationsSqlGenerator(IMigrationsSqlGenerator MigrationsSqlGenerator) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MigrationsSqlGenerator", MigrationsSqlGenerator == null ? null : MigrationsSqlGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IExecutionStrategy getExecutionStrategy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExecutionStrategy");
            return new IExecutionStrategyImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IExecutionStrategyFactory getExecutionStrategyFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExecutionStrategyFactory");
            return new IExecutionStrategyFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExecutionStrategyFactory(IExecutionStrategyFactory ExecutionStrategyFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExecutionStrategyFactory", ExecutionStrategyFactory == null ? null : ExecutionStrategyFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRelationalConnection getConnection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new IRelationalConnectionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(IRelationalConnection Connection) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Connection", Connection == null ? null : Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISqlGenerationHelper getSqlGenerationHelper() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SqlGenerationHelper");
            return new ISqlGenerationHelperImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSqlGenerationHelper(ISqlGenerationHelper SqlGenerationHelper) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SqlGenerationHelper", SqlGenerationHelper == null ? null : SqlGenerationHelper.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}