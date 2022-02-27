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

package system.drawing.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Drawing.Printing.PaperKind, System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Printing.PaperKind" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Printing.PaperKind</a>
 */
public class PaperKind extends NetObject  {
    /**
     * Fully assembly qualified name: System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Drawing.Common
     */
    public static final String assemblyShortName = "System.Drawing.Common";
    /**
     * Qualified class name: System.Drawing.Printing.PaperKind
     */
    public static final String className = "System.Drawing.Printing.PaperKind";
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
    public PaperKind(java.lang.Object instance) {
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

    public PaperKind() {
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

    final static PaperKind getFrom(JCEnum object, String value) {
        try {
            return new PaperKind(object.fromValue(value));
        } catch (JCException e) {
            return new PaperKind(object);
        }
    }

    // Enum fields section
    
    public static PaperKind Custom = getFrom(enumReflected, "Custom");
    public static PaperKind Letter = getFrom(enumReflected, "Letter");
    public static PaperKind LetterSmall = getFrom(enumReflected, "LetterSmall");
    public static PaperKind Tabloid = getFrom(enumReflected, "Tabloid");
    public static PaperKind Ledger = getFrom(enumReflected, "Ledger");
    public static PaperKind Legal = getFrom(enumReflected, "Legal");
    public static PaperKind Statement = getFrom(enumReflected, "Statement");
    public static PaperKind Executive = getFrom(enumReflected, "Executive");
    public static PaperKind A3 = getFrom(enumReflected, "A3");
    public static PaperKind A4 = getFrom(enumReflected, "A4");
    public static PaperKind A4Small = getFrom(enumReflected, "A4Small");
    public static PaperKind A5 = getFrom(enumReflected, "A5");
    public static PaperKind B4 = getFrom(enumReflected, "B4");
    public static PaperKind B5 = getFrom(enumReflected, "B5");
    public static PaperKind Folio = getFrom(enumReflected, "Folio");
    public static PaperKind Quarto = getFrom(enumReflected, "Quarto");
    public static PaperKind Standard10x14 = getFrom(enumReflected, "Standard10x14");
    public static PaperKind Standard11x17 = getFrom(enumReflected, "Standard11x17");
    public static PaperKind Note = getFrom(enumReflected, "Note");
    public static PaperKind Number9Envelope = getFrom(enumReflected, "Number9Envelope");
    public static PaperKind Number10Envelope = getFrom(enumReflected, "Number10Envelope");
    public static PaperKind Number11Envelope = getFrom(enumReflected, "Number11Envelope");
    public static PaperKind Number12Envelope = getFrom(enumReflected, "Number12Envelope");
    public static PaperKind Number14Envelope = getFrom(enumReflected, "Number14Envelope");
    public static PaperKind CSheet = getFrom(enumReflected, "CSheet");
    public static PaperKind DSheet = getFrom(enumReflected, "DSheet");
    public static PaperKind ESheet = getFrom(enumReflected, "ESheet");
    public static PaperKind DLEnvelope = getFrom(enumReflected, "DLEnvelope");
    public static PaperKind C5Envelope = getFrom(enumReflected, "C5Envelope");
    public static PaperKind C3Envelope = getFrom(enumReflected, "C3Envelope");
    public static PaperKind C4Envelope = getFrom(enumReflected, "C4Envelope");
    public static PaperKind C6Envelope = getFrom(enumReflected, "C6Envelope");
    public static PaperKind C65Envelope = getFrom(enumReflected, "C65Envelope");
    public static PaperKind B4Envelope = getFrom(enumReflected, "B4Envelope");
    public static PaperKind B5Envelope = getFrom(enumReflected, "B5Envelope");
    public static PaperKind B6Envelope = getFrom(enumReflected, "B6Envelope");
    public static PaperKind ItalyEnvelope = getFrom(enumReflected, "ItalyEnvelope");
    public static PaperKind MonarchEnvelope = getFrom(enumReflected, "MonarchEnvelope");
    public static PaperKind PersonalEnvelope = getFrom(enumReflected, "PersonalEnvelope");
    public static PaperKind USStandardFanfold = getFrom(enumReflected, "USStandardFanfold");
    public static PaperKind GermanStandardFanfold = getFrom(enumReflected, "GermanStandardFanfold");
    public static PaperKind GermanLegalFanfold = getFrom(enumReflected, "GermanLegalFanfold");
    public static PaperKind IsoB4 = getFrom(enumReflected, "IsoB4");
    public static PaperKind JapanesePostcard = getFrom(enumReflected, "JapanesePostcard");
    public static PaperKind Standard9x11 = getFrom(enumReflected, "Standard9x11");
    public static PaperKind Standard10x11 = getFrom(enumReflected, "Standard10x11");
    public static PaperKind Standard15x11 = getFrom(enumReflected, "Standard15x11");
    public static PaperKind InviteEnvelope = getFrom(enumReflected, "InviteEnvelope");
    public static PaperKind LetterExtra = getFrom(enumReflected, "LetterExtra");
    public static PaperKind LegalExtra = getFrom(enumReflected, "LegalExtra");
    public static PaperKind TabloidExtra = getFrom(enumReflected, "TabloidExtra");
    public static PaperKind A4Extra = getFrom(enumReflected, "A4Extra");
    public static PaperKind LetterTransverse = getFrom(enumReflected, "LetterTransverse");
    public static PaperKind A4Transverse = getFrom(enumReflected, "A4Transverse");
    public static PaperKind LetterExtraTransverse = getFrom(enumReflected, "LetterExtraTransverse");
    public static PaperKind APlus = getFrom(enumReflected, "APlus");
    public static PaperKind BPlus = getFrom(enumReflected, "BPlus");
    public static PaperKind LetterPlus = getFrom(enumReflected, "LetterPlus");
    public static PaperKind A4Plus = getFrom(enumReflected, "A4Plus");
    public static PaperKind A5Transverse = getFrom(enumReflected, "A5Transverse");
    public static PaperKind B5Transverse = getFrom(enumReflected, "B5Transverse");
    public static PaperKind A3Extra = getFrom(enumReflected, "A3Extra");
    public static PaperKind A5Extra = getFrom(enumReflected, "A5Extra");
    public static PaperKind B5Extra = getFrom(enumReflected, "B5Extra");
    public static PaperKind A2 = getFrom(enumReflected, "A2");
    public static PaperKind A3Transverse = getFrom(enumReflected, "A3Transverse");
    public static PaperKind A3ExtraTransverse = getFrom(enumReflected, "A3ExtraTransverse");
    public static PaperKind JapaneseDoublePostcard = getFrom(enumReflected, "JapaneseDoublePostcard");
    public static PaperKind A6 = getFrom(enumReflected, "A6");
    public static PaperKind JapaneseEnvelopeKakuNumber2 = getFrom(enumReflected, "JapaneseEnvelopeKakuNumber2");
    public static PaperKind JapaneseEnvelopeKakuNumber3 = getFrom(enumReflected, "JapaneseEnvelopeKakuNumber3");
    public static PaperKind JapaneseEnvelopeChouNumber3 = getFrom(enumReflected, "JapaneseEnvelopeChouNumber3");
    public static PaperKind JapaneseEnvelopeChouNumber4 = getFrom(enumReflected, "JapaneseEnvelopeChouNumber4");
    public static PaperKind LetterRotated = getFrom(enumReflected, "LetterRotated");
    public static PaperKind A3Rotated = getFrom(enumReflected, "A3Rotated");
    public static PaperKind A4Rotated = getFrom(enumReflected, "A4Rotated");
    public static PaperKind A5Rotated = getFrom(enumReflected, "A5Rotated");
    public static PaperKind B4JisRotated = getFrom(enumReflected, "B4JisRotated");
    public static PaperKind B5JisRotated = getFrom(enumReflected, "B5JisRotated");
    public static PaperKind JapanesePostcardRotated = getFrom(enumReflected, "JapanesePostcardRotated");
    public static PaperKind JapaneseDoublePostcardRotated = getFrom(enumReflected, "JapaneseDoublePostcardRotated");
    public static PaperKind A6Rotated = getFrom(enumReflected, "A6Rotated");
    public static PaperKind JapaneseEnvelopeKakuNumber2Rotated = getFrom(enumReflected, "JapaneseEnvelopeKakuNumber2Rotated");
    public static PaperKind JapaneseEnvelopeKakuNumber3Rotated = getFrom(enumReflected, "JapaneseEnvelopeKakuNumber3Rotated");
    public static PaperKind JapaneseEnvelopeChouNumber3Rotated = getFrom(enumReflected, "JapaneseEnvelopeChouNumber3Rotated");
    public static PaperKind JapaneseEnvelopeChouNumber4Rotated = getFrom(enumReflected, "JapaneseEnvelopeChouNumber4Rotated");
    public static PaperKind B6Jis = getFrom(enumReflected, "B6Jis");
    public static PaperKind B6JisRotated = getFrom(enumReflected, "B6JisRotated");
    public static PaperKind Standard12x11 = getFrom(enumReflected, "Standard12x11");
    public static PaperKind JapaneseEnvelopeYouNumber4 = getFrom(enumReflected, "JapaneseEnvelopeYouNumber4");
    public static PaperKind JapaneseEnvelopeYouNumber4Rotated = getFrom(enumReflected, "JapaneseEnvelopeYouNumber4Rotated");
    public static PaperKind Prc16K = getFrom(enumReflected, "Prc16K");
    public static PaperKind Prc32K = getFrom(enumReflected, "Prc32K");
    public static PaperKind Prc32KBig = getFrom(enumReflected, "Prc32KBig");
    public static PaperKind PrcEnvelopeNumber1 = getFrom(enumReflected, "PrcEnvelopeNumber1");
    public static PaperKind PrcEnvelopeNumber2 = getFrom(enumReflected, "PrcEnvelopeNumber2");
    public static PaperKind PrcEnvelopeNumber3 = getFrom(enumReflected, "PrcEnvelopeNumber3");
    public static PaperKind PrcEnvelopeNumber4 = getFrom(enumReflected, "PrcEnvelopeNumber4");
    public static PaperKind PrcEnvelopeNumber5 = getFrom(enumReflected, "PrcEnvelopeNumber5");
    public static PaperKind PrcEnvelopeNumber6 = getFrom(enumReflected, "PrcEnvelopeNumber6");
    public static PaperKind PrcEnvelopeNumber7 = getFrom(enumReflected, "PrcEnvelopeNumber7");
    public static PaperKind PrcEnvelopeNumber8 = getFrom(enumReflected, "PrcEnvelopeNumber8");
    public static PaperKind PrcEnvelopeNumber9 = getFrom(enumReflected, "PrcEnvelopeNumber9");
    public static PaperKind PrcEnvelopeNumber10 = getFrom(enumReflected, "PrcEnvelopeNumber10");
    public static PaperKind Prc16KRotated = getFrom(enumReflected, "Prc16KRotated");
    public static PaperKind Prc32KRotated = getFrom(enumReflected, "Prc32KRotated");
    public static PaperKind Prc32KBigRotated = getFrom(enumReflected, "Prc32KBigRotated");
    public static PaperKind PrcEnvelopeNumber1Rotated = getFrom(enumReflected, "PrcEnvelopeNumber1Rotated");
    public static PaperKind PrcEnvelopeNumber2Rotated = getFrom(enumReflected, "PrcEnvelopeNumber2Rotated");
    public static PaperKind PrcEnvelopeNumber3Rotated = getFrom(enumReflected, "PrcEnvelopeNumber3Rotated");
    public static PaperKind PrcEnvelopeNumber4Rotated = getFrom(enumReflected, "PrcEnvelopeNumber4Rotated");
    public static PaperKind PrcEnvelopeNumber5Rotated = getFrom(enumReflected, "PrcEnvelopeNumber5Rotated");
    public static PaperKind PrcEnvelopeNumber6Rotated = getFrom(enumReflected, "PrcEnvelopeNumber6Rotated");
    public static PaperKind PrcEnvelopeNumber7Rotated = getFrom(enumReflected, "PrcEnvelopeNumber7Rotated");
    public static PaperKind PrcEnvelopeNumber8Rotated = getFrom(enumReflected, "PrcEnvelopeNumber8Rotated");
    public static PaperKind PrcEnvelopeNumber9Rotated = getFrom(enumReflected, "PrcEnvelopeNumber9Rotated");
    public static PaperKind PrcEnvelopeNumber10Rotated = getFrom(enumReflected, "PrcEnvelopeNumber10Rotated");


    // Flags management section


}