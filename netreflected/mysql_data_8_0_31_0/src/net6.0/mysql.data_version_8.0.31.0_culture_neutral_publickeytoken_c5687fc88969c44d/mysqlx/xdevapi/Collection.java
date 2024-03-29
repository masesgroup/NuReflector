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
import mysqlx.xdevapi.common.Result;
import mysqlx.xdevapi.crud.AddStatement;
import mysqlx.xdevapi.crud.FindStatement;
import mysqlx.xdevapi.crud.ModifyStatement;
import mysqlx.xdevapi.crud.RemoveStatement;
import mysqlx.xdevapi.DbDoc;


/**
 * The base .NET class managing MySqlX.XDevAPI.Collection, MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.Collection" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySqlX.XDevAPI.Collection</a>
 */
public class Collection extends DatabaseObject  {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.31.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySqlX.XDevAPI.Collection
     */
    public static final String className = "MySqlX.XDevAPI.Collection";
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
    public Collection(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Collection}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Collection} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Collection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Collection(from.getJCOInstance());
    }

    // Constructors section
    
    public Collection() throws Throwable {
    }



    
    // Methods section
    
    public boolean ExistsInDatabase() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.net.sockets.SocketException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ExistsInDatabase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long Count() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, mysql.data.mysqlclient.MySqlException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.OverflowException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result AddOrReplaceOne(NetObject id, NetObject doc) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, mysql.data.mysqlclient.MySqlException, system.InvalidOperationException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddOrReplaceOne = (JCObject)classInstance.Invoke("AddOrReplaceOne", id == null ? null : id.getJCOInstance(), doc == null ? null : doc.getJCOInstance());
            return new Result(objAddOrReplaceOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result RemoveOne(NetObject id) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveOne = (JCObject)classInstance.Invoke("RemoveOne", id == null ? null : id.getJCOInstance());
            return new Result(objRemoveOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result ReplaceOne(NetObject id, NetObject doc) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.FormatException, mysql.data.mysqlclient.MySqlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReplaceOne = (JCObject)classInstance.Invoke("ReplaceOne", id == null ? null : id.getJCOInstance(), doc == null ? null : doc.getJCOInstance());
            return new Result(objReplaceOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AddStatement Add(NetObject... items) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", (java.lang.Object)toObjectFromArray(items));
            return new AddStatement(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FindStatement Find(java.lang.String condition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFind = (JCObject)classInstance.Invoke("Find", condition);
            return new FindStatement(objFind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModifyStatement Modify(java.lang.String condition) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objModify = (JCObject)classInstance.Invoke("Modify", condition);
            return new ModifyStatement(objModify);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RemoveStatement Remove(java.lang.String condition) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemove = (JCObject)classInstance.Invoke("Remove", condition);
            return new RemoveStatement(objRemove);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDoc GetOne(NetObject id) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOne = (JCObject)classInstance.Invoke("GetOne", id == null ? null : id.getJCOInstance());
            return new DbDoc(objGetOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateIndex(java.lang.String indexName, NetObject indexDefinition) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.FormatException, system.globalization.CultureNotFoundException, mysql.data.mysqlclient.MySqlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateIndex", indexName, indexDefinition == null ? null : indexDefinition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DropIndex(java.lang.String indexName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, mysql.data.mysqlclient.MySqlException, system.FormatException, system.io.EndOfStreamException, system.ObjectDisposedException, system.net.sockets.SocketException, system.ArrayTypeMismatchException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DropIndex", indexName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}