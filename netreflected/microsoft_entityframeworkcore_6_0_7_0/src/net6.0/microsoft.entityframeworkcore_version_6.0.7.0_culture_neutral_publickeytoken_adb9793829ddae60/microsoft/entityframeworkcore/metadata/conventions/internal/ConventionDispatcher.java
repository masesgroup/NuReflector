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

package microsoft.entityframeworkcore.metadata.conventions.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.conventions.ConventionSet;
import microsoft.entityframeworkcore.metadata.builders.IConventionEntityTypeBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionEntityTypeBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionForeignKeyBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionForeignKeyBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionIndexBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionIndexBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionKeyBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionKeyBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionNavigationBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionSkipNavigationBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionSkipNavigationBuilderImplementation;
import microsoft.entityframeworkcore.metadata.conventions.IConventionBatch;
import microsoft.entityframeworkcore.metadata.conventions.IConventionBatchImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IConventionNavigation;
import microsoft.entityframeworkcore.metadata.IConventionNavigationImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionForeignKey;
import microsoft.entityframeworkcore.metadata.IConventionForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionIndex;
import microsoft.entityframeworkcore.metadata.IConventionIndexImplementation;
import microsoft.entityframeworkcore.metadata.IConventionKey;
import microsoft.entityframeworkcore.metadata.IConventionKeyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionProperty;
import microsoft.entityframeworkcore.metadata.IConventionPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionSkipNavigation;
import microsoft.entityframeworkcore.metadata.IConventionSkipNavigationImplementation;
import system.reflection.FieldInfo;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.metadata.conventions.internal.MetadataTracker;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Conventions.Internal.ConventionDispatcher, Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Conventions.Internal.ConventionDispatcher" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Conventions.Internal.ConventionDispatcher</a>
 */
public class ConventionDispatcher extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Conventions.Internal.ConventionDispatcher
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Conventions.Internal.ConventionDispatcher";
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
    public ConventionDispatcher(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ConventionDispatcher}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ConventionDispatcher} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ConventionDispatcher cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ConventionDispatcher(from.getJCOInstance());
    }

    // Constructors section
    
    public ConventionDispatcher() throws Throwable {
    }

    public ConventionDispatcher(ConventionSet conventionSet) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(conventionSet == null ? null : conventionSet.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public IConventionEntityTypeBuilder OnEntityTypeAdded(IConventionEntityTypeBuilder entityTypeBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnEntityTypeAdded = (JCObject)classInstance.Invoke("OnEntityTypeAdded", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance());
            return new IConventionEntityTypeBuilderImplementation(objOnEntityTypeAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionForeignKeyBuilder OnForeignKeyAdded(IConventionForeignKeyBuilder relationshipBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnForeignKeyAdded = (JCObject)classInstance.Invoke("OnForeignKeyAdded", relationshipBuilder == null ? null : relationshipBuilder.getJCOInstance());
            return new IConventionForeignKeyBuilderImplementation(objOnForeignKeyAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionForeignKeyBuilder OnForeignKeyPrincipalEndChanged(IConventionForeignKeyBuilder relationshipBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnForeignKeyPrincipalEndChanged = (JCObject)classInstance.Invoke("OnForeignKeyPrincipalEndChanged", relationshipBuilder == null ? null : relationshipBuilder.getJCOInstance());
            return new IConventionForeignKeyBuilderImplementation(objOnForeignKeyPrincipalEndChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionIndexBuilder OnIndexAdded(IConventionIndexBuilder indexBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnIndexAdded = (JCObject)classInstance.Invoke("OnIndexAdded", indexBuilder == null ? null : indexBuilder.getJCOInstance());
            return new IConventionIndexBuilderImplementation(objOnIndexAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionKeyBuilder OnKeyAdded(IConventionKeyBuilder keyBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnKeyAdded = (JCObject)classInstance.Invoke("OnKeyAdded", keyBuilder == null ? null : keyBuilder.getJCOInstance());
            return new IConventionKeyBuilderImplementation(objOnKeyAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionModelBuilder OnModelFinalizing(IConventionModelBuilder modelBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnModelFinalizing = (JCObject)classInstance.Invoke("OnModelFinalizing", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new IConventionModelBuilderImplementation(objOnModelFinalizing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionModelBuilder OnModelInitialized(IConventionModelBuilder modelBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnModelInitialized = (JCObject)classInstance.Invoke("OnModelInitialized", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new IConventionModelBuilderImplementation(objOnModelInitialized);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionNavigationBuilder OnNavigationAdded(IConventionNavigationBuilder navigationBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnNavigationAdded = (JCObject)classInstance.Invoke("OnNavigationAdded", navigationBuilder == null ? null : navigationBuilder.getJCOInstance());
            return new IConventionNavigationBuilderImplementation(objOnNavigationAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionPropertyBuilder OnPropertyAdded(IConventionPropertyBuilder propertyBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnPropertyAdded = (JCObject)classInstance.Invoke("OnPropertyAdded", propertyBuilder == null ? null : propertyBuilder.getJCOInstance());
            return new IConventionPropertyBuilderImplementation(objOnPropertyAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionSkipNavigationBuilder OnSkipNavigationAdded(IConventionSkipNavigationBuilder navigationBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnSkipNavigationAdded = (JCObject)classInstance.Invoke("OnSkipNavigationAdded", navigationBuilder == null ? null : navigationBuilder.getJCOInstance());
            return new IConventionSkipNavigationBuilderImplementation(objOnSkipNavigationAdded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionBatch DelayConventions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDelayConventions = (JCObject)classInstance.Invoke("DelayConventions");
            return new IConventionBatchImplementation(objDelayConventions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnEntityTypeAnnotationChanged(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnEntityTypeAnnotationChanged = (JCObject)classInstance.Invoke("OnEntityTypeAnnotationChanged", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnEntityTypeAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnForeignKeyAnnotationChanged(IConventionForeignKeyBuilder relationshipBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnForeignKeyAnnotationChanged = (JCObject)classInstance.Invoke("OnForeignKeyAnnotationChanged", relationshipBuilder == null ? null : relationshipBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnForeignKeyAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnIndexAnnotationChanged(IConventionIndexBuilder indexBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnIndexAnnotationChanged = (JCObject)classInstance.Invoke("OnIndexAnnotationChanged", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnIndexAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnKeyAnnotationChanged(IConventionKeyBuilder keyBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnKeyAnnotationChanged = (JCObject)classInstance.Invoke("OnKeyAnnotationChanged", keyBuilder == null ? null : keyBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnKeyAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnModelAnnotationChanged(IConventionModelBuilder modelBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnModelAnnotationChanged = (JCObject)classInstance.Invoke("OnModelAnnotationChanged", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnModelAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnNavigationAnnotationChanged(IConventionForeignKeyBuilder relationshipBuilder, IConventionNavigation navigation, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnNavigationAnnotationChanged = (JCObject)classInstance.Invoke("OnNavigationAnnotationChanged", relationshipBuilder == null ? null : relationshipBuilder.getJCOInstance(), navigation == null ? null : navigation.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnNavigationAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnPropertyAnnotationChanged(IConventionPropertyBuilder propertyBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnPropertyAnnotationChanged = (JCObject)classInstance.Invoke("OnPropertyAnnotationChanged", propertyBuilder == null ? null : propertyBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnPropertyAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation OnSkipNavigationAnnotationChanged(IConventionSkipNavigationBuilder navigationBuilder, java.lang.String name, IConventionAnnotation annotation, IConventionAnnotation oldAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnSkipNavigationAnnotationChanged = (JCObject)classInstance.Invoke("OnSkipNavigationAnnotationChanged", navigationBuilder == null ? null : navigationBuilder.getJCOInstance(), name, annotation == null ? null : annotation.getJCOInstance(), oldAnnotation == null ? null : oldAnnotation.getJCOInstance());
            return new IConventionAnnotationImplementation(objOnSkipNavigationAnnotationChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionEntityType OnEntityTypeBaseTypeChanged(IConventionEntityTypeBuilder entityTypeBuilder, IConventionEntityType newBaseType, IConventionEntityType previousBaseType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnEntityTypeBaseTypeChanged = (JCObject)classInstance.Invoke("OnEntityTypeBaseTypeChanged", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), newBaseType == null ? null : newBaseType.getJCOInstance(), previousBaseType == null ? null : previousBaseType.getJCOInstance());
            return new IConventionEntityTypeImplementation(objOnEntityTypeBaseTypeChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionEntityType OnEntityTypeRemoved(IConventionModelBuilder modelBuilder, IConventionEntityType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnEntityTypeRemoved = (JCObject)classInstance.Invoke("OnEntityTypeRemoved", modelBuilder == null ? null : modelBuilder.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new IConventionEntityTypeImplementation(objOnEntityTypeRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionForeignKey OnForeignKeyRemoved(IConventionEntityTypeBuilder entityTypeBuilder, IConventionForeignKey foreignKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnForeignKeyRemoved = (JCObject)classInstance.Invoke("OnForeignKeyRemoved", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), foreignKey == null ? null : foreignKey.getJCOInstance());
            return new IConventionForeignKeyImplementation(objOnForeignKeyRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionForeignKey OnSkipNavigationForeignKeyChanged(IConventionSkipNavigationBuilder navigationBuilder, IConventionForeignKey foreignKey, IConventionForeignKey oldForeignKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnSkipNavigationForeignKeyChanged = (JCObject)classInstance.Invoke("OnSkipNavigationForeignKeyChanged", navigationBuilder == null ? null : navigationBuilder.getJCOInstance(), foreignKey == null ? null : foreignKey.getJCOInstance(), oldForeignKey == null ? null : oldForeignKey.getJCOInstance());
            return new IConventionForeignKeyImplementation(objOnSkipNavigationForeignKeyChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionIndex OnIndexRemoved(IConventionEntityTypeBuilder entityTypeBuilder, IConventionIndex index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnIndexRemoved = (JCObject)classInstance.Invoke("OnIndexRemoved", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), index == null ? null : index.getJCOInstance());
            return new IConventionIndexImplementation(objOnIndexRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionKey OnKeyRemoved(IConventionEntityTypeBuilder entityTypeBuilder, IConventionKey key) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnKeyRemoved = (JCObject)classInstance.Invoke("OnKeyRemoved", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), key == null ? null : key.getJCOInstance());
            return new IConventionKeyImplementation(objOnKeyRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionKey OnPrimaryKeyChanged(IConventionEntityTypeBuilder entityTypeBuilder, IConventionKey newPrimaryKey, IConventionKey previousPrimaryKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnPrimaryKeyChanged = (JCObject)classInstance.Invoke("OnPrimaryKeyChanged", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), newPrimaryKey == null ? null : newPrimaryKey.getJCOInstance(), previousPrimaryKey == null ? null : previousPrimaryKey.getJCOInstance());
            return new IConventionKeyImplementation(objOnPrimaryKeyChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionNavigation OnForeignKeyNullNavigationSet(IConventionForeignKeyBuilder relationshipBuilder, boolean pointsToPrincipal) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnForeignKeyNullNavigationSet = (JCObject)classInstance.Invoke("OnForeignKeyNullNavigationSet", relationshipBuilder == null ? null : relationshipBuilder.getJCOInstance(), pointsToPrincipal);
            return new IConventionNavigationImplementation(objOnForeignKeyNullNavigationSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionProperty OnPropertyRemoved(IConventionEntityTypeBuilder entityTypeBuilder, IConventionProperty property) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnPropertyRemoved = (JCObject)classInstance.Invoke("OnPropertyRemoved", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), property == null ? null : property.getJCOInstance());
            return new IConventionPropertyImplementation(objOnPropertyRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionSkipNavigation OnSkipNavigationInverseChanged(IConventionSkipNavigationBuilder navigationBuilder, IConventionSkipNavigation inverse, IConventionSkipNavigation oldInverse) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnSkipNavigationInverseChanged = (JCObject)classInstance.Invoke("OnSkipNavigationInverseChanged", navigationBuilder == null ? null : navigationBuilder.getJCOInstance(), inverse == null ? null : inverse.getJCOInstance(), oldInverse == null ? null : oldInverse.getJCOInstance());
            return new IConventionSkipNavigationImplementation(objOnSkipNavigationInverseChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionSkipNavigation OnSkipNavigationRemoved(IConventionEntityTypeBuilder entityTypeBuilder, IConventionSkipNavigation navigation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnSkipNavigationRemoved = (JCObject)classInstance.Invoke("OnSkipNavigationRemoved", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), navigation == null ? null : navigation.getJCOInstance());
            return new IConventionSkipNavigationImplementation(objOnSkipNavigationRemoved);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo OnPropertyFieldChanged(IConventionPropertyBuilder propertyBuilder, FieldInfo newFieldInfo, FieldInfo oldFieldInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOnPropertyFieldChanged = (JCObject)classInstance.Invoke("OnPropertyFieldChanged", propertyBuilder == null ? null : propertyBuilder.getJCOInstance(), newFieldInfo == null ? null : newFieldInfo.getJCOInstance(), oldFieldInfo == null ? null : oldFieldInfo.getJCOInstance());
            return new FieldInfo(objOnPropertyFieldChanged);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String OnEntityTypeIgnored(IConventionModelBuilder modelBuilder, java.lang.String name, NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("OnEntityTypeIgnored", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String OnEntityTypeMemberIgnored(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("OnEntityTypeMemberIgnored", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String OnNavigationRemoved(IConventionEntityTypeBuilder sourceEntityTypeBuilder, IConventionEntityTypeBuilder targetEntityTypeBuilder, java.lang.String navigationName, MemberInfo memberInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("OnNavigationRemoved", sourceEntityTypeBuilder == null ? null : sourceEntityTypeBuilder.getJCOInstance(), targetEntityTypeBuilder == null ? null : targetEntityTypeBuilder.getJCOInstance(), navigationName, memberInfo == null ? null : memberInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertNoScope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertNoScope");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public MetadataTracker getTracker() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Tracker");
            return new MetadataTracker(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}