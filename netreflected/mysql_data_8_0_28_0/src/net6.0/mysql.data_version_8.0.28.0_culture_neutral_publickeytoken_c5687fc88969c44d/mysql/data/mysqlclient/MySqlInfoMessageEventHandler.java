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

package mysql.data.mysqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mysql.data.mysqlclient.MySqlInfoMessageEventArgs;
import mysql.data.mysqlclient.IMySqlInfoMessageEventHandler;
/**
 * The base .NET class managing MySql.Data.MySqlClient.MySqlInfoMessageEventHandler, MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlInfoMessageEventHandler" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MySql.Data.MySqlClient.MySqlInfoMessageEventHandler</a>
 */
public class MySqlInfoMessageEventHandler extends JCVoidDelegate implements IJCVoidEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d
     */
    public static final String assemblyFullName = "MySql.Data, Version=8.0.28.0, Culture=neutral, PublicKeyToken=c5687fc88969c44d";
    /**
     * Assembly name: MySql.Data
     */
    public static final String assemblyShortName = "MySql.Data";
    /**
     * Qualified class name: MySql.Data.MySqlClient.MySqlInfoMessageEventHandler
     */
    public static final String className = "MySql.Data.MySqlClient.MySqlInfoMessageEventHandler";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IMySqlInfoMessageEventHandler callerInstance = null;

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
            NetObject sender = argsFromJCOBridge[0] == null ? null : new NetObject(argsFromJCOBridge[0]);
            MySqlInfoMessageEventArgs args = argsFromJCOBridge[1] == null ? null : new MySqlInfoMessageEventArgs(argsFromJCOBridge[1]);


            if (callerInstance != null)	{
                callerInstance.Invoke(sender, args);
            } else {
                Invoke(sender, args);
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
            NetObject sender = argsFromJCOBridge[0] == null ? null : new NetObject(argsFromJCOBridge[0]);
            MySqlInfoMessageEventArgs args = argsFromJCOBridge[1] == null ? null : new MySqlInfoMessageEventArgs(argsFromJCOBridge[1]);


            if (callerInstance != null)	{
                callerInstance.Invoke(sender, args);
            } else {
                Invoke(sender, args);
            }
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
        }
    }

    public MySqlInfoMessageEventHandler() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public MySqlInfoMessageEventHandler(IMySqlInfoMessageEventHandler instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public MySqlInfoMessageEventHandler(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IMySqlInfoMessageEventHandler) {
            callerInstance = (IMySqlInfoMessageEventHandler) instance;
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

    public void DynamicInvoke(NetObject sender, MySqlInfoMessageEventArgs args) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DynamicInvoke", sender == null ? null : sender.getJCOInstance(), args == null ? null : args.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public void Invoke(NetObject sender, MySqlInfoMessageEventArgs args) {
    }
}