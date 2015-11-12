package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Requestmsgflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Requestmsgflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_13_11 = new TagInfo("c:get", //$NON-NLS-1$
            13, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_49 = new TagInfo("c:get", //$NON-NLS-1$
            13, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_6 = new TagInfo("c:get", //$NON-NLS-1$
            14, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_44 = new TagInfo("c:get", //$NON-NLS-1$
            14, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_1 = new TagInfo("c:if", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_11 = new TagInfo("c:get", //$NON-NLS-1$
            17, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_49 = new TagInfo("c:get", //$NON-NLS-1$
            17, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_6 = new TagInfo("c:get", //$NON-NLS-1$
            18, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_44 = new TagInfo("c:get", //$NON-NLS-1$
            18, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_11 = new TagInfo("c:get", //$NON-NLS-1$
            20, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_49 = new TagInfo("c:get", //$NON-NLS-1$
            20, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_6 = new TagInfo("c:get", //$NON-NLS-1$
            21, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_44 = new TagInfo("c:get", //$NON-NLS-1$
            21, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_12 = new TagInfo("c:get", //$NON-NLS-1$
            25, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_15 = new TagInfo("c:get", //$NON-NLS-1$
            26, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_5 = new TagInfo("c:if", //$NON-NLS-1$
            29, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_5 = new TagInfo("c:if", //$NON-NLS-1$
            35, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_10 = new TagInfo("c:get", //$NON-NLS-1$
            41, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_56 = new TagInfo("c:get", //$NON-NLS-1$
            41, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_15 = new TagInfo("c:get", //$NON-NLS-1$
            42, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_36 = new TagInfo("c:get", //$NON-NLS-1$
            44, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_90 = new TagInfo("c:get", //$NON-NLS-1$
            44, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_36 = new TagInfo("c:get", //$NON-NLS-1$
            46, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_90 = new TagInfo("c:get", //$NON-NLS-1$
            46, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_62 = new TagInfo("c:get", //$NON-NLS-1$
            47, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_26 = new TagInfo("c:get", //$NON-NLS-1$
            49, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_71 = new TagInfo("c:get", //$NON-NLS-1$
            49, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_15 = new TagInfo("c:get", //$NON-NLS-1$
            50, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_33 = new TagInfo("c:get", //$NON-NLS-1$
            51, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_36 = new TagInfo("c:get", //$NON-NLS-1$
            52, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_25 = new TagInfo("c:get", //$NON-NLS-1$
            66, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_18 = new TagInfo("c:get", //$NON-NLS-1$
            67, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_55 = new TagInfo("c:get", //$NON-NLS-1$
            67, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_99 = new TagInfo("c:get", //$NON-NLS-1$
            67, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_42 = new TagInfo("c:get", //$NON-NLS-1$
            73, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_85_5 = new TagInfo("c:if", //$NON-NLS-1$
            85, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/portType)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_86_5 = new TagInfo("c:if", //$NON-NLS-1$
            86, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/serviceWsdl/portType) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_6 = new TagInfo("c:if", //$NON-NLS-1$
            87, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/binding)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_88_3 = new TagInfo("c:if", //$NON-NLS-1$
            88, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/serviceWsdl/binding) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_89_8 = new TagInfo("c:if", //$NON-NLS-1$
            89, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/service)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_8 = new TagInfo("c:if", //$NON-NLS-1$
            90, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/portType)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_91_11 = new TagInfo("c:if", //$NON-NLS-1$
            91, 11,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/targetNamespace)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_92_6 = new TagInfo("c:if", //$NON-NLS-1$
            92, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/serviceWsdl/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_23 = new TagInfo("c:get", //$NON-NLS-1$
            96, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/fileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_27 = new TagInfo("c:get", //$NON-NLS-1$
            97, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/portType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_26 = new TagInfo("c:get", //$NON-NLS-1$
            98, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/binding", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_23 = new TagInfo("c:get", //$NON-NLS-1$
            99, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/port", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_26 = new TagInfo("c:get", //$NON-NLS-1$
            100, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_23 = new TagInfo("c:get", //$NON-NLS-1$
            102, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/service", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_103_7 = new TagInfo("c:if", //$NON-NLS-1$
            103, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/isMessageSetProject = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_29 = new TagInfo("c:get", //$NON-NLS-1$
            104, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/messageSetName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_106_1 = new TagInfo("c:if", //$NON-NLS-1$
            106, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofSOAPRequest = 'None'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_114_4 = new TagInfo("c:if", //$NON-NLS-1$
            114, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_24 = new TagInfo("c:get", //$NON-NLS-1$
            115, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_62 = new TagInfo("c:get", //$NON-NLS-1$
            115, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_24 = new TagInfo("c:get", //$NON-NLS-1$
            121, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_62 = new TagInfo("c:get", //$NON-NLS-1$
            121, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_24 = new TagInfo("c:get", //$NON-NLS-1$
            125, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_62 = new TagInfo("c:get", //$NON-NLS-1$
            125, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_41 = new TagInfo("c:get", //$NON-NLS-1$
            131, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_138_1 = new TagInfo("c:if", //$NON-NLS-1$
            138, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_149_1 = new TagInfo("c:if", //$NON-NLS-1$
            149, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_23 = new TagInfo("c:get", //$NON-NLS-1$
            152, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_153_21 = new TagInfo("c:get", //$NON-NLS-1$
            153, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_155_1 = new TagInfo("c:if", //$NON-NLS-1$
            155, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_19 = new TagInfo("c:get", //$NON-NLS-1$
            158, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_19 = new TagInfo("c:get", //$NON-NLS-1$
            159, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_162_1 = new TagInfo("c:if", //$NON-NLS-1$
            162, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_166_1 = new TagInfo("c:if", //$NON-NLS-1$
            166, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_34 = new TagInfo("c:get", //$NON-NLS-1$
            168, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_72 = new TagInfo("c:get", //$NON-NLS-1$
            168, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_171_1 = new TagInfo("c:if", //$NON-NLS-1$
            171, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_34 = new TagInfo("c:get", //$NON-NLS-1$
            173, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_72 = new TagInfo("c:get", //$NON-NLS-1$
            173, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmHTTPHeader.msgnode=\"ComIbmHTTPHeader.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQHeader.msgnode=\"ComIbmMQHeader.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPExtract.msgnode=\"ComIbmSOAPExtract.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPInput.msgnode=\"ComIbmSOAPInput.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTryCatch.msgnode = \"ComIbmTryCatch.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPReply.msgnode=\"ComIbmSOAPReply.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_11.setRuntimeParent(null);
        _jettag_c_get_13_11.setTagInfo(_td_c_get_13_11);
        _jettag_c_get_13_11.doStart(context, out);
        _jettag_c_get_13_11.doEnd();
        RuntimeTagElement _jettag_c_get_13_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_49.setRuntimeParent(null);
        _jettag_c_get_13_49.setTagInfo(_td_c_get_13_49);
        _jettag_c_get_13_49.doStart(context, out);
        _jettag_c_get_13_49.doEnd();
        out.write(".subflow =");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_6.setRuntimeParent(null);
        _jettag_c_get_14_6.setTagInfo(_td_c_get_14_6);
        _jettag_c_get_14_6.doStart(context, out);
        _jettag_c_get_14_6.doEnd();
        RuntimeTagElement _jettag_c_get_14_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_44.setRuntimeParent(null);
        _jettag_c_get_14_44.setTagInfo(_td_c_get_14_44);
        _jettag_c_get_14_44.doStart(context, out);
        _jettag_c_get_14_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_16_1.setRuntimeParent(null);
        _jettag_c_if_16_1.setTagInfo(_td_c_if_16_1);
        _jettag_c_if_16_1.doStart(context, out);
        while (_jettag_c_if_16_1.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_11.setRuntimeParent(_jettag_c_if_16_1);
            _jettag_c_get_17_11.setTagInfo(_td_c_get_17_11);
            _jettag_c_get_17_11.doStart(context, out);
            _jettag_c_get_17_11.doEnd();
            RuntimeTagElement _jettag_c_get_17_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_49.setRuntimeParent(_jettag_c_if_16_1);
            _jettag_c_get_17_49.setTagInfo(_td_c_get_17_49);
            _jettag_c_get_17_49.doStart(context, out);
            _jettag_c_get_17_49.doEnd();
            out.write(".subflow =");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_6.setRuntimeParent(_jettag_c_if_16_1);
            _jettag_c_get_18_6.setTagInfo(_td_c_get_18_6);
            _jettag_c_get_18_6.doStart(context, out);
            _jettag_c_get_18_6.doEnd();
            RuntimeTagElement _jettag_c_get_18_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_44.setRuntimeParent(_jettag_c_if_16_1);
            _jettag_c_get_18_44.setTagInfo(_td_c_get_18_44);
            _jettag_c_get_18_44.doStart(context, out);
            _jettag_c_get_18_44.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_16_1.handleBodyContent(out);
        }
        _jettag_c_if_16_1.doEnd();
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_11.setRuntimeParent(null);
        _jettag_c_get_20_11.setTagInfo(_td_c_get_20_11);
        _jettag_c_get_20_11.doStart(context, out);
        _jettag_c_get_20_11.doEnd();
        RuntimeTagElement _jettag_c_get_20_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_49.setRuntimeParent(null);
        _jettag_c_get_20_49.setTagInfo(_td_c_get_20_49);
        _jettag_c_get_20_49.doStart(context, out);
        _jettag_c_get_20_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_6.setRuntimeParent(null);
        _jettag_c_get_21_6.setTagInfo(_td_c_get_21_6);
        _jettag_c_get_21_6.doStart(context, out);
        _jettag_c_get_21_6.doEnd();
        RuntimeTagElement _jettag_c_get_21_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_44.setRuntimeParent(null);
        _jettag_c_get_21_44.setTagInfo(_td_c_get_21_44);
        _jettag_c_get_21_44.doStart(context, out);
        _jettag_c_get_21_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_12.setRuntimeParent(null);
        _jettag_c_get_25_12.setTagInfo(_td_c_get_25_12);
        _jettag_c_get_25_12.doStart(context, out);
        _jettag_c_get_25_12.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_15.setRuntimeParent(null);
        _jettag_c_get_26_15.setTagInfo(_td_c_get_26_15);
        _jettag_c_get_26_15.doStart(context, out);
        _jettag_c_get_26_15.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/> ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_29_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_29_5.setRuntimeParent(null);
        _jettag_c_if_29_5.setTagInfo(_td_c_if_29_5);
        _jettag_c_if_29_5.doStart(context, out);
        while (_jettag_c_if_29_5.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.LoggingOn\" name=\"LoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_29_5.handleBodyContent(out);
        }
        _jettag_c_if_29_5.doEnd();
        RuntimeTagElement _jettag_c_if_35_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_5.setRuntimeParent(null);
        _jettag_c_if_35_5.setTagInfo(_td_c_if_35_5);
        _jettag_c_if_35_5.doStart(context, out);
        while (_jettag_c_if_35_5.okToProcessBody()) {
            out.write("       <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_35_5.handleBodyContent(out);
        }
        _jettag_c_if_35_5.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_10.setRuntimeParent(null);
        _jettag_c_get_41_10.setTagInfo(_td_c_get_41_10);
        _jettag_c_get_41_10.doStart(context, out);
        _jettag_c_get_41_10.doEnd();
        out.write("\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_56.setRuntimeParent(null);
        _jettag_c_get_41_56.setTagInfo(_td_c_get_41_56);
        _jettag_c_get_41_56.doStart(context, out);
        _jettag_c_get_41_56.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_15.setRuntimeParent(null);
        _jettag_c_get_42_15.setTagInfo(_td_c_get_42_15);
        _jettag_c_get_42_15.doStart(context, out);
        _jettag_c_get_42_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_36.setRuntimeParent(null);
        _jettag_c_get_44_36.setTagInfo(_td_c_get_44_36);
        _jettag_c_get_44_36.doStart(context, out);
        _jettag_c_get_44_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_90.setRuntimeParent(null);
        _jettag_c_get_44_90.setTagInfo(_td_c_get_44_90);
        _jettag_c_get_44_90.doStart(context, out);
        _jettag_c_get_44_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_36.setRuntimeParent(null);
        _jettag_c_get_46_36.setTagInfo(_td_c_get_46_36);
        _jettag_c_get_46_36.doStart(context, out);
        _jettag_c_get_46_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_90.setRuntimeParent(null);
        _jettag_c_get_46_90.setTagInfo(_td_c_get_46_90);
        _jettag_c_get_46_90.doStart(context, out);
        _jettag_c_get_46_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_62.setRuntimeParent(null);
        _jettag_c_get_47_62.setTagInfo(_td_c_get_47_62);
        _jettag_c_get_47_62.doStart(context, out);
        _jettag_c_get_47_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_26.setRuntimeParent(null);
        _jettag_c_get_49_26.setTagInfo(_td_c_get_49_26);
        _jettag_c_get_49_26.doStart(context, out);
        _jettag_c_get_49_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_71.setRuntimeParent(null);
        _jettag_c_get_49_71.setTagInfo(_td_c_get_49_71);
        _jettag_c_get_49_71.doStart(context, out);
        _jettag_c_get_49_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_15.setRuntimeParent(null);
        _jettag_c_get_50_15.setTagInfo(_td_c_get_50_15);
        _jettag_c_get_50_15.doStart(context, out);
        _jettag_c_get_50_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_33.setRuntimeParent(null);
        _jettag_c_get_51_33.setTagInfo(_td_c_get_51_33);
        _jettag_c_get_51_33.doStart(context, out);
        _jettag_c_get_51_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_36.setRuntimeParent(null);
        _jettag_c_get_52_36.setTagInfo(_td_c_get_52_36);
        _jettag_c_get_52_36.doStart(context, out);
        _jettag_c_get_52_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmSOAPReply.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_10\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    location=\"711,21\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SOAP Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_14\" location=\"75,265\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log after response\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_5\" location=\"442,191\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_25.setRuntimeParent(null);
        _jettag_c_get_66_25.setTagInfo(_td_c_get_66_25);
        _jettag_c_get_66_25.doStart(context, out);
        _jettag_c_get_66_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_18.setRuntimeParent(null);
        _jettag_c_get_67_18.setTagInfo(_td_c_get_67_18);
        _jettag_c_get_67_18.doStart(context, out);
        _jettag_c_get_67_18.doEnd();
        RuntimeTagElement _jettag_c_get_67_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_55.setRuntimeParent(null);
        _jettag_c_get_67_55.setTagInfo(_td_c_get_67_55);
        _jettag_c_get_67_55.doStart(context, out);
        _jettag_c_get_67_55.doEnd();
        RuntimeTagElement _jettag_c_get_67_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_99); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_99.setRuntimeParent(null);
        _jettag_c_get_67_99.setTagInfo(_td_c_get_67_99);
        _jettag_c_get_67_99.doStart(context, out);
        _jettag_c_get_67_99.doEnd();
        out.write("\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Out to Provider\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"527,195\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_73_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_42.setRuntimeParent(null);
        _jettag_c_get_73_42.setTagInfo(_td_c_get_73_42);
        _jettag_c_get_73_42.doStart(context, out);
        _jettag_c_get_73_42.doEnd();
        out.write("Build_SOAP_Reply_Ack.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Acknowledgement\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_20\" location=\"142,188\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Catch  before Write\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"26,85\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        // check that all parameters can be extracted from wsdl 
        RuntimeTagElement _jettag_c_if_85_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_85_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_85_5.setRuntimeParent(null);
        _jettag_c_if_85_5.setTagInfo(_td_c_if_85_5);
        _jettag_c_if_85_5.doStart(context, out);
        while (_jettag_c_if_85_5.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_86_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_86_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_86_5.setRuntimeParent(_jettag_c_if_85_5);
            _jettag_c_if_86_5.setTagInfo(_td_c_if_86_5);
            _jettag_c_if_86_5.doStart(context, out);
            while (_jettag_c_if_86_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_87_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_87_6.setRuntimeParent(_jettag_c_if_86_5);
                _jettag_c_if_87_6.setTagInfo(_td_c_if_87_6);
                _jettag_c_if_87_6.doStart(context, out);
                while (_jettag_c_if_87_6.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_88_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_88_3.setRuntimeParent(_jettag_c_if_87_6);
                    _jettag_c_if_88_3.setTagInfo(_td_c_if_88_3);
                    _jettag_c_if_88_3.doStart(context, out);
                    while (_jettag_c_if_88_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_89_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_89_8); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_89_8.setRuntimeParent(_jettag_c_if_88_3);
                        _jettag_c_if_89_8.setTagInfo(_td_c_if_89_8);
                        _jettag_c_if_89_8.doStart(context, out);
                        while (_jettag_c_if_89_8.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_if_90_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_8); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_90_8.setRuntimeParent(_jettag_c_if_89_8);
                            _jettag_c_if_90_8.setTagInfo(_td_c_if_90_8);
                            _jettag_c_if_90_8.doStart(context, out);
                            while (_jettag_c_if_90_8.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_91_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_91_11); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_91_11.setRuntimeParent(_jettag_c_if_90_8);
                                _jettag_c_if_91_11.setTagInfo(_td_c_if_91_11);
                                _jettag_c_if_91_11.doStart(context, out);
                                while (_jettag_c_if_91_11.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_92_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_92_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_92_6.setRuntimeParent(_jettag_c_if_91_11);
                                    _jettag_c_if_92_6.setTagInfo(_td_c_if_92_6);
                                    _jettag_c_if_92_6.doStart(context, out);
                                    while (_jettag_c_if_92_6.okToProcessBody()) {
                                        // set up SOAP input only if all parameters are available 
                                        out.write("      ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      wsdlFileName = \"");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_96_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_23); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_96_23.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_96_23.setTagInfo(_td_c_get_96_23);
                                        _jettag_c_get_96_23.doStart(context, out);
                                        _jettag_c_get_96_23.doEnd();
                                        out.write("\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      selectedPortType = \"");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_97_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_27); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_97_27.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_97_27.setTagInfo(_td_c_get_97_27);
                                        _jettag_c_get_97_27.doStart(context, out);
                                        _jettag_c_get_97_27.doEnd();
                                        out.write("\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      selectedBinding = \"");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_98_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_26); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_98_26.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_98_26.setTagInfo(_td_c_get_98_26);
                                        _jettag_c_get_98_26.doStart(context, out);
                                        _jettag_c_get_98_26.doEnd();
                                        out.write("\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      selectedPort = \"");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_99_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_23); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_99_23.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_99_23.setTagInfo(_td_c_get_99_23);
                                        _jettag_c_get_99_23.doStart(context, out);
                                        _jettag_c_get_99_23.doEnd();
                                        out.write("\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      targetNamespace = \"");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_100_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_26); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_100_26.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_100_26.setTagInfo(_td_c_get_100_26);
                                        _jettag_c_get_100_26.doStart(context, out);
                                        _jettag_c_get_100_26.doEnd();
                                        out.write("\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      useHTTPTransport = \"true\" ");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("      urlSelector = \"/");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_102_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_23); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_102_23.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_get_102_23.setTagInfo(_td_c_get_102_23);
                                        _jettag_c_get_102_23.doStart(context, out);
                                        _jettag_c_get_102_23.doEnd();
                                        out.write("\"");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        RuntimeTagElement _jettag_c_if_103_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_103_7); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_103_7.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_if_103_7.setTagInfo(_td_c_if_103_7);
                                        _jettag_c_if_103_7.doStart(context, out);
                                        while (_jettag_c_if_103_7.okToProcessBody()) {
                                            out.write("      messageSetProperty = \"");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_104_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_29); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_104_29.setRuntimeParent(_jettag_c_if_103_7);
                                            _jettag_c_get_104_29.setTagInfo(_td_c_get_104_29);
                                            _jettag_c_get_104_29.doStart(context, out);
                                            _jettag_c_get_104_29.doEnd();
                                            out.write("\"");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_103_7.handleBodyContent(out);
                                        }
                                        _jettag_c_if_103_7.doEnd();
                                        RuntimeTagElement _jettag_c_if_106_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_106_1); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_106_1.setRuntimeParent(_jettag_c_if_92_6);
                                        _jettag_c_if_106_1.setTagInfo(_td_c_if_106_1);
                                        _jettag_c_if_106_1.doStart(context, out);
                                        while (_jettag_c_if_106_1.okToProcessBody()) {
                                            out.write("      parserXmlnscBuildTreeUsingXMLSchema=\"false\" validateMaster=\"none\"");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_106_1.handleBodyContent(out);
                                        }
                                        _jettag_c_if_106_1.doEnd();
                                        _jettag_c_if_92_6.handleBodyContent(out);
                                    }
                                    _jettag_c_if_92_6.doEnd();
                                    _jettag_c_if_91_11.handleBodyContent(out);
                                }
                                _jettag_c_if_91_11.doEnd();
                                _jettag_c_if_90_8.handleBodyContent(out);
                            }
                            _jettag_c_if_90_8.doEnd();
                            _jettag_c_if_89_8.handleBodyContent(out);
                        }
                        _jettag_c_if_89_8.doEnd();
                        _jettag_c_if_88_3.handleBodyContent(out);
                    }
                    _jettag_c_if_88_3.doEnd();
                    _jettag_c_if_87_6.handleBodyContent(out);
                }
                _jettag_c_if_87_6.doEnd();
                _jettag_c_if_86_5.handleBodyContent(out);
            }
            _jettag_c_if_86_5.doEnd();
            _jettag_c_if_85_5.handleBodyContent(out);
        }
        _jettag_c_if_85_5.doEnd();
        out.write(NL);         
        out.write(">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SOAP Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_114_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_114_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_114_4.setRuntimeParent(null);
        _jettag_c_if_114_4.setTagInfo(_td_c_if_114_4);
        _jettag_c_if_114_4.doStart(context, out);
        while (_jettag_c_if_114_4.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_115_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_115_24.setRuntimeParent(_jettag_c_if_114_4);
            _jettag_c_get_115_24.setTagInfo(_td_c_get_115_24);
            _jettag_c_get_115_24.doStart(context, out);
            _jettag_c_get_115_24.doEnd();
            RuntimeTagElement _jettag_c_get_115_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_115_62.setRuntimeParent(_jettag_c_if_114_4);
            _jettag_c_get_115_62.setTagInfo(_td_c_get_115_62);
            _jettag_c_get_115_62.doStart(context, out);
            _jettag_c_get_115_62.doEnd();
            out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      location=\"232,317\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_114_4.handleBodyContent(out);
        }
        _jettag_c_if_114_4.doEnd();
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_121_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_24.setRuntimeParent(null);
        _jettag_c_get_121_24.setTagInfo(_td_c_get_121_24);
        _jettag_c_get_121_24.doStart(context, out);
        _jettag_c_get_121_24.doEnd();
        RuntimeTagElement _jettag_c_get_121_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_62.setRuntimeParent(null);
        _jettag_c_get_121_62.setTagInfo(_td_c_get_121_62);
        _jettag_c_get_121_62.doStart(context, out);
        _jettag_c_get_121_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"280,28\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_125_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_24.setRuntimeParent(null);
        _jettag_c_get_125_24.setTagInfo(_td_c_get_125_24);
        _jettag_c_get_125_24.doStart(context, out);
        _jettag_c_get_125_24.doEnd();
        RuntimeTagElement _jettag_c_get_125_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_62.setRuntimeParent(null);
        _jettag_c_get_125_62.setTagInfo(_td_c_get_125_62);
        _jettag_c_get_125_62.doStart(context, out);
        _jettag_c_get_125_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"345,193\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Request_Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" location=\"274,192\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_131_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_131_41.setRuntimeParent(null);
        _jettag_c_get_131_41.setTagInfo(_td_c_get_131_41);
        _jettag_c_get_131_41.doStart(context, out);
        _jettag_c_get_131_41.doEnd();
        out.write("STRIP.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Strip to Body\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_16\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_5\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_23\" targetNode=\"FCMComposite_1_20\" sourceNode=\"FCMComposite_1_14\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_14\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_138_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_138_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_138_1.setRuntimeParent(null);
        _jettag_c_if_138_1.setTagInfo(_td_c_if_138_1);
        _jettag_c_if_138_1.doStart(context, out);
        while (_jettag_c_if_138_1.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_14\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_138_1.handleBodyContent(out);
        }
        _jettag_c_if_138_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_16\" sourceNode=\"FCMComposite_1_20\" sourceTerminalName=\"OutTerminal.try\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_16\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_20\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_149_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_149_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_149_1.setRuntimeParent(null);
        _jettag_c_if_149_1.setTagInfo(_td_c_if_149_1);
        _jettag_c_if_149_1.doStart(context, out);
        while (_jettag_c_if_149_1.okToProcessBody()) {
            out.write("     <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.LoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.LoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_152_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_152_23.setRuntimeParent(_jettag_c_if_149_1);
            _jettag_c_get_152_23.setTagInfo(_td_c_get_152_23);
            _jettag_c_get_152_23.doStart(context, out);
            _jettag_c_get_152_23.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_153_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_153_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_153_21.setRuntimeParent(_jettag_c_if_149_1);
            _jettag_c_get_153_21.setTagInfo(_td_c_get_153_21);
            _jettag_c_get_153_21.doStart(context, out);
            _jettag_c_get_153_21.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_149_1.handleBodyContent(out);
        }
        _jettag_c_if_149_1.doEnd();
        RuntimeTagElement _jettag_c_if_155_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_155_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_155_1.setRuntimeParent(null);
        _jettag_c_if_155_1.setTagInfo(_td_c_if_155_1);
        _jettag_c_if_155_1.doStart(context, out);
        while (_jettag_c_if_155_1.okToProcessBody()) {
            out.write("    <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \t\tbundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_158_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_158_19.setRuntimeParent(_jettag_c_if_155_1);
            _jettag_c_get_158_19.setTagInfo(_td_c_get_158_19);
            _jettag_c_get_158_19.doStart(context, out);
            _jettag_c_get_158_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_159_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_159_19.setRuntimeParent(_jettag_c_if_155_1);
            _jettag_c_get_159_19.setTagInfo(_td_c_get_159_19);
            _jettag_c_get_159_19.doStart(context, out);
            _jettag_c_get_159_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_155_1.handleBodyContent(out);
        }
        _jettag_c_if_155_1.doEnd();
        RuntimeTagElement _jettag_c_if_162_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_162_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_162_1.setRuntimeParent(null);
        _jettag_c_if_162_1.setTagInfo(_td_c_if_162_1);
        _jettag_c_if_162_1.doStart(context, out);
        while (_jettag_c_if_162_1.okToProcessBody()) {
            out.write("     </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_162_1.handleBodyContent(out);
        }
        _jettag_c_if_162_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_166_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_166_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_166_1.setRuntimeParent(null);
        _jettag_c_if_166_1.setTagInfo(_td_c_if_166_1);
        _jettag_c_if_166_1.doStart(context, out);
        while (_jettag_c_if_166_1.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_7\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_168_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_168_34.setRuntimeParent(_jettag_c_if_166_1);
            _jettag_c_get_168_34.setTagInfo(_td_c_get_168_34);
            _jettag_c_get_168_34.doStart(context, out);
            _jettag_c_get_168_34.doEnd();
            RuntimeTagElement _jettag_c_get_168_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_168_72.setRuntimeParent(_jettag_c_if_166_1);
            _jettag_c_get_168_72.setTagInfo(_td_c_get_168_72);
            _jettag_c_get_168_72.doStart(context, out);
            _jettag_c_get_168_72.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_166_1.handleBodyContent(out);
        }
        _jettag_c_if_166_1.doEnd();
        RuntimeTagElement _jettag_c_if_171_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_171_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_171_1.setRuntimeParent(null);
        _jettag_c_if_171_1.setTagInfo(_td_c_if_171_1);
        _jettag_c_if_171_1.doStart(context, out);
        while (_jettag_c_if_171_1.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.LoggingOn\" overriddenNodes=\"FCMComposite_1_6\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_173_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_34.setRuntimeParent(_jettag_c_if_171_1);
            _jettag_c_get_173_34.setTagInfo(_td_c_get_173_34);
            _jettag_c_get_173_34.doStart(context, out);
            _jettag_c_get_173_34.doEnd();
            RuntimeTagElement _jettag_c_get_173_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_72.setRuntimeParent(_jettag_c_if_171_1);
            _jettag_c_get_173_72.setTagInfo(_td_c_get_173_72);
            _jettag_c_get_173_72.doStart(context, out);
            _jettag_c_get_173_72.doEnd();
            out.write(".subflow#Property.LoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>  ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_171_1.handleBodyContent(out);
        }
        _jettag_c_if_171_1.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
