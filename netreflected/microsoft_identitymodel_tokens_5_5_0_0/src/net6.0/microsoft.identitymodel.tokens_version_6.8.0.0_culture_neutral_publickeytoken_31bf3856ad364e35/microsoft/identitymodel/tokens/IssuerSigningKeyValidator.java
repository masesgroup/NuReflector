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

package microsoft.identitymodel.tokens;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.identitymodel.tokens.SecurityKey;
import microsoft.identitymodel.tokens.SecurityToken;
import microsoft.identitymodel.tokens.TokenValidationParameters;
import microsoft.identitymodel.tokens.IIssuerSigningKeyValidator;

/**
 * The base .NET class managing Microsoft.IdentityModel.Tokens.IssuerSigningKeyValidator, Microsoft.IdentityModel.Tokens, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link JCDelegate}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.IdentityModel.Tokens.IssuerSigningKeyValidator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.IdentityModel.Tokens.IssuerSigningKeyValidator</a>
 */
public class IssuerSigningKeyValidator extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.IdentityModel.Tokens, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.IdentityModel.Tokens, Version=6.8.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.IdentityModel.Tokens
     */
    public static final String assemblyShortName = "Microsoft.IdentityModel.Tokens";
    /**
     * Qualified class name: Microsoft.IdentityModel.Tokens.IssuerSigningKeyValidator
     */
    public static final String className = "Microsoft.IdentityModel.Tokens.IssuerSigningKeyValidator";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IIssuerSigningKeyValidator callerInstance = null;

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

    public final java.lang.Object EventRaised(java.lang.Object... argsFromJCOBridge) {
        try
        {
            SecurityKey securityKey = argsFromJCOBridge[0] == null ? null : new SecurityKey(argsFromJCOBridge[0]);
            SecurityToken securityToken = argsFromJCOBridge[1] == null ? null : new SecurityToken(argsFromJCOBridge[1]);
            TokenValidationParameters validationParameters = argsFromJCOBridge[2] == null ? null : new TokenValidationParameters(argsFromJCOBridge[2]);


            java.lang.Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(securityKey, securityToken, validationParameters);
            } else {
                retVal = Invoke(securityKey, securityToken, validationParameters);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
            return false;
        }
    }

    public final java.lang.Object DelegateInvoked(java.lang.Object... argsFromJCOBridge) {
        try
        {
            SecurityKey securityKey = argsFromJCOBridge[0] == null ? null : new SecurityKey(argsFromJCOBridge[0]);
            SecurityToken securityToken = argsFromJCOBridge[1] == null ? null : new SecurityToken(argsFromJCOBridge[1]);
            TokenValidationParameters validationParameters = argsFromJCOBridge[2] == null ? null : new TokenValidationParameters(argsFromJCOBridge[2]);


            java.lang.Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(securityKey, securityToken, validationParameters);
            } else {
                retVal = Invoke(securityKey, securityToken, validationParameters);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
            return false;
        }
    }

    public IssuerSigningKeyValidator() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public IssuerSigningKeyValidator(IIssuerSigningKeyValidator instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public IssuerSigningKeyValidator(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IIssuerSigningKeyValidator) {
            callerInstance = (IIssuerSigningKeyValidator) instance;
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

    public boolean DynamicInvoke(SecurityKey securityKey, SecurityToken securityToken, TokenValidationParameters validationParameters) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DynamicInvoke", securityKey == null ? null : securityKey.getJCOInstance(), securityToken == null ? null : securityToken.getJCOInstance(), validationParameters == null ? null : validationParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public boolean Invoke(SecurityKey securityKey, SecurityToken securityToken, TokenValidationParameters validationParameters) {
        return false;
    }
}