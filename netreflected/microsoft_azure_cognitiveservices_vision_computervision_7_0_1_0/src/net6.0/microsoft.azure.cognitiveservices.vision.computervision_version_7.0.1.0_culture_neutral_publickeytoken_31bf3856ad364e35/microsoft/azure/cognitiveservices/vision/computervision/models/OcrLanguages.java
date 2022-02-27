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

package microsoft.azure.cognitiveservices.vision.computervision.models;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.Azure.CognitiveServices.Vision.ComputerVision.Models.OcrLanguages, Microsoft.Azure.CognitiveServices.Vision.ComputerVision, Version=7.0.1.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.Vision.ComputerVision.Models.OcrLanguages" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Azure.CognitiveServices.Vision.ComputerVision.Models.OcrLanguages</a>
 */
public class OcrLanguages extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Azure.CognitiveServices.Vision.ComputerVision, Version=7.0.1.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Microsoft.Azure.CognitiveServices.Vision.ComputerVision, Version=7.0.1.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Microsoft.Azure.CognitiveServices.Vision.ComputerVision
     */
    public static final String assemblyShortName = "Microsoft.Azure.CognitiveServices.Vision.ComputerVision";
    /**
     * Qualified class name: Microsoft.Azure.CognitiveServices.Vision.ComputerVision.Models.OcrLanguages
     */
    public static final String className = "Microsoft.Azure.CognitiveServices.Vision.ComputerVision.Models.OcrLanguages";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public OcrLanguages(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public OcrLanguages() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    public JCType getJCOType() {
        return classType;
    }

    final static OcrLanguages getFrom(JCEnum object, String value) {
        try {
            return new OcrLanguages(object.fromValue(value));
        } catch (JCException e) {
            return new OcrLanguages(object);
        }
    }

    // Enum fields section
    
    public static OcrLanguages Unk = getFrom(enumReflected, "Unk");
    public static OcrLanguages ZhHans = getFrom(enumReflected, "ZhHans");
    public static OcrLanguages ZhHant = getFrom(enumReflected, "ZhHant");
    public static OcrLanguages Cs = getFrom(enumReflected, "Cs");
    public static OcrLanguages Da = getFrom(enumReflected, "Da");
    public static OcrLanguages Nl = getFrom(enumReflected, "Nl");
    public static OcrLanguages En = getFrom(enumReflected, "En");
    public static OcrLanguages Fi = getFrom(enumReflected, "Fi");
    public static OcrLanguages Fr = getFrom(enumReflected, "Fr");
    public static OcrLanguages De = getFrom(enumReflected, "De");
    public static OcrLanguages El = getFrom(enumReflected, "El");
    public static OcrLanguages Hu = getFrom(enumReflected, "Hu");
    public static OcrLanguages It = getFrom(enumReflected, "It");
    public static OcrLanguages Ja = getFrom(enumReflected, "Ja");
    public static OcrLanguages Ko = getFrom(enumReflected, "Ko");
    public static OcrLanguages Nb = getFrom(enumReflected, "Nb");
    public static OcrLanguages Pl = getFrom(enumReflected, "Pl");
    public static OcrLanguages Pt = getFrom(enumReflected, "Pt");
    public static OcrLanguages Ru = getFrom(enumReflected, "Ru");
    public static OcrLanguages Es = getFrom(enumReflected, "Es");
    public static OcrLanguages Sv = getFrom(enumReflected, "Sv");
    public static OcrLanguages Tr = getFrom(enumReflected, "Tr");
    public static OcrLanguages Ar = getFrom(enumReflected, "Ar");
    public static OcrLanguages Ro = getFrom(enumReflected, "Ro");
    public static OcrLanguages SrCyrl = getFrom(enumReflected, "SrCyrl");
    public static OcrLanguages SrLatn = getFrom(enumReflected, "SrLatn");
    public static OcrLanguages Sk = getFrom(enumReflected, "Sk");


    // Flags management section


}