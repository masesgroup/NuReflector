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
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilderImplementation;
import system.reflection.FieldInfo;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionPropertyBaseBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilderImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatable;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatableImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Builders.IConventionPropertyBaseBuilder, Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.IConventionPropertyBaseBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Builders.IConventionPropertyBaseBuilder</a>
 */
public class IConventionPropertyBaseBuilderImplementation extends NetObject implements IConventionPropertyBaseBuilder {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Builders.IConventionPropertyBaseBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Builders.IConventionPropertyBaseBuilder";
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
    public IConventionPropertyBaseBuilderImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IConventionPropertyBaseBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IConventionPropertyBaseBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IConventionPropertyBaseBuilder ToIConventionPropertyBaseBuilder(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IConventionPropertyBaseBuilderImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean CanRemoveAnnotation(java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanRemoveAnnotation", name, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanSetAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanSetAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanSetField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanSetField", fieldInfo == null ? null : fieldInfo.getJCOInstance(), fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanSetField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanSetField", fieldName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder HasAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasAnnotation = (JCObject)classInstance.Invoke("HasAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotatableBuilderImplementation(objHasAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder HasNoAnnotation(java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNoAnnotation = (JCObject)classInstance.Invoke("HasNoAnnotation", name, fromDataAnnotation);
            return new IConventionAnnotatableBuilderImplementation(objHasNoAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder HasNonNullAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasNonNullAnnotation = (JCObject)classInstance.Invoke("HasNonNullAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotatableBuilderImplementation(objHasNonNullAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder RemoveAnnotation(java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveAnnotation = (JCObject)classInstance.Invoke("RemoveAnnotation", name, fromDataAnnotation);
            return new IConventionAnnotatableBuilderImplementation(objRemoveAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatableBuilder SetOrRemoveAnnotation(java.lang.String name, NetObject value, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetOrRemoveAnnotation = (JCObject)classInstance.Invoke("SetOrRemoveAnnotation", name, value == null ? null : value.getJCOInstance(), fromDataAnnotation);
            return new IConventionAnnotatableBuilderImplementation(objSetOrRemoveAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionPropertyBaseBuilder HasField(FieldInfo fieldInfo, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldInfo == null ? null : fieldInfo.getJCOInstance(), fromDataAnnotation);
            return new IConventionPropertyBaseBuilderImplementation(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionPropertyBaseBuilder HasField(java.lang.String fieldName, boolean fromDataAnnotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasField = (JCObject)classInstance.Invoke("HasField", fieldName, fromDataAnnotation);
            return new IConventionPropertyBaseBuilderImplementation(objHasField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IConventionModelBuilder getModelBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ModelBuilder");
            return new IConventionModelBuilderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConventionAnnotatable getMetadata() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new IConventionAnnotatableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}