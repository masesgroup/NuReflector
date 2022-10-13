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

package npgsql.internal.typehandlers.networkhandlers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import npgsql.postgrestypes.PostgresType;
import npgsqltypes.NpgsqlInet;
import npgsql.NpgsqlParameter;
import npgsql.internal.typehandling.NpgsqlLengthCache;
import system.threading.tasks.Task;
import npgsql.internal.NpgsqlWriteBuffer;
import system.threading.CancellationToken;


/**
 * The base .NET class managing Npgsql.Internal.TypeHandlers.NetworkHandlers.CidrHandler, Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Internal.TypeHandlers.NetworkHandlers.CidrHandler" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Npgsql.Internal.TypeHandlers.NetworkHandlers.CidrHandler</a>
 */
public class CidrHandler extends NetObject  {
    /**
     * Fully assembly qualified name: Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7
     */
    public static final String assemblyFullName = "Npgsql, Version=6.0.7.0, Culture=neutral, PublicKeyToken=5d8b90d52f46fda7";
    /**
     * Assembly name: Npgsql
     */
    public static final String assemblyShortName = "Npgsql";
    /**
     * Qualified class name: Npgsql.Internal.TypeHandlers.NetworkHandlers.CidrHandler
     */
    public static final String className = "Npgsql.Internal.TypeHandlers.NetworkHandlers.CidrHandler";
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
    public CidrHandler(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CidrHandler}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CidrHandler} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CidrHandler cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CidrHandler(from.getJCOInstance());
    }

    // Constructors section
    
    public CidrHandler() throws Throwable {
    }

    public CidrHandler(PostgresType pgType) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pgType == null ? null : pgType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public int ValidateAndGetLength(NpgsqlInet value, NpgsqlParameter parameter) throws Throwable, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ValidateAndGetLength", value == null ? null : value.getJCOInstance(), parameter == null ? null : parameter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ValidateObjectAndGetLength(NetObject value, JCORefOut<NpgsqlLengthCache> lengthCache, NpgsqlParameter parameter) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ValidateObjectAndGetLength", value == null ? null : value.getJCOInstance(), lengthCache.getJCRefOut(), parameter == null ? null : parameter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteObjectWithLength(NetObject value, NpgsqlWriteBuffer buf, NpgsqlLengthCache lengthCache, NpgsqlParameter parameter, boolean async, CancellationToken cancellationToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.PlatformNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteObjectWithLength = (JCObject)classInstance.Invoke("WriteObjectWithLength", value == null ? null : value.getJCOInstance(), buf == null ? null : buf.getJCOInstance(), lengthCache == null ? null : lengthCache.getJCOInstance(), parameter == null ? null : parameter.getJCOInstance(), async, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteObjectWithLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(NpgsqlInet value, NpgsqlWriteBuffer buf, NpgsqlParameter parameter) throws Throwable, system.InvalidOperationException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidCastException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", value == null ? null : value.getJCOInstance(), buf == null ? null : buf.getJCOInstance(), parameter == null ? null : parameter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}