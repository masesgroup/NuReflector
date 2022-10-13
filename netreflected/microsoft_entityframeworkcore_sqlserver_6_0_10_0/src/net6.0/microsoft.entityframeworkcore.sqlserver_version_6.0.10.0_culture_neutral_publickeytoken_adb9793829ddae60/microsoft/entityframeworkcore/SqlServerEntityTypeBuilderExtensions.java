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
import microsoft.entityframeworkcore.metadata.builders.IConventionEntityTypeBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionEntityTypeBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.EntityTypeBuilder;
import microsoft.entityframeworkcore.metadata.builders.OwnedNavigationBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.SqlServerEntityTypeBuilderExtensions, Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerEntityTypeBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerEntityTypeBuilderExtensions</a>
 */
public class SqlServerEntityTypeBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.SqlServer
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.SqlServer";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.SqlServerEntityTypeBuilderExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.SqlServerEntityTypeBuilderExtensions";
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
    public SqlServerEntityTypeBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlServerEntityTypeBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlServerEntityTypeBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlServerEntityTypeBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlServerEntityTypeBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlServerEntityTypeBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean CanSetHistoryTableName(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetHistoryTableName", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), name, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetHistoryTableSchema(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetHistoryTableSchema", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), schema, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetIsTemporal(IConventionEntityTypeBuilder entityTypeBuilder, boolean temporal, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetIsTemporal", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), temporal, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetPeriodEnd(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String propertyName, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetPeriodEnd", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), propertyName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetPeriodStart(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String propertyName, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetPeriodStart", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), propertyName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EntityTypeBuilder IsMemoryOptimized(EntityTypeBuilder entityTypeBuilder, boolean memoryOptimized) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIsMemoryOptimized = (JCObject)classType.Invoke("IsMemoryOptimized", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), memoryOptimized);
            return new EntityTypeBuilder(objIsMemoryOptimized);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionEntityTypeBuilder HasPeriodEnd(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String propertyName, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPeriodEnd = (JCObject)classType.Invoke("HasPeriodEnd", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), propertyName, fromDataAnnotation);
            return new IConventionEntityTypeBuilderImplementation(objHasPeriodEnd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionEntityTypeBuilder HasPeriodStart(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String propertyName, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasPeriodStart = (JCObject)classType.Invoke("HasPeriodStart", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), propertyName, fromDataAnnotation);
            return new IConventionEntityTypeBuilderImplementation(objHasPeriodStart);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionEntityTypeBuilder IsTemporal(IConventionEntityTypeBuilder entityTypeBuilder, boolean temporal, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIsTemporal = (JCObject)classType.Invoke("IsTemporal", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), temporal, fromDataAnnotation);
            return new IConventionEntityTypeBuilderImplementation(objIsTemporal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionEntityTypeBuilder UseHistoryTableName(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseHistoryTableName = (JCObject)classType.Invoke("UseHistoryTableName", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), name, fromDataAnnotation);
            return new IConventionEntityTypeBuilderImplementation(objUseHistoryTableName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionEntityTypeBuilder UseHistoryTableSchema(IConventionEntityTypeBuilder entityTypeBuilder, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseHistoryTableSchema = (JCObject)classType.Invoke("UseHistoryTableSchema", entityTypeBuilder == null ? null : entityTypeBuilder.getJCOInstance(), schema, fromDataAnnotation);
            return new IConventionEntityTypeBuilderImplementation(objUseHistoryTableSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OwnedNavigationBuilder IsMemoryOptimized(OwnedNavigationBuilder collectionOwnershipBuilder, boolean memoryOptimized) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIsMemoryOptimized = (JCObject)classType.Invoke("IsMemoryOptimized", collectionOwnershipBuilder == null ? null : collectionOwnershipBuilder.getJCOInstance(), memoryOptimized);
            return new OwnedNavigationBuilder(objIsMemoryOptimized);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}