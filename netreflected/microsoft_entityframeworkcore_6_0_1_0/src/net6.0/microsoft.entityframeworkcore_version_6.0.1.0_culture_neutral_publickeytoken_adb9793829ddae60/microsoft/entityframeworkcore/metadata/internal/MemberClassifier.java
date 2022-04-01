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
import microsoft.entityframeworkcore.storage.ITypeMappingSource;
import microsoft.entityframeworkcore.storage.ITypeMappingSourceImplementation;
import microsoft.entityframeworkcore.metadata.IParameterBindingFactories;
import microsoft.entityframeworkcore.metadata.IParameterBindingFactoriesImplementation;
import system.reflection.PropertyInfo;
import microsoft.entityframeworkcore.metadata.IConventionModel;
import microsoft.entityframeworkcore.metadata.IConventionModelImplementation;
import microsoft.entityframeworkcore.metadata.IParameterBindingFactory;
import microsoft.entityframeworkcore.metadata.IParameterBindingFactoryImplementation;
import system.reflection.MemberInfo;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Metadata.Internal.MemberClassifier, Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.MemberClassifier" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Metadata.Internal.MemberClassifier</a>
 */
public class MemberClassifier extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Metadata.Internal.MemberClassifier
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Metadata.Internal.MemberClassifier";
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
    public MemberClassifier(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MemberClassifier}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MemberClassifier} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MemberClassifier cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MemberClassifier(from.getJCOInstance());
    }

    // Constructors section
    
    public MemberClassifier() throws Throwable {
    }

    public MemberClassifier(ITypeMappingSource typeMappingSource, IParameterBindingFactories parameterBindingFactories) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(typeMappingSource == null ? null : typeMappingSource.getJCOInstance(), parameterBindingFactories == null ? null : parameterBindingFactories.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsCandidatePrimitiveProperty(PropertyInfo propertyInfo, IConventionModel model) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsCandidatePrimitiveProperty", propertyInfo == null ? null : propertyInfo.getJCOInstance(), model == null ? null : model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IParameterBindingFactory FindServicePropertyCandidateBindingFactory(PropertyInfo propertyInfo, IConventionModel model) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindServicePropertyCandidateBindingFactory = (JCObject)classInstance.Invoke("FindServicePropertyCandidateBindingFactory", propertyInfo == null ? null : propertyInfo.getJCOInstance(), model == null ? null : model.getJCOInstance());
            return new IParameterBindingFactoryImplementation(objFindServicePropertyCandidateBindingFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}