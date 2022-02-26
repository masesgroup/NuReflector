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

package system.data.entity.core.metadata.edm;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.entity.core.metadata.edm.MetadataItem;
import system.data.entity.core.metadata.edm.TypeUsage;
import system.data.entity.core.metadata.edm.EdmType;
import system.data.entity.core.metadata.edm.PrimitiveType;
import system.data.entity.core.metadata.edm.BuiltInTypeKind;


/**
 * The base .NET class managing System.Data.Entity.Core.Metadata.Edm.TypeUsage, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Core.Metadata.Edm.TypeUsage" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Core.Metadata.Edm.TypeUsage</a>
 */
public class TypeUsage extends MetadataItem  {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.Core.Metadata.Edm.TypeUsage
     */
    public static final String className = "System.Data.Entity.Core.Metadata.Edm.TypeUsage";
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
    public TypeUsage(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TypeUsage}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TypeUsage} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TypeUsage cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeUsage(from.getJCOInstance());
    }

    // Constructors section
    
    public TypeUsage() throws Throwable {
    }



    
    // Methods section
    
    public boolean IsSubtypeOf(TypeUsage typeUsage) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSubtypeOf", typeUsage == null ? null : typeUsage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateBinaryTypeUsage(PrimitiveType primitiveType, boolean isFixedLength, int maxLength) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateBinaryTypeUsage = (JCObject)classType.Invoke("CreateBinaryTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance(), isFixedLength, maxLength);
            return new TypeUsage(objCreateBinaryTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateBinaryTypeUsage(PrimitiveType primitiveType, boolean isFixedLength) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateBinaryTypeUsage = (JCObject)classType.Invoke("CreateBinaryTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance(), isFixedLength);
            return new TypeUsage(objCreateBinaryTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateDecimalTypeUsage(PrimitiveType primitiveType, byte precision, byte scale) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateDecimalTypeUsage = (JCObject)classType.Invoke("CreateDecimalTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance(), precision, scale);
            return new TypeUsage(objCreateDecimalTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateDecimalTypeUsage(PrimitiveType primitiveType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateDecimalTypeUsage = (JCObject)classType.Invoke("CreateDecimalTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance());
            return new TypeUsage(objCreateDecimalTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateDefaultTypeUsage(EdmType edmType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateDefaultTypeUsage = (JCObject)classType.Invoke("CreateDefaultTypeUsage", edmType == null ? null : edmType.getJCOInstance());
            return new TypeUsage(objCreateDefaultTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateStringTypeUsage(PrimitiveType primitiveType, boolean isUnicode, boolean isFixedLength, int maxLength) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateStringTypeUsage = (JCObject)classType.Invoke("CreateStringTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance(), isUnicode, isFixedLength, maxLength);
            return new TypeUsage(objCreateStringTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TypeUsage CreateStringTypeUsage(PrimitiveType primitiveType, boolean isUnicode, boolean isFixedLength) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateStringTypeUsage = (JCObject)classType.Invoke("CreateStringTypeUsage", primitiveType == null ? null : primitiveType.getJCOInstance(), isUnicode, isFixedLength);
            return new TypeUsage(objCreateStringTypeUsage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public EdmType getEdmType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EdmType");
            return new EdmType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeUsage getModelTypeUsage() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.data.entity.core.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ModelTypeUsage");
            return new TypeUsage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}