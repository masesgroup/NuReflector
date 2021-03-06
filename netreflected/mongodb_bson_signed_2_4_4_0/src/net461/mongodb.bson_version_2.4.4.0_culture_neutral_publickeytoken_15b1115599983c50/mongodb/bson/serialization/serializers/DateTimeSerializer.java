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

package mongodb.bson.serialization.serializers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import mongodb.bson.BsonType;
import system.DateTimeKind;
import mongodb.bson.serialization.serializers.DateTimeSerializer;
import system.DateTime;
import mongodb.bson.serialization.BsonDeserializationContext;
import mongodb.bson.serialization.BsonDeserializationArgs;
import mongodb.bson.serialization.BsonSerializationContext;
import mongodb.bson.serialization.BsonSerializationArgs;


/**
 * The base .NET class managing MongoDB.Bson.Serialization.Serializers.DateTimeSerializer, MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.Serializers.DateTimeSerializer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/MongoDB.Bson.Serialization.Serializers.DateTimeSerializer</a>
 */
public class DateTimeSerializer extends NetObject  {
    /**
     * Fully assembly qualified name: MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50
     */
    public static final String assemblyFullName = "MongoDB.Bson, Version=2.4.4.0, Culture=neutral, PublicKeyToken=15b1115599983c50";
    /**
     * Assembly name: MongoDB.Bson
     */
    public static final String assemblyShortName = "MongoDB.Bson";
    /**
     * Qualified class name: MongoDB.Bson.Serialization.Serializers.DateTimeSerializer
     */
    public static final String className = "MongoDB.Bson.Serialization.Serializers.DateTimeSerializer";
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
    public DateTimeSerializer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DateTimeSerializer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DateTimeSerializer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DateTimeSerializer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DateTimeSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    public DateTimeSerializer() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer(boolean dateOnly) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dateOnly));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer(boolean dateOnly, BsonType representation) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dateOnly, representation == null ? null : representation.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer(BsonType representation) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(representation == null ? null : representation.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer(DateTimeKind kind) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(kind == null ? null : kind.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer(DateTimeKind kind, BsonType representation) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(kind == null ? null : kind.getJCOInstance(), representation == null ? null : representation.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public DateTimeSerializer WithDateOnly(boolean dateOnly) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithDateOnly = (JCObject)classInstance.Invoke("WithDateOnly", dateOnly);
            return new DateTimeSerializer(objWithDateOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer WithDateOnly(boolean dateOnly, BsonType representation) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithDateOnly = (JCObject)classInstance.Invoke("WithDateOnly", dateOnly, representation == null ? null : representation.getJCOInstance());
            return new DateTimeSerializer(objWithDateOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer WithKind(DateTimeKind kind) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithKind = (JCObject)classInstance.Invoke("WithKind", kind == null ? null : kind.getJCOInstance());
            return new DateTimeSerializer(objWithKind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer WithKind(DateTimeKind kind, BsonType representation) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithKind = (JCObject)classInstance.Invoke("WithKind", kind == null ? null : kind.getJCOInstance(), representation == null ? null : representation.getJCOInstance());
            return new DateTimeSerializer(objWithKind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeSerializer WithRepresentation(BsonType representation) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithRepresentation = (JCObject)classInstance.Invoke("WithRepresentation", representation == null ? null : representation.getJCOInstance());
            return new DateTimeSerializer(objWithRepresentation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime Deserialize(BsonDeserializationContext context, BsonDeserializationArgs args) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException, system.ArgumentException, mongodb.bson.BsonSerializationException, mongodb.bson.BsonInternalException, system.TypeInitializationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OverflowException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", context == null ? null : context.getJCOInstance(), args == null ? null : args.getJCOInstance());
            return new DateTime(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(BsonSerializationContext context, BsonSerializationArgs args, DateTime value) throws Throwable, mongodb.bson.BsonSerializationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.NotSupportedException, system.OverflowException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.TypeInitializationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", context == null ? null : context.getJCOInstance(), args == null ? null : args.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getDateOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DateOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BsonType getRepresentation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Representation");
            return new BsonType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTimeSerializer getDateOnlyInstance() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DateOnlyInstance");
            return new DateTimeSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTimeSerializer getLocalInstance() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("LocalInstance");
            return new DateTimeSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTimeSerializer getUtcInstance() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UtcInstance");
            return new DateTimeSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeKind getKind() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Kind");
            return new DateTimeKind(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}