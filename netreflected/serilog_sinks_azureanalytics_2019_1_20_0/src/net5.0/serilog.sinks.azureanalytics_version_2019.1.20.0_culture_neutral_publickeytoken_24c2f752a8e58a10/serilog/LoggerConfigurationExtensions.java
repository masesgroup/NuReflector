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

package serilog;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import serilog.LoggerConfiguration;
import serilog.configuration.LoggerSinkConfiguration;
import serilog.sinks.azureanalytics.ConfigurationSettings;
import serilog.events.LogEventLevel;
import serilog.core.LoggingLevelSwitch;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import serilog.sinks.azureanalytics.AzureOfferingType;


/**
 * The base .NET class managing Serilog.LoggerConfigurationExtensions, Serilog.Sinks.AzureAnalytics, Version=2019.1.20.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Serilog.LoggerConfigurationExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Serilog.LoggerConfigurationExtensions</a>
 */
public class LoggerConfigurationExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Serilog.Sinks.AzureAnalytics, Version=2019.1.20.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10
     */
    public static final String assemblyFullName = "Serilog.Sinks.AzureAnalytics, Version=2019.1.20.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10";
    /**
     * Assembly name: Serilog.Sinks.AzureAnalytics
     */
    public static final String assemblyShortName = "Serilog.Sinks.AzureAnalytics";
    /**
     * Qualified class name: Serilog.LoggerConfigurationExtensions
     */
    public static final String className = "Serilog.LoggerConfigurationExtensions";
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
    public LoggerConfigurationExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LoggerConfigurationExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LoggerConfigurationExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LoggerConfigurationExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LoggerConfigurationExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public LoggerConfigurationExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static LoggerConfiguration AzureAnalytics(LoggerSinkConfiguration loggerConfiguration, java.lang.String workspaceId, java.lang.String authenticationId, ConfigurationSettings loggerSettings, LogEventLevel restrictedToMinimumLevel, LoggingLevelSwitch levelSwitch) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.OperationCanceledException, system.threading.SemaphoreFullException, system.diagnostics.tracing.EventSourceException, system.FormatException, newtonsoft.json.JsonException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, system.runtime.serialization.SerializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAzureAnalytics = (JCObject)classType.Invoke("AzureAnalytics", loggerConfiguration == null ? null : loggerConfiguration.getJCOInstance(), workspaceId, authenticationId, loggerSettings == null ? null : loggerSettings.getJCOInstance(), restrictedToMinimumLevel == null ? null : restrictedToMinimumLevel.getJCOInstance(), levelSwitch == null ? null : levelSwitch.getJCOInstance());
            return new LoggerConfiguration(objAzureAnalytics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LoggerConfiguration AzureAnalytics(LoggerSinkConfiguration loggerConfiguration, java.lang.String workspaceId, java.lang.String authenticationId, java.lang.String logName, LogEventLevel restrictedToMinimumLevel, boolean storeTimestampInUtc, IFormatProvider formatProvider, int logBufferSize, int batchSize, AzureOfferingType azureOfferingType, LoggingLevelSwitch levelSwitch, boolean flattenObject) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.OperationCanceledException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException, newtonsoft.json.JsonException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, system.runtime.serialization.SerializationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAzureAnalytics = (JCObject)classType.Invoke("AzureAnalytics", loggerConfiguration == null ? null : loggerConfiguration.getJCOInstance(), workspaceId, authenticationId, logName, restrictedToMinimumLevel == null ? null : restrictedToMinimumLevel.getJCOInstance(), storeTimestampInUtc, formatProvider == null ? null : formatProvider.getJCOInstance(), logBufferSize, batchSize, azureOfferingType == null ? null : azureOfferingType.getJCOInstance(), levelSwitch == null ? null : levelSwitch.getJCOInstance(), flattenObject);
            return new LoggerConfiguration(objAzureAnalytics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LoggerConfiguration AzureLogAnalytics(LoggerSinkConfiguration loggerConfiguration, java.lang.String workspaceId, java.lang.String authenticationId, java.lang.String logName, LogEventLevel restrictedToMinimumLevel, boolean storeTimestampInUtc, IFormatProvider formatProvider, int logBufferSize, int batchSize, AzureOfferingType azureOfferingType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.OperationCanceledException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException, newtonsoft.json.JsonException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, system.runtime.serialization.SerializationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAzureLogAnalytics = (JCObject)classType.Invoke("AzureLogAnalytics", loggerConfiguration == null ? null : loggerConfiguration.getJCOInstance(), workspaceId, authenticationId, logName, restrictedToMinimumLevel == null ? null : restrictedToMinimumLevel.getJCOInstance(), storeTimestampInUtc, formatProvider == null ? null : formatProvider.getJCOInstance(), logBufferSize, batchSize, azureOfferingType == null ? null : azureOfferingType.getJCOInstance());
            return new LoggerConfiguration(objAzureLogAnalytics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}