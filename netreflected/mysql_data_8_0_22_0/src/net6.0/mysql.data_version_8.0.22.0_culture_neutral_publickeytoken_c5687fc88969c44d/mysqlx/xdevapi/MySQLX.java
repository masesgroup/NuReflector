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

package mysqlx.xdevapi;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mysqlx.xdevapi.Client;
import mysqlx.xdevapi.Session;


/**
 * The base .NET class managing MySqlX.XDevAPI.MySQLX, MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.MySQLX" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.MySQLX</a>
 */
public class MySQLX extends NetObject  {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySqlX.XDevAPI.MySQLX
     */
    public static final String className = "MySqlX.XDevAPI.MySQLX";
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
    public MySQLX(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySQLX}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySQLX} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySQLX cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySQLX(from.getJCOInstance());
    }

    // Constructors section
    
    public MySQLX() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static Client GetClient(NetObject connectionData, NetObject connectionOptions) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.UriFormatException, mysql.data.mysqlclient.MySqlException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetClient = (JCObject)classType.Invoke("GetClient", connectionData == null ? null : connectionData.getJCOInstance(), connectionOptions == null ? null : connectionOptions.getJCOInstance());
            return new Client(objGetClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Client GetClient(NetObject connectionData, java.lang.String connectionOptions) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.UriFormatException, mysql.data.mysqlclient.MySqlException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetClient = (JCObject)classType.Invoke("GetClient", connectionData == null ? null : connectionData.getJCOInstance(), connectionOptions);
            return new Client(objGetClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Client GetClient(java.lang.String connectionString, NetObject connectionOptions) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.UriFormatException, mysql.data.mysqlclient.MySqlException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetClient = (JCObject)classType.Invoke("GetClient", connectionString, connectionOptions == null ? null : connectionOptions.getJCOInstance());
            return new Client(objGetClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Client GetClient(java.lang.String connectionString, java.lang.String connectionOptions) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.UriFormatException, mysql.data.mysqlclient.MySqlException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.InvalidTimeZoneException, system.OverflowException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetClient = (JCObject)classType.Invoke("GetClient", connectionString, connectionOptions);
            return new Client(objGetClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Session GetSession(NetObject connectionData) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.text.regularexpressions.RegexMatchTimeoutException, system.ArrayTypeMismatchException, system.OutOfMemoryException, mysql.data.mysqlclient.MySqlException, system.OverflowException, system.net.networkinformation.NetworkInformationException, system.net.sockets.SocketException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSession = (JCObject)classType.Invoke("GetSession", connectionData == null ? null : connectionData.getJCOInstance());
            return new Session(objGetSession);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Session GetSession(java.lang.String connectionString) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException, system.text.regularexpressions.RegexParseException, system.NotSupportedException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.UriFormatException, mysql.data.mysqlclient.MySqlException, system.ArrayTypeMismatchException, system.OverflowException, system.ObjectDisposedException, system.net.networkinformation.NetworkInformationException, system.net.sockets.SocketException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSession = (JCObject)classType.Invoke("GetSession", connectionString);
            return new Session(objGetSession);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}