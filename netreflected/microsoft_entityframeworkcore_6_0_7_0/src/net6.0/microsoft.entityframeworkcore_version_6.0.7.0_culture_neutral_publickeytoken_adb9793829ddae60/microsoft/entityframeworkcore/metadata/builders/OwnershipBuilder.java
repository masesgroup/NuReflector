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
import microsoft.entityframeworkcore.metadata.builders.OwnershipBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Builders.OwnershipBuilder, Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.OwnershipBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.OwnershipBuilder</a>
 */
public class OwnershipBuilder extends RelationshipBuilderBase  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Builders.OwnershipBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Builders.OwnershipBuilder";
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
    public OwnershipBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OwnershipBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OwnershipBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OwnershipBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OwnershipBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public OwnershipBuilder() throws Throwable {
    }

    public OwnershipBuilder(IMutableEntityType principalEntityType, IMutableEntityType dependentEntityType, IMutableForeignKey foreignKey) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(principalEntityType == null ? null : principalEntityType.getJCOInstance(), dependentEntityType == null ? null : dependentEntityType.getJCOInstance(), foreignKey == null ? null : foreignKey.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public OwnershipBuilder HasAnnotation(java.lang.String annotation, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAnnotation = (JCObject)classInstance.Invoke("HasAnnotation", annotation, value == null ? null : value.getJCOInstance());
            return new OwnershipBuilder(objHasAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnershipBuilder HasForeignKey(java.lang.String... foreignKeyPropertyNames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasForeignKey = (JCObject)classInstance.Invoke("HasForeignKey", (java.lang.Object)foreignKeyPropertyNames);
            return new OwnershipBuilder(objHasForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnershipBuilder HasForeignKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasForeignKey = (JCObject)classInstance.Invoke("HasForeignKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new OwnershipBuilder(objHasForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnershipBuilder HasPrincipalKey(java.lang.String... keyPropertyNames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasPrincipalKey = (JCObject)classInstance.Invoke("HasPrincipalKey", (java.lang.Object)keyPropertyNames);
            return new OwnershipBuilder(objHasPrincipalKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnershipBuilder HasPrincipalKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasPrincipalKey = (JCObject)classInstance.Invoke("HasPrincipalKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new OwnershipBuilder(objHasPrincipalKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}