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

package microsoft.azure.documents;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.documents.JsonSerializable;
import system.DateTime;


/**
 * The base .NET class managing Microsoft.Azure.Documents.Resource, Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Resource" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Documents.Resource</a>
 */
public class Resource extends JsonSerializable  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.DocumentDB.Core, Version=2.1.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.DocumentDB.Core
     */
    public static final String assemblyShortName = "Microsoft.Azure.DocumentDB.Core";
    /**
     * Qualified class name: Microsoft.Azure.Documents.Resource
     */
    public static final String className = "Microsoft.Azure.Documents.Resource";
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
    public Resource(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Resource}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Resource} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Resource cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Resource(from.getJCOInstance());
    }

    // Constructors section
    
    public Resource() throws Throwable {
    }

    
    // Methods section
    
    public byte[] ToByteArray() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.MulticastNotSupportedException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ToByteArray");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexToByteArray = 0; indexToByteArray < resultingArrayList.size(); indexToByteArray++ ) {
				resultingArray[indexToByteArray] = (byte)resultingArrayList.get(indexToByteArray);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPropertyValue(java.lang.String propertyName, NetObject propertyValue) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPropertyValue", propertyName, propertyValue == null ? null : propertyValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DateTime getTimestamp() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, newtonsoft.json.JsonWriterException, system.OverflowException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.FormatException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Timestamp");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimestamp(DateTime Timestamp) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Timestamp", Timestamp == null ? null : Timestamp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAltLink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AltLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAltLink(java.lang.String AltLink) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AltLink", AltLink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getETag() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, newtonsoft.json.JsonWriterException, system.OverflowException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.FormatException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ETag");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setETag(java.lang.String ETag) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ETag", ETag);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, newtonsoft.json.JsonWriterException, system.OverflowException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.FormatException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Id", Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getResourceId() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, newtonsoft.json.JsonWriterException, system.OverflowException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.FormatException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ResourceId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResourceId(java.lang.String ResourceId) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ResourceId", ResourceId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelfLink() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, newtonsoft.json.JsonWriterException, system.OverflowException, newtonsoft.json.JsonReaderException, newtonsoft.json.JsonSerializationException, system.FormatException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SelfLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelfLink(java.lang.String SelfLink) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, newtonsoft.json.JsonSerializationException, newtonsoft.json.JsonWriterException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SelfLink", SelfLink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}