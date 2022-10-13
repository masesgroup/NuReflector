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

package firebirdsql.data.isql;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing FirebirdSql.Data.Isql.SqlStatementType, FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Isql.SqlStatementType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Isql.SqlStatementType</a>
 */
public class SqlStatementType extends NetObject  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.Isql.SqlStatementType
     */
    public static final String className = "FirebirdSql.Data.Isql.SqlStatementType";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public SqlStatementType(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public SqlStatementType() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    final static SqlStatementType getFrom(JCEnum object, String value) {
        try {
            return new SqlStatementType(object.fromValue(value));
        } catch (JCException e) {
            return new SqlStatementType(object);
        }
    }

    // Enum fields section
    
    public static SqlStatementType AlterCharacterSet = getFrom(enumReflected, "AlterCharacterSet");
    public static SqlStatementType AlterDatabase = getFrom(enumReflected, "AlterDatabase");
    public static SqlStatementType AlterDomain = getFrom(enumReflected, "AlterDomain");
    public static SqlStatementType AlterException = getFrom(enumReflected, "AlterException");
    public static SqlStatementType AlterExternalFunction = getFrom(enumReflected, "AlterExternalFunction");
    public static SqlStatementType AlterFunction = getFrom(enumReflected, "AlterFunction");
    public static SqlStatementType AlterIndex = getFrom(enumReflected, "AlterIndex");
    public static SqlStatementType AlterPackage = getFrom(enumReflected, "AlterPackage");
    public static SqlStatementType AlterProcedure = getFrom(enumReflected, "AlterProcedure");
    public static SqlStatementType AlterRole = getFrom(enumReflected, "AlterRole");
    public static SqlStatementType AlterSequence = getFrom(enumReflected, "AlterSequence");
    public static SqlStatementType AlterTable = getFrom(enumReflected, "AlterTable");
    public static SqlStatementType AlterTrigger = getFrom(enumReflected, "AlterTrigger");
    public static SqlStatementType AlterView = getFrom(enumReflected, "AlterView");
    public static SqlStatementType Close = getFrom(enumReflected, "Close");
    public static SqlStatementType CommentOn = getFrom(enumReflected, "CommentOn");
    public static SqlStatementType Commit = getFrom(enumReflected, "Commit");
    public static SqlStatementType Connect = getFrom(enumReflected, "Connect");
    public static SqlStatementType CreateCollation = getFrom(enumReflected, "CreateCollation");
    public static SqlStatementType CreateDatabase = getFrom(enumReflected, "CreateDatabase");
    public static SqlStatementType CreateDomain = getFrom(enumReflected, "CreateDomain");
    public static SqlStatementType CreateException = getFrom(enumReflected, "CreateException");
    public static SqlStatementType CreateFunction = getFrom(enumReflected, "CreateFunction");
    public static SqlStatementType CreateGenerator = getFrom(enumReflected, "CreateGenerator");
    public static SqlStatementType CreateIndex = getFrom(enumReflected, "CreateIndex");
    public static SqlStatementType CreatePackage = getFrom(enumReflected, "CreatePackage");
    public static SqlStatementType CreatePackageBody = getFrom(enumReflected, "CreatePackageBody");
    public static SqlStatementType CreateProcedure = getFrom(enumReflected, "CreateProcedure");
    public static SqlStatementType CreateRole = getFrom(enumReflected, "CreateRole");
    public static SqlStatementType CreateSequence = getFrom(enumReflected, "CreateSequence");
    public static SqlStatementType CreateShadow = getFrom(enumReflected, "CreateShadow");
    public static SqlStatementType CreateTable = getFrom(enumReflected, "CreateTable");
    public static SqlStatementType CreateTrigger = getFrom(enumReflected, "CreateTrigger");
    public static SqlStatementType CreateView = getFrom(enumReflected, "CreateView");
    public static SqlStatementType DeclareCursor = getFrom(enumReflected, "DeclareCursor");
    public static SqlStatementType DeclareExternalFunction = getFrom(enumReflected, "DeclareExternalFunction");
    public static SqlStatementType DeclareFilter = getFrom(enumReflected, "DeclareFilter");
    public static SqlStatementType DeclareStatement = getFrom(enumReflected, "DeclareStatement");
    public static SqlStatementType DeclareTable = getFrom(enumReflected, "DeclareTable");
    public static SqlStatementType Delete = getFrom(enumReflected, "Delete");
    public static SqlStatementType Describe = getFrom(enumReflected, "Describe");
    public static SqlStatementType Disconnect = getFrom(enumReflected, "Disconnect");
    public static SqlStatementType DropCollation = getFrom(enumReflected, "DropCollation");
    public static SqlStatementType DropDatabase = getFrom(enumReflected, "DropDatabase");
    public static SqlStatementType DropDomain = getFrom(enumReflected, "DropDomain");
    public static SqlStatementType DropException = getFrom(enumReflected, "DropException");
    public static SqlStatementType DropExternalFunction = getFrom(enumReflected, "DropExternalFunction");
    public static SqlStatementType DropFunction = getFrom(enumReflected, "DropFunction");
    public static SqlStatementType DropFilter = getFrom(enumReflected, "DropFilter");
    public static SqlStatementType DropGenerator = getFrom(enumReflected, "DropGenerator");
    public static SqlStatementType DropIndex = getFrom(enumReflected, "DropIndex");
    public static SqlStatementType DropPackage = getFrom(enumReflected, "DropPackage");
    public static SqlStatementType DropPackageBody = getFrom(enumReflected, "DropPackageBody");
    public static SqlStatementType DropProcedure = getFrom(enumReflected, "DropProcedure");
    public static SqlStatementType DropSequence = getFrom(enumReflected, "DropSequence");
    public static SqlStatementType DropRole = getFrom(enumReflected, "DropRole");
    public static SqlStatementType DropShadow = getFrom(enumReflected, "DropShadow");
    public static SqlStatementType DropTable = getFrom(enumReflected, "DropTable");
    public static SqlStatementType DropTrigger = getFrom(enumReflected, "DropTrigger");
    public static SqlStatementType DropView = getFrom(enumReflected, "DropView");
    public static SqlStatementType EndDeclareSection = getFrom(enumReflected, "EndDeclareSection");
    public static SqlStatementType EventInit = getFrom(enumReflected, "EventInit");
    public static SqlStatementType EventWait = getFrom(enumReflected, "EventWait");
    public static SqlStatementType Execute = getFrom(enumReflected, "Execute");
    public static SqlStatementType ExecuteBlock = getFrom(enumReflected, "ExecuteBlock");
    public static SqlStatementType ExecuteImmediate = getFrom(enumReflected, "ExecuteImmediate");
    public static SqlStatementType ExecuteProcedure = getFrom(enumReflected, "ExecuteProcedure");
    public static SqlStatementType Fetch = getFrom(enumReflected, "Fetch");
    public static SqlStatementType Grant = getFrom(enumReflected, "Grant");
    public static SqlStatementType Insert = getFrom(enumReflected, "Insert");
    public static SqlStatementType InsertCursor = getFrom(enumReflected, "InsertCursor");
    public static SqlStatementType Merge = getFrom(enumReflected, "Merge");
    public static SqlStatementType Open = getFrom(enumReflected, "Open");
    public static SqlStatementType Prepare = getFrom(enumReflected, "Prepare");
    public static SqlStatementType RecreateFunction = getFrom(enumReflected, "RecreateFunction");
    public static SqlStatementType RecreatePackage = getFrom(enumReflected, "RecreatePackage");
    public static SqlStatementType RecreatePackageBody = getFrom(enumReflected, "RecreatePackageBody");
    public static SqlStatementType RecreateProcedure = getFrom(enumReflected, "RecreateProcedure");
    public static SqlStatementType RecreateTable = getFrom(enumReflected, "RecreateTable");
    public static SqlStatementType RecreateTrigger = getFrom(enumReflected, "RecreateTrigger");
    public static SqlStatementType RecreateView = getFrom(enumReflected, "RecreateView");
    public static SqlStatementType Revoke = getFrom(enumReflected, "Revoke");
    public static SqlStatementType Rollback = getFrom(enumReflected, "Rollback");
    public static SqlStatementType Select = getFrom(enumReflected, "Select");
    public static SqlStatementType SetAutoDDL = getFrom(enumReflected, "SetAutoDDL");
    public static SqlStatementType SetDatabase = getFrom(enumReflected, "SetDatabase");
    public static SqlStatementType SetGenerator = getFrom(enumReflected, "SetGenerator");
    public static SqlStatementType SetNames = getFrom(enumReflected, "SetNames");
    public static SqlStatementType SetSQLDialect = getFrom(enumReflected, "SetSQLDialect");
    public static SqlStatementType SetStatistics = getFrom(enumReflected, "SetStatistics");
    public static SqlStatementType SetTransaction = getFrom(enumReflected, "SetTransaction");
    public static SqlStatementType ShowSQLDialect = getFrom(enumReflected, "ShowSQLDialect");
    public static SqlStatementType Update = getFrom(enumReflected, "Update");
    public static SqlStatementType Whenever = getFrom(enumReflected, "Whenever");


    // Flags management section


}