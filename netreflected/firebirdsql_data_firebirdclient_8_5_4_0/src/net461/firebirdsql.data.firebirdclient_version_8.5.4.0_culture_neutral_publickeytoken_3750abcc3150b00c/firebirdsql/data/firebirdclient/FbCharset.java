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
 * The base .NET class managing FirebirdSql.Data.FirebirdClient.FbCharset, FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbCharset" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.FirebirdClient.FbCharset</a>
 */
public class FbCharset extends NetObject  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.FirebirdClient.FbCharset
     */
    public static final String className = "FirebirdSql.Data.FirebirdClient.FbCharset";
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
    public FbCharset(java.lang.Object instance) {
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

    public FbCharset() {
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

    final static FbCharset getFrom(JCEnum object, String value) {
        try {
            return new FbCharset(object.fromValue(value));
        } catch (JCException e) {
            return new FbCharset(object);
        }
    }

    // Enum fields section
    
    public static FbCharset None = getFrom(enumReflected, "None");
    public static FbCharset Octets = getFrom(enumReflected, "Octets");
    public static FbCharset Ascii = getFrom(enumReflected, "Ascii");
    public static FbCharset UnicodeFss = getFrom(enumReflected, "UnicodeFss");
    public static FbCharset Utf8 = getFrom(enumReflected, "Utf8");
    public static FbCharset ShiftJis0208 = getFrom(enumReflected, "ShiftJis0208");
    public static FbCharset EucJapanese0208 = getFrom(enumReflected, "EucJapanese0208");
    public static FbCharset Iso2022Japanese = getFrom(enumReflected, "Iso2022Japanese");
    public static FbCharset Dos437 = getFrom(enumReflected, "Dos437");
    public static FbCharset Dos850 = getFrom(enumReflected, "Dos850");
    public static FbCharset Dos865 = getFrom(enumReflected, "Dos865");
    public static FbCharset Dos860 = getFrom(enumReflected, "Dos860");
    public static FbCharset Dos863 = getFrom(enumReflected, "Dos863");
    public static FbCharset Iso8859_1 = getFrom(enumReflected, "Iso8859_1");
    public static FbCharset Iso8859_2 = getFrom(enumReflected, "Iso8859_2");
    public static FbCharset Ksc5601 = getFrom(enumReflected, "Ksc5601");
    public static FbCharset Dos861 = getFrom(enumReflected, "Dos861");
    public static FbCharset Windows1250 = getFrom(enumReflected, "Windows1250");
    public static FbCharset Windows1251 = getFrom(enumReflected, "Windows1251");
    public static FbCharset Windows1252 = getFrom(enumReflected, "Windows1252");
    public static FbCharset Windows1253 = getFrom(enumReflected, "Windows1253");
    public static FbCharset Windows1254 = getFrom(enumReflected, "Windows1254");
    public static FbCharset Big5 = getFrom(enumReflected, "Big5");
    public static FbCharset Gb2312 = getFrom(enumReflected, "Gb2312");
    public static FbCharset Windows1255 = getFrom(enumReflected, "Windows1255");
    public static FbCharset Windows1256 = getFrom(enumReflected, "Windows1256");
    public static FbCharset Windows1257 = getFrom(enumReflected, "Windows1257");
    public static FbCharset Koi8R = getFrom(enumReflected, "Koi8R");
    public static FbCharset Koi8U = getFrom(enumReflected, "Koi8U");
    public static FbCharset TIS620 = getFrom(enumReflected, "TIS620");
    public static FbCharset Default = getFrom(enumReflected, "Default");


    // Flags management section


}