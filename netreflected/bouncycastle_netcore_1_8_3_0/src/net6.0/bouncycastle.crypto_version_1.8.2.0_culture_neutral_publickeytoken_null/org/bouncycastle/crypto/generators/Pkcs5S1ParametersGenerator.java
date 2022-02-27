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

package org.bouncycastle.crypto.generators;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.crypto.PbeParametersGenerator;
import org.bouncycastle.crypto.IDigest;
import org.bouncycastle.crypto.IDigestImplementation;
import org.bouncycastle.crypto.ICipherParameters;
import org.bouncycastle.crypto.ICipherParametersImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Crypto.Generators.Pkcs5S1ParametersGenerator, BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Generators.Pkcs5S1ParametersGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Crypto.Generators.Pkcs5S1ParametersGenerator</a>
 */
public class Pkcs5S1ParametersGenerator extends PbeParametersGenerator  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Crypto.Generators.Pkcs5S1ParametersGenerator
     */
    public static final String className = "Org.BouncyCastle.Crypto.Generators.Pkcs5S1ParametersGenerator";
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
    public Pkcs5S1ParametersGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Pkcs5S1ParametersGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Pkcs5S1ParametersGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Pkcs5S1ParametersGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Pkcs5S1ParametersGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public Pkcs5S1ParametersGenerator() throws Throwable {
    }

    public Pkcs5S1ParametersGenerator(IDigest digest) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(digest == null ? null : digest.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ICipherParameters GenerateDerivedMacParameters(int keySize) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateDerivedMacParameters = (JCObject)classInstance.Invoke("GenerateDerivedMacParameters", keySize);
            return new ICipherParametersImplementation(objGenerateDerivedMacParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICipherParameters GenerateDerivedParameters(int keySize, int ivSize) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateDerivedParameters = (JCObject)classInstance.Invoke("GenerateDerivedParameters", keySize, ivSize);
            return new ICipherParametersImplementation(objGenerateDerivedParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICipherParameters GenerateDerivedParameters(int keySize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateDerivedParameters = (JCObject)classInstance.Invoke("GenerateDerivedParameters", keySize);
            return new ICipherParametersImplementation(objGenerateDerivedParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICipherParameters GenerateDerivedParameters(java.lang.String algorithm, int keySize, int ivSize) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateDerivedParameters = (JCObject)classInstance.Invoke("GenerateDerivedParameters", algorithm, keySize, ivSize);
            return new ICipherParametersImplementation(objGenerateDerivedParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICipherParameters GenerateDerivedParameters(java.lang.String algorithm, int keySize) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateDerivedParameters = (JCObject)classInstance.Invoke("GenerateDerivedParameters", algorithm, keySize);
            return new ICipherParametersImplementation(objGenerateDerivedParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}