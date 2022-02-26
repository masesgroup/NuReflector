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

package microsoft.extensions.caching.distributed;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.extensions.caching.distributed.DistributedCacheEntryOptions;


/**
 * The base .NET class managing Microsoft.Extensions.Caching.Distributed.IDistributedCache, Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Distributed.IDistributedCache" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Distributed.IDistributedCache</a>
 */
public interface IDistributedCache extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.Caching.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.Extensions.Caching.Abstractions";
    /**
     * Qualified class name: Microsoft.Extensions.Caching.Distributed.IDistributedCache
     */
    public static final String className = "Microsoft.Extensions.Caching.Distributed.IDistributedCache";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDistributedCache}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDistributedCache} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDistributedCache ToIDistributedCache(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IDistributedCacheImplementation(from.getJCOInstance());
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
    
    public byte[] Get(java.lang.String key) throws Throwable;

    public Task RefreshAsync(java.lang.String key, CancellationToken token) throws Throwable;

    public Task RemoveAsync(java.lang.String key, CancellationToken token) throws Throwable;

    public Task SetAsync(java.lang.String key, byte[] value, DistributedCacheEntryOptions options, CancellationToken token) throws Throwable;

    public Task SetAsync(java.lang.String dupParam0, JCORefOut dupParam1, DistributedCacheEntryOptions dupParam2, CancellationToken dupParam3) throws Throwable;

    public void Refresh(java.lang.String key) throws Throwable;

    public void Remove(java.lang.String key) throws Throwable;

    public void Set(java.lang.String key, byte[] value, DistributedCacheEntryOptions options) throws Throwable;

    public void Set(java.lang.String dupParam0, JCORefOut dupParam1, DistributedCacheEntryOptions dupParam2) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}