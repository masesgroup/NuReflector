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

package microsoft.aspnetcore.builder;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.aspnetcore.builder.RequestLocalizationOptions;
import microsoft.aspnetcore.localization.RequestCulture;


/**
 * The base .NET class managing Microsoft.AspNetCore.Builder.RequestLocalizationOptions, Microsoft.AspNetCore.Localization, Version=2.1.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Builder.RequestLocalizationOptions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Builder.RequestLocalizationOptions</a>
 */
public class RequestLocalizationOptions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.Localization, Version=2.1.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.Localization, Version=2.1.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.Localization
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.Localization";
    /**
     * Qualified class name: Microsoft.AspNetCore.Builder.RequestLocalizationOptions
     */
    public static final String className = "Microsoft.AspNetCore.Builder.RequestLocalizationOptions";
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
    public RequestLocalizationOptions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RequestLocalizationOptions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RequestLocalizationOptions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RequestLocalizationOptions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RequestLocalizationOptions(from.getJCOInstance());
    }

    // Constructors section
    
    public RequestLocalizationOptions() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public RequestLocalizationOptions AddSupportedCultures(java.lang.String... cultures) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddSupportedCultures = (JCObject)classInstance.Invoke("AddSupportedCultures", (java.lang.Object)cultures);
            return new RequestLocalizationOptions(objAddSupportedCultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestLocalizationOptions AddSupportedCultures(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddSupportedCultures = (JCObject)classInstance.Invoke("AddSupportedCultures", (java.lang.Object)dupParam0.getJCRefOut());
            return new RequestLocalizationOptions(objAddSupportedCultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestLocalizationOptions AddSupportedUICultures(java.lang.String... uiCultures) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddSupportedUICultures = (JCObject)classInstance.Invoke("AddSupportedUICultures", (java.lang.Object)uiCultures);
            return new RequestLocalizationOptions(objAddSupportedUICultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestLocalizationOptions AddSupportedUICultures(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddSupportedUICultures = (JCObject)classInstance.Invoke("AddSupportedUICultures", (java.lang.Object)dupParam0.getJCRefOut());
            return new RequestLocalizationOptions(objAddSupportedUICultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestLocalizationOptions SetDefaultCulture(java.lang.String defaultCulture) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetDefaultCulture = (JCObject)classInstance.Invoke("SetDefaultCulture", defaultCulture);
            return new RequestLocalizationOptions(objSetDefaultCulture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getFallBackToParentCultures() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FallBackToParentCultures");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFallBackToParentCultures(boolean FallBackToParentCultures) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FallBackToParentCultures", FallBackToParentCultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFallBackToParentUICultures() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FallBackToParentUICultures");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFallBackToParentUICultures(boolean FallBackToParentUICultures) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FallBackToParentUICultures", FallBackToParentUICultures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestCulture getDefaultRequestCulture() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultRequestCulture");
            return new RequestCulture(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultRequestCulture(RequestCulture DefaultRequestCulture) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultRequestCulture", DefaultRequestCulture == null ? null : DefaultRequestCulture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}