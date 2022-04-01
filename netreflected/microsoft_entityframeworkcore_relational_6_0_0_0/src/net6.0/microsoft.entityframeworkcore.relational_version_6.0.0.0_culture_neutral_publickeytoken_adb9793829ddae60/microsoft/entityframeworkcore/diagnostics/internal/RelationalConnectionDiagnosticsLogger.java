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

package microsoft.entityframeworkcore.diagnostics.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.extensions.logging.ILoggerFactory;
import microsoft.extensions.logging.ILoggerFactoryImplementation;
import microsoft.entityframeworkcore.diagnostics.ILoggingOptions;
import microsoft.entityframeworkcore.diagnostics.ILoggingOptionsImplementation;
import system.diagnostics.DiagnosticSource;
import microsoft.entityframeworkcore.diagnostics.LoggingDefinitions;
import microsoft.entityframeworkcore.diagnostics.IDbContextLogger;
import microsoft.entityframeworkcore.diagnostics.IDbContextLoggerImplementation;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptions;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptionsImplementation;
import microsoft.entityframeworkcore.diagnostics.IInterceptors;
import microsoft.entityframeworkcore.diagnostics.IInterceptorsImplementation;
import system.DateTimeOffset;
import microsoft.entityframeworkcore.diagnostics.InterceptionResult;
import microsoft.entityframeworkcore.storage.IRelationalConnection;
import microsoft.entityframeworkcore.storage.IRelationalConnectionImplementation;
import system.threading.tasks.Task;
import system.TimeSpan;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalConnectionDiagnosticsLogger, Microsoft.EntityFrameworkCore.Relational, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalConnectionDiagnosticsLogger" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalConnectionDiagnosticsLogger</a>
 */
public class RelationalConnectionDiagnosticsLogger extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalConnectionDiagnosticsLogger
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Diagnostics.Internal.RelationalConnectionDiagnosticsLogger";
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
    public RelationalConnectionDiagnosticsLogger(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalConnectionDiagnosticsLogger}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalConnectionDiagnosticsLogger} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalConnectionDiagnosticsLogger cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalConnectionDiagnosticsLogger(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalConnectionDiagnosticsLogger() throws Throwable {
    }

    public RelationalConnectionDiagnosticsLogger(ILoggerFactory loggerFactory, ILoggingOptions loggingOptions, DiagnosticSource diagnosticSource, LoggingDefinitions loggingDefinitions, IDbContextLogger contextLogger, IDbContextOptions contextOptions, IInterceptors interceptors) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(loggerFactory == null ? null : loggerFactory.getJCOInstance(), loggingOptions == null ? null : loggingOptions.getJCOInstance(), diagnosticSource == null ? null : diagnosticSource.getJCOInstance(), loggingDefinitions == null ? null : loggingDefinitions.getJCOInstance(), contextLogger == null ? null : contextLogger.getJCOInstance(), contextOptions == null ? null : contextOptions.getJCOInstance(), interceptors == null ? null : interceptors.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean ShouldLogConnectionClose(DateTimeOffset now) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogConnectionClose", now == null ? null : now.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldLogConnectionOpen(DateTimeOffset now) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldLogConnectionOpen", now == null ? null : now.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult ConnectionClosing(IRelationalConnection connection, DateTimeOffset startTime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException, system.InvalidOperationException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectionClosing = (JCObject)classInstance.Invoke("ConnectionClosing", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance());
            return new InterceptionResult(objConnectionClosing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterceptionResult ConnectionOpening(IRelationalConnection connection, DateTimeOffset startTime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException, system.InvalidOperationException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectionOpening = (JCObject)classInstance.Invoke("ConnectionOpening", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance());
            return new InterceptionResult(objConnectionOpening);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectionClosedAsync(IRelationalConnection connection, DateTimeOffset startTime, TimeSpan duration) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectionClosedAsync = (JCObject)classInstance.Invoke("ConnectionClosedAsync", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance());
            return new Task(objConnectionClosedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectionErrorAsync(IRelationalConnection connection, NetException exception, DateTimeOffset startTime, TimeSpan duration, boolean logErrorAsDebug, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectionErrorAsync = (JCObject)classInstance.Invoke("ConnectionErrorAsync", connection == null ? null : connection.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), logErrorAsDebug, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objConnectionErrorAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectionOpenedAsync(IRelationalConnection connection, DateTimeOffset startTime, TimeSpan duration, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectionOpenedAsync = (JCObject)classInstance.Invoke("ConnectionOpenedAsync", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objConnectionOpenedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConnectionClosed(IRelationalConnection connection, DateTimeOffset startTime, TimeSpan duration) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConnectionClosed", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConnectionError(IRelationalConnection connection, NetException exception, DateTimeOffset startTime, TimeSpan duration, boolean logErrorAsDebug) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConnectionError", connection == null ? null : connection.getJCOInstance(), exception == null ? null : exception.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance(), logErrorAsDebug);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConnectionOpened(IRelationalConnection connection, DateTimeOffset startTime, TimeSpan duration) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConnectionOpened", connection == null ? null : connection.getJCOInstance(), startTime == null ? null : startTime.getJCOInstance(), duration == null ? null : duration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}