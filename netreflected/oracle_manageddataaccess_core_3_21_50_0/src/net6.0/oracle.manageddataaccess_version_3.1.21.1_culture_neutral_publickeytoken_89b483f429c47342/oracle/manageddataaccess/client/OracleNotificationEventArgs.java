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

package oracle.manageddataaccess.client;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.EventArgs;
import oracle.manageddataaccess.client.OracleNotificationInfo;
import oracle.manageddataaccess.client.OracleNotificationSource;
import oracle.manageddataaccess.client.OracleNotificationType;
import system.data.DataTable;


/**
 * The base .NET class managing Oracle.ManagedDataAccess.Client.OracleNotificationEventArgs, Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Client.OracleNotificationEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Client.OracleNotificationEventArgs</a>
 */
public class OracleNotificationEventArgs extends EventArgs  {
    /**
     * Fully assembly qualified name: Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.ManagedDataAccess
     */
    public static final String assemblyShortName = "Oracle.ManagedDataAccess";
    /**
     * Qualified class name: Oracle.ManagedDataAccess.Client.OracleNotificationEventArgs
     */
    public static final String className = "Oracle.ManagedDataAccess.Client.OracleNotificationEventArgs";
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
    public OracleNotificationEventArgs(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OracleNotificationEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OracleNotificationEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OracleNotificationEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OracleNotificationEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public OracleNotificationEventArgs() throws Throwable {
    }



    
    // Methods section
    

    
    // Properties section
    
    public OracleNotificationInfo getInfo() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.io.compression.ZLibException, system.io.IOException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Info");
            return new OracleNotificationInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleNotificationSource getSource() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.io.compression.ZLibException, system.io.IOException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new OracleNotificationSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleNotificationType getType() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.io.compression.ZLibException, system.io.IOException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new OracleNotificationType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable getDetails() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.io.compression.ZLibException, system.io.IOException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Details");
            return new DataTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getResourceNames() throws Throwable, system.PlatformNotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentNullException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.io.FileNotFoundException, system.AccessViolationException, system.NotImplementedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.io.compression.ZLibException, system.io.IOException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ResourceNames");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexResourceNames = 0; indexResourceNames < resultingArrayList.size(); indexResourceNames++ ) {
				resultingArray[indexResourceNames] = (java.lang.String)resultingArrayList.get(indexResourceNames);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}