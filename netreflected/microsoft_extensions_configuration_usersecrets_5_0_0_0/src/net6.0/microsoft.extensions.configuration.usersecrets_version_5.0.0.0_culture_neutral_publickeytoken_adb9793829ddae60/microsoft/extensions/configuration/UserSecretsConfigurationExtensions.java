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

package microsoft.extensions.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.extensions.configuration.IConfigurationBuilder;
import microsoft.extensions.configuration.IConfigurationBuilderImplementation;
import system.reflection.Assembly;


/**
 * The base .NET class managing Microsoft.Extensions.Configuration.UserSecretsConfigurationExtensions, Microsoft.Extensions.Configuration.UserSecrets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Configuration.UserSecretsConfigurationExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.Configuration.UserSecretsConfigurationExtensions</a>
 */
public class UserSecretsConfigurationExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.Configuration.UserSecrets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.Configuration.UserSecrets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.Configuration.UserSecrets
     */
    public static final String assemblyShortName = "Microsoft.Extensions.Configuration.UserSecrets";
    /**
     * Qualified class name: Microsoft.Extensions.Configuration.UserSecretsConfigurationExtensions
     */
    public static final String className = "Microsoft.Extensions.Configuration.UserSecretsConfigurationExtensions";
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
    public UserSecretsConfigurationExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link UserSecretsConfigurationExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link UserSecretsConfigurationExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static UserSecretsConfigurationExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new UserSecretsConfigurationExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public UserSecretsConfigurationExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static IConfigurationBuilder AddUserSecrets(IConfigurationBuilder configuration, Assembly assembly, boolean optional, boolean reloadOnChange) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.io.DirectoryNotFoundException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddUserSecrets = (JCObject)classType.Invoke("AddUserSecrets", configuration == null ? null : configuration.getJCOInstance(), assembly == null ? null : assembly.getJCOInstance(), optional, reloadOnChange);
            return new IConfigurationBuilderImplementation(objAddUserSecrets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConfigurationBuilder AddUserSecrets(IConfigurationBuilder configuration, Assembly assembly, boolean optional) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.reflection.AmbiguousMatchException, system.FormatException, system.io.DirectoryNotFoundException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddUserSecrets = (JCObject)classType.Invoke("AddUserSecrets", configuration == null ? null : configuration.getJCOInstance(), assembly == null ? null : assembly.getJCOInstance(), optional);
            return new IConfigurationBuilderImplementation(objAddUserSecrets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConfigurationBuilder AddUserSecrets(IConfigurationBuilder configuration, Assembly assembly) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.reflection.AmbiguousMatchException, system.FormatException, system.io.DirectoryNotFoundException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddUserSecrets = (JCObject)classType.Invoke("AddUserSecrets", configuration == null ? null : configuration.getJCOInstance(), assembly == null ? null : assembly.getJCOInstance());
            return new IConfigurationBuilderImplementation(objAddUserSecrets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConfigurationBuilder AddUserSecrets(IConfigurationBuilder configuration, java.lang.String userSecretsId, boolean reloadOnChange) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.io.DirectoryNotFoundException, system.MulticastNotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddUserSecrets = (JCObject)classType.Invoke("AddUserSecrets", configuration == null ? null : configuration.getJCOInstance(), userSecretsId, reloadOnChange);
            return new IConfigurationBuilderImplementation(objAddUserSecrets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConfigurationBuilder AddUserSecrets(IConfigurationBuilder configuration, java.lang.String userSecretsId) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.OverflowException, system.io.DirectoryNotFoundException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddUserSecrets = (JCObject)classType.Invoke("AddUserSecrets", configuration == null ? null : configuration.getJCOInstance(), userSecretsId);
            return new IConfigurationBuilderImplementation(objAddUserSecrets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}