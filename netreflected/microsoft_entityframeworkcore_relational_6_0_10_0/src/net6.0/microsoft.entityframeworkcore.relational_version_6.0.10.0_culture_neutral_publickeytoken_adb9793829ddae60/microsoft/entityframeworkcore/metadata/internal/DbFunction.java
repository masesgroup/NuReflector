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
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.infrastructure.ConventionAnnotatable;
import system.reflection.MethodInfo;
import microsoft.entityframeworkcore.metadata.IMutableModel;
import microsoft.entityframeworkcore.metadata.IMutableModelImplementation;
import microsoft.entityframeworkcore.metadata.ConfigurationSource;
import microsoft.entityframeworkcore.metadata.internal.DbFunction;
import microsoft.entityframeworkcore.metadata.internal.DbFunctionParameter;
import microsoft.entityframeworkcore.metadata.IReadOnlyDbFunction;
import microsoft.entityframeworkcore.metadata.IReadOnlyDbFunctionImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyModel;
import microsoft.entityframeworkcore.metadata.IReadOnlyModelImplementation;
import microsoft.entityframeworkcore.storage.RelationalTypeMapping;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.metadata.internal.InternalDbFunctionBuilder;
import microsoft.entityframeworkcore.metadata.IStoreFunction;
import microsoft.entityframeworkcore.metadata.IStoreFunctionImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.DbFunction, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.DbFunction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.DbFunction</a>
 */
public class DbFunction extends ConventionAnnotatable  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.DbFunction
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.DbFunction";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }
    /**
     * Internal constructor. Use with caution 
     */
    public DbFunction(java.lang.Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public java.lang.Object getJCOInstance() {
        return classInstance;
    }

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DbFunction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DbFunction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DbFunction cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DbFunction(from.getJCOInstance());
    }

    // Constructors section
    
    public DbFunction() throws Throwable {
    }

    public DbFunction(MethodInfo methodInfo, IMutableModel model, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(methodInfo == null ? null : methodInfo.getJCOInstance(), model == null ? null : model.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean SetIsBuiltIn(boolean builtIn, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetIsBuiltIn", builtIn, configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetIsNullable(boolean nullable, ConfigurationSource configurationSource) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetIsNullable", nullable, configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSource GetConfigurationSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetConfigurationSource = (JCObject)classInstance.Invoke("GetConfigurationSource");
            return new ConfigurationSource(objGetConfigurationSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbFunction AddDbFunction(IMutableModel model, MethodInfo methodInfo, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new DbFunction(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbFunction AddDbFunction(IMutableModel model, java.lang.String name, NetType returnType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), name, returnType == null ? null : returnType.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new DbFunction(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbFunction RemoveDbFunction(IMutableModel model, MethodInfo methodInfo) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance());
            return new DbFunction(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbFunction RemoveDbFunction(IMutableModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new DbFunction(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbFunctionParameter FindParameter(java.lang.String name) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindParameter = (JCObject)classInstance.Invoke("FindParameter", name);
            return new DbFunctionParameter(objFindParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyDbFunction FindDbFunction(IReadOnlyModel model, MethodInfo methodInfo) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance());
            return new IReadOnlyDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyDbFunction FindDbFunction(IReadOnlyModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IReadOnlyDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalTypeMapping SetTypeMapping(RelationalTypeMapping typeMapping, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetTypeMapping = (JCObject)classInstance.Invoke("SetTypeMapping", typeMapping == null ? null : typeMapping.getJCOInstance(), configurationSource == null ? null : configurationSource.getJCOInstance());
            return new RelationalTypeMapping(objSetTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetFunctionName(MethodInfo methodInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetFunctionName", methodInfo == null ? null : methodInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String SetName(java.lang.String name, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("SetName", name, configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String SetSchema(java.lang.String schema, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("SetSchema", schema, configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String SetStoreType(java.lang.String storeType, ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("SetStoreType", storeType, configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRemovedFromModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetRemovedFromModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateConfigurationSource(ConfigurationSource configurationSource) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateConfigurationSource", configurationSource == null ? null : configurationSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIReadOnlyDbFunction method available in IReadOnlyDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIReadOnlyDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean SetIsBuiltIn(boolean builtIn, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean SetIsNullable(boolean nullable, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public RelationalTypeMapping SetTypeMapping(RelationalTypeMapping typeMapping, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String SetName(java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String SetSchema(java.lang.String schema, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIConventionDbFunction method available in IConventionDbFunction to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String SetStoreType(java.lang.String storeType, boolean fromDataAnnotation) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIConventionDbFunction to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsAggregate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAggregate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBuiltIn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsBuiltIn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsBuiltIn(boolean IsBuiltIn) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsBuiltIn", IsBuiltIn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNullable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNullable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsNullable(boolean IsNullable) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsNullable", IsNullable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsScalar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsScalar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMutableModel getModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new IMutableModelImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InternalDbFunctionBuilder getBuilder() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Builder");
            return new InternalDbFunctionBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IStoreFunction getStoreFunction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("StoreFunction");
            return new IStoreFunctionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStoreFunction(IStoreFunction StoreFunction) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StoreFunction", StoreFunction == null ? null : StoreFunction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationalTypeMapping getTypeMapping() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TypeMapping");
            return new RelationalTypeMapping(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeMapping(RelationalTypeMapping TypeMapping) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TypeMapping", TypeMapping == null ? null : TypeMapping.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo getMethodInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MethodInfo");
            return new MethodInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getModelName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ModelName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSchema() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Schema");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSchema(java.lang.String Schema) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Schema", Schema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStoreType() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("StoreType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStoreType(java.lang.String StoreType) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StoreType", StoreType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getReturnType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReturnType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}