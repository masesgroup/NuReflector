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
import castle.components.dictionaryadapter.xml.XmlNodeAccessor;
import castle.components.dictionaryadapter.xml.IXmlContext;
import castle.components.dictionaryadapter.xml.IXmlContextImplementation;
import castle.components.dictionaryadapter.xml.IXmlCollectionAccessor;
import castle.components.dictionaryadapter.xml.IXmlCollectionAccessorImplementation;
import castle.components.dictionaryadapter.xml.IXmlCursor;
import castle.components.dictionaryadapter.xml.IXmlCursorImplementation;
import castle.components.dictionaryadapter.xml.IXmlNode;
import castle.components.dictionaryadapter.xml.IXmlNodeImplementation;
import system.xml.serialization.XmlElementAttribute;
import castle.components.dictionaryadapter.IDictionaryAdapter;
import castle.components.dictionaryadapter.IDictionaryAdapterImplementation;
import castle.components.dictionaryadapter.xml.XmlReferenceManager;


/**
 * The base .NET class managing Castle.Components.DictionaryAdapter.Xml.XmlElementBehaviorAccessor, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.XmlElementBehaviorAccessor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.XmlElementBehaviorAccessor</a>
 */
public class XmlElementBehaviorAccessor extends XmlNodeAccessor  {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Components.DictionaryAdapter.Xml.XmlElementBehaviorAccessor
     */
    public static final String className = "Castle.Components.DictionaryAdapter.Xml.XmlElementBehaviorAccessor";
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
    public XmlElementBehaviorAccessor(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlElementBehaviorAccessor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlElementBehaviorAccessor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlElementBehaviorAccessor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlElementBehaviorAccessor(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlElementBehaviorAccessor() throws Throwable {
    }

    public XmlElementBehaviorAccessor(java.lang.String name, NetType type, IXmlContext context) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, system.security.SecurityException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name, type == null ? null : type.getJCOInstance(), context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public IXmlCollectionAccessor GetCollectionAccessor(NetType itemType) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCollectionAccessor = (JCObject)classInstance.Invoke("GetCollectionAccessor", itemType == null ? null : itemType.getJCOInstance());
            return new IXmlCollectionAccessorImplementation(objGetCollectionAccessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlCursor SelectCollectionNode(IXmlNode node, boolean mutable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelectCollectionNode = (JCObject)classInstance.Invoke("SelectCollectionNode", node == null ? null : node.getJCOInstance(), mutable);
            return new IXmlCursorImplementation(objSelectCollectionNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXmlCursor SelectPropertyNode(IXmlNode node, boolean mutable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSelectPropertyNode = (JCObject)classInstance.Invoke("SelectPropertyNode", node == null ? null : node.getJCOInstance(), mutable);
            return new IXmlCursorImplementation(objSelectPropertyNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetLocalName(XmlElementAttribute attribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetLocalName", attribute == null ? null : attribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetNamespaceUri(XmlElementAttribute attribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetNamespaceUri", attribute == null ? null : attribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetClrType(XmlElementAttribute attribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetClrType = (JCObject)classInstance.Invoke("GetClrType", attribute == null ? null : attribute.getJCOInstance());
            return new NetType(objGetClrType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Configure(XmlElementAttribute attribute) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Configure", attribute == null ? null : attribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(IXmlCursor cursor, IDictionaryAdapter parentObject, XmlReferenceManager references, boolean hasCurrent, NetObject oldValue, JCORefOut<NetObject> newValue) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetValue", cursor == null ? null : cursor.getJCOInstance(), parentObject == null ? null : parentObject.getJCOInstance(), references == null ? null : references.getJCOInstance(), hasCurrent, oldValue == null ? null : oldValue.getJCOInstance(), newValue.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}