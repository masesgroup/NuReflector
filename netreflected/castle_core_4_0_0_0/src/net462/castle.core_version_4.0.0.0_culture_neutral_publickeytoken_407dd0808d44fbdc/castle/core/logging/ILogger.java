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

package castle.core.logging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import castle.core.logging.ILogger;
import castle.core.logging.ILoggerImplementation;
import system.IFormatProvider;
import system.IFormatProviderImplementation;


/**
 * The base .NET class managing Castle.Core.Logging.ILogger, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Core.Logging.ILogger" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Core.Logging.ILogger</a>
 */
public interface ILogger extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Core.Logging.ILogger
     */
    public static final String className = "Castle.Core.Logging.ILogger";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ILogger}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ILogger} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ILogger ToILogger(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ILoggerImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public ILogger CreateChildLogger(java.lang.String loggerName) throws Throwable;

    public void Debug(java.lang.String message) throws Throwable;

    public void Debug(java.lang.String message, NetException exception) throws Throwable;

    public void DebugFormat(NetException exception, IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void DebugFormat(NetException exception, java.lang.String format, NetObject... args) throws Throwable;

    public void DebugFormat(IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void DebugFormat(java.lang.String format, NetObject... args) throws Throwable;

    public void Error(java.lang.String message) throws Throwable;

    public void Error(java.lang.String message, NetException exception) throws Throwable;

    public void ErrorFormat(NetException exception, IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void ErrorFormat(NetException exception, java.lang.String format, NetObject... args) throws Throwable;

    public void ErrorFormat(IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void ErrorFormat(java.lang.String format, NetObject... args) throws Throwable;

    public void Fatal(java.lang.String message) throws Throwable;

    public void Fatal(java.lang.String message, NetException exception) throws Throwable;

    public void FatalFormat(NetException exception, IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void FatalFormat(NetException exception, java.lang.String format, NetObject... args) throws Throwable;

    public void FatalFormat(IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void FatalFormat(java.lang.String format, NetObject... args) throws Throwable;

    public void Info(java.lang.String message) throws Throwable;

    public void Info(java.lang.String message, NetException exception) throws Throwable;

    public void InfoFormat(NetException exception, IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void InfoFormat(NetException exception, java.lang.String format, NetObject... args) throws Throwable;

    public void InfoFormat(IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void InfoFormat(java.lang.String format, NetObject... args) throws Throwable;

    public void Warn(java.lang.String message) throws Throwable;

    public void Warn(java.lang.String message, NetException exception) throws Throwable;

    public void WarnFormat(NetException exception, IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void WarnFormat(NetException exception, java.lang.String format, NetObject... args) throws Throwable;

    public void WarnFormat(IFormatProvider formatProvider, java.lang.String format, NetObject... args) throws Throwable;

    public void WarnFormat(java.lang.String format, NetObject... args) throws Throwable;


    
    // Properties section
    
    public boolean getIsDebugEnabled() throws Throwable;

    public boolean getIsErrorEnabled() throws Throwable;

    public boolean getIsFatalEnabled() throws Throwable;

    public boolean getIsInfoEnabled() throws Throwable;

    public boolean getIsWarnEnabled() throws Throwable;



    // Instance Events section
    

}