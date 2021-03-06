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

package mongodb.bson.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mongodb.bson.io.BsonReader;
import system.io.TextReader;
import mongodb.bson.io.JsonReaderSettings;
import mongodb.bson.BsonBinaryData;
import mongodb.bson.BsonRegularExpression;
import mongodb.bson.BsonType;
import mongodb.bson.Decimal128;
import mongodb.bson.io.BsonReaderBookmark;
import mongodb.bson.ObjectId;
import mongodb.bson.io.INameDecoder;
import mongodb.bson.io.INameDecoderImplementation;


/**
 * The base .NET class managing MongoDB.Bson.IO.JsonReader, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.IO.JsonReader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.IO.JsonReader</a>
 */
public class JsonReader extends BsonReader  {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.IO.JsonReader
     */
    public static final String className = "MongoDB.Bson.IO.JsonReader";
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
    public JsonReader(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link JsonReader}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link JsonReader} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static JsonReader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new JsonReader(from.getJCOInstance());
    }

    // Constructors section
    
    public JsonReader() throws Throwable {
    }

    public JsonReader(TextReader textReader) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(textReader == null ? null : textReader.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonReader(TextReader textReader, JsonReaderSettings settings) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(textReader == null ? null : textReader.getJCOInstance(), settings == null ? null : settings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonReader(java.lang.String json) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(json));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonReader(java.lang.String json, JsonReaderSettings settings) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(json, settings == null ? null : settings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsAtEndOfFile() throws Throwable, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAtEndOfFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ReadBoolean() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ReadBoolean");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] ReadBytes() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ReadBytes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexReadBytes = 0; indexReadBytes < resultingArrayList.size(); indexReadBytes++ ) {
				resultingArray[indexReadBytes] = (byte)resultingArrayList.get(indexReadBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ReadDouble() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ReadDouble");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadInt32() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadInt32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadDateTime() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadDateTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadInt64() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadInt64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadTimestamp() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadTimestamp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonBinaryData ReadBinaryData() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadBinaryData = (JCObject)classInstance.Invoke("ReadBinaryData");
            return new BsonBinaryData(objReadBinaryData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonRegularExpression ReadRegularExpression() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadRegularExpression = (JCObject)classInstance.Invoke("ReadRegularExpression");
            return new BsonRegularExpression(objReadRegularExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonType ReadBsonType() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentException, system.NullReferenceException, system.OverflowException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.TypeInitializationException, mongodb.bson.BsonInternalException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadBsonType = (JCObject)classInstance.Invoke("ReadBsonType");
            return new BsonType(objReadBsonType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal128 ReadDecimal128() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadDecimal128 = (JCObject)classInstance.Invoke("ReadDecimal128");
            return new Decimal128(objReadDecimal128);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonReaderBookmark GetBookmark() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetBookmark = (JCObject)classInstance.Invoke("GetBookmark");
            return new BsonReaderBookmark(objGetBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectId ReadObjectId() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObjectId = (JCObject)classInstance.Invoke("ReadObjectId");
            return new ObjectId(objReadObjectId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadJavaScript() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadJavaScript");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadJavaScriptWithScope() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadJavaScriptWithScope");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadName(INameDecoder nameDecoder) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadName", nameDecoder == null ? null : nameDecoder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadString() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadSymbol() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ReadSymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadEndArray() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException, system.ArgumentException, system.NullReferenceException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadEndArray");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadEndDocument() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentException, system.NullReferenceException, system.OverflowException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadEndDocument");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadMaxKey() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadMaxKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadMinKey() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadMinKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadNull() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadStartArray() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadStartArray");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadStartDocument() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadStartDocument");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadUndefined() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadUndefined");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReturnToBookmark(BsonReaderBookmark bookmark) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReturnToBookmark", bookmark == null ? null : bookmark.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SkipName() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SkipName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SkipValue() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, mongodb.bson.BsonInternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SkipValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}