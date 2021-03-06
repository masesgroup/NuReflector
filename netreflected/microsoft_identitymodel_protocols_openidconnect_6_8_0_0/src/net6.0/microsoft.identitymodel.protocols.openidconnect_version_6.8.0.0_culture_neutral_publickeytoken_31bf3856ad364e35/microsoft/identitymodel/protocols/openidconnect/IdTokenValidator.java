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

package microsoft.identitymodel.protocols.openidconnect;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.identitymodel.tokens.jwt.JwtSecurityToken;
import microsoft.identitymodel.protocols.openidconnect.OpenIdConnectProtocolValidationContext;
import microsoft.identitymodel.protocols.openidconnect.IIdTokenValidator;
/**
 * The base .NET class managing Microsoft.IdentityModel.Protocols.OpenIdConnect.IdTokenValidator, Microsoft.IdentityModel.Protocols.OpenIdConnect, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.IdentityModel.Protocols.OpenIdConnect.IdTokenValidator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.IdentityModel.Protocols.OpenIdConnect.IdTokenValidator</a>
 */
public class IdTokenValidator extends JCVoidDelegate implements IJCVoidEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.IdentityModel.Protocols.OpenIdConnect, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.IdentityModel.Protocols.OpenIdConnect, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.IdentityModel.Protocols.OpenIdConnect
     */
    public static final String assemblyShortName = "Microsoft.IdentityModel.Protocols.OpenIdConnect";
    /**
     * Qualified class name: Microsoft.IdentityModel.Protocols.OpenIdConnect.IdTokenValidator
     */
    public static final String className = "Microsoft.IdentityModel.Protocols.OpenIdConnect.IdTokenValidator";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IIdTokenValidator callerInstance = null;

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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final void EventRaised(java.lang.Object... argsFromJCOBridge) {
        try
        {
            JwtSecurityToken idToken = argsFromJCOBridge[0] == null ? null : new JwtSecurityToken(argsFromJCOBridge[0]);
            OpenIdConnectProtocolValidationContext context = argsFromJCOBridge[1] == null ? null : new OpenIdConnectProtocolValidationContext(argsFromJCOBridge[1]);


            if (callerInstance != null)	{
                callerInstance.Invoke(idToken, context);
            } else {
                Invoke(idToken, context);
            }
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
        }
    }

    public final void DelegateInvoked(java.lang.Object... argsFromJCOBridge) {
        try
        {
            JwtSecurityToken idToken = argsFromJCOBridge[0] == null ? null : new JwtSecurityToken(argsFromJCOBridge[0]);
            OpenIdConnectProtocolValidationContext context = argsFromJCOBridge[1] == null ? null : new OpenIdConnectProtocolValidationContext(argsFromJCOBridge[1]);


            if (callerInstance != null)	{
                callerInstance.Invoke(idToken, context);
            } else {
                Invoke(idToken, context);
            }
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
        }
    }

    public IdTokenValidator() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public IdTokenValidator(IIdTokenValidator instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public IdTokenValidator(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IIdTokenValidator) {
            callerInstance = (IIdTokenValidator) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> java.lang.Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public void DynamicInvoke(JwtSecurityToken idToken, OpenIdConnectProtocolValidationContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DynamicInvoke", idToken == null ? null : idToken.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public void Invoke(JwtSecurityToken idToken, OpenIdConnectProtocolValidationContext context) {
    }
}