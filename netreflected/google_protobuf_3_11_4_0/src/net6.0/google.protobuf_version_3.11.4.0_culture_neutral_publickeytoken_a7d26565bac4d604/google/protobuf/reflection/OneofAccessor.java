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
import google.protobuf.reflection.FieldDescriptor;
import google.protobuf.IMessage;
import google.protobuf.IMessageImplementation;
import google.protobuf.reflection.OneofDescriptor;


/**
 * The base .NET class managing Google.Protobuf.Reflection.OneofAccessor, Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.Reflection.OneofAccessor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.Reflection.OneofAccessor</a>
 */
public class OneofAccessor extends NetObject  {
    /**
     * Fully assembly qualified name: Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604
     */
    public static final String assemblyFullName = "Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604";
    /**
     * Assembly name: Google.Protobuf
     */
    public static final String assemblyShortName = "Google.Protobuf";
    /**
     * Qualified class name: Google.Protobuf.Reflection.OneofAccessor
     */
    public static final String className = "Google.Protobuf.Reflection.OneofAccessor";
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
    public OneofAccessor(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OneofAccessor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OneofAccessor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OneofAccessor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OneofAccessor(from.getJCOInstance());
    }

    // Constructors section
    
    public OneofAccessor() throws Throwable {
    }



    
    // Methods section
    
    public FieldDescriptor GetCaseFieldDescriptor(IMessage message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCaseFieldDescriptor = (JCObject)classInstance.Invoke("GetCaseFieldDescriptor", message == null ? null : message.getJCOInstance());
            return new FieldDescriptor(objGetCaseFieldDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear(IMessage message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear", message == null ? null : message.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public OneofDescriptor getDescriptor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Descriptor");
            return new OneofDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}