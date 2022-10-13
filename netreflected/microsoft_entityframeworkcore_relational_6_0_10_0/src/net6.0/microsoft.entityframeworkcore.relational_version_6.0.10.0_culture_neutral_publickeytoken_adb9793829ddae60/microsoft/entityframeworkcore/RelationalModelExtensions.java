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
import microsoft.entityframeworkcore.metadata.IReadOnlyModel;
import microsoft.entityframeworkcore.metadata.IReadOnlyModelImplementation;
import microsoft.entityframeworkcore.metadata.IConventionDbFunction;
import microsoft.entityframeworkcore.metadata.IConventionDbFunctionImplementation;
import microsoft.entityframeworkcore.metadata.IConventionModel;
import microsoft.entityframeworkcore.metadata.IConventionModelImplementation;
import system.reflection.MethodInfo;
import microsoft.entityframeworkcore.metadata.IConventionSequence;
import microsoft.entityframeworkcore.metadata.IConventionSequenceImplementation;
import microsoft.entityframeworkcore.metadata.IDbFunction;
import microsoft.entityframeworkcore.metadata.IDbFunctionImplementation;
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.metadata.IMutableDbFunction;
import microsoft.entityframeworkcore.metadata.IMutableDbFunctionImplementation;
import microsoft.entityframeworkcore.metadata.IMutableModel;
import microsoft.entityframeworkcore.metadata.IMutableModelImplementation;
import microsoft.entityframeworkcore.metadata.IMutableSequence;
import microsoft.entityframeworkcore.metadata.IMutableSequenceImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyDbFunction;
import microsoft.entityframeworkcore.metadata.IReadOnlyDbFunctionImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlySequence;
import microsoft.entityframeworkcore.metadata.IReadOnlySequenceImplementation;
import microsoft.entityframeworkcore.metadata.IRelationalModel;
import microsoft.entityframeworkcore.metadata.IRelationalModelImplementation;
import microsoft.entityframeworkcore.metadata.ISequence;
import microsoft.entityframeworkcore.metadata.ISequenceImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.RelationalModelExtensions, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalModelExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalModelExtensions</a>
 */
public class RelationalModelExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.RelationalModelExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.RelationalModelExtensions";
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
    public RelationalModelExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalModelExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalModelExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalModelExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalModelExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalModelExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static int GetMaxIdentifierLength(IReadOnlyModel model) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetMaxIdentifierLength", model == null ? null : model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction AddDbFunction(IConventionModel model, MethodInfo methodInfo, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance(), fromDataAnnotation);
            return new IConventionDbFunctionImplementation(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction AddDbFunction(IConventionModel model, java.lang.String name, NetType returnType, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), name, returnType == null ? null : returnType.getJCOInstance(), fromDataAnnotation);
            return new IConventionDbFunctionImplementation(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction FindDbFunction(IConventionModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IConventionDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction FindDbFunction(IConventionModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IConventionDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction RemoveDbFunction(IConventionModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IConventionDbFunctionImplementation(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionDbFunction RemoveDbFunction(IConventionModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IConventionDbFunctionImplementation(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionSequence AddSequence(IConventionModel model, java.lang.String name, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddSequence = (JCObject)classType.Invoke("AddSequence", model == null ? null : model.getJCOInstance(), name, schema, fromDataAnnotation);
            return new IConventionSequenceImplementation(objAddSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionSequence FindSequence(IConventionModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSequence = (JCObject)classType.Invoke("FindSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IConventionSequenceImplementation(objFindSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionSequence RemoveSequence(IConventionModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveSequence = (JCObject)classType.Invoke("RemoveSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IConventionSequenceImplementation(objRemoveSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDbFunction FindDbFunction(IModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDbFunction FindDbFunction(IModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction AddDbFunction(IMutableModel model, MethodInfo methodInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), methodInfo == null ? null : methodInfo.getJCOInstance());
            return new IMutableDbFunctionImplementation(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction AddDbFunction(IMutableModel model, java.lang.String name, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddDbFunction = (JCObject)classType.Invoke("AddDbFunction", model == null ? null : model.getJCOInstance(), name, returnType == null ? null : returnType.getJCOInstance());
            return new IMutableDbFunctionImplementation(objAddDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction FindDbFunction(IMutableModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IMutableDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction FindDbFunction(IMutableModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IMutableDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction RemoveDbFunction(IMutableModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IMutableDbFunctionImplementation(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableDbFunction RemoveDbFunction(IMutableModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveDbFunction = (JCObject)classType.Invoke("RemoveDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IMutableDbFunctionImplementation(objRemoveDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableSequence AddSequence(IMutableModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddSequence = (JCObject)classType.Invoke("AddSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IMutableSequenceImplementation(objAddSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableSequence FindSequence(IMutableModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSequence = (JCObject)classType.Invoke("FindSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IMutableSequenceImplementation(objFindSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableSequence RemoveSequence(IMutableModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRemoveSequence = (JCObject)classType.Invoke("RemoveSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IMutableSequenceImplementation(objRemoveSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyDbFunction FindDbFunction(IReadOnlyModel model, MethodInfo method) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), method == null ? null : method.getJCOInstance());
            return new IReadOnlyDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyDbFunction FindDbFunction(IReadOnlyModel model, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindDbFunction = (JCObject)classType.Invoke("FindDbFunction", model == null ? null : model.getJCOInstance(), name);
            return new IReadOnlyDbFunctionImplementation(objFindDbFunction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlySequence FindSequence(IReadOnlyModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSequence = (JCObject)classType.Invoke("FindSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new IReadOnlySequenceImplementation(objFindSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRelationalModel GetRelationalModel(IModel model) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRelationalModel = (JCObject)classType.Invoke("GetRelationalModel", model == null ? null : model.getJCOInstance());
            return new IRelationalModelImplementation(objGetRelationalModel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ISequence FindSequence(IModel model, java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSequence = (JCObject)classType.Invoke("FindSequence", model == null ? null : model.getJCOInstance(), name, schema);
            return new ISequenceImplementation(objFindSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetCollation(IReadOnlyModel model) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetCollation", model == null ? null : model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetDefaultSchema(IReadOnlyModel model) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetDefaultSchema", model == null ? null : model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetCollation(IConventionModel model, java.lang.String value, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetCollation", model == null ? null : model.getJCOInstance(), value, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetDefaultSchema(IConventionModel model, java.lang.String value, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetDefaultSchema", model == null ? null : model.getJCOInstance(), value, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCollation(IMutableModel model, java.lang.String value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCollation", model == null ? null : model.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetDefaultSchema(IMutableModel model, java.lang.String value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetDefaultSchema", model == null ? null : model.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}