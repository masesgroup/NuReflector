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
import system.data.entity.modelconfiguration.configuration.AssociationMappingConfiguration;
import system.data.entity.modelconfiguration.configuration.ManyToManyAssociationMappingConfiguration;


/**
 * The base .NET class managing System.Data.Entity.ModelConfiguration.Configuration.ManyToManyAssociationMappingConfiguration, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.ModelConfiguration.Configuration.ManyToManyAssociationMappingConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.ModelConfiguration.Configuration.ManyToManyAssociationMappingConfiguration</a>
 */
public class ManyToManyAssociationMappingConfiguration extends AssociationMappingConfiguration  {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.ModelConfiguration.Configuration.ManyToManyAssociationMappingConfiguration
     */
    public static final String className = "System.Data.Entity.ModelConfiguration.Configuration.ManyToManyAssociationMappingConfiguration";
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
    public ManyToManyAssociationMappingConfiguration(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ManyToManyAssociationMappingConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ManyToManyAssociationMappingConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ManyToManyAssociationMappingConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ManyToManyAssociationMappingConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public ManyToManyAssociationMappingConfiguration() throws Throwable {
    }



    
    // Methods section
    
    public boolean Equals(ManyToManyAssociationMappingConfiguration other) throws Throwable, system.NotSupportedException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration HasTableAnnotation(java.lang.String name, NetObject value) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHasTableAnnotation = (JCObject)classInstance.Invoke("HasTableAnnotation", name, value == null ? null : value.getJCOInstance());
            return new ManyToManyAssociationMappingConfiguration(objHasTableAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration MapLeftKey(java.lang.String... keyColumnNames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapLeftKey = (JCObject)classInstance.Invoke("MapLeftKey", (java.lang.Object)keyColumnNames);
            return new ManyToManyAssociationMappingConfiguration(objMapLeftKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration MapLeftKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapLeftKey = (JCObject)classInstance.Invoke("MapLeftKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new ManyToManyAssociationMappingConfiguration(objMapLeftKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration MapRightKey(java.lang.String... keyColumnNames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapRightKey = (JCObject)classInstance.Invoke("MapRightKey", (java.lang.Object)keyColumnNames);
            return new ManyToManyAssociationMappingConfiguration(objMapRightKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration MapRightKey(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapRightKey = (JCObject)classInstance.Invoke("MapRightKey", (java.lang.Object)dupParam0.getJCRefOut());
            return new ManyToManyAssociationMappingConfiguration(objMapRightKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration ToTable(java.lang.String tableName, java.lang.String schemaName) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable", tableName, schemaName);
            return new ManyToManyAssociationMappingConfiguration(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManyToManyAssociationMappingConfiguration ToTable(java.lang.String tableName) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable", tableName);
            return new ManyToManyAssociationMappingConfiguration(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}