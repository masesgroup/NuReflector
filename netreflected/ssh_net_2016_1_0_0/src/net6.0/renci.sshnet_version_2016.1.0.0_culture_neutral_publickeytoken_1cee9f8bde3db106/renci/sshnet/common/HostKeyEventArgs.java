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

package renci.sshnet.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.EventArgs;
import renci.sshnet.security.KeyHostAlgorithm;


/**
 * The base .NET class managing Renci.SshNet.Common.HostKeyEventArgs, Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.Common.HostKeyEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Renci.SshNet.Common.HostKeyEventArgs</a>
 */
public class HostKeyEventArgs extends EventArgs  {
    /**
     * Fully assembly qualified name: Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106
     */
    public static final String assemblyFullName = "Renci.SshNet, Version=2016.1.0.0, Culture=neutral, PublicKeyToken=1cee9f8bde3db106";
    /**
     * Assembly name: Renci.SshNet
     */
    public static final String assemblyShortName = "Renci.SshNet";
    /**
     * Qualified class name: Renci.SshNet.Common.HostKeyEventArgs
     */
    public static final String className = "Renci.SshNet.Common.HostKeyEventArgs";
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
    public HostKeyEventArgs(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HostKeyEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HostKeyEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HostKeyEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HostKeyEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public HostKeyEventArgs() throws Throwable {
    }

    public HostKeyEventArgs(KeyHostAlgorithm host) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(host == null ? null : host.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    
    public boolean getCanTrust() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanTrust");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanTrust(boolean CanTrust) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CanTrust", CanTrust);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getFingerPrint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("FingerPrint");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexFingerPrint = 0; indexFingerPrint < resultingArrayList.size(); indexFingerPrint++ ) {
				resultingArray[indexFingerPrint] = (byte)resultingArrayList.get(indexFingerPrint);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFingerPrint(byte[] FingerPrint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FingerPrint", FingerPrint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getHostKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("HostKey");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexHostKey = 0; indexHostKey < resultingArrayList.size(); indexHostKey++ ) {
				resultingArray[indexHostKey] = (byte)resultingArrayList.get(indexHostKey);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostKey(byte[] HostKey) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HostKey", HostKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getKeyLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("KeyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyLength(int KeyLength) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("KeyLength", KeyLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHostKeyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("HostKeyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostKeyName(java.lang.String HostKeyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HostKeyName", HostKeyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}