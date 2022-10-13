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

package oracle.entityframeworkcore.storage.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.storage.RelationalTransaction;
import microsoft.entityframeworkcore.storage.IRelationalConnection;
import microsoft.entityframeworkcore.storage.IRelationalConnectionImplementation;
import system.data.common.DbTransaction;
import system.Guid;
import system.threading.tasks.Task;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Oracle.EntityFrameworkCore.Storage.Internal.OracleTransaction, Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Oracle.EntityFrameworkCore.Storage.Internal.OracleTransaction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Oracle.EntityFrameworkCore.Storage.Internal.OracleTransaction</a>
 */
public class OracleTransaction extends RelationalTransaction  {
    /**
     * Fully assembly qualified name: Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Oracle.EntityFrameworkCore";
    /**
     * Qualified class name: Oracle.EntityFrameworkCore.Storage.Internal.OracleTransaction
     */
    public static final String className = "Oracle.EntityFrameworkCore.Storage.Internal.OracleTransaction";
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
    public OracleTransaction(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OracleTransaction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OracleTransaction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OracleTransaction cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OracleTransaction(from.getJCOInstance());
    }

    // Constructors section
    
    public OracleTransaction() throws Throwable {
    }



    
    // Methods section
    
    public Task CreateSavepointAsync(java.lang.String savepointName, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSavepointAsync = (JCObject)classInstance.Invoke("CreateSavepointAsync", savepointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCreateSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ReleaseAsync(java.lang.String savepointName, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleaseAsync = (JCObject)classInstance.Invoke("ReleaseAsync", savepointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objReleaseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ReleaseSavepointAsync(java.lang.String name, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleaseSavepointAsync = (JCObject)classInstance.Invoke("ReleaseSavepointAsync", name, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objReleaseSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RollbackToSavepointAsync(java.lang.String savepointName, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollbackToSavepointAsync = (JCObject)classInstance.Invoke("RollbackToSavepointAsync", savepointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRollbackToSavepointAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateSavepoint(java.lang.String savepointName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.ArrayTypeMismatchException, system.threading.WaitHandleCannotBeOpenedException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateSavepoint", savepointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Release(java.lang.String savepointName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Release", savepointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseSavepoint(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseSavepoint", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RollbackToSavepoint(java.lang.String savepointName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.BadImageFormatException, system.ArrayTypeMismatchException, system.threading.WaitHandleCannotBeOpenedException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RollbackToSavepoint", savepointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAreSavepointsSupported() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreSavepointsSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}