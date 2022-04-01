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

package microsoft.identity.client.extensions.msal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.identity.client.ITokenCache;
import microsoft.identity.client.ITokenCacheImplementation;


/**
 * The base .NET class managing Microsoft.Identity.Client.Extensions.Msal.MsalCacheHelper, Microsoft.Identity.Client.Extensions.Msal, Version=2.18.4.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.Extensions.Msal.MsalCacheHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.Extensions.Msal.MsalCacheHelper</a>
 */
public class MsalCacheHelper extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client.Extensions.Msal, Version=2.18.4.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client.Extensions.Msal, Version=2.18.4.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client.Extensions.Msal
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client.Extensions.Msal";
    /**
     * Qualified class name: Microsoft.Identity.Client.Extensions.Msal.MsalCacheHelper
     */
    public static final String className = "Microsoft.Identity.Client.Extensions.Msal.MsalCacheHelper";
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
    public MsalCacheHelper(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MsalCacheHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MsalCacheHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MsalCacheHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MsalCacheHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public MsalCacheHelper() throws Throwable {
    }



    
    // Methods section
    
    public byte[] LoadUnencryptedTokenCache() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.IOException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.OverflowException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("LoadUnencryptedTokenCache");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexLoadUnencryptedTokenCache = 0; indexLoadUnencryptedTokenCache < resultingArrayList.size(); indexLoadUnencryptedTokenCache++ ) {
				resultingArray[indexLoadUnencryptedTokenCache] = (byte)resultingArrayList.get(indexLoadUnencryptedTokenCache);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.IOException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.OverflowException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterCache(ITokenCache tokenCache) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.PlatformNotSupportedException, system.io.IOException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.ThreadAbortException, system.security.SecurityException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterCache", tokenCache == null ? null : tokenCache.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveUnencryptedTokenCache(byte[] tokenCache) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.IOException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.OverflowException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveUnencryptedTokenCache", (java.lang.Object)tokenCache);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveUnencryptedTokenCache(JCORefOut dupParam0) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.IOException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.OverflowException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveUnencryptedTokenCache", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnregisterCache(ITokenCache tokenCache) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UnregisterCache", tokenCache == null ? null : tokenCache.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyPersistence() throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.ArgumentException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, microsoft.identity.client.extensions.msal.MsalCachePersistenceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("VerifyPersistence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static java.lang.String getUserRootDirectory() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("UserRootDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}