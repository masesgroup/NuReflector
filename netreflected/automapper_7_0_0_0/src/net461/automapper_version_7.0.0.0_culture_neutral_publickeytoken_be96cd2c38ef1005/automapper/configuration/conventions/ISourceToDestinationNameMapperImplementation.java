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

package automapper.configuration.conventions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.MemberInfo;
import automapper.configuration.conventions.IGetTypeInfoMembers;
import automapper.configuration.conventions.IGetTypeInfoMembersImplementation;
import automapper.TypeDetails;


/**
 * The base .NET class managing AutoMapper.Configuration.Conventions.ISourceToDestinationNameMapper, AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.Configuration.Conventions.ISourceToDestinationNameMapper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.Configuration.Conventions.ISourceToDestinationNameMapper</a>
 */
public class ISourceToDestinationNameMapperImplementation extends NetObject implements ISourceToDestinationNameMapper {
    /**
     * Fully assembly qualified name: AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005
     */
    public static final String assemblyFullName = "AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005";
    /**
     * Assembly name: AutoMapper
     */
    public static final String assemblyShortName = "AutoMapper";
    /**
     * Qualified class name: AutoMapper.Configuration.Conventions.ISourceToDestinationNameMapper
     */
    public static final String className = "AutoMapper.Configuration.Conventions.ISourceToDestinationNameMapper";
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
    public ISourceToDestinationNameMapperImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ISourceToDestinationNameMapper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ISourceToDestinationNameMapper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ISourceToDestinationNameMapper ToISourceToDestinationNameMapper(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ISourceToDestinationNameMapperImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public MemberInfo GetMatchingMemberInfo(IGetTypeInfoMembers getTypeInfoMembers, TypeDetails typeInfo, NetType destType, NetType destMemberType, java.lang.String nameToSearch) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMatchingMemberInfo = (JCObject)classInstance.Invoke("GetMatchingMemberInfo", getTypeInfoMembers == null ? null : getTypeInfoMembers.getJCOInstance(), typeInfo == null ? null : typeInfo.getJCOInstance(), destType == null ? null : destType.getJCOInstance(), destMemberType == null ? null : destMemberType.getJCOInstance(), nameToSearch);
            return new MemberInfo(objGetMatchingMemberInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}