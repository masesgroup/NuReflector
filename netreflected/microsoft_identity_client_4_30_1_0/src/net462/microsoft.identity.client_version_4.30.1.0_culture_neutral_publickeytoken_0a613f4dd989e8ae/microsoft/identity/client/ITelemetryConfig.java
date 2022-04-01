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

// Import section
import microsoft.identity.client.TelemetryAudienceType;


/**
 * The base .NET class managing Microsoft.Identity.Client.ITelemetryConfig, Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.ITelemetryConfig" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Identity.Client.ITelemetryConfig</a>
 */
public interface ITelemetryConfig extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae
     */
    public static final String assemblyFullName = "Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae";
    /**
     * Assembly name: Microsoft.Identity.Client
     */
    public static final String assemblyShortName = "Microsoft.Identity.Client";
    /**
     * Qualified class name: Microsoft.Identity.Client.ITelemetryConfig
     */
    public static final String className = "Microsoft.Identity.Client.ITelemetryConfig";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ITelemetryConfig}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ITelemetryConfig} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ITelemetryConfig ToITelemetryConfig(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Identity.Client, Version=4.30.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ITelemetryConfigImplementation(from.getJCOInstance());
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
    

    
    // Properties section
    
    public TelemetryAudienceType getAudienceType() throws Throwable;

    public java.lang.String getSessionId() throws Throwable;



    // Instance Events section
    

}