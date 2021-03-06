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

package microsoft.aspnetcore.http;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.tasks.Task;
import microsoft.aspnetcore.http.HttpContext;
import microsoft.aspnetcore.http.IRequestDelegate;
/**
 * The base .NET class managing Microsoft.AspNetCore.Http.RequestDelegate, Microsoft.AspNetCore.Http.Abstractions, Version=2.2.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60. Extends {@link JCDelegate}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Http.RequestDelegate" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.AspNetCore.Http.RequestDelegate</a>
 */
public class RequestDelegate extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.AspNetCore.Http.Abstractions, Version=2.2.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.AspNetCore.Http.Abstractions, Version=2.2.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.AspNetCore.Http.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.AspNetCore.Http.Abstractions";
    /**
     * Qualified class name: Microsoft.AspNetCore.Http.RequestDelegate
     */
    public static final String className = "Microsoft.AspNetCore.Http.RequestDelegate";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IRequestDelegate callerInstance = null;

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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final java.lang.Object EventRaised(java.lang.Object... argsFromJCOBridge) {
        try
        {
            HttpContext context = argsFromJCOBridge[0] == null ? null : new HttpContext(argsFromJCOBridge[0]);


            Task retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(context);
            } else {
                retVal = Invoke(context);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public final java.lang.Object DelegateInvoked(java.lang.Object... argsFromJCOBridge) {
        try
        {
            HttpContext context = argsFromJCOBridge[0] == null ? null : new HttpContext(argsFromJCOBridge[0]);


            Task retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(context);
            } else {
                retVal = Invoke(context);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public RequestDelegate() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public RequestDelegate(IRequestDelegate instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public RequestDelegate(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IRequestDelegate) {
            callerInstance = (IRequestDelegate) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> java.lang.Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public Task DynamicInvoke(HttpContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDynamicInvoke = (JCObject)classInstance.Invoke("DynamicInvoke", context == null ? null : context.getJCOInstance());
            return new Task(objDynamicInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public Task Invoke(HttpContext context) {
        return null;
    }
}