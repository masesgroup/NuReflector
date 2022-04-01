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

package microsoft.entityframeworkcore.metadata.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.metadata.ISkipNavigation;
import microsoft.entityframeworkcore.metadata.ISkipNavigationImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlySkipNavigation;
import microsoft.entityframeworkcore.metadata.IReadOnlySkipNavigationImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigationBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyNavigationBaseImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.INavigationBase;
import microsoft.entityframeworkcore.metadata.INavigationBaseImplementation;
import microsoft.entityframeworkcore.metadata.IPropertyBase;
import microsoft.entityframeworkcore.metadata.IPropertyBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IAnnotatableImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.internal.ICollectionLoader;
import microsoft.entityframeworkcore.internal.ICollectionLoaderImplementation;
import microsoft.entityframeworkcore.metadata.IClrCollectionAccessor;
import microsoft.entityframeworkcore.metadata.IClrCollectionAccessorImplementation;
import microsoft.entityframeworkcore.metadata.IClrPropertyGetter;
import microsoft.entityframeworkcore.metadata.IClrPropertyGetterImplementation;
import microsoft.entityframeworkcore.PropertyAccessMode;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.IEntityType;
import microsoft.entityframeworkcore.metadata.IEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IForeignKey;
import microsoft.entityframeworkcore.metadata.IForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBaseImplementation;
import system.reflection.FieldInfo;
import system.reflection.PropertyInfo;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeSkipNavigation, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeSkipNavigation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeSkipNavigation</a>
 */
public interface IRuntimeSkipNavigation extends IJCOBridgeReflected, ISkipNavigation, IReadOnlySkipNavigation, IReadOnlyNavigationBase, IReadOnlyPropertyBase, IReadOnlyAnnotatable, INavigationBase, IPropertyBase, IAnnotatable {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeSkipNavigation
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.IRuntimeSkipNavigation";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRuntimeSkipNavigation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRuntimeSkipNavigation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRuntimeSkipNavigation ToIRuntimeSkipNavigation(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IRuntimeSkipNavigationImplementation(from.getJCOInstance());
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
    









    public ICollectionLoader GetManyToManyLoader() throws Throwable;











    
    // Properties section
    


    // Instance Events section
    

}