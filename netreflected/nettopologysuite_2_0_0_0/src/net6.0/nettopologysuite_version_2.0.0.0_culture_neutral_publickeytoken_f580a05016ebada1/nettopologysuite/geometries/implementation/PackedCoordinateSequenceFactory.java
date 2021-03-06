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

package nettopologysuite.geometries.implementation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import nettopologysuite.geometries.CoordinateSequenceFactory;
import nettopologysuite.geometries.CoordinateSequence;
import nettopologysuite.geometries.Coordinate;
import system.Single;


/**
 * The base .NET class managing NetTopologySuite.Geometries.Implementation.PackedCoordinateSequenceFactory, NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Geometries.Implementation.PackedCoordinateSequenceFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Geometries.Implementation.PackedCoordinateSequenceFactory</a>
 */
public class PackedCoordinateSequenceFactory extends CoordinateSequenceFactory  {
    /**
     * Fully assembly qualified name: NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1
     */
    public static final String assemblyFullName = "NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1";
    /**
     * Assembly name: NetTopologySuite
     */
    public static final String assemblyShortName = "NetTopologySuite";
    /**
     * Qualified class name: NetTopologySuite.Geometries.Implementation.PackedCoordinateSequenceFactory
     */
    public static final String className = "NetTopologySuite.Geometries.Implementation.PackedCoordinateSequenceFactory";
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
    public PackedCoordinateSequenceFactory(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PackedCoordinateSequenceFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PackedCoordinateSequenceFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PackedCoordinateSequenceFactory cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PackedCoordinateSequenceFactory(from.getJCOInstance());
    }

    // Constructors section
    
    public PackedCoordinateSequenceFactory() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public CoordinateSequence Create(double[] packedCoordinates, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", packedCoordinates, dimension, measures);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", dupParam0.getJCRefOut(), dupParam1, dupParam2);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(double[] packedCoordinates, int dimension) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", packedCoordinates, dimension);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", dupParam0.getJCRefOut(), dupParam1);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(int size, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", size, dimension, measures);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(Coordinate[] coordinates) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", (java.lang.Object)toObjectFromArray(coordinates));
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(CoordinateSequence coordSeq) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", coordSeq == null ? null : coordSeq.getJCOInstance());
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(Single[] packedCoordinates, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", toObjectFromArray(packedCoordinates), dimension, measures);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Create(Single[] packedCoordinates, int dimension) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", toObjectFromArray(packedCoordinates), dimension);
            return new CoordinateSequence(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}