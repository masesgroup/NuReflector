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

package elasticsearch.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import elasticsearch.net.specification.asyncsearchapi.LowLevelAsyncSearchNamespace;
import elasticsearch.net.specification.autoscalingapi.LowLevelAutoscalingNamespace;
import elasticsearch.net.specification.catapi.LowLevelCatNamespace;
import elasticsearch.net.specification.clusterapi.LowLevelClusterNamespace;
import elasticsearch.net.specification.crossclusterreplicationapi.LowLevelCrossClusterReplicationNamespace;
import elasticsearch.net.specification.enrichapi.LowLevelEnrichNamespace;
import elasticsearch.net.specification.eqlapi.LowLevelEqlNamespace;
import elasticsearch.net.specification.graphapi.LowLevelGraphNamespace;
import elasticsearch.net.specification.indexlifecyclemanagementapi.LowLevelIndexLifecycleManagementNamespace;
import elasticsearch.net.specification.indicesapi.LowLevelIndicesNamespace;
import elasticsearch.net.specification.ingestapi.LowLevelIngestNamespace;
import elasticsearch.net.specification.licenseapi.LowLevelLicenseNamespace;
import elasticsearch.net.specification.machinelearningapi.LowLevelMachineLearningNamespace;
import elasticsearch.net.specification.migrationapi.LowLevelMigrationNamespace;
import elasticsearch.net.specification.nodesapi.LowLevelNodesNamespace;
import elasticsearch.net.specification.rollupapi.LowLevelRollupNamespace;
import elasticsearch.net.specification.searchablesnapshotsapi.LowLevelSearchableSnapshotsNamespace;
import elasticsearch.net.specification.securityapi.LowLevelSecurityNamespace;
import elasticsearch.net.specification.snapshotapi.LowLevelSnapshotNamespace;
import elasticsearch.net.specification.snapshotlifecyclemanagementapi.LowLevelSnapshotLifecycleManagementNamespace;
import elasticsearch.net.specification.sqlapi.LowLevelSqlNamespace;
import elasticsearch.net.specification.tasksapi.LowLevelTasksNamespace;
import elasticsearch.net.specification.transformapi.LowLevelTransformNamespace;
import elasticsearch.net.specification.watcherapi.LowLevelWatcherNamespace;
import elasticsearch.net.specification.xpackapi.LowLevelXPackNamespace;


/**
 * The base .NET class managing Elasticsearch.Net.IElasticLowLevelClient, Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.IElasticLowLevelClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.IElasticLowLevelClient</a>
 */
public class IElasticLowLevelClientImplementation extends NetObject implements IElasticLowLevelClient {
    /**
     * Fully assembly qualified name: Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d
     */
    public static final String assemblyFullName = "Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d";
    /**
     * Assembly name: Elasticsearch.Net
     */
    public static final String assemblyShortName = "Elasticsearch.Net";
    /**
     * Qualified class name: Elasticsearch.Net.IElasticLowLevelClient
     */
    public static final String className = "Elasticsearch.Net.IElasticLowLevelClient";
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
    public IElasticLowLevelClientImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IElasticLowLevelClient}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IElasticLowLevelClient} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IElasticLowLevelClient ToIElasticLowLevelClient(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IElasticLowLevelClientImplementation(from.getJCOInstance());
    }

    // Methods section
    

    
    // Properties section
    
    public LowLevelAsyncSearchNamespace getAsyncSearch() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AsyncSearch");
            return new LowLevelAsyncSearchNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelAutoscalingNamespace getAutoscaling() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Autoscaling");
            return new LowLevelAutoscalingNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelCatNamespace getCat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Cat");
            return new LowLevelCatNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelClusterNamespace getCluster() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Cluster");
            return new LowLevelClusterNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelCrossClusterReplicationNamespace getCrossClusterReplication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CrossClusterReplication");
            return new LowLevelCrossClusterReplicationNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelEnrichNamespace getEnrich() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Enrich");
            return new LowLevelEnrichNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelEqlNamespace getEql() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Eql");
            return new LowLevelEqlNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelGraphNamespace getGraph() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Graph");
            return new LowLevelGraphNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelIndexLifecycleManagementNamespace getIndexLifecycleManagement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IndexLifecycleManagement");
            return new LowLevelIndexLifecycleManagementNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelIndicesNamespace getIndices() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Indices");
            return new LowLevelIndicesNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelIngestNamespace getIngest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Ingest");
            return new LowLevelIngestNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelLicenseNamespace getLicense() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("License");
            return new LowLevelLicenseNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelMachineLearningNamespace getMachineLearning() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MachineLearning");
            return new LowLevelMachineLearningNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelMigrationNamespace getMigration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Migration");
            return new LowLevelMigrationNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelNodesNamespace getNodes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Nodes");
            return new LowLevelNodesNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelRollupNamespace getRollup() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Rollup");
            return new LowLevelRollupNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelSearchableSnapshotsNamespace getSearchableSnapshots() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SearchableSnapshots");
            return new LowLevelSearchableSnapshotsNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelSecurityNamespace getSecurity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Security");
            return new LowLevelSecurityNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelSnapshotNamespace getSnapshot() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Snapshot");
            return new LowLevelSnapshotNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelSnapshotLifecycleManagementNamespace getSnapshotLifecycleManagement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SnapshotLifecycleManagement");
            return new LowLevelSnapshotLifecycleManagementNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelSqlNamespace getSql() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Sql");
            return new LowLevelSqlNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelTasksNamespace getTasks() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Tasks");
            return new LowLevelTasksNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelTransformNamespace getTransform() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transform");
            return new LowLevelTransformNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelWatcherNamespace getWatcher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Watcher");
            return new LowLevelWatcherNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LowLevelXPackNamespace getXPack() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XPack");
            return new LowLevelXPackNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}