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

package mongodb.bson;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mongodb.bson.BsonValue;
import mongodb.bson.BsonElement;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import mongodb.bson.BsonDocument;
import system.collections.Hashtable;
import mongodb.bson.BsonType;
import mongodb.bson.IConvertibleToBsonDocument;
import mongodb.bson.IConvertibleToBsonDocumentImplementation;


/**
 * The base .NET class managing MongoDB.Bson.BsonDocument, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.BsonDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.BsonDocument</a>
 */
public class BsonDocument extends BsonValue implements mongodb.bson.IConvertibleToBsonDocument {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.BsonDocument
     */
    public static final String className = "MongoDB.Bson.BsonDocument";
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
    public BsonDocument(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BsonDocument}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BsonDocument} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BsonDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BsonDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public BsonDocument() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(boolean allowDuplicateNames) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(allowDuplicateNames));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(BsonElement element) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(element == null ? null : element.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(BsonElement... elements) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)toObjectFromArray(elements)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(IDictionary dictionary) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.InvalidOperationException, mongodb.bson.BsonInternalException, system.NullReferenceException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dictionary == null ? null : dictionary.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(IDictionary dictionary, IEnumerable keys) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.InvalidOperationException, mongodb.bson.BsonInternalException, system.NullReferenceException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dictionary == null ? null : dictionary.getJCOInstance(), keys == null ? null : keys.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument(java.lang.String name, BsonValue value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name, value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Contains(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsValue(BsonValue value) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ContainsValue", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(BsonDocument obj) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetElement(java.lang.String name, JCORefOut<BsonElement> value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetElement", name, value.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetValue(java.lang.String name, JCORefOut<BsonValue> value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetValue", name, value.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean TryParse(java.lang.String s, JCORefOut<BsonDocument> result) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentException, mongodb.bson.BsonSerializationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("TryParse", s, result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(BsonDocument rhs) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", rhs == null ? null : rhs.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(BsonValue other) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOfName(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexOfName", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(BsonElement element) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", element == null ? null : element.getJCOInstance());
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(BsonElement... elements) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", (java.lang.Object)toObjectFromArray(elements));
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(IDictionary dictionary) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.InvalidOperationException, mongodb.bson.BsonInternalException, system.NullReferenceException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", dictionary == null ? null : dictionary.getJCOInstance());
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(IDictionary dictionary, IEnumerable keys) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NullReferenceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, mongodb.bson.BsonInternalException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", dictionary == null ? null : dictionary.getJCOInstance(), keys == null ? null : keys.getJCOInstance());
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(java.lang.String name, BsonValue value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", name, value == null ? null : value.getJCOInstance());
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Add(java.lang.String name, BsonValue value, boolean condition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", name, value == null ? null : value.getJCOInstance(), condition);
            return new BsonDocument(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument AddRange(IDictionary dictionary) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NullReferenceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, mongodb.bson.BsonInternalException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddRange = (JCObject)classInstance.Invoke("AddRange", dictionary == null ? null : dictionary.getJCOInstance());
            return new BsonDocument(objAddRange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BsonDocument CreateNewBsonDocument(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException, system.NullReferenceException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, mongodb.bson.BsonInternalException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", value == null ? null : value.getJCOInstance());
            return new BsonDocument(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Merge(BsonDocument document) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMerge = (JCObject)classInstance.Invoke("Merge", document == null ? null : document.getJCOInstance());
            return new BsonDocument(objMerge);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Merge(BsonDocument document, boolean overwriteExistingElements) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMerge = (JCObject)classInstance.Invoke("Merge", document == null ? null : document.getJCOInstance(), overwriteExistingElements);
            return new BsonDocument(objMerge);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BsonDocument Parse(java.lang.String json) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentException, mongodb.bson.BsonSerializationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", json);
            return new BsonDocument(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Set(int index, BsonValue value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSet = (JCObject)classInstance.Invoke("Set", index, value == null ? null : value.getJCOInstance());
            return new BsonDocument(objSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument Set(java.lang.String name, BsonValue value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSet = (JCObject)classInstance.Invoke("Set", name, value == null ? null : value.getJCOInstance());
            return new BsonDocument(objSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument SetElement(int index, BsonElement element) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetElement = (JCObject)classInstance.Invoke("SetElement", index, element == null ? null : element.getJCOInstance());
            return new BsonDocument(objSetElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonDocument SetElement(BsonElement element) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetElement = (JCObject)classInstance.Invoke("SetElement", element == null ? null : element.getJCOInstance());
            return new BsonDocument(objSetElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonElement GetElement(int index) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElement = (JCObject)classInstance.Invoke("GetElement", index);
            return new BsonElement(objGetElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonElement GetElement(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElement = (JCObject)classInstance.Invoke("GetElement", name);
            return new BsonElement(objGetElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonValue Clone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BsonValue(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonValue DeepClone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeepClone = (JCObject)classInstance.Invoke("DeepClone");
            return new BsonValue(objDeepClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonValue GetValue(int index) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index);
            return new BsonValue(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonValue GetValue(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", name);
            return new BsonValue(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonValue GetValue(java.lang.String name, BsonValue defaultValue) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", name, defaultValue == null ? null : defaultValue.getJCOInstance());
            return new BsonValue(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Hashtable ToHashtable() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.NullReferenceException, system.RankException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToHashtable = (JCObject)classInstance.Invoke("ToHashtable");
            return new Hashtable(objToHashtable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertAt(int index, BsonElement element) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InsertAt", index, element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveElement(BsonElement element) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveElement", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConvertibleToBsonDocument method available in IConvertibleToBsonDocument to obtain an object with an invocable method
     */
    @Deprecated 
    public BsonDocument ToBsonDocument() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConvertibleToBsonDocument to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getAllowDuplicateNames() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowDuplicateNames");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowDuplicateNames(boolean AllowDuplicateNames) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowDuplicateNames", AllowDuplicateNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getElementCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ElementCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}