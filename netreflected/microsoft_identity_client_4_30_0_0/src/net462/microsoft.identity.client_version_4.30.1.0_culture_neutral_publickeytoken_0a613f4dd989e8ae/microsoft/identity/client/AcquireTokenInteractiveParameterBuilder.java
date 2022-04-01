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
import microsoft.identity.client.AcquireTokenInteractiveParameterBuilder;
import microsoft.identity.client.IAccount;
import microsoft.identity.client.IAccountImplementation;
import microsoft.identity.client.EmbeddedWebViewOptions;
import system.windows.forms.IWin32Window;
import system.windows.forms.IWin32WindowImplementation;
import microsoft.identity.client.Prompt;
import microsoft.identity.client.SystemWebViewOptions;


/**
 * The base .NET class managing Microsoft.Identity.Client.AcquireTokenInteractiveParameterBuilder, Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.AcquireTokenInteractiveParameterBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.AcquireTokenInteractiveParameterBuilder</a>
 */
public class AcquireTokenInteractiveParameterBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client";
    /**
     * Qualified class name: Microsoft.Identity.Client.AcquireTokenInteractiveParameterBuilder
     */
    public static final String className = "Microsoft.Identity.Client.AcquireTokenInteractiveParameterBuilder";
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
    public AcquireTokenInteractiveParameterBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AcquireTokenInteractiveParameterBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AcquireTokenInteractiveParameterBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AcquireTokenInteractiveParameterBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AcquireTokenInteractiveParameterBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public AcquireTokenInteractiveParameterBuilder() throws Throwable {
    }



    
    // Methods section
    
    public AcquireTokenInteractiveParameterBuilder WithAccount(IAccount account) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithAccount = (JCObject)classInstance.Invoke("WithAccount", account == null ? null : account.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithAccount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithEmbeddedWebViewOptions(EmbeddedWebViewOptions options) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithEmbeddedWebViewOptions = (JCObject)classInstance.Invoke("WithEmbeddedWebViewOptions", options == null ? null : options.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithEmbeddedWebViewOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithLoginHint(java.lang.String loginHint) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithLoginHint = (JCObject)classInstance.Invoke("WithLoginHint", loginHint);
            return new AcquireTokenInteractiveParameterBuilder(objWithLoginHint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithParentActivityOrWindow(NetObject parent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithParentActivityOrWindow = (JCObject)classInstance.Invoke("WithParentActivityOrWindow", parent == null ? null : parent.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithParentActivityOrWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithParentActivityOrWindow(IWin32Window window) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithParentActivityOrWindow = (JCObject)classInstance.Invoke("WithParentActivityOrWindow", window == null ? null : window.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithParentActivityOrWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithPrompt(Prompt prompt) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithPrompt = (JCObject)classInstance.Invoke("WithPrompt", prompt == null ? null : prompt.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithPrompt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithSystemWebViewOptions(SystemWebViewOptions options) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithSystemWebViewOptions = (JCObject)classInstance.Invoke("WithSystemWebViewOptions", options == null ? null : options.getJCOInstance());
            return new AcquireTokenInteractiveParameterBuilder(objWithSystemWebViewOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AcquireTokenInteractiveParameterBuilder WithUseEmbeddedWebView(boolean useEmbeddedWebView) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithUseEmbeddedWebView = (JCObject)classInstance.Invoke("WithUseEmbeddedWebView", useEmbeddedWebView);
            return new AcquireTokenInteractiveParameterBuilder(objWithUseEmbeddedWebView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}