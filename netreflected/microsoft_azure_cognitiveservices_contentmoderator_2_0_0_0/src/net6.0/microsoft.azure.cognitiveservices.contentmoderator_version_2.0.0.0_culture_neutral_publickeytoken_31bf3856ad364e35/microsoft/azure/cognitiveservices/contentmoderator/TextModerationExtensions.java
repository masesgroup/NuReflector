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

package microsoft.azure.cognitiveservices.contentmoderator;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.azure.cognitiveservices.contentmoderator.models.DetectedLanguage;
import microsoft.azure.cognitiveservices.contentmoderator.ITextModeration;
import microsoft.azure.cognitiveservices.contentmoderator.ITextModerationImplementation;
import system.io.Stream;
import microsoft.azure.cognitiveservices.contentmoderator.models.Screen;


/**
 * The base .NET class managing Microsoft.Azure.CognitiveServices.ContentModerator.TextModerationExtensions, Microsoft.Azure.CognitiveServices.ContentModerator, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.ContentModerator.TextModerationExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.ContentModerator.TextModerationExtensions</a>
 */
public class TextModerationExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.CognitiveServices.ContentModerator, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.CognitiveServices.ContentModerator, Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.CognitiveServices.ContentModerator
     */
    public static final String assemblyShortName = "Microsoft.Azure.CognitiveServices.ContentModerator";
    /**
     * Qualified class name: Microsoft.Azure.CognitiveServices.ContentModerator.TextModerationExtensions
     */
    public static final String className = "Microsoft.Azure.CognitiveServices.ContentModerator.TextModerationExtensions";
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
    public TextModerationExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TextModerationExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TextModerationExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TextModerationExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextModerationExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public TextModerationExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static DetectedLanguage DetectLanguage(ITextModeration operations, java.lang.String textContentType, Stream textContent) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDetectLanguage = (JCObject)classType.Invoke("DetectLanguage", operations == null ? null : operations.getJCOInstance(), textContentType, textContent == null ? null : textContent.getJCOInstance());
            return new DetectedLanguage(objDetectLanguage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}