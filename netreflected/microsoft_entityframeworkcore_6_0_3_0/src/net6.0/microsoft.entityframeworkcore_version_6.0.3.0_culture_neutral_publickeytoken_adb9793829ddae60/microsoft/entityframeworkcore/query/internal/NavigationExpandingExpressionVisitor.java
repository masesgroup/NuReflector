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

package microsoft.entityframeworkcore.query.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.expressions.ExpressionVisitor;
import microsoft.entityframeworkcore.query.QueryTranslationPreprocessor;
import microsoft.entityframeworkcore.query.QueryCompilationContext;
import microsoft.entityframeworkcore.query.IEvaluatableExpressionFilter;
import microsoft.entityframeworkcore.query.IEvaluatableExpressionFilterImplementation;
import microsoft.entityframeworkcore.query.INavigationExpansionExtensibilityHelper;
import microsoft.entityframeworkcore.query.INavigationExpansionExtensibilityHelperImplementation;
import system.linq.expressions.Expression;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Query.Internal.NavigationExpandingExpressionVisitor, Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.Internal.NavigationExpandingExpressionVisitor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Query.Internal.NavigationExpandingExpressionVisitor</a>
 */
public class NavigationExpandingExpressionVisitor extends ExpressionVisitor  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Query.Internal.NavigationExpandingExpressionVisitor
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Query.Internal.NavigationExpandingExpressionVisitor";
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
    public NavigationExpandingExpressionVisitor(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NavigationExpandingExpressionVisitor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NavigationExpandingExpressionVisitor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NavigationExpandingExpressionVisitor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NavigationExpandingExpressionVisitor(from.getJCOInstance());
    }

    // Constructors section
    
    public NavigationExpandingExpressionVisitor() throws Throwable {
    }

    public NavigationExpandingExpressionVisitor(QueryTranslationPreprocessor queryTranslationPreprocessor, QueryCompilationContext queryCompilationContext, IEvaluatableExpressionFilter evaluatableExpressionFilter, INavigationExpansionExtensibilityHelper extensibilityHelper) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(queryTranslationPreprocessor == null ? null : queryTranslationPreprocessor.getJCOInstance(), queryCompilationContext == null ? null : queryCompilationContext.getJCOInstance(), evaluatableExpressionFilter == null ? null : evaluatableExpressionFilter.getJCOInstance(), extensibilityHelper == null ? null : extensibilityHelper.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Expression Expand(Expression query) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExpand = (JCObject)classInstance.Invoke("Expand", query == null ? null : query.getJCOInstance());
            return new Expression(objExpand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}