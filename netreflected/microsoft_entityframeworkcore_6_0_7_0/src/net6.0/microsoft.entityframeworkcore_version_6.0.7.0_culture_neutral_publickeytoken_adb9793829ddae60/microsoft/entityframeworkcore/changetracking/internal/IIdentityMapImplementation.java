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

package microsoft.entityframeworkcore.changetracking.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.IForeignKey;
import microsoft.entityframeworkcore.metadata.IForeignKeyImplementation;
import microsoft.entityframeworkcore.storage.ValueBuffer;
import microsoft.entityframeworkcore.changetracking.internal.IDependentsMap;
import microsoft.entityframeworkcore.changetracking.internal.IDependentsMapImplementation;
import microsoft.entityframeworkcore.changetracking.internal.InternalEntityEntry;
import microsoft.entityframeworkcore.metadata.IKey;
import microsoft.entityframeworkcore.metadata.IKeyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IIdentityMap, Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IIdentityMap" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IIdentityMap</a>
 */
public class IIdentityMapImplementation extends NetObject implements IIdentityMap {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IIdentityMap
     */
    public static final String className = "Microsoft.EntityFrameworkCore.ChangeTracking.Internal.IIdentityMap";
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
    public IIdentityMapImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IIdentityMap}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IIdentityMap} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IIdentityMap ToIIdentityMap(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IIdentityMapImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean Contains(IForeignKey foreignKey, JCORefOut<ValueBuffer> valueBuffer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", foreignKey == null ? null : foreignKey.getJCOInstance(), valueBuffer.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(JCORefOut<ValueBuffer> valueBuffer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", valueBuffer.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDependentsMap FindDependentsMap(IForeignKey foreignKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDependentsMap = (JCObject)classInstance.Invoke("FindDependentsMap", foreignKey == null ? null : foreignKey.getJCOInstance());
            return new IDependentsMapImplementation(objFindDependentsMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDependentsMap GetDependentsMap(IForeignKey foreignKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDependentsMap = (JCObject)classInstance.Invoke("GetDependentsMap", foreignKey == null ? null : foreignKey.getJCOInstance());
            return new IDependentsMapImplementation(objGetDependentsMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalEntityEntry TryGetEntry(IForeignKey foreignKey, InternalEntityEntry dependentEntry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTryGetEntry = (JCObject)classInstance.Invoke("TryGetEntry", foreignKey == null ? null : foreignKey.getJCOInstance(), dependentEntry == null ? null : dependentEntry.getJCOInstance());
            return new InternalEntityEntry(objTryGetEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalEntityEntry TryGetEntry(NetObject[] keyValues, boolean throwOnNullKey, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> hasNullKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTryGetEntry = (JCObject)classInstance.Invoke("TryGetEntry", toObjectFromArray(keyValues), throwOnNullKey, hasNullKey.getJCRefOut());
            return new InternalEntityEntry(objTryGetEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalEntityEntry TryGetEntry(NetObject[] keyValues) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTryGetEntry = (JCObject)classInstance.Invoke("TryGetEntry", (java.lang.Object)toObjectFromArray(keyValues));
            return new InternalEntityEntry(objTryGetEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalEntityEntry TryGetEntryUsingPreStoreGeneratedValues(IForeignKey foreignKey, InternalEntityEntry dependentEntry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTryGetEntryUsingPreStoreGeneratedValues = (JCObject)classInstance.Invoke("TryGetEntryUsingPreStoreGeneratedValues", foreignKey == null ? null : foreignKey.getJCOInstance(), dependentEntry == null ? null : dependentEntry.getJCOInstance());
            return new InternalEntityEntry(objTryGetEntryUsingPreStoreGeneratedValues);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalEntityEntry TryGetEntryUsingRelationshipSnapshot(IForeignKey foreignKey, InternalEntityEntry dependentEntry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTryGetEntryUsingRelationshipSnapshot = (JCObject)classInstance.Invoke("TryGetEntryUsingRelationshipSnapshot", foreignKey == null ? null : foreignKey.getJCOInstance(), dependentEntry == null ? null : dependentEntry.getJCOInstance());
            return new InternalEntityEntry(objTryGetEntryUsingRelationshipSnapshot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(NetObject[] keyValues, InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", toObjectFromArray(keyValues), entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddOrUpdate(InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddOrUpdate", entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveUsingRelationshipSnapshot(InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveUsingRelationshipSnapshot", entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IKey getKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Key");
            return new IKeyImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}