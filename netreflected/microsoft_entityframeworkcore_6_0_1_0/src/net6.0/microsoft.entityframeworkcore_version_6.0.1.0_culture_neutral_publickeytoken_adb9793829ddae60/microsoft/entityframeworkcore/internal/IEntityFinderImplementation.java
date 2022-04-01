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

package microsoft.entityframeworkcore.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.IQueryable;
import system.linq.IQueryableImplementation;
import microsoft.entityframeworkcore.metadata.INavigation;
import microsoft.entityframeworkcore.metadata.INavigationImplementation;
import microsoft.entityframeworkcore.changetracking.internal.InternalEntityEntry;
import system.threading.tasks.Task;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Internal.IEntityFinder, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Internal.IEntityFinder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Internal.IEntityFinder</a>
 */
public class IEntityFinderImplementation extends NetObject implements IEntityFinder {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Internal.IEntityFinder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Internal.IEntityFinder";
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
    public IEntityFinderImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IEntityFinder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IEntityFinder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IEntityFinder ToIEntityFinder(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IEntityFinderImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IQueryable Query(INavigation navigation, InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objQuery = (JCObject)classInstance.Invoke("Query", navigation == null ? null : navigation.getJCOInstance(), entry == null ? null : entry.getJCOInstance());
            return new IQueryableImplementation(objQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Find(NetObject[] keyValues) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFind = (JCObject)classInstance.Invoke("Find", (java.lang.Object)toObjectFromArray(keyValues));
            return new NetObject(objFind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetDatabaseValues(InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDatabaseValues", entry == null ? null : entry.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task LoadAsync(INavigation navigation, InternalEntityEntry entry, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAsync = (JCObject)classInstance.Invoke("LoadAsync", navigation == null ? null : navigation.getJCOInstance(), entry == null ? null : entry.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objLoadAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(INavigation navigation, InternalEntityEntry entry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", navigation == null ? null : navigation.getJCOInstance(), entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}