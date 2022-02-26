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

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutCode, Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutCode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutCode</a>
 */
public class LayoutCode extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Serialization.HybridRow
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Serialization.HybridRow";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutCode
     */
    public static final String className = "Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.LayoutCode";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public LayoutCode(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public LayoutCode() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    public JCType getJCOType() {
        return classType;
    }

    final static LayoutCode getFrom(JCEnum object, String value) {
        try {
            return new LayoutCode(object.fromValue(value));
        } catch (JCException e) {
            return new LayoutCode(object);
        }
    }

    // Enum fields section
    
    public static LayoutCode Invalid = getFrom(enumReflected, "Invalid");
    public static LayoutCode Null = getFrom(enumReflected, "Null");
    public static LayoutCode BooleanFalse = getFrom(enumReflected, "BooleanFalse");
    public static LayoutCode Boolean = getFrom(enumReflected, "Boolean");
    public static LayoutCode Int8 = getFrom(enumReflected, "Int8");
    public static LayoutCode Int16 = getFrom(enumReflected, "Int16");
    public static LayoutCode Int32 = getFrom(enumReflected, "Int32");
    public static LayoutCode Int64 = getFrom(enumReflected, "Int64");
    public static LayoutCode UInt8 = getFrom(enumReflected, "UInt8");
    public static LayoutCode UInt16 = getFrom(enumReflected, "UInt16");
    public static LayoutCode UInt32 = getFrom(enumReflected, "UInt32");
    public static LayoutCode UInt64 = getFrom(enumReflected, "UInt64");
    public static LayoutCode VarInt = getFrom(enumReflected, "VarInt");
    public static LayoutCode VarUInt = getFrom(enumReflected, "VarUInt");
    public static LayoutCode Float32 = getFrom(enumReflected, "Float32");
    public static LayoutCode Float64 = getFrom(enumReflected, "Float64");
    public static LayoutCode Decimal = getFrom(enumReflected, "Decimal");
    public static LayoutCode DateTime = getFrom(enumReflected, "DateTime");
    public static LayoutCode Guid = getFrom(enumReflected, "Guid");
    public static LayoutCode Utf8 = getFrom(enumReflected, "Utf8");
    public static LayoutCode Binary = getFrom(enumReflected, "Binary");
    public static LayoutCode Float128 = getFrom(enumReflected, "Float128");
    public static LayoutCode UnixDateTime = getFrom(enumReflected, "UnixDateTime");
    public static LayoutCode MongoDbObjectId = getFrom(enumReflected, "MongoDbObjectId");
    public static LayoutCode ObjectScope = getFrom(enumReflected, "ObjectScope");
    public static LayoutCode ImmutableObjectScope = getFrom(enumReflected, "ImmutableObjectScope");
    public static LayoutCode ArrayScope = getFrom(enumReflected, "ArrayScope");
    public static LayoutCode ImmutableArrayScope = getFrom(enumReflected, "ImmutableArrayScope");
    public static LayoutCode TypedArrayScope = getFrom(enumReflected, "TypedArrayScope");
    public static LayoutCode ImmutableTypedArrayScope = getFrom(enumReflected, "ImmutableTypedArrayScope");
    public static LayoutCode TupleScope = getFrom(enumReflected, "TupleScope");
    public static LayoutCode ImmutableTupleScope = getFrom(enumReflected, "ImmutableTupleScope");
    public static LayoutCode TypedTupleScope = getFrom(enumReflected, "TypedTupleScope");
    public static LayoutCode ImmutableTypedTupleScope = getFrom(enumReflected, "ImmutableTypedTupleScope");
    public static LayoutCode MapScope = getFrom(enumReflected, "MapScope");
    public static LayoutCode ImmutableMapScope = getFrom(enumReflected, "ImmutableMapScope");
    public static LayoutCode TypedMapScope = getFrom(enumReflected, "TypedMapScope");
    public static LayoutCode ImmutableTypedMapScope = getFrom(enumReflected, "ImmutableTypedMapScope");
    public static LayoutCode SetScope = getFrom(enumReflected, "SetScope");
    public static LayoutCode ImmutableSetScope = getFrom(enumReflected, "ImmutableSetScope");
    public static LayoutCode TypedSetScope = getFrom(enumReflected, "TypedSetScope");
    public static LayoutCode ImmutableTypedSetScope = getFrom(enumReflected, "ImmutableTypedSetScope");
    public static LayoutCode NullableScope = getFrom(enumReflected, "NullableScope");
    public static LayoutCode ImmutableNullableScope = getFrom(enumReflected, "ImmutableNullableScope");
    public static LayoutCode TaggedScope = getFrom(enumReflected, "TaggedScope");
    public static LayoutCode ImmutableTaggedScope = getFrom(enumReflected, "ImmutableTaggedScope");
    public static LayoutCode Tagged2Scope = getFrom(enumReflected, "Tagged2Scope");
    public static LayoutCode ImmutableTagged2Scope = getFrom(enumReflected, "ImmutableTagged2Scope");
    public static LayoutCode Schema = getFrom(enumReflected, "Schema");
    public static LayoutCode ImmutableSchema = getFrom(enumReflected, "ImmutableSchema");
    public static LayoutCode EndScope = getFrom(enumReflected, "EndScope");


    // Flags management section


}