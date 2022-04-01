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

package microsoft.entityframeworkcore.update.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.update.internal.IKeyValueIndex;
import microsoft.entityframeworkcore.update.internal.IKeyValueIndexImplementation;
import microsoft.entityframeworkcore.update.IUpdateEntry;
import microsoft.entityframeworkcore.update.IUpdateEntryImplementation;
import microsoft.entityframeworkcore.metadata.IForeignKey;
import microsoft.entityframeworkcore.metadata.IForeignKeyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Update.Internal.IKeyValueIndexFactory, Microsoft.EntityFrameworkCore.Relational, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Update.Internal.IKeyValueIndexFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Update.Internal.IKeyValueIndexFactory</a>
 */
public interface IKeyValueIndexFactory extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Update.Internal.IKeyValueIndexFactory
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Update.Internal.IKeyValueIndexFactory";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IKeyValueIndexFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IKeyValueIndexFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IKeyValueIndexFactory ToIKeyValueIndexFactory(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore.Relational, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IKeyValueIndexFactoryImplementation(from.getJCOInstance());
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
    
    public IKeyValueIndex CreateDependentKeyValue(IUpdateEntry entry, IForeignKey foreignKey) throws Throwable;

    public IKeyValueIndex CreateDependentKeyValueFromOriginalValues(IUpdateEntry entry, IForeignKey foreignKey) throws Throwable;

    public IKeyValueIndex CreatePrincipalKeyValue(IUpdateEntry entry, IForeignKey foreignKey) throws Throwable;

    public IKeyValueIndex CreatePrincipalKeyValueFromOriginalValues(IUpdateEntry entry, IForeignKey foreignKey) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}