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

package org.bouncycastle.tls.crypto;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsEncryptorImplementation;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsSecretImplementation;


/**
 * The base .NET class managing Org.BouncyCastle.Tls.Crypto.TlsSecret, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.Crypto.TlsSecret" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Tls.Crypto.TlsSecret</a>
 */
public interface TlsSecret extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Tls.Crypto.TlsSecret
     */
    public static final String className = "Org.BouncyCastle.Tls.Crypto.TlsSecret";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TlsSecret}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TlsSecret} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TlsSecret ToTlsSecret(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new TlsSecretImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean IsAlive() throws Throwable;

    public byte[] CalculateHmac(int cryptoHashAlgorithm, byte[] buf, int off, int len) throws Throwable;

    public byte[] CalculateHmac(int dupParam0, JCORefOut dupParam1, int dupParam2, int dupParam3) throws Throwable;

    public byte[] Encrypt(TlsEncryptor encryptor) throws Throwable;

    public byte[] Extract() throws Throwable;

    public TlsSecret DeriveUsingPrf(int prfAlgorithm, java.lang.String label, byte[] seed, int length) throws Throwable;

    public TlsSecret DeriveUsingPrf(int dupParam0, java.lang.String dupParam1, JCORefOut dupParam2, int dupParam3) throws Throwable;

    public TlsSecret HkdfExpand(int cryptoHashAlgorithm, byte[] info, int length) throws Throwable;

    public TlsSecret HkdfExpand(int dupParam0, JCORefOut dupParam1, int dupParam2) throws Throwable;

    public TlsSecret HkdfExtract(int cryptoHashAlgorithm, TlsSecret ikm) throws Throwable;

    public void Destroy() throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}