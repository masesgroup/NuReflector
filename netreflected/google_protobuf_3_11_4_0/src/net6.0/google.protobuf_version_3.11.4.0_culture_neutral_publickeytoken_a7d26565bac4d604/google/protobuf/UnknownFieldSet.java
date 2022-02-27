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
import google.protobuf.UnknownFieldSet;
import google.protobuf.CodedInputStream;
import google.protobuf.CodedOutputStream;


/**
 * The base .NET class managing Google.Protobuf.UnknownFieldSet, Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.UnknownFieldSet" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Google.Protobuf.UnknownFieldSet</a>
 */
public class UnknownFieldSet extends NetObject  {
    /**
     * Fully assembly qualified name: Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604
     */
    public static final String assemblyFullName = "Google.Protobuf, Version=3.11.4.0, Culture=neutral, PublicKeyToken=a7d26565bac4d604";
    /**
     * Assembly name: Google.Protobuf
     */
    public static final String assemblyShortName = "Google.Protobuf";
    /**
     * Qualified class name: Google.Protobuf.UnknownFieldSet
     */
    public static final String className = "Google.Protobuf.UnknownFieldSet";
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
    public UnknownFieldSet(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link UnknownFieldSet}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link UnknownFieldSet} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static UnknownFieldSet cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new UnknownFieldSet(from.getJCOInstance());
    }

    // Constructors section
    
    public UnknownFieldSet() throws Throwable {
    }



    
    // Methods section
    
    public static UnknownFieldSet Clone(UnknownFieldSet other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objClone = (JCObject)classType.Invoke("Clone", other == null ? null : other.getJCOInstance());
            return new UnknownFieldSet(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UnknownFieldSet MergeFieldFrom(UnknownFieldSet unknownFields, CodedInputStream input) throws Throwable, system.InvalidOperationException, google.protobuf.InvalidProtocolBufferException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMergeFieldFrom = (JCObject)classType.Invoke("MergeFieldFrom", unknownFields == null ? null : unknownFields.getJCOInstance(), input == null ? null : input.getJCOInstance());
            return new UnknownFieldSet(objMergeFieldFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UnknownFieldSet MergeFrom(UnknownFieldSet unknownFields, UnknownFieldSet other) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMergeFrom = (JCObject)classType.Invoke("MergeFrom", unknownFields == null ? null : unknownFields.getJCOInstance(), other == null ? null : other.getJCOInstance());
            return new UnknownFieldSet(objMergeFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CalculateSize() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CalculateSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(CodedOutputStream output) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}