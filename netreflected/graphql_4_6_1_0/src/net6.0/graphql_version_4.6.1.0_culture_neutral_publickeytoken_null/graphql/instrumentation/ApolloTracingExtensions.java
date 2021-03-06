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

package graphql.instrumentation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import graphql.instrumentation.ApolloTrace;
import graphql.instrumentation.PerfRecord;
import system.DateTime;
import graphql.ExecutionResult;


/**
 * The base .NET class managing GraphQL.Instrumentation.ApolloTracingExtensions, GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/GraphQL.Instrumentation.ApolloTracingExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/GraphQL.Instrumentation.ApolloTracingExtensions</a>
 */
public class ApolloTracingExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: GraphQL
     */
    public static final String assemblyShortName = "GraphQL";
    /**
     * Qualified class name: GraphQL.Instrumentation.ApolloTracingExtensions
     */
    public static final String className = "GraphQL.Instrumentation.ApolloTracingExtensions";
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
    public ApolloTracingExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ApolloTracingExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ApolloTracingExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ApolloTracingExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ApolloTracingExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public ApolloTracingExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static ApolloTrace CreateTrace(PerfRecord[] perf, DateTime start) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTrace = (JCObject)classType.Invoke("CreateTrace", toObjectFromArray(perf), start == null ? null : start.getJCOInstance());
            return new ApolloTrace(objCreateTrace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnrichWithApolloTracing(ExecutionResult result, DateTime start) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.OverflowException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EnrichWithApolloTracing", result == null ? null : result.getJCOInstance(), start == null ? null : start.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}