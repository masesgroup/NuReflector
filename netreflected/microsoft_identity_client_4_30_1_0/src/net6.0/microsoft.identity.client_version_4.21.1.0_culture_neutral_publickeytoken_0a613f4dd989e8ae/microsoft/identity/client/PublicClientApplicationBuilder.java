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

package microsoft.identity.client;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.identity.client.IPublicClientApplication;
import microsoft.identity.client.IPublicClientApplicationImplementation;
import microsoft.identity.client.PublicClientApplicationBuilder;
import microsoft.identity.client.PublicClientApplicationOptions;


/**
 * The base .NET class managing Microsoft.Identity.Client.PublicClientApplicationBuilder, Microsoft.Identity.Client, Version=4.21.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.PublicClientApplicationBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.PublicClientApplicationBuilder</a>
 */
public class PublicClientApplicationBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client, Version=4.21.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client, Version=4.21.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client";
    /**
     * Qualified class name: Microsoft.Identity.Client.PublicClientApplicationBuilder
     */
    public static final String className = "Microsoft.Identity.Client.PublicClientApplicationBuilder";
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
    public PublicClientApplicationBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PublicClientApplicationBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PublicClientApplicationBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PublicClientApplicationBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PublicClientApplicationBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public PublicClientApplicationBuilder() throws Throwable {
    }



    
    // Methods section
    
    public IPublicClientApplication Build() throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, microsoft.identity.client.MsalClientException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build");
            return new IPublicClientApplicationImplementation(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PublicClientApplicationBuilder Create(java.lang.String clientId) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", clientId);
            return new PublicClientApplicationBuilder(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PublicClientApplicationBuilder CreateWithApplicationOptions(PublicClientApplicationOptions options) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateWithApplicationOptions = (JCObject)classType.Invoke("CreateWithApplicationOptions", options == null ? null : options.getJCOInstance());
            return new PublicClientApplicationBuilder(objCreateWithApplicationOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicClientApplicationBuilder WithBroker(boolean enableBroker) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithBroker = (JCObject)classInstance.Invoke("WithBroker", enableBroker);
            return new PublicClientApplicationBuilder(objWithBroker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicClientApplicationBuilder WithDefaultRedirectUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithDefaultRedirectUri = (JCObject)classInstance.Invoke("WithDefaultRedirectUri");
            return new PublicClientApplicationBuilder(objWithDefaultRedirectUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicClientApplicationBuilder WithIosKeychainSecurityGroup(java.lang.String keychainSecurityGroup) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithIosKeychainSecurityGroup = (JCObject)classInstance.Invoke("WithIosKeychainSecurityGroup", keychainSecurityGroup);
            return new PublicClientApplicationBuilder(objWithIosKeychainSecurityGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}