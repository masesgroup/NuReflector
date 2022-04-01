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

package castle.dynamicproxy.generators;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import castle.dynamicproxy.generators.emitters.ConstructorEmitter;
import castle.dynamicproxy.generators.emitters.simpleast.ArgumentReference;
import castle.dynamicproxy.generators.emitters.AbstractTypeEmitter;
import castle.dynamicproxy.generators.emitters.simpleast.Expression;
import castle.dynamicproxy.generators.emitters.ClassEmitter;
import castle.dynamicproxy.generators.emitters.simpleast.MethodInvocationExpression;
import castle.dynamicproxy.generators.emitters.simpleast.Reference;
import castle.dynamicproxy.generators.emitters.MethodEmitter;
import system.reflection.MethodInfo;


/**
 * The base .NET class managing Castle.DynamicProxy.Generators.IInvocationCreationContributor, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.IInvocationCreationContributor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.DynamicProxy.Generators.IInvocationCreationContributor</a>
 */
public class IInvocationCreationContributorImplementation extends NetObject implements IInvocationCreationContributor {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.DynamicProxy.Generators.IInvocationCreationContributor
     */
    public static final String className = "Castle.DynamicProxy.Generators.IInvocationCreationContributor";
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
    public IInvocationCreationContributorImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IInvocationCreationContributor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IInvocationCreationContributor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IInvocationCreationContributor ToIInvocationCreationContributor(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IInvocationCreationContributorImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ConstructorEmitter CreateConstructor(ArgumentReference[] baseCtorArguments, AbstractTypeEmitter invocation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateConstructor = (JCObject)classInstance.Invoke("CreateConstructor", toObjectFromArray(baseCtorArguments), invocation == null ? null : invocation.getJCOInstance());
            return new ConstructorEmitter(objCreateConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression[] GetConstructorInvocationArguments(Expression[] arguments, ClassEmitter proxy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Expression> resultingArrayList = new ArrayList<Expression>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetConstructorInvocationArguments", toObjectFromArray(arguments), proxy == null ? null : proxy.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Expression(resultingObject));
            }
            Expression[] resultingArray = new Expression[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInvocationExpression GetCallbackMethodInvocation(AbstractTypeEmitter invocation, Expression[] args, Reference targetField, MethodEmitter invokeMethodOnTarget) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCallbackMethodInvocation = (JCObject)classInstance.Invoke("GetCallbackMethodInvocation", invocation == null ? null : invocation.getJCOInstance(), toObjectFromArray(args), targetField == null ? null : targetField.getJCOInstance(), invokeMethodOnTarget == null ? null : invokeMethodOnTarget.getJCOInstance());
            return new MethodInvocationExpression(objGetCallbackMethodInvocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetCallbackMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCallbackMethod = (JCObject)classInstance.Invoke("GetCallbackMethod");
            return new MethodInfo(objGetCallbackMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}