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

package microsoft.entityframeworkcore.query;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.query.IQuerySqlGeneratorFactory;
import microsoft.entityframeworkcore.query.IQuerySqlGeneratorFactoryImplementation;
import microsoft.entityframeworkcore.query.ISqlExpressionFactory;
import microsoft.entityframeworkcore.query.ISqlExpressionFactoryImplementation;
import microsoft.entityframeworkcore.storage.IParameterNameGeneratorFactory;
import microsoft.entityframeworkcore.storage.IParameterNameGeneratorFactoryImplementation;
import microsoft.entityframeworkcore.query.IRelationalParameterBasedSqlProcessorFactory;
import microsoft.entityframeworkcore.query.IRelationalParameterBasedSqlProcessorFactoryImplementation;
import microsoft.entityframeworkcore.query.RelationalShapedQueryCompilingExpressionVisitorDependencies;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Query.RelationalShapedQueryCompilingExpressionVisitorDependencies, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.RelationalShapedQueryCompilingExpressionVisitorDependencies" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.RelationalShapedQueryCompilingExpressionVisitorDependencies</a>
 */
public class RelationalShapedQueryCompilingExpressionVisitorDependencies extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Query.RelationalShapedQueryCompilingExpressionVisitorDependencies
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Query.RelationalShapedQueryCompilingExpressionVisitorDependencies";
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
    public RelationalShapedQueryCompilingExpressionVisitorDependencies(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalShapedQueryCompilingExpressionVisitorDependencies}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalShapedQueryCompilingExpressionVisitorDependencies} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalShapedQueryCompilingExpressionVisitorDependencies cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalShapedQueryCompilingExpressionVisitorDependencies(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalShapedQueryCompilingExpressionVisitorDependencies() throws Throwable {
    }

    public RelationalShapedQueryCompilingExpressionVisitorDependencies(IQuerySqlGeneratorFactory querySqlGeneratorFactory, ISqlExpressionFactory sqlExpressionFactory, IParameterNameGeneratorFactory parameterNameGeneratorFactory, IRelationalParameterBasedSqlProcessorFactory relationalParameterBasedSqlProcessorFactory) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(querySqlGeneratorFactory == null ? null : querySqlGeneratorFactory.getJCOInstance(), sqlExpressionFactory == null ? null : sqlExpressionFactory.getJCOInstance(), parameterNameGeneratorFactory == null ? null : parameterNameGeneratorFactory.getJCOInstance(), relationalParameterBasedSqlProcessorFactory == null ? null : relationalParameterBasedSqlProcessorFactory.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(RelationalShapedQueryCompilingExpressionVisitorDependencies other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalShapedQueryCompilingExpressionVisitorDependencies <Clone>$() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject obj<Clone>$ = (JCObject)classInstance.Invoke("<Clone>$");
            return new RelationalShapedQueryCompilingExpressionVisitorDependencies(obj<Clone>$);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IQuerySqlGeneratorFactory getQuerySqlGeneratorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QuerySqlGeneratorFactory");
            return new IQuerySqlGeneratorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQuerySqlGeneratorFactory(IQuerySqlGeneratorFactory QuerySqlGeneratorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QuerySqlGeneratorFactory", QuerySqlGeneratorFactory == null ? null : QuerySqlGeneratorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRelationalParameterBasedSqlProcessorFactory getRelationalParameterBasedSqlProcessorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RelationalParameterBasedSqlProcessorFactory");
            return new IRelationalParameterBasedSqlProcessorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRelationalParameterBasedSqlProcessorFactory(IRelationalParameterBasedSqlProcessorFactory RelationalParameterBasedSqlProcessorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RelationalParameterBasedSqlProcessorFactory", RelationalParameterBasedSqlProcessorFactory == null ? null : RelationalParameterBasedSqlProcessorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISqlExpressionFactory getSqlExpressionFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SqlExpressionFactory");
            return new ISqlExpressionFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSqlExpressionFactory(ISqlExpressionFactory SqlExpressionFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SqlExpressionFactory", SqlExpressionFactory == null ? null : SqlExpressionFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IParameterNameGeneratorFactory getParameterNameGeneratorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ParameterNameGeneratorFactory");
            return new IParameterNameGeneratorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParameterNameGeneratorFactory(IParameterNameGeneratorFactory ParameterNameGeneratorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ParameterNameGeneratorFactory", ParameterNameGeneratorFactory == null ? null : ParameterNameGeneratorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}