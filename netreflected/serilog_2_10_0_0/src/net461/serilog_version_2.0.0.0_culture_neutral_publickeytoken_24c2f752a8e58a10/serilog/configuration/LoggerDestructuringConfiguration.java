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

package serilog.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import serilog.LoggerConfiguration;
import serilog.core.IDestructuringPolicy;
import serilog.core.IDestructuringPolicyImplementation;


/**
 * The base .NET class managing Serilog.Configuration.LoggerDestructuringConfiguration, Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Serilog.Configuration.LoggerDestructuringConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Serilog.Configuration.LoggerDestructuringConfiguration</a>
 */
public class LoggerDestructuringConfiguration extends NetObject  {
    /**
     * Fully assembly qualified name: Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10
     */
    public static final String assemblyFullName = "Serilog, Version=2.0.0.0, Culture=neutral, PublicKeyToken=24c2f752a8e58a10";
    /**
     * Assembly name: Serilog
     */
    public static final String assemblyShortName = "Serilog";
    /**
     * Qualified class name: Serilog.Configuration.LoggerDestructuringConfiguration
     */
    public static final String className = "Serilog.Configuration.LoggerDestructuringConfiguration";
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
    public LoggerDestructuringConfiguration(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LoggerDestructuringConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LoggerDestructuringConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LoggerDestructuringConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LoggerDestructuringConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public LoggerDestructuringConfiguration() throws Throwable {
    }



    
    // Methods section
    
    public LoggerConfiguration AsScalar(NetType scalarType) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAsScalar = (JCObject)classInstance.Invoke("AsScalar", scalarType == null ? null : scalarType.getJCOInstance());
            return new LoggerConfiguration(objAsScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoggerConfiguration ToMaximumCollectionCount(int maximumCollectionCount) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToMaximumCollectionCount = (JCObject)classInstance.Invoke("ToMaximumCollectionCount", maximumCollectionCount);
            return new LoggerConfiguration(objToMaximumCollectionCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoggerConfiguration ToMaximumDepth(int maximumDestructuringDepth) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToMaximumDepth = (JCObject)classInstance.Invoke("ToMaximumDepth", maximumDestructuringDepth);
            return new LoggerConfiguration(objToMaximumDepth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoggerConfiguration ToMaximumStringLength(int maximumStringLength) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToMaximumStringLength = (JCObject)classInstance.Invoke("ToMaximumStringLength", maximumStringLength);
            return new LoggerConfiguration(objToMaximumStringLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoggerConfiguration With(IDestructuringPolicy... destructuringPolicies) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWith = (JCObject)classInstance.Invoke("With", (java.lang.Object)toObjectFromArray(destructuringPolicies));
            return new LoggerConfiguration(objWith);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}