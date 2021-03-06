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

package graphql.execution;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.tasks.Task;
import graphql.execution.IExecutionContext;
import graphql.execution.IExecutionContextImplementation;
import graphql.validation.IValidationResult;
import graphql.validation.IValidationResultImplementation;


/**
 * The base .NET class managing GraphQL.Execution.IDocumentExecutionListener, GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/GraphQL.Execution.IDocumentExecutionListener" target="_top">https://docs.microsoft.com/en-us/dotnet/api/GraphQL.Execution.IDocumentExecutionListener</a>
 */
public class IDocumentExecutionListenerImplementation extends NetObject implements IDocumentExecutionListener {
    /**
     * Fully assembly qualified name: GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "GraphQL, Version=4.6.1.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: GraphQL
     */
    public static final String assemblyShortName = "GraphQL";
    /**
     * Qualified class name: GraphQL.Execution.IDocumentExecutionListener
     */
    public static final String className = "GraphQL.Execution.IDocumentExecutionListener";
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
    public IDocumentExecutionListenerImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDocumentExecutionListener}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDocumentExecutionListener} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDocumentExecutionListener ToIDocumentExecutionListener(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IDocumentExecutionListenerImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public Task AfterExecutionAsync(IExecutionContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAfterExecutionAsync = (JCObject)classInstance.Invoke("AfterExecutionAsync", context == null ? null : context.getJCOInstance());
            return new Task(objAfterExecutionAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task AfterValidationAsync(IExecutionContext context, IValidationResult validationResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAfterValidationAsync = (JCObject)classInstance.Invoke("AfterValidationAsync", context == null ? null : context.getJCOInstance(), validationResult == null ? null : validationResult.getJCOInstance());
            return new Task(objAfterValidationAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task BeforeExecutionAsync(IExecutionContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeforeExecutionAsync = (JCObject)classInstance.Invoke("BeforeExecutionAsync", context == null ? null : context.getJCOInstance());
            return new Task(objBeforeExecutionAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task BeforeExecutionAwaitedAsync(IExecutionContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeforeExecutionAwaitedAsync = (JCObject)classInstance.Invoke("BeforeExecutionAwaitedAsync", context == null ? null : context.getJCOInstance());
            return new Task(objBeforeExecutionAwaitedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task BeforeExecutionStepAwaitedAsync(IExecutionContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeforeExecutionStepAwaitedAsync = (JCObject)classInstance.Invoke("BeforeExecutionStepAwaitedAsync", context == null ? null : context.getJCOInstance());
            return new Task(objBeforeExecutionStepAwaitedAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}