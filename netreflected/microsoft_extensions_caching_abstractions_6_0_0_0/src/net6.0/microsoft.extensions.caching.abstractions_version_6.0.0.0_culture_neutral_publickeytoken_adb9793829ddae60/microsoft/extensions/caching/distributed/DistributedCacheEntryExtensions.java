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
import java.util.ArrayList;

// Import section
import microsoft.extensions.caching.distributed.DistributedCacheEntryOptions;
import system.DateTimeOffset;
import system.TimeSpan;


/**
 * The base .NET class managing Microsoft.Extensions.Caching.Distributed.DistributedCacheEntryExtensions, Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Distributed.DistributedCacheEntryExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Distributed.DistributedCacheEntryExtensions</a>
 */
public class DistributedCacheEntryExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.Caching.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.Extensions.Caching.Abstractions";
    /**
     * Qualified class name: Microsoft.Extensions.Caching.Distributed.DistributedCacheEntryExtensions
     */
    public static final String className = "Microsoft.Extensions.Caching.Distributed.DistributedCacheEntryExtensions";
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
    public DistributedCacheEntryExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DistributedCacheEntryExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DistributedCacheEntryExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DistributedCacheEntryExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DistributedCacheEntryExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public DistributedCacheEntryExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static DistributedCacheEntryOptions SetAbsoluteExpiration(DistributedCacheEntryOptions options, DateTimeOffset absolute) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetAbsoluteExpiration = (JCObject)classType.Invoke("SetAbsoluteExpiration", options == null ? null : options.getJCOInstance(), absolute == null ? null : absolute.getJCOInstance());
            return new DistributedCacheEntryOptions(objSetAbsoluteExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DistributedCacheEntryOptions SetAbsoluteExpiration(DistributedCacheEntryOptions options, TimeSpan relative) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetAbsoluteExpiration = (JCObject)classType.Invoke("SetAbsoluteExpiration", options == null ? null : options.getJCOInstance(), relative == null ? null : relative.getJCOInstance());
            return new DistributedCacheEntryOptions(objSetAbsoluteExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DistributedCacheEntryOptions SetSlidingExpiration(DistributedCacheEntryOptions options, TimeSpan offset) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetSlidingExpiration = (JCObject)classType.Invoke("SetSlidingExpiration", options == null ? null : options.getJCOInstance(), offset == null ? null : offset.getJCOInstance());
            return new DistributedCacheEntryOptions(objSetSlidingExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}