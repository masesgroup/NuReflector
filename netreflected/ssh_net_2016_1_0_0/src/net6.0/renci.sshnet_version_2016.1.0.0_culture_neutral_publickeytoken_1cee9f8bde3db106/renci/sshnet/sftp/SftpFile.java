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

package renci.sshnet.sftp;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import renci.sshnet.sftp.SftpFileAttributes;
import system.DateTime;


/**
 * The base .NET class managing Renci.SshNet.Sftp.SftpFile, Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.Sftp.SftpFile" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.Sftp.SftpFile</a>
 */
public class SftpFile extends NetObject  {
    /**
     * Fully assembly qualified name: Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106
     */
    public static final String assemblyFullName = "Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106";
    /**
     * Assembly name: Renci.SshNet
     */
    public static final String assemblyShortName = "Renci.SshNet";
    /**
     * Qualified class name: Renci.SshNet.Sftp.SftpFile
     */
    public static final String className = "Renci.SshNet.Sftp.SftpFile";
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
    public SftpFile(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SftpFile}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SftpFile} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SftpFile cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SftpFile(from.getJCOInstance());
    }

    // Constructors section
    
    public SftpFile() throws Throwable {
    }



    
    // Methods section
    
    public void Delete() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(java.lang.String destFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", destFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPermissions(short mode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPermissions", mode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateStatus() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateStatus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getGroupCanExecute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GroupCanExecute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroupCanExecute(boolean GroupCanExecute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GroupCanExecute", GroupCanExecute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGroupCanRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GroupCanRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroupCanRead(boolean GroupCanRead) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GroupCanRead", GroupCanRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGroupCanWrite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GroupCanWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroupCanWrite(boolean GroupCanWrite) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GroupCanWrite", GroupCanWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBlockDevice() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsBlockDevice");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCharacterDevice() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCharacterDevice");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNamedPipe() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNamedPipe");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRegularFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRegularFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSocket() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSocket");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSymbolicLink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSymbolicLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOthersCanExecute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OthersCanExecute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOthersCanExecute(boolean OthersCanExecute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OthersCanExecute", OthersCanExecute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOthersCanRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OthersCanRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOthersCanRead(boolean OthersCanRead) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OthersCanRead", OthersCanRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOthersCanWrite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OthersCanWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOthersCanWrite(boolean OthersCanWrite) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OthersCanWrite", OthersCanWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOwnerCanExecute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OwnerCanExecute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwnerCanExecute(boolean OwnerCanExecute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OwnerCanExecute", OwnerCanExecute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOwnerCanRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OwnerCanRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwnerCanRead(boolean OwnerCanRead) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OwnerCanRead", OwnerCanRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOwnerCanWrite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OwnerCanWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwnerCanWrite(boolean OwnerCanWrite) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OwnerCanWrite", OwnerCanWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getGroupId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("GroupId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroupId(int GroupId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GroupId", GroupId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getUserId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("UserId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserId(int UserId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UserId", UserId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SftpFileAttributes getAttributes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new SftpFileAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAttributes(SftpFileAttributes Attributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Attributes", Attributes == null ? null : Attributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getLastAccessTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastAccessTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastAccessTime(DateTime LastAccessTime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastAccessTime", LastAccessTime == null ? null : LastAccessTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getLastAccessTimeUtc() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastAccessTimeUtc");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastAccessTimeUtc(DateTime LastAccessTimeUtc) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastAccessTimeUtc", LastAccessTimeUtc == null ? null : LastAccessTimeUtc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getLastWriteTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastWriteTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastWriteTime(DateTime LastWriteTime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastWriteTime", LastWriteTime == null ? null : LastWriteTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getLastWriteTimeUtc() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastWriteTimeUtc");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastWriteTimeUtc(DateTime LastWriteTimeUtc) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastWriteTimeUtc", LastWriteTimeUtc == null ? null : LastWriteTimeUtc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FullName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFullName(java.lang.String FullName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FullName", FullName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}