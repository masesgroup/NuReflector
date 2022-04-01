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
import microsoft.identity.client.ConfidentialClientApplicationBuilder;
import microsoft.identity.client.ConfidentialClientApplicationOptions;
import system.security.cryptography.x509certificates.X509Certificate2;
import microsoft.identity.client.IConfidentialClientApplication;
import microsoft.identity.client.IConfidentialClientApplicationImplementation;


/**
 * The base .NET class managing Microsoft.Identity.Client.ConfidentialClientApplicationBuilder, Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.ConfidentialClientApplicationBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.ConfidentialClientApplicationBuilder</a>
 */
public class ConfidentialClientApplicationBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client";
    /**
     * Qualified class name: Microsoft.Identity.Client.ConfidentialClientApplicationBuilder
     */
    public static final String className = "Microsoft.Identity.Client.ConfidentialClientApplicationBuilder";
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
    public ConfidentialClientApplicationBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ConfidentialClientApplicationBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ConfidentialClientApplicationBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ConfidentialClientApplicationBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ConfidentialClientApplicationBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ConfidentialClientApplicationBuilder() throws Throwable {
    }



    
    // Methods section
    
    public static ConfidentialClientApplicationBuilder Create(java.lang.String clientId) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", clientId);
            return new ConfidentialClientApplicationBuilder(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ConfidentialClientApplicationBuilder CreateWithApplicationOptions(ConfidentialClientApplicationOptions options) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateWithApplicationOptions = (JCObject)classType.Invoke("CreateWithApplicationOptions", options == null ? null : options.getJCOInstance());
            return new ConfidentialClientApplicationBuilder(objCreateWithApplicationOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfidentialClientApplicationBuilder WithAzureRegion(java.lang.String azureRegion) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithAzureRegion = (JCObject)classInstance.Invoke("WithAzureRegion", azureRegion);
            return new ConfidentialClientApplicationBuilder(objWithAzureRegion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfidentialClientApplicationBuilder WithCertificate(X509Certificate2 certificate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, microsoft.identity.client.MsalClientException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithCertificate = (JCObject)classInstance.Invoke("WithCertificate", certificate == null ? null : certificate.getJCOInstance());
            return new ConfidentialClientApplicationBuilder(objWithCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfidentialClientApplicationBuilder WithClientAssertion(java.lang.String signedClientAssertion) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClientAssertion = (JCObject)classInstance.Invoke("WithClientAssertion", signedClientAssertion);
            return new ConfidentialClientApplicationBuilder(objWithClientAssertion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfidentialClientApplicationBuilder WithClientSecret(java.lang.String clientSecret) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClientSecret = (JCObject)classInstance.Invoke("WithClientSecret", clientSecret);
            return new ConfidentialClientApplicationBuilder(objWithClientSecret);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IConfidentialClientApplication Build() throws Throwable, system.ArgumentNullException, microsoft.identity.client.MsalClientException, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.FormatException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build");
            return new IConfidentialClientApplicationImplementation(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}