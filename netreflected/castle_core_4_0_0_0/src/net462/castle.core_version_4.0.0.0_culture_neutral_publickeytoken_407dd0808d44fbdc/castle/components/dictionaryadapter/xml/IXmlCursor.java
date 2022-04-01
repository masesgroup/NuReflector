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
import castle.components.dictionaryadapter.xml.IXmlIterator;
import castle.components.dictionaryadapter.xml.IXmlIteratorImplementation;
import castle.components.dictionaryadapter.xml.IXmlNode;
import castle.components.dictionaryadapter.xml.IXmlNodeImplementation;
import castle.components.dictionaryadapter.xml.IXmlKnownType;
import castle.components.dictionaryadapter.xml.IXmlKnownTypeImplementation;
import castle.components.dictionaryadapter.xml.IXmlIdentity;
import castle.components.dictionaryadapter.xml.IXmlIdentityImplementation;
import castle.components.dictionaryadapter.xml.IRealizableSource;
import castle.components.dictionaryadapter.xml.IRealizableSourceImplementation;
import castle.components.dictionaryadapter.IVirtual;
import castle.components.dictionaryadapter.IVirtualImplementation;
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
import castle.components.dictionaryadapter.xml.XmlName;
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.EventHandler;


/**
 * The base .NET class managing Castle.Components.DictionaryAdapter.Xml.IXmlCursor, Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.IXmlCursor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Castle.Components.DictionaryAdapter.Xml.IXmlCursor</a>
 */
public interface IXmlCursor extends IJCOBridgeReflected, IXmlIterator, IXmlNode, IXmlKnownType, IXmlIdentity, IRealizableSource, IVirtual {
    /**
     * Fully assembly qualified name: Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc
     */
    public static final String assemblyFullName = "Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc";
    /**
     * Assembly name: Castle.Core
     */
    public static final String assemblyShortName = "Castle.Core";
    /**
     * Qualified class name: Castle.Components.DictionaryAdapter.Xml.IXmlCursor
     */
    public static final String className = "Castle.Components.DictionaryAdapter.Xml.IXmlCursor";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXmlCursor}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXmlCursor} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXmlCursor ToIXmlCursor(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Castle.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=407dd0808d44fbdc");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IXmlCursorImplementation(from.getJCOInstance());
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
    















    public void Coerce(NetType type) throws Throwable;

    public void Create(NetType type) throws Throwable;


    public void MoveTo(IXmlNode node) throws Throwable;

    public void MoveToEnd() throws Throwable;


    public void Remove() throws Throwable;

    public void RemoveAllNext() throws Throwable;

    public void Reset() throws Throwable;



    
    // Properties section
    


    // Instance Events section
    

}