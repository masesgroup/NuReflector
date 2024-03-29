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

package firebirdsql.data.firebirdclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbTransaction;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import firebirdsql.data.firebirdclient.FbConnection;
import system.data.IsolationLevel;


/**
 * The base .NET class managing FirebirdSql.Data.FirebirdClient.FbTransaction, FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbTransaction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbTransaction</a>
 */
public class FbTransaction extends DbTransaction  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.FirebirdClient.FbTransaction
     */
    public static final String className = "FirebirdSql.Data.FirebirdClient.FbTransaction";
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
    public FbTransaction(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FbTransaction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FbTransaction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FbTransaction cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FbTransaction(from.getJCOInstance());
    }

    // Constructors section
    
    public FbTransaction() throws Throwable {
    }



    
    // Methods section
    
    public Task CommitAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommitAsync = (JCObject)classInstance.Invoke("CommitAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCommitAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CommitRetainingAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCommitRetainingAsync = (JCObject)classInstance.Invoke("CommitRetainingAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCommitRetainingAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ReleaseAsync(java.lang.String savePointName, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleaseAsync = (JCObject)classInstance.Invoke("ReleaseAsync", savePointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objReleaseAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RollbackAsync(java.lang.String savePointName, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollbackAsync = (JCObject)classInstance.Invoke("RollbackAsync", savePointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRollbackAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RollbackAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollbackAsync = (JCObject)classInstance.Invoke("RollbackAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRollbackAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task RollbackRetainingAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRollbackRetainingAsync = (JCObject)classInstance.Invoke("RollbackRetainingAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRollbackRetainingAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SaveAsync(java.lang.String savePointName, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSaveAsync = (JCObject)classInstance.Invoke("SaveAsync", savePointName, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSaveAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Commit() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Commit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommitRetaining() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CommitRetaining");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Release(java.lang.String savePointName) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Release", savePointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rollback() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rollback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rollback(java.lang.String savePointName) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rollback", savePointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RollbackRetaining() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RollbackRetaining");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String savePointName) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", savePointName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public FbConnection getConnectionNewFbTransaction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new FbConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}