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

package pomelo.entityframeworkcore.mysql.query.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.query.SqlExpressionFactory;
import microsoft.entityframeworkcore.query.SqlExpressionFactoryDependencies;
import microsoft.entityframeworkcore.query.sqlexpressions.SqlExpression;
import microsoft.entityframeworkcore.storage.RelationalTypeMapping;
import microsoft.entityframeworkcore.query.sqlexpressions.SqlFunctionExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlBinaryExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlBinaryExpressionOperatorType;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlCollateExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlColumnAliasReferenceExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlComplexFunctionArgumentExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlJsonArrayIndexExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlJsonTraversalExpression;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlMatchExpression;
import microsoft.entityframeworkcore.MySqlMatchSearchMode;
import pomelo.entityframeworkcore.mysql.query.expressions.internal.MySqlRegexpExpression;


/**
 * The base .NET class managing Pomelo.EntityFrameworkCore.MySql.Query.Internal.MySqlSqlExpressionFactory, Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Query.Internal.MySqlSqlExpressionFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Query.Internal.MySqlSqlExpressionFactory</a>
 */
public class MySqlSqlExpressionFactory extends SqlExpressionFactory  {
    /**
     * Fully assembly qualified name: Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b
     */
    public static final String assemblyFullName = "Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b";
    /**
     * Assembly name: Pomelo.EntityFrameworkCore.MySql
     */
    public static final String assemblyShortName = "Pomelo.EntityFrameworkCore.MySql";
    /**
     * Qualified class name: Pomelo.EntityFrameworkCore.MySql.Query.Internal.MySqlSqlExpressionFactory
     */
    public static final String className = "Pomelo.EntityFrameworkCore.MySql.Query.Internal.MySqlSqlExpressionFactory";
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
    public MySqlSqlExpressionFactory(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySqlSqlExpressionFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySqlSqlExpressionFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySqlSqlExpressionFactory cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySqlSqlExpressionFactory(from.getJCOInstance());
    }

    // Constructors section
    
    public MySqlSqlExpressionFactory() throws Throwable {
    }

    public MySqlSqlExpressionFactory(SqlExpressionFactoryDependencies dependencies) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public SqlExpression ApplyTypeMapping(SqlExpression sqlExpression, RelationalTypeMapping typeMapping) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objApplyTypeMapping = (JCObject)classInstance.Invoke("ApplyTypeMapping", sqlExpression == null ? null : sqlExpression.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new SqlExpression(objApplyTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlBinaryExpression MakeBinary(MySqlBinaryExpressionOperatorType operatorType, SqlExpression left, SqlExpression right, RelationalTypeMapping typeMapping) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMakeBinary = (JCObject)classInstance.Invoke("MakeBinary", operatorType == null ? null : operatorType.getJCOInstance(), left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlBinaryExpression(objMakeBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlBinaryExpression MySqlIntegerDivide(SqlExpression left, SqlExpression right, RelationalTypeMapping typeMapping) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMySqlIntegerDivide = (JCObject)classInstance.Invoke("MySqlIntegerDivide", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlBinaryExpression(objMySqlIntegerDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlBinaryExpression NonOptimizedEqual(SqlExpression left, SqlExpression right, RelationalTypeMapping typeMapping) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNonOptimizedEqual = (JCObject)classInstance.Invoke("NonOptimizedEqual", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlBinaryExpression(objNonOptimizedEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlCollateExpression Collate(SqlExpression valueExpression, java.lang.String charset, java.lang.String collation) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCollate = (JCObject)classInstance.Invoke("Collate", valueExpression == null ? null : valueExpression.getJCOInstance(), charset, collation);
            return new MySqlCollateExpression(objCollate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlColumnAliasReferenceExpression ColumnAliasReference(java.lang.String alias, SqlExpression expression, NetType type, RelationalTypeMapping typeMapping) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objColumnAliasReference = (JCObject)classInstance.Invoke("ColumnAliasReference", alias, expression == null ? null : expression.getJCOInstance(), type == null ? null : type.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlColumnAliasReferenceExpression(objColumnAliasReference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlJsonArrayIndexExpression JsonArrayIndex(SqlExpression expression, NetType type, RelationalTypeMapping typeMapping) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objJsonArrayIndex = (JCObject)classInstance.Invoke("JsonArrayIndex", expression == null ? null : expression.getJCOInstance(), type == null ? null : type.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlJsonArrayIndexExpression(objJsonArrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlJsonArrayIndexExpression JsonArrayIndex(SqlExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objJsonArrayIndex = (JCObject)classInstance.Invoke("JsonArrayIndex", expression == null ? null : expression.getJCOInstance());
            return new MySqlJsonArrayIndexExpression(objJsonArrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlJsonTraversalExpression JsonTraversal(SqlExpression expression, boolean returnsText, NetType type, RelationalTypeMapping typeMapping) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objJsonTraversal = (JCObject)classInstance.Invoke("JsonTraversal", expression == null ? null : expression.getJCOInstance(), returnsText, type == null ? null : type.getJCOInstance(), typeMapping == null ? null : typeMapping.getJCOInstance());
            return new MySqlJsonTraversalExpression(objJsonTraversal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlMatchExpression MakeMatch(SqlExpression match, SqlExpression against, MySqlMatchSearchMode searchMode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMakeMatch = (JCObject)classInstance.Invoke("MakeMatch", match == null ? null : match.getJCOInstance(), against == null ? null : against.getJCOInstance(), searchMode == null ? null : searchMode.getJCOInstance());
            return new MySqlMatchExpression(objMakeMatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlRegexpExpression Regexp(SqlExpression match, SqlExpression pattern) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRegexp = (JCObject)classInstance.Invoke("Regexp", match == null ? null : match.getJCOInstance(), pattern == null ? null : pattern.getJCOInstance());
            return new MySqlRegexpExpression(objRegexp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}