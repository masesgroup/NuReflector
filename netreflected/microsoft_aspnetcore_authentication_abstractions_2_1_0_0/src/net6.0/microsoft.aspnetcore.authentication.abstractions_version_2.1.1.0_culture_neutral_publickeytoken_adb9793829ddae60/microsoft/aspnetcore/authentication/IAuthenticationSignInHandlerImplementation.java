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
import microsoft.aspnetcore.authentication.IAuthenticationSignOutHandler;
import microsoft.aspnetcore.authentication.IAuthenticationSignOutHandlerImplementation;
import microsoft.aspnetcore.authentication.IAuthenticationHandler;
import microsoft.aspnetcore.authentication.IAuthenticationHandlerImplementation;
import system.threading.tasks.Task;
import microsoft.aspnetcore.authentication.AuthenticationProperties;
import microsoft.aspnetcore.authentication.AuthenticationScheme;
import microsoft.aspnetcore.http.HttpContext;
import system.security.claims.ClaimsPrincipal;


/**
 * The base .NET class managing Microsoft.AspNetCore.Authentication.IAuthenticationSignInHandler, Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Authentication.IAuthenticationSignInHandler" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Authentication.IAuthenticationSignInHandler</a>
 */
public class IAuthenticationSignInHandlerImplementation extends NetObject implements IAuthenticationSignInHandler {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.Authentication.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.Authentication.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.Authentication.Abstractions";
    /**
     * Qualified class name: Microsoft.AspNetCore.Authentication.IAuthenticationSignInHandler
     */
    public static final String className = "Microsoft.AspNetCore.Authentication.IAuthenticationSignInHandler";
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
    public IAuthenticationSignInHandlerImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IAuthenticationSignInHandler}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IAuthenticationSignInHandler} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IAuthenticationSignInHandler ToIAuthenticationSignInHandler(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IAuthenticationSignInHandlerImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public Task ChallengeAsync(AuthenticationProperties properties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChallengeAsync = (JCObject)classInstance.Invoke("ChallengeAsync", properties == null ? null : properties.getJCOInstance());
            return new Task(objChallengeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ForbidAsync(AuthenticationProperties properties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objForbidAsync = (JCObject)classInstance.Invoke("ForbidAsync", properties == null ? null : properties.getJCOInstance());
            return new Task(objForbidAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task InitializeAsync(AuthenticationScheme scheme, HttpContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeAsync = (JCObject)classInstance.Invoke("InitializeAsync", scheme == null ? null : scheme.getJCOInstance(), context == null ? null : context.getJCOInstance());
            return new Task(objInitializeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SignInAsync(ClaimsPrincipal user, AuthenticationProperties properties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignInAsync = (JCObject)classInstance.Invoke("SignInAsync", user == null ? null : user.getJCOInstance(), properties == null ? null : properties.getJCOInstance());
            return new Task(objSignInAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SignOutAsync(AuthenticationProperties properties) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignOutAsync = (JCObject)classInstance.Invoke("SignOutAsync", properties == null ? null : properties.getJCOInstance());
            return new Task(objSignOutAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}