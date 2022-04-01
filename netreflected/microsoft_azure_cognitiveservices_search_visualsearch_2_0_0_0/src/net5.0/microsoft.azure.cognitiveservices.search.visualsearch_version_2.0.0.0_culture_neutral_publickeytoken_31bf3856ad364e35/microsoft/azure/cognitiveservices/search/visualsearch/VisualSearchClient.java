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

package microsoft.azure.cognitiveservices.search.visualsearch;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.rest.ServiceClientCredentials;
import system.net.http.DelegatingHandler;
import system.net.http.HttpClient;
import system.net.http.HttpClientHandler;
import microsoft.azure.cognitiveservices.search.visualsearch.IImages;
import microsoft.azure.cognitiveservices.search.visualsearch.IImagesImplementation;
import newtonsoft.json.JsonSerializerSettings;


/**
 * The base .NET class managing Microsoft.Azure.CognitiveServices.Search.VisualSearch.VisualSearchClient, Microsoft.Azure.CognitiveServices.Search.VisualSearch, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.Search.VisualSearch.VisualSearchClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.Search.VisualSearch.VisualSearchClient</a>
 */
public class VisualSearchClient extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.CognitiveServices.Search.VisualSearch, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.CognitiveServices.Search.VisualSearch, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.CognitiveServices.Search.VisualSearch
     */
    public static final String assemblyShortName = "Microsoft.Azure.CognitiveServices.Search.VisualSearch";
    /**
     * Qualified class name: Microsoft.Azure.CognitiveServices.Search.VisualSearch.VisualSearchClient
     */
    public static final String className = "Microsoft.Azure.CognitiveServices.Search.VisualSearch.VisualSearchClient";
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
    public VisualSearchClient(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link VisualSearchClient}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link VisualSearchClient} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static VisualSearchClient cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VisualSearchClient(from.getJCOInstance());
    }

    // Constructors section
    
    public VisualSearchClient() throws Throwable {
    }

    public VisualSearchClient(ServiceClientCredentials credentials, DelegatingHandler... handlers) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.reflection.AmbiguousMatchException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, newtonsoft.json.JsonException, system.runtime.serialization.SerializationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(credentials == null ? null : credentials.getJCOInstance(), toObjectFromArray(handlers)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VisualSearchClient(ServiceClientCredentials credentials, HttpClient httpClient, boolean disposeHttpClient) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.reflection.AmbiguousMatchException, system.ArgumentException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, newtonsoft.json.JsonException, system.runtime.serialization.SerializationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(credentials == null ? null : credentials.getJCOInstance(), httpClient == null ? null : httpClient.getJCOInstance(), disposeHttpClient));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VisualSearchClient(ServiceClientCredentials credentials, HttpClientHandler rootHandler, DelegatingHandler... handlers) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.reflection.AmbiguousMatchException, system.ArgumentException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, newtonsoft.json.JsonSerializationException, system.collections.generic.KeyNotFoundException, newtonsoft.json.JsonException, system.runtime.serialization.SerializationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(credentials == null ? null : credentials.getJCOInstance(), rootHandler == null ? null : rootHandler.getJCOInstance(), toObjectFromArray(handlers)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    
    public IImages getImages() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Images");
            return new IImagesImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImages(IImages Images) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Images", Images == null ? null : Images.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceClientCredentials getCredentials() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Credentials");
            return new ServiceClientCredentials(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCredentials(ServiceClientCredentials Credentials) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Credentials", Credentials == null ? null : Credentials.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonSerializerSettings getDeserializationSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeserializationSettings");
            return new JsonSerializerSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeserializationSettings(JsonSerializerSettings DeserializationSettings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DeserializationSettings", DeserializationSettings == null ? null : DeserializationSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonSerializerSettings getSerializationSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SerializationSettings");
            return new JsonSerializerSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSerializationSettings(JsonSerializerSettings SerializationSettings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SerializationSettings", SerializationSettings == null ? null : SerializationSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEndpoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Endpoint");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEndpoint(java.lang.String Endpoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Endpoint", Endpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}