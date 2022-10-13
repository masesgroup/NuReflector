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

package microsoft.entityframeworkcore;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionModelBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.DbFunctionBuilder;
import microsoft.entityframeworkcore.ModelBuilder;
import system.reflection.MethodInfo;
import microsoft.entityframeworkcore.metadata.builders.IConventionDbFunctionBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionDbFunctionBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IConventionSequenceBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionSequenceBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.SequenceBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.RelationalModelBuilderExtensions, Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalModelBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalModelBuilderExtensions</a>
 */
public class RelationalModelBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.RelationalModelBuilderExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.RelationalModelBuilderExtensions";
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
    public RelationalModelBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalModelBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalModelBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalModelBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalModelBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalModelBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean CanSetCollation(IConventionModelBuilder modelBuilder, java.lang.String collation, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetDefaultSchema(IConventionModelBuilder modelBuilder, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetDefaultSchema", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbFunctionBuilder HasDbFunction(ModelBuilder modelBuilder, MethodInfo methodInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDbFunction = (JCObject)classType.Invoke("HasDbFunction", modelBuilder == null ? null : modelBuilder.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance());
            return new DbFunctionBuilder(objHasDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunctionBuilder HasDbFunction(IConventionModelBuilder modelBuilder, MethodInfo methodInfo, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDbFunction = (JCObject)classType.Invoke("HasDbFunction", modelBuilder == null ? null : modelBuilder.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance(), fromDataAnnotation);
            return new IConventionDbFunctionBuilderImplementation(objHasDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunctionBuilder HasDbFunction(IConventionModelBuilder modelBuilder, java.lang.String name, NetType returnType, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDbFunction = (JCObject)classType.Invoke("HasDbFunction", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, returnType == null ? null : returnType.getJCOInstance(), fromDataAnnotation);
            return new IConventionDbFunctionBuilderImplementation(objHasDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionModelBuilder HasDefaultSchema(IConventionModelBuilder modelBuilder, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDefaultSchema = (JCObject)classType.Invoke("HasDefaultSchema", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema, fromDataAnnotation);
            return new IConventionModelBuilderImplementation(objHasDefaultSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionModelBuilder UseCollation(IConventionModelBuilder modelBuilder, java.lang.String collation, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseCollation = (JCObject)classType.Invoke("UseCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation, fromDataAnnotation);
            return new IConventionModelBuilderImplementation(objUseCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionSequenceBuilder HasSequence(IConventionModelBuilder modelBuilder, java.lang.String name, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasSequence = (JCObject)classType.Invoke("HasSequence", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, schema, fromDataAnnotation);
            return new IConventionSequenceBuilderImplementation(objHasSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SequenceBuilder HasSequence(ModelBuilder modelBuilder, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasSequence = (JCObject)classType.Invoke("HasSequence", modelBuilder == null ? null : modelBuilder.getJCOInstance(), name, schema);
            return new SequenceBuilder(objHasSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SequenceBuilder HasSequence(ModelBuilder modelBuilder, NetType type, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasSequence = (JCObject)classType.Invoke("HasSequence", modelBuilder == null ? null : modelBuilder.getJCOInstance(), type == null ? null : type.getJCOInstance(), name, schema);
            return new SequenceBuilder(objHasSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder HasDefaultSchema(ModelBuilder modelBuilder, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDefaultSchema = (JCObject)classType.Invoke("HasDefaultSchema", modelBuilder == null ? null : modelBuilder.getJCOInstance(), schema);
            return new ModelBuilder(objHasDefaultSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelBuilder UseCollation(ModelBuilder modelBuilder, java.lang.String collation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUseCollation = (JCObject)classType.Invoke("UseCollation", modelBuilder == null ? null : modelBuilder.getJCOInstance(), collation);
            return new ModelBuilder(objUseCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}