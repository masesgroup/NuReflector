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

package microsoft.azure.cosmos;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.cosmos.ClientEncryptionPolicy;
import microsoft.azure.cosmos.ConflictResolutionPolicy;
import microsoft.azure.cosmos.GeospatialConfig;
import microsoft.azure.cosmos.IndexingPolicy;
import microsoft.azure.cosmos.UniqueKeyPolicy;


/**
 * The base .NET class managing Microsoft.Azure.Cosmos.ContainerProperties, Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.ContainerProperties" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.ContainerProperties</a>
 */
public class ContainerProperties extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Client
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Client";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.ContainerProperties
     */
    public static final String className = "Microsoft.Azure.Cosmos.ContainerProperties";
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
    public ContainerProperties(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ContainerProperties}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ContainerProperties} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ContainerProperties cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ContainerProperties(from.getJCOInstance());
    }

    // Constructors section
    
    public ContainerProperties() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContainerProperties(java.lang.String id, java.lang.String partitionKeyPath) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.resources.MissingManifestResourceException, newtonsoft.json.JsonSerializationException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.InvalidCastException, system.NotImplementedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(id, partitionKeyPath));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public ClientEncryptionPolicy getClientEncryptionPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientEncryptionPolicy");
            return new ClientEncryptionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientEncryptionPolicy(ClientEncryptionPolicy ClientEncryptionPolicy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClientEncryptionPolicy", ClientEncryptionPolicy == null ? null : ClientEncryptionPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConflictResolutionPolicy getConflictResolutionPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConflictResolutionPolicy");
            return new ConflictResolutionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConflictResolutionPolicy(ConflictResolutionPolicy ConflictResolutionPolicy) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConflictResolutionPolicy", ConflictResolutionPolicy == null ? null : ConflictResolutionPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeospatialConfig getGeospatialConfig() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("GeospatialConfig");
            return new GeospatialConfig(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGeospatialConfig(GeospatialConfig GeospatialConfig) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GeospatialConfig", GeospatialConfig == null ? null : GeospatialConfig.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexingPolicy getIndexingPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IndexingPolicy");
            return new IndexingPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIndexingPolicy(IndexingPolicy IndexingPolicy) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IndexingPolicy", IndexingPolicy == null ? null : IndexingPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UniqueKeyPolicy getUniqueKeyPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UniqueKeyPolicy");
            return new UniqueKeyPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUniqueKeyPolicy(UniqueKeyPolicy UniqueKeyPolicy) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UniqueKeyPolicy", UniqueKeyPolicy == null ? null : UniqueKeyPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getETag() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ETag");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setETag(java.lang.String ETag) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ETag", ETag);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Id", Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPartitionKeyPath() throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.FormatException, system.OverflowException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PartitionKeyPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartitionKeyPath(java.lang.String PartitionKeyPath) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, newtonsoft.json.JsonSerializationException, system.InvalidOperationException, system.ArgumentException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PartitionKeyPath", PartitionKeyPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelfLink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SelfLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelfLink(java.lang.String SelfLink) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SelfLink", SelfLink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTimeToLivePropertyPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TimeToLivePropertyPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeToLivePropertyPath(java.lang.String TimeToLivePropertyPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TimeToLivePropertyPath", TimeToLivePropertyPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}