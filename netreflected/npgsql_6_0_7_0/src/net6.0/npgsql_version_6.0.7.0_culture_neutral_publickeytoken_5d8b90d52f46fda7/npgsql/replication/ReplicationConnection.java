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

package npgsql.replication;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.threading.tasks.ValueTask;
import npgsqltypes.NpgsqlLogSequenceNumber;
import system.text.Encoding;
import system.TimeSpan;
import system.Version;


/**
 * The base .NET class managing Npgsql.Replication.ReplicationConnection, Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Replication.ReplicationConnection" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Replication.ReplicationConnection</a>
 */
public class ReplicationConnection extends NetObject  {
    /**
     * Fully assembly qualified name: Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql
     */
    public static final String assemblyShortName = "Npgsql";
    /**
     * Qualified class name: Npgsql.Replication.ReplicationConnection
     */
    public static final String className = "Npgsql.Replication.ReplicationConnection";
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
    public ReplicationConnection(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ReplicationConnection}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ReplicationConnection} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ReplicationConnection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ReplicationConnection(from.getJCOInstance());
    }

    // Constructors section
    
    public ReplicationConnection() throws Throwable {
    }

    
    // Methods section
    
    public Task DropReplicationSlot(java.lang.String slotName, boolean wait, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDropReplicationSlot = (JCObject)classInstance.Invoke("DropReplicationSlot", slotName, wait, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDropReplicationSlot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task Open(CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SendStatusUpdate(CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSendStatusUpdate = (JCObject)classInstance.Invoke("SendStatusUpdate", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSendStatusUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask DisposeAsync() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDisposeAsync = (JCObject)classInstance.Invoke("DisposeAsync");
            return new ValueTask(objDisposeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetReplicationStatus(NpgsqlLogSequenceNumber lastAppliedAndFlushedLsn) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetReplicationStatus", lastAppliedAndFlushedLsn == null ? null : lastAppliedAndFlushedLsn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getProcessID() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ProcessID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NpgsqlLogSequenceNumber getLastAppliedLsn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastAppliedLsn");
            return new NpgsqlLogSequenceNumber(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastAppliedLsn(NpgsqlLogSequenceNumber LastAppliedLsn) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastAppliedLsn", LastAppliedLsn == null ? null : LastAppliedLsn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NpgsqlLogSequenceNumber getLastFlushedLsn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastFlushedLsn");
            return new NpgsqlLogSequenceNumber(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastFlushedLsn(NpgsqlLogSequenceNumber LastFlushedLsn) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastFlushedLsn", LastFlushedLsn == null ? null : LastFlushedLsn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NpgsqlLogSequenceNumber getLastReceivedLsn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastReceivedLsn");
            return new NpgsqlLogSequenceNumber(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastReceivedLsn(NpgsqlLogSequenceNumber LastReceivedLsn) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastReceivedLsn", LastReceivedLsn == null ? null : LastReceivedLsn.getJCOInstance());
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

    public void setConnectionString(java.lang.String ConnectionString) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.collections.generic.KeyNotFoundException, system.FormatException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConnectionString", ConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getServerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ServerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getEncoding() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Encoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getCommandTimeout() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CommandTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandTimeout(TimeSpan CommandTimeout) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandTimeout", CommandTimeout == null ? null : CommandTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getWalReceiverStatusInterval() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WalReceiverStatusInterval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWalReceiverStatusInterval(TimeSpan WalReceiverStatusInterval) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WalReceiverStatusInterval", WalReceiverStatusInterval == null ? null : WalReceiverStatusInterval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getWalReceiverTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WalReceiverTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWalReceiverTimeout(TimeSpan WalReceiverTimeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WalReceiverTimeout", WalReceiverTimeout == null ? null : WalReceiverTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getPostgreSqlVersion() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PostgreSqlVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}