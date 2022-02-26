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

package google.protobuf.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import google.protobuf.reflection.DescriptorBase;
import google.protobuf.reflection.FieldDescriptor;
import google.protobuf.Extension;
import google.protobuf.reflection.CustomOptions;
import google.protobuf.reflection.EnumDescriptor;
import google.protobuf.reflection.FieldType;
import google.protobuf.reflection.IFieldAccessor;
import google.protobuf.reflection.IFieldAccessorImplementation;
import google.protobuf.reflection.MessageDescriptor;
import google.protobuf.reflection.OneofDescriptor;


/**
 * The base .NET class managing Google.Protobuf.Reflection.FieldDescriptor, Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.Reflection.FieldDescriptor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.Reflection.FieldDescriptor</a>
 */
public class FieldDescriptor extends DescriptorBase  {
    /**
     * Fully assembly qualified name: Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604
     */
    public static final String assemblyFullName = "Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604";
    /**
     * Assembly name: Google.Protobuf
     */
    public static final String assemblyShortName = "Google.Protobuf";
    /**
     * Qualified class name: Google.Protobuf.Reflection.FieldDescriptor
     */
    public static final String className = "Google.Protobuf.Reflection.FieldDescriptor";
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
    public FieldDescriptor(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FieldDescriptor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FieldDescriptor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FieldDescriptor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FieldDescriptor(from.getJCOInstance());
    }

    // Constructors section
    
    public FieldDescriptor() throws Throwable {
    }



    
    // Methods section
    
    public int CompareTo(FieldDescriptor other) throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsExtension() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsExtension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMap() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsMap");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPacked() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPacked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRepeated() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRepeated");
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

    public Extension getExtension() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Extension");
            return new Extension(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CustomOptions getCustomOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CustomOptions");
            return new CustomOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnumDescriptor getEnumType() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EnumType");
            return new EnumDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldType getFieldType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FieldType");
            return new FieldType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IFieldAccessor getAccessor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Accessor");
            return new IFieldAccessorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageDescriptor getContainingType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContainingType");
            return new MessageDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageDescriptor getExtendeeType() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExtendeeType");
            return new MessageDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageDescriptor getMessageType() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MessageType");
            return new MessageDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OneofDescriptor getContainingOneof() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContainingOneof");
            return new OneofDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFieldNumber() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("FieldNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getJsonName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("JsonName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}