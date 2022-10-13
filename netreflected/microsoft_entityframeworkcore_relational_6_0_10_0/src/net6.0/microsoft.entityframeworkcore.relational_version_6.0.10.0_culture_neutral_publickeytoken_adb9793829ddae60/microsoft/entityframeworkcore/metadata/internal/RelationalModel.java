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
import microsoft.entityframeworkcore.infrastructure.Annotatable;
import microsoft.entityframeworkcore.metadata.IModel;
import microsoft.entityframeworkcore.metadata.IModelImplementation;
import microsoft.entityframeworkcore.metadata.IRelationalAnnotationProvider;
import microsoft.entityframeworkcore.metadata.IRelationalAnnotationProviderImplementation;
import microsoft.entityframeworkcore.metadata.IRelationalModel;
import microsoft.entityframeworkcore.metadata.IRelationalModelImplementation;
import microsoft.entityframeworkcore.metadata.ISqlQuery;
import microsoft.entityframeworkcore.metadata.ISqlQueryImplementation;
import microsoft.entityframeworkcore.metadata.IStoreFunction;
import microsoft.entityframeworkcore.metadata.IStoreFunctionImplementation;
import microsoft.entityframeworkcore.metadata.ITable;
import microsoft.entityframeworkcore.metadata.ITableImplementation;
import microsoft.entityframeworkcore.metadata.IView;
import microsoft.entityframeworkcore.metadata.IViewImplementation;
import microsoft.entityframeworkcore.migrations.ReferentialAction;
import microsoft.entityframeworkcore.DeleteBehavior;
import microsoft.entityframeworkcore.metadata.ISequence;
import microsoft.entityframeworkcore.metadata.ISequenceImplementation;
import microsoft.entityframeworkcore.infrastructure.MetadataDebugStringOptions;
import microsoft.entityframeworkcore.infrastructure.DebugView;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.RelationalModel, Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.RelationalModel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.RelationalModel</a>
 */
public class RelationalModel extends Annotatable  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.RelationalModel
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.RelationalModel";
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
    public RelationalModel(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalModel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalModel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalModel cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalModel(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalModel() throws Throwable {
    }

    public RelationalModel(IModel model) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(model == null ? null : model.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static IModel Add(IModel model, IRelationalAnnotationProvider relationalAnnotationProvider, boolean designTime) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", model == null ? null : model.getJCOInstance(), relationalAnnotationProvider == null ? null : relationalAnnotationProvider.getJCOInstance(), designTime);
            return new IModelImplementation(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRelationalModel Create(IModel model, IRelationalAnnotationProvider relationalAnnotationProvider, boolean designTime) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", model == null ? null : model.getJCOInstance(), relationalAnnotationProvider == null ? null : relationalAnnotationProvider.getJCOInstance(), designTime);
            return new IRelationalModelImplementation(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISqlQuery FindQuery(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindQuery = (JCObject)classInstance.Invoke("FindQuery", name);
            return new ISqlQueryImplementation(objFindQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITable FindTable(java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTable = (JCObject)classInstance.Invoke("FindTable", name, schema);
            return new ITableImplementation(objFindTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IView FindView(java.lang.String name, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindView = (JCObject)classInstance.Invoke("FindView", name, schema);
            return new IViewImplementation(objFindView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ReferentialAction ToReferentialAction(DeleteBehavior deleteBehavior) throws Throwable, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToReferentialAction = (JCObject)classType.Invoke("ToReferentialAction", deleteBehavior == null ? null : deleteBehavior.getJCOInstance());
            return new ReferentialAction(objToReferentialAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIRelationalModel method available in IRelationalModel to obtain an object with an invocable method
     */
    @Deprecated 
    public ISequence FindSequence(java.lang.String name, java.lang.String schema) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIRelationalModel to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIRelationalModel method available in IRelationalModel to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String ToDebugString(MetadataDebugStringOptions options, int indent) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIRelationalModel to obtain the full interface.");
    }


    
    // Properties section
    
    public DebugView getDebugView() throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DebugView");
            return new DebugView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IModel getModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new IModelImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}