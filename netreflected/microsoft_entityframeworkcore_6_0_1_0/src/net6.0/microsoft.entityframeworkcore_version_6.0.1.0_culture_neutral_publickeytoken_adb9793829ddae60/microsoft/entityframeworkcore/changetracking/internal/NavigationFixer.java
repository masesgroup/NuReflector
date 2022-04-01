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
import microsoft.entityframeworkcore.changetracking.internal.IChangeDetector;
import microsoft.entityframeworkcore.changetracking.internal.IChangeDetectorImplementation;
import microsoft.entityframeworkcore.changetracking.internal.IEntityGraphAttacher;
import microsoft.entityframeworkcore.changetracking.internal.IEntityGraphAttacherImplementation;
import microsoft.entityframeworkcore.changetracking.internal.InternalEntityEntry;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import microsoft.entityframeworkcore.metadata.INavigationBase;
import microsoft.entityframeworkcore.metadata.INavigationBaseImplementation;
import microsoft.entityframeworkcore.EntityState;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.ChangeTracking.Internal.NavigationFixer, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.NavigationFixer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.ChangeTracking.Internal.NavigationFixer</a>
 */
public class NavigationFixer extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.ChangeTracking.Internal.NavigationFixer
     */
    public static final String className = "Microsoft.EntityFrameworkCore.ChangeTracking.Internal.NavigationFixer";
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
    public NavigationFixer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NavigationFixer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NavigationFixer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NavigationFixer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NavigationFixer(from.getJCOInstance());
    }

    // Constructors section
    
    public NavigationFixer() throws Throwable {
    }

    public NavigationFixer(IChangeDetector changeDetector, IEntityGraphAttacher attacher) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(changeDetector == null ? null : changeDetector.getJCOInstance(), attacher == null ? null : attacher.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void AbortAttachGraph() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AbortAttachGraph");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginAttachGraph() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginAttachGraph");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompleteAttachGraph() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompleteAttachGraph");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NavigationReferenceChanged(InternalEntityEntry entry, INavigationBase navigationBase, NetObject oldValue, NetObject newValue) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NavigationReferenceChanged", entry == null ? null : entry.getJCOInstance(), navigationBase == null ? null : navigationBase.getJCOInstance(), oldValue == null ? null : oldValue.getJCOInstance(), newValue == null ? null : newValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StateChanged(InternalEntityEntry entry, EntityState oldState, boolean fromQuery) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StateChanged", entry == null ? null : entry.getJCOInstance(), oldState == null ? null : oldState.getJCOInstance(), fromQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StateChanging(InternalEntityEntry entry, EntityState newState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StateChanging", entry == null ? null : entry.getJCOInstance(), newState == null ? null : newState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TrackedFromQuery(InternalEntityEntry entry) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TrackedFromQuery", entry == null ? null : entry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}