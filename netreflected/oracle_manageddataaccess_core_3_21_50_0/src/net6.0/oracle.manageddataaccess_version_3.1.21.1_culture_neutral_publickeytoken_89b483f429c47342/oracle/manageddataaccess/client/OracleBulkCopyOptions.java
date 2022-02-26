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

package oracle.manageddataaccess.client;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Oracle.ManagedDataAccess.Client.OracleBulkCopyOptions, Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Client.OracleBulkCopyOptions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Oracle.ManagedDataAccess.Client.OracleBulkCopyOptions</a>
 */
public class OracleBulkCopyOptions extends NetObject  {
    /**
     * Fully assembly qualified name: Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.ManagedDataAccess
     */
    public static final String assemblyShortName = "Oracle.ManagedDataAccess";
    /**
     * Qualified class name: Oracle.ManagedDataAccess.Client.OracleBulkCopyOptions
     */
    public static final String className = "Oracle.ManagedDataAccess.Client.OracleBulkCopyOptions";
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
    public OracleBulkCopyOptions(java.lang.Object instance) {
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

    public OracleBulkCopyOptions() {
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

    final static OracleBulkCopyOptions getFrom(JCEnum object, String value) {
        try {
            return new OracleBulkCopyOptions(object.fromValue(value));
        } catch (JCException e) {
            return new OracleBulkCopyOptions(object);
        }
    }

    // Enum fields section
    
    public static OracleBulkCopyOptions Default = getFrom(enumReflected, "Default");
    public static OracleBulkCopyOptions UseInternalTransaction = getFrom(enumReflected, "UseInternalTransaction");


    // Flags management section

    public final OracleBulkCopyOptions add(OracleBulkCopyOptions val) throws Throwable {
        return new OracleBulkCopyOptions(NetEnum.add(classInstance, val.classInstance));
    }

    public final OracleBulkCopyOptions remove(OracleBulkCopyOptions val) throws Throwable {
        return new OracleBulkCopyOptions(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(OracleBulkCopyOptions val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(OracleBulkCopyOptions val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}