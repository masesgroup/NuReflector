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

package npgsql.entityframeworkcore.postgresql.valuegeneration.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.valuegeneration.ValueGenerator;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import npgsql.entityframeworkcore.postgresql.valuegeneration.internal.NpgsqlSequenceValueGeneratorState;
import npgsql.entityframeworkcore.postgresql.storage.internal.INpgsqlRelationalConnection;
import npgsql.entityframeworkcore.postgresql.storage.internal.INpgsqlRelationalConnectionImplementation;
import microsoft.entityframeworkcore.storage.IRawSqlCommandBuilder;
import microsoft.entityframeworkcore.storage.IRawSqlCommandBuilderImplementation;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLogger;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLoggerImplementation;


/**
 * The base .NET class managing Npgsql.EntityFrameworkCore.PostgreSQL.ValueGeneration.Internal.INpgsqlSequenceValueGeneratorFactory, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.ValueGeneration.Internal.INpgsqlSequenceValueGeneratorFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.ValueGeneration.Internal.INpgsqlSequenceValueGeneratorFactory</a>
 */
public interface INpgsqlSequenceValueGeneratorFactory extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Npgsql.EntityFrameworkCore.PostgreSQL.ValueGeneration.Internal.INpgsqlSequenceValueGeneratorFactory
     */
    public static final String className = "Npgsql.EntityFrameworkCore.PostgreSQL.ValueGeneration.Internal.INpgsqlSequenceValueGeneratorFactory";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link INpgsqlSequenceValueGeneratorFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link INpgsqlSequenceValueGeneratorFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static INpgsqlSequenceValueGeneratorFactory ToINpgsqlSequenceValueGeneratorFactory(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new INpgsqlSequenceValueGeneratorFactoryImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public ValueGenerator Create(IProperty property, NpgsqlSequenceValueGeneratorState generatorState, INpgsqlRelationalConnection connection, IRawSqlCommandBuilder rawSqlCommandBuilder, IRelationalCommandDiagnosticsLogger commandLogger) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}