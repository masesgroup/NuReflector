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

package microsoft.entityframeworkcore.sqlserver.valuegeneration.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.valuegeneration.RelationalValueGeneratorSelector;
import microsoft.entityframeworkcore.valuegeneration.ValueGeneratorSelectorDependencies;
import microsoft.entityframeworkcore.sqlserver.valuegeneration.internal.ISqlServerSequenceValueGeneratorFactory;
import microsoft.entityframeworkcore.sqlserver.valuegeneration.internal.ISqlServerSequenceValueGeneratorFactoryImplementation;
import microsoft.entityframeworkcore.sqlserver.storage.internal.ISqlServerConnection;
import microsoft.entityframeworkcore.sqlserver.storage.internal.ISqlServerConnectionImplementation;
import microsoft.entityframeworkcore.storage.IRawSqlCommandBuilder;
import microsoft.entityframeworkcore.storage.IRawSqlCommandBuilderImplementation;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLogger;
import microsoft.entityframeworkcore.diagnostics.IRelationalCommandDiagnosticsLoggerImplementation;
import microsoft.entityframeworkcore.valuegeneration.ValueGenerator;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.sqlserver.valuegeneration.internal.ISqlServerValueGeneratorCache;
import microsoft.entityframeworkcore.sqlserver.valuegeneration.internal.ISqlServerValueGeneratorCacheImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.SqlServer.ValueGeneration.Internal.SqlServerValueGeneratorSelector, Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServer.ValueGeneration.Internal.SqlServerValueGeneratorSelector" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServer.ValueGeneration.Internal.SqlServerValueGeneratorSelector</a>
 */
public class SqlServerValueGeneratorSelector extends RelationalValueGeneratorSelector  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.SqlServer
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.SqlServer";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.SqlServer.ValueGeneration.Internal.SqlServerValueGeneratorSelector
     */
    public static final String className = "Microsoft.EntityFrameworkCore.SqlServer.ValueGeneration.Internal.SqlServerValueGeneratorSelector";
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
    public SqlServerValueGeneratorSelector(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlServerValueGeneratorSelector}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlServerValueGeneratorSelector} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlServerValueGeneratorSelector cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlServerValueGeneratorSelector(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlServerValueGeneratorSelector() throws Throwable {
    }

    public SqlServerValueGeneratorSelector(ValueGeneratorSelectorDependencies dependencies, ISqlServerSequenceValueGeneratorFactory sequenceFactory, ISqlServerConnection connection, IRawSqlCommandBuilder rawSqlCommandBuilder, IRelationalCommandDiagnosticsLogger commandLogger) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance(), sequenceFactory == null ? null : sequenceFactory.getJCOInstance(), connection == null ? null : connection.getJCOInstance(), rawSqlCommandBuilder == null ? null : rawSqlCommandBuilder.getJCOInstance(), commandLogger == null ? null : commandLogger.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ValueGenerator Create(IProperty property, IEntityType entityType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", property == null ? null : property.getJCOInstance(), entityType == null ? null : entityType.getJCOInstance());
            return new ValueGenerator(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueGenerator Select(IProperty property, IEntityType entityType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelect = (JCObject)classInstance.Invoke("Select", property == null ? null : property.getJCOInstance(), entityType == null ? null : entityType.getJCOInstance());
            return new ValueGenerator(objSelect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ISqlServerValueGeneratorCache getCacheNewSqlServerValueGeneratorSelector() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Cache");
            return new ISqlServerValueGeneratorCacheImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}