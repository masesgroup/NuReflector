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

package microsoft.azure.cosmos;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.cosmos.ChangeFeedProcessor;
import microsoft.azure.cosmos.ChangeFeedProcessorBuilder;
import microsoft.azure.cosmos.Container;
import system.TimeSpan;
import system.DateTime;


/**
 * The base .NET class managing Microsoft.Azure.Cosmos.ChangeFeedProcessorBuilder, Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.ChangeFeedProcessorBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.Cosmos.ChangeFeedProcessorBuilder</a>
 */
public class ChangeFeedProcessorBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.Cosmos.Client, Version=3.31.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.Cosmos.Client
     */
    public static final String assemblyShortName = "Microsoft.Azure.Cosmos.Client";
    /**
     * Qualified class name: Microsoft.Azure.Cosmos.ChangeFeedProcessorBuilder
     */
    public static final String className = "Microsoft.Azure.Cosmos.ChangeFeedProcessorBuilder";
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
    public ChangeFeedProcessorBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ChangeFeedProcessorBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ChangeFeedProcessorBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ChangeFeedProcessorBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ChangeFeedProcessorBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ChangeFeedProcessorBuilder() throws Throwable {
    }



    
    // Methods section
    
    public ChangeFeedProcessor Build() throws Throwable, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuild = (JCObject)classInstance.Invoke("Build");
            return new ChangeFeedProcessor(objBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeFeedProcessorBuilder WithInstanceName(java.lang.String instanceName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithInstanceName = (JCObject)classInstance.Invoke("WithInstanceName", instanceName);
            return new ChangeFeedProcessorBuilder(objWithInstanceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeFeedProcessorBuilder WithLeaseContainer(Container leaseContainer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithLeaseContainer = (JCObject)classInstance.Invoke("WithLeaseContainer", leaseContainer == null ? null : leaseContainer.getJCOInstance());
            return new ChangeFeedProcessorBuilder(objWithLeaseContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeFeedProcessorBuilder WithMaxItems(int maxItemCount) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithMaxItems = (JCObject)classInstance.Invoke("WithMaxItems", maxItemCount);
            return new ChangeFeedProcessorBuilder(objWithMaxItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeFeedProcessorBuilder WithPollInterval(TimeSpan pollInterval) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithPollInterval = (JCObject)classInstance.Invoke("WithPollInterval", pollInterval == null ? null : pollInterval.getJCOInstance());
            return new ChangeFeedProcessorBuilder(objWithPollInterval);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChangeFeedProcessorBuilder WithStartTime(DateTime startTime) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWithStartTime = (JCObject)classInstance.Invoke("WithStartTime", startTime == null ? null : startTime.getJCOInstance());
            return new ChangeFeedProcessorBuilder(objWithStartTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}