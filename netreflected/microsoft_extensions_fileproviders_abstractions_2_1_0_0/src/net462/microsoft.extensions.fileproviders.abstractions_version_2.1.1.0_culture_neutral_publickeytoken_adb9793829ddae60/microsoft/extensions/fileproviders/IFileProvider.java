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

package microsoft.extensions.fileproviders;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.extensions.fileproviders.IDirectoryContents;
import microsoft.extensions.fileproviders.IDirectoryContentsImplementation;
import microsoft.extensions.fileproviders.IFileInfo;
import microsoft.extensions.fileproviders.IFileInfoImplementation;
import microsoft.extensions.primitives.IChangeToken;
import microsoft.extensions.primitives.IChangeTokenImplementation;


/**
 * The base .NET class managing Microsoft.Extensions.FileProviders.IFileProvider, Microsoft.Extensions.FileProviders.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.FileProviders.IFileProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Extensions.FileProviders.IFileProvider</a>
 */
public interface IFileProvider extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Extensions.FileProviders.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.Extensions.FileProviders.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.Extensions.FileProviders.Abstractions
     */
    public static final String assemblyShortName = "Microsoft.Extensions.FileProviders.Abstractions";
    /**
     * Qualified class name: Microsoft.Extensions.FileProviders.IFileProvider
     */
    public static final String className = "Microsoft.Extensions.FileProviders.IFileProvider";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IFileProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IFileProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IFileProvider ToIFileProvider(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Extensions.FileProviders.Abstractions, Version=2.1.1.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IFileProviderImplementation(from.getJCOInstance());
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
    
    public IDirectoryContents GetDirectoryContents(java.lang.String subpath) throws Throwable;

    public IFileInfo GetFileInfo(java.lang.String subpath) throws Throwable;

    public IChangeToken Watch(java.lang.String filter) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}