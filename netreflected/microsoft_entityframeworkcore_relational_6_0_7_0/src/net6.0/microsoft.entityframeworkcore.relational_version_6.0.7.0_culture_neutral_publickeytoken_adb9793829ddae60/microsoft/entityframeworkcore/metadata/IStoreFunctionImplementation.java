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
import microsoft.entityframeworkcore.metadata.ITableBase;
import microsoft.entityframeworkcore.metadata.ITableBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IAnnotatableImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IColumnBase;
import microsoft.entityframeworkcore.metadata.IColumnBaseImplementation;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.IRelationalModel;
import microsoft.entityframeworkcore.metadata.IRelationalModelImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IStoreFunction, Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IStoreFunction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IStoreFunction</a>
 */
public class IStoreFunctionImplementation extends NetObject implements IStoreFunction {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IStoreFunction
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IStoreFunction";
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
    public IStoreFunctionImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IStoreFunction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IStoreFunction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IStoreFunction ToIStoreFunction(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IStoreFunctionImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean IsOptional(IEntityType entityType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsOptional", entityType == null ? null : entityType.getJCOInstance());
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

    public IColumnBase FindColumn(IProperty property) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindColumn = (JCObject)classInstance.Invoke("FindColumn", property == null ? null : property.getJCOInstance());
            return new IColumnBaseImplementation(objFindColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IColumnBase FindColumn(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindColumn = (JCObject)classInstance.Invoke("FindColumn", name);
            return new IColumnBaseImplementation(objFindColumn);
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

    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToDebugString", options == null ? null : options.getJCOInstance(), indent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsBuiltIn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsBuiltIn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsShared() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsShared");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRelationalModel getModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new IRelationalModelImplementation(val);
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

    public java.lang.String getReturnType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ReturnType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSchema() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Schema");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}