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

package npgsql.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.SByte;
import system.Single;
import system.io.Stream;
import system.threading.tasks.Task;
import system.UInt16;
import system.UInt32;
import system.UInt64;
import npgsql.NpgsqlConnection;


/**
 * The base .NET class managing Npgsql.Internal.NpgsqlReadBuffer, Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Internal.NpgsqlReadBuffer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Internal.NpgsqlReadBuffer</a>
 */
public class NpgsqlReadBuffer extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql
     */
    public static final String assemblyShortName = "Npgsql";
    /**
     * Qualified class name: Npgsql.Internal.NpgsqlReadBuffer
     */
    public static final String className = "Npgsql.Internal.NpgsqlReadBuffer";
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
    public NpgsqlReadBuffer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NpgsqlReadBuffer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NpgsqlReadBuffer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NpgsqlReadBuffer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NpgsqlReadBuffer(from.getJCOInstance());
    }

    // Constructors section
    
    public NpgsqlReadBuffer() throws Throwable {
    }



    
    // Methods section
    
    public byte ReadByte() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Invoke("ReadByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char[] ReadChars(int byteLen) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ReadChars", byteLen);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            char[] resultingArray = new char[resultingArrayList.size()];
            for(int indexReadChars = 0; indexReadChars < resultingArrayList.size(); indexReadChars++ ) {
				resultingArray[indexReadChars] = (char)resultingArrayList.get(indexReadChars);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ReadDouble() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ReadDouble");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ReadDouble(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ReadDouble", littleEndian);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short ReadInt16() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("ReadInt16");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short ReadInt16(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("ReadInt16", littleEndian);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadInt32() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadInt32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadInt32(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadInt32", littleEndian);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadInt64() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadInt64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadInt64(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadInt64", littleEndian);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SByte ReadSByte() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSByte = (JCObject)classInstance.Invoke("ReadSByte");
            return new SByte(objReadSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single ReadSingle() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSingle = (JCObject)classInstance.Invoke("ReadSingle");
            return new Single(objReadSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single ReadSingle(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSingle = (JCObject)classInstance.Invoke("ReadSingle", littleEndian);
            return new Single(objReadSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetStream(int len, boolean canSeek) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetStream = (JCObject)classInstance.Invoke("GetStream", len, canSeek);
            return new Stream(objGetStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadNullTerminatedString() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadNullTerminatedString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadNullTerminatedStringRelaxed() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadNullTerminatedStringRelaxed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadString(int byteLen) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadString", byteLen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task Ensure(int count, boolean async) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnsure = (JCObject)classInstance.Invoke("Ensure", count, async);
            return new Task(objEnsure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task EnsureAsync(int count) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnsureAsync = (JCObject)classInstance.Invoke("EnsureAsync", count);
            return new Task(objEnsureAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task Skip(long len, boolean async) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSkip = (JCObject)classInstance.Invoke("Skip", len, async);
            return new Task(objSkip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 ReadUInt16() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt16 = (JCObject)classInstance.Invoke("ReadUInt16");
            return new UInt16(objReadUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 ReadUInt16(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt16 = (JCObject)classInstance.Invoke("ReadUInt16", littleEndian);
            return new UInt16(objReadUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 ReadUInt32() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt32 = (JCObject)classInstance.Invoke("ReadUInt32");
            return new UInt32(objReadUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 ReadUInt32(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt32 = (JCObject)classInstance.Invoke("ReadUInt32", littleEndian);
            return new UInt32(objReadUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 ReadUInt64() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt64 = (JCObject)classInstance.Invoke("ReadUInt64");
            return new UInt64(objReadUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 ReadUInt64(boolean littleEndian) throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt64 = (JCObject)classInstance.Invoke("ReadUInt64", littleEndian);
            return new UInt64(objReadUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadBytes(byte[] output, int outputOffset, int len) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadBytes", output, outputOffset, len);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadBytes(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadBytes", dupParam0.getJCRefOut(), dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public NpgsqlConnection getConnection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new NpgsqlConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}