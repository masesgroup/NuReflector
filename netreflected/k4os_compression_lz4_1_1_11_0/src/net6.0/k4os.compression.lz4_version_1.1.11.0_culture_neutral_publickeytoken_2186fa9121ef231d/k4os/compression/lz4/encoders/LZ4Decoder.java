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

package k4os.compression.lz4.encoders;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import k4os.compression.lz4.encoders.ILZ4Decoder;
import k4os.compression.lz4.encoders.ILZ4DecoderImplementation;


/**
 * The base .NET class managing K4os.Compression.LZ4.Encoders.LZ4Decoder, K4os.Compression.LZ4, Version=1.1.11.0, Culture=neutral, PublicKeyToken=2186fa9121ef231d.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/K4os.Compression.LZ4.Encoders.LZ4Decoder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/K4os.Compression.LZ4.Encoders.LZ4Decoder</a>
 */
public class LZ4Decoder extends NetObject  {
    /**
     * Fully assembly qualified name: K4os.Compression.LZ4, Version=1.1.11.0, Culture=neutral, PublicKeyToken=2186fa9121ef231d
     */
    public static final String assemblyFullName = "K4os.Compression.LZ4, Version=1.1.11.0, Culture=neutral, PublicKeyToken=2186fa9121ef231d";
    /**
     * Assembly name: K4os.Compression.LZ4
     */
    public static final String assemblyShortName = "K4os.Compression.LZ4";
    /**
     * Qualified class name: K4os.Compression.LZ4.Encoders.LZ4Decoder
     */
    public static final String className = "K4os.Compression.LZ4.Encoders.LZ4Decoder";
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
    public LZ4Decoder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LZ4Decoder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LZ4Decoder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LZ4Decoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LZ4Decoder(from.getJCOInstance());
    }

    // Constructors section
    
    public LZ4Decoder() throws Throwable {
    }

    
    // Methods section
    
    public static ILZ4Decoder Create(boolean chaining, int blockSize, int extraBlocks) throws Throwable, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", chaining, blockSize, extraBlocks);
            return new ILZ4DecoderImplementation(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}