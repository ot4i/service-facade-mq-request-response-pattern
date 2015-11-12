package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Requestmsgflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Requestmsgflow_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_14_11 = new TagInfo("c:get", //$NON-NLS-1$
            14, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_49 = new TagInfo("c:get", //$NON-NLS-1$
            14, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_6 = new TagInfo("c:get", //$NON-NLS-1$
            15, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_44 = new TagInfo("c:get", //$NON-NLS-1$
            15, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_1 = new TagInfo("c:if", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_11 = new TagInfo("c:get", //$NON-NLS-1$
            18, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_49 = new TagInfo("c:get", //$NON-NLS-1$
            18, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_6 = new TagInfo("c:get", //$NON-NLS-1$
            19, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_44 = new TagInfo("c:get", //$NON-NLS-1$
            19, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_11 = new TagInfo("c:get", //$NON-NLS-1$
            21, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_49 = new TagInfo("c:get", //$NON-NLS-1$
            21, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_6 = new TagInfo("c:get", //$NON-NLS-1$
            22, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_44 = new TagInfo("c:get", //$NON-NLS-1$
            22, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_13 = new TagInfo("c:get", //$NON-NLS-1$
            26, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_15 = new TagInfo("c:get", //$NON-NLS-1$
            27, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_5 = new TagInfo("c:if", //$NON-NLS-1$
            30, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_5 = new TagInfo("c:if", //$NON-NLS-1$
            36, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_10 = new TagInfo("c:get", //$NON-NLS-1$
            42, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_56 = new TagInfo("c:get", //$NON-NLS-1$
            42, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_15 = new TagInfo("c:get", //$NON-NLS-1$
            43, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_36 = new TagInfo("c:get", //$NON-NLS-1$
            45, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_90 = new TagInfo("c:get", //$NON-NLS-1$
            45, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_36 = new TagInfo("c:get", //$NON-NLS-1$
            47, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_90 = new TagInfo("c:get", //$NON-NLS-1$
            47, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_62 = new TagInfo("c:get", //$NON-NLS-1$
            48, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_26 = new TagInfo("c:get", //$NON-NLS-1$
            50, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_71 = new TagInfo("c:get", //$NON-NLS-1$
            50, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_15 = new TagInfo("c:get", //$NON-NLS-1$
            51, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_33 = new TagInfo("c:get", //$NON-NLS-1$
            52, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_36 = new TagInfo("c:get", //$NON-NLS-1$
            53, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_25 = new TagInfo("c:get", //$NON-NLS-1$
            62, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_18 = new TagInfo("c:get", //$NON-NLS-1$
            63, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_55 = new TagInfo("c:get", //$NON-NLS-1$
            63, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/providerRequestQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_99 = new TagInfo("c:get", //$NON-NLS-1$
            63, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_69_7 = new TagInfo("c:if", //$NON-NLS-1$
            69, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/portType) \r\n   \tand string-length($root/serviceWsdl/portType) > 0\r\n    and boolean($root/serviceWsdl/binding)\r\n\tand string-length($root/serviceWsdl/binding) > 0\r\n    and boolean($root/serviceWsdl/port)\r\n    and boolean($root/serviceWsdl/portType)\r\n    and boolean($root/serviceWsdl/targetNamespace)\r\n\tand string-length($root/serviceWsdl/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_21 = new TagInfo("c:get", //$NON-NLS-1$
            79, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/fileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_25 = new TagInfo("c:get", //$NON-NLS-1$
            81, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/portType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_24 = new TagInfo("c:get", //$NON-NLS-1$
            82, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/binding", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_21 = new TagInfo("c:get", //$NON-NLS-1$
            83, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/port", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_25 = new TagInfo("c:get", //$NON-NLS-1$
            84, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_21 = new TagInfo("c:get", //$NON-NLS-1$
            86, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/service", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_7 = new TagInfo("c:if", //$NON-NLS-1$
            87, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/isMessageSetProject = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_29 = new TagInfo("c:get", //$NON-NLS-1$
            88, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWsdl/messageSetName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_1 = new TagInfo("c:if", //$NON-NLS-1$
            90, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofSOAPRequest = 'None'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_19 = new TagInfo("c:get", //$NON-NLS-1$
            98, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_21 = new TagInfo("c:get", //$NON-NLS-1$
            102, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_58 = new TagInfo("c:get", //$NON-NLS-1$
            102, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_95 = new TagInfo("c:get", //$NON-NLS-1$
            102, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_41 = new TagInfo("c:get", //$NON-NLS-1$
            107, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_18 = new TagInfo("c:get", //$NON-NLS-1$
            113, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_55 = new TagInfo("c:get", //$NON-NLS-1$
            113, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/storeQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_89 = new TagInfo("c:get", //$NON-NLS-1$
            113, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_51 = new TagInfo("c:get", //$NON-NLS-1$
            121, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_41 = new TagInfo("c:get", //$NON-NLS-1$
            127, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_24 = new TagInfo("c:get", //$NON-NLS-1$
            131, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_62 = new TagInfo("c:get", //$NON-NLS-1$
            131, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_24 = new TagInfo("c:get", //$NON-NLS-1$
            136, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_62 = new TagInfo("c:get", //$NON-NLS-1$
            136, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_142_1 = new TagInfo("c:if", //$NON-NLS-1$
            142, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_24 = new TagInfo("c:get", //$NON-NLS-1$
            143, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_62 = new TagInfo("c:get", //$NON-NLS-1$
            143, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_154_1 = new TagInfo("c:if", //$NON-NLS-1$
            154, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_169_1 = new TagInfo("c:if", //$NON-NLS-1$
            169, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_23 = new TagInfo("c:get", //$NON-NLS-1$
            172, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_21 = new TagInfo("c:get", //$NON-NLS-1$
            173, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_175_1 = new TagInfo("c:if", //$NON-NLS-1$
            175, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_178_19 = new TagInfo("c:get", //$NON-NLS-1$
            178, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_19 = new TagInfo("c:get", //$NON-NLS-1$
            179, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_182_1 = new TagInfo("c:if", //$NON-NLS-1$
            182, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_186_1 = new TagInfo("c:if", //$NON-NLS-1$
            186, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_188_34 = new TagInfo("c:get", //$NON-NLS-1$
            188, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_188_72 = new TagInfo("c:get", //$NON-NLS-1$
            188, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_191_1 = new TagInfo("c:if", //$NON-NLS-1$
            191, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_34 = new TagInfo("c:get", //$NON-NLS-1$
            193, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_193_72 = new TagInfo("c:get", //$NON-NLS-1$
            193, 72,
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
        out.write("    xmlns:ComIbmDatabase.msgnode=\"ComIbmDatabase.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    xmlns:ComIbmMQHeader.msgnode=\"ComIbmMQHeader.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPExtract.msgnode=\"ComIbmSOAPExtract.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPInput.msgnode=\"ComIbmSOAPInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTryCatch.msgnode=\"ComIbmTryCatch.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_11.setRuntimeParent(null);
        _jettag_c_get_14_11.setTagInfo(_td_c_get_14_11);
        _jettag_c_get_14_11.doStart(context, out);
        _jettag_c_get_14_11.doEnd();
        RuntimeTagElement _jettag_c_get_14_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_49.setRuntimeParent(null);
        _jettag_c_get_14_49.setTagInfo(_td_c_get_14_49);
        _jettag_c_get_14_49.doStart(context, out);
        _jettag_c_get_14_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_6.setRuntimeParent(null);
        _jettag_c_get_15_6.setTagInfo(_td_c_get_15_6);
        _jettag_c_get_15_6.doStart(context, out);
        _jettag_c_get_15_6.doEnd();
        RuntimeTagElement _jettag_c_get_15_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_44.setRuntimeParent(null);
        _jettag_c_get_15_44.setTagInfo(_td_c_get_15_44);
        _jettag_c_get_15_44.doStart(context, out);
        _jettag_c_get_15_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_17_1.setRuntimeParent(null);
        _jettag_c_if_17_1.setTagInfo(_td_c_if_17_1);
        _jettag_c_if_17_1.doStart(context, out);
        while (_jettag_c_if_17_1.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_11.setRuntimeParent(_jettag_c_if_17_1);
            _jettag_c_get_18_11.setTagInfo(_td_c_get_18_11);
            _jettag_c_get_18_11.doStart(context, out);
            _jettag_c_get_18_11.doEnd();
            RuntimeTagElement _jettag_c_get_18_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_49.setRuntimeParent(_jettag_c_if_17_1);
            _jettag_c_get_18_49.setTagInfo(_td_c_get_18_49);
            _jettag_c_get_18_49.doStart(context, out);
            _jettag_c_get_18_49.doEnd();
            out.write(".subflow=");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_19_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_6.setRuntimeParent(_jettag_c_if_17_1);
            _jettag_c_get_19_6.setTagInfo(_td_c_get_19_6);
            _jettag_c_get_19_6.doStart(context, out);
            _jettag_c_get_19_6.doEnd();
            RuntimeTagElement _jettag_c_get_19_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_44.setRuntimeParent(_jettag_c_if_17_1);
            _jettag_c_get_19_44.setTagInfo(_td_c_get_19_44);
            _jettag_c_get_19_44.doStart(context, out);
            _jettag_c_get_19_44.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_17_1.handleBodyContent(out);
        }
        _jettag_c_if_17_1.doEnd();
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_11.setRuntimeParent(null);
        _jettag_c_get_21_11.setTagInfo(_td_c_get_21_11);
        _jettag_c_get_21_11.doStart(context, out);
        _jettag_c_get_21_11.doEnd();
        RuntimeTagElement _jettag_c_get_21_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_49.setRuntimeParent(null);
        _jettag_c_get_21_49.setTagInfo(_td_c_get_21_49);
        _jettag_c_get_21_49.doStart(context, out);
        _jettag_c_get_21_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_6.setRuntimeParent(null);
        _jettag_c_get_22_6.setTagInfo(_td_c_get_22_6);
        _jettag_c_get_22_6.doStart(context, out);
        _jettag_c_get_22_6.doEnd();
        RuntimeTagElement _jettag_c_get_22_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_44.setRuntimeParent(null);
        _jettag_c_get_22_44.setTagInfo(_td_c_get_22_44);
        _jettag_c_get_22_44.doStart(context, out);
        _jettag_c_get_22_44.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_13.setRuntimeParent(null);
        _jettag_c_get_26_13.setTagInfo(_td_c_get_26_13);
        _jettag_c_get_26_13.doStart(context, out);
        _jettag_c_get_26_13.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_15.setRuntimeParent(null);
        _jettag_c_get_27_15.setTagInfo(_td_c_get_27_15);
        _jettag_c_get_27_15.doStart(context, out);
        _jettag_c_get_27_15.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/> ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_30_5.setRuntimeParent(null);
        _jettag_c_if_30_5.setTagInfo(_td_c_if_30_5);
        _jettag_c_if_30_5.doStart(context, out);
        while (_jettag_c_if_30_5.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.RequestLoggingOn\" name=\"RequestLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_30_5.handleBodyContent(out);
        }
        _jettag_c_if_30_5.doEnd();
        RuntimeTagElement _jettag_c_if_36_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_36_5.setRuntimeParent(null);
        _jettag_c_if_36_5.setTagInfo(_td_c_if_36_5);
        _jettag_c_if_36_5.doStart(context, out);
        while (_jettag_c_if_36_5.okToProcessBody()) {
            out.write("       <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_36_5.handleBodyContent(out);
        }
        _jettag_c_if_36_5.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_10.setRuntimeParent(null);
        _jettag_c_get_42_10.setTagInfo(_td_c_get_42_10);
        _jettag_c_get_42_10.doStart(context, out);
        _jettag_c_get_42_10.doEnd();
        out.write("\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_56.setRuntimeParent(null);
        _jettag_c_get_42_56.setTagInfo(_td_c_get_42_56);
        _jettag_c_get_42_56.doStart(context, out);
        _jettag_c_get_42_56.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_15.setRuntimeParent(null);
        _jettag_c_get_43_15.setTagInfo(_td_c_get_43_15);
        _jettag_c_get_43_15.doStart(context, out);
        _jettag_c_get_43_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_36.setRuntimeParent(null);
        _jettag_c_get_45_36.setTagInfo(_td_c_get_45_36);
        _jettag_c_get_45_36.doStart(context, out);
        _jettag_c_get_45_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_90.setRuntimeParent(null);
        _jettag_c_get_45_90.setTagInfo(_td_c_get_45_90);
        _jettag_c_get_45_90.doStart(context, out);
        _jettag_c_get_45_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_36.setRuntimeParent(null);
        _jettag_c_get_47_36.setTagInfo(_td_c_get_47_36);
        _jettag_c_get_47_36.doStart(context, out);
        _jettag_c_get_47_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_90.setRuntimeParent(null);
        _jettag_c_get_47_90.setTagInfo(_td_c_get_47_90);
        _jettag_c_get_47_90.doStart(context, out);
        _jettag_c_get_47_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_62.setRuntimeParent(null);
        _jettag_c_get_48_62.setTagInfo(_td_c_get_48_62);
        _jettag_c_get_48_62.doStart(context, out);
        _jettag_c_get_48_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_26.setRuntimeParent(null);
        _jettag_c_get_50_26.setTagInfo(_td_c_get_50_26);
        _jettag_c_get_50_26.doStart(context, out);
        _jettag_c_get_50_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_71.setRuntimeParent(null);
        _jettag_c_get_50_71.setTagInfo(_td_c_get_50_71);
        _jettag_c_get_50_71.doStart(context, out);
        _jettag_c_get_50_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_15.setRuntimeParent(null);
        _jettag_c_get_51_15.setTagInfo(_td_c_get_51_15);
        _jettag_c_get_51_15.doStart(context, out);
        _jettag_c_get_51_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_33.setRuntimeParent(null);
        _jettag_c_get_52_33.setTagInfo(_td_c_get_52_33);
        _jettag_c_get_52_33.doStart(context, out);
        _jettag_c_get_52_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_53_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_53_36.setRuntimeParent(null);
        _jettag_c_get_53_36.setTagInfo(_td_c_get_53_36);
        _jettag_c_get_53_36.doStart(context, out);
        _jettag_c_get_53_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_14\" location=\"201,41\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Send First\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_5\" location=\"550,41\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_62_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_25.setRuntimeParent(null);
        _jettag_c_get_62_25.setTagInfo(_td_c_get_62_25);
        _jettag_c_get_62_25.doStart(context, out);
        _jettag_c_get_62_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_63_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_63_18.setRuntimeParent(null);
        _jettag_c_get_63_18.setTagInfo(_td_c_get_63_18);
        _jettag_c_get_63_18.doStart(context, out);
        _jettag_c_get_63_18.doEnd();
        RuntimeTagElement _jettag_c_get_63_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_63_55.setRuntimeParent(null);
        _jettag_c_get_63_55.setTagInfo(_td_c_get_63_55);
        _jettag_c_get_63_55.doStart(context, out);
        _jettag_c_get_63_55.doEnd();
        RuntimeTagElement _jettag_c_get_63_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_99); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_63_99.setRuntimeParent(null);
        _jettag_c_get_63_99.setTagInfo(_td_c_get_63_99);
        _jettag_c_get_63_99.doStart(context, out);
        _jettag_c_get_63_99.doEnd();
        out.write("\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"no\" newMsgId=\"true\" messageContext=\"passIdentity\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Write Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPInput.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_1\" location=\"3,40\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_69_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_69_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_69_7.setRuntimeParent(null);
        _jettag_c_if_69_7.setTagInfo(_td_c_if_69_7);
        _jettag_c_if_69_7.doStart(context, out);
        while (_jettag_c_if_69_7.okToProcessBody()) {
            out.write("      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      wsdlFileName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_79_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_21.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_79_21.setTagInfo(_td_c_get_79_21);
            _jettag_c_get_79_21.doStart(context, out);
            _jettag_c_get_79_21.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPortType=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_81_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_81_25.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_81_25.setTagInfo(_td_c_get_81_25);
            _jettag_c_get_81_25.doStart(context, out);
            _jettag_c_get_81_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedBinding=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_82_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_82_24.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_82_24.setTagInfo(_td_c_get_82_24);
            _jettag_c_get_82_24.doStart(context, out);
            _jettag_c_get_82_24.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPort=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_21.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_83_21.setTagInfo(_td_c_get_83_21);
            _jettag_c_get_83_21.doStart(context, out);
            _jettag_c_get_83_21.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNamespace= \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_84_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_84_25.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_84_25.setTagInfo(_td_c_get_84_25);
            _jettag_c_get_84_25.doStart(context, out);
            _jettag_c_get_84_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      useHTTPTransport=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      urlSelector=\"/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_86_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_21.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_get_86_21.setTagInfo(_td_c_get_86_21);
            _jettag_c_get_86_21.doStart(context, out);
            _jettag_c_get_86_21.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_87_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_87_7.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_if_87_7.setTagInfo(_td_c_if_87_7);
            _jettag_c_if_87_7.doStart(context, out);
            while (_jettag_c_if_87_7.okToProcessBody()) {
                out.write("      messageSetProperty = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_88_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_29.setRuntimeParent(_jettag_c_if_87_7);
                _jettag_c_get_88_29.setTagInfo(_td_c_get_88_29);
                _jettag_c_get_88_29.doStart(context, out);
                _jettag_c_get_88_29.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_87_7.handleBodyContent(out);
            }
            _jettag_c_if_87_7.doEnd();
            RuntimeTagElement _jettag_c_if_90_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_90_1.setRuntimeParent(_jettag_c_if_69_7);
            _jettag_c_if_90_1.setTagInfo(_td_c_if_90_1);
            _jettag_c_if_90_1.doStart(context, out);
            while (_jettag_c_if_90_1.okToProcessBody()) {
                out.write("      parserXmlnscBuildTreeUsingXMLSchema=\"false\" validateMaster=\"none\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_90_1.handleBodyContent(out);
            }
            _jettag_c_if_90_1.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            _jettag_c_if_69_7.handleBodyContent(out);
        }
        _jettag_c_if_69_7.doEnd();
        out.write(" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SOAP Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQHeader.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"399,40\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdAAAOptions=\"Add header\" mqmdCodedCharSetId=\"1208\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFormat=\"MQFMT_NONE\" mqmdVersion=\"MQMD_VERSION_1\" mqmdMsgType=\"MQMT_REQUEST\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdExpiry=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_98_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_98_19.setRuntimeParent(null);
        _jettag_c_get_98_19.setTagInfo(_td_c_get_98_19);
        _jettag_c_get_98_19.doStart(context, out);
        _jettag_c_get_98_19.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdFeedback=\"MQFB_NONE\" mqmdPriority=\"MQPRI_PRIORITY_AS_Q_DEF\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdPersistence=\"MQPER_PERSISTENCE_AS_Q_DEF\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdMsgId=\"MQMI_NONE\" mqmdCorrelId=\"MQCI_NONE\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      mqmdReplyToQ=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_102_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_102_21.setRuntimeParent(null);
        _jettag_c_get_102_21.setTagInfo(_td_c_get_102_21);
        _jettag_c_get_102_21.doStart(context, out);
        _jettag_c_get_102_21.doEnd();
        RuntimeTagElement _jettag_c_get_102_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_58); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_102_58.setRuntimeParent(null);
        _jettag_c_get_102_58.setTagInfo(_td_c_get_102_58);
        _jettag_c_get_102_58.doStart(context, out);
        _jettag_c_get_102_58.doEnd();
        RuntimeTagElement _jettag_c_get_102_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_102_95.setRuntimeParent(null);
        _jettag_c_get_102_95.setTagInfo(_td_c_get_102_95);
        _jettag_c_get_102_95.doStart(context, out);
        _jettag_c_get_102_95.doEnd();
        out.write("\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Add MQ Header\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_15\" location=\"624,218\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_107_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_107_41.setRuntimeParent(null);
        _jettag_c_get_107_41.setTagInfo(_td_c_get_107_41);
        _jettag_c_get_107_41.doStart(context, out);
        _jettag_c_get_107_41.doEnd();
        out.write("SynchRR_BuildStoreMsg.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"destinationAndMessage\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Store Msg\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_17\" location=\"704,40\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_113_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_18.setRuntimeParent(null);
        _jettag_c_get_113_18.setTagInfo(_td_c_get_113_18);
        _jettag_c_get_113_18.doStart(context, out);
        _jettag_c_get_113_18.doEnd();
        RuntimeTagElement _jettag_c_get_113_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_55.setRuntimeParent(null);
        _jettag_c_get_113_55.setTagInfo(_td_c_get_113_55);
        _jettag_c_get_113_55.doStart(context, out);
        _jettag_c_get_113_55.doEnd();
        RuntimeTagElement _jettag_c_get_113_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_113_89.setRuntimeParent(null);
        _jettag_c_get_113_89.setTagInfo(_td_c_get_113_89);
        _jettag_c_get_113_89.doStart(context, out);
        _jettag_c_get_113_89.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"no\" newMsgId=\"true\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      messageContext=\"passIdentity\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SavetoStore\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_23\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"103,40\" statement=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_121_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_51.setRuntimeParent(null);
        _jettag_c_get_121_51.setTagInfo(_td_c_get_121_51);
        _jettag_c_get_121_51.doStart(context, out);
        _jettag_c_get_121_51.doEnd();
        out.write("SynchRR_Initialise.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Initialise\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"293,41\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_127_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_127_41.setRuntimeParent(null);
        _jettag_c_get_127_41.setTagInfo(_td_c_get_127_41);
        _jettag_c_get_127_41.doStart(context, out);
        _jettag_c_get_127_41.doEnd();
        out.write("STRIP.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Extract SOAP Body\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_131_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_131_24.setRuntimeParent(null);
        _jettag_c_get_131_24.setTagInfo(_td_c_get_131_24);
        _jettag_c_get_131_24.doStart(context, out);
        _jettag_c_get_131_24.doEnd();
        RuntimeTagElement _jettag_c_get_131_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_131_62.setRuntimeParent(null);
        _jettag_c_get_131_62.setTagInfo(_td_c_get_131_62);
        _jettag_c_get_131_62.doStart(context, out);
        _jettag_c_get_131_62.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_7\" location=\"130,218\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_136_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_24.setRuntimeParent(null);
        _jettag_c_get_136_24.setTagInfo(_td_c_get_136_24);
        _jettag_c_get_136_24.doStart(context, out);
        _jettag_c_get_136_24.doEnd();
        RuntimeTagElement _jettag_c_get_136_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_136_62.setRuntimeParent(null);
        _jettag_c_get_136_62.setTagInfo(_td_c_get_136_62);
        _jettag_c_get_136_62.doStart(context, out);
        _jettag_c_get_136_62.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_10\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"450,218\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SF_Request_Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_142_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_142_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_142_1.setRuntimeParent(null);
        _jettag_c_if_142_1.setTagInfo(_td_c_if_142_1);
        _jettag_c_if_142_1.doStart(context, out);
        while (_jettag_c_if_142_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_143_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_143_24.setRuntimeParent(_jettag_c_if_142_1);
            _jettag_c_get_143_24.setTagInfo(_td_c_get_143_24);
            _jettag_c_get_143_24.doStart(context, out);
            _jettag_c_get_143_24.doEnd();
            RuntimeTagElement _jettag_c_get_143_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_143_62.setRuntimeParent(_jettag_c_if_142_1);
            _jettag_c_get_143_62.setTagInfo(_td_c_get_143_62);
            _jettag_c_get_143_62.doStart(context, out);
            _jettag_c_get_143_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_4\" location=\"325,218\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_142_1.handleBodyContent(out);
        }
        _jettag_c_if_142_1.doEnd();
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_154_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_154_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_154_1.setRuntimeParent(null);
        _jettag_c_if_154_1.setTagInfo(_td_c_if_154_1);
        _jettag_c_if_154_1.doStart(context, out);
        while (_jettag_c_if_154_1.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_14\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_154_1.handleBodyContent(out);
        }
        _jettag_c_if_154_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_23\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_14\" sourceNode=\"FCMComposite_1_23\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_14\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_5\" sourceNode=\"FCMComposite_1_10\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_15\" sourceNode=\"FCMComposite_1_5\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_17\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_169_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_169_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_169_1.setRuntimeParent(null);
        _jettag_c_if_169_1.setTagInfo(_td_c_if_169_1);
        _jettag_c_if_169_1.doStart(context, out);
        while (_jettag_c_if_169_1.okToProcessBody()) {
            out.write("     <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.RequestLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.RequestLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_172_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_172_23.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_172_23.setTagInfo(_td_c_get_172_23);
            _jettag_c_get_172_23.doStart(context, out);
            _jettag_c_get_172_23.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_173_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_21.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_173_21.setTagInfo(_td_c_get_173_21);
            _jettag_c_get_173_21.doStart(context, out);
            _jettag_c_get_173_21.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_169_1.handleBodyContent(out);
        }
        _jettag_c_if_169_1.doEnd();
        RuntimeTagElement _jettag_c_if_175_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_175_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_175_1.setRuntimeParent(null);
        _jettag_c_if_175_1.setTagInfo(_td_c_if_175_1);
        _jettag_c_if_175_1.doStart(context, out);
        while (_jettag_c_if_175_1.okToProcessBody()) {
            out.write("    <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \t\tbundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_178_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_178_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_178_19.setRuntimeParent(_jettag_c_if_175_1);
            _jettag_c_get_178_19.setTagInfo(_td_c_get_178_19);
            _jettag_c_get_178_19.doStart(context, out);
            _jettag_c_get_178_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_179_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_179_19.setRuntimeParent(_jettag_c_if_175_1);
            _jettag_c_get_179_19.setTagInfo(_td_c_get_179_19);
            _jettag_c_get_179_19.doStart(context, out);
            _jettag_c_get_179_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_175_1.handleBodyContent(out);
        }
        _jettag_c_if_175_1.doEnd();
        RuntimeTagElement _jettag_c_if_182_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_182_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_182_1.setRuntimeParent(null);
        _jettag_c_if_182_1.setTagInfo(_td_c_if_182_1);
        _jettag_c_if_182_1.doStart(context, out);
        while (_jettag_c_if_182_1.okToProcessBody()) {
            out.write("     </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_182_1.handleBodyContent(out);
        }
        _jettag_c_if_182_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_186_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_186_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_186_1.setRuntimeParent(null);
        _jettag_c_if_186_1.setTagInfo(_td_c_if_186_1);
        _jettag_c_if_186_1.doStart(context, out);
        while (_jettag_c_if_186_1.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_7\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_188_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_188_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_188_34.setRuntimeParent(_jettag_c_if_186_1);
            _jettag_c_get_188_34.setTagInfo(_td_c_get_188_34);
            _jettag_c_get_188_34.doStart(context, out);
            _jettag_c_get_188_34.doEnd();
            RuntimeTagElement _jettag_c_get_188_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_188_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_188_72.setRuntimeParent(_jettag_c_if_186_1);
            _jettag_c_get_188_72.setTagInfo(_td_c_get_188_72);
            _jettag_c_get_188_72.doStart(context, out);
            _jettag_c_get_188_72.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_186_1.handleBodyContent(out);
        }
        _jettag_c_if_186_1.doEnd();
        RuntimeTagElement _jettag_c_if_191_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_191_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_191_1.setRuntimeParent(null);
        _jettag_c_if_191_1.setTagInfo(_td_c_if_191_1);
        _jettag_c_if_191_1.doStart(context, out);
        while (_jettag_c_if_191_1.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.RequestLoggingOn\" overriddenNodes=\"FCMComposite_1_4\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_193_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_193_34.setRuntimeParent(_jettag_c_if_191_1);
            _jettag_c_get_193_34.setTagInfo(_td_c_get_193_34);
            _jettag_c_get_193_34.doStart(context, out);
            _jettag_c_get_193_34.doEnd();
            RuntimeTagElement _jettag_c_get_193_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_193_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_193_72.setRuntimeParent(_jettag_c_if_191_1);
            _jettag_c_get_193_72.setTagInfo(_td_c_get_193_72);
            _jettag_c_get_193_72.doStart(context, out);
            _jettag_c_get_193_72.doEnd();
            out.write(".subflow#Property.RequestLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>  ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_191_1.handleBodyContent(out);
        }
        _jettag_c_if_191_1.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
