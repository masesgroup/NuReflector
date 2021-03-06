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

// Import section
import system.IDisposable;
import system.IDisposableImplementation;
import system.threading.tasks.Task;
import system.threading.SemaphoreSlim;
import system.threading.CancellationToken;
import elasticsearch.net.Node;
import elasticsearch.net.RequestData;
import system.DateTime;


/**
 * The base .NET class managing Elasticsearch.Net.IRequestPipeline, Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.IRequestPipeline" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Elasticsearch.Net.IRequestPipeline</a>
 */
public interface IRequestPipeline extends IJCOBridgeReflected, IDisposable {
    /**
     * Fully assembly qualified name: Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d
     */
    public static final String assemblyFullName = "Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d";
    /**
     * Assembly name: Elasticsearch.Net
     */
    public static final String assemblyShortName = "Elasticsearch.Net";
    /**
     * Qualified class name: Elasticsearch.Net.IRequestPipeline
     */
    public static final String className = "Elasticsearch.Net.IRequestPipeline";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRequestPipeline}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRequestPipeline} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRequestPipeline ToIRequestPipeline(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Elasticsearch.Net, Version=7.0.0.0, Culture=neutral, PublicKeyToken=96c599bbe3e70f5d");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IRequestPipelineImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public Task FirstPoolUsageAsync(SemaphoreSlim semaphore, CancellationToken cancellationToken) throws Throwable;

    public Task PingAsync(Node node, CancellationToken cancellationToken) throws Throwable;

    public Task SniffAsync(CancellationToken cancellationToken) throws Throwable;

    public Task SniffOnConnectionFailureAsync(CancellationToken cancellationToken) throws Throwable;

    public Task SniffOnStaleClusterAsync(CancellationToken cancellationToken) throws Throwable;

    public void AuditCancellationRequested() throws Throwable;


    public void FirstPoolUsage(SemaphoreSlim semaphore) throws Throwable;

    public void MarkAlive(Node node) throws Throwable;

    public void MarkDead(Node node) throws Throwable;

    public void Ping(Node node) throws Throwable;

    public void Sniff() throws Throwable;

    public void SniffOnConnectionFailure() throws Throwable;

    public void SniffOnStaleCluster() throws Throwable;


    
    // Properties section
    
    public boolean getFirstPoolUsageNeedsSniffing() throws Throwable;

    public boolean getIsTakingTooLong() throws Throwable;

    public boolean getSniffsOnConnectionFailure() throws Throwable;

    public boolean getSniffsOnStaleCluster() throws Throwable;

    public boolean getStaleClusterState() throws Throwable;

    public int getMaxRetries() throws Throwable;

    public int getRetried() throws Throwable;

    public DateTime getStartedOn() throws Throwable;



    // Instance Events section
    

}