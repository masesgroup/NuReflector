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

package firebirdsql.data.services;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import firebirdsql.data.services.FbService;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import firebirdsql.data.services.FbShutdownOnlineMode;
import firebirdsql.data.services.FbShutdownType;
import firebirdsql.data.services.FbShutdownMode;


/**
 * The base .NET class managing FirebirdSql.Data.Services.FbConfiguration, FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Services.FbConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Services.FbConfiguration</a>
 */
public class FbConfiguration extends FbService  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.Services.FbConfiguration
     */
    public static final String className = "FirebirdSql.Data.Services.FbConfiguration";
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
    public FbConfiguration(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FbConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FbConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FbConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FbConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public FbConfiguration() throws Throwable {
    }

    public FbConfiguration(java.lang.String connectionString) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Task ActivateShadowsAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objActivateShadowsAsync = (JCObject)classInstance.Invoke("ActivateShadowsAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objActivateShadowsAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task DatabaseOnline2Async(FbShutdownOnlineMode mode, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDatabaseOnline2Async = (JCObject)classInstance.Invoke("DatabaseOnline2Async", mode == null ? null : mode.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDatabaseOnline2Async);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task DatabaseOnlineAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDatabaseOnlineAsync = (JCObject)classInstance.Invoke("DatabaseOnlineAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDatabaseOnlineAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task DatabaseShutdown2Async(FbShutdownOnlineMode mode, FbShutdownType type, int seconds, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDatabaseShutdown2Async = (JCObject)classInstance.Invoke("DatabaseShutdown2Async", mode == null ? null : mode.getJCOInstance(), type == null ? null : type.getJCOInstance(), seconds, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDatabaseShutdown2Async);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task DatabaseShutdownAsync(FbShutdownMode mode, int seconds, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDatabaseShutdownAsync = (JCObject)classInstance.Invoke("DatabaseShutdownAsync", mode == null ? null : mode.getJCOInstance(), seconds, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDatabaseShutdownAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task NoLingerAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNoLingerAsync = (JCObject)classInstance.Invoke("NoLingerAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objNoLingerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetAccessModeAsync(boolean readOnly, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetAccessModeAsync = (JCObject)classInstance.Invoke("SetAccessModeAsync", readOnly, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetAccessModeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetForcedWritesAsync(boolean forcedWrites, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetForcedWritesAsync = (JCObject)classInstance.Invoke("SetForcedWritesAsync", forcedWrites, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetForcedWritesAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetPageBuffersAsync(int pageBuffers, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetPageBuffersAsync = (JCObject)classInstance.Invoke("SetPageBuffersAsync", pageBuffers, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetPageBuffersAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetReserveSpaceAsync(boolean reserveSpace, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetReserveSpaceAsync = (JCObject)classInstance.Invoke("SetReserveSpaceAsync", reserveSpace, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetReserveSpaceAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetSqlDialectAsync(int sqlDialect, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSqlDialectAsync = (JCObject)classInstance.Invoke("SetSqlDialectAsync", sqlDialect, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetSqlDialectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SetSweepIntervalAsync(int sweepInterval, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSweepIntervalAsync = (JCObject)classInstance.Invoke("SetSweepIntervalAsync", sweepInterval, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSetSweepIntervalAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ActivateShadows() throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ActivateShadows");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DatabaseOnline() throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DatabaseOnline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DatabaseOnline2(FbShutdownOnlineMode mode) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DatabaseOnline2", mode == null ? null : mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DatabaseShutdown(FbShutdownMode mode, int seconds) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DatabaseShutdown", mode == null ? null : mode.getJCOInstance(), seconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DatabaseShutdown2(FbShutdownOnlineMode mode, FbShutdownType type, int seconds) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DatabaseShutdown2", mode == null ? null : mode.getJCOInstance(), type == null ? null : type.getJCOInstance(), seconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NoLinger() throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NoLinger");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessMode(boolean readOnly) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAccessMode", readOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetForcedWrites(boolean forcedWrites) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetForcedWrites", forcedWrites);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPageBuffers(int pageBuffers) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPageBuffers", pageBuffers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetReserveSpace(boolean reserveSpace) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetReserveSpace", reserveSpace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSqlDialect(int sqlDialect) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSqlDialect", sqlDialect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSweepInterval(int sweepInterval) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MemberAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.NotImplementedException, system.ObjectDisposedException, system.io.IOException, system.OverflowException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSweepInterval", sweepInterval);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    


}