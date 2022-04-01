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
import microsoft.entityframeworkcore.metadata.IReadOnlyProperty;
import microsoft.entityframeworkcore.metadata.IReadOnlyPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IReadOnlySequence;
import microsoft.entityframeworkcore.metadata.IReadOnlySequenceImplementation;
import microsoft.entityframeworkcore.metadata.StoreObjectIdentifier;
import microsoft.entityframeworkcore.metadata.ISequence;
import microsoft.entityframeworkcore.metadata.ISequenceImplementation;
import microsoft.entityframeworkcore.metadata.IProperty;
import microsoft.entityframeworkcore.metadata.IPropertyImplementation;
import microsoft.entityframeworkcore.metadata.SqlServerValueGenerationStrategy;
import microsoft.entityframeworkcore.metadata.IConventionProperty;
import microsoft.entityframeworkcore.metadata.IConventionPropertyImplementation;
import microsoft.entityframeworkcore.metadata.IMutableProperty;
import microsoft.entityframeworkcore.metadata.IMutablePropertyImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.SqlServerPropertyExtensions, Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerPropertyExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.SqlServerPropertyExtensions</a>
 */
public class SqlServerPropertyExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore.SqlServer, Version=6.0.3.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore.SqlServer
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore.SqlServer";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.SqlServerPropertyExtensions
     */
    public static final String className = "Microsoft.EntityFrameworkCore.SqlServerPropertyExtensions";
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
    public SqlServerPropertyExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlServerPropertyExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlServerPropertyExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlServerPropertyExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlServerPropertyExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlServerPropertyExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsCompatibleWithValueGeneration(IReadOnlyProperty property) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsCompatibleWithValueGeneration", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlySequence FindHiLoSequence(IReadOnlyProperty property, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindHiLoSequence = (JCObject)classType.Invoke("FindHiLoSequence", property == null ? null : property.getJCOInstance(), storeObject.getJCRefOut());
            return new IReadOnlySequenceImplementation(objFindHiLoSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IReadOnlySequence FindHiLoSequence(IReadOnlyProperty property) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindHiLoSequence = (JCObject)classType.Invoke("FindHiLoSequence", property == null ? null : property.getJCOInstance());
            return new IReadOnlySequenceImplementation(objFindHiLoSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ISequence FindHiLoSequence(IProperty property, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindHiLoSequence = (JCObject)classType.Invoke("FindHiLoSequence", property == null ? null : property.getJCOInstance(), storeObject.getJCRefOut());
            return new ISequenceImplementation(objFindHiLoSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ISequence FindHiLoSequence(IProperty property) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindHiLoSequence = (JCObject)classType.Invoke("FindHiLoSequence", property == null ? null : property.getJCOInstance());
            return new ISequenceImplementation(objFindHiLoSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlServerValueGenerationStrategy GetValueGenerationStrategy(IReadOnlyProperty property, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.OutOfMemoryException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetValueGenerationStrategy = (JCObject)classType.Invoke("GetValueGenerationStrategy", property == null ? null : property.getJCOInstance(), storeObject.getJCRefOut());
            return new SqlServerValueGenerationStrategy(objGetValueGenerationStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlServerValueGenerationStrategy GetValueGenerationStrategy(IReadOnlyProperty property) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetValueGenerationStrategy = (JCObject)classType.Invoke("GetValueGenerationStrategy", property == null ? null : property.getJCOInstance());
            return new SqlServerValueGenerationStrategy(objGetValueGenerationStrategy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHiLoSequenceName(IReadOnlyProperty property, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHiLoSequenceName", property == null ? null : property.getJCOInstance(), storeObject.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHiLoSequenceName(IReadOnlyProperty property) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHiLoSequenceName", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHiLoSequenceSchema(IReadOnlyProperty property, JCORefOut<StoreObjectIdentifier> storeObject) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHiLoSequenceSchema", property == null ? null : property.getJCOInstance(), storeObject.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetHiLoSequenceSchema(IReadOnlyProperty property) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetHiLoSequenceSchema", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetHiLoSequenceName(IConventionProperty property, java.lang.String name, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetHiLoSequenceName", property == null ? null : property.getJCOInstance(), name, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String SetHiLoSequenceSchema(IConventionProperty property, java.lang.String schema, boolean fromDataAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("SetHiLoSequenceSchema", property == null ? null : property.getJCOInstance(), schema, fromDataAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetHiLoSequenceName(IMutableProperty property, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetHiLoSequenceName", property == null ? null : property.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetHiLoSequenceSchema(IMutableProperty property, java.lang.String schema) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetHiLoSequenceSchema", property == null ? null : property.getJCOInstance(), schema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}