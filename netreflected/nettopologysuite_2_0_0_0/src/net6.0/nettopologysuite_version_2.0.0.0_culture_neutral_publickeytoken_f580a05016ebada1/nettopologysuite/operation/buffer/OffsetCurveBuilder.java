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

package nettopologysuite.operation.buffer;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import nettopologysuite.geometries.PrecisionModel;
import nettopologysuite.operation.buffer.BufferParameters;
import nettopologysuite.geometries.Coordinate;
import nettopologysuite.geometries.Position;
import nettopologysuite.geometriesgraph.Positions;


/**
 * The base .NET class managing NetTopologySuite.Operation.Buffer.OffsetCurveBuilder, NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Operation.Buffer.OffsetCurveBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Operation.Buffer.OffsetCurveBuilder</a>
 */
public class OffsetCurveBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1
     */
    public static final String assemblyFullName = "NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1";
    /**
     * Assembly name: NetTopologySuite
     */
    public static final String assemblyShortName = "NetTopologySuite";
    /**
     * Qualified class name: NetTopologySuite.Operation.Buffer.OffsetCurveBuilder
     */
    public static final String className = "NetTopologySuite.Operation.Buffer.OffsetCurveBuilder";
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
    public OffsetCurveBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OffsetCurveBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OffsetCurveBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OffsetCurveBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OffsetCurveBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public OffsetCurveBuilder() throws Throwable {
    }

    public OffsetCurveBuilder(PrecisionModel precisionModel, BufferParameters bufParams) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(precisionModel == null ? null : precisionModel.getJCOInstance(), bufParams == null ? null : bufParams.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsLineOffsetEmpty(double distance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsLineOffsetEmpty", distance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Coordinate[] GetLineCurve(Coordinate[] inputPts, double distance) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.ApplicationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Coordinate> resultingArrayList = new ArrayList<Coordinate>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLineCurve", toObjectFromArray(inputPts), distance);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Coordinate(resultingObject));
            }
            Coordinate[] resultingArray = new Coordinate[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Coordinate[] GetOffsetCurve(Coordinate[] inputPts, double distance) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.ApplicationException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Coordinate> resultingArrayList = new ArrayList<Coordinate>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetOffsetCurve", toObjectFromArray(inputPts), distance);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Coordinate(resultingObject));
            }
            Coordinate[] resultingArray = new Coordinate[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Coordinate[] GetRingCurve(Coordinate[] inputPts, Position side, double distance) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ApplicationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Coordinate> resultingArrayList = new ArrayList<Coordinate>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRingCurve", toObjectFromArray(inputPts), side == null ? null : side.getJCOInstance(), distance);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Coordinate(resultingObject));
            }
            Coordinate[] resultingArray = new Coordinate[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Coordinate[] GetRingCurve(Coordinate[] inputPts, Positions side, double distance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ApplicationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Coordinate> resultingArrayList = new ArrayList<Coordinate>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRingCurve", toObjectFromArray(inputPts), side == null ? null : side.getJCOInstance(), distance);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Coordinate(resultingObject));
            }
            Coordinate[] resultingArray = new Coordinate[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public BufferParameters getBufferParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BufferParameters");
            return new BufferParameters(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}