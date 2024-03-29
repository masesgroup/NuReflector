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

package microsoft.entityframeworkcore.changetracking;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.changetracking.NavigationEntry;
import microsoft.entityframeworkcore.changetracking.internal.InternalEntityEntry;
import microsoft.entityframeworkcore.metadata.INavigation;
import microsoft.entityframeworkcore.metadata.INavigationImplementation;
import system.linq.IQueryable;
import system.linq.IQueryableImplementation;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import microsoft.entityframeworkcore.changetracking.EntityEntry;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.ChangeTracking.ReferenceEntry, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.ReferenceEntry" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.ReferenceEntry</a>
 */
public class ReferenceEntry extends NavigationEntry  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.ChangeTracking.ReferenceEntry
     */
    public static final String className = "Microsoft.EntityFrameworkCore.ChangeTracking.ReferenceEntry";
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
    public ReferenceEntry(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ReferenceEntry}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ReferenceEntry} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ReferenceEntry cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ReferenceEntry(from.getJCOInstance());
    }

    // Constructors section
    
    public ReferenceEntry() throws Throwable {
    }

    public ReferenceEntry(InternalEntityEntry internalEntry, INavigation navigation) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.AggregateException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(internalEntry == null ? null : internalEntry.getJCOInstance(), navigation == null ? null : navigation.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceEntry(InternalEntityEntry internalEntry, java.lang.String name) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.AggregateException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(internalEntry == null ? null : internalEntry.getJCOInstance(), name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public IQueryable Query() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objQuery = (JCObject)classInstance.Invoke("Query");
            return new IQueryableImplementation(objQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task LoadAsync(CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAsync = (JCObject)classInstance.Invoke("LoadAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objLoadAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public EntityEntry getTargetEntry() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.OutOfMemoryException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TargetEntry");
            return new EntityEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}