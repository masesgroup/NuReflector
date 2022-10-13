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

package microsoft.entityframeworkcore.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigation;
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigationImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigationBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigationBaseImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.IConventionNavigationBase;
import microsoft.entityframeworkcore.metadata.IConventionNavigationBaseImplementation;
import microsoft.entityframeworkcore.metadata.IConventionPropertyBase;
import microsoft.entityframeworkcore.metadata.IConventionPropertyBaseImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatable;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatableImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.IConventionAnnotation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IConventionNavigation;
import microsoft.entityframeworkcore.metadata.IConventionNavigationImplementation;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.PropertyAccessMode;
import system.reflection.FieldInfo;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilderImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionForeignKey;
import microsoft.entityframeworkcore.metadata.IConventionForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IConventionTypeBase;
import microsoft.entityframeworkcore.metadata.IConventionTypeBaseImplementation;
import system.reflection.PropertyInfo;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IConventionNavigation, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionNavigation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionNavigation</a>
 */
public class IConventionNavigationImplementation extends NetObject implements IConventionNavigation {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IConventionNavigation
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IConventionNavigation";
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
    public IConventionNavigationImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IConventionNavigation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IConventionNavigation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IConventionNavigation ToIConventionNavigation(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IConventionNavigationImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean IsIndexerProperty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsIndexerProperty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsShadowProperty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsShadowProperty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAnnotation FindAnnotation(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAnnotation = (JCObject)classInstance.Invoke("FindAnnotation", name);
            return new IAnnotationImplementation(objFindAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAnnotation GetAnnotation(java.lang.String annotationName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAnnotation = (JCObject)classInstance.Invoke("GetAnnotation", annotationName);
            return new IAnnotationImplementation(objGetAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSource GetConfigurationSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetConfigurationSource = (JCObject)classInstance.Invoke("GetConfigurationSource");
            return new ConfigurationSource(objGetConfigurationSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation AddAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddAnnotation = (JCObject)classInstance.Invoke("AddAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotationImplementation(objAddAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation RemoveAnnotation(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveAnnotation = (JCObject)classInstance.Invoke("RemoveAnnotation", name);
            return new IConventionAnnotationImplementation(objRemoveAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation SetAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetAnnotation = (JCObject)classInstance.Invoke("SetAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotationImplementation(objSetAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotation SetOrRemoveAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetOrRemoveAnnotation = (JCObject)classInstance.Invoke("SetOrRemoveAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotationImplementation(objSetOrRemoveAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionNavigation SetInverse(MemberInfo inverse, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetInverse = (JCObject)classInstance.Invoke("SetInverse", inverse == null ? null : inverse.getJCOInstance(), fromDataAnnotation);
            return new IConventionNavigationImplementation(objSetInverse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionNavigation SetInverse(java.lang.String inverseName, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetInverse = (JCObject)classInstance.Invoke("SetInverse", inverseName, fromDataAnnotation);
            return new IConventionNavigationImplementation(objSetInverse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyAccessMode GetPropertyAccessMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPropertyAccessMode = (JCObject)classInstance.Invoke("GetPropertyAccessMode");
            return new PropertyAccessMode(objGetPropertyAccessMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo SetField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetField = (JCObject)classInstance.Invoke("SetField", fieldName, fromDataAnnotation);
            return new FieldInfo(objSetField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo SetFieldInfo(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetFieldInfo = (JCObject)classInstance.Invoke("SetFieldInfo", fieldInfo == null ? null : fieldInfo.getJCOInstance(), fromDataAnnotation);
            return new FieldInfo(objSetFieldInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String AnnotationsToDebugString(int indent) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("AnnotationsToDebugString", indent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFieldName() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetFieldName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToDebugString", options == null ? null : options.getJCOInstance(), indent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetField", fieldInfo == null ? null : fieldInfo.getJCOInstance(), fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsCollection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCollection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEagerLoaded() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEagerLoaded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsOnDependent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsOnDependent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder getBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Builder");
            return new IConventionAnnotatableBuilderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionEntityType getDeclaringEntityType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringEntityType");
            return new IConventionEntityTypeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionEntityType getTargetEntityType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TargetEntityType");
            return new IConventionEntityTypeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionForeignKey getForeignKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ForeignKey");
            return new IConventionForeignKeyImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionNavigation getInverse() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Inverse");
            return new IConventionNavigationImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionTypeBase getDeclaringType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringType");
            return new IConventionTypeBaseImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo getFieldInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FieldInfo");
            return new FieldInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo getPropertyInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyInfo");
            return new PropertyInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getClrType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}