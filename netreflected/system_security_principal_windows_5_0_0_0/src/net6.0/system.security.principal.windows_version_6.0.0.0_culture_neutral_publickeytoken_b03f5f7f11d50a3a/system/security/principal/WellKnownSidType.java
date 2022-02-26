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

package system.security.principal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Security.Principal.WellKnownSidType, System.Security.Principal.Windows, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Principal.WellKnownSidType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Principal.WellKnownSidType</a>
 */
public class WellKnownSidType extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.Principal.Windows, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Principal.Windows, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Principal.Windows
     */
    public static final String assemblyShortName = "System.Security.Principal.Windows";
    /**
     * Qualified class name: System.Security.Principal.WellKnownSidType
     */
    public static final String className = "System.Security.Principal.WellKnownSidType";
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
    public WellKnownSidType(java.lang.Object instance) {
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

    public WellKnownSidType() {
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

    final static WellKnownSidType getFrom(JCEnum object, String value) {
        try {
            return new WellKnownSidType(object.fromValue(value));
        } catch (JCException e) {
            return new WellKnownSidType(object);
        }
    }

    // Enum fields section
    
    public static WellKnownSidType NullSid = getFrom(enumReflected, "NullSid");
    public static WellKnownSidType WorldSid = getFrom(enumReflected, "WorldSid");
    public static WellKnownSidType LocalSid = getFrom(enumReflected, "LocalSid");
    public static WellKnownSidType CreatorOwnerSid = getFrom(enumReflected, "CreatorOwnerSid");
    public static WellKnownSidType CreatorGroupSid = getFrom(enumReflected, "CreatorGroupSid");
    public static WellKnownSidType CreatorOwnerServerSid = getFrom(enumReflected, "CreatorOwnerServerSid");
    public static WellKnownSidType CreatorGroupServerSid = getFrom(enumReflected, "CreatorGroupServerSid");
    public static WellKnownSidType NTAuthoritySid = getFrom(enumReflected, "NTAuthoritySid");
    public static WellKnownSidType DialupSid = getFrom(enumReflected, "DialupSid");
    public static WellKnownSidType NetworkSid = getFrom(enumReflected, "NetworkSid");
    public static WellKnownSidType BatchSid = getFrom(enumReflected, "BatchSid");
    public static WellKnownSidType InteractiveSid = getFrom(enumReflected, "InteractiveSid");
    public static WellKnownSidType ServiceSid = getFrom(enumReflected, "ServiceSid");
    public static WellKnownSidType AnonymousSid = getFrom(enumReflected, "AnonymousSid");
    public static WellKnownSidType ProxySid = getFrom(enumReflected, "ProxySid");
    public static WellKnownSidType EnterpriseControllersSid = getFrom(enumReflected, "EnterpriseControllersSid");
    public static WellKnownSidType SelfSid = getFrom(enumReflected, "SelfSid");
    public static WellKnownSidType AuthenticatedUserSid = getFrom(enumReflected, "AuthenticatedUserSid");
    public static WellKnownSidType RestrictedCodeSid = getFrom(enumReflected, "RestrictedCodeSid");
    public static WellKnownSidType TerminalServerSid = getFrom(enumReflected, "TerminalServerSid");
    public static WellKnownSidType RemoteLogonIdSid = getFrom(enumReflected, "RemoteLogonIdSid");
    public static WellKnownSidType LogonIdsSid = getFrom(enumReflected, "LogonIdsSid");
    public static WellKnownSidType LocalSystemSid = getFrom(enumReflected, "LocalSystemSid");
    public static WellKnownSidType LocalServiceSid = getFrom(enumReflected, "LocalServiceSid");
    public static WellKnownSidType NetworkServiceSid = getFrom(enumReflected, "NetworkServiceSid");
    public static WellKnownSidType BuiltinDomainSid = getFrom(enumReflected, "BuiltinDomainSid");
    public static WellKnownSidType BuiltinAdministratorsSid = getFrom(enumReflected, "BuiltinAdministratorsSid");
    public static WellKnownSidType BuiltinUsersSid = getFrom(enumReflected, "BuiltinUsersSid");
    public static WellKnownSidType BuiltinGuestsSid = getFrom(enumReflected, "BuiltinGuestsSid");
    public static WellKnownSidType BuiltinPowerUsersSid = getFrom(enumReflected, "BuiltinPowerUsersSid");
    public static WellKnownSidType BuiltinAccountOperatorsSid = getFrom(enumReflected, "BuiltinAccountOperatorsSid");
    public static WellKnownSidType BuiltinSystemOperatorsSid = getFrom(enumReflected, "BuiltinSystemOperatorsSid");
    public static WellKnownSidType BuiltinPrintOperatorsSid = getFrom(enumReflected, "BuiltinPrintOperatorsSid");
    public static WellKnownSidType BuiltinBackupOperatorsSid = getFrom(enumReflected, "BuiltinBackupOperatorsSid");
    public static WellKnownSidType BuiltinReplicatorSid = getFrom(enumReflected, "BuiltinReplicatorSid");
    public static WellKnownSidType BuiltinPreWindows2000CompatibleAccessSid = getFrom(enumReflected, "BuiltinPreWindows2000CompatibleAccessSid");
    public static WellKnownSidType BuiltinRemoteDesktopUsersSid = getFrom(enumReflected, "BuiltinRemoteDesktopUsersSid");
    public static WellKnownSidType BuiltinNetworkConfigurationOperatorsSid = getFrom(enumReflected, "BuiltinNetworkConfigurationOperatorsSid");
    public static WellKnownSidType AccountAdministratorSid = getFrom(enumReflected, "AccountAdministratorSid");
    public static WellKnownSidType AccountGuestSid = getFrom(enumReflected, "AccountGuestSid");
    public static WellKnownSidType AccountKrbtgtSid = getFrom(enumReflected, "AccountKrbtgtSid");
    public static WellKnownSidType AccountDomainAdminsSid = getFrom(enumReflected, "AccountDomainAdminsSid");
    public static WellKnownSidType AccountDomainUsersSid = getFrom(enumReflected, "AccountDomainUsersSid");
    public static WellKnownSidType AccountDomainGuestsSid = getFrom(enumReflected, "AccountDomainGuestsSid");
    public static WellKnownSidType AccountComputersSid = getFrom(enumReflected, "AccountComputersSid");
    public static WellKnownSidType AccountControllersSid = getFrom(enumReflected, "AccountControllersSid");
    public static WellKnownSidType AccountCertAdminsSid = getFrom(enumReflected, "AccountCertAdminsSid");
    public static WellKnownSidType AccountSchemaAdminsSid = getFrom(enumReflected, "AccountSchemaAdminsSid");
    public static WellKnownSidType AccountEnterpriseAdminsSid = getFrom(enumReflected, "AccountEnterpriseAdminsSid");
    public static WellKnownSidType AccountPolicyAdminsSid = getFrom(enumReflected, "AccountPolicyAdminsSid");
    public static WellKnownSidType AccountRasAndIasServersSid = getFrom(enumReflected, "AccountRasAndIasServersSid");
    public static WellKnownSidType NtlmAuthenticationSid = getFrom(enumReflected, "NtlmAuthenticationSid");
    public static WellKnownSidType DigestAuthenticationSid = getFrom(enumReflected, "DigestAuthenticationSid");
    public static WellKnownSidType SChannelAuthenticationSid = getFrom(enumReflected, "SChannelAuthenticationSid");
    public static WellKnownSidType ThisOrganizationSid = getFrom(enumReflected, "ThisOrganizationSid");
    public static WellKnownSidType OtherOrganizationSid = getFrom(enumReflected, "OtherOrganizationSid");
    public static WellKnownSidType BuiltinIncomingForestTrustBuildersSid = getFrom(enumReflected, "BuiltinIncomingForestTrustBuildersSid");
    public static WellKnownSidType BuiltinPerformanceMonitoringUsersSid = getFrom(enumReflected, "BuiltinPerformanceMonitoringUsersSid");
    public static WellKnownSidType BuiltinPerformanceLoggingUsersSid = getFrom(enumReflected, "BuiltinPerformanceLoggingUsersSid");
    public static WellKnownSidType BuiltinAuthorizationAccessSid = getFrom(enumReflected, "BuiltinAuthorizationAccessSid");
    public static WellKnownSidType WinBuiltinTerminalServerLicenseServersSid = getFrom(enumReflected, "WinBuiltinTerminalServerLicenseServersSid");
    public static WellKnownSidType MaxDefined = getFrom(enumReflected, "MaxDefined");
    public static WellKnownSidType WinBuiltinDCOMUsersSid = getFrom(enumReflected, "WinBuiltinDCOMUsersSid");
    public static WellKnownSidType WinBuiltinIUsersSid = getFrom(enumReflected, "WinBuiltinIUsersSid");
    public static WellKnownSidType WinIUserSid = getFrom(enumReflected, "WinIUserSid");
    public static WellKnownSidType WinBuiltinCryptoOperatorsSid = getFrom(enumReflected, "WinBuiltinCryptoOperatorsSid");
    public static WellKnownSidType WinUntrustedLabelSid = getFrom(enumReflected, "WinUntrustedLabelSid");
    public static WellKnownSidType WinLowLabelSid = getFrom(enumReflected, "WinLowLabelSid");
    public static WellKnownSidType WinMediumLabelSid = getFrom(enumReflected, "WinMediumLabelSid");
    public static WellKnownSidType WinHighLabelSid = getFrom(enumReflected, "WinHighLabelSid");
    public static WellKnownSidType WinSystemLabelSid = getFrom(enumReflected, "WinSystemLabelSid");
    public static WellKnownSidType WinWriteRestrictedCodeSid = getFrom(enumReflected, "WinWriteRestrictedCodeSid");
    public static WellKnownSidType WinCreatorOwnerRightsSid = getFrom(enumReflected, "WinCreatorOwnerRightsSid");
    public static WellKnownSidType WinCacheablePrincipalsGroupSid = getFrom(enumReflected, "WinCacheablePrincipalsGroupSid");
    public static WellKnownSidType WinNonCacheablePrincipalsGroupSid = getFrom(enumReflected, "WinNonCacheablePrincipalsGroupSid");
    public static WellKnownSidType WinEnterpriseReadonlyControllersSid = getFrom(enumReflected, "WinEnterpriseReadonlyControllersSid");
    public static WellKnownSidType WinAccountReadonlyControllersSid = getFrom(enumReflected, "WinAccountReadonlyControllersSid");
    public static WellKnownSidType WinBuiltinEventLogReadersGroup = getFrom(enumReflected, "WinBuiltinEventLogReadersGroup");
    public static WellKnownSidType WinNewEnterpriseReadonlyControllersSid = getFrom(enumReflected, "WinNewEnterpriseReadonlyControllersSid");
    public static WellKnownSidType WinBuiltinCertSvcDComAccessGroup = getFrom(enumReflected, "WinBuiltinCertSvcDComAccessGroup");
    public static WellKnownSidType WinMediumPlusLabelSid = getFrom(enumReflected, "WinMediumPlusLabelSid");
    public static WellKnownSidType WinLocalLogonSid = getFrom(enumReflected, "WinLocalLogonSid");
    public static WellKnownSidType WinConsoleLogonSid = getFrom(enumReflected, "WinConsoleLogonSid");
    public static WellKnownSidType WinThisOrganizationCertificateSid = getFrom(enumReflected, "WinThisOrganizationCertificateSid");
    public static WellKnownSidType WinApplicationPackageAuthoritySid = getFrom(enumReflected, "WinApplicationPackageAuthoritySid");
    public static WellKnownSidType WinBuiltinAnyPackageSid = getFrom(enumReflected, "WinBuiltinAnyPackageSid");
    public static WellKnownSidType WinCapabilityInternetClientSid = getFrom(enumReflected, "WinCapabilityInternetClientSid");
    public static WellKnownSidType WinCapabilityInternetClientServerSid = getFrom(enumReflected, "WinCapabilityInternetClientServerSid");
    public static WellKnownSidType WinCapabilityPrivateNetworkClientServerSid = getFrom(enumReflected, "WinCapabilityPrivateNetworkClientServerSid");
    public static WellKnownSidType WinCapabilityPicturesLibrarySid = getFrom(enumReflected, "WinCapabilityPicturesLibrarySid");
    public static WellKnownSidType WinCapabilityVideosLibrarySid = getFrom(enumReflected, "WinCapabilityVideosLibrarySid");
    public static WellKnownSidType WinCapabilityMusicLibrarySid = getFrom(enumReflected, "WinCapabilityMusicLibrarySid");
    public static WellKnownSidType WinCapabilityDocumentsLibrarySid = getFrom(enumReflected, "WinCapabilityDocumentsLibrarySid");
    public static WellKnownSidType WinCapabilitySharedUserCertificatesSid = getFrom(enumReflected, "WinCapabilitySharedUserCertificatesSid");
    public static WellKnownSidType WinCapabilityEnterpriseAuthenticationSid = getFrom(enumReflected, "WinCapabilityEnterpriseAuthenticationSid");
    public static WellKnownSidType WinCapabilityRemovableStorageSid = getFrom(enumReflected, "WinCapabilityRemovableStorageSid");


    // Flags management section


}