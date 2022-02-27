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

package org.bouncycastle.pkix;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import org.bouncycastle.utilities.collections.ISet;
import org.bouncycastle.utilities.collections.ISetImplementation;
import org.bouncycastle.x509.store.IX509Selector;
import org.bouncycastle.x509.store.IX509SelectorImplementation;
import org.bouncycastle.x509.store.X509CertStoreSelector;
import system.collections.IList;
import system.collections.IListImplementation;
import org.bouncycastle.x509.store.IX509Store;
import org.bouncycastle.x509.store.IX509StoreImplementation;
import org.bouncycastle.pkix.PkixCertPathChecker;
import org.bouncycastle.utilities.date.DateTimeObject;


/**
 * The base .NET class managing Org.BouncyCastle.Pkix.PkixParameters, BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Pkix.PkixParameters" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Org.BouncyCastle.Pkix.PkixParameters</a>
 */
public class PkixParameters extends NetObject  {
    /**
     * Fully assembly qualified name: BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null
     */
    public static final String assemblyFullName = "BouncyCastle.Crypto, Version=1.8.2.0, Culture=neutral, PublicKeyToken=null";
    /**
     * Assembly name: BouncyCastle.Crypto
     */
    public static final String assemblyShortName = "BouncyCastle.Crypto";
    /**
     * Qualified class name: Org.BouncyCastle.Pkix.PkixParameters
     */
    public static final String className = "Org.BouncyCastle.Pkix.PkixParameters";
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
    public PkixParameters(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PkixParameters}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PkixParameters} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PkixParameters cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PkixParameters(from.getJCOInstance());
    }

    // Constructors section
    
    public PkixParameters() throws Throwable {
    }

    public PkixParameters(ISet trustAnchors) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(trustAnchors == null ? null : trustAnchors.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public ISet GetAttrCertCheckers() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAttrCertCheckers = (JCObject)classInstance.Invoke("GetAttrCertCheckers");
            return new ISetImplementation(objGetAttrCertCheckers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISet GetInitialPolicies() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInitialPolicies = (JCObject)classInstance.Invoke("GetInitialPolicies");
            return new ISetImplementation(objGetInitialPolicies);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISet GetNecessaryACAttributes() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNecessaryACAttributes = (JCObject)classInstance.Invoke("GetNecessaryACAttributes");
            return new ISetImplementation(objGetNecessaryACAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISet GetProhibitedACAttributes() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProhibitedACAttributes = (JCObject)classInstance.Invoke("GetProhibitedACAttributes");
            return new ISetImplementation(objGetProhibitedACAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISet GetTrustAnchors() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTrustAnchors = (JCObject)classInstance.Invoke("GetTrustAnchors");
            return new ISetImplementation(objGetTrustAnchors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISet GetTrustedACIssuers() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTrustedACIssuers = (JCObject)classInstance.Invoke("GetTrustedACIssuers");
            return new ISetImplementation(objGetTrustedACIssuers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IX509Selector GetTargetConstraints() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTargetConstraints = (JCObject)classInstance.Invoke("GetTargetConstraints");
            return new IX509SelectorImplementation(objGetTargetConstraints);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertStoreSelector GetTargetCertConstraints() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTargetCertConstraints = (JCObject)classInstance.Invoke("GetTargetCertConstraints");
            return new X509CertStoreSelector(objGetTargetCertConstraints);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList GetAdditionalStores() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAdditionalStores = (JCObject)classInstance.Invoke("GetAdditionalStores");
            return new IListImplementation(objGetAdditionalStores);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList GetCertPathCheckers() throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCertPathCheckers = (JCObject)classInstance.Invoke("GetCertPathCheckers");
            return new IListImplementation(objGetCertPathCheckers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList GetStores() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetStores = (JCObject)classInstance.Invoke("GetStores");
            return new IListImplementation(objGetStores);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAdditionalStore(IX509Store store) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddAdditionalStore", store == null ? null : store.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCertPathChecker(PkixCertPathChecker checker) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddCertPathChecker", checker == null ? null : checker.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddStore(IX509Store store) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddStore", store == null ? null : store.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAdditionalLocationsEnabled(boolean enabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAdditionalLocationsEnabled", enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAttrCertCheckers(ISet attrCertCheckers) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAttrCertCheckers", attrCertCheckers == null ? null : attrCertCheckers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCertPathCheckers(IList checkers) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCertPathCheckers", checkers == null ? null : checkers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInitialPolicies(ISet initialPolicies) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetInitialPolicies", initialPolicies == null ? null : initialPolicies.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNecessaryACAttributes(ISet necessaryACAttributes) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetNecessaryACAttributes", necessaryACAttributes == null ? null : necessaryACAttributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetProhibitedACAttributes(ISet prohibitedACAttributes) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetProhibitedACAttributes", prohibitedACAttributes == null ? null : prohibitedACAttributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetStores(IList stores) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetStores", stores == null ? null : stores.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTargetCertConstraints(IX509Selector selector) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetTargetCertConstraints", selector == null ? null : selector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTargetConstraints(IX509Selector selector) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetTargetConstraints", selector == null ? null : selector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTrustAnchors(ISet tas) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetTrustAnchors", tas == null ? null : tas.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTrustedACIssuers(ISet trustedACIssuers) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetTrustedACIssuers", trustedACIssuers == null ? null : trustedACIssuers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsAdditionalLocationsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAdditionalLocationsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAnyPolicyInhibited() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAnyPolicyInhibited");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsAnyPolicyInhibited(boolean IsAnyPolicyInhibited) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsAnyPolicyInhibited", IsAnyPolicyInhibited);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsExplicitPolicyRequired() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsExplicitPolicyRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsExplicitPolicyRequired(boolean IsExplicitPolicyRequired) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsExplicitPolicyRequired", IsExplicitPolicyRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPolicyMappingInhibited() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPolicyMappingInhibited");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsPolicyMappingInhibited(boolean IsPolicyMappingInhibited) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsPolicyMappingInhibited", IsPolicyMappingInhibited);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPolicyQualifiersRejected() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPolicyQualifiersRejected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsPolicyQualifiersRejected(boolean IsPolicyQualifiersRejected) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsPolicyQualifiersRejected", IsPolicyQualifiersRejected);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRevocationEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRevocationEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsRevocationEnabled(boolean IsRevocationEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsRevocationEnabled", IsRevocationEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsUseDeltasEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsUseDeltasEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsUseDeltasEnabled(boolean IsUseDeltasEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsUseDeltasEnabled", IsUseDeltasEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValidityModel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ValidityModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidityModel(int ValidityModel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ValidityModel", ValidityModel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeObject getDate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Date");
            return new DateTimeObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDate(DateTimeObject Date) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Date", Date == null ? null : Date.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}