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

package microsoft.entityframeworkcore.inmemory.query.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.expressions.Expression;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.query.EntityShaperExpression;
import microsoft.entityframeworkcore.inmemory.query.internal.EntityProjectionExpression;
import microsoft.entityframeworkcore.metadata.INavigation;
import microsoft.entityframeworkcore.metadata.INavigationImplementation;
import microsoft.entityframeworkcore.inmemory.query.internal.InMemoryQueryExpression;
import system.linq.expressions.LambdaExpression;
import microsoft.entityframeworkcore.query.GroupByShaperExpression;
import microsoft.entityframeworkcore.query.ShapedQueryExpression;
import microsoft.entityframeworkcore.query.ProjectionBindingExpression;
import system.reflection.MethodInfo;
import microsoft.entityframeworkcore.query.ExpressionPrinter;
import system.linq.expressions.ExpressionType;
import system.linq.expressions.ParameterExpression;
import microsoft.entityframeworkcore.query.IPrintableExpression;
import microsoft.entityframeworkcore.query.IPrintableExpressionImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.InMemory.Query.Internal.InMemoryQueryExpression, Microsoft.EntityFrameworkCore.InMemory, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.InMemory.Query.Internal.InMemoryQueryExpression" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.InMemory.Query.Internal.InMemoryQueryExpression</a>
 */
public class InMemoryQueryExpression extends Expression implements microsoft.entityframeworkcore.query.IPrintableExpression {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.InMemory, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.InMemory, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.InMemory
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.InMemory";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.InMemory.Query.Internal.InMemoryQueryExpression
     */
    public static final String className = "Microsoft.EntityFrameworkCore.InMemory.Query.Internal.InMemoryQueryExpression";
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
    public InMemoryQueryExpression(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link InMemoryQueryExpression}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link InMemoryQueryExpression} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static InMemoryQueryExpression cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InMemoryQueryExpression(from.getJCOInstance());
    }

    // Constructors section
    
    public InMemoryQueryExpression() throws Throwable {
    }

    public InMemoryQueryExpression(IEntityType entityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(entityType == null ? null : entityType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public EntityShaperExpression AddNavigationToWeakEntityType(EntityProjectionExpression entityProjectionExpression, INavigation navigation, InMemoryQueryExpression innerQueryExpression, LambdaExpression outerKeySelector, LambdaExpression innerKeySelector) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddNavigationToWeakEntityType = (JCObject)classInstance.Invoke("AddNavigationToWeakEntityType", entityProjectionExpression == null ? null : entityProjectionExpression.getJCOInstance(), navigation == null ? null : navigation.getJCOInstance(), innerQueryExpression == null ? null : innerQueryExpression.getJCOInstance(), outerKeySelector == null ? null : outerKeySelector.getJCOInstance(), innerKeySelector == null ? null : innerKeySelector.getJCOInstance());
            return new EntityShaperExpression(objAddNavigationToWeakEntityType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GroupByShaperExpression ApplyGrouping(Expression groupingKey, Expression shaperExpression, boolean defaultElementSelector) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objApplyGrouping = (JCObject)classInstance.Invoke("ApplyGrouping", groupingKey == null ? null : groupingKey.getJCOInstance(), shaperExpression == null ? null : shaperExpression.getJCOInstance(), defaultElementSelector);
            return new GroupByShaperExpression(objApplyGrouping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ShapedQueryExpression Clone(Expression shaperExpression) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone", shaperExpression == null ? null : shaperExpression.getJCOInstance());
            return new ShapedQueryExpression(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression AddInnerJoin(InMemoryQueryExpression innerQueryExpression, LambdaExpression outerKeySelector, LambdaExpression innerKeySelector, Expression outerShaperExpression, Expression innerShaperExpression) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddInnerJoin = (JCObject)classInstance.Invoke("AddInnerJoin", innerQueryExpression == null ? null : innerQueryExpression.getJCOInstance(), outerKeySelector == null ? null : outerKeySelector.getJCOInstance(), innerKeySelector == null ? null : innerKeySelector.getJCOInstance(), outerShaperExpression == null ? null : outerShaperExpression.getJCOInstance(), innerShaperExpression == null ? null : innerShaperExpression.getJCOInstance());
            return new Expression(objAddInnerJoin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression AddLeftJoin(InMemoryQueryExpression innerQueryExpression, LambdaExpression outerKeySelector, LambdaExpression innerKeySelector, Expression outerShaperExpression, Expression innerShaperExpression) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddLeftJoin = (JCObject)classInstance.Invoke("AddLeftJoin", innerQueryExpression == null ? null : innerQueryExpression.getJCOInstance(), outerKeySelector == null ? null : outerKeySelector.getJCOInstance(), innerKeySelector == null ? null : innerKeySelector.getJCOInstance(), outerShaperExpression == null ? null : outerShaperExpression.getJCOInstance(), innerShaperExpression == null ? null : innerShaperExpression.getJCOInstance());
            return new Expression(objAddLeftJoin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression AddSelectMany(InMemoryQueryExpression innerQueryExpression, Expression outerShaperExpression, Expression innerShaperExpression, boolean innerNullable) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddSelectMany = (JCObject)classInstance.Invoke("AddSelectMany", innerQueryExpression == null ? null : innerQueryExpression.getJCOInstance(), outerShaperExpression == null ? null : outerShaperExpression.getJCOInstance(), innerShaperExpression == null ? null : innerShaperExpression.getJCOInstance(), innerNullable);
            return new Expression(objAddSelectMany);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression GetProjection(ProjectionBindingExpression projectionBindingExpression) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProjection = (JCObject)classInstance.Invoke("GetProjection", projectionBindingExpression == null ? null : projectionBindingExpression.getJCOInstance());
            return new Expression(objGetProjection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression GetSingleScalarProjection() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSingleScalarProjection = (JCObject)classInstance.Invoke("GetSingleScalarProjection");
            return new Expression(objGetSingleScalarProjection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyDefaultIfEmpty() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.RankException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyDefaultIfEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyDistinct() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyDistinct");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyProjection() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyProjection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplySetOperation(MethodInfo setOperationMethodInfo, InMemoryQueryExpression source2) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplySetOperation", setOperationMethodInfo == null ? null : setOperationMethodInfo.getJCOInstance(), source2 == null ? null : source2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConvertToSingleResult(MethodInfo methodInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConvertToSingleResult", methodInfo == null ? null : methodInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateServerQueryExpression(Expression serverQueryExpression) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateServerQueryExpression", serverQueryExpression == null ? null : serverQueryExpression.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIPrintableExpression method available in IPrintableExpression to obtain an object with an invocable method
     */
    @Deprecated 
    public void Print(ExpressionPrinter expressionPrinter) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIPrintableExpression to obtain the full interface.");
    }


    
    // Properties section
    
    public Expression getServerQueryExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerQueryExpression");
            return new Expression(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerQueryExpression(Expression ServerQueryExpression) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerQueryExpression", ServerQueryExpression == null ? null : ServerQueryExpression.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterExpression getCurrentParameter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentParameter");
            return new ParameterExpression(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}