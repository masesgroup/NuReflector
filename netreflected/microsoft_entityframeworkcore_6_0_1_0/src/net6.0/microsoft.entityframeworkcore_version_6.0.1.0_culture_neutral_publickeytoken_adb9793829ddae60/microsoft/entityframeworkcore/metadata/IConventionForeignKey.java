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
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKeyImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatable;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatableImplementation;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.IConventionAnnotation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IConventionNavigation;
import microsoft.entityframeworkcore.metadata.IConventionNavigationImplementation;
import system.reflection.MemberInfo;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.DeleteBehavior;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilderImplementation;
import microsoft.entityframeworkcore.metadata.IConventionKey;
import microsoft.entityframeworkcore.metadata.IConventionKeyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IConventionForeignKey, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionForeignKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionForeignKey</a>
 */
public interface IConventionForeignKey extends IJCOBridgeReflected, IReadOnlyForeignKey, IReadOnlyAnnotatable, IConventionAnnotatable {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IConventionForeignKey
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IConventionForeignKey";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IConventionForeignKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IConventionForeignKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IConventionForeignKey ToIConventionForeignKey(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IConventionForeignKeyImplementation(from.getJCOInstance());
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
    



    public ConfigurationSource GetConfigurationSource() throws Throwable;





    public IConventionEntityType GetRelatedEntityType(IReadOnlyEntityType entityType) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.OutOfMemoryException;

    public IConventionNavigation GetNavigation(boolean pointsToPrincipal) throws Throwable;

    public IConventionNavigation HasDependentToPrincipal(MemberInfo property, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation HasDependentToPrincipal(java.lang.String name, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation HasPrincipalToDependent(MemberInfo property, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation HasPrincipalToDependent(java.lang.String name, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation SetDependentToPrincipal(MemberInfo property, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation SetDependentToPrincipal(java.lang.String name, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation SetPrincipalToDependent(MemberInfo property, boolean fromDataAnnotation) throws Throwable;

    public IConventionNavigation SetPrincipalToDependent(java.lang.String name, boolean fromDataAnnotation) throws Throwable;




    
    // Properties section
    
    public IConventionEntityType getDeclaringEntityType() throws Throwable;

    public IConventionEntityType getPrincipalEntityType() throws Throwable;

    public IConventionKey getPrincipalKey() throws Throwable;

    public IConventionNavigation getDependentToPrincipal() throws Throwable;

    public IConventionNavigation getPrincipalToDependent() throws Throwable;



    // Instance Events section
    

}