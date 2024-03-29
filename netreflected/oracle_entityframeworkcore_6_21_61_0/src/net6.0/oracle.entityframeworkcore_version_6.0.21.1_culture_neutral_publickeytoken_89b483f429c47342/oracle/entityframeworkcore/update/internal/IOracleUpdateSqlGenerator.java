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

package oracle.entityframeworkcore.update.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.update.IUpdateSqlGenerator;
import microsoft.entityframeworkcore.update.IUpdateSqlGeneratorImplementation;
import microsoft.entityframeworkcore.update.ResultSetMapping;
import system.text.StringBuilder;
import microsoft.entityframeworkcore.update.IReadOnlyModificationCommand;
import microsoft.entityframeworkcore.update.IReadOnlyModificationCommandImplementation;


/**
 * The base .NET class managing Oracle.EntityFrameworkCore.Update.Internal.IOracleUpdateSqlGenerator, Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Oracle.EntityFrameworkCore.Update.Internal.IOracleUpdateSqlGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Oracle.EntityFrameworkCore.Update.Internal.IOracleUpdateSqlGenerator</a>
 */
public interface IOracleUpdateSqlGenerator extends IJCOBridgeReflected, IUpdateSqlGenerator {
    /**
     * Fully assembly qualified name: Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Oracle.EntityFrameworkCore";
    /**
     * Qualified class name: Oracle.EntityFrameworkCore.Update.Internal.IOracleUpdateSqlGenerator
     */
    public static final String className = "Oracle.EntityFrameworkCore.Update.Internal.IOracleUpdateSqlGenerator";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IOracleUpdateSqlGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IOracleUpdateSqlGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IOracleUpdateSqlGenerator ToIOracleUpdateSqlGenerator(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Oracle.EntityFrameworkCore, Version=6.0.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IOracleUpdateSqlGeneratorImplementation(from.getJCOInstance());
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
    


    // Instance Events section
    

}