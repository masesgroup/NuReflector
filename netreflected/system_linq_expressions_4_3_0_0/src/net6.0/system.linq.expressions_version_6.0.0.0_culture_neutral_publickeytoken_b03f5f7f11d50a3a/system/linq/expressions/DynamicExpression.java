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

package system.linq.expressions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.expressions.Expression;
import system.linq.expressions.DynamicExpression;
import system.runtime.compilerservices.CallSiteBinder;
import system.linq.expressions.ExpressionType;


/**
 * The base .NET class managing System.Linq.Expressions.DynamicExpression, System.Linq.Expressions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Linq.Expressions.DynamicExpression" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Linq.Expressions.DynamicExpression</a>
 */
public class DynamicExpression extends Expression  {
    /**
     * Fully assembly qualified name: System.Linq.Expressions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Linq.Expressions, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Linq.Expressions
     */
    public static final String assemblyShortName = "System.Linq.Expressions";
    /**
     * Qualified class name: System.Linq.Expressions.DynamicExpression
     */
    public static final String className = "System.Linq.Expressions.DynamicExpression";
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
    public DynamicExpression(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DynamicExpression}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DynamicExpression} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DynamicExpression cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DynamicExpression(from.getJCOInstance());
    }

    // Constructors section
    
    public DynamicExpression() throws Throwable {
    }



    
    // Methods section
    
    public static DynamicExpression DynamicNewDynamicExpression(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1, Expression arg2, Expression arg3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance(), arg3 == null ? null : arg3.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression DynamicNewDynamicExpression(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1, Expression arg2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression DynamicNewDynamicExpression(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression DynamicNewDynamicExpression(CallSiteBinder binder, NetType returnType, Expression arg0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression DynamicNewDynamicExpression(CallSiteBinder binder, NetType returnType, Expression... arguments) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(arguments));
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamicNewDynamicExpression(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1, Expression arg2, Expression arg3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance(), arg3 == null ? null : arg3.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamicNewDynamicExpression(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1, Expression arg2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamicNewDynamicExpression(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamicNewDynamicExpression(NetType delegateType, CallSiteBinder binder, Expression arg0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamicNewDynamicExpression(NetType delegateType, CallSiteBinder binder, Expression... arguments) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(arguments));
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression Reduce() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReduce = (JCObject)classInstance.Invoke("Reduce");
            return new Expression(objReduce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDynamicExpression method available in IDynamicExpression to obtain an object with an invocable method
     */
    @Deprecated 
    public Expression Rewrite(Expression[] args) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDynamicExpression to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDynamicExpression method available in IDynamicExpression to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject CreateCallSite() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDynamicExpression to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIArgumentProvider method available in IArgumentProvider to obtain an object with an invocable method
     */
    @Deprecated 
    public Expression GetArgument(int index) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIArgumentProvider to obtain the full interface.");
    }


    
    // Properties section
    
    public CallSiteBinder getBinder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Binder");
            return new CallSiteBinder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDelegateType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DelegateType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}