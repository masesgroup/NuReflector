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

package microsoft.entityframeworkcore.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.changetracking.ValueComparer;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyProperty;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyImplementation;
import microsoft.entityframeworkcore.metadata.PropertySaveBehavior;
import microsoft.entityframeworkcore.PropertyAccessMode;
import microsoft.entityframeworkcore.storage.CoreTypeMapping;
import microsoft.entityframeworkcore.storage.valueconversion.ValueConverter;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBaseImplementation;
import microsoft.entityframeworkcore.metadata.ValueGenerated;
import system.reflection.FieldInfo;
import system.reflection.PropertyInfo;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IReadOnlyProperty, Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IReadOnlyProperty" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IReadOnlyProperty</a>
 */
public interface IReadOnlyProperty extends IJCOBridgeReflected, IReadOnlyPropertyBase, IReadOnlyAnnotatable {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IReadOnlyProperty
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IReadOnlyProperty";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IReadOnlyProperty}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IReadOnlyProperty} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IReadOnlyProperty ToIReadOnlyProperty(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IReadOnlyPropertyImplementation(from.getJCOInstance());
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
    
    public boolean IsForeignKey() throws Throwable;

    public boolean IsIndex() throws Throwable;


    public boolean IsKey() throws Throwable;

    public boolean IsPrimaryKey() throws Throwable;


    public boolean IsUniqueIndex() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException;

    public ValueComparer GetKeyValueComparer() throws Throwable;

    public ValueComparer GetValueComparer() throws Throwable;



    public IReadOnlyKey FindContainingPrimaryKey() throws Throwable;

    public IReadOnlyProperty FindFirstPrincipal() throws Throwable;

    public PropertySaveBehavior GetAfterSaveBehavior() throws Throwable;

    public PropertySaveBehavior GetBeforeSaveBehavior() throws Throwable;


    public CoreTypeMapping FindTypeMapping() throws Throwable;

    public CoreTypeMapping GetTypeMapping() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException;

    public ValueConverter GetValueConverter() throws Throwable;



    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException;

    public NetType GetProviderClrType() throws Throwable;


    
    // Properties section
    
    public boolean getIsConcurrencyToken() throws Throwable;

    public boolean getIsNullable() throws Throwable;

    public IReadOnlyEntityType getDeclaringEntityType() throws Throwable;

    public ValueGenerated getValueGenerated() throws Throwable;



    // Instance Events section
    

}