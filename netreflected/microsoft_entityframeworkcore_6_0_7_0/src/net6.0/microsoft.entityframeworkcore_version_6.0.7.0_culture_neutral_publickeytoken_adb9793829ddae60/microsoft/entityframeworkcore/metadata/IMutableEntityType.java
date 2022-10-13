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
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBase;
import microsoft.entityframeworkcore.metadata.IReadOnlyTypeBaseImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.IMutableTypeBase;
import microsoft.entityframeworkcore.metadata.IMutableTypeBaseImplementation;
import microsoft.entityframeworkcore.metadata.IMutableAnnotatable;
import microsoft.entityframeworkcore.metadata.IMutableAnnotatableImplementation;
import microsoft.entityframeworkcore.ChangeTrackingStrategy;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IMutableEntityType;
import microsoft.entityframeworkcore.metadata.IMutableEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IMutableForeignKey;
import microsoft.entityframeworkcore.metadata.IMutableForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableProperty;
import microsoft.entityframeworkcore.metadata.IMutablePropertyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableKey;
import microsoft.entityframeworkcore.metadata.IMutableKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyProperty;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableIndex;
import microsoft.entityframeworkcore.metadata.IMutableIndexImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyIndex;
import microsoft.entityframeworkcore.metadata.IReadOnlyIndexImplementation;
import microsoft.entityframeworkcore.metadata.IMutableNavigation;
import microsoft.entityframeworkcore.metadata.IMutableNavigationImplementation;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.metadata.IMutableServiceProperty;
import microsoft.entityframeworkcore.metadata.IMutableServicePropertyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyServiceProperty;
import microsoft.entityframeworkcore.metadata.IReadOnlyServicePropertyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableSkipNavigation;
import microsoft.entityframeworkcore.metadata.IMutableSkipNavigationImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlySkipNavigation;
import microsoft.entityframeworkcore.metadata.IReadOnlySkipNavigationImplementation;
import microsoft.entityframeworkcore.PropertyAccessMode;
import system.linq.expressions.LambdaExpression;
import system.reflection.PropertyInfo;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.IMutableModel;
import microsoft.entityframeworkcore.metadata.IMutableModelImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IMutableEntityType, Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IMutableEntityType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IMutableEntityType</a>
 */
public interface IMutableEntityType extends IJCOBridgeReflected, IReadOnlyEntityType, IReadOnlyTypeBase, IReadOnlyAnnotatable, IMutableTypeBase, IMutableAnnotatable {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IMutableEntityType
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IMutableEntityType";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IMutableEntityType}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IMutableEntityType} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IMutableEntityType ToIMutableEntityType(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IMutableEntityTypeImplementation(from.getJCOInstance());
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
    













    public IMutableEntityType FindClosestCommonParent(IReadOnlyEntityType otherEntityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException;

    public IMutableEntityType GetRootType() throws Throwable;

    public IMutableEntityType LeastDerivedType(IReadOnlyEntityType otherEntityType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException;

    public IMutableForeignKey AddForeignKey(IMutableProperty property, IMutableKey principalKey, IMutableEntityType principalEntityType) throws Throwable;

    public IMutableForeignKey FindForeignKey(IReadOnlyProperty property, IReadOnlyKey principalKey, IReadOnlyEntityType principalEntityType) throws Throwable;

    public IMutableForeignKey FindOwnership() throws Throwable;

    public IMutableForeignKey RemoveForeignKey(IReadOnlyForeignKey foreignKey) throws Throwable;

    public IMutableIndex AddIndex(IMutableProperty property, java.lang.String name) throws Throwable;

    public IMutableIndex AddIndex(IMutableProperty property) throws Throwable;

    public IMutableIndex FindIndex(IReadOnlyProperty property) throws Throwable;

    public IMutableIndex FindIndex(java.lang.String name) throws Throwable;

    public IMutableIndex RemoveIndex(IReadOnlyIndex index) throws Throwable;

    public IMutableKey AddKey(IMutableProperty property) throws Throwable;

    public IMutableKey FindKey(IReadOnlyProperty property) throws Throwable;

    public IMutableKey FindPrimaryKey() throws Throwable;

    public IMutableKey RemoveKey(IReadOnlyKey key) throws Throwable;

    public IMutableKey SetPrimaryKey(IMutableProperty property) throws Throwable;

    public IMutableNavigation FindDeclaredNavigation(java.lang.String name) throws Throwable;

    public IMutableNavigation FindNavigation(MemberInfo memberInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException;

    public IMutableNavigation FindNavigation(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException;

    public IMutableProperty AddIndexerProperty(java.lang.String name, NetType propertyType) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.ArgumentException, system.FormatException, system.ArrayTypeMismatchException;

    public IMutableProperty AddProperty(MemberInfo memberInfo) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException;

    public IMutableProperty AddProperty(java.lang.String name, NetType propertyType, MemberInfo memberInfo) throws Throwable;

    public IMutableProperty AddProperty(java.lang.String name, NetType propertyType) throws Throwable;

    public IMutableProperty AddProperty(java.lang.String name) throws Throwable;

    public IMutableProperty FindDeclaredProperty(java.lang.String name) throws Throwable;

    public IMutableProperty FindDiscriminatorProperty() throws Throwable;

    public IMutableProperty FindProperty(MemberInfo memberInfo) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException;

    public IMutableProperty FindProperty(java.lang.String name) throws Throwable;

    public IMutableProperty GetProperty(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException;

    public IMutableProperty RemoveProperty(IReadOnlyProperty property) throws Throwable;

    public IMutableProperty RemoveProperty(java.lang.String name) throws Throwable;

    public IMutableServiceProperty AddServiceProperty(MemberInfo memberInfo) throws Throwable;

    public IMutableServiceProperty FindServiceProperty(java.lang.String name) throws Throwable;

    public IMutableServiceProperty RemoveServiceProperty(IReadOnlyServiceProperty property) throws Throwable;

    public IMutableServiceProperty RemoveServiceProperty(java.lang.String name) throws Throwable;

    public IMutableSkipNavigation AddSkipNavigation(java.lang.String name, MemberInfo memberInfo, IMutableEntityType targetEntityType, boolean collection, boolean onDependent) throws Throwable;

    public IMutableSkipNavigation FindDeclaredSkipNavigation(java.lang.String name) throws Throwable;

    public IMutableSkipNavigation FindSkipNavigation(MemberInfo memberInfo) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException;

    public IMutableSkipNavigation FindSkipNavigation(java.lang.String name) throws Throwable;

    public IMutableSkipNavigation RemoveSkipNavigation(IReadOnlySkipNavigation navigation) throws Throwable;














    public void RemoveDiscriminatorValue() throws Throwable;


    public void SetDiscriminatorProperty(IReadOnlyProperty property) throws Throwable;

    public void SetDiscriminatorValue(NetObject value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.OutOfMemoryException;


    public void SetQueryFilter(LambdaExpression queryFilter) throws Throwable;


    
    // Properties section
    
    public boolean getIsKeyless() throws Throwable;

    public void setIsKeyless(boolean IsKeyless) throws Throwable;

    public IMutableEntityType getBaseType() throws Throwable;

    public void setBaseType(IMutableEntityType BaseType) throws Throwable;

    public IMutableEntityType getDefiningEntityType() throws Throwable;

    public IMutableModel getModel() throws Throwable;



    // Instance Events section
    

}