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

package microsoft.identity.client;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.identity.client.LogLevel;
import microsoft.identity.client.ILogCallback;
/**
 * The base .NET class managing Microsoft.Identity.Client.LogCallback, Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.LogCallback" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.LogCallback</a>
 */
public class LogCallback extends JCVoidDelegate implements IJCVoidEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client";
    /**
     * Qualified class name: Microsoft.Identity.Client.LogCallback
     */
    public static final String className = "Microsoft.Identity.Client.LogCallback";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    ILogCallback callerInstance = null;

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

    public final void EventRaised(java.lang.Object... argsFromJCOBridge) {
        try
        {
            LogLevel level = argsFromJCOBridge[0] == null ? null : new LogLevel(argsFromJCOBridge[0]);
            java.lang.String message = argsFromJCOBridge[1] == null ? null : (java.lang.String)argsFromJCOBridge[1];
            boolean containsPii = argsFromJCOBridge[2] == null ? null : (boolean)argsFromJCOBridge[2];


            if (callerInstance != null)	{
                callerInstance.Invoke(level, message, containsPii);
            } else {
                Invoke(level, message, containsPii);
            }
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
        }
    }

    public final void DelegateInvoked(java.lang.Object... argsFromJCOBridge) {
        try
        {
            LogLevel level = argsFromJCOBridge[0] == null ? null : new LogLevel(argsFromJCOBridge[0]);
            java.lang.String message = argsFromJCOBridge[1] == null ? null : (java.lang.String)argsFromJCOBridge[1];
            boolean containsPii = argsFromJCOBridge[2] == null ? null : (boolean)argsFromJCOBridge[2];


            if (callerInstance != null)	{
                callerInstance.Invoke(level, message, containsPii);
            } else {
                Invoke(level, message, containsPii);
            }
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
        }
    }

    public LogCallback() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public LogCallback(ILogCallback instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public LogCallback(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof ILogCallback) {
            callerInstance = (ILogCallback) instance;
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

    public void DynamicInvoke(LogLevel level, java.lang.String message, boolean containsPii) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DynamicInvoke", level == null ? null : level.getJCOInstance(), message, containsPii);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public void Invoke(LogLevel level, java.lang.String message, boolean containsPii) {
    }
}