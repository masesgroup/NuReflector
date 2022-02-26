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

package automapper;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import automapper.IMapper;
import automapper.IMapperImplementation;
import automapper.IObjectMapper;
import automapper.IObjectMapperImplementation;
import automapper.TypePair;
import automapper.TypeMap;
import automapper.configuration.ITypeMapConfiguration;
import automapper.configuration.ITypeMapConfigurationImplementation;
import system.linq.expressions.LambdaExpression;
import automapper.MapRequest;
import automapper.ValidationContext;
import automapper.queryableextensions.IExpressionBuilder;
import automapper.queryableextensions.IExpressionBuilderImplementation;


/**
 * The base .NET class managing AutoMapper.IConfigurationProvider, AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.IConfigurationProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/AutoMapper.IConfigurationProvider</a>
 */
public class IConfigurationProviderImplementation extends NetObject implements IConfigurationProvider {
    /**
     * Fully assembly qualified name: AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005
     */
    public static final String assemblyFullName = "AutoMapper, Version=7.0.0.0, Culture=neutral, PublicKeyToken=be96cd2c38ef1005";
    /**
     * Assembly name: AutoMapper
     */
    public static final String assemblyShortName = "AutoMapper";
    /**
     * Qualified class name: AutoMapper.IConfigurationProvider
     */
    public static final String className = "AutoMapper.IConfigurationProvider";
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
    public IConfigurationProviderImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IConfigurationProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IConfigurationProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IConfigurationProvider ToIConfigurationProvider(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IConfigurationProviderImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IMapper CreateMapper() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateMapper = (JCObject)classInstance.Invoke("CreateMapper");
            return new IMapperImplementation(objCreateMapper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IObjectMapper FindMapper(TypePair types) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindMapper = (JCObject)classInstance.Invoke("FindMapper", types == null ? null : types.getJCOInstance());
            return new IObjectMapperImplementation(objFindMapper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap FindTypeMapFor(TypePair typePair) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTypeMapFor = (JCObject)classInstance.Invoke("FindTypeMapFor", typePair == null ? null : typePair.getJCOInstance());
            return new TypeMap(objFindTypeMapFor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap FindTypeMapFor(NetType sourceType, NetType destinationType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindTypeMapFor = (JCObject)classInstance.Invoke("FindTypeMapFor", sourceType == null ? null : sourceType.getJCOInstance(), destinationType == null ? null : destinationType.getJCOInstance());
            return new TypeMap(objFindTypeMapFor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap ResolveTypeMap(TypePair typePair) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveTypeMap = (JCObject)classInstance.Invoke("ResolveTypeMap", typePair == null ? null : typePair.getJCOInstance());
            return new TypeMap(objResolveTypeMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap ResolveTypeMap(TypePair typePair, ITypeMapConfiguration inlineConfiguration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveTypeMap = (JCObject)classInstance.Invoke("ResolveTypeMap", typePair == null ? null : typePair.getJCOInstance(), inlineConfiguration == null ? null : inlineConfiguration.getJCOInstance());
            return new TypeMap(objResolveTypeMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap ResolveTypeMap(NetType sourceType, NetType destinationType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveTypeMap = (JCObject)classInstance.Invoke("ResolveTypeMap", sourceType == null ? null : sourceType.getJCOInstance(), destinationType == null ? null : destinationType.getJCOInstance());
            return new TypeMap(objResolveTypeMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap ResolveTypeMap(NetType sourceType, NetType destinationType, ITypeMapConfiguration inlineConfiguration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolveTypeMap = (JCObject)classInstance.Invoke("ResolveTypeMap", sourceType == null ? null : sourceType.getJCOInstance(), destinationType == null ? null : destinationType.getJCOInstance(), inlineConfiguration == null ? null : inlineConfiguration.getJCOInstance());
            return new TypeMap(objResolveTypeMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeMap[] GetAllTypeMaps() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<TypeMap> resultingArrayList = new ArrayList<TypeMap>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAllTypeMaps");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new TypeMap(resultingObject));
            }
            TypeMap[] resultingArray = new TypeMap[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LambdaExpression BuildExecutionPlan(MapRequest mapRequest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildExecutionPlan = (JCObject)classInstance.Invoke("BuildExecutionPlan", mapRequest == null ? null : mapRequest.getJCOInstance());
            return new LambdaExpression(objBuildExecutionPlan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LambdaExpression BuildExecutionPlan(NetType sourceType, NetType destinationType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildExecutionPlan = (JCObject)classInstance.Invoke("BuildExecutionPlan", sourceType == null ? null : sourceType.getJCOInstance(), destinationType == null ? null : destinationType.getJCOInstance());
            return new LambdaExpression(objBuildExecutionPlan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertConfigurationIsValid() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertConfigurationIsValid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertConfigurationIsValid(TypeMap typeMap) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertConfigurationIsValid", typeMap == null ? null : typeMap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertConfigurationIsValid(java.lang.String profileName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertConfigurationIsValid", profileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompileMappings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompileMappings");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterTypeMap(TypeMap typeMap) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterTypeMap", typeMap == null ? null : typeMap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Validate(ValidationContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Validate", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IExpressionBuilder getExpressionBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExpressionBuilder");
            return new IExpressionBuilderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableNullPropagationForQueryMapping() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableNullPropagationForQueryMapping");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxExecutionPlanDepth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxExecutionPlanDepth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}