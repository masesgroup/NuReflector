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

package microsoft.azure.functions.worker.http;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.functions.worker.http.HttpResponseData;
import microsoft.azure.functions.worker.http.HttpRequestData;
import system.net.HttpStatusCode;
import system.text.Encoding;


/**
 * The base .NET class managing Microsoft.Azure.Functions.Worker.Http.HttpRequestDataExtensions, Microsoft.Azure.Functions.Worker.Core, Version=1.8.0.0, Culture=neutral, PublicKeyToken=551316b6919f366c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Functions.Worker.Http.HttpRequestDataExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Functions.Worker.Http.HttpRequestDataExtensions</a>
 */
public class HttpRequestDataExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Functions.Worker.Core, Version=1.8.0.0, Culture=neutral, PublicKeyToken=551316b6919f366c
     */
    public static final String assemblyFullName = "Microsoft.Azure.Functions.Worker.Core, Version=1.8.0.0, Culture=neutral, PublicKeyToken=551316b6919f366c";
    /**
     * Assembly name: Microsoft.Azure.Functions.Worker.Core
     */
    public static final String assemblyShortName = "Microsoft.Azure.Functions.Worker.Core";
    /**
     * Qualified class name: Microsoft.Azure.Functions.Worker.Http.HttpRequestDataExtensions
     */
    public static final String className = "Microsoft.Azure.Functions.Worker.Http.HttpRequestDataExtensions";
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
    public HttpRequestDataExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HttpRequestDataExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HttpRequestDataExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HttpRequestDataExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HttpRequestDataExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public HttpRequestDataExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static HttpResponseData CreateResponse(HttpRequestData request, HttpStatusCode statusCode) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateResponse = (JCObject)classType.Invoke("CreateResponse", request == null ? null : request.getJCOInstance(), statusCode == null ? null : statusCode.getJCOInstance());
            return new HttpResponseData(objCreateResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ReadAsString(HttpRequestData request, Encoding encoding) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ReadAsString", request == null ? null : request.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}