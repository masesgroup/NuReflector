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

package npgsql.entityframeworkcore.postgresql.query.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.query.QuerySqlGenerator;
import microsoft.entityframeworkcore.query.QuerySqlGeneratorDependencies;
import system.Version;
import system.linq.expressions.Expression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresAllExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresAnyExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresArrayIndexExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresILikeExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresJsonTraversalExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresFunctionExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresRegexMatchExpression;
import npgsql.entityframeworkcore.postgresql.query.expressions.internal.PostgresUnknownBinaryExpression;


/**
 * The base .NET class managing Npgsql.EntityFrameworkCore.PostgreSQL.Query.Internal.NpgsqlQuerySqlGenerator, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Query.Internal.NpgsqlQuerySqlGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Query.Internal.NpgsqlQuerySqlGenerator</a>
 */
public class NpgsqlQuerySqlGenerator extends QuerySqlGenerator  {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Npgsql.EntityFrameworkCore.PostgreSQL.Query.Internal.NpgsqlQuerySqlGenerator
     */
    public static final String className = "Npgsql.EntityFrameworkCore.PostgreSQL.Query.Internal.NpgsqlQuerySqlGenerator";
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
    public NpgsqlQuerySqlGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NpgsqlQuerySqlGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NpgsqlQuerySqlGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NpgsqlQuerySqlGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NpgsqlQuerySqlGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public NpgsqlQuerySqlGenerator() throws Throwable {
    }

    public NpgsqlQuerySqlGenerator(QuerySqlGeneratorDependencies dependencies, boolean reverseNullOrderingEnabled, Version postgresVersion) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance(), reverseNullOrderingEnabled, postgresVersion == null ? null : postgresVersion.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Expression VisitArrayAll(PostgresAllExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitArrayAll = (JCObject)classInstance.Invoke("VisitArrayAll", expression == null ? null : expression.getJCOInstance());
            return new Expression(objVisitArrayAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitArrayAny(PostgresAnyExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitArrayAny = (JCObject)classInstance.Invoke("VisitArrayAny", expression == null ? null : expression.getJCOInstance());
            return new Expression(objVisitArrayAny);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitArrayIndex(PostgresArrayIndexExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitArrayIndex = (JCObject)classInstance.Invoke("VisitArrayIndex", expression == null ? null : expression.getJCOInstance());
            return new Expression(objVisitArrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitILike(PostgresILikeExpression likeExpression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitILike = (JCObject)classInstance.Invoke("VisitILike", likeExpression == null ? null : likeExpression.getJCOInstance());
            return new Expression(objVisitILike);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitJsonPathTraversal(PostgresJsonTraversalExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitJsonPathTraversal = (JCObject)classInstance.Invoke("VisitJsonPathTraversal", expression == null ? null : expression.getJCOInstance());
            return new Expression(objVisitJsonPathTraversal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitPgFunction(PostgresFunctionExpression e) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitPgFunction = (JCObject)classInstance.Invoke("VisitPgFunction", e == null ? null : e.getJCOInstance());
            return new Expression(objVisitPgFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitRegexMatch(PostgresRegexMatchExpression expression) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitRegexMatch = (JCObject)classInstance.Invoke("VisitRegexMatch", expression == null ? null : expression.getJCOInstance());
            return new Expression(objVisitRegexMatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression VisitUnknownBinary(PostgresUnknownBinaryExpression unknownBinaryExpression) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisitUnknownBinary = (JCObject)classInstance.Invoke("VisitUnknownBinary", unknownBinaryExpression == null ? null : unknownBinaryExpression.getJCOInstance());
            return new Expression(objVisitUnknownBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}