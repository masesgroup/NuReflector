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

package microsoft.extensions.caching.memory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.extensions.caching.memory.ICacheEntry;
import microsoft.extensions.caching.memory.ICacheEntryImplementation;
import microsoft.extensions.primitives.IChangeToken;
import microsoft.extensions.primitives.IChangeTokenImplementation;
import microsoft.extensions.caching.memory.PostEvictionDelegate;
import system.DateTimeOffset;
import system.TimeSpan;
import microsoft.extensions.caching.memory.MemoryCacheEntryOptions;
import microsoft.extensions.caching.memory.CacheItemPriority;


/**
 * The base .NET class managing Microsoft.Extensions.Caching.Memory.CacheEntryExtensions, Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Memory.CacheEntryExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Caching.Memory.CacheEntryExtensions</a>
 */
public class CacheEntryExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.Caching.Abstractions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.Caching.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.Extensions.Caching.Abstractions";
    /**
     * Qualified class name: Microsoft.Extensions.Caching.Memory.CacheEntryExtensions
     */
    public static final String className = "Microsoft.Extensions.Caching.Memory.CacheEntryExtensions";
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
    public CacheEntryExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CacheEntryExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CacheEntryExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CacheEntryExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CacheEntryExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public CacheEntryExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static ICacheEntry AddExpirationToken(ICacheEntry entry, IChangeToken expirationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddExpirationToken = (JCObject)classType.Invoke("AddExpirationToken", entry == null ? null : entry.getJCOInstance(), expirationToken == null ? null : expirationToken.getJCOInstance());
            return new ICacheEntryImplementation(objAddExpirationToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry RegisterPostEvictionCallback(ICacheEntry entry, PostEvictionDelegate callback, NetObject state) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterPostEvictionCallback = (JCObject)classType.Invoke("RegisterPostEvictionCallback", entry == null ? null : entry.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new ICacheEntryImplementation(objRegisterPostEvictionCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry RegisterPostEvictionCallback(ICacheEntry entry, PostEvictionDelegate callback) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterPostEvictionCallback = (JCObject)classType.Invoke("RegisterPostEvictionCallback", entry == null ? null : entry.getJCOInstance(), callback);
            return new ICacheEntryImplementation(objRegisterPostEvictionCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetAbsoluteExpiration(ICacheEntry entry, DateTimeOffset absolute) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetAbsoluteExpiration = (JCObject)classType.Invoke("SetAbsoluteExpiration", entry == null ? null : entry.getJCOInstance(), absolute == null ? null : absolute.getJCOInstance());
            return new ICacheEntryImplementation(objSetAbsoluteExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetAbsoluteExpiration(ICacheEntry entry, TimeSpan relative) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetAbsoluteExpiration = (JCObject)classType.Invoke("SetAbsoluteExpiration", entry == null ? null : entry.getJCOInstance(), relative == null ? null : relative.getJCOInstance());
            return new ICacheEntryImplementation(objSetAbsoluteExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetOptions(ICacheEntry entry, MemoryCacheEntryOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetOptions = (JCObject)classType.Invoke("SetOptions", entry == null ? null : entry.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new ICacheEntryImplementation(objSetOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetPriority(ICacheEntry entry, CacheItemPriority priority) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetPriority = (JCObject)classType.Invoke("SetPriority", entry == null ? null : entry.getJCOInstance(), priority == null ? null : priority.getJCOInstance());
            return new ICacheEntryImplementation(objSetPriority);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetSize(ICacheEntry entry, long size) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetSize = (JCObject)classType.Invoke("SetSize", entry == null ? null : entry.getJCOInstance(), size);
            return new ICacheEntryImplementation(objSetSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetSlidingExpiration(ICacheEntry entry, TimeSpan offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetSlidingExpiration = (JCObject)classType.Invoke("SetSlidingExpiration", entry == null ? null : entry.getJCOInstance(), offset == null ? null : offset.getJCOInstance());
            return new ICacheEntryImplementation(objSetSlidingExpiration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICacheEntry SetValue(ICacheEntry entry, NetObject value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetValue = (JCObject)classType.Invoke("SetValue", entry == null ? null : entry.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new ICacheEntryImplementation(objSetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}