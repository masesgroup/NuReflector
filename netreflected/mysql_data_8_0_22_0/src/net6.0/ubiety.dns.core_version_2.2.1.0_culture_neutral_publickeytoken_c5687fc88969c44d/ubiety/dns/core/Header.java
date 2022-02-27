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

package ubiety.dns.core;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import ubiety.dns.core.common.OperationCode;
import ubiety.dns.core.common.ResponseCode;
import system.UInt16;


/**
 * The base .NET class managing Ubiety.Dns.Core.Header, Ubiety.Dns.Core, Version=2.2.1.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Ubiety.Dns.Core.Header" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Ubiety.Dns.Core.Header</a>
 */
public class Header extends NetObject  {
    /**
     * Fully assembly qualified name: Ubiety.Dns.Core, Version=2.2.1.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "Ubiety.Dns.Core, Version=2.2.1.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: Ubiety.Dns.Core
     */
    public static final String assemblyShortName = "Ubiety.Dns.Core";
    /**
     * Qualified class name: Ubiety.Dns.Core.Header
     */
    public static final String className = "Ubiety.Dns.Core.Header";
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
    public Header(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Header}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Header} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Header cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Header(from.getJCOInstance());
    }

    // Constructors section
    
    public Header() throws Throwable {
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
    
    public boolean getAuthoritativeAnswer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AuthoritativeAnswer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthoritativeAnswer(boolean AuthoritativeAnswer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AuthoritativeAnswer", AuthoritativeAnswer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getQueryResponse() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("QueryResponse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQueryResponse(boolean QueryResponse) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QueryResponse", QueryResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRecursion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Recursion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRecursion(boolean Recursion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Recursion", Recursion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRecursionAvailable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RecursionAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRecursionAvailable(boolean RecursionAvailable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RecursionAvailable", RecursionAvailable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTruncation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Truncation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTruncation(boolean Truncation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Truncation", Truncation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OperationCode getOpCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OpCode");
            return new OperationCode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpCode(OperationCode OpCode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OpCode", OpCode == null ? null : OpCode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResponseCode getResponseCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ResponseCode");
            return new ResponseCode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResponseCode(ResponseCode ResponseCode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ResponseCode", ResponseCode == null ? null : ResponseCode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getAdditionalRecordsCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AdditionalRecordsCount");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdditionalRecordsCount(UInt16 AdditionalRecordsCount) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AdditionalRecordsCount", AdditionalRecordsCount == null ? null : AdditionalRecordsCount.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getAnswerCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AnswerCount");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAnswerCount(UInt16 AnswerCount) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AnswerCount", AnswerCount == null ? null : AnswerCount.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Id");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(UInt16 Id) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Id", Id == null ? null : Id.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getNameserverCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NameserverCount");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNameserverCount(UInt16 NameserverCount) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NameserverCount", NameserverCount == null ? null : NameserverCount.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getQuestionCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QuestionCount");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQuestionCount(UInt16 QuestionCount) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QuestionCount", QuestionCount == null ? null : QuestionCount.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getZ() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Z");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setZ(UInt16 Z) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Z", Z == null ? null : Z.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}