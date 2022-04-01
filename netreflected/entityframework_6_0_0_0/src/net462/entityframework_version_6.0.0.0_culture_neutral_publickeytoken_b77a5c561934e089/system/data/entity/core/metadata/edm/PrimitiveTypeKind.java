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

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Data.Entity.Core.Metadata.Edm.PrimitiveTypeKind, EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Core.Metadata.Edm.PrimitiveTypeKind" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Entity.Core.Metadata.Edm.PrimitiveTypeKind</a>
 */
public class PrimitiveTypeKind extends NetObject  {
    /**
     * Fully assembly qualified name: EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "EntityFramework, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: EntityFramework
     */
    public static final String assemblyShortName = "EntityFramework";
    /**
     * Qualified class name: System.Data.Entity.Core.Metadata.Edm.PrimitiveTypeKind
     */
    public static final String className = "System.Data.Entity.Core.Metadata.Edm.PrimitiveTypeKind";
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
    public PrimitiveTypeKind(java.lang.Object instance) {
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

    public PrimitiveTypeKind() {
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

    final static PrimitiveTypeKind getFrom(JCEnum object, String value) {
        try {
            return new PrimitiveTypeKind(object.fromValue(value));
        } catch (JCException e) {
            return new PrimitiveTypeKind(object);
        }
    }

    // Enum fields section
    
    public static PrimitiveTypeKind Binary = getFrom(enumReflected, "Binary");
    public static PrimitiveTypeKind Boolean = getFrom(enumReflected, "Boolean");
    public static PrimitiveTypeKind Byte = getFrom(enumReflected, "Byte");
    public static PrimitiveTypeKind DateTime = getFrom(enumReflected, "DateTime");
    public static PrimitiveTypeKind Decimal = getFrom(enumReflected, "Decimal");
    public static PrimitiveTypeKind Double = getFrom(enumReflected, "Double");
    public static PrimitiveTypeKind Guid = getFrom(enumReflected, "Guid");
    public static PrimitiveTypeKind Single = getFrom(enumReflected, "Single");
    public static PrimitiveTypeKind SByte = getFrom(enumReflected, "SByte");
    public static PrimitiveTypeKind Int16 = getFrom(enumReflected, "Int16");
    public static PrimitiveTypeKind Int32 = getFrom(enumReflected, "Int32");
    public static PrimitiveTypeKind Int64 = getFrom(enumReflected, "Int64");
    public static PrimitiveTypeKind String = getFrom(enumReflected, "String");
    public static PrimitiveTypeKind Time = getFrom(enumReflected, "Time");
    public static PrimitiveTypeKind DateTimeOffset = getFrom(enumReflected, "DateTimeOffset");
    public static PrimitiveTypeKind Geometry = getFrom(enumReflected, "Geometry");
    public static PrimitiveTypeKind Geography = getFrom(enumReflected, "Geography");
    public static PrimitiveTypeKind GeometryPoint = getFrom(enumReflected, "GeometryPoint");
    public static PrimitiveTypeKind GeometryLineString = getFrom(enumReflected, "GeometryLineString");
    public static PrimitiveTypeKind GeometryPolygon = getFrom(enumReflected, "GeometryPolygon");
    public static PrimitiveTypeKind GeometryMultiPoint = getFrom(enumReflected, "GeometryMultiPoint");
    public static PrimitiveTypeKind GeometryMultiLineString = getFrom(enumReflected, "GeometryMultiLineString");
    public static PrimitiveTypeKind GeometryMultiPolygon = getFrom(enumReflected, "GeometryMultiPolygon");
    public static PrimitiveTypeKind GeometryCollection = getFrom(enumReflected, "GeometryCollection");
    public static PrimitiveTypeKind GeographyPoint = getFrom(enumReflected, "GeographyPoint");
    public static PrimitiveTypeKind GeographyLineString = getFrom(enumReflected, "GeographyLineString");
    public static PrimitiveTypeKind GeographyPolygon = getFrom(enumReflected, "GeographyPolygon");
    public static PrimitiveTypeKind GeographyMultiPoint = getFrom(enumReflected, "GeographyMultiPoint");
    public static PrimitiveTypeKind GeographyMultiLineString = getFrom(enumReflected, "GeographyMultiLineString");
    public static PrimitiveTypeKind GeographyMultiPolygon = getFrom(enumReflected, "GeographyMultiPolygon");
    public static PrimitiveTypeKind GeographyCollection = getFrom(enumReflected, "GeographyCollection");


    // Flags management section


}