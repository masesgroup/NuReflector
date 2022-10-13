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
 * The base .NET class managing Org.BouncyCastle.Bcpg.PacketTag, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.PacketTag" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Bcpg.PacketTag</a>
 */
public class PacketTag extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Bcpg.PacketTag
     */
    public static final String className = "Org.BouncyCastle.Bcpg.PacketTag";
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
    public PacketTag(java.lang.Object instance) {
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

    public PacketTag() {
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

    final static PacketTag getFrom(JCEnum object, String value) {
        try {
            return new PacketTag(object.fromValue(value));
        } catch (JCException e) {
            return new PacketTag(object);
        }
    }

    // Enum fields section
    
    public static PacketTag Reserved = getFrom(enumReflected, "Reserved");
    public static PacketTag PublicKeyEncryptedSession = getFrom(enumReflected, "PublicKeyEncryptedSession");
    public static PacketTag Signature = getFrom(enumReflected, "Signature");
    public static PacketTag SymmetricKeyEncryptedSessionKey = getFrom(enumReflected, "SymmetricKeyEncryptedSessionKey");
    public static PacketTag OnePassSignature = getFrom(enumReflected, "OnePassSignature");
    public static PacketTag SecretKey = getFrom(enumReflected, "SecretKey");
    public static PacketTag PublicKey = getFrom(enumReflected, "PublicKey");
    public static PacketTag SecretSubkey = getFrom(enumReflected, "SecretSubkey");
    public static PacketTag CompressedData = getFrom(enumReflected, "CompressedData");
    public static PacketTag SymmetricKeyEncrypted = getFrom(enumReflected, "SymmetricKeyEncrypted");
    public static PacketTag Marker = getFrom(enumReflected, "Marker");
    public static PacketTag LiteralData = getFrom(enumReflected, "LiteralData");
    public static PacketTag Trust = getFrom(enumReflected, "Trust");
    public static PacketTag UserId = getFrom(enumReflected, "UserId");
    public static PacketTag PublicSubkey = getFrom(enumReflected, "PublicSubkey");
    public static PacketTag UserAttribute = getFrom(enumReflected, "UserAttribute");
    public static PacketTag SymmetricEncryptedIntegrityProtected = getFrom(enumReflected, "SymmetricEncryptedIntegrityProtected");
    public static PacketTag ModificationDetectionCode = getFrom(enumReflected, "ModificationDetectionCode");
    public static PacketTag Experimental1 = getFrom(enumReflected, "Experimental1");
    public static PacketTag Experimental2 = getFrom(enumReflected, "Experimental2");
    public static PacketTag Experimental3 = getFrom(enumReflected, "Experimental3");
    public static PacketTag Experimental4 = getFrom(enumReflected, "Experimental4");


    // Flags management section


}