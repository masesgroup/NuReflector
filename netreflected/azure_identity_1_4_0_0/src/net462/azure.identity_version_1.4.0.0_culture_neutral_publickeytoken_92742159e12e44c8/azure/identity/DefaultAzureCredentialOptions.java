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

package azure.identity;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import azure.identity.TokenCredentialOptions;


/**
 * The base .NET class managing Azure.Identity.DefaultAzureCredentialOptions, Azure.Identity, Version=1.4.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Azure.Identity.DefaultAzureCredentialOptions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Azure.Identity.DefaultAzureCredentialOptions</a>
 */
public class DefaultAzureCredentialOptions extends TokenCredentialOptions  {
    /**
     * Fully assembly qualified name: Azure.Identity, Version=1.4.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8
     */
    public static final String assemblyFullName = "Azure.Identity, Version=1.4.0.0, Culture=neutral, PublicKeyToken=92742159e12e44c8";
    /**
     * Assembly name: Azure.Identity
     */
    public static final String assemblyShortName = "Azure.Identity";
    /**
     * Qualified class name: Azure.Identity.DefaultAzureCredentialOptions
     */
    public static final String className = "Azure.Identity.DefaultAzureCredentialOptions";
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
    public DefaultAzureCredentialOptions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DefaultAzureCredentialOptions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DefaultAzureCredentialOptions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DefaultAzureCredentialOptions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DefaultAzureCredentialOptions(from.getJCOInstance());
    }

    // Constructors section
    
    public DefaultAzureCredentialOptions() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.OverflowException {
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
    
    public boolean getExcludeAzureCliCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeAzureCliCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeAzureCliCredential(boolean ExcludeAzureCliCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeAzureCliCredential", ExcludeAzureCliCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeAzurePowerShellCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeAzurePowerShellCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeAzurePowerShellCredential(boolean ExcludeAzurePowerShellCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeAzurePowerShellCredential", ExcludeAzurePowerShellCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeEnvironmentCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeEnvironmentCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeEnvironmentCredential(boolean ExcludeEnvironmentCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeEnvironmentCredential", ExcludeEnvironmentCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeInteractiveBrowserCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeInteractiveBrowserCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeInteractiveBrowserCredential(boolean ExcludeInteractiveBrowserCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeInteractiveBrowserCredential", ExcludeInteractiveBrowserCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeManagedIdentityCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeManagedIdentityCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeManagedIdentityCredential(boolean ExcludeManagedIdentityCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeManagedIdentityCredential", ExcludeManagedIdentityCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeSharedTokenCacheCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeSharedTokenCacheCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeSharedTokenCacheCredential(boolean ExcludeSharedTokenCacheCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeSharedTokenCacheCredential", ExcludeSharedTokenCacheCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeVisualStudioCodeCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeVisualStudioCodeCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeVisualStudioCodeCredential(boolean ExcludeVisualStudioCodeCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeVisualStudioCodeCredential", ExcludeVisualStudioCodeCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExcludeVisualStudioCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExcludeVisualStudioCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExcludeVisualStudioCredential(boolean ExcludeVisualStudioCredential) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExcludeVisualStudioCredential", ExcludeVisualStudioCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInteractiveBrowserTenantId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("InteractiveBrowserTenantId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInteractiveBrowserTenantId(java.lang.String InteractiveBrowserTenantId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InteractiveBrowserTenantId", InteractiveBrowserTenantId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getManagedIdentityClientId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ManagedIdentityClientId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManagedIdentityClientId(java.lang.String ManagedIdentityClientId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ManagedIdentityClientId", ManagedIdentityClientId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSharedTokenCacheTenantId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SharedTokenCacheTenantId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSharedTokenCacheTenantId(java.lang.String SharedTokenCacheTenantId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SharedTokenCacheTenantId", SharedTokenCacheTenantId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSharedTokenCacheUsername() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SharedTokenCacheUsername");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSharedTokenCacheUsername(java.lang.String SharedTokenCacheUsername) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SharedTokenCacheUsername", SharedTokenCacheUsername);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVisualStudioCodeTenantId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("VisualStudioCodeTenantId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisualStudioCodeTenantId(java.lang.String VisualStudioCodeTenantId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VisualStudioCodeTenantId", VisualStudioCodeTenantId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVisualStudioTenantId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("VisualStudioTenantId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisualStudioTenantId(java.lang.String VisualStudioTenantId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VisualStudioTenantId", VisualStudioTenantId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}