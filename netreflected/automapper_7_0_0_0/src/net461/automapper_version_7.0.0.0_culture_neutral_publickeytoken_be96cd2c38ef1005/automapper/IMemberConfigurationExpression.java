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

package automapper;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section


/**
 * The base .NET class managing AutoMapper.IMemberConfigurationExpression, AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.IMemberConfigurationExpression" target="_top">https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.IMemberConfigurationExpression</a>
 */
public interface IMemberConfigurationExpression extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005
     */
    public static final String assemblyFullName = "AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005";
    /**
     * Assembly name: AutoMapper
     */
    public static final String assemblyShortName = "AutoMapper";
    /**
     * Qualified class name: AutoMapper.IMemberConfigurationExpression
     */
    public static final String className = "AutoMapper.IMemberConfigurationExpression";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IMemberConfigurationExpression}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IMemberConfigurationExpression} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IMemberConfigurationExpression ToIMemberConfigurationExpression(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IMemberConfigurationExpressionImplementation(from.getJCOInstance());
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
    
    public void ResolveUsing(NetType valueResolverType) throws Throwable;

    public void ResolveUsing(NetType valueResolverType, java.lang.String memberName) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}