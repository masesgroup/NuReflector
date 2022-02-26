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
import system.data.common.DbCommand;
import firebirdsql.data.firebirdclient.FbConnection;
import firebirdsql.data.firebirdclient.FbTransaction;
import firebirdsql.data.firebirdclient.FbCommand;
import firebirdsql.data.firebirdclient.FbDataReader;
import system.data.CommandBehavior;
import firebirdsql.data.firebirdclient.FbParameter;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.threading.tasks.ValueTask;
import firebirdsql.data.firebirdclient.FbParameterCollection;
import system.data.CommandType;
import system.data.UpdateRowSource;
import system.ICloneable;
import system.ICloneableImplementation;


/**
 * The base .NET class managing FirebirdSql.Data.FirebirdClient.FbCommand, FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbCommand" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbCommand</a>
 */
public class FbCommand extends DbCommand implements system.ICloneable {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.FirebirdClient.FbCommand
     */
    public static final String className = "FirebirdSql.Data.FirebirdClient.FbCommand";
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
    public FbCommand(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FbCommand}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FbCommand} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FbCommand cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FbCommand(from.getJCOInstance());
    }

    // Constructors section
    
    public FbCommand() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbCommand(java.lang.String cmdText, FbConnection connection, FbTransaction transaction) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText, connection == null ? null : connection.getJCOInstance(), transaction == null ? null : transaction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbCommand(java.lang.String cmdText, FbConnection connection) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText, connection == null ? null : connection.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbCommand(java.lang.String cmdText) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cmdText));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static FbCommand CreateWithTypeCoercions(NetType[] expectedColumnTypes) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateWithTypeCoercions = (JCObject)classType.Invoke("CreateWithTypeCoercions", (java.lang.Object)toObjectFromArray(expectedColumnTypes));
            return new FbCommand(objCreateWithTypeCoercions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbDataReader ExecuteReaderNewFbCommand() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader");
            return new FbDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbDataReader ExecuteReaderNewFbCommand(CommandBehavior behavior) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OperationCanceledException, system.OutOfMemoryException, system.FormatException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader", behavior == null ? null : behavior.getJCOInstance());
            return new FbDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbParameter CreateParameterNewFbCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateParameter = (JCObject)classInstance.Invoke("CreateParameter");
            return new FbParameter(objCreateParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteNonQuery() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OperationCanceledException, system.OutOfMemoryException, system.FormatException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteNonQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ExecuteScalar() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OperationCanceledException, system.OutOfMemoryException, system.FormatException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteScalar = (JCObject)classInstance.Invoke("ExecuteScalar");
            return new NetObject(objExecuteScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCommandExplainedPlan() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCommandExplainedPlan");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCommandPlan() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCommandPlan");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task PrepareAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPrepareAsync = (JCObject)classInstance.Invoke("PrepareAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objPrepareAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask DisposeAsync() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDisposeAsync = (JCObject)classInstance.Invoke("DisposeAsync");
            return new ValueTask(objDisposeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OperationCanceledException, system.FormatException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICloneable method available in ICloneable to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject Clone() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICloneable to obtain the full interface.");
    }


    
    // Properties section
    
    public FbConnection getConnectionNewFbCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new FbConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(FbConnection Connection) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Connection", Connection == null ? null : Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbParameterCollection getParametersNewFbCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new FbParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FbTransaction getTransactionNewFbCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new FbTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(FbTransaction Transaction) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transaction", Transaction == null ? null : Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFetchSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("FetchSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFetchSize(int FetchSize) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FetchSize", FetchSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}