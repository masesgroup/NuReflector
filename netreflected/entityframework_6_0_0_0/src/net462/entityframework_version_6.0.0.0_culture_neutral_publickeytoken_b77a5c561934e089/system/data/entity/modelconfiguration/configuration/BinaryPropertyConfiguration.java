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

package system.data.entity.modelconfiguration.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.entity.modelconfiguration.configuration.LengthPropertyConfiguration;
import system.data.entity.modelconfiguration.configuration.BinaryPropertyConfiguration;


/**
 * The base .NET class managing System.Data.Entity.ModelConfiguration.Configuration.BinaryPropertyConfiguration, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.ModelConfiguration.Configuration.BinaryPropertyConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.ModelConfiguration.Configuration.BinaryPropertyConfiguration</a>
 */
public class BinaryPropertyConfiguration extends LengthPropertyConfiguration  {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.ModelConfiguration.Configuration.BinaryPropertyConfiguration
     */
    public static final String className = "System.Data.Entity.ModelConfiguration.Configuration.BinaryPropertyConfiguration";
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
    public BinaryPropertyConfiguration(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BinaryPropertyConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BinaryPropertyConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BinaryPropertyConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BinaryPropertyConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public BinaryPropertyConfiguration() throws Throwable {
    }



    
    // Methods section
    
    public BinaryPropertyConfiguration HasColumnNameNewBinaryPropertyConfiguration(java.lang.String columnName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasColumnName = (JCObject)classInstance.Invoke("HasColumnName", columnName);
            return new BinaryPropertyConfiguration(objHasColumnName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration HasColumnTypeNewBinaryPropertyConfiguration(java.lang.String columnType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasColumnType = (JCObject)classInstance.Invoke("HasColumnType", columnType);
            return new BinaryPropertyConfiguration(objHasColumnType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsConcurrencyTokenNewBinaryPropertyConfiguration() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsConcurrencyToken = (JCObject)classInstance.Invoke("IsConcurrencyToken");
            return new BinaryPropertyConfiguration(objIsConcurrencyToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsFixedLengthNewBinaryPropertyConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsFixedLength = (JCObject)classInstance.Invoke("IsFixedLength");
            return new BinaryPropertyConfiguration(objIsFixedLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsMaxLengthNewBinaryPropertyConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsMaxLength = (JCObject)classInstance.Invoke("IsMaxLength");
            return new BinaryPropertyConfiguration(objIsMaxLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsOptionalNewBinaryPropertyConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsOptional = (JCObject)classInstance.Invoke("IsOptional");
            return new BinaryPropertyConfiguration(objIsOptional);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsRequiredNewBinaryPropertyConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsRequired = (JCObject)classInstance.Invoke("IsRequired");
            return new BinaryPropertyConfiguration(objIsRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsRowVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsRowVersion = (JCObject)classInstance.Invoke("IsRowVersion");
            return new BinaryPropertyConfiguration(objIsRowVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryPropertyConfiguration IsVariableLengthNewBinaryPropertyConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIsVariableLength = (JCObject)classInstance.Invoke("IsVariableLength");
            return new BinaryPropertyConfiguration(objIsVariableLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}