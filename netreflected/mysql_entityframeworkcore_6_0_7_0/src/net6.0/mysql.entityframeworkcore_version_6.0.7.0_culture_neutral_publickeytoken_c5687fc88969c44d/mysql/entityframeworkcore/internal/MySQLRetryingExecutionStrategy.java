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

package mysql.entityframeworkcore.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.storage.ExecutionStrategy;
import microsoft.entityframeworkcore.DbContext;
import system.TimeSpan;
import microsoft.entityframeworkcore.storage.ExecutionStrategyDependencies;


/**
 * The base .NET class managing MySql.EntityFrameworkCore.Internal.MySQLRetryingExecutionStrategy, MySql.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySql.EntityFrameworkCore.Internal.MySQLRetryingExecutionStrategy" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySql.EntityFrameworkCore.Internal.MySQLRetryingExecutionStrategy</a>
 */
public class MySQLRetryingExecutionStrategy extends ExecutionStrategy  {
    /**
     * Fully assembly qualified name: MySql.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.EntityFrameworkCore
     */
    public static final String assemblyShortName = "MySql.EntityFrameworkCore";
    /**
     * Qualified class name: MySql.EntityFrameworkCore.Internal.MySQLRetryingExecutionStrategy
     */
    public static final String className = "MySql.EntityFrameworkCore.Internal.MySQLRetryingExecutionStrategy";
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
    public MySQLRetryingExecutionStrategy(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySQLRetryingExecutionStrategy}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySQLRetryingExecutionStrategy} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySQLRetryingExecutionStrategy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySQLRetryingExecutionStrategy(from.getJCOInstance());
    }

    // Constructors section
    
    public MySQLRetryingExecutionStrategy() throws Throwable {
    }

    public MySQLRetryingExecutionStrategy(DbContext context, int maxRetryCount) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), maxRetryCount));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySQLRetryingExecutionStrategy(DbContext context) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySQLRetryingExecutionStrategy(ExecutionStrategyDependencies dependencies, int maxRetryCount) throws Throwable, system.OverflowException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance(), maxRetryCount));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySQLRetryingExecutionStrategy(ExecutionStrategyDependencies dependencies) throws Throwable, system.OverflowException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dependencies == null ? null : dependencies.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    


    // Instance Events section
    

}