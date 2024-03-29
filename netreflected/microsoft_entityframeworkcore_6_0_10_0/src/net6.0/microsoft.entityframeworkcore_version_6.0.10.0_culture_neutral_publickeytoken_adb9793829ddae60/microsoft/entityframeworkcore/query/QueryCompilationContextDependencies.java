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
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.query.IQueryTranslationPreprocessorFactory;
import microsoft.entityframeworkcore.query.IQueryTranslationPreprocessorFactoryImplementation;
import microsoft.entityframeworkcore.query.IQueryableMethodTranslatingExpressionVisitorFactory;
import microsoft.entityframeworkcore.query.IQueryableMethodTranslatingExpressionVisitorFactoryImplementation;
import microsoft.entityframeworkcore.query.IQueryTranslationPostprocessorFactory;
import microsoft.entityframeworkcore.query.IQueryTranslationPostprocessorFactoryImplementation;
import microsoft.entityframeworkcore.query.IShapedQueryCompilingExpressionVisitorFactory;
import microsoft.entityframeworkcore.query.IShapedQueryCompilingExpressionVisitorFactoryImplementation;
import microsoft.entityframeworkcore.storage.IExecutionStrategy;
import microsoft.entityframeworkcore.storage.IExecutionStrategyImplementation;
import microsoft.entityframeworkcore.infrastructure.ICurrentDbContext;
import microsoft.entityframeworkcore.infrastructure.ICurrentDbContextImplementation;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptions;
import microsoft.entityframeworkcore.infrastructure.IDbContextOptionsImplementation;
import microsoft.entityframeworkcore.query.QueryCompilationContextDependencies;
import microsoft.entityframeworkcore.QueryTrackingBehavior;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Query.QueryCompilationContextDependencies, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.QueryCompilationContextDependencies" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.QueryCompilationContextDependencies</a>
 */
public class QueryCompilationContextDependencies extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Query.QueryCompilationContextDependencies
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Query.QueryCompilationContextDependencies";
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
    public QueryCompilationContextDependencies(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link QueryCompilationContextDependencies}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link QueryCompilationContextDependencies} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static QueryCompilationContextDependencies cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new QueryCompilationContextDependencies(from.getJCOInstance());
    }

    // Constructors section
    
    public QueryCompilationContextDependencies() throws Throwable {
    }



    
    // Methods section
    
    public boolean Equals(QueryCompilationContextDependencies other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public QueryCompilationContextDependencies <Clone>$() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject obj<Clone>$ = (JCObject)classInstance.Invoke("<Clone>$");
            return new QueryCompilationContextDependencies(obj<Clone>$);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsRetryingExecutionStrategy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRetryingExecutionStrategy");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsRetryingExecutionStrategy(boolean IsRetryingExecutionStrategy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsRetryingExecutionStrategy", IsRetryingExecutionStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDbContextOptions getContextOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContextOptions");
            return new IDbContextOptionsImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextOptions(IDbContextOptions ContextOptions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ContextOptions", ContextOptions == null ? null : ContextOptions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IModel getModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new IModelImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModel(IModel Model) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Model", Model == null ? null : Model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IQueryableMethodTranslatingExpressionVisitorFactory getQueryableMethodTranslatingExpressionVisitorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QueryableMethodTranslatingExpressionVisitorFactory");
            return new IQueryableMethodTranslatingExpressionVisitorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQueryableMethodTranslatingExpressionVisitorFactory(IQueryableMethodTranslatingExpressionVisitorFactory QueryableMethodTranslatingExpressionVisitorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QueryableMethodTranslatingExpressionVisitorFactory", QueryableMethodTranslatingExpressionVisitorFactory == null ? null : QueryableMethodTranslatingExpressionVisitorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IQueryTranslationPostprocessorFactory getQueryTranslationPostprocessorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QueryTranslationPostprocessorFactory");
            return new IQueryTranslationPostprocessorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQueryTranslationPostprocessorFactory(IQueryTranslationPostprocessorFactory QueryTranslationPostprocessorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QueryTranslationPostprocessorFactory", QueryTranslationPostprocessorFactory == null ? null : QueryTranslationPostprocessorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IQueryTranslationPreprocessorFactory getQueryTranslationPreprocessorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QueryTranslationPreprocessorFactory");
            return new IQueryTranslationPreprocessorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQueryTranslationPreprocessorFactory(IQueryTranslationPreprocessorFactory QueryTranslationPreprocessorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QueryTranslationPreprocessorFactory", QueryTranslationPreprocessorFactory == null ? null : QueryTranslationPreprocessorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IShapedQueryCompilingExpressionVisitorFactory getShapedQueryCompilingExpressionVisitorFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ShapedQueryCompilingExpressionVisitorFactory");
            return new IShapedQueryCompilingExpressionVisitorFactoryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShapedQueryCompilingExpressionVisitorFactory(IShapedQueryCompilingExpressionVisitorFactory ShapedQueryCompilingExpressionVisitorFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShapedQueryCompilingExpressionVisitorFactory", ShapedQueryCompilingExpressionVisitorFactory == null ? null : ShapedQueryCompilingExpressionVisitorFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public QueryTrackingBehavior getQueryTrackingBehavior() throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ObjectDisposedException, system.AggregateException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.reflection.AmbiguousMatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("QueryTrackingBehavior");
            return new QueryTrackingBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getContextType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContextType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}