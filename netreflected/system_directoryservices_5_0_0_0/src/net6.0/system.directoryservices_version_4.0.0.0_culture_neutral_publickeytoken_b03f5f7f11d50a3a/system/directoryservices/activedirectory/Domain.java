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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.ActiveDirectoryPartition;
import system.directoryservices.activedirectory.Domain;
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.DomainController;
import system.directoryservices.activedirectory.LocatorOptions;
import system.directoryservices.activedirectory.DomainControllerCollection;
import system.directoryservices.activedirectory.TrustRelationshipInformation;
import system.directoryservices.activedirectory.TrustRelationshipInformationCollection;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.TrustDirection;
import system.directoryservices.activedirectory.DomainMode;
import system.directoryservices.activedirectory.DomainCollection;
import system.directoryservices.activedirectory.Forest;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.Domain, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.Domain" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.Domain</a>
 */
public class Domain extends ActiveDirectoryPartition  {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.Domain
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.Domain";
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
    public Domain(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Domain}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Domain} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Domain cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Domain(from.getJCOInstance());
    }

    // Constructors section
    
    public Domain() throws Throwable {
    }



    
    // Methods section
    
    public boolean GetSelectiveAuthenticationStatus(java.lang.String targetDomainName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetSelectiveAuthenticationStatus", targetDomainName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetSidFilteringStatus(java.lang.String targetDomainName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetSidFilteringStatus", targetDomainName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Domain GetComputerDomain() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetComputerDomain = (JCObject)classType.Invoke("GetComputerDomain");
            return new Domain(objGetComputerDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Domain GetCurrentDomain() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCurrentDomain = (JCObject)classType.Invoke("GetCurrentDomain");
            return new Domain(objGetCurrentDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Domain GetDomain(DirectoryContext context) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDomain = (JCObject)classType.Invoke("GetDomain", context == null ? null : context.getJCOInstance());
            return new Domain(objGetDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController FindDomainController() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDomainController = (JCObject)classInstance.Invoke("FindDomainController");
            return new DomainController(objFindDomainController);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController FindDomainController(LocatorOptions flag) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDomainController = (JCObject)classInstance.Invoke("FindDomainController", flag == null ? null : flag.getJCOInstance());
            return new DomainController(objFindDomainController);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController FindDomainController(java.lang.String siteName, LocatorOptions flag) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDomainController = (JCObject)classInstance.Invoke("FindDomainController", siteName, flag == null ? null : flag.getJCOInstance());
            return new DomainController(objFindDomainController);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController FindDomainController(java.lang.String siteName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDomainController = (JCObject)classInstance.Invoke("FindDomainController", siteName);
            return new DomainController(objFindDomainController);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainControllerCollection FindAllDiscoverableDomainControllers() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDiscoverableDomainControllers = (JCObject)classInstance.Invoke("FindAllDiscoverableDomainControllers");
            return new DomainControllerCollection(objFindAllDiscoverableDomainControllers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainControllerCollection FindAllDiscoverableDomainControllers(java.lang.String siteName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDiscoverableDomainControllers = (JCObject)classInstance.Invoke("FindAllDiscoverableDomainControllers", siteName);
            return new DomainControllerCollection(objFindAllDiscoverableDomainControllers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainControllerCollection FindAllDomainControllers() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDomainControllers = (JCObject)classInstance.Invoke("FindAllDomainControllers");
            return new DomainControllerCollection(objFindAllDomainControllers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainControllerCollection FindAllDomainControllers(java.lang.String siteName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDomainControllers = (JCObject)classInstance.Invoke("FindAllDomainControllers", siteName);
            return new DomainControllerCollection(objFindAllDomainControllers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustRelationshipInformation GetTrustRelationship(java.lang.String targetDomainName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTrustRelationship = (JCObject)classInstance.Invoke("GetTrustRelationship", targetDomainName);
            return new TrustRelationshipInformation(objGetTrustRelationship);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustRelationshipInformationCollection GetAllTrustRelationships() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAllTrustRelationships = (JCObject)classInstance.Invoke("GetAllTrustRelationships");
            return new TrustRelationshipInformationCollection(objGetAllTrustRelationships);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateLocalSideOfTrustRelationship(java.lang.String targetDomainName, TrustDirection direction, java.lang.String trustPassword) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateLocalSideOfTrustRelationship", targetDomainName, direction == null ? null : direction.getJCOInstance(), trustPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateTrustRelationship(Domain targetDomain, TrustDirection direction) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateTrustRelationship", targetDomain == null ? null : targetDomain.getJCOInstance(), direction == null ? null : direction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteLocalSideOfTrustRelationship(java.lang.String targetDomainName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteLocalSideOfTrustRelationship", targetDomainName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteTrustRelationship(Domain targetDomain) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteTrustRelationship", targetDomain == null ? null : targetDomain.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaiseDomainFunctionality(DomainMode domainMode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RaiseDomainFunctionality", domainMode == null ? null : domainMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaiseDomainFunctionalityLevel(int domainMode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RaiseDomainFunctionalityLevel", domainMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RepairTrustRelationship(Domain targetDomain) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RepairTrustRelationship", targetDomain == null ? null : targetDomain.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSelectiveAuthenticationStatus(java.lang.String targetDomainName, boolean enable) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSelectiveAuthenticationStatus", targetDomainName, enable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSidFilteringStatus(java.lang.String targetDomainName, boolean enable) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSidFilteringStatus", targetDomainName, enable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateLocalSideOfTrustRelationship(java.lang.String targetDomainName, TrustDirection newTrustDirection, java.lang.String newTrustPassword) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateLocalSideOfTrustRelationship", targetDomainName, newTrustDirection == null ? null : newTrustDirection.getJCOInstance(), newTrustPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateLocalSideOfTrustRelationship(java.lang.String targetDomainName, java.lang.String newTrustPassword) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateLocalSideOfTrustRelationship", targetDomainName, newTrustPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateTrustRelationship(Domain targetDomain, TrustDirection newTrustDirection) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateTrustRelationship", targetDomain == null ? null : targetDomain.getJCOInstance(), newTrustDirection == null ? null : newTrustDirection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyOutboundTrustRelationship(java.lang.String targetDomainName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("VerifyOutboundTrustRelationship", targetDomainName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyTrustRelationship(Domain targetDomain, TrustDirection direction) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("VerifyTrustRelationship", targetDomain == null ? null : targetDomain.getJCOInstance(), direction == null ? null : direction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getDomainModeLevel() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DomainModeLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Domain getParent() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new Domain(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainCollection getChildren() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Children");
            return new DomainCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController getInfrastructureRoleOwner() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InfrastructureRoleOwner");
            return new DomainController(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController getPdcRoleOwner() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PdcRoleOwner");
            return new DomainController(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainController getRidRoleOwner() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RidRoleOwner");
            return new DomainController(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainControllerCollection getDomainControllers() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DomainControllers");
            return new DomainControllerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainMode getDomainMode() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DomainMode");
            return new DomainMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Forest getForest() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Forest");
            return new Forest(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}