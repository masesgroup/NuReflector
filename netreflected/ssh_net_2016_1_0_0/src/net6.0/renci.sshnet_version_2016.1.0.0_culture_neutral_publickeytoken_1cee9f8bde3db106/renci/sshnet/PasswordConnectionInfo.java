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

package renci.sshnet;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import renci.sshnet.ConnectionInfo;
import renci.sshnet.ProxyTypes;


/**
 * The base .NET class managing Renci.SshNet.PasswordConnectionInfo, Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.PasswordConnectionInfo" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.PasswordConnectionInfo</a>
 */
public class PasswordConnectionInfo extends ConnectionInfo implements AutoCloseable {
    /**
     * Fully assembly qualified name: Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106
     */
    public static final String assemblyFullName = "Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106";
    /**
     * Assembly name: Renci.SshNet
     */
    public static final String assemblyShortName = "Renci.SshNet";
    /**
     * Qualified class name: Renci.SshNet.PasswordConnectionInfo
     */
    public static final String className = "Renci.SshNet.PasswordConnectionInfo";
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
    public PasswordConnectionInfo(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PasswordConnectionInfo}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PasswordConnectionInfo} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PasswordConnectionInfo cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PasswordConnectionInfo(from.getJCOInstance());
    }

    // Constructors section
    
    public PasswordConnectionInfo() throws Throwable {
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername, java.lang.String proxyPassword) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.RankException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername, proxyPassword));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, byte[] password) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, java.lang.String password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, java.lang.String password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, int port, java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername, java.lang.String proxyPassword) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername, proxyPassword));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, byte[] password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, byte[] password) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OverflowException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, java.lang.String password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername, java.lang.String proxyPassword) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername, proxyPassword));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, java.lang.String password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort, java.lang.String proxyUsername) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort, proxyUsername));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, java.lang.String password, ProxyTypes proxyType, java.lang.String proxyHost, int proxyPort) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password, proxyType == null ? null : proxyType.getJCOInstance(), proxyHost, proxyPort));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordConnectionInfo(java.lang.String host, java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    


    // Instance Events section
    


}