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

package microsoft.entityframeworkcore.metadata.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.internal.EntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionForeignKey;
import microsoft.entityframeworkcore.metadata.IConventionForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.internal.PropertyCounts;
import microsoft.entityframeworkcore.metadata.internal.IRuntimeEntityType;
import microsoft.entityframeworkcore.metadata.internal.IRuntimeEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyKeyImplementation;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.metadata.internal.TypeBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBaseImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.EntityTypeExtensions, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.EntityTypeExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.EntityTypeExtensions</a>
 */
public class EntityTypeExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.EntityTypeExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.EntityTypeExtensions";
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
    public EntityTypeExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EntityTypeExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EntityTypeExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EntityTypeExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EntityTypeExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public EntityTypeExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsAssignableFrom(EntityType entityType, IReadOnlyEntityType otherEntityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsAssignableFrom", entityType == null ? null : entityType.getJCOInstance(), otherEntityType == null ? null : otherEntityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsInOwnershipPath(IReadOnlyEntityType entityType, IReadOnlyEntityType targetType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsInOwnershipPath", entityType == null ? null : entityType.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsInOwnershipPath(IReadOnlyEntityType entityType, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsInOwnershipPath", entityType == null ? null : entityType.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsOwned(IReadOnlyEntityType entityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsOwned", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsStrictlyDerivedFrom(EntityType entityType, IReadOnlyEntityType otherEntityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsStrictlyDerivedFrom", entityType == null ? null : entityType.getJCOInstance(), otherEntityType == null ? null : otherEntityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean UseEagerSnapshots(IReadOnlyEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("UseEagerSnapshots", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int NavigationCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("NavigationCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int OriginalValueCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("OriginalValueCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int PropertyCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("PropertyCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int RelationshipPropertyCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("RelationshipPropertyCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ShadowPropertyCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ShadowPropertyCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int StoreGeneratedCount(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("StoreGeneratedCount", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionForeignKey FindDeclaredOwnership(IConventionEntityType entityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDeclaredOwnership = (JCObject)classType.Invoke("FindDeclaredOwnership", entityType == null ? null : entityType.getJCOInstance());
            return new IConventionForeignKeyImplementation(objFindDeclaredOwnership);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EntityType LeastDerivedType(EntityType entityType, EntityType otherEntityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLeastDerivedType = (JCObject)classType.Invoke("LeastDerivedType", entityType == null ? null : entityType.getJCOInstance(), otherEntityType == null ? null : otherEntityType.getJCOInstance());
            return new EntityType(objLeastDerivedType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PropertyCounts CalculateCounts(IRuntimeEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCalculateCounts = (JCObject)classType.Invoke("CalculateCounts", entityType == null ? null : entityType.getJCOInstance());
            return new PropertyCounts(objCalculateCounts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PropertyCounts GetCounts(IEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCounts = (JCObject)classType.Invoke("GetCounts", entityType == null ? null : entityType.getJCOInstance());
            return new PropertyCounts(objGetCounts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IProperty CheckPropertyBelongsToType(IEntityType entityType, IProperty property) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCheckPropertyBelongsToType = (JCObject)classType.Invoke("CheckPropertyBelongsToType", entityType == null ? null : entityType.getJCOInstance(), property == null ? null : property.getJCOInstance());
            return new IPropertyImplementation(objCheckPropertyBelongsToType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyEntityType FindInOwnershipPath(IReadOnlyEntityType entityType, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindInOwnershipPath = (JCObject)classType.Invoke("FindInOwnershipPath", entityType == null ? null : entityType.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance());
            return new IReadOnlyEntityTypeImplementation(objFindInOwnershipPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyForeignKey FindDeclaredOwnership(IReadOnlyEntityType entityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDeclaredOwnership = (JCObject)classType.Invoke("FindDeclaredOwnership", entityType == null ? null : entityType.getJCOInstance());
            return new IReadOnlyForeignKeyImplementation(objFindDeclaredOwnership);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyKey FindDeclaredPrimaryKey(IReadOnlyEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDeclaredPrimaryKey = (JCObject)classType.Invoke("FindDeclaredPrimaryKey", entityType == null ? null : entityType.getJCOInstance());
            return new IReadOnlyKeyImplementation(objFindDeclaredPrimaryKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetDiscriminatorValue(EntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDiscriminatorValue = (JCObject)classType.Invoke("GetDiscriminatorValue", entityType == null ? null : entityType.getJCOInstance());
            return new NetObject(objGetDiscriminatorValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemberInfo GetNavigationMemberInfo(IReadOnlyEntityType entityType, java.lang.String navigationName) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetNavigationMemberInfo = (JCObject)classType.Invoke("GetNavigationMemberInfo", entityType == null ? null : entityType.getJCOInstance(), navigationName);
            return new MemberInfo(objGetNavigationMemberInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String DisplayName(TypeBase entityType) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("DisplayName", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetOwnedName(IReadOnlyTypeBase type, java.lang.String simpleName, java.lang.String ownershipNavigation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetOwnedName", type == null ? null : type.getJCOInstance(), simpleName, ownershipNavigation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ShortName(TypeBase entityType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ShortName", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}