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
import microsoft.entityframeworkcore.DbContext;
import microsoft.entityframeworkcore.storage.IDbContextTransaction;
import microsoft.entityframeworkcore.storage.IDbContextTransactionImplementation;
import microsoft.entityframeworkcore.storage.IExecutionStrategy;
import microsoft.entityframeworkcore.storage.IExecutionStrategyImplementation;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.entityframeworkcore.infrastructure.IResettableService;
import microsoft.entityframeworkcore.infrastructure.IResettableServiceImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Infrastructure.DatabaseFacade, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.DatabaseFacade" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.DatabaseFacade</a>
 */
public class DatabaseFacade extends NetObject implements microsoft.entityframeworkcore.infrastructure.IResettableService {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Infrastructure.DatabaseFacade
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Infrastructure.DatabaseFacade";
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
    public DatabaseFacade(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DatabaseFacade}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DatabaseFacade} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DatabaseFacade cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DatabaseFacade(from.getJCOInstance());
    }

    // Constructors section
    
    public DatabaseFacade() throws Throwable {
    }

    public DatabaseFacade(DbContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean CanConnect() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanConnect");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean EnsureCreated() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("EnsureCreated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean EnsureDeleted() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("EnsureDeleted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDbContextTransaction BeginTransaction() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction");
            return new IDbContextTransactionImplementation(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IExecutionStrategy CreateExecutionStrategy() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateExecutionStrategy = (JCObject)classInstance.Invoke("CreateExecutionStrategy");
            return new IExecutionStrategyImplementation(objCreateExecutionStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CommitTransactionAsync(CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommitTransactionAsync = (JCObject)classInstance.Invoke("CommitTransactionAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCommitTransactionAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RollbackTransactionAsync(CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollbackTransactionAsync = (JCObject)classInstance.Invoke("RollbackTransactionAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRollbackTransactionAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommitTransaction() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CommitTransaction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RollbackTransaction() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RollbackTransaction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIResettableService method available in IResettableService to obtain an object with an invocable method
     */
    @Deprecated 
    public Task ResetStateAsync(CancellationToken cancellationToken) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIResettableService to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIResettableService method available in IResettableService to obtain an object with an invocable method
     */
    @Deprecated 
    public void ResetState() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIResettableService to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getAutoSavepointsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoSavepointsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoSavepointsEnabled(boolean AutoSavepointsEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoSavepointsEnabled", AutoSavepointsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoTransactionsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoTransactionsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoTransactionsEnabled(boolean AutoTransactionsEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoTransactionsEnabled", AutoTransactionsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDbContextTransaction getCurrentTransaction() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentTransaction");
            return new IDbContextTransactionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProviderName() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ProviderName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}