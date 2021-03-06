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

package oracleinternal.secure.network;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing OracleInternal.Secure.Network.DataIntegrityAlgorithm, Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/OracleInternal.Secure.Network.DataIntegrityAlgorithm" target="_top">https://docs.microsoft.com/en-us/dotnet/api/OracleInternal.Secure.Network.DataIntegrityAlgorithm</a>
 */
public class DataIntegrityAlgorithm extends NetObject  {
    /**
     * Fully assembly qualified name: Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342
     */
    public static final String assemblyFullName = "Oracle.ManagedDataAccess, Version=3.1.21.1, Culture=neutral, PublicKeyToken=89b483f429c47342";
    /**
     * Assembly name: Oracle.ManagedDataAccess
     */
    public static final String assemblyShortName = "Oracle.ManagedDataAccess";
    /**
     * Qualified class name: OracleInternal.Secure.Network.DataIntegrityAlgorithm
     */
    public static final String className = "OracleInternal.Secure.Network.DataIntegrityAlgorithm";
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
    public DataIntegrityAlgorithm(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataIntegrityAlgorithm}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataIntegrityAlgorithm} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataIntegrityAlgorithm cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataIntegrityAlgorithm(from.getJCOInstance());
    }

    // Constructors section
    
    public DataIntegrityAlgorithm() throws Throwable {
    }

    
    // Methods section
    
    public boolean compare(byte[] b, int l, byte[] xs, int off) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("compare", b, l, xs, off);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean compare(JCORefOut dupParam0, int dupParam1, JCORefOut dupParam2, int dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("compare", dupParam0.getJCRefOut(), dupParam1, dupParam2.getJCRefOut(), dupParam3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] compute(byte[] s, int off, int l) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("compute", s, off, l);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexcompute = 0; indexcompute < resultingArrayList.size(); indexcompute++ ) {
				resultingArray[indexcompute] = (byte)resultingArrayList.get(indexcompute);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] compute(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("compute", dupParam0.getJCRefOut(), dupParam1, dupParam2);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexcompute = 0; indexcompute < resultingArrayList.size(); indexcompute++ ) {
				resultingArray[indexcompute] = (byte)resultingArrayList.get(indexcompute);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int size() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int takeSessionKey(byte[] key, byte[] iv) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("takeSessionKey", key, iv);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int takeSessionKey(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("takeSessionKey", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void init(byte[] k, byte[] iv, java.lang.String a, boolean uo) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("init", k, iv, a, uo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void init(JCORefOut dupParam0, JCORefOut dupParam1, java.lang.String dupParam2, boolean dupParam3) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("init", dupParam0.getJCRefOut(), dupParam1.getJCRefOut(), dupParam2, dupParam3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void renew() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("renew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}