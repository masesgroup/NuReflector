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

package google.protobuf;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import google.protobuf.ByteString;
import system.UInt32;
import system.UInt64;
import system.Single;
import google.protobuf.IMessage;
import google.protobuf.IMessageImplementation;


/**
 * The base .NET class managing Google.Protobuf.WriteContext, Google.Protobuf, Version=3.15.8.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.WriteContext" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.WriteContext</a>
 */
public class WriteContext extends ValueType  {
    /**
     * Fully assembly qualified name: Google.Protobuf, Version=3.15.8.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604
     */
    public static final String assemblyFullName = "Google.Protobuf, Version=3.15.8.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604";
    /**
     * Assembly name: Google.Protobuf
     */
    public static final String assemblyShortName = "Google.Protobuf";
    /**
     * Qualified class name: Google.Protobuf.WriteContext
     */
    public static final String className = "Google.Protobuf.WriteContext";
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
    public WriteContext(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link WriteContext}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link WriteContext} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static WriteContext cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new WriteContext(from.getJCOInstance());
    }

    // Constructors section
    
    public WriteContext() throws Throwable {
    }



    
    // Methods section
    
    public void WriteBool(boolean value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteBool", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteBytes(ByteString value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteBytes", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteDouble(double value) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteDouble", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteEnum(int value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteEnum", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteFixed32(UInt32 value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteFixed32", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteFixed64(UInt64 value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteFixed64", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteFloat(Single value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteFloat", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteGroup(IMessage value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteGroup", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteInt32(int value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteInt32", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteInt64(long value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteInt64", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLength(int length) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteLength", length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteMessage(IMessage value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteMessage", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteRawTag(byte b1, byte b2, byte b3, byte b4, byte b5) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteRawTag", b1, b2, b3, b4, b5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteRawTag(byte b1, byte b2, byte b3, byte b4) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteRawTag", b1, b2, b3, b4);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteRawTag(byte b1, byte b2, byte b3) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteRawTag", b1, b2, b3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteRawTag(byte b1, byte b2) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteRawTag", b1, b2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteRawTag(byte b1) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteRawTag", b1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteSFixed32(int value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteSFixed32", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteSFixed64(long value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteSFixed64", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteSInt32(int value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteSInt32", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteSInt64(long value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteSInt64", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteString(java.lang.String value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteString", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTag(UInt32 tag) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTag", tag == null ? null : tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteUInt32(UInt32 value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteUInt32", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteUInt64(UInt64 value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteUInt64", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}