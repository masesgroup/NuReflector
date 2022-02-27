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

package microsoft.azure.cosmos.serialization.hybridrow.schemas;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import microsoft.azure.cosmos.serialization.hybridrow.Result;
import microsoft.azure.cosmos.serialization.hybridrow.RowBuffer;
import microsoft.azure.cosmos.serialization.hybridrow.RowCursor;
import microsoft.azure.cosmos.serialization.hybridrow.schemas.PartitionKey;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.TypeArgumentList;


/**
 * The base .NET class managing Microsoft.Azure.Cosmos.Serialization.HybridRow.Schemas.PartitionKeyHybridRowSerializer, Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Schemas.PartitionKeyHybridRowSerializer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Schemas.PartitionKeyHybridRowSerializer</a>
 */
public class PartitionKeyHybridRowSerializer extends ValueType  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Serialization.HybridRow
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Serialization.HybridRow";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.Serialization.HybridRow.Schemas.PartitionKeyHybridRowSerializer
     */
    public static final String className = "Microsoft.Azure.Cosmos.Serialization.HybridRow.Schemas.PartitionKeyHybridRowSerializer";
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
    public PartitionKeyHybridRowSerializer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PartitionKeyHybridRowSerializer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PartitionKeyHybridRowSerializer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PartitionKeyHybridRowSerializer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PartitionKeyHybridRowSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    public PartitionKeyHybridRowSerializer() throws Throwable {
    }



    
    // Methods section
    
    public Result Read(JCORefOut<RowBuffer> row, JCORefOut<RowCursor> scope, boolean isRoot, JCORefOut<PartitionKey> value) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, microsoft.azure.cosmos.core.ContractViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRead = (JCObject)classInstance.Invoke("Read", row.getJCRefOut(), scope.getJCRefOut(), isRoot, value.getJCRefOut());
            return new Result(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result Write(JCORefOut<RowBuffer> row, JCORefOut<RowCursor> scope, boolean isRoot, TypeArgumentList typeArgs, PartitionKey value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, microsoft.azure.cosmos.core.ContractViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWrite = (JCObject)classInstance.Invoke("Write", row.getJCRefOut(), scope.getJCRefOut(), isRoot, typeArgs == null ? null : typeArgs.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new Result(objWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}