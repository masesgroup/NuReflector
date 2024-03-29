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

package microsoft.entityframeworkcore.internal;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.entityframeworkcore.changetracking.internal.IChangeDetector;
import microsoft.entityframeworkcore.changetracking.internal.IChangeDetectorImplementation;
import microsoft.entityframeworkcore.changetracking.internal.IEntityGraphAttacher;
import microsoft.entityframeworkcore.changetracking.internal.IEntityGraphAttacherImplementation;
import microsoft.entityframeworkcore.changetracking.internal.IStateManager;
import microsoft.entityframeworkcore.changetracking.internal.IStateManagerImplementation;
import microsoft.entityframeworkcore.internal.IDbSetSource;
import microsoft.entityframeworkcore.internal.IDbSetSourceImplementation;
import microsoft.entityframeworkcore.internal.IEntityFinderFactory;
import microsoft.entityframeworkcore.internal.IEntityFinderFactoryImplementation;
import microsoft.entityframeworkcore.query.IAsyncQueryProvider;
import microsoft.entityframeworkcore.query.IAsyncQueryProviderImplementation;


/**
 * The base .NET class managing Microsoft.EntityFrameworkCore.Internal.IDbContextDependencies, Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Internal.IDbContextDependencies" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.EntityFrameworkCore.Internal.IDbContextDependencies</a>
 */
public interface IDbContextDependencies extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60
     */
    public static final String assemblyFullName = "Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60";
    /**
     * Assembly name: Microsoft.EntityFrameworkCore
     */
    public static final String assemblyShortName = "Microsoft.EntityFrameworkCore";
    /**
     * Qualified class name: Microsoft.EntityFrameworkCore.Internal.IDbContextDependencies
     */
    public static final String className = "Microsoft.EntityFrameworkCore.Internal.IDbContextDependencies";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDbContextDependencies}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDbContextDependencies} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDbContextDependencies ToIDbContextDependencies(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.EntityFrameworkCore, Version=6.0.10.0, Culture=neutral, PublicKeyToken=adb9793829ddae60");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IDbContextDependenciesImplementation(from.getJCOInstance());
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
    

    
    // Properties section
    
    public IChangeDetector getChangeDetector() throws Throwable;

    public IEntityGraphAttacher getEntityGraphAttacher() throws Throwable;

    public IStateManager getStateManager() throws Throwable;

    public IDbSetSource getSetSource() throws Throwable;

    public IEntityFinderFactory getEntityFinderFactory() throws Throwable;

    public IAsyncQueryProvider getQueryProvider() throws Throwable;



    // Instance Events section
    

}