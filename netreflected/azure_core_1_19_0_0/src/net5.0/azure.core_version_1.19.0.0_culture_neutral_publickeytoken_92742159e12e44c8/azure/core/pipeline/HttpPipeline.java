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

package azure.core.pipeline;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import azure.core.pipeline.HttpPipelineTransport;
import azure.core.pipeline.HttpPipelinePolicy;
import azure.core.ResponseClassifier;
import azure.core.HttpMessage;
import azure.core.Request;
import azure.Response;
import system.threading.CancellationToken;
import system.IDisposable;
import system.IDisposableImplementation;
import system.threading.tasks.ValueTask;


/**
 * The base .NET class managing Azure.Core.Pipeline.HttpPipeline, Azure.Core, Version=1.19.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Azure.Core.Pipeline.HttpPipeline" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Azure.Core.Pipeline.HttpPipeline</a>
 */
public class HttpPipeline extends NetObject  {
    /**
     * Fully assembly qualified name: Azure.Core, Version=1.19.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8
     */
    public static final String assemblyFullName = "Azure.Core, Version=1.19.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8";
    /**
     * Assembly name: Azure.Core
     */
    public static final String assemblyShortName = "Azure.Core";
    /**
     * Qualified class name: Azure.Core.Pipeline.HttpPipeline
     */
    public static final String className = "Azure.Core.Pipeline.HttpPipeline";
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
    public HttpPipeline(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HttpPipeline}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HttpPipeline} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HttpPipeline cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HttpPipeline(from.getJCOInstance());
    }

    // Constructors section
    
    public HttpPipeline() throws Throwable {
    }

    public HttpPipeline(HttpPipelineTransport transport, HttpPipelinePolicy[] policies, ResponseClassifier responseClassifier) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(transport == null ? null : transport.getJCOInstance(), toObjectFromArray(policies), responseClassifier == null ? null : responseClassifier.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public HttpMessage CreateMessage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMessage = (JCObject)classInstance.Invoke("CreateMessage");
            return new HttpMessage(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Request CreateRequest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateRequest = (JCObject)classInstance.Invoke("CreateRequest");
            return new Request(objCreateRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Response SendRequest(Request request, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSendRequest = (JCObject)classInstance.Invoke("SendRequest", request == null ? null : request.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Response(objSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDisposable CreateClientRequestIdScope(java.lang.String clientRequestId) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateClientRequestIdScope = (JCObject)classType.Invoke("CreateClientRequestIdScope", clientRequestId);
            return new IDisposableImplementation(objCreateClientRequestIdScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask SendAsync(HttpMessage message, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSendAsync = (JCObject)classInstance.Invoke("SendAsync", message == null ? null : message.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new ValueTask(objSendAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Send(HttpMessage message, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Send", message == null ? null : message.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ResponseClassifier getResponseClassifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ResponseClassifier");
            return new ResponseClassifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}