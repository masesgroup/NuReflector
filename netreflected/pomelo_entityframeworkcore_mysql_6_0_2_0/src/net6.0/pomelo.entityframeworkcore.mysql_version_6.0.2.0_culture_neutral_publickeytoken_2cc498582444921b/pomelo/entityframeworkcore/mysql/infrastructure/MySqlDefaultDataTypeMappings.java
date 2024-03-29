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
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlDefaultDataTypeMappings;
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlBooleanType;
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlDateTimeType;
import pomelo.entityframeworkcore.mysql.infrastructure.MySqlTimeSpanType;


/**
 * The base .NET class managing Pomelo.EntityFrameworkCore.MySql.Infrastructure.MySqlDefaultDataTypeMappings, Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Infrastructure.MySqlDefaultDataTypeMappings" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Pomelo.EntityFrameworkCore.MySql.Infrastructure.MySqlDefaultDataTypeMappings</a>
 */
public class MySqlDefaultDataTypeMappings extends NetObject  {
    /**
     * Fully assembly qualified name: Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b
     */
    public static final String assemblyFullName = "Pomelo.EntityFrameworkCore.MySql, Version=6.0.2.0, Culture=neutral, PublicKeyToken=2cc498582444921b";
    /**
     * Assembly name: Pomelo.EntityFrameworkCore.MySql
     */
    public static final String assemblyShortName = "Pomelo.EntityFrameworkCore.MySql";
    /**
     * Qualified class name: Pomelo.EntityFrameworkCore.MySql.Infrastructure.MySqlDefaultDataTypeMappings
     */
    public static final String className = "Pomelo.EntityFrameworkCore.MySql.Infrastructure.MySqlDefaultDataTypeMappings";
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
    public MySqlDefaultDataTypeMappings(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MySqlDefaultDataTypeMappings}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MySqlDefaultDataTypeMappings} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MySqlDefaultDataTypeMappings cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MySqlDefaultDataTypeMappings(from.getJCOInstance());
    }

    // Constructors section
    
    public MySqlDefaultDataTypeMappings() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public MySqlDefaultDataTypeMappings WithClrBoolean(MySqlBooleanType mysqlBooleanType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClrBoolean = (JCObject)classInstance.Invoke("WithClrBoolean", mysqlBooleanType == null ? null : mysqlBooleanType.getJCOInstance());
            return new MySqlDefaultDataTypeMappings(objWithClrBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDefaultDataTypeMappings WithClrDateTime(MySqlDateTimeType mysqlDateTimeType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClrDateTime = (JCObject)classInstance.Invoke("WithClrDateTime", mysqlDateTimeType == null ? null : mysqlDateTimeType.getJCOInstance());
            return new MySqlDefaultDataTypeMappings(objWithClrDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDefaultDataTypeMappings WithClrDateTimeOffset(MySqlDateTimeType mysqlDateTimeType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClrDateTimeOffset = (JCObject)classInstance.Invoke("WithClrDateTimeOffset", mysqlDateTimeType == null ? null : mysqlDateTimeType.getJCOInstance());
            return new MySqlDefaultDataTypeMappings(objWithClrDateTimeOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDefaultDataTypeMappings WithClrTimeSpan(MySqlTimeSpanType mysqlTimeSpanType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithClrTimeSpan = (JCObject)classInstance.Invoke("WithClrTimeSpan", mysqlTimeSpanType == null ? null : mysqlTimeSpanType.getJCOInstance());
            return new MySqlDefaultDataTypeMappings(objWithClrTimeSpan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getClrTimeOnlyPrecision() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ClrTimeOnlyPrecision");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrTimeOnlyPrecision(int ClrTimeOnlyPrecision) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrTimeOnlyPrecision", ClrTimeOnlyPrecision);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlBooleanType getClrBoolean() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrBoolean");
            return new MySqlBooleanType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrBoolean(MySqlBooleanType ClrBoolean) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrBoolean", ClrBoolean == null ? null : ClrBoolean.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDateTimeType getClrDateTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrDateTime");
            return new MySqlDateTimeType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrDateTime(MySqlDateTimeType ClrDateTime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrDateTime", ClrDateTime == null ? null : ClrDateTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlDateTimeType getClrDateTimeOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrDateTimeOffset");
            return new MySqlDateTimeType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrDateTimeOffset(MySqlDateTimeType ClrDateTimeOffset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrDateTimeOffset", ClrDateTimeOffset == null ? null : ClrDateTimeOffset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MySqlTimeSpanType getClrTimeSpan() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrTimeSpan");
            return new MySqlTimeSpanType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrTimeSpan(MySqlTimeSpanType ClrTimeSpan) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrTimeSpan", ClrTimeSpan == null ? null : ClrTimeSpan.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}