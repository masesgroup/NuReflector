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

package microsoft.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.data.sqlclient.SqlColumnEncryptionKeyStoreProvider;


/**
 * The base .NET class managing Microsoft.Data.SqlClient.SqlColumnEncryptionCngProvider, Microsoft.Data.SqlClient, Version=2.0.20168.4, Culture=neutral, PublicKeyToken=23ec7fc2d6eaa4a5.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Data.SqlClient.SqlColumnEncryptionCngProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Data.SqlClient.SqlColumnEncryptionCngProvider</a>
 */
public class SqlColumnEncryptionCngProvider extends SqlColumnEncryptionKeyStoreProvider  {
    /**
     * Fully assembly qualified name: Microsoft.Data.SqlClient, Version=2.0.20168.4, Culture=neutral, PublicKeyToken=23ec7fc2d6eaa4a5
     */
    public static final String assemblyFullName = "Microsoft.Data.SqlClient, Version=2.0.20168.4, Culture=neutral, PublicKeyToken=23ec7fc2d6eaa4a5";
    /**
     * Assembly name: Microsoft.Data.SqlClient
     */
    public static final String assemblyShortName = "Microsoft.Data.SqlClient";
    /**
     * Qualified class name: Microsoft.Data.SqlClient.SqlColumnEncryptionCngProvider
     */
    public static final String className = "Microsoft.Data.SqlClient.SqlColumnEncryptionCngProvider";
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
    public SqlColumnEncryptionCngProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlColumnEncryptionCngProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlColumnEncryptionCngProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlColumnEncryptionCngProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlColumnEncryptionCngProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlColumnEncryptionCngProvider() throws Throwable, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean VerifyColumnMasterKeyMetadata(java.lang.String masterKeyPath, boolean allowEnclaveComputations, byte[] signature) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("VerifyColumnMasterKeyMetadata", masterKeyPath, allowEnclaveComputations, signature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyColumnMasterKeyMetadata(java.lang.String dupParam0, boolean dupParam1, JCORefOut dupParam2) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("VerifyColumnMasterKeyMetadata", dupParam0, dupParam1, dupParam2.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DecryptColumnEncryptionKey(java.lang.String masterKeyPath, java.lang.String encryptionAlgorithm, byte[] encryptedColumnEncryptionKey) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DecryptColumnEncryptionKey", masterKeyPath, encryptionAlgorithm, encryptedColumnEncryptionKey);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDecryptColumnEncryptionKey = 0; indexDecryptColumnEncryptionKey < resultingArrayList.size(); indexDecryptColumnEncryptionKey++ ) {
				resultingArray[indexDecryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexDecryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DecryptColumnEncryptionKey(java.lang.String dupParam0, java.lang.String dupParam1, JCORefOut dupParam2) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DecryptColumnEncryptionKey", dupParam0, dupParam1, dupParam2.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDecryptColumnEncryptionKey = 0; indexDecryptColumnEncryptionKey < resultingArrayList.size(); indexDecryptColumnEncryptionKey++ ) {
				resultingArray[indexDecryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexDecryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] EncryptColumnEncryptionKey(java.lang.String masterKeyPath, java.lang.String encryptionAlgorithm, byte[] columnEncryptionKey) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("EncryptColumnEncryptionKey", masterKeyPath, encryptionAlgorithm, columnEncryptionKey);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncryptColumnEncryptionKey = 0; indexEncryptColumnEncryptionKey < resultingArrayList.size(); indexEncryptColumnEncryptionKey++ ) {
				resultingArray[indexEncryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexEncryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] EncryptColumnEncryptionKey(java.lang.String dupParam0, java.lang.String dupParam1, JCORefOut dupParam2) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("EncryptColumnEncryptionKey", dupParam0, dupParam1, dupParam2.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncryptColumnEncryptionKey = 0; indexEncryptColumnEncryptionKey < resultingArrayList.size(); indexEncryptColumnEncryptionKey++ ) {
				resultingArray[indexEncryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexEncryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignColumnMasterKeyMetadata(java.lang.String masterKeyPath, boolean allowEnclaveComputations) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignColumnMasterKeyMetadata", masterKeyPath, allowEnclaveComputations);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignColumnMasterKeyMetadata = 0; indexSignColumnMasterKeyMetadata < resultingArrayList.size(); indexSignColumnMasterKeyMetadata++ ) {
				resultingArray[indexSignColumnMasterKeyMetadata] = (byte)resultingArrayList.get(indexSignColumnMasterKeyMetadata);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}