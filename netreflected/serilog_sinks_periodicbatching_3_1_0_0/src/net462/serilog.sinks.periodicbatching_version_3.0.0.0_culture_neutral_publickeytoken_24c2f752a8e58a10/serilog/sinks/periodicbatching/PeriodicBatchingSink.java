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

package serilog.sinks.periodicbatching;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import serilog.sinks.periodicbatching.IBatchedLogEventSink;
import serilog.sinks.periodicbatching.IBatchedLogEventSinkImplementation;
import serilog.sinks.periodicbatching.PeriodicBatchingSinkOptions;
import serilog.events.LogEvent;
import system.threading.tasks.Task;


/**
 * The base .NET class managing Serilog.Sinks.PeriodicBatching.PeriodicBatchingSink, Serilog.Sinks.PeriodicBatching, Version=3.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Serilog.Sinks.PeriodicBatching.PeriodicBatchingSink" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Serilog.Sinks.PeriodicBatching.PeriodicBatchingSink</a>
 */
public class PeriodicBatchingSink extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: Serilog.Sinks.PeriodicBatching, Version=3.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10
     */
    public static final String assemblyFullName = "Serilog.Sinks.PeriodicBatching, Version=3.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10";
    /**
     * Assembly name: Serilog.Sinks.PeriodicBatching
     */
    public static final String assemblyShortName = "Serilog.Sinks.PeriodicBatching";
    /**
     * Qualified class name: Serilog.Sinks.PeriodicBatching.PeriodicBatchingSink
     */
    public static final String className = "Serilog.Sinks.PeriodicBatching.PeriodicBatchingSink";
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
    public PeriodicBatchingSink(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PeriodicBatchingSink}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PeriodicBatchingSink} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PeriodicBatchingSink cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PeriodicBatchingSink(from.getJCOInstance());
    }

    // Constructors section
    
    public PeriodicBatchingSink() throws Throwable {
    }

    public PeriodicBatchingSink(IBatchedLogEventSink batchedSink, PeriodicBatchingSinkOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(batchedSink == null ? null : batchedSink.getJCOInstance(), options == null ? null : options.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Dispose() throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AggregateException, system.security.SecurityException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(LogEvent logEvent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.diagnostics.tracing.EventSourceException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Emit", logEvent == null ? null : logEvent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIBatchedLogEventSink method available in IBatchedLogEventSink to obtain an object with an invocable method
     */
    @Deprecated 
    public Task OnEmptyBatchAsync() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIBatchedLogEventSink to obtain the full interface.");
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
    


    // Instance Events section
    

}