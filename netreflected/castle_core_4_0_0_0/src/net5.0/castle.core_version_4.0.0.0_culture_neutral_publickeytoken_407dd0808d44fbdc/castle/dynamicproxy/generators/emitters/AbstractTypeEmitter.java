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

package castle.dynamicproxy.generators.emitters;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import castle.dynamicproxy.generators.emitters.ConstructorEmitter;
import castle.dynamicproxy.generators.emitters.simpleast.ArgumentReference;
import castle.dynamicproxy.generators.emitters.EventEmitter;
import system.reflection.EventAttributes;
import castle.dynamicproxy.generators.emitters.MethodEmitter;
import system.reflection.MethodAttributes;
import system.reflection.MethodInfo;
import castle.dynamicproxy.generators.emitters.PropertyEmitter;
import system.reflection.PropertyAttributes;
import castle.dynamicproxy.generators.emitters.simpleast.FieldReference;
import system.reflection.FieldAttributes;
import castle.dynamicproxy.ProxyGenerationOptions;
import system.reflection.emit.CustomAttributeBuilder;
import system.reflection.emit.GenericTypeParameterBuilder;
import castle.dynamicproxy.generators.emitters.ConstructorCollection;
import castle.dynamicproxy.generators.emitters.NestedClassCollection;
import castle.dynamicproxy.generators.emitters.TypeConstructorEmitter;
import system.reflection.emit.TypeBuilder;


/**
 * The base .NET class managing Castle.DynamicProxy.Generators.Emitters.AbstractTypeEmitter, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.Emitters.AbstractTypeEmitter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.Emitters.AbstractTypeEmitter</a>
 */
public class AbstractTypeEmitter extends NetObject  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.DynamicProxy.Generators.Emitters.AbstractTypeEmitter
     */
    public static final String className = "Castle.DynamicProxy.Generators.Emitters.AbstractTypeEmitter";
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
    public AbstractTypeEmitter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AbstractTypeEmitter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AbstractTypeEmitter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AbstractTypeEmitter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AbstractTypeEmitter(from.getJCOInstance());
    }

    // Constructors section
    
    public AbstractTypeEmitter() throws Throwable {
    }

    
    // Methods section
    
    public ConstructorEmitter CreateConstructor(ArgumentReference... arguments) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateConstructor = (JCObject)classInstance.Invoke("CreateConstructor", (java.lang.Object)toObjectFromArray(arguments));
            return new ConstructorEmitter(objCreateConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConstructorEmitter CreateTypeConstructor() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateTypeConstructor = (JCObject)classInstance.Invoke("CreateTypeConstructor");
            return new ConstructorEmitter(objCreateTypeConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventEmitter CreateEvent(java.lang.String name, EventAttributes atts, NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateEvent = (JCObject)classInstance.Invoke("CreateEvent", name, atts == null ? null : atts.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new EventEmitter(objCreateEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodEmitter CreateMethod(java.lang.String name, MethodAttributes attributes, MethodInfo methodToUseAsATemplate) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMethod = (JCObject)classInstance.Invoke("CreateMethod", name, attributes == null ? null : attributes.getJCOInstance(), methodToUseAsATemplate == null ? null : methodToUseAsATemplate.getJCOInstance());
            return new MethodEmitter(objCreateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodEmitter CreateMethod(java.lang.String name, MethodAttributes attrs, NetType returnType, NetType... argumentTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMethod = (JCObject)classInstance.Invoke("CreateMethod", name, attrs == null ? null : attrs.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(argumentTypes));
            return new MethodEmitter(objCreateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodEmitter CreateMethod(java.lang.String name, MethodInfo methodToUseAsATemplate) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMethod = (JCObject)classInstance.Invoke("CreateMethod", name, methodToUseAsATemplate == null ? null : methodToUseAsATemplate.getJCOInstance());
            return new MethodEmitter(objCreateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodEmitter CreateMethod(java.lang.String name, NetType returnType, NetType... parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMethod = (JCObject)classInstance.Invoke("CreateMethod", name, returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new MethodEmitter(objCreateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyEmitter CreateProperty(java.lang.String name, PropertyAttributes attributes, NetType propertyType, NetType[] arguments) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateProperty = (JCObject)classInstance.Invoke("CreateProperty", name, attributes == null ? null : attributes.getJCOInstance(), propertyType == null ? null : propertyType.getJCOInstance(), toObjectFromArray(arguments));
            return new PropertyEmitter(objCreateProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference CreateField(java.lang.String name, NetType fieldType, boolean serializable) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateField = (JCObject)classInstance.Invoke("CreateField", name, fieldType == null ? null : fieldType.getJCOInstance(), serializable);
            return new FieldReference(objCreateField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference CreateField(java.lang.String name, NetType fieldType, FieldAttributes atts) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateField = (JCObject)classInstance.Invoke("CreateField", name, fieldType == null ? null : fieldType.getJCOInstance(), atts == null ? null : atts.getJCOInstance());
            return new FieldReference(objCreateField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference CreateField(java.lang.String name, NetType fieldType) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateField = (JCObject)classInstance.Invoke("CreateField", name, fieldType == null ? null : fieldType.getJCOInstance());
            return new FieldReference(objCreateField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference CreateStaticField(java.lang.String name, NetType fieldType, FieldAttributes atts) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateStaticField = (JCObject)classInstance.Invoke("CreateStaticField", name, fieldType == null ? null : fieldType.getJCOInstance(), atts == null ? null : atts.getJCOInstance());
            return new FieldReference(objCreateStaticField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference CreateStaticField(java.lang.String name, NetType fieldType) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateStaticField = (JCObject)classInstance.Invoke("CreateStaticField", name, fieldType == null ? null : fieldType.getJCOInstance());
            return new FieldReference(objCreateStaticField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldReference GetField(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetField = (JCObject)classInstance.Invoke("GetField", name);
            return new FieldReference(objGetField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType BuildType() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildType = (JCObject)classInstance.Invoke("BuildType");
            return new NetType(objBuildType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetGenericArgument(java.lang.String genericArgumentName) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGenericArgument = (JCObject)classInstance.Invoke("GetGenericArgument", genericArgumentName);
            return new NetType(objGetGenericArgument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetGenericArgumentsFor(MethodInfo genericMethod) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetGenericArgumentsFor", genericMethod == null ? null : genericMethod.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetGenericArgumentsFor(NetType genericType) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetGenericArgumentsFor", genericType == null ? null : genericType.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(ProxyGenerationOptions proxyGenerationOptions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddCustomAttributes", proxyGenerationOptions == null ? null : proxyGenerationOptions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyGenericParametersFromMethod(MethodInfo methodToCopyGenericsFrom) throws Throwable, castle.dynamicproxy.ProxyGenerationException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyGenericParametersFromMethod", methodToCopyGenericsFrom == null ? null : methodToCopyGenericsFrom.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateDefaultConstructor() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateDefaultConstructor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DefineCustomAttribute(CustomAttributeBuilder attribute) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DefineCustomAttribute", attribute == null ? null : attribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGenericTypeParameters(GenericTypeParameterBuilder[] genericTypeParameterBuilders) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetGenericTypeParameters", (java.lang.Object)toObjectFromArray(genericTypeParameterBuilders));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ConstructorCollection getConstructors() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Constructors");
            return new ConstructorCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NestedClassCollection getNested() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Nested");
            return new NestedClassCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeConstructorEmitter getClassConstructor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClassConstructor");
            return new TypeConstructorEmitter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClassConstructor(TypeConstructorEmitter ClassConstructor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClassConstructor", ClassConstructor == null ? null : ClassConstructor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final GenericTypeParameterBuilder[] getGenericTypeParams() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<GenericTypeParameterBuilder> resultingArrayList = new ArrayList<GenericTypeParameterBuilder>();
            JCObject resultingObjects = (JCObject)classInstance.Get("GenericTypeParams");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new GenericTypeParameterBuilder(resultingObject));
            }
            GenericTypeParameterBuilder[] resultingArray = new GenericTypeParameterBuilder[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder getTypeBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TypeBuilder");
            return new TypeBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getBaseType() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}