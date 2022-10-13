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

package pomelo.entityframeworkcore.mysql.storage.valuecomparison.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.changetracking.ValueComparer;
import pomelo.entityframeworkcore.mysql.storage.internal.MySqlJsonChangeTrackingOptions;


/**
 * The base .NET class managing Pomelo.EntityFrameworkCore.MySql.Storage.ValueComparison.Internal.IMySqlJsonValueComparer, Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Storage.ValueComparison.Internal.IMySqlJsonValueComparer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Storage.ValueComparison.Internal.IMySqlJsonValueComparer</a>
 */
public interface IMySqlJsonValueComparer extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b
     */
    public static final String assemblyFullName = "Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b";
    /**
     * Assembly name: Pomelo.EntityFrameworkCore.MySql
     */
    public static final String assemblyShortName = "Pomelo.EntityFrameworkCore.MySql";
    /**
     * Qualified class name: Pomelo.EntityFrameworkCore.MySql.Storage.ValueComparison.Internal.IMySqlJsonValueComparer
     */
    public static final String className = "Pomelo.EntityFrameworkCore.MySql.Storage.ValueComparison.Internal.IMySqlJsonValueComparer";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IMySqlJsonValueComparer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IMySqlJsonValueComparer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IMySqlJsonValueComparer ToIMySqlJsonValueComparer(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IMySqlJsonValueComparerImplementation(from.getJCOInstance());
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
    
    public ValueComparer Clone(MySqlJsonChangeTrackingOptions options) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}