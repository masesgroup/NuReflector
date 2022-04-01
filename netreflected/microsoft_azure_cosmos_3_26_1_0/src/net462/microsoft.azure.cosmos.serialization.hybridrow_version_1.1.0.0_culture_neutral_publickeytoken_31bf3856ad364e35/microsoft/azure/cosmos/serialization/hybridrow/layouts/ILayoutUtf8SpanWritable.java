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

package microsoft.azure.cosmos.serialization.hybridrow.layouts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.azure.cosmos.serialization.hybridrow.layouts.ILayoutType;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.ILayoutTypeImplementation;
import microsoft.azure.cosmos.serialization.hybridrow.Result;
import microsoft.azure.cosmos.serialization.hybridrow.RowBuffer;
import microsoft.azure.cosmos.serialization.hybridrow.RowCursor;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.LayoutColumn;
import microsoft.azure.cosmos.core.utf8.Utf8Span;
import microsoft.azure.cosmos.serialization.hybridrow.layouts.UpdateOptions;


/**
 * The base .NET class managing Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.ILayoutUtf8SpanWritable, Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.ILayoutUtf8SpanWritable" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.ILayoutUtf8SpanWritable</a>
 */
public interface ILayoutUtf8SpanWritable extends IJCOBridgeReflected, ILayoutType {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Serialization.HybridRow
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Serialization.HybridRow";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.ILayoutUtf8SpanWritable
     */
    public static final String className = "Microsoft.Azure.Cosmos.Serialization.HybridRow.Layouts.ILayoutUtf8SpanWritable";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ILayoutUtf8SpanWritable}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ILayoutUtf8SpanWritable} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ILayoutUtf8SpanWritable ToILayoutUtf8SpanWritable(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Azure.Cosmos.Serialization.HybridRow, Version=1.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ILayoutUtf8SpanWritableImplementation(from.getJCOInstance());
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
    
    public Result WriteFixed(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> scope, LayoutColumn col, Utf8Span value) throws Throwable;

    public Result WriteSparse(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> edit, Utf8Span value, UpdateOptions options) throws Throwable;

    public Result WriteVariable(JCORefOut<RowBuffer> b, JCORefOut<RowCursor> scope, LayoutColumn col, Utf8Span value) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}