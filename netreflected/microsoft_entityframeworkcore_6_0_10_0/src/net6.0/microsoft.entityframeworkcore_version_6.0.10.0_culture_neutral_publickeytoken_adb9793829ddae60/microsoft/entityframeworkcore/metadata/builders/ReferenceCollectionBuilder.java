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

package microsoft.entityframeworkcore.metadata.builders;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.builders.RelationshipBuilderBase;
import microsoft.entityframeworkcore.metadata.IMutableEntityType;
import microsoft.entityframeworkcore.metadata.IMutableEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IMutableForeignKey;
import microsoft.entityframeworkcore.metadata.IMutableForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.builders.ReferenceCollectionBuilder;
import microsoft.entityframeworkcore.DeleteBehavior;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Builders.ReferenceCollectionBuilder, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.ReferenceCollectionBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.ReferenceCollectionBuilder</a>
 */
public class ReferenceCollectionBuilder extends RelationshipBuilderBase  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Builders.ReferenceCollectionBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Builders.ReferenceCollectionBuilder";
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
    public ReferenceCollectionBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ReferenceCollectionBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ReferenceCollectionBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ReferenceCollectionBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ReferenceCollectionBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ReferenceCollectionBuilder() throws Throwable {
    }

    public ReferenceCollectionBuilder(IMutableEntityType principalEntityType, IMutableEntityType dependentEntityType, IMutableForeignKey foreignKey) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), foreignKey == null ? null : foreignKey.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ReferenceCollectionBuilder HasAnnotation(java.lang.String annotation, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAnnotation = (JCObject)classInstance.Invoke("HasAnnotation", annotation, value == null ? null : value.getJCOInstance());
            return new ReferenceCollectionBuilder(objHasAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder HasForeignKey(java.lang.String... foreignKeyPropertyNames) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasForeignKey = (JCObject)classInstance.Invoke("HasForeignKey", (java.lang.Object)foreignKeyPropertyNames);
            return new ReferenceCollectionBuilder(objHasForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder HasForeignKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasForeignKey = (JCObject)classInstance.Invoke("HasForeignKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new ReferenceCollectionBuilder(objHasForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder HasPrincipalKey(java.lang.String... keyPropertyNames) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasPrincipalKey = (JCObject)classInstance.Invoke("HasPrincipalKey", (java.lang.Object)keyPropertyNames);
            return new ReferenceCollectionBuilder(objHasPrincipalKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder HasPrincipalKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasPrincipalKey = (JCObject)classInstance.Invoke("HasPrincipalKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new ReferenceCollectionBuilder(objHasPrincipalKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder IsRequired(boolean required) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.RankException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsRequired = (JCObject)classInstance.Invoke("IsRequired", required);
            return new ReferenceCollectionBuilder(objIsRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceCollectionBuilder OnDelete(DeleteBehavior deleteBehavior) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnDelete = (JCObject)classInstance.Invoke("OnDelete", deleteBehavior == null ? null : deleteBehavior.getJCOInstance());
            return new ReferenceCollectionBuilder(objOnDelete);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}