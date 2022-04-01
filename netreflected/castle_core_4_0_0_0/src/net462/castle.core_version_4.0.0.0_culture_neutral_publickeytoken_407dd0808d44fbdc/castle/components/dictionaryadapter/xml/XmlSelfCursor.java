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
import castle.components.dictionaryadapter.xml.IXmlNode;
import castle.components.dictionaryadapter.xml.IXmlNodeImplementation;
import castle.components.dictionaryadapter.xml.IXmlCursor;
import castle.components.dictionaryadapter.xml.IXmlCursorImplementation;
import castle.components.dictionaryadapter.xml.CompiledXPath;
import castle.components.dictionaryadapter.xml.IXmlIncludedTypeMap;
import castle.components.dictionaryadapter.xml.IXmlIncludedTypeMapImplementation;
import castle.components.dictionaryadapter.xml.IXmlNamespaceSource;
import castle.components.dictionaryadapter.xml.IXmlNamespaceSourceImplementation;
import castle.components.dictionaryadapter.xml.CursorFlags;
import castle.components.dictionaryadapter.xml.IXmlKnownTypeMap;
import castle.components.dictionaryadapter.xml.IXmlKnownTypeMapImplementation;
import castle.components.dictionaryadapter.xml.IXmlIterator;
import castle.components.dictionaryadapter.xml.IXmlIteratorImplementation;
import castle.components.dictionaryadapter.xml.XmlName;
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.EventHandler;


/**
 * The base .NET class managing Castle.Components.DictionaryAdapter.Xml.XmlSelfCursor, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.XmlSelfCursor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.XmlSelfCursor</a>
 */
public class XmlSelfCursor extends NetObject  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Components.DictionaryAdapter.Xml.XmlSelfCursor
     */
    public static final String className = "Castle.Components.DictionaryAdapter.Xml.XmlSelfCursor";
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
    public XmlSelfCursor(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlSelfCursor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlSelfCursor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlSelfCursor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlSelfCursor(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlSelfCursor() throws Throwable {
    }

    public XmlSelfCursor(IXmlNode node, NetType clrType) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(node == null ? null : node.getJCOInstance(), clrType == null ? null : clrType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean MoveNext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveNext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean UnderlyingPositionEquals(IXmlNode node) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("UnderlyingPositionEquals", node == null ? null : node.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlCursor Select(CompiledXPath path, IXmlIncludedTypeMap knownTypes, IXmlNamespaceSource namespaces, CursorFlags flags) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelect = (JCObject)classInstance.Invoke("Select", path == null ? null : path.getJCOInstance(), knownTypes == null ? null : knownTypes.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new IXmlCursorImplementation(objSelect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlCursor SelectChildren(IXmlKnownTypeMap knownTypes, IXmlNamespaceSource namespaces, CursorFlags flags) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelectChildren = (JCObject)classInstance.Invoke("SelectChildren", knownTypes == null ? null : knownTypes.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new IXmlCursorImplementation(objSelectChildren);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlCursor SelectSelf(NetType clrType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelectSelf = (JCObject)classInstance.Invoke("SelectSelf", clrType == null ? null : clrType.getJCOInstance());
            return new IXmlCursorImplementation(objSelectSelf);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlIterator SelectSubtree() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelectSubtree = (JCObject)classInstance.Invoke("SelectSubtree");
            return new IXmlIteratorImplementation(objSelectSubtree);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlNode Save() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSave = (JCObject)classInstance.Invoke("Save");
            return new IXmlNodeImplementation(objSave);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Evaluate(CompiledXPath path) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEvaluate = (JCObject)classInstance.Invoke("Evaluate", path == null ? null : path.getJCOInstance());
            return new NetObject(objEvaluate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAttribute(XmlName name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAttribute", name == null ? null : name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String LookupNamespaceUri(java.lang.String prefix) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("LookupNamespaceUri", prefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String LookupPrefix(java.lang.String namespaceUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("LookupPrefix", namespaceUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReader ReadSubtree() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSubtree = (JCObject)classInstance.Invoke("ReadSubtree");
            return new XmlReader(objReadSubtree);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter WriteAttributes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteAttributes = (JCObject)classInstance.Invoke("WriteAttributes");
            return new XmlWriter(objWriteAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter WriteChildren() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteChildren = (JCObject)classInstance.Invoke("WriteChildren");
            return new XmlWriter(objWriteChildren);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Coerce(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Coerce", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Create(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Create", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DefineNamespace(java.lang.String prefix, java.lang.String namespaceUri, boolean root) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DefineNamespace", prefix, namespaceUri, root);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MakeNext(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MakeNext", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(IXmlNode position) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", position == null ? null : position.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveToEnd() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveToEnd");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Realize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Realize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAllNext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAllNext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAttribute(XmlName name, java.lang.String value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAttribute", name == null ? null : name.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsAttribute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsElement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsElement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNil() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNil");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsNil(boolean IsNil) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsNil", IsNil);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompiledXPath getPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Path");
            return new CompiledXPath(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CursorFlags getFlags() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Flags");
            return new CursorFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlNamespaceSource getNamespaces() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Namespaces");
            return new IXmlNamespaceSourceImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlNode getParent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new IXmlNodeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlName getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Name");
            return new XmlName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlName getXsiType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XsiType");
            return new XmlName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getUnderlyingObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnderlyingObject");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(java.lang.String Value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Value", Value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXml() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Xml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getClrType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClrType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addRealized(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Realized", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRealized(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Realized", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}