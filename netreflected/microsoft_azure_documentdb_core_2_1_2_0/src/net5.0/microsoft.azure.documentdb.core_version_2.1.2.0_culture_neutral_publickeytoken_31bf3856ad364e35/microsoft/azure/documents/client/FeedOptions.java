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

package microsoft.azure.documents.client;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.documents.PartitionKey;
import newtonsoft.json.JsonSerializerSettings;


/**
 * The base .NET class managing Microsoft.Azure.Documents.Client.FeedOptions, Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Client.FeedOptions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Client.FeedOptions</a>
 */
public class FeedOptions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.DocumentDB.Core
     */
    public static final String assemblyShortName = "Microsoft.Azure.DocumentDB.Core";
    /**
     * Qualified class name: Microsoft.Azure.Documents.Client.FeedOptions
     */
    public static final String className = "Microsoft.Azure.Documents.Client.FeedOptions";
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
    public FeedOptions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FeedOptions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FeedOptions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FeedOptions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FeedOptions(from.getJCOInstance());
    }

    // Constructors section
    
    public FeedOptions() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getDisableRUPerMinuteUsage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DisableRUPerMinuteUsage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisableRUPerMinuteUsage(boolean DisableRUPerMinuteUsage) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisableRUPerMinuteUsage", DisableRUPerMinuteUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableCrossPartitionQuery() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableCrossPartitionQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableCrossPartitionQuery(boolean EnableCrossPartitionQuery) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnableCrossPartitionQuery", EnableCrossPartitionQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPopulateQueryMetrics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("PopulateQueryMetrics");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPopulateQueryMetrics(boolean PopulateQueryMetrics) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PopulateQueryMetrics", PopulateQueryMetrics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxBufferedItemCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxBufferedItemCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxBufferedItemCount(int MaxBufferedItemCount) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxBufferedItemCount", MaxBufferedItemCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxDegreeOfParallelism() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxDegreeOfParallelism");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxDegreeOfParallelism(int MaxDegreeOfParallelism) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxDegreeOfParallelism", MaxDegreeOfParallelism);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PartitionKey getPartitionKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PartitionKey");
            return new PartitionKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartitionKey(PartitionKey PartitionKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PartitionKey", PartitionKey == null ? null : PartitionKey.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonSerializerSettings getJsonSerializerSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("JsonSerializerSettings");
            return new JsonSerializerSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setJsonSerializerSettings(JsonSerializerSettings JsonSerializerSettings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("JsonSerializerSettings", JsonSerializerSettings == null ? null : JsonSerializerSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPartitionKeyRangeId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PartitionKeyRangeId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartitionKeyRangeId(java.lang.String PartitionKeyRangeId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PartitionKeyRangeId", PartitionKeyRangeId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRequestContinuation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RequestContinuation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequestContinuation(java.lang.String RequestContinuation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RequestContinuation", RequestContinuation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSessionToken() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SessionToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSessionToken(java.lang.String SessionToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SessionToken", SessionToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}