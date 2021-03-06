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

package nettopologysuite.shape;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import nettopologysuite.geometries.Envelope;
import nettopologysuite.geometries.Geometry;
import nettopologysuite.geometries.LineSegment;
import nettopologysuite.geometries.Coordinate;


/**
 * The base .NET class managing NetTopologySuite.Shape.GeometricShapeBuilder, NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Shape.GeometricShapeBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/NetTopologySuite.Shape.GeometricShapeBuilder</a>
 */
public class GeometricShapeBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1
     */
    public static final String assemblyFullName = "NetTopologySuite, Version=2.0.0.0, Culture=neutral, PublicKeyToken=f580a05016ebada1";
    /**
     * Assembly name: NetTopologySuite
     */
    public static final String assemblyShortName = "NetTopologySuite";
    /**
     * Qualified class name: NetTopologySuite.Shape.GeometricShapeBuilder
     */
    public static final String className = "NetTopologySuite.Shape.GeometricShapeBuilder";
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
    public GeometricShapeBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link GeometricShapeBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link GeometricShapeBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static GeometricShapeBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new GeometricShapeBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public GeometricShapeBuilder() throws Throwable {
    }

    
    // Methods section
    
    public Envelope GetSquareExtent() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSquareExtent = (JCObject)classInstance.Invoke("GetSquareExtent");
            return new Envelope(objGetSquareExtent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Geometry GetGeometry() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGeometry = (JCObject)classInstance.Invoke("GetGeometry");
            return new Geometry(objGetGeometry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LineSegment GetSquareBaseLine() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSquareBaseLine = (JCObject)classInstance.Invoke("GetSquareBaseLine");
            return new LineSegment(objGetSquareBaseLine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public double getDiameter() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Diameter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getRadius() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Radius");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumPoints() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumPoints");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumPoints(int NumPoints) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumPoints", NumPoints);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Coordinate getCentre() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Centre");
            return new Coordinate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Envelope getExtent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Extent");
            return new Envelope(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExtent(Envelope Extent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Extent", Extent == null ? null : Extent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}