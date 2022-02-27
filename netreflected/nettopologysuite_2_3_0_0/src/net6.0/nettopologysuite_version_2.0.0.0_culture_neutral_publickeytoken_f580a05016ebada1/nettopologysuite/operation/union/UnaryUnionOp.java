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

package nettopologysuite.operation.union;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import nettopologysuite.geometries.Geometry;
import nettopologysuite.operation.union.UnionStrategy;


/**
 * The base .NET class managing NetTopologySuite.Operation.Union.UnaryUnionOp, NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Operation.Union.UnaryUnionOp" target="_top">https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Operation.Union.UnaryUnionOp</a>
 */
public class UnaryUnionOp extends NetObject  {
    /**
     * Fully assembly qualified name: NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1
     */
    public static final String assemblyFullName = "NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1";
    /**
     * Assembly name: NetTopologySuite
     */
    public static final String assemblyShortName = "NetTopologySuite";
    /**
     * Qualified class name: NetTopologySuite.Operation.Union.UnaryUnionOp
     */
    public static final String className = "NetTopologySuite.Operation.Union.UnaryUnionOp";
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
    public UnaryUnionOp(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link UnaryUnionOp}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link UnaryUnionOp} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static UnaryUnionOp cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new UnaryUnionOp(from.getJCOInstance());
    }

    // Constructors section
    
    public UnaryUnionOp() throws Throwable {
    }

    public UnaryUnionOp(Geometry geom) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(geom == null ? null : geom.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Geometry Union() throws Throwable, system.ArgumentException, nettopologysuite.utilities.AssertionFailedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUnion = (JCObject)classInstance.Invoke("Union");
            return new Geometry(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Geometry Union(Geometry geom) throws Throwable, system.ArgumentException, nettopologysuite.utilities.AssertionFailedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUnion = (JCObject)classType.Invoke("Union", geom == null ? null : geom.getJCOInstance());
            return new Geometry(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public UnionStrategy getUnionStrategy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnionStrategy");
            return new UnionStrategy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnionStrategy(UnionStrategy UnionStrategy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UnionStrategy", UnionStrategy == null ? null : UnionStrategy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}