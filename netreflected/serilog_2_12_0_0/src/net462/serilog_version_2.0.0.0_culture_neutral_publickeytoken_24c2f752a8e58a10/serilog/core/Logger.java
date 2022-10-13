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

package serilog.core;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import serilog.events.MessageTemplate;
import serilog.events.LogEventProperty;
import serilog.events.LogEventLevel;
import serilog.ILogger;
import serilog.ILoggerImplementation;
import serilog.core.ILogEventEnricher;
import serilog.core.ILogEventEnricherImplementation;
import serilog.events.LogEvent;
import serilog.core.ILogEventSink;
import serilog.core.ILogEventSinkImplementation;


/**
 * The base .NET class managing Serilog.Core.Logger, Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Serilog.Core.Logger" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Serilog.Core.Logger</a>
 */
public class Logger extends NetObject implements serilog.core.ILogEventSink, AutoCloseable {
    /**
     * Fully assembly qualified name: Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10
     */
    public static final String assemblyFullName = "Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10";
    /**
     * Assembly name: Serilog
     */
    public static final String assemblyShortName = "Serilog";
    /**
     * Qualified class name: Serilog.Core.Logger
     */
    public static final String className = "Serilog.Core.Logger";
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
    public Logger(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Logger}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Logger} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Logger cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Logger(from.getJCOInstance());
    }

    // Constructors section
    
    public Logger() throws Throwable {
    }



    
    // Methods section
    
    public boolean BindProperty(java.lang.String propertyName, NetObject value, boolean destructureObjects, JCORefOut<LogEventProperty> property) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotImplementedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("BindProperty", propertyName, value == null ? null : value.getJCOInstance(), destructureObjects, property.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEnabled(LogEventLevel level) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEnabled", level == null ? null : level.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILogger ForContext(ILogEventEnricher enricher) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objForContext = (JCObject)classInstance.Invoke("ForContext", enricher == null ? null : enricher.getJCOInstance());
            return new ILoggerImplementation(objForContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILogger ForContext(java.lang.String propertyName, NetObject value, boolean destructureObjects) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.NullReferenceException, system.NotImplementedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objForContext = (JCObject)classInstance.Invoke("ForContext", propertyName, value == null ? null : value.getJCOInstance(), destructureObjects);
            return new ILoggerImplementation(objForContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ILogger ForContext(NetType source) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.NotImplementedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objForContext = (JCObject)classInstance.Invoke("ForContext", source == null ? null : source.getJCOInstance());
            return new ILoggerImplementation(objForContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Debug(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Debug", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Debug(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Debug", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Debug(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Debug", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Debug(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Debug", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Error(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Error", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Error(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Error", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Error(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Error", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Error(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Error", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fatal(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Fatal", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fatal(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Fatal", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fatal(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Fatal", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fatal(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Fatal", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Information(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Information", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Information(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Information", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Information(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Information", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Information(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Information", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Verbose(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Verbose", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Verbose(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Verbose", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Verbose(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Verbose", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Verbose(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Verbose", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Warning(NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Warning", exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Warning(NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Warning", exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Warning(java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Warning", messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Warning(java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Warning", messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(LogEvent logEvent) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", logEvent == null ? null : logEvent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(LogEventLevel level, NetException exception, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", level == null ? null : level.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(LogEventLevel level, NetException exception, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.NotImplementedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", level == null ? null : level.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(LogEventLevel level, java.lang.String messageTemplate) throws Throwable, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", level == null ? null : level.getJCOInstance(), messageTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(LogEventLevel level, java.lang.String messageTemplate, NetObject... propertyValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", level == null ? null : level.getJCOInstance(), messageTemplate, toObjectFromArray(propertyValues));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToILogEventSink method available in ILogEventSink to obtain an object with an invocable method
     */
    @Deprecated 
    public void Emit(LogEvent logEvent) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToILogEventSink to obtain the full interface.");
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
    
    public static ILogger getNone() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("None");
            return new ILoggerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}