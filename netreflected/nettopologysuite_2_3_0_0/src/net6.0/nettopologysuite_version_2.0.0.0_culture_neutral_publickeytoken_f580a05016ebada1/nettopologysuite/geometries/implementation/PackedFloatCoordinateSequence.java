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
import nettopologysuite.geometries.implementation.PackedCoordinateSequence;
import nettopologysuite.geometries.Coordinate;
import system.Single;
import nettopologysuite.geometries.CoordinateSequence;
import nettopologysuite.geometries.Envelope;


/**
 * The base .NET class managing NetTopologySuite.Geometries.Implementation.PackedFloatCoordinateSequence, NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Geometries.Implementation.PackedFloatCoordinateSequence" target="_top">https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Geometries.Implementation.PackedFloatCoordinateSequence</a>
 */
public class PackedFloatCoordinateSequence extends PackedCoordinateSequence  {
    /**
     * Fully assembly qualified name: NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1
     */
    public static final String assemblyFullName = "NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1";
    /**
     * Assembly name: NetTopologySuite
     */
    public static final String assemblyShortName = "NetTopologySuite";
    /**
     * Qualified class name: NetTopologySuite.Geometries.Implementation.PackedFloatCoordinateSequence
     */
    public static final String className = "NetTopologySuite.Geometries.Implementation.PackedFloatCoordinateSequence";
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
    public PackedFloatCoordinateSequence(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PackedFloatCoordinateSequence}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PackedFloatCoordinateSequence} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PackedFloatCoordinateSequence cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PackedFloatCoordinateSequence(from.getJCOInstance());
    }

    // Constructors section
    
    public PackedFloatCoordinateSequence() throws Throwable {
    }

    public PackedFloatCoordinateSequence(double[] coords, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(coords, dimension, measures));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackedFloatCoordinateSequence(int size, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(size, dimension, measures));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackedFloatCoordinateSequence(Coordinate[] coords, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(toObjectFromArray(coords), dimension, measures));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackedFloatCoordinateSequence(Coordinate[] coords, int dimension) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(toObjectFromArray(coords), dimension));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackedFloatCoordinateSequence(Coordinate[] coords) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)toObjectFromArray(coords)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackedFloatCoordinateSequence(Single[] coords, int dimension, int measures) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(toObjectFromArray(coords), dimension, measures));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public double GetOrdinate(int index, int ordinateIndex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("GetOrdinate", index, ordinateIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Copy() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCopy = (JCObject)classInstance.Invoke("Copy");
            return new CoordinateSequence(objCopy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CoordinateSequence Reversed() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReversed = (JCObject)classInstance.Invoke("Reversed");
            return new CoordinateSequence(objReversed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Envelope ExpandEnvelope(Envelope env) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExpandEnvelope = (JCObject)classInstance.Invoke("ExpandEnvelope", env == null ? null : env.getJCOInstance());
            return new Envelope(objExpandEnvelope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single[] GetRawCoordinates() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Single> resultingArrayList = new ArrayList<Single>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRawCoordinates");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Single(resultingObject));
            }
            Single[] resultingArray = new Single[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOrdinate(int index, int ordinateIndex, double value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOrdinate", index, ordinateIndex, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}