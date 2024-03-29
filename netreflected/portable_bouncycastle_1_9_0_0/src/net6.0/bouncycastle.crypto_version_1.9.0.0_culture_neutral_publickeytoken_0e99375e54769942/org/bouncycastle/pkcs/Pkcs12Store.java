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

package org.bouncycastle.pkcs;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import org.bouncycastle.pkcs.AsymmetricKeyEntry;
import org.bouncycastle.pkcs.X509CertificateEntry;
import org.bouncycastle.x509.X509Certificate;
import org.bouncycastle.security.SecureRandom;


/**
 * The base .NET class managing Org.BouncyCastle.Pkcs.Pkcs12Store, BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Pkcs.Pkcs12Store" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Pkcs.Pkcs12Store</a>
 */
public class Pkcs12Store extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.9.0.0, Culture=neutral, PublicKeyToken=0e99375e54769942";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Pkcs.Pkcs12Store
     */
    public static final String className = "Org.BouncyCastle.Pkcs.Pkcs12Store";
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
    public Pkcs12Store(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Pkcs12Store}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Pkcs12Store} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Pkcs12Store cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Pkcs12Store(from.getJCOInstance());
    }

    // Constructors section
    
    public Pkcs12Store() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12Store(Stream input, char[] password) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.EndOfStreamException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, org.bouncycastle.asn1.Asn1Exception, system.InvalidOperationException, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException, system.ArithmeticException, org.bouncycastle.security.certificates.CertificateParsingException, org.bouncycastle.security.certificates.CertificateException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(input == null ? null : input.getJCOInstance(), password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean ContainsAlias(java.lang.String alias) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ContainsAlias", alias);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsCertificateEntry(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsCertificateEntry", alias);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEntryOfType(java.lang.String alias, NetType entryType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEntryOfType", alias, entryType == null ? null : entryType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsKeyEntry(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsKeyEntry", alias);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Size() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricKeyEntry GetKey(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKey = (JCObject)classInstance.Invoke("GetKey", alias);
            return new AsymmetricKeyEntry(objGetKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateEntry GetCertificate(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCertificate = (JCObject)classInstance.Invoke("GetCertificate", alias);
            return new X509CertificateEntry(objGetCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateEntry[] GetCertificateChain(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.OutOfMemoryException, system.FormatException, system.ArithmeticException, org.bouncycastle.security.SecurityUtilityException, org.bouncycastle.security.certificates.CertificateException, org.bouncycastle.security.InvalidKeyException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<X509CertificateEntry> resultingArrayList = new ArrayList<X509CertificateEntry>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCertificateChain", alias);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new X509CertificateEntry(resultingObject));
            }
            X509CertificateEntry[] resultingArray = new X509CertificateEntry[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCertificateAlias(X509Certificate cert) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCertificateAlias", cert == null ? null : cert.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteEntry(java.lang.String alias) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteEntry", alias);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(Stream input, char[] password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException, system.ArithmeticException, org.bouncycastle.security.certificates.CertificateParsingException, org.bouncycastle.security.certificates.CertificateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", input == null ? null : input.getJCOInstance(), password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(Stream dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.OverflowException, org.bouncycastle.security.SecurityUtilityException, system.OutOfMemoryException, system.ArithmeticException, org.bouncycastle.security.certificates.CertificateParsingException, org.bouncycastle.security.certificates.CertificateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Load", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream, char[] password, SecureRandom random) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.NullReferenceException, system.ArithmeticException, system.RankException, org.bouncycastle.security.certificates.CertificateEncodingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", stream == null ? null : stream.getJCOInstance(), password, random == null ? null : random.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream dupParam0, JCORefOut dupParam1, SecureRandom dupParam2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, org.bouncycastle.security.SecurityUtilityException, system.io.IOException, org.bouncycastle.asn1.Asn1Exception, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.NullReferenceException, system.ArithmeticException, system.RankException, org.bouncycastle.security.certificates.CertificateEncodingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCertificateEntry(java.lang.String alias, X509CertificateEntry certEntry) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCertificateEntry", alias, certEntry == null ? null : certEntry.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetKeyEntry(java.lang.String alias, AsymmetricKeyEntry keyEntry, X509CertificateEntry[] chain) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.EndOfStreamException, org.bouncycastle.asn1.Asn1Exception, org.bouncycastle.asn1.Asn1ParsingException, system.FormatException, system.ArithmeticException, org.bouncycastle.security.SecurityUtilityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetKeyEntry", alias, keyEntry == null ? null : keyEntry.getJCOInstance(), toObjectFromArray(chain));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getCount() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getAliases() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Aliases");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}