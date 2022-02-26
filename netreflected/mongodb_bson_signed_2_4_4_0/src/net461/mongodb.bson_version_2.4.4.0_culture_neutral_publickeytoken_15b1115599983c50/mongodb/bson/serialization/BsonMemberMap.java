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

package mongodb.bson.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mongodb.bson.serialization.BsonClassMap;
import system.reflection.MemberInfo;
import mongodb.bson.serialization.BsonMemberMap;
import mongodb.bson.serialization.IIdGenerator;
import mongodb.bson.serialization.IIdGeneratorImplementation;
import mongodb.bson.serialization.IBsonSerializer;
import mongodb.bson.serialization.IBsonSerializerImplementation;


/**
 * The base .NET class managing MongoDB.Bson.Serialization.BsonMemberMap, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.BsonMemberMap" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.BsonMemberMap</a>
 */
public class BsonMemberMap extends NetObject  {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.Serialization.BsonMemberMap
     */
    public static final String className = "MongoDB.Bson.Serialization.BsonMemberMap";
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
    public BsonMemberMap(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BsonMemberMap}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BsonMemberMap} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BsonMemberMap cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BsonMemberMap(from.getJCOInstance());
    }

    // Constructors section
    
    public BsonMemberMap() throws Throwable {
    }

    public BsonMemberMap(BsonClassMap classMap, MemberInfo memberInfo) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(classMap == null ? null : classMap.getJCOInstance(), memberInfo == null ? null : memberInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean ShouldSerialize(NetObject obj, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerialize", obj == null ? null : obj.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap Reset() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReset = (JCObject)classInstance.Invoke("Reset");
            return new BsonMemberMap(objReset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetDefaultValue(NetObject defaultValue) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetDefaultValue = (JCObject)classInstance.Invoke("SetDefaultValue", defaultValue == null ? null : defaultValue.getJCOInstance());
            return new BsonMemberMap(objSetDefaultValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetElementName(java.lang.String elementName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetElementName = (JCObject)classInstance.Invoke("SetElementName", elementName);
            return new BsonMemberMap(objSetElementName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetIdGenerator(IIdGenerator idGenerator) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIdGenerator = (JCObject)classInstance.Invoke("SetIdGenerator", idGenerator == null ? null : idGenerator.getJCOInstance());
            return new BsonMemberMap(objSetIdGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetIgnoreIfDefault(boolean ignoreIfDefault) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIgnoreIfDefault = (JCObject)classInstance.Invoke("SetIgnoreIfDefault", ignoreIfDefault);
            return new BsonMemberMap(objSetIgnoreIfDefault);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetIgnoreIfNull(boolean ignoreIfNull) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIgnoreIfNull = (JCObject)classInstance.Invoke("SetIgnoreIfNull", ignoreIfNull);
            return new BsonMemberMap(objSetIgnoreIfNull);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetIsRequired(boolean isRequired) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetIsRequired = (JCObject)classInstance.Invoke("SetIsRequired", isRequired);
            return new BsonMemberMap(objSetIsRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetOrder(int order) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetOrder = (JCObject)classInstance.Invoke("SetOrder", order);
            return new BsonMemberMap(objSetOrder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonMemberMap SetSerializer(IBsonSerializer serializer) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSerializer = (JCObject)classInstance.Invoke("SetSerializer", serializer == null ? null : serializer.getJCOInstance());
            return new BsonMemberMap(objSetSerializer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBsonSerializer GetSerializer() throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NullReferenceException, system.FormatException, mongodb.bson.BsonSerializationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSerializer = (JCObject)classInstance.Invoke("GetSerializer");
            return new IBsonSerializerImplementation(objGetSerializer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyDefaultValue(NetObject obj) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, mongodb.bson.BsonSerializationException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.security.SecurityException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyDefaultValue", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Freeze() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Freeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIgnoreIfDefault() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreIfDefault");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreIfNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreIfNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDefaultValueSpecified() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDefaultValueSpecified");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRequired() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMemberTypeIsBsonValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("MemberTypeIsBsonValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getOrder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Order");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonClassMap getClassMap() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClassMap");
            return new BsonClassMap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IIdGenerator getIdGenerator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IdGenerator");
            return new IIdGeneratorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDefaultValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo getMemberInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MemberInfo");
            return new MemberInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getElementName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ElementName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMemberName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MemberName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getMemberType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MemberType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}