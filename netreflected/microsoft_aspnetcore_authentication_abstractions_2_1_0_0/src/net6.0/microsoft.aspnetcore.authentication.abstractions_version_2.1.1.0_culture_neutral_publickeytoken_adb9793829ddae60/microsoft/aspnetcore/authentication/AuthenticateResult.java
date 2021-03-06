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

package microsoft.aspnetcore.authentication;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.aspnetcore.authentication.AuthenticateResult;
import microsoft.aspnetcore.authentication.AuthenticationProperties;
import microsoft.aspnetcore.authentication.AuthenticationTicket;
import system.security.claims.ClaimsPrincipal;


/**
 * The base .NET class managing Microsoft.AspNetCore.Authentication.AuthenticateResult, Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Authentication.AuthenticateResult" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Authentication.AuthenticateResult</a>
 */
public class AuthenticateResult extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.Authentication.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.Authentication.Abstractions";
    /**
     * Qualified class name: Microsoft.AspNetCore.Authentication.AuthenticateResult
     */
    public static final String className = "Microsoft.AspNetCore.Authentication.AuthenticateResult";
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
    public AuthenticateResult(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AuthenticateResult}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AuthenticateResult} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AuthenticateResult cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AuthenticateResult(from.getJCOInstance());
    }

    // Constructors section
    
    public AuthenticateResult() throws Throwable {
    }



    
    // Methods section
    
    public static AuthenticateResult Fail(NetException failure, AuthenticationProperties properties) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFail = (JCObject)classType.Invoke("Fail", failure == null ? null : failure.getJCOInstance(), properties == null ? null : properties.getJCOInstance());
            return new AuthenticateResult(objFail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AuthenticateResult Fail(NetException failure) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFail = (JCObject)classType.Invoke("Fail", failure == null ? null : failure.getJCOInstance());
            return new AuthenticateResult(objFail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AuthenticateResult Fail(java.lang.String failureMessage, AuthenticationProperties properties) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFail = (JCObject)classType.Invoke("Fail", failureMessage, properties == null ? null : properties.getJCOInstance());
            return new AuthenticateResult(objFail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AuthenticateResult Fail(java.lang.String failureMessage) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFail = (JCObject)classType.Invoke("Fail", failureMessage);
            return new AuthenticateResult(objFail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AuthenticateResult NoResult() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNoResult = (JCObject)classType.Invoke("NoResult");
            return new AuthenticateResult(objNoResult);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AuthenticateResult Success(AuthenticationTicket ticket) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSuccess = (JCObject)classType.Invoke("Success", ticket == null ? null : ticket.getJCOInstance());
            return new AuthenticateResult(objSuccess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getNone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("None");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNone(boolean None) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("None", None);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSucceeded() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Succeeded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationProperties getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new AuthenticationProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProperties(AuthenticationProperties Properties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Properties", Properties == null ? null : Properties.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationTicket getTicket() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Ticket");
            return new AuthenticationTicket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTicket(AuthenticationTicket Ticket) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Ticket", Ticket == null ? null : Ticket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException getFailure() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Failure");
            return new NetException(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFailure(NetException Failure) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Failure", Failure == null ? null : Failure.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClaimsPrincipal getPrincipal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Principal");
            return new ClaimsPrincipal(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}