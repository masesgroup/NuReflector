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
import microsoft.entityframeworkcore.metadata.IReadOnlyModel;
import microsoft.entityframeworkcore.metadata.IReadOnlyModelImplementation;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatable;
import microsoft.entityframeworkcore.infrastructure.IReadOnlyAnnotatableImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatable;
import microsoft.entityframeworkcore.metadata.IConventionAnnotatableImplementation;
import microsoft.entityframeworkcore.ChangeTrackingStrategy;
import microsoft.entityframeworkcore.infrastructure.IAnnotation;
import microsoft.entityframeworkcore.infrastructure.IAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.conventions.IConventionBatch;
import microsoft.entityframeworkcore.metadata.conventions.IConventionBatchImplementation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotation;
import microsoft.entityframeworkcore.metadata.IConventionAnnotationImplementation;
import microsoft.entityframeworkcore.metadata.IConventionEntityType;
import microsoft.entityframeworkcore.metadata.IConventionEntityTypeImplementation;
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityType;
import microsoft.entityframeworkcore.metadata.IReadOnlyEntityTypeImplementation;
import microsoft.entityframeworkcore.PropertyAccessMode;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionAnnotatableBuilderImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.IConventionModel, Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionModel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.IConventionModel</a>
 */
public interface IConventionModel extends IJCOBridgeReflected, IReadOnlyModel, IReadOnlyAnnotatable, IConventionAnnotatable {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.IConventionModel
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.IConventionModel";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IConventionModel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IConventionModel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IConventionModel ToIConventionModel(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IConventionModelImplementation(from.getJCOInstance());
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
    
    public boolean IsIgnored(java.lang.String typeName) throws Throwable;

    public boolean IsIgnored(NetType type) throws Throwable;

    public boolean IsIgnoredType(NetType type) throws Throwable;

    public boolean IsOwned(NetType type) throws Throwable;





    public IConventionBatch DelayConventions() throws Throwable;





    public IConventionEntityType AddEntityType(java.lang.String name, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddEntityType(java.lang.String name, java.lang.String definingNavigationName, IConventionEntityType definingEntityType, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddEntityType(java.lang.String name, NetType clrType, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddEntityType(NetType type, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddEntityType(NetType type, java.lang.String definingNavigationName, IConventionEntityType definingEntityType, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddOwnedEntityType(java.lang.String name, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddOwnedEntityType(java.lang.String name, NetType clrType, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType AddOwnedEntityType(NetType type, boolean fromDataAnnotation) throws Throwable;

    public IConventionEntityType FindEntityType(java.lang.String name, java.lang.String definingNavigationName, IConventionEntityType definingEntityType) throws Throwable;

    public IConventionEntityType FindEntityType(java.lang.String name) throws Throwable;

    public IConventionEntityType FindEntityType(NetType type, java.lang.String definingNavigationName, IConventionEntityType definingEntityType) throws Throwable;

    public IConventionEntityType FindEntityType(NetType type) throws Throwable;

    public IConventionEntityType RemoveEntityType(IConventionEntityType entityType) throws Throwable;

    public IConventionEntityType RemoveEntityType(java.lang.String name, java.lang.String definingNavigationName, IConventionEntityType definingEntityType) throws Throwable;

    public IConventionEntityType RemoveEntityType(java.lang.String name) throws Throwable;

    public IConventionEntityType RemoveEntityType(NetType type, java.lang.String definingNavigationName, IConventionEntityType definingEntityType) throws Throwable;

    public IConventionEntityType RemoveEntityType(NetType type) throws Throwable;

    public IModel FinalizeModel() throws Throwable;




    public java.lang.String AddIgnored(java.lang.String typeName, boolean fromDataAnnotation) throws Throwable;

    public java.lang.String AddIgnored(NetType type, boolean fromDataAnnotation) throws Throwable;



    public java.lang.String RemoveIgnored(java.lang.String typeName) throws Throwable;

    public java.lang.String RemoveOwned(NetType type) throws Throwable;


    public NetType RemoveShared(NetType type) throws Throwable;

    public void AddOwned(NetType type, boolean fromDataAnnotation) throws Throwable;

    public void AddShared(NetType type, boolean fromDataAnnotation) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}