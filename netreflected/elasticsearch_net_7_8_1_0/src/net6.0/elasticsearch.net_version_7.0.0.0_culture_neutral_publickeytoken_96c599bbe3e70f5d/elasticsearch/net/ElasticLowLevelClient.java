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
import elasticsearch.net.IConnectionConfigurationValues;
import elasticsearch.net.IConnectionConfigurationValuesImplementation;
import elasticsearch.net.ApiKeyAuthenticationCredentials;
import elasticsearch.net.BasicAuthenticationCredentials;
import elasticsearch.net.IElasticsearchSerializer;
import elasticsearch.net.IElasticsearchSerializerImplementation;
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
 * The base .NET class managing Elasticsearch.Net.ElasticLowLevelClient, Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.ElasticLowLevelClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.ElasticLowLevelClient</a>
 */
public class ElasticLowLevelClient extends NetObject  {
    /**
     * Fully assembly qualified name: Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d
     */
    public static final String assemblyFullName = "Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d";
    /**
     * Assembly name: Elasticsearch.Net
     */
    public static final String assemblyShortName = "Elasticsearch.Net";
    /**
     * Qualified class name: Elasticsearch.Net.ElasticLowLevelClient
     */
    public static final String className = "Elasticsearch.Net.ElasticLowLevelClient";
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
    public ElasticLowLevelClient(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ElasticLowLevelClient}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ElasticLowLevelClient} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ElasticLowLevelClient cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ElasticLowLevelClient(from.getJCOInstance());
    }

    // Constructors section
    
    public ElasticLowLevelClient() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ElasticLowLevelClient(IConnectionConfigurationValues settings) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(settings == null ? null : settings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ElasticLowLevelClient(java.lang.String cloudId, ApiKeyAuthenticationCredentials credentials) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cloudId, credentials == null ? null : credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ElasticLowLevelClient(java.lang.String cloudId, BasicAuthenticationCredentials credentials) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(cloudId, credentials == null ? null : credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public IConnectionConfigurationValues getSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Settings");
            return new IConnectionConfigurationValuesImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IElasticsearchSerializer getSerializer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Serializer");
            return new IElasticsearchSerializerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public void setAsyncSearch(LowLevelAsyncSearchNamespace AsyncSearch) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AsyncSearch", AsyncSearch == null ? null : AsyncSearch.getJCOInstance());
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

    public void setAutoscaling(LowLevelAutoscalingNamespace Autoscaling) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Autoscaling", Autoscaling == null ? null : Autoscaling.getJCOInstance());
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

    public void setCat(LowLevelCatNamespace Cat) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Cat", Cat == null ? null : Cat.getJCOInstance());
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

    public void setCluster(LowLevelClusterNamespace Cluster) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Cluster", Cluster == null ? null : Cluster.getJCOInstance());
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

    public void setCrossClusterReplication(LowLevelCrossClusterReplicationNamespace CrossClusterReplication) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CrossClusterReplication", CrossClusterReplication == null ? null : CrossClusterReplication.getJCOInstance());
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

    public void setEnrich(LowLevelEnrichNamespace Enrich) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Enrich", Enrich == null ? null : Enrich.getJCOInstance());
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

    public void setEql(LowLevelEqlNamespace Eql) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Eql", Eql == null ? null : Eql.getJCOInstance());
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

    public void setGraph(LowLevelGraphNamespace Graph) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Graph", Graph == null ? null : Graph.getJCOInstance());
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

    public void setIndexLifecycleManagement(LowLevelIndexLifecycleManagementNamespace IndexLifecycleManagement) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IndexLifecycleManagement", IndexLifecycleManagement == null ? null : IndexLifecycleManagement.getJCOInstance());
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

    public void setIndices(LowLevelIndicesNamespace Indices) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Indices", Indices == null ? null : Indices.getJCOInstance());
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

    public void setIngest(LowLevelIngestNamespace Ingest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Ingest", Ingest == null ? null : Ingest.getJCOInstance());
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

    public void setLicense(LowLevelLicenseNamespace License) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("License", License == null ? null : License.getJCOInstance());
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

    public void setMachineLearning(LowLevelMachineLearningNamespace MachineLearning) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MachineLearning", MachineLearning == null ? null : MachineLearning.getJCOInstance());
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

    public void setMigration(LowLevelMigrationNamespace Migration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Migration", Migration == null ? null : Migration.getJCOInstance());
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

    public void setNodes(LowLevelNodesNamespace Nodes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Nodes", Nodes == null ? null : Nodes.getJCOInstance());
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

    public void setRollup(LowLevelRollupNamespace Rollup) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Rollup", Rollup == null ? null : Rollup.getJCOInstance());
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

    public void setSearchableSnapshots(LowLevelSearchableSnapshotsNamespace SearchableSnapshots) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SearchableSnapshots", SearchableSnapshots == null ? null : SearchableSnapshots.getJCOInstance());
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

    public void setSecurity(LowLevelSecurityNamespace Security) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Security", Security == null ? null : Security.getJCOInstance());
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

    public void setSnapshot(LowLevelSnapshotNamespace Snapshot) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Snapshot", Snapshot == null ? null : Snapshot.getJCOInstance());
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

    public void setSnapshotLifecycleManagement(LowLevelSnapshotLifecycleManagementNamespace SnapshotLifecycleManagement) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SnapshotLifecycleManagement", SnapshotLifecycleManagement == null ? null : SnapshotLifecycleManagement.getJCOInstance());
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

    public void setSql(LowLevelSqlNamespace Sql) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Sql", Sql == null ? null : Sql.getJCOInstance());
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

    public void setTasks(LowLevelTasksNamespace Tasks) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Tasks", Tasks == null ? null : Tasks.getJCOInstance());
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

    public void setTransform(LowLevelTransformNamespace Transform) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transform", Transform == null ? null : Transform.getJCOInstance());
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

    public void setWatcher(LowLevelWatcherNamespace Watcher) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Watcher", Watcher == null ? null : Watcher.getJCOInstance());
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

    public void setXPack(LowLevelXPackNamespace XPack) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XPack", XPack == null ? null : XPack.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}