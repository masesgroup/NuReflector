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

package npgsql.entityframeworkcore.postgresql.metadata.conventions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.conventions.infrastructure.RelationalConventionSetBuilder;
import microsoft.entityframeworkcore.metadata.conventions.infrastructure.ProviderConventionSetBuilderDependencies;
import microsoft.entityframeworkcore.metadata.conventions.infrastructure.RelationalConventionSetBuilderDependencies;
import npgsql.entityframeworkcore.postgresql.infrastructure.internal.INpgsqlOptions;
import npgsql.entityframeworkcore.postgresql.infrastructure.internal.INpgsqlOptionsImplementation;
import microsoft.entityframeworkcore.metadata.conventions.ConventionSet;
import microsoft.entityframeworkcore.ModelBuilder;


/**
 * The base .NET class managing Npgsql.EntityFrameworkCore.PostgreSQL.Metadata.Conventions.NpgsqlConventionSetBuilder, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Metadata.Conventions.NpgsqlConventionSetBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.EntityFrameworkCore.PostgreSQL.Metadata.Conventions.NpgsqlConventionSetBuilder</a>
 */
public class NpgsqlConventionSetBuilder extends RelationalConventionSetBuilder  {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.3.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Npgsql.EntityFrameworkCore.PostgreSQL.Metadata.Conventions.NpgsqlConventionSetBuilder
     */
    public static final String className = "Npgsql.EntityFrameworkCore.PostgreSQL.Metadata.Conventions.NpgsqlConventionSetBuilder";
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
    public NpgsqlConventionSetBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NpgsqlConventionSetBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NpgsqlConventionSetBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NpgsqlConventionSetBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NpgsqlConventionSetBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public NpgsqlConventionSetBuilder() throws Throwable {
    }

    public NpgsqlConventionSetBuilder(ProviderConventionSetBuilderDependencies dependencies, RelationalConventionSetBuilderDependencies relationalDependencies, INpgsqlOptions npgsqlOptions) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance(), relationalDependencies == null ? null : relationalDependencies.getJCOInstance(), npgsqlOptions == null ? null : npgsqlOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ConventionSet Build() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.InsufficientExecutionStackException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBuild = (JCObject)classType.Invoke("Build");
            return new ConventionSet(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConventionSet CreateConventionSet() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateConventionSet = (JCObject)classInstance.Invoke("CreateConventionSet");
            return new ConventionSet(objCreateConventionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder CreateModelBuilder() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.InsufficientExecutionStackException, system.AggregateException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateModelBuilder = (JCObject)classType.Invoke("CreateModelBuilder");
            return new ModelBuilder(objCreateModelBuilder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}