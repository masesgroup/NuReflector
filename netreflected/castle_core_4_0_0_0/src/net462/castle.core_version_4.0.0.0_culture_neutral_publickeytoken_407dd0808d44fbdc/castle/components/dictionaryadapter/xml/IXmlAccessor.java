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

// Import section
import castle.components.dictionaryadapter.xml.IXmlCollectionAccessor;
import castle.components.dictionaryadapter.xml.IXmlCollectionAccessorImplementation;
import castle.components.dictionaryadapter.xml.IXmlNode;
import castle.components.dictionaryadapter.xml.IXmlNodeImplementation;
import castle.components.dictionaryadapter.IDictionaryAdapter;
import castle.components.dictionaryadapter.IDictionaryAdapterImplementation;
import castle.components.dictionaryadapter.xml.XmlReferenceManager;
import castle.components.dictionaryadapter.xml.IXmlCursor;
import castle.components.dictionaryadapter.xml.IXmlCursorImplementation;
import castle.components.dictionaryadapter.xml.IXmlContext;
import castle.components.dictionaryadapter.xml.IXmlContextImplementation;
import castle.components.dictionaryadapter.xml.XmlTypeSerializer;


/**
 * The base .NET class managing Castle.Components.DictionaryAdapter.Xml.IXmlAccessor, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.IXmlAccessor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.IXmlAccessor</a>
 */
public interface IXmlAccessor extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Components.DictionaryAdapter.Xml.IXmlAccessor
     */
    public static final String className = "Castle.Components.DictionaryAdapter.Xml.IXmlAccessor";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXmlAccessor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXmlAccessor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXmlAccessor ToIXmlAccessor(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IXmlAccessorImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public IXmlCollectionAccessor GetCollectionAccessor(NetType itemType) throws Throwable;

    public NetObject GetValue(IXmlNode node, IDictionaryAdapter parentObject, XmlReferenceManager references, boolean nodeExists, boolean orStub) throws Throwable;

    public void SetValue(IXmlCursor cursor, IDictionaryAdapter parentObject, XmlReferenceManager references, boolean hasCurrent, NetObject oldValue, JCORefOut<NetObject> newValue) throws Throwable;


    
    // Properties section
    
    public boolean getIsNillable() throws Throwable;

    public boolean getIsReference() throws Throwable;

    public IXmlContext getContext() throws Throwable;

    public XmlTypeSerializer getSerializer() throws Throwable;

    public NetType getClrType() throws Throwable;



    // Instance Events section
    

}