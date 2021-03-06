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

package castle.components.dictionaryadapter.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import castle.components.dictionaryadapter.PropertyDescriptor;
import castle.components.dictionaryadapter.DictionaryAdapterMeta;
import castle.components.dictionaryadapter.xml.XmlAccessor;
import castle.components.dictionaryadapter.xml.XmlMetadata;
import castle.components.dictionaryadapter.IDictionaryAdapter;
import castle.components.dictionaryadapter.IDictionaryAdapterImplementation;
import castle.components.dictionaryadapter.xml.XmlAdapter;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;


/**
 * The base .NET class managing Castle.Components.DictionaryAdapter.Xml.DictionaryAdapterExtensions, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.DictionaryAdapterExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.DictionaryAdapterExtensions</a>
 */
public class DictionaryAdapterExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Components.DictionaryAdapter.Xml.DictionaryAdapterExtensions
     */
    public static final String className = "Castle.Components.DictionaryAdapter.Xml.DictionaryAdapterExtensions";
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
    public DictionaryAdapterExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DictionaryAdapterExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DictionaryAdapterExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DictionaryAdapterExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DictionaryAdapterExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public DictionaryAdapterExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean HasAccessor(PropertyDescriptor property) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("HasAccessor", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean HasXmlMeta(DictionaryAdapterMeta meta) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("HasXmlMeta", meta == null ? null : meta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean HasXmlType(DictionaryAdapterMeta meta) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("HasXmlType", meta == null ? null : meta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlAccessor GetAccessor(PropertyDescriptor property) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessor = (JCObject)classType.Invoke("GetAccessor", property == null ? null : property.getJCOInstance());
            return new XmlAccessor(objGetAccessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlMetadata GetXmlMeta(DictionaryAdapterMeta meta) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetXmlMeta = (JCObject)classType.Invoke("GetXmlMeta", meta == null ? null : meta.getJCOInstance());
            return new XmlMetadata(objGetXmlMeta);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateChildAdapter(IDictionaryAdapter parent, NetType type, XmlAdapter adapter) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateChildAdapter = (JCObject)classType.Invoke("CreateChildAdapter", parent == null ? null : parent.getJCOInstance(), type == null ? null : type.getJCOInstance(), adapter == null ? null : adapter.getJCOInstance());
            return new NetObject(objCreateChildAdapter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateChildAdapter(IDictionaryAdapter parent, NetType type, XmlAdapter adapter, IDictionary dictionary) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateChildAdapter = (JCObject)classType.Invoke("CreateChildAdapter", parent == null ? null : parent.getJCOInstance(), type == null ? null : type.getJCOInstance(), adapter == null ? null : adapter.getJCOInstance(), dictionary == null ? null : dictionary.getJCOInstance());
            return new NetObject(objCreateChildAdapter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetXmlType(DictionaryAdapterMeta meta) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetXmlType", meta == null ? null : meta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAccessor(PropertyDescriptor property, XmlAccessor accessor) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAccessor", property == null ? null : property.getJCOInstance(), accessor == null ? null : accessor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetXmlMeta(DictionaryAdapterMeta meta, XmlMetadata xmlMeta) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetXmlMeta", meta == null ? null : meta.getJCOInstance(), xmlMeta == null ? null : xmlMeta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetXmlType(DictionaryAdapterMeta meta, java.lang.String value) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetXmlType", meta == null ? null : meta.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}