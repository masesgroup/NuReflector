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
import microsoft.entityframeworkcore.metadata.IConventionForeignKey;
import microsoft.entityframeworkcore.metadata.IConventionForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.StoreObjectIdentifier;
import microsoft.entityframeworkcore.metadata.IForeignKey;
import microsoft.entityframeworkcore.metadata.IForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableForeignKey;
import microsoft.entityframeworkcore.metadata.IMutableForeignKeyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKey;
import microsoft.entityframeworkcore.metadata.IReadOnlyForeignKeyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.RelationalForeignKeyExtensions, Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalForeignKeyExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalForeignKeyExtensions</a>
 */
public class RelationalForeignKeyExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.RelationalForeignKeyExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.RelationalForeignKeyExtensions";
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
    public RelationalForeignKeyExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalForeignKeyExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalForeignKeyExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalForeignKeyExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalForeignKeyExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalForeignKeyExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static IConventionForeignKey FindSharedObjectRootForeignKey(IConventionForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSharedObjectRootForeignKey = (JCObject)classType.Invoke("FindSharedObjectRootForeignKey", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut());
            return new IConventionForeignKeyImplementation(objFindSharedObjectRootForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IForeignKey FindSharedObjectRootForeignKey(IForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSharedObjectRootForeignKey = (JCObject)classType.Invoke("FindSharedObjectRootForeignKey", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut());
            return new IForeignKeyImplementation(objFindSharedObjectRootForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMutableForeignKey FindSharedObjectRootForeignKey(IMutableForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSharedObjectRootForeignKey = (JCObject)classType.Invoke("FindSharedObjectRootForeignKey", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut());
            return new IMutableForeignKeyImplementation(objFindSharedObjectRootForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlyForeignKey FindSharedObjectRootForeignKey(IReadOnlyForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSharedObjectRootForeignKey = (JCObject)classType.Invoke("FindSharedObjectRootForeignKey", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut());
            return new IReadOnlyForeignKeyImplementation(objFindSharedObjectRootForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetConstraintName(IReadOnlyForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject, JCORefOut<StoreObjectIdentifier> principalStoreObject) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetConstraintName", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut(), principalStoreObject.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetConstraintName(IReadOnlyForeignKey foreignKey) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetConstraintName", foreignKey == null ? null : foreignKey.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetDefaultName(IReadOnlyForeignKey foreignKey, JCORefOut<StoreObjectIdentifier> storeObject, JCORefOut<StoreObjectIdentifier> principalStoreObject) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetDefaultName", foreignKey == null ? null : foreignKey.getJCOInstance(), storeObject.getJCRefOut(), principalStoreObject.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetDefaultName(IReadOnlyForeignKey foreignKey) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetDefaultName", foreignKey == null ? null : foreignKey.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetConstraintName(IConventionForeignKey foreignKey, java.lang.String value, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetConstraintName", foreignKey == null ? null : foreignKey.getJCOInstance(), value, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetConstraintName(IMutableForeignKey foreignKey, java.lang.String value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetConstraintName", foreignKey == null ? null : foreignKey.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}