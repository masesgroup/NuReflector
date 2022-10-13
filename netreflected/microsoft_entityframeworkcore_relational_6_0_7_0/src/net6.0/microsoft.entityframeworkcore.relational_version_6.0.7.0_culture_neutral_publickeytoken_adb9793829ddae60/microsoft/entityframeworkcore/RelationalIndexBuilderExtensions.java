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
import microsoft.entityframeworkcore.metadata.builders.IConventionIndexBuilder;
import microsoft.entityframeworkcore.metadata.builders.IConventionIndexBuilderImplementation;
import microsoft.entityframeworkcore.metadata.builders.IndexBuilder;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.RelationalIndexBuilderExtensions, Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalIndexBuilderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.RelationalIndexBuilderExtensions</a>
 */
public class RelationalIndexBuilderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.Relational, Version=6.0.7.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.Relational
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.Relational";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.RelationalIndexBuilderExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.RelationalIndexBuilderExtensions";
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
    public RelationalIndexBuilderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RelationalIndexBuilderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RelationalIndexBuilderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RelationalIndexBuilderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RelationalIndexBuilderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public RelationalIndexBuilderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean CanSetDatabaseName(IConventionIndexBuilder indexBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetDatabaseName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetFilter(IConventionIndexBuilder indexBuilder, java.lang.String sql, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetFilter", indexBuilder == null ? null : indexBuilder.getJCOInstance(), sql, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean CanSetName(IConventionIndexBuilder indexBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanSetName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionIndexBuilder HasDatabaseName(IConventionIndexBuilder indexBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDatabaseName = (JCObject)classType.Invoke("HasDatabaseName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name, fromDataAnnotation);
            return new IConventionIndexBuilderImplementation(objHasDatabaseName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionIndexBuilder HasFilter(IConventionIndexBuilder indexBuilder, java.lang.String sql, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasFilter = (JCObject)classType.Invoke("HasFilter", indexBuilder == null ? null : indexBuilder.getJCOInstance(), sql, fromDataAnnotation);
            return new IConventionIndexBuilderImplementation(objHasFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IConventionIndexBuilder HasName(IConventionIndexBuilder indexBuilder, java.lang.String name, boolean fromDataAnnotation) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasName = (JCObject)classType.Invoke("HasName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name, fromDataAnnotation);
            return new IConventionIndexBuilderImplementation(objHasName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IndexBuilder HasDatabaseName(IndexBuilder indexBuilder, java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasDatabaseName = (JCObject)classType.Invoke("HasDatabaseName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name);
            return new IndexBuilder(objHasDatabaseName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IndexBuilder HasFilter(IndexBuilder indexBuilder, java.lang.String sql) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasFilter = (JCObject)classType.Invoke("HasFilter", indexBuilder == null ? null : indexBuilder.getJCOInstance(), sql);
            return new IndexBuilder(objHasFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IndexBuilder HasName(IndexBuilder indexBuilder, java.lang.String name) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHasName = (JCObject)classType.Invoke("HasName", indexBuilder == null ? null : indexBuilder.getJCOInstance(), name);
            return new IndexBuilder(objHasName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}