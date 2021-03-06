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

package microsoft.azure.cosmos.serialization.hybridrow.layouts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.cosmos.serialization.hybridrow.Result;
import microsoft.azure.cosmos.serialization.hybridrow.RowBuffer;
import microsoft.azure.cosmos.serialization.hybridrow.RowCursor;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.LayoutColumn;
import system.SByte;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.UpdateOptions;


/**
 * The base .NET class managing Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutInt8, Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutInt8" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutInt8</a>
 */
public class LayoutInt8 extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Serialization.HybridRow
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Serialization.HybridRow";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutInt8
     */
    public static final String className = "Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutInt8";
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
    public LayoutInt8(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LayoutInt8}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LayoutInt8} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LayoutInt8 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LayoutInt8(from.getJCOInstance());
    }

    // Constructors section
    
    public LayoutInt8() throws Throwable {
    }



    
    // Methods section
    
    public Result ReadFixed(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> scope, LayoutColumn col, JCORefOut<SByte> value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.FormatException, microsoft.azure.cosmos.core.ContractViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadFixed = (JCObject)classInstance.Invoke("ReadFixed", b.getJCRefOut(), scope.getJCRefOut(), col == null ? null : col.getJCOInstance(), value.getJCRefOut());
            return new Result(objReadFixed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result ReadSparse(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> edit, JCORefOut<SByte> value) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSparse = (JCObject)classInstance.Invoke("ReadSparse", b.getJCRefOut(), edit.getJCRefOut(), value.getJCRefOut());
            return new Result(objReadSparse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result WriteFixed(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> scope, LayoutColumn col, SByte value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.FormatException, microsoft.azure.cosmos.core.ContractViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteFixed = (JCObject)classInstance.Invoke("WriteFixed", b.getJCRefOut(), scope.getJCRefOut(), col == null ? null : col.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new Result(objWriteFixed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Result WriteSparse(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> edit, SByte value, UpdateOptions options) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, microsoft.azure.cosmos.core.ContractViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteSparse = (JCObject)classInstance.Invoke("WriteSparse", b.getJCRefOut(), edit.getJCRefOut(), value == null ? null : value.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new Result(objWriteSparse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}