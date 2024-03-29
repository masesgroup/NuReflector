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
import serilog.configuration.LoggerAuditSinkConfiguration;
import serilog.events.LogEventLevel;
import system.net.http.HttpMessageHandler;
import serilog.configuration.LoggerSinkConfiguration;


/**
 * The base .NET class managing Serilog.SeqLoggerConfigurationExtensions, Serilog.Sinks.Seq, Version=5.2.1.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Serilog.SeqLoggerConfigurationExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Serilog.SeqLoggerConfigurationExtensions</a>
 */
public class SeqLoggerConfigurationExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Serilog.Sinks.Seq, Version=5.2.1.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10
     */
    public static final String assemblyFullName = "Serilog.Sinks.Seq, Version=5.2.1.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10";
    /**
     * Assembly name: Serilog.Sinks.Seq
     */
    public static final String assemblyShortName = "Serilog.Sinks.Seq";
    /**
     * Qualified class name: Serilog.SeqLoggerConfigurationExtensions
     */
    public static final String className = "Serilog.SeqLoggerConfigurationExtensions";
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
    public SeqLoggerConfigurationExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SeqLoggerConfigurationExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SeqLoggerConfigurationExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SeqLoggerConfigurationExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SeqLoggerConfigurationExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public SeqLoggerConfigurationExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static LoggerConfiguration Seq(LoggerAuditSinkConfiguration loggerAuditSinkConfiguration, java.lang.String serverUrl, LogEventLevel restrictedToMinimumLevel, java.lang.String apiKey, HttpMessageHandler messageHandler) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSeq = (JCObject)classType.Invoke("Seq", loggerAuditSinkConfiguration == null ? null : loggerAuditSinkConfiguration.getJCOInstance(), serverUrl, restrictedToMinimumLevel == null ? null : restrictedToMinimumLevel.getJCOInstance(), apiKey, messageHandler == null ? null : messageHandler.getJCOInstance());
            return new LoggerConfiguration(objSeq);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}