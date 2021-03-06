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

// Import section
import system.IDisposable;
import system.IDisposableImplementation;
import mongodb.bson.BsonBinaryData;
import mongodb.bson.BsonRegularExpression;
import mongodb.bson.BsonType;
import mongodb.bson.Decimal128;
import mongodb.bson.io.BsonReaderBookmark;
import mongodb.bson.io.IByteBuffer;
import mongodb.bson.io.IByteBufferImplementation;
import mongodb.bson.ObjectId;
import mongodb.bson.io.INameDecoder;
import mongodb.bson.io.INameDecoderImplementation;
import mongodb.bson.io.BsonReaderState;


/**
 * The base .NET class managing MongoDB.Bson.IO.IBsonReader, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.IO.IBsonReader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.IO.IBsonReader</a>
 */
public interface IBsonReader extends IJCOBridgeReflected, IDisposable {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.IO.IBsonReader
     */
    public static final String className = "MongoDB.Bson.IO.IBsonReader";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IBsonReader}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IBsonReader} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IBsonReader ToIBsonReader(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IBsonReaderImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean IsAtEndOfFile() throws Throwable;

    public boolean ReadBoolean() throws Throwable;

    public byte[] ReadBytes() throws Throwable;

    public double ReadDouble() throws Throwable;

    public int ReadInt32() throws Throwable;

    public long ReadDateTime() throws Throwable;

    public long ReadInt64() throws Throwable;

    public long ReadTimestamp() throws Throwable;

    public BsonBinaryData ReadBinaryData() throws Throwable;

    public BsonRegularExpression ReadRegularExpression() throws Throwable;

    public BsonType GetCurrentBsonType() throws Throwable;

    public BsonType ReadBsonType() throws Throwable;

    public Decimal128 ReadDecimal128() throws Throwable;

    public BsonReaderBookmark GetBookmark() throws Throwable;

    public IByteBuffer ReadRawBsonArray() throws Throwable;

    public IByteBuffer ReadRawBsonDocument() throws Throwable;

    public ObjectId ReadObjectId() throws Throwable;

    public java.lang.String ReadJavaScript() throws Throwable;

    public java.lang.String ReadJavaScriptWithScope() throws Throwable;

    public java.lang.String ReadName(INameDecoder nameDecoder) throws Throwable;

    public java.lang.String ReadString() throws Throwable;

    public java.lang.String ReadSymbol() throws Throwable;

    public void Close() throws Throwable;


    public void ReadEndArray() throws Throwable;

    public void ReadEndDocument() throws Throwable;

    public void ReadMaxKey() throws Throwable;

    public void ReadMinKey() throws Throwable;

    public void ReadNull() throws Throwable;

    public void ReadStartArray() throws Throwable;

    public void ReadStartDocument() throws Throwable;

    public void ReadUndefined() throws Throwable;

    public void ReturnToBookmark(BsonReaderBookmark bookmark) throws Throwable;

    public void SkipName() throws Throwable;

    public void SkipValue() throws Throwable;


    
    // Properties section
    
    public BsonType getCurrentBsonType() throws Throwable;

    public BsonReaderState getState() throws Throwable;



    // Instance Events section
    

}