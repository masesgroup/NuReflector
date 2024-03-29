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
import microsoft.entityframeworkcore.diagnostics.IInterceptor;
import microsoft.entityframeworkcore.diagnostics.IInterceptorImplementation;
import microsoft.entityframeworkcore.diagnostics.InterceptionResult;
import system.data.common.DbTransaction;
import microsoft.entityframeworkcore.diagnostics.TransactionEventData;
import system.data.common.DbConnection;
import microsoft.entityframeworkcore.diagnostics.TransactionEndEventData;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.entityframeworkcore.diagnostics.TransactionErrorEventData;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Diagnostics.IDbTransactionInterceptor, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.IDbTransactionInterceptor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.IDbTransactionInterceptor</a>
 */
public class IDbTransactionInterceptorImplementation extends NetObject implements IDbTransactionInterceptor {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Diagnostics.IDbTransactionInterceptor
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Diagnostics.IDbTransactionInterceptor";
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
    public IDbTransactionInterceptorImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDbTransactionInterceptor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDbTransactionInterceptor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDbTransactionInterceptor ToIDbTransactionInterceptor(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IDbTransactionInterceptorImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public InterceptionResult CreatingSavepoint(DbTransaction transaction, TransactionEventData eventData, InterceptionResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreatingSavepoint = (JCObject)classInstance.Invoke("CreatingSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new InterceptionResult(objCreatingSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult ReleasingSavepoint(DbTransaction transaction, TransactionEventData eventData, InterceptionResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleasingSavepoint = (JCObject)classInstance.Invoke("ReleasingSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new InterceptionResult(objReleasingSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult RollingBackToSavepoint(DbTransaction transaction, TransactionEventData eventData, InterceptionResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollingBackToSavepoint = (JCObject)classInstance.Invoke("RollingBackToSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new InterceptionResult(objRollingBackToSavepoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult TransactionCommitting(DbTransaction transaction, TransactionEventData eventData, InterceptionResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionCommitting = (JCObject)classInstance.Invoke("TransactionCommitting", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new InterceptionResult(objTransactionCommitting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult TransactionRollingBack(DbTransaction transaction, TransactionEventData eventData, InterceptionResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionRollingBack = (JCObject)classInstance.Invoke("TransactionRollingBack", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new InterceptionResult(objTransactionRollingBack);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbTransaction TransactionStarted(DbConnection connection, TransactionEndEventData eventData, DbTransaction result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionStarted = (JCObject)classInstance.Invoke("TransactionStarted", connection == null ? null : connection.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new DbTransaction(objTransactionStarted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbTransaction TransactionUsed(DbConnection connection, TransactionEventData eventData, DbTransaction result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionUsed = (JCObject)classInstance.Invoke("TransactionUsed", connection == null ? null : connection.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), result == null ? null : result.getJCOInstance());
            return new DbTransaction(objTransactionUsed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CreatedSavepointAsync(DbTransaction transaction, TransactionEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreatedSavepointAsync = (JCObject)classInstance.Invoke("CreatedSavepointAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCreatedSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ReleasedSavepointAsync(DbTransaction transaction, TransactionEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleasedSavepointAsync = (JCObject)classInstance.Invoke("ReleasedSavepointAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objReleasedSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RolledBackToSavepointAsync(DbTransaction transaction, TransactionEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRolledBackToSavepointAsync = (JCObject)classInstance.Invoke("RolledBackToSavepointAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRolledBackToSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task TransactionCommittedAsync(DbTransaction transaction, TransactionEndEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionCommittedAsync = (JCObject)classInstance.Invoke("TransactionCommittedAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objTransactionCommittedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task TransactionFailedAsync(DbTransaction transaction, TransactionErrorEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionFailedAsync = (JCObject)classInstance.Invoke("TransactionFailedAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objTransactionFailedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task TransactionRolledBackAsync(DbTransaction transaction, TransactionEndEventData eventData, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransactionRolledBackAsync = (JCObject)classInstance.Invoke("TransactionRolledBackAsync", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objTransactionRolledBackAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreatedSavepoint(DbTransaction transaction, TransactionEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreatedSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleasedSavepoint(DbTransaction transaction, TransactionEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleasedSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RolledBackToSavepoint(DbTransaction transaction, TransactionEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RolledBackToSavepoint", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransactionCommitted(DbTransaction transaction, TransactionEndEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TransactionCommitted", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransactionFailed(DbTransaction transaction, TransactionErrorEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TransactionFailed", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransactionRolledBack(DbTransaction transaction, TransactionEndEventData eventData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TransactionRolledBack", transaction == null ? null : transaction.getJCOInstance(), eventData == null ? null : eventData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}