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

package microsoft.entityframeworkcore.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.diagnostics.IDiagnosticsLogger;
import microsoft.entityframeworkcore.diagnostics.IDiagnosticsLoggerImplementation;
import microsoft.entityframeworkcore.diagnostics.EventDefinitionBase;
import system.DateTimeOffset;
import microsoft.entityframeworkcore.storage.IRelationalConnection;
import microsoft.entityframeworkcore.storage.IRelationalConnectionImplementation;
import system.data.common.DbCommand;
import microsoft.entityframeworkcore.DbContext;
import system.Guid;
import system.TimeSpan;
import microsoft.entityframeworkcore.diagnostics.CommandSource;
import microsoft.entityframeworkcore.diagnostics.InterceptionResult;
import system.data.common.DbDataReader;
import microsoft.entityframeworkcore.diagnostics.DbCommandMethod;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.entityframeworkcore.diagnostics.EventData;
import microsoft.entityframeworkcore.diagnostics.IDbContextLogger;
import microsoft.entityframeworkcore.diagnostics.IDbContextLoggerImplementation;
import microsoft.entityframeworkcore.diagnostics.IInterceptors;
import microsoft.entityframeworkcore.diagnostics.IInterceptorsImplementation;
import microsoft.entityframeworkcore.diagnostics.ILoggingOptions;
import microsoft.entityframeworkcore.diagnostics.ILoggingOptionsImplementation;
import microsoft.entityframeworkcore.diagnostics.LoggingDefinitions;
import microsoft.extensions.logging.ILogger;
import microsoft.extensions.logging.ILoggerImplementation;
import system.diagnostics.DiagnosticSource;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Diagnostics.IRelationalCommandDiagnosticsLogger, Microsoft.EntityFrameworkCore.Relational, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.IRelationalCommandDiagnosticsLogger" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.IRelationalCommandDiagnosticsLogger</a>
 */
public class IRelationalCommandDiagnosticsLoggerImplementation extends NetObject implements IRelationalCommandDiagnosticsLogger {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Diagnostics.IRelationalCommandDiagnosticsLogger
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Diagnostics.IRelationalCommandDiagnosticsLogger";
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
    public IRelationalCommandDiagnosticsLoggerImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRelationalCommandDiagnosticsLogger}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRelationalCommandDiagnosticsLogger} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRelationalCommandDiagnosticsLogger ToIRelationalCommandDiagnosticsLogger(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IRelationalCommandDiagnosticsLoggerImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean NeedsEventData(EventDefinitionBase definition, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> diagnosticSourceEnabled, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> simpleLogEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("NeedsEventData", definition == null ? null : definition.getJCOInstance(), diagnosticSourceEnabled.getJCRefOut(), simpleLogEnabled.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLog(EventDefinitionBase definition) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLog", definition == null ? null : definition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLogCommandCreate(DateTimeOffset now) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogCommandCreate", now == null ? null : now.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLogCommandExecute(DateTimeOffset now) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogCommandExecute", now == null ? null : now.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLogDataReaderDispose(DateTimeOffset now) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogDataReaderDispose", now == null ? null : now.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLogSensitiveData() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogSensitiveData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CommandNonQueryExecuted(IRelationalConnection connection, DbCommand command, DbContext context, Guid commandId, Guid connectionId, int methodResult, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CommandNonQueryExecuted", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), context == null ? null : context.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), methodResult, startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult DataReaderDisposing(IRelationalConnection connection, DbCommand command, DbDataReader dataReader, Guid commandId, int recordsAffected, int readCount, DateTimeOffset startTime, TimeSpan duration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDataReaderDisposing = (JCObject)classInstance.Invoke("DataReaderDisposing", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), dataReader == null ? null : dataReader.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), recordsAffected, readCount, startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance());
            return new InterceptionResult(objDataReaderDisposing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbCommand CommandCreated(IRelationalConnection connection, DbCommand command, DbCommandMethod commandMethod, DbContext context, Guid commandId, Guid connectionId, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommandCreated = (JCObject)classInstance.Invoke("CommandCreated", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), commandMethod == null ? null : commandMethod.getJCOInstance(), context == null ? null : context.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance());
            return new DbCommand(objCommandCreated);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataReader CommandReaderExecuted(IRelationalConnection connection, DbCommand command, DbContext context, Guid commandId, Guid connectionId, DbDataReader methodResult, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommandReaderExecuted = (JCObject)classInstance.Invoke("CommandReaderExecuted", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), context == null ? null : context.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), methodResult == null ? null : methodResult.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance());
            return new DbDataReader(objCommandReaderExecuted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CommandScalarExecuted(IRelationalConnection connection, DbCommand command, DbContext context, Guid commandId, Guid connectionId, NetObject methodResult, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommandScalarExecuted = (JCObject)classInstance.Invoke("CommandScalarExecuted", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), context == null ? null : context.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), methodResult == null ? null : methodResult.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance());
            return new NetObject(objCommandScalarExecuted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CommandErrorAsync(IRelationalConnection connection, DbCommand command, DbContext context, DbCommandMethod executeMethod, Guid commandId, Guid connectionId, NetException exception, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommandErrorAsync = (JCObject)classInstance.Invoke("CommandErrorAsync", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), context == null ? null : context.getJCOInstance(), executeMethod == null ? null : executeMethod.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCommandErrorAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommandError(IRelationalConnection connection, DbCommand command, DbContext context, DbCommandMethod executeMethod, Guid commandId, Guid connectionId, NetException exception, DateTimeOffset startTime, TimeSpan duration, CommandSource commandSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CommandError", connection == null ? null : connection.getJCOInstance(), command == null ? null : command.getJCOInstance(), context == null ? null : context.getJCOInstance(), executeMethod == null ? null : executeMethod.getJCOInstance(), commandId == null ? null : commandId.getJCOInstance(), connectionId == null ? null : connectionId.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), commandSource == null ? null : commandSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DispatchEventData(EventDefinitionBase definition, EventData eventData, boolean diagnosticSourceEnabled, boolean simpleLogEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DispatchEventData", definition == null ? null : definition.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), diagnosticSourceEnabled, simpleLogEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IDbContextLogger getDbContextLogger() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DbContextLogger");
            return new IDbContextLoggerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IInterceptors getInterceptors() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Interceptors");
            return new IInterceptorsImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILoggingOptions getOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Options");
            return new ILoggingOptionsImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoggingDefinitions getDefinitions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Definitions");
            return new LoggingDefinitions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILogger getLogger() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Logger");
            return new ILoggerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiagnosticSource getDiagnosticSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DiagnosticSource");
            return new DiagnosticSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}