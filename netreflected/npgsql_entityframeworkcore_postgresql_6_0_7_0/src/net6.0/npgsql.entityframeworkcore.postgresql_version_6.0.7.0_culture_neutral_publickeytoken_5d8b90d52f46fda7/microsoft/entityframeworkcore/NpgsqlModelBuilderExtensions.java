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

package microsoft.entityframeworkcore;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionSequenceBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionSequenceBuilderImplementation;
import microsoft.entityframeworkcore.ModelBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.NpgsqlModelBuilderExtensions, Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.NpgsqlModelBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.NpgsqlModelBuilderExtensions</a>
 */
public class NpgsqlModelBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql.EntityFrameworkCore.PostgreSQL, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql.EntityFrameworkCore.PostgreSQL
     */
    public static final String assemblyShortName = "Npgsql.EntityFrameworkCore.PostgreSQL";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.NpgsqlModelBuilderExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.NpgsqlModelBuilderExtensions";
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
    public NpgsqlModelBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NpgsqlModelBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NpgsqlModelBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NpgsqlModelBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NpgsqlModelBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public NpgsqlModelBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean CanSetDefaultColumnCollation(IConventionModelBuilder modelBuilder, java.lang.String collation, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetDefaultColumnCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetHiLoSequence(IConventionModelBuilder modelBuilder, java.lang.String name, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetHiLoSequence", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, schema, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionModelBuilder UseDefaultColumnCollation(IConventionModelBuilder modelBuilder, java.lang.String collation, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseDefaultColumnCollation = (JCObject)classType.Invoke("UseDefaultColumnCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation, fromDataAnnotation);
            return new IConventionModelBuilderImplementation(objUseDefaultColumnCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionSequenceBuilder HasHiLoSequence(IConventionModelBuilder modelBuilder, java.lang.String name, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasHiLoSequence = (JCObject)classType.Invoke("HasHiLoSequence", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, schema, fromDataAnnotation);
            return new IConventionSequenceBuilderImplementation(objHasHiLoSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresEnum(ModelBuilder modelBuilder, java.lang.String schema, java.lang.String name, java.lang.String[] labels) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresEnum = (JCObject)classType.Invoke("HasPostgresEnum", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema, name, labels);
            return new ModelBuilder(objHasPostgresEnum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresEnum(ModelBuilder dupParam0, java.lang.String dupParam1, java.lang.String dupParam2, JCORefOut dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresEnum = (JCObject)classType.Invoke("HasPostgresEnum", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2, dupParam3.getJCRefOut());
            return new ModelBuilder(objHasPostgresEnum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresEnum(ModelBuilder modelBuilder, java.lang.String name, java.lang.String[] labels) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresEnum = (JCObject)classType.Invoke("HasPostgresEnum", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, labels);
            return new ModelBuilder(objHasPostgresEnum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresEnum(ModelBuilder dupParam0, java.lang.String dupParam1, JCORefOut dupParam2) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresEnum = (JCObject)classType.Invoke("HasPostgresEnum", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2.getJCRefOut());
            return new ModelBuilder(objHasPostgresEnum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresExtension(ModelBuilder modelBuilder, java.lang.String schema, java.lang.String name, java.lang.String version) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresExtension = (JCObject)classType.Invoke("HasPostgresExtension", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema, name, version);
            return new ModelBuilder(objHasPostgresExtension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresExtension(ModelBuilder modelBuilder, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresExtension = (JCObject)classType.Invoke("HasPostgresExtension", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name);
            return new ModelBuilder(objHasPostgresExtension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresRange(ModelBuilder modelBuilder, java.lang.String schema, java.lang.String name, java.lang.String subtype, java.lang.String canonicalFunction, java.lang.String subtypeOpClass, java.lang.String collation, java.lang.String subtypeDiff) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresRange = (JCObject)classType.Invoke("HasPostgresRange", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema, name, subtype, canonicalFunction, subtypeOpClass, collation, subtypeDiff);
            return new ModelBuilder(objHasPostgresRange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasPostgresRange(ModelBuilder modelBuilder, java.lang.String name, java.lang.String subtype) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPostgresRange = (JCObject)classType.Invoke("HasPostgresRange", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, subtype);
            return new ModelBuilder(objHasPostgresRange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseDatabaseTemplate(ModelBuilder modelBuilder, java.lang.String templateDatabaseName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseDatabaseTemplate = (JCObject)classType.Invoke("UseDatabaseTemplate", modelBuilder == null ? null : modelBuilder.getJCOInstance(), templateDatabaseName);
            return new ModelBuilder(objUseDatabaseTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseDefaultColumnCollation(ModelBuilder modelBuilder, java.lang.String collation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseDefaultColumnCollation = (JCObject)classType.Invoke("UseDefaultColumnCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation);
            return new ModelBuilder(objUseDefaultColumnCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseHiLo(ModelBuilder modelBuilder, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseHiLo = (JCObject)classType.Invoke("UseHiLo", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, schema);
            return new ModelBuilder(objUseHiLo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseIdentityAlwaysColumns(ModelBuilder modelBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseIdentityAlwaysColumns = (JCObject)classType.Invoke("UseIdentityAlwaysColumns", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new ModelBuilder(objUseIdentityAlwaysColumns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseIdentityByDefaultColumns(ModelBuilder modelBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseIdentityByDefaultColumns = (JCObject)classType.Invoke("UseIdentityByDefaultColumns", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new ModelBuilder(objUseIdentityByDefaultColumns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseIdentityColumns(ModelBuilder modelBuilder) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseIdentityColumns = (JCObject)classType.Invoke("UseIdentityColumns", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new ModelBuilder(objUseIdentityColumns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseSerialColumns(ModelBuilder modelBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseSerialColumns = (JCObject)classType.Invoke("UseSerialColumns", modelBuilder == null ? null : modelBuilder.getJCOInstance());
            return new ModelBuilder(objUseSerialColumns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseTablespace(ModelBuilder modelBuilder, java.lang.String tablespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseTablespace = (JCObject)classType.Invoke("UseTablespace", modelBuilder == null ? null : modelBuilder.getJCOInstance(), tablespace);
            return new ModelBuilder(objUseTablespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}