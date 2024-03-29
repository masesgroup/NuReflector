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
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IMutableEntityType;
import microsoft.entityframeworkcore.metadata.IMutableEntityTypeImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.SqlServerEntityTypeExtensions, Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerEntityTypeExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerEntityTypeExtensions</a>
 */
public class SqlServerEntityTypeExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.SqlServer
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.SqlServer";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.SqlServerEntityTypeExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.SqlServerEntityTypeExtensions";
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
    public SqlServerEntityTypeExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlServerEntityTypeExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlServerEntityTypeExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlServerEntityTypeExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlServerEntityTypeExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlServerEntityTypeExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsMemoryOptimized(IReadOnlyEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsMemoryOptimized", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsTemporal(IReadOnlyEntityType entityType) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsTemporal", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHistoryTableName(IReadOnlyEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHistoryTableName", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHistoryTableSchema(IReadOnlyEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHistoryTableSchema", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetPeriodEndPropertyName(IReadOnlyEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetPeriodEndPropertyName", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetPeriodStartPropertyName(IReadOnlyEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetPeriodStartPropertyName", entityType == null ? null : entityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetHistoryTableName(IConventionEntityType entityType, java.lang.String historyTableName, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetHistoryTableName", entityType == null ? null : entityType.getJCOInstance(), historyTableName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetHistoryTableSchema(IConventionEntityType entityType, java.lang.String historyTableSchema, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetHistoryTableSchema", entityType == null ? null : entityType.getJCOInstance(), historyTableSchema, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetPeriodEndPropertyName(IConventionEntityType entityType, java.lang.String periodEndPropertyName, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetPeriodEndPropertyName", entityType == null ? null : entityType.getJCOInstance(), periodEndPropertyName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetPeriodStartPropertyName(IConventionEntityType entityType, java.lang.String periodStartPropertyName, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetPeriodStartPropertyName", entityType == null ? null : entityType.getJCOInstance(), periodStartPropertyName, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetHistoryTableName(IMutableEntityType entityType, java.lang.String historyTableName) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetHistoryTableName", entityType == null ? null : entityType.getJCOInstance(), historyTableName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetHistoryTableSchema(IMutableEntityType entityType, java.lang.String historyTableSchema) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetHistoryTableSchema", entityType == null ? null : entityType.getJCOInstance(), historyTableSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetIsMemoryOptimized(IMutableEntityType entityType, boolean memoryOptimized) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetIsMemoryOptimized", entityType == null ? null : entityType.getJCOInstance(), memoryOptimized);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetIsTemporal(IMutableEntityType entityType, boolean temporal) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetIsTemporal", entityType == null ? null : entityType.getJCOInstance(), temporal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPeriodEndPropertyName(IMutableEntityType entityType, java.lang.String periodEndPropertyName) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetPeriodEndPropertyName", entityType == null ? null : entityType.getJCOInstance(), periodEndPropertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPeriodStartPropertyName(IMutableEntityType entityType, java.lang.String periodStartPropertyName) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetPeriodStartPropertyName", entityType == null ? null : entityType.getJCOInstance(), periodStartPropertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}