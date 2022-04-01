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
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyModel;
import microsoft.entityframeworkcore.metadata.IReadOnlyModelImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IAnnotatableImplementation;
import system.reflection.MethodInfo;
import microsoft.entityframeworkcore.ChangeTrackingStrategy;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.infrastructure.RuntimeModelDependencies;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.ITypeMappingConfiguration;
import microsoft.entityframeworkcore.metadata.ITypeMappingConfigurationImplementation;
import microsoft.entityframeworkcore.PropertyAccessMode;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeModel, Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeModel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeModel</a>
 */
public class IRuntimeModelImplementation extends NetObject implements IRuntimeModel {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeModel
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeModel";
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
    public IRuntimeModelImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRuntimeModel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRuntimeModel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRuntimeModel ToIRuntimeModel(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IRuntimeModelImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean IsIndexerMethod(MethodInfo methodInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsIndexerMethod", methodInfo == null ? null : methodInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsShared(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsShared", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeTrackingStrategy GetChangeTrackingStrategy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetChangeTrackingStrategy = (JCObject)classInstance.Invoke("GetChangeTrackingStrategy");
            return new ChangeTrackingStrategy(objGetChangeTrackingStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAnnotation AddRuntimeAnnotation(java.lang.String name, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddRuntimeAnnotation = (JCObject)classInstance.Invoke("AddRuntimeAnnotation", name, value == null ? null : value.getJCOInstance());
            return new IAnnotationImplementation(objAddRuntimeAnnotation);
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

    public IAnnotation FindRuntimeAnnotation(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindRuntimeAnnotation = (JCObject)classInstance.Invoke("FindRuntimeAnnotation", name);
            return new IAnnotationImplementation(objFindRuntimeAnnotation);
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

    public IAnnotation RemoveRuntimeAnnotation(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveRuntimeAnnotation = (JCObject)classInstance.Invoke("RemoveRuntimeAnnotation", name);
            return new IAnnotationImplementation(objRemoveRuntimeAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAnnotation SetRuntimeAnnotation(java.lang.String name, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetRuntimeAnnotation = (JCObject)classInstance.Invoke("SetRuntimeAnnotation", name, value == null ? null : value.getJCOInstance());
            return new IAnnotationImplementation(objSetRuntimeAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RuntimeModelDependencies GetModelDependencies() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetModelDependencies = (JCObject)classInstance.Invoke("GetModelDependencies");
            return new RuntimeModelDependencies(objGetModelDependencies);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEntityType FindEntityType(java.lang.String name, java.lang.String definingNavigationName, IEntityType definingEntityType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", name, definingNavigationName, definingEntityType == null ? null : definingEntityType.getJCOInstance());
            return new IEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEntityType FindEntityType(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", name);
            return new IEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEntityType FindEntityType(NetType type, java.lang.String definingNavigationName, IEntityType definingEntityType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", type == null ? null : type.getJCOInstance(), definingNavigationName, definingEntityType == null ? null : definingEntityType.getJCOInstance());
            return new IEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEntityType FindEntityType(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", type == null ? null : type.getJCOInstance());
            return new IEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEntityType FindRuntimeEntityType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindRuntimeEntityType = (JCObject)classInstance.Invoke("FindRuntimeEntityType", type == null ? null : type.getJCOInstance());
            return new IEntityTypeImplementation(objFindRuntimeEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IReadOnlyEntityType FindEntityType(java.lang.String name, java.lang.String definingNavigationName, IReadOnlyEntityType definingEntityType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", name, definingNavigationName, definingEntityType == null ? null : definingEntityType.getJCOInstance());
            return new IReadOnlyEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IReadOnlyEntityType FindEntityType(NetType type, java.lang.String definingNavigationName, IReadOnlyEntityType definingEntityType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindEntityType = (JCObject)classInstance.Invoke("FindEntityType", type == null ? null : type.getJCOInstance(), definingNavigationName, definingEntityType == null ? null : definingEntityType.getJCOInstance());
            return new IReadOnlyEntityTypeImplementation(objFindEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITypeMappingConfiguration FindTypeMappingConfiguration(NetType scalarType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTypeMappingConfiguration = (JCObject)classInstance.Invoke("FindTypeMappingConfiguration", scalarType == null ? null : scalarType.getJCOInstance());
            return new ITypeMappingConfigurationImplementation(objFindTypeMappingConfiguration);
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

    public NetObject FindRuntimeAnnotationValue(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindRuntimeAnnotationValue = (JCObject)classInstance.Invoke("FindRuntimeAnnotationValue", name);
            return new NetObject(objFindRuntimeAnnotationValue);
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

    public java.lang.String GetProductVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetProductVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToDebugString", options == null ? null : options.getJCOInstance(), indent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getSkipDetectChanges() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SkipDetectChanges");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RuntimeModelDependencies getModelDependencies() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ModelDependencies");
            return new RuntimeModelDependencies(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelDependencies(RuntimeModelDependencies ModelDependencies) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ModelDependencies", ModelDependencies == null ? null : ModelDependencies.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getRelationalModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RelationalModel");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}