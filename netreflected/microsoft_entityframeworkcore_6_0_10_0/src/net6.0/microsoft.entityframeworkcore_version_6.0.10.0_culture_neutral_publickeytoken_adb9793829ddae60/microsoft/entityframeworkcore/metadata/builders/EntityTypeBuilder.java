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
import microsoft.entityframeworkcore.metadata.IMutableEntityType;
import microsoft.entityframeworkcore.metadata.IMutableEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.builders.CollectionNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.DataBuilder;
import microsoft.entityframeworkcore.metadata.builders.DiscriminatorBuilder;
import microsoft.entityframeworkcore.metadata.builders.EntityTypeBuilder;
import microsoft.entityframeworkcore.ChangeTrackingStrategy;
import system.linq.expressions.LambdaExpression;
import microsoft.entityframeworkcore.PropertyAccessMode;
import microsoft.entityframeworkcore.metadata.builders.IndexBuilder;
import microsoft.entityframeworkcore.metadata.builders.KeyBuilder;
import microsoft.entityframeworkcore.metadata.builders.NavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.OwnedNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.PropertyBuilder;
import microsoft.entityframeworkcore.metadata.builders.ReferenceNavigationBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Builders.EntityTypeBuilder, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.EntityTypeBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.EntityTypeBuilder</a>
 */
public class EntityTypeBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Builders.EntityTypeBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Builders.EntityTypeBuilder";
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
    public EntityTypeBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EntityTypeBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EntityTypeBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EntityTypeBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EntityTypeBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public EntityTypeBuilder() throws Throwable {
    }

    public EntityTypeBuilder(IMutableEntityType entityType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(entityType == null ? null : entityType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public CollectionNavigationBuilder HasMany(java.lang.String relatedTypeName, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasMany = (JCObject)classInstance.Invoke("HasMany", relatedTypeName, navigationName);
            return new CollectionNavigationBuilder(objHasMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CollectionNavigationBuilder HasMany(java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasMany = (JCObject)classInstance.Invoke("HasMany", navigationName);
            return new CollectionNavigationBuilder(objHasMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CollectionNavigationBuilder HasMany(NetType relatedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasMany = (JCObject)classInstance.Invoke("HasMany", relatedType == null ? null : relatedType.getJCOInstance(), navigationName);
            return new CollectionNavigationBuilder(objHasMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataBuilder HasData(NetObject... data) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasData = (JCObject)classInstance.Invoke("HasData", (java.lang.Object)toObjectFromArray(data));
            return new DataBuilder(objHasData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiscriminatorBuilder HasDiscriminator() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasDiscriminator = (JCObject)classInstance.Invoke("HasDiscriminator");
            return new DiscriminatorBuilder(objHasDiscriminator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiscriminatorBuilder HasDiscriminator(java.lang.String name, NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasDiscriminator = (JCObject)classInstance.Invoke("HasDiscriminator", name, type == null ? null : type.getJCOInstance());
            return new DiscriminatorBuilder(objHasDiscriminator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasAnnotation(java.lang.String annotation, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAnnotation = (JCObject)classInstance.Invoke("HasAnnotation", annotation, value == null ? null : value.getJCOInstance());
            return new EntityTypeBuilder(objHasAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasBaseType(java.lang.String name) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasBaseType = (JCObject)classInstance.Invoke("HasBaseType", name);
            return new EntityTypeBuilder(objHasBaseType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasBaseType(NetType entityType) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasBaseType = (JCObject)classInstance.Invoke("HasBaseType", entityType == null ? null : entityType.getJCOInstance());
            return new EntityTypeBuilder(objHasBaseType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasChangeTrackingStrategy(ChangeTrackingStrategy changeTrackingStrategy) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasChangeTrackingStrategy = (JCObject)classInstance.Invoke("HasChangeTrackingStrategy", changeTrackingStrategy == null ? null : changeTrackingStrategy.getJCOInstance());
            return new EntityTypeBuilder(objHasChangeTrackingStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasNoDiscriminator() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNoDiscriminator = (JCObject)classInstance.Invoke("HasNoDiscriminator");
            return new EntityTypeBuilder(objHasNoDiscriminator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasNoKey() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNoKey = (JCObject)classInstance.Invoke("HasNoKey");
            return new EntityTypeBuilder(objHasNoKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder HasQueryFilter(LambdaExpression filter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasQueryFilter = (JCObject)classInstance.Invoke("HasQueryFilter", filter == null ? null : filter.getJCOInstance());
            return new EntityTypeBuilder(objHasQueryFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder Ignore(java.lang.String propertyName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIgnore = (JCObject)classInstance.Invoke("Ignore", propertyName);
            return new EntityTypeBuilder(objIgnore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTypeBuilder UsePropertyAccessMode(PropertyAccessMode propertyAccessMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUsePropertyAccessMode = (JCObject)classInstance.Invoke("UsePropertyAccessMode", propertyAccessMode == null ? null : propertyAccessMode.getJCOInstance());
            return new EntityTypeBuilder(objUsePropertyAccessMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexBuilder HasIndex(java.lang.String[] propertyNames, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasIndex = (JCObject)classInstance.Invoke("HasIndex", propertyNames, name);
            return new IndexBuilder(objHasIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexBuilder HasIndex(JCORefOut dupParam0, java.lang.String dupParam1) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasIndex = (JCObject)classInstance.Invoke("HasIndex", dupParam0.getJCRefOut(), dupParam1);
            return new IndexBuilder(objHasIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexBuilder HasIndex(java.lang.String... propertyNames) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasIndex = (JCObject)classInstance.Invoke("HasIndex", (java.lang.Object)propertyNames);
            return new IndexBuilder(objHasIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexBuilder HasIndex(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasIndex = (JCObject)classInstance.Invoke("HasIndex", (java.lang.Object)dupParam0.getJCRefOut());
            return new IndexBuilder(objHasIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyBuilder HasAlternateKey(java.lang.String... propertyNames) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAlternateKey = (JCObject)classInstance.Invoke("HasAlternateKey", (java.lang.Object)propertyNames);
            return new KeyBuilder(objHasAlternateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyBuilder HasAlternateKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAlternateKey = (JCObject)classInstance.Invoke("HasAlternateKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new KeyBuilder(objHasAlternateKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyBuilder HasKey(java.lang.String... propertyNames) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasKey = (JCObject)classInstance.Invoke("HasKey", (java.lang.Object)propertyNames);
            return new KeyBuilder(objHasKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyBuilder HasKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasKey = (JCObject)classInstance.Invoke("HasKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new KeyBuilder(objHasKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NavigationBuilder Navigation(java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNavigation = (JCObject)classInstance.Invoke("Navigation", navigationName);
            return new NavigationBuilder(objNavigation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsMany(java.lang.String ownedTypeName, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsMany = (JCObject)classInstance.Invoke("OwnsMany", ownedTypeName, navigationName);
            return new OwnedNavigationBuilder(objOwnsMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsMany(java.lang.String ownedTypeName, NetType ownedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsMany = (JCObject)classInstance.Invoke("OwnsMany", ownedTypeName, ownedType == null ? null : ownedType.getJCOInstance(), navigationName);
            return new OwnedNavigationBuilder(objOwnsMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsMany(NetType ownedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsMany = (JCObject)classInstance.Invoke("OwnsMany", ownedType == null ? null : ownedType.getJCOInstance(), navigationName);
            return new OwnedNavigationBuilder(objOwnsMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsOne(java.lang.String ownedTypeName, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsOne = (JCObject)classInstance.Invoke("OwnsOne", ownedTypeName, navigationName);
            return new OwnedNavigationBuilder(objOwnsOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsOne(java.lang.String ownedTypeName, NetType ownedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsOne = (JCObject)classInstance.Invoke("OwnsOne", ownedTypeName, ownedType == null ? null : ownedType.getJCOInstance(), navigationName);
            return new OwnedNavigationBuilder(objOwnsOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OwnedNavigationBuilder OwnsOne(NetType ownedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOwnsOne = (JCObject)classInstance.Invoke("OwnsOne", ownedType == null ? null : ownedType.getJCOInstance(), navigationName);
            return new OwnedNavigationBuilder(objOwnsOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyBuilder IndexerProperty(NetType propertyType, java.lang.String propertyName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIndexerProperty = (JCObject)classInstance.Invoke("IndexerProperty", propertyType == null ? null : propertyType.getJCOInstance(), propertyName);
            return new PropertyBuilder(objIndexerProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyBuilder Property(java.lang.String propertyName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objProperty = (JCObject)classInstance.Invoke("Property", propertyName);
            return new PropertyBuilder(objProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyBuilder Property(NetType propertyType, java.lang.String propertyName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objProperty = (JCObject)classInstance.Invoke("Property", propertyType == null ? null : propertyType.getJCOInstance(), propertyName);
            return new PropertyBuilder(objProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceNavigationBuilder HasOne(java.lang.String relatedTypeName, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasOne = (JCObject)classInstance.Invoke("HasOne", relatedTypeName, navigationName);
            return new ReferenceNavigationBuilder(objHasOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceNavigationBuilder HasOne(java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasOne = (JCObject)classInstance.Invoke("HasOne", navigationName);
            return new ReferenceNavigationBuilder(objHasOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferenceNavigationBuilder HasOne(NetType relatedType, java.lang.String navigationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasOne = (JCObject)classInstance.Invoke("HasOne", relatedType == null ? null : relatedType.getJCOInstance(), navigationName);
            return new ReferenceNavigationBuilder(objHasOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IMutableEntityType getMetadata() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new IMutableEntityTypeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}