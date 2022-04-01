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

package npgsql.entityframeworkcore.postgresql.query.expressions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Npgsql.EntityFrameworkCore.PostgreSQL.Query.Expressions.PostgresExpressionType, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Query.Expressions.PostgresExpressionType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Query.Expressions.PostgresExpressionType</a>
 */
public class PostgresExpressionType extends NetObject  {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Npgsql.EntityFrameworkCore.PostgreSQL.Query.Expressions.PostgresExpressionType
     */
    public static final String className = "Npgsql.EntityFrameworkCore.PostgreSQL.Query.Expressions.PostgresExpressionType";
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
    public PostgresExpressionType(java.lang.Object instance) {
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

    public PostgresExpressionType() {
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

    final static PostgresExpressionType getFrom(JCEnum object, String value) {
        try {
            return new PostgresExpressionType(object.fromValue(value));
        } catch (JCException e) {
            return new PostgresExpressionType(object);
        }
    }

    // Enum fields section
    
    public static PostgresExpressionType Contains = getFrom(enumReflected, "Contains");
    public static PostgresExpressionType ContainedBy = getFrom(enumReflected, "ContainedBy");
    public static PostgresExpressionType Overlaps = getFrom(enumReflected, "Overlaps");
    public static PostgresExpressionType AtTimeZone = getFrom(enumReflected, "AtTimeZone");
    public static PostgresExpressionType NetworkContainedByOrEqual = getFrom(enumReflected, "NetworkContainedByOrEqual");
    public static PostgresExpressionType NetworkContainsOrEqual = getFrom(enumReflected, "NetworkContainsOrEqual");
    public static PostgresExpressionType NetworkContainsOrContainedBy = getFrom(enumReflected, "NetworkContainsOrContainedBy");
    public static PostgresExpressionType RangeIsStrictlyLeftOf = getFrom(enumReflected, "RangeIsStrictlyLeftOf");
    public static PostgresExpressionType RangeIsStrictlyRightOf = getFrom(enumReflected, "RangeIsStrictlyRightOf");
    public static PostgresExpressionType RangeDoesNotExtendRightOf = getFrom(enumReflected, "RangeDoesNotExtendRightOf");
    public static PostgresExpressionType RangeDoesNotExtendLeftOf = getFrom(enumReflected, "RangeDoesNotExtendLeftOf");
    public static PostgresExpressionType RangeIsAdjacentTo = getFrom(enumReflected, "RangeIsAdjacentTo");
    public static PostgresExpressionType RangeUnion = getFrom(enumReflected, "RangeUnion");
    public static PostgresExpressionType RangeIntersect = getFrom(enumReflected, "RangeIntersect");
    public static PostgresExpressionType RangeExcept = getFrom(enumReflected, "RangeExcept");
    public static PostgresExpressionType TextSearchMatch = getFrom(enumReflected, "TextSearchMatch");
    public static PostgresExpressionType TextSearchAnd = getFrom(enumReflected, "TextSearchAnd");
    public static PostgresExpressionType TextSearchOr = getFrom(enumReflected, "TextSearchOr");
    public static PostgresExpressionType JsonExists = getFrom(enumReflected, "JsonExists");
    public static PostgresExpressionType JsonExistsAny = getFrom(enumReflected, "JsonExistsAny");
    public static PostgresExpressionType JsonExistsAll = getFrom(enumReflected, "JsonExistsAll");
    public static PostgresExpressionType LTreeMatches = getFrom(enumReflected, "LTreeMatches");
    public static PostgresExpressionType LTreeMatchesAny = getFrom(enumReflected, "LTreeMatchesAny");
    public static PostgresExpressionType LTreeFirstAncestor = getFrom(enumReflected, "LTreeFirstAncestor");
    public static PostgresExpressionType LTreeFirstDescendent = getFrom(enumReflected, "LTreeFirstDescendent");
    public static PostgresExpressionType LTreeFirstMatches = getFrom(enumReflected, "LTreeFirstMatches");
    public static PostgresExpressionType PostgisDistanceKnn = getFrom(enumReflected, "PostgisDistanceKnn");


    // Flags management section


}