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

package mongodb.bson.serialization.conventions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mongodb.bson.serialization.conventions.StandardDiscriminatorConvention;
import mongodb.bson.BsonValue;


/**
 * The base .NET class managing MongoDB.Bson.Serialization.Conventions.HierarchicalDiscriminatorConvention, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.Conventions.HierarchicalDiscriminatorConvention" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.Conventions.HierarchicalDiscriminatorConvention</a>
 */
public class HierarchicalDiscriminatorConvention extends StandardDiscriminatorConvention  {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.Serialization.Conventions.HierarchicalDiscriminatorConvention
     */
    public static final String className = "MongoDB.Bson.Serialization.Conventions.HierarchicalDiscriminatorConvention";
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
    public HierarchicalDiscriminatorConvention(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HierarchicalDiscriminatorConvention}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HierarchicalDiscriminatorConvention} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HierarchicalDiscriminatorConvention cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HierarchicalDiscriminatorConvention(from.getJCOInstance());
    }

    // Constructors section
    
    public HierarchicalDiscriminatorConvention() throws Throwable {
    }

    public HierarchicalDiscriminatorConvention(java.lang.String elementName) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(elementName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public BsonValue GetDiscriminator(NetType nominalType, NetType actualType) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException, system.NotSupportedException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.NotImplementedException, mongodb.bson.BsonSerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDiscriminator = (JCObject)classInstance.Invoke("GetDiscriminator", nominalType == null ? null : nominalType.getJCOInstance(), actualType == null ? null : actualType.getJCOInstance());
            return new BsonValue(objGetDiscriminator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}