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
import renci.sshnet.BaseClient;
import renci.sshnet.ConnectionInfo;
import renci.sshnet.PrivateKeyFile;
import system.io.DirectoryInfo;
import system.io.FileInfo;
import system.io.Stream;
import renci.sshnet.IRemotePathTransformation;
import renci.sshnet.IRemotePathTransformationImplementation;
import system.TimeSpan;
import system.UInt32;


/**
 * The base .NET class managing Renci.SshNet.ScpClient, Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.ScpClient" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.ScpClient</a>
 */
public class ScpClient extends BaseClient  {
    /**
     * Fully assembly qualified name: Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106
     */
    public static final String assemblyFullName = "Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106";
    /**
     * Assembly name: Renci.SshNet
     */
    public static final String assemblyShortName = "Renci.SshNet";
    /**
     * Qualified class name: Renci.SshNet.ScpClient
     */
    public static final String className = "Renci.SshNet.ScpClient";
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
    public ScpClient(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ScpClient}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ScpClient} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ScpClient cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ScpClient(from.getJCOInstance());
    }

    // Constructors section
    
    public ScpClient() throws Throwable {
    }

    public ScpClient(ConnectionInfo connectionInfo) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionInfo == null ? null : connectionInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScpClient(java.lang.String host, int port, java.lang.String username, PrivateKeyFile... keyFiles) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OverflowException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, toObjectFromArray(keyFiles)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScpClient(java.lang.String host, int port, java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, port, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScpClient(java.lang.String host, java.lang.String username, PrivateKeyFile... keyFiles) throws Throwable, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, toObjectFromArray(keyFiles)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScpClient(java.lang.String host, java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Download(java.lang.String directoryName, DirectoryInfo directoryInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, renci.sshnet.common.SshException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, renci.sshnet.common.ScpException, system.text.regularexpressions.RegexMatchTimeoutException, system.text.regularexpressions.RegexParseException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Download", directoryName, directoryInfo == null ? null : directoryInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Download(java.lang.String filename, FileInfo fileInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, renci.sshnet.common.SshException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, renci.sshnet.common.ScpException, system.text.regularexpressions.RegexMatchTimeoutException, system.text.regularexpressions.RegexParseException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Download", filename, fileInfo == null ? null : fileInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Download(java.lang.String filename, Stream destination) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, renci.sshnet.common.SshException, system.ObjectDisposedException, renci.sshnet.common.ScpException, system.globalization.CultureNotFoundException, system.OverflowException, system.text.regularexpressions.RegexMatchTimeoutException, system.text.regularexpressions.RegexParseException, system.ArrayTypeMismatchException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Download", filename, destination == null ? null : destination.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Upload(DirectoryInfo directoryInfo, java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, renci.sshnet.common.SshException, renci.sshnet.common.ScpException, system.OutOfMemoryException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Upload", directoryInfo == null ? null : directoryInfo.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Upload(FileInfo fileInfo, java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, renci.sshnet.common.SshException, renci.sshnet.common.ScpException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Upload", fileInfo == null ? null : fileInfo.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Upload(Stream source, java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, renci.sshnet.common.SshException, renci.sshnet.common.ScpException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Upload", source == null ? null : source.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IRemotePathTransformation getRemotePathTransformation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RemotePathTransformation");
            return new IRemotePathTransformationImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRemotePathTransformation(IRemotePathTransformation RemotePathTransformation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RemotePathTransformation", RemotePathTransformation == null ? null : RemotePathTransformation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getOperationTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OperationTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOperationTimeout(TimeSpan OperationTimeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OperationTimeout", OperationTimeout == null ? null : OperationTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 getBufferSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BufferSize");
            return new UInt32(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBufferSize(UInt32 BufferSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BufferSize", BufferSize == null ? null : BufferSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}