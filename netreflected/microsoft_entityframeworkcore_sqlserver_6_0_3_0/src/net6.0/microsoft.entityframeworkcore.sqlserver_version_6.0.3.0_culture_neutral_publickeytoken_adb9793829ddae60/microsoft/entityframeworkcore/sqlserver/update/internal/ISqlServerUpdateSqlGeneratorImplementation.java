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

package microsoft.entityframeworkcore.sqlserver.update.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.update.IUpdateSqlGenerator;
import microsoft.entityframeworkcore.update.IUpdateSqlGeneratorImplementation;
import microsoft.entityframeworkcore.update.ResultSetMapping;
import system.text.StringBuilder;
import microsoft.entityframeworkcore.update.IReadOnlyModificationCommand;
import microsoft.entityframeworkcore.update.IReadOnlyModificationCommandImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.SqlServer.Update.Internal.ISqlServerUpdateSqlGenerator, Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServer.Update.Internal.ISqlServerUpdateSqlGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServer.Update.Internal.ISqlServerUpdateSqlGenerator</a>
 */
public class ISqlServerUpdateSqlGeneratorImplementation extends NetObject implements ISqlServerUpdateSqlGenerator {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.SqlServer
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.SqlServer";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.SqlServer.Update.Internal.ISqlServerUpdateSqlGenerator
     */
    public static final String className = "Microsoft.EntityFrameworkCore.SqlServer.Update.Internal.ISqlServerUpdateSqlGenerator";
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
    public ISqlServerUpdateSqlGeneratorImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ISqlServerUpdateSqlGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ISqlServerUpdateSqlGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ISqlServerUpdateSqlGenerator ToISqlServerUpdateSqlGenerator(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ISqlServerUpdateSqlGeneratorImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ResultSetMapping AppendDeleteOperation(StringBuilder commandStringBuilder, IReadOnlyModificationCommand command, int commandPosition) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAppendDeleteOperation = (JCObject)classInstance.Invoke("AppendDeleteOperation", commandStringBuilder == null ? null : commandStringBuilder.getJCOInstance(), command == null ? null : command.getJCOInstance(), commandPosition);
            return new ResultSetMapping(objAppendDeleteOperation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResultSetMapping AppendInsertOperation(StringBuilder commandStringBuilder, IReadOnlyModificationCommand command, int commandPosition) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAppendInsertOperation = (JCObject)classInstance.Invoke("AppendInsertOperation", commandStringBuilder == null ? null : commandStringBuilder.getJCOInstance(), command == null ? null : command.getJCOInstance(), commandPosition);
            return new ResultSetMapping(objAppendInsertOperation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResultSetMapping AppendUpdateOperation(StringBuilder commandStringBuilder, IReadOnlyModificationCommand command, int commandPosition) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAppendUpdateOperation = (JCObject)classInstance.Invoke("AppendUpdateOperation", commandStringBuilder == null ? null : commandStringBuilder.getJCOInstance(), command == null ? null : command.getJCOInstance(), commandPosition);
            return new ResultSetMapping(objAppendUpdateOperation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GenerateNextSequenceValueOperation(java.lang.String name, java.lang.String schema) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GenerateNextSequenceValueOperation", name, schema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendBatchHeader(StringBuilder commandStringBuilder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AppendBatchHeader", commandStringBuilder == null ? null : commandStringBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendNextSequenceValueOperation(StringBuilder commandStringBuilder, java.lang.String name, java.lang.String schema) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AppendNextSequenceValueOperation", commandStringBuilder == null ? null : commandStringBuilder.getJCOInstance(), name, schema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}