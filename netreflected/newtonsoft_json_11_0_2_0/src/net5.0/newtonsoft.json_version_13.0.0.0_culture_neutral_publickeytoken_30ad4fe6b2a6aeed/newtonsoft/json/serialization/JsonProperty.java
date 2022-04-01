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

package newtonsoft.json.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import newtonsoft.json.JsonConverter;
import newtonsoft.json.Required;
import newtonsoft.json.serialization.IAttributeProvider;
import newtonsoft.json.serialization.IAttributeProviderImplementation;
import newtonsoft.json.serialization.IValueProvider;
import newtonsoft.json.serialization.IValueProviderImplementation;


/**
 * The base .NET class managing Newtonsoft.Json.Serialization.JsonProperty, Newtonsoft.Json, Version=13.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Newtonsoft.Json.Serialization.JsonProperty" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Newtonsoft.Json.Serialization.JsonProperty</a>
 */
public class JsonProperty extends NetObject  {
    /**
     * Fully assembly qualified name: Newtonsoft.Json, Version=13.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed
     */
    public static final String assemblyFullName = "Newtonsoft.Json, Version=13.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed";
    /**
     * Assembly name: Newtonsoft.Json
     */
    public static final String assemblyShortName = "Newtonsoft.Json";
    /**
     * Qualified class name: Newtonsoft.Json.Serialization.JsonProperty
     */
    public static final String className = "Newtonsoft.Json.Serialization.JsonProperty";
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
    public JsonProperty(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link JsonProperty}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link JsonProperty} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static JsonProperty cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new JsonProperty(from.getJCOInstance());
    }

    // Constructors section
    
    public JsonProperty() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getHasMemberAttribute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasMemberAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHasMemberAttribute(boolean HasMemberAttribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HasMemberAttribute", HasMemberAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnored() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Ignored");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnored(boolean Ignored) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Ignored", Ignored);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRequiredSpecified() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRequiredSpecified");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Readable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadable(boolean Readable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Readable", Readable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getWritable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Writable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWritable(boolean Writable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Writable", Writable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonConverter getConverter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Converter");
            return new JsonConverter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConverter(JsonConverter Converter) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Converter", Converter == null ? null : Converter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonConverter getItemConverter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ItemConverter");
            return new JsonConverter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setItemConverter(JsonConverter ItemConverter) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ItemConverter", ItemConverter == null ? null : ItemConverter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonConverter getMemberConverter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MemberConverter");
            return new JsonConverter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMemberConverter(JsonConverter MemberConverter) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MemberConverter", MemberConverter == null ? null : MemberConverter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Required getRequired() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Required");
            return new Required(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequired(Required Required) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Required", Required == null ? null : Required.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAttributeProvider getAttributeProvider() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AttributeProvider");
            return new IAttributeProviderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAttributeProvider(IAttributeProvider AttributeProvider) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AttributeProvider", AttributeProvider == null ? null : AttributeProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IValueProvider getValueProvider() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ValueProvider");
            return new IValueProviderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValueProvider(IValueProvider ValueProvider) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ValueProvider", ValueProvider == null ? null : ValueProvider.getJCOInstance());
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

    public void setDefaultValue(NetObject DefaultValue) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultValue", DefaultValue == null ? null : DefaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPropertyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPropertyName(java.lang.String PropertyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PropertyName", PropertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUnderlyingName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("UnderlyingName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnderlyingName(java.lang.String UnderlyingName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UnderlyingName", UnderlyingName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDeclaringType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeclaringType(NetType DeclaringType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DeclaringType", DeclaringType == null ? null : DeclaringType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getPropertyType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPropertyType(NetType PropertyType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PropertyType", PropertyType == null ? null : PropertyType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}