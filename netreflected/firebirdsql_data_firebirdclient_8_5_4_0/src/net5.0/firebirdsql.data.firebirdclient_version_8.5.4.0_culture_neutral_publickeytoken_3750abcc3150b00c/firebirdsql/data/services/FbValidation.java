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

package firebirdsql.data.services;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import firebirdsql.data.services.FbService;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import firebirdsql.data.services.FbValidationFlags;


/**
 * The base .NET class managing FirebirdSql.Data.Services.FbValidation, FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Services.FbValidation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/FirebirdSql.Data.Services.FbValidation</a>
 */
public class FbValidation extends FbService  {
    /**
     * Fully assembly qualified name: FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c
     */
    public static final String assemblyFullName = "FirebirdSql.Data.FirebirdClient, Version=8.5.4.0, Culture=neutral, PublicKeyToken=3750abcc3150b00c";
    /**
     * Assembly name: FirebirdSql.Data.FirebirdClient
     */
    public static final String assemblyShortName = "FirebirdSql.Data.FirebirdClient";
    /**
     * Qualified class name: FirebirdSql.Data.Services.FbValidation
     */
    public static final String className = "FirebirdSql.Data.Services.FbValidation";
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
    public FbValidation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FbValidation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FbValidation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FbValidation cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FbValidation(from.getJCOInstance());
    }

    // Constructors section
    
    public FbValidation() throws Throwable {
    }

    public FbValidation(java.lang.String connectionString) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidCastException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Task ExecuteAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteAsync = (JCObject)classInstance.Invoke("ExecuteAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objExecuteAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Execute() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.ObjectDisposedException, system.NotSupportedException, system.OutOfMemoryException, system.io.IOException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public FbValidationFlags getOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Options");
            return new FbValidationFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOptions(FbValidationFlags Options) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Options", Options == null ? null : Options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}