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

package microsoft.entityframeworkcore.diagnostics.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.diagnostics.EventDefinition;
import microsoft.entityframeworkcore.diagnostics.IDiagnosticsLogger;
import microsoft.entityframeworkcore.diagnostics.IDiagnosticsLoggerImplementation;
import microsoft.entityframeworkcore.diagnostics.FallbackEventDefinition;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalResources, Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalResources" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalResources</a>
 */
public class RelationalResources extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalResources
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalResources";
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
    public RelationalResources(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalResources}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalResources} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalResources cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalResources(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalResources() throws Throwable {
    }

    
    // Methods section
    
    public static EventDefinition LogAmbientTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogAmbientTransaction = (JCObject)classType.Invoke("LogAmbientTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogAmbientTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogBatchExecutorFailedToReleaseSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogBatchExecutorFailedToReleaseSavepoint = (JCObject)classType.Invoke("LogBatchExecutorFailedToReleaseSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogBatchExecutorFailedToReleaseSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogBatchExecutorFailedToRollbackToSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogBatchExecutorFailedToRollbackToSavepoint = (JCObject)classType.Invoke("LogBatchExecutorFailedToRollbackToSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogBatchExecutorFailedToRollbackToSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogCommittedTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogCommittedTransaction = (JCObject)classType.Invoke("LogCommittedTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogCommittedTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogCommittingTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogCommittingTransaction = (JCObject)classType.Invoke("LogCommittingTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogCommittingTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogCreatedTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogCreatedTransactionSavepoint = (JCObject)classType.Invoke("LogCreatedTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogCreatedTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogCreatingTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogCreatingTransactionSavepoint = (JCObject)classType.Invoke("LogCreatingTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogCreatingTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogDisposingDataReader(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogDisposingDataReader = (JCObject)classType.Invoke("LogDisposingDataReader", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogDisposingDataReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogDisposingTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogDisposingTransaction = (JCObject)classType.Invoke("LogDisposingTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogDisposingTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogMultipleCollectionIncludeWarning(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogMultipleCollectionIncludeWarning = (JCObject)classType.Invoke("LogMultipleCollectionIncludeWarning", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogMultipleCollectionIncludeWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogNoMigrationsApplied(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogNoMigrationsApplied = (JCObject)classType.Invoke("LogNoMigrationsApplied", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogNoMigrationsApplied);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogQueryPossibleExceptionWithAggregateOperatorWarning(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogQueryPossibleExceptionWithAggregateOperatorWarning = (JCObject)classType.Invoke("LogQueryPossibleExceptionWithAggregateOperatorWarning", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogQueryPossibleExceptionWithAggregateOperatorWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogReleasedTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogReleasedTransactionSavepoint = (JCObject)classType.Invoke("LogReleasedTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogReleasedTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogReleasingTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogReleasingTransactionSavepoint = (JCObject)classType.Invoke("LogReleasingTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogReleasingTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogRolledBackToTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogRolledBackToTransactionSavepoint = (JCObject)classType.Invoke("LogRolledBackToTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogRolledBackToTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogRolledBackTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogRolledBackTransaction = (JCObject)classType.Invoke("LogRolledBackTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogRolledBackTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogRollingBackToTransactionSavepoint(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogRollingBackToTransactionSavepoint = (JCObject)classType.Invoke("LogRollingBackToTransactionSavepoint", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogRollingBackToTransactionSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogRollingBackTransaction(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogRollingBackTransaction = (JCObject)classType.Invoke("LogRollingBackTransaction", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogRollingBackTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventDefinition LogTransactionError(IDiagnosticsLogger logger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogTransactionError = (JCObject)classType.Invoke("LogTransactionError", logger == null ? null : logger.getJCOInstance());
            return new EventDefinition(objLogTransactionError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FallbackEventDefinition LogForeignKeyPropertiesMappedToUnrelatedTables(IDiagnosticsLogger logger) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogForeignKeyPropertiesMappedToUnrelatedTables = (JCObject)classType.Invoke("LogForeignKeyPropertiesMappedToUnrelatedTables", logger == null ? null : logger.getJCOInstance());
            return new FallbackEventDefinition(objLogForeignKeyPropertiesMappedToUnrelatedTables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FallbackEventDefinition LogNamedIndexPropertiesMappedToNonOverlappingTables(IDiagnosticsLogger logger) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLogNamedIndexPropertiesMappedToNonOverlappingTables = (JCObject)classType.Invoke("LogNamedIndexPropertiesMappedToNonOverlappingTables", logger == null ? null : logger.getJCOInstance());
            return new FallbackEventDefinition(objLogNamedIndexPropertiesMappedToNonOverlappingTables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}