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
import google.protobuf.IMessage;
import google.protobuf.IMessageImplementation;
import system.io.Stream;
import google.protobuf.ByteString;
import google.protobuf.CodedInputStream;
import google.protobuf.MessageParser;
import google.protobuf.ExtensionRegistry;


/**
 * The base .NET class managing Google.Protobuf.MessageParser, Google.Protobuf, Version=3.21.7.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.MessageParser" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.MessageParser</a>
 */
public class MessageParser extends NetObject  {
    /**
     * Fully assembly qualified name: Google.Protobuf, Version=3.21.7.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604
     */
    public static final String assemblyFullName = "Google.Protobuf, Version=3.21.7.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604";
    /**
     * Assembly name: Google.Protobuf
     */
    public static final String assemblyShortName = "Google.Protobuf";
    /**
     * Qualified class name: Google.Protobuf.MessageParser
     */
    public static final String className = "Google.Protobuf.MessageParser";
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
    public MessageParser(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MessageParser}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MessageParser} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MessageParser cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MessageParser(from.getJCOInstance());
    }

    // Constructors section
    
    public MessageParser() throws Throwable {
    }



    
    // Methods section
    
    public IMessage ParseDelimitedFrom(Stream input) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseDelimitedFrom = (JCObject)classInstance.Invoke("ParseDelimitedFrom", input == null ? null : input.getJCOInstance());
            return new IMessageImplementation(objParseDelimitedFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(byte[] data, int offset, int length) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", data, offset, length);
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", dupParam0.getJCRefOut(), dupParam1, dupParam2);
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(byte[] data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", (java.lang.Object)data);
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", (java.lang.Object)dupParam0.getJCRefOut());
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(ByteString data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", data == null ? null : data.getJCOInstance());
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(CodedInputStream input) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", input == null ? null : input.getJCOInstance());
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseFrom(Stream input) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, google.protobuf.InvalidProtocolBufferException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFrom = (JCObject)classInstance.Invoke("ParseFrom", input == null ? null : input.getJCOInstance());
            return new IMessageImplementation(objParseFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessage ParseJson(java.lang.String json) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, google.protobuf.InvalidProtocolBufferException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseJson = (JCObject)classInstance.Invoke("ParseJson", json);
            return new IMessageImplementation(objParseJson);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageParser WithDiscardUnknownFields(boolean discardUnknownFields) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithDiscardUnknownFields = (JCObject)classInstance.Invoke("WithDiscardUnknownFields", discardUnknownFields);
            return new MessageParser(objWithDiscardUnknownFields);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageParser WithExtensionRegistry(ExtensionRegistry registry) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithExtensionRegistry = (JCObject)classInstance.Invoke("WithExtensionRegistry", registry == null ? null : registry.getJCOInstance());
            return new MessageParser(objWithExtensionRegistry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}