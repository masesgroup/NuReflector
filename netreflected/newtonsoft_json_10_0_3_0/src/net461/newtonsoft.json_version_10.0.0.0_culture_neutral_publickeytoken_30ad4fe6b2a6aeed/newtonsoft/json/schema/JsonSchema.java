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

package newtonsoft.json.schema;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import newtonsoft.json.schema.JsonSchema;
import newtonsoft.json.schema.JsonSchemaResolver;
import newtonsoft.json.JsonReader;
import newtonsoft.json.JsonWriter;
import newtonsoft.json.linq.JToken;


/**
 * The base .NET class managing Newtonsoft.Json.Schema.JsonSchema, Newtonsoft.Json, Version=10.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Newtonsoft.Json.Schema.JsonSchema" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Newtonsoft.Json.Schema.JsonSchema</a>
 */
public class JsonSchema extends NetObject  {
    /**
     * Fully assembly qualified name: Newtonsoft.Json, Version=10.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed
     */
    public static final String assemblyFullName = "Newtonsoft.Json, Version=10.0.0.0, Culture=neutral, PublicKeyToken=30ad4fe6b2a6aeed";
    /**
     * Assembly name: Newtonsoft.Json
     */
    public static final String assemblyShortName = "Newtonsoft.Json";
    /**
     * Qualified class name: Newtonsoft.Json.Schema.JsonSchema
     */
    public static final String className = "Newtonsoft.Json.Schema.JsonSchema";
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
    public JsonSchema(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link JsonSchema}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link JsonSchema} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static JsonSchema cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new JsonSchema(from.getJCOInstance());
    }

    // Constructors section
    
    public JsonSchema() throws Throwable, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static JsonSchema Parse(java.lang.String json) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonReaderException, system.InvalidOperationException, system.RankException, newtonsoft.json.JsonException, system.FormatException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.OverflowException, system.globalization.CultureNotFoundException, system.UriFormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", json);
            return new JsonSchema(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static JsonSchema Parse(java.lang.String json, JsonSchemaResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonReaderException, system.InvalidOperationException, system.RankException, newtonsoft.json.JsonException, system.FormatException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.OverflowException, system.UriFormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", json, resolver == null ? null : resolver.getJCOInstance());
            return new JsonSchema(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static JsonSchema Read(JsonReader reader) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonReaderException, system.InvalidOperationException, system.RankException, newtonsoft.json.JsonException, system.FormatException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.OverflowException, system.UriFormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", reader == null ? null : reader.getJCOInstance());
            return new JsonSchema(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static JsonSchema Read(JsonReader reader, JsonSchemaResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, newtonsoft.json.JsonReaderException, system.InvalidOperationException, system.RankException, newtonsoft.json.JsonException, system.FormatException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.UriFormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", reader == null ? null : reader.getJCOInstance(), resolver == null ? null : resolver.getJCOInstance());
            return new JsonSchema(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(JsonWriter writer) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonWriterException, system.NotSupportedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(JsonWriter writer, JsonSchemaResolver resolver) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, newtonsoft.json.JsonWriterException, system.NotSupportedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", writer == null ? null : writer.getJCOInstance(), resolver == null ? null : resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAllowAdditionalItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowAdditionalItems");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowAdditionalItems(boolean AllowAdditionalItems) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowAdditionalItems", AllowAdditionalItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowAdditionalProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowAdditionalProperties");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowAdditionalProperties(boolean AllowAdditionalProperties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowAdditionalProperties", AllowAdditionalProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPositionalItemsValidation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("PositionalItemsValidation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPositionalItemsValidation(boolean PositionalItemsValidation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PositionalItemsValidation", PositionalItemsValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUniqueItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UniqueItems");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUniqueItems(boolean UniqueItems) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UniqueItems", UniqueItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JToken getDefault() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Default");
            return new JToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefault(JToken Default) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Default", Default == null ? null : Default.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonSchema getAdditionalItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AdditionalItems");
            return new JsonSchema(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdditionalItems(JsonSchema AdditionalItems) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AdditionalItems", AdditionalItems == null ? null : AdditionalItems.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonSchema getAdditionalProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AdditionalProperties");
            return new JsonSchema(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdditionalProperties(JsonSchema AdditionalProperties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AdditionalProperties", AdditionalProperties == null ? null : AdditionalProperties.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Description", Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Format");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormat(java.lang.String Format) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Format", Format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Id", Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Pattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPattern(java.lang.String Pattern) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Pattern", Pattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRequires() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Requires");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequires(java.lang.String Requires) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Requires", Requires);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTitle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Title");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTitle(java.lang.String Title) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Title", Title);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}