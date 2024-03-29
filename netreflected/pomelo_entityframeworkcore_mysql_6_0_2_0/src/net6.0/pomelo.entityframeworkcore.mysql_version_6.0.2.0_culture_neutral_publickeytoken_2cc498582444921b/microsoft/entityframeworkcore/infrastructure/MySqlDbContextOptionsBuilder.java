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

package microsoft.entityframeworkcore.infrastructure;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.DbContextOptionsBuilder;
import microsoft.entityframeworkcore.infrastructure.MySqlDbContextOptionsBuilder;
import pomelo.entityframeworkcore.mysql.infrastructure.CharSet;
import system.TimeSpan;
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlSchemaBehavior;
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlSchemaNameTranslator;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Infrastructure.MySqlDbContextOptionsBuilder, Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.MySqlDbContextOptionsBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Infrastructure.MySqlDbContextOptionsBuilder</a>
 */
public class MySqlDbContextOptionsBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b
     */
    public static final String assemblyFullName = "Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b";
    /**
     * Assembly name: Pomelo.EntityFrameworkCore.MySql
     */
    public static final String assemblyShortName = "Pomelo.EntityFrameworkCore.MySql";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Infrastructure.MySqlDbContextOptionsBuilder
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Infrastructure.MySqlDbContextOptionsBuilder";
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
    public MySqlDbContextOptionsBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySqlDbContextOptionsBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySqlDbContextOptionsBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySqlDbContextOptionsBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySqlDbContextOptionsBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public MySqlDbContextOptionsBuilder() throws Throwable {
    }

    public MySqlDbContextOptionsBuilder(DbContextOptionsBuilder optionsBuilder) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(optionsBuilder == null ? null : optionsBuilder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public MySqlDbContextOptionsBuilder CharSet(CharSet charSet) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCharSet = (JCObject)classInstance.Invoke("CharSet", charSet == null ? null : charSet.getJCOInstance());
            return new MySqlDbContextOptionsBuilder(objCharSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder DisableBackslashEscaping(boolean setSqlModeOnOpen) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDisableBackslashEscaping = (JCObject)classInstance.Invoke("DisableBackslashEscaping", setSqlModeOnOpen);
            return new MySqlDbContextOptionsBuilder(objDisableBackslashEscaping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder DisableLineBreakToCharSubstition() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDisableLineBreakToCharSubstition = (JCObject)classInstance.Invoke("DisableLineBreakToCharSubstition");
            return new MySqlDbContextOptionsBuilder(objDisableLineBreakToCharSubstition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder EnableIndexOptimizedBooleanColumns(boolean enable) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnableIndexOptimizedBooleanColumns = (JCObject)classInstance.Invoke("EnableIndexOptimizedBooleanColumns", enable);
            return new MySqlDbContextOptionsBuilder(objEnableIndexOptimizedBooleanColumns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder EnableRetryOnFailure() throws Throwable, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnableRetryOnFailure = (JCObject)classInstance.Invoke("EnableRetryOnFailure");
            return new MySqlDbContextOptionsBuilder(objEnableRetryOnFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder EnableRetryOnFailure(int maxRetryCount) throws Throwable, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnableRetryOnFailure = (JCObject)classInstance.Invoke("EnableRetryOnFailure", maxRetryCount);
            return new MySqlDbContextOptionsBuilder(objEnableRetryOnFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder EnableStringComparisonTranslations(boolean enable) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnableStringComparisonTranslations = (JCObject)classInstance.Invoke("EnableStringComparisonTranslations", enable);
            return new MySqlDbContextOptionsBuilder(objEnableStringComparisonTranslations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder LimitKeyedOrIndexedStringColumnLength(boolean enable) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLimitKeyedOrIndexedStringColumnLength = (JCObject)classInstance.Invoke("LimitKeyedOrIndexedStringColumnLength", enable);
            return new MySqlDbContextOptionsBuilder(objLimitKeyedOrIndexedStringColumnLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder SchemaBehavior(MySqlSchemaBehavior behavior, MySqlSchemaNameTranslator translator) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSchemaBehavior = (JCObject)classInstance.Invoke("SchemaBehavior", behavior == null ? null : behavior.getJCOInstance(), translator);
            return new MySqlDbContextOptionsBuilder(objSchemaBehavior);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDbContextOptionsBuilder SetSqlModeOnOpen() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetSqlModeOnOpen = (JCObject)classInstance.Invoke("SetSqlModeOnOpen");
            return new MySqlDbContextOptionsBuilder(objSetSqlModeOnOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}