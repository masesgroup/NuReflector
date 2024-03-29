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

package org.bouncycastle.bcpg;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Org.BouncyCastle.Bcpg.PublicKeyAlgorithmTag, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.PublicKeyAlgorithmTag" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.PublicKeyAlgorithmTag</a>
 */
public class PublicKeyAlgorithmTag extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Bcpg.PublicKeyAlgorithmTag
     */
    public static final String className = "Org.BouncyCastle.Bcpg.PublicKeyAlgorithmTag";
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
    public PublicKeyAlgorithmTag(java.lang.Object instance) {
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

    public PublicKeyAlgorithmTag() {
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

    final static PublicKeyAlgorithmTag getFrom(JCEnum object, String value) {
        try {
            return new PublicKeyAlgorithmTag(object.fromValue(value));
        } catch (JCException e) {
            return new PublicKeyAlgorithmTag(object);
        }
    }

    // Enum fields section
    
    public static PublicKeyAlgorithmTag RsaGeneral = getFrom(enumReflected, "RsaGeneral");
    public static PublicKeyAlgorithmTag RsaEncrypt = getFrom(enumReflected, "RsaEncrypt");
    public static PublicKeyAlgorithmTag RsaSign = getFrom(enumReflected, "RsaSign");
    public static PublicKeyAlgorithmTag ElGamalEncrypt = getFrom(enumReflected, "ElGamalEncrypt");
    public static PublicKeyAlgorithmTag Dsa = getFrom(enumReflected, "Dsa");
    public static PublicKeyAlgorithmTag EC = getFrom(enumReflected, "EC");
    public static PublicKeyAlgorithmTag ECDH = getFrom(enumReflected, "ECDH");
    public static PublicKeyAlgorithmTag ECDsa = getFrom(enumReflected, "ECDsa");
    public static PublicKeyAlgorithmTag ElGamalGeneral = getFrom(enumReflected, "ElGamalGeneral");
    public static PublicKeyAlgorithmTag DiffieHellman = getFrom(enumReflected, "DiffieHellman");
    public static PublicKeyAlgorithmTag EdDsa = getFrom(enumReflected, "EdDsa");
    public static PublicKeyAlgorithmTag Experimental_1 = getFrom(enumReflected, "Experimental_1");
    public static PublicKeyAlgorithmTag Experimental_2 = getFrom(enumReflected, "Experimental_2");
    public static PublicKeyAlgorithmTag Experimental_3 = getFrom(enumReflected, "Experimental_3");
    public static PublicKeyAlgorithmTag Experimental_4 = getFrom(enumReflected, "Experimental_4");
    public static PublicKeyAlgorithmTag Experimental_5 = getFrom(enumReflected, "Experimental_5");
    public static PublicKeyAlgorithmTag Experimental_6 = getFrom(enumReflected, "Experimental_6");
    public static PublicKeyAlgorithmTag Experimental_7 = getFrom(enumReflected, "Experimental_7");
    public static PublicKeyAlgorithmTag Experimental_8 = getFrom(enumReflected, "Experimental_8");
    public static PublicKeyAlgorithmTag Experimental_9 = getFrom(enumReflected, "Experimental_9");
    public static PublicKeyAlgorithmTag Experimental_10 = getFrom(enumReflected, "Experimental_10");
    public static PublicKeyAlgorithmTag Experimental_11 = getFrom(enumReflected, "Experimental_11");


    // Flags management section


}