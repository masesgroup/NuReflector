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

// Import section
import system.collections.specialized.NameValueCollection;
import system.io.Stream;
import system.net.HttpStatusCode;


/**
 * The base .NET class managing Microsoft.Azure.Documents.Client.IResourceResponseBase, Microsoft.Azure.Documents.Client, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Client.IResourceResponseBase" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Client.IResourceResponseBase</a>
 */
public interface IResourceResponseBase extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Documents.Client, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Documents.Client, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Documents.Client
     */
    public static final String assemblyShortName = "Microsoft.Azure.Documents.Client";
    /**
     * Qualified class name: Microsoft.Azure.Documents.Client.IResourceResponseBase
     */
    public static final String className = "Microsoft.Azure.Documents.Client.IResourceResponseBase";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IResourceResponseBase}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IResourceResponseBase} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IResourceResponseBase ToIResourceResponseBase(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Azure.Documents.Client, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IResourceResponseBaseImplementation(from.getJCOInstance());
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
    

    
    // Properties section
    
    public double getRequestCharge() throws Throwable;

    public long getCollectionQuota() throws Throwable;

    public long getCollectionSizeQuota() throws Throwable;

    public long getCollectionSizeUsage() throws Throwable;

    public long getCollectionUsage() throws Throwable;

    public long getDatabaseQuota() throws Throwable;

    public long getDatabaseUsage() throws Throwable;

    public long getDocumentQuota() throws Throwable;

    public long getDocumentUsage() throws Throwable;

    public long getIndexTransformationProgress() throws Throwable;

    public long getLazyIndexingProgress() throws Throwable;

    public long getPermissionQuota() throws Throwable;

    public long getPermissionUsage() throws Throwable;

    public long getStoredProceduresQuota() throws Throwable;

    public long getStoredProceduresUsage() throws Throwable;

    public long getTriggersQuota() throws Throwable;

    public long getTriggersUsage() throws Throwable;

    public long getUserDefinedFunctionsQuota() throws Throwable;

    public long getUserDefinedFunctionsUsage() throws Throwable;

    public long getUserQuota() throws Throwable;

    public long getUserUsage() throws Throwable;

    public NameValueCollection getResponseHeaders() throws Throwable;

    public Stream getResponseStream() throws Throwable;

    public HttpStatusCode getStatusCode() throws Throwable;

    public java.lang.String getActivityId() throws Throwable;

    public java.lang.String getContentLocation() throws Throwable;

    public java.lang.String getCurrentResourceQuotaUsage() throws Throwable;

    public java.lang.String getMaxResourceQuota() throws Throwable;

    public java.lang.String getSessionToken() throws Throwable;



    // Instance Events section
    

}