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

package microsoft.rest;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.rest.RestException;

/**
 * The base .NET class managing Microsoft.Rest.ValidationException, Microsoft.Rest.ClientRuntime, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Rest.ValidationException" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Rest.ValidationException</a>
 */
public class ValidationException extends RestException {
    /**
     * Fully assembly qualified name: Microsoft.Rest.ClientRuntime, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Rest.ClientRuntime, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Rest.ClientRuntime
     */
    public static final String assemblyShortName = "Microsoft.Rest.ClientRuntime";
    /**
     * Qualified class name: Microsoft.Rest.ValidationException
     */
    public static final String className = "Microsoft.Rest.ValidationException";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;
    JCNativeException jcNativeException = null;

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
        } catch (JCException jce) {
            JCOReflector.writeLog(jce);
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

    public ValidationException() {
        super();
    }
    /**
     * Internal constructor. Use with caution 
     */
    public ValidationException(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else if (instance instanceof JCNativeException) {
            jcNativeException = (JCNativeException) instance;
            classInstance = jcNativeException.getCLRException();
        }
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(NetException cause) {
        super(cause);
    }

    public ValidationException(String message, NetException cause) {
        super(message, cause);
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ValidationException}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ValidationException} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ValidationException cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ValidationException(from.getJCOInstance());
    }

    // Constructors section
    
    public ValidationException(java.lang.String rule, java.lang.String target, NetObject details) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rule, target, details == null ? null : details.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidationException(java.lang.String rule, java.lang.String target) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(rule, target));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public NetObject getDetails() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Details");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDetails(NetObject Details) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Details", Details == null ? null : Details.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRule() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Rule");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRule(java.lang.String Rule) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Rule", Rule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTarget() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Target");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTarget(java.lang.String Target) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Target", Target);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}