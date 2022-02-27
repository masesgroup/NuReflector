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
import mysqlx.xdevapi.DatabaseObject;
import mysqlx.xdevapi.Collection;
import mysqlx.xdevapi.common.CreateCollectionOptions;
import mysqlx.xdevapi.relational.Table;
import mysqlx.xdevapi.BaseSession;


/**
 * The base .NET class managing MySqlX.XDevAPI.Schema, MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.Schema" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.Schema</a>
 */
public class Schema extends DatabaseObject  {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.22.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySqlX.XDevAPI.Schema
     */
    public static final String className = "MySqlX.XDevAPI.Schema";
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
    public Schema(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Schema}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Schema} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Schema cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Schema(from.getJCOInstance());
    }

    // Constructors section
    
    public Schema() throws Throwable {
    }



    
    // Methods section
    
    public boolean ExistsInDatabase() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ExistsInDatabase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Collection CreateCollection(java.lang.String collectionName, boolean ReuseExisting) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCollection = (JCObject)classInstance.Invoke("CreateCollection", collectionName, ReuseExisting);
            return new Collection(objCreateCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Collection CreateCollection(java.lang.String collectionName, CreateCollectionOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCollection = (JCObject)classInstance.Invoke("CreateCollection", collectionName, options == null ? null : options.getJCOInstance());
            return new Collection(objCreateCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Collection GetCollection(java.lang.String name, boolean ValidateExistence) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCollection = (JCObject)classInstance.Invoke("GetCollection", name, ValidateExistence);
            return new Collection(objGetCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Table GetCollectionAsTable(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCollectionAsTable = (JCObject)classInstance.Invoke("GetCollectionAsTable", name);
            return new Table(objGetCollectionAsTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Table GetTable(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTable = (JCObject)classInstance.Invoke("GetTable", name);
            return new Table(objGetTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DropCollection(java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, mysql.data.mysqlclient.MySqlException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DropCollection", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public BaseSession getSession() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Session");
            return new BaseSession(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSession(BaseSession Session) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Session", Session == null ? null : Session.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}