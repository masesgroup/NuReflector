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

package pomelo.entityframeworkcore.mysql.infrastructure;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.entityframeworkcore.ServerVersion;


/**
 * The base .NET class managing Pomelo.EntityFrameworkCore.MySql.Infrastructure.ServerVersionSupport, Pomelo.EntityFrameworkCore.MySql, Version=6.0.1.0, Culture=neutral, PublicKeyToken=2cc498582444921b.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Infrastructure.ServerVersionSupport" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Infrastructure.ServerVersionSupport</a>
 */
public class ServerVersionSupport extends NetObject  {
    /**
     * Fully assembly qualified name: Pomelo.EntityFrameworkCore.MySql, Version=6.0.1.0, Culture=neutral, PublicKeyToken=2cc498582444921b
     */
    public static final String assemblyFullName = "Pomelo.EntityFrameworkCore.MySql, Version=6.0.1.0, Culture=neutral, PublicKeyToken=2cc498582444921b";
    /**
     * Assembly name: Pomelo.EntityFrameworkCore.MySql
     */
    public static final String assemblyShortName = "Pomelo.EntityFrameworkCore.MySql";
    /**
     * Qualified class name: Pomelo.EntityFrameworkCore.MySql.Infrastructure.ServerVersionSupport
     */
    public static final String className = "Pomelo.EntityFrameworkCore.MySql.Infrastructure.ServerVersionSupport";
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
    public ServerVersionSupport(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServerVersionSupport}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServerVersionSupport} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServerVersionSupport cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServerVersionSupport(from.getJCOInstance());
    }

    // Constructors section
    
    public ServerVersionSupport() throws Throwable {
    }

    public ServerVersionSupport(ServerVersion serverVersion) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverVersion == null ? null : serverVersion.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean PropertyOrVersion(java.lang.String propertyNameOrServerVersion) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.text.regularexpressions.RegexMatchTimeoutException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("PropertyOrVersion", propertyNameOrServerVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Version(ServerVersion serverVersion) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Version", serverVersion == null ? null : serverVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Version(java.lang.String versionString) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Version", versionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAlternativeDefaultExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AlternativeDefaultExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCrossApply() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CrossApply");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDateTime6() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DateTime6");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDateTimeCurrentTimestamp() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DateTimeCurrentTimestamp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDefaultCharSetUtf8Mb4() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DefaultCharSetUtf8Mb4");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDefaultExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DefaultExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDoubleCast() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DoubleCast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExceptIntercept() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExceptIntercept");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExceptInterceptPrecedence() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExceptInterceptPrecedence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFloatCast() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FloatCast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFullTextParser() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FullTextParser");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGeneratedColumns() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GeneratedColumns");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIdentifyJsonColumsByCheckConstraints() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IdentifyJsonColumsByCheckConstraints");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getImplicitBoolCheckUsesIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ImplicitBoolCheckUsesIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInformationSchemaCheckConstraintsTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("InformationSchemaCheckConstraintsTable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getJson() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Json");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getJsonDataTypeEmulation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("JsonDataTypeEmulation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLargerKeyLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LargerKeyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMySqlBug104294Workaround() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("MySqlBug104294Workaround");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMySqlBug96947Workaround() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("MySqlBug96947Workaround");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMySqlBugLimit0Offset0ExistsWorkaround() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("MySqlBugLimit0Offset0ExistsWorkaround");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNullableGeneratedColumns() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("NullableGeneratedColumns");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOuterApply() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OuterApply");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOuterReferenceInMultiLevelSubquery() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("OuterReferenceInMultiLevelSubquery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getParenthesisEnclosedGeneratedColumnExpressions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ParenthesisEnclosedGeneratedColumnExpressions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRenameColumn() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RenameColumn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRenameIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RenameIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSequences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Sequences");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialDistanceFunctionImplementsAndoyer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialDistanceFunctionImplementsAndoyer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialDistanceSphereFunction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialDistanceSphereFunction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialFunctionAdditions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialFunctionAdditions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialGeographic() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialGeographic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialIndexes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialIndexes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialReferenceSystemRestrictedColumns() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialReferenceSystemRestrictedColumns");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialSetSridFunction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialSetSridFunction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSpatialSupportFunctionAdditions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SpatialSupportFunctionAdditions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getWindowFunctions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("WindowFunctions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServerVersion getServerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerVersion");
            return new ServerVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}