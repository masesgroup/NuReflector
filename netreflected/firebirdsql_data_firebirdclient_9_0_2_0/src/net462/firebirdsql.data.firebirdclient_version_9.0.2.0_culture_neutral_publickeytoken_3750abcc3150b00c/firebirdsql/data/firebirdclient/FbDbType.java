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

package firebirdsql.data.firebirdclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing FirebirdSql.Data.FirebirdClient.FbDbType, FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbDbType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbDbType</a>
 */
public class FbDbType extends NetObject  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=9.0.2.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.FirebirdClient.FbDbType
     */
    public static final String className = "FirebirdSql.Data.FirebirdClient.FbDbType";
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
    public FbDbType(java.lang.Object instance) {
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

    public FbDbType() {
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

    final static FbDbType getFrom(JCEnum object, String value) {
        try {
            return new FbDbType(object.fromValue(value));
        } catch (JCException e) {
            return new FbDbType(object);
        }
    }

    // Enum fields section
    
    public static FbDbType Array = getFrom(enumReflected, "Array");
    public static FbDbType BigInt = getFrom(enumReflected, "BigInt");
    public static FbDbType Binary = getFrom(enumReflected, "Binary");
    public static FbDbType Boolean = getFrom(enumReflected, "Boolean");
    public static FbDbType Char = getFrom(enumReflected, "Char");
    public static FbDbType Date = getFrom(enumReflected, "Date");
    public static FbDbType Decimal = getFrom(enumReflected, "Decimal");
    public static FbDbType Double = getFrom(enumReflected, "Double");
    public static FbDbType Float = getFrom(enumReflected, "Float");
    public static FbDbType Guid = getFrom(enumReflected, "Guid");
    public static FbDbType Integer = getFrom(enumReflected, "Integer");
    public static FbDbType Numeric = getFrom(enumReflected, "Numeric");
    public static FbDbType SmallInt = getFrom(enumReflected, "SmallInt");
    public static FbDbType Text = getFrom(enumReflected, "Text");
    public static FbDbType Time = getFrom(enumReflected, "Time");
    public static FbDbType TimeStamp = getFrom(enumReflected, "TimeStamp");
    public static FbDbType VarChar = getFrom(enumReflected, "VarChar");
    public static FbDbType TimeStampTZ = getFrom(enumReflected, "TimeStampTZ");
    public static FbDbType TimeStampTZEx = getFrom(enumReflected, "TimeStampTZEx");
    public static FbDbType TimeTZ = getFrom(enumReflected, "TimeTZ");
    public static FbDbType TimeTZEx = getFrom(enumReflected, "TimeTZEx");
    public static FbDbType Dec16 = getFrom(enumReflected, "Dec16");
    public static FbDbType Dec34 = getFrom(enumReflected, "Dec34");
    public static FbDbType Int128 = getFrom(enumReflected, "Int128");


    // Flags management section


}