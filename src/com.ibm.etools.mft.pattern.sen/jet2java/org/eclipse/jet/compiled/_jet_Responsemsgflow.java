package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Responsemsgflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Responsemsgflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_10_2 = new TagInfo("c:if", //$NON-NLS-1$
            10, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_11 = new TagInfo("c:get", //$NON-NLS-1$
            11, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_49 = new TagInfo("c:get", //$NON-NLS-1$
            11, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_6 = new TagInfo("c:get", //$NON-NLS-1$
            12, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_44 = new TagInfo("c:get", //$NON-NLS-1$
            12, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_11 = new TagInfo("c:get", //$NON-NLS-1$
            15, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_49 = new TagInfo("c:get", //$NON-NLS-1$
            15, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_6 = new TagInfo("c:get", //$NON-NLS-1$
            16, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_44 = new TagInfo("c:get", //$NON-NLS-1$
            16, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
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
                "$root/@responseprocessor", //$NON-NLS-1$
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
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_13 = new TagInfo("c:get", //$NON-NLS-1$
            24, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_34_1 = new TagInfo("c:if", //$NON-NLS-1$
            34, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_15 = new TagInfo("c:get", //$NON-NLS-1$
            41, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_36 = new TagInfo("c:get", //$NON-NLS-1$
            43, 36,
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
    private static final TagInfo _td_c_get_46_62 = new TagInfo("c:get", //$NON-NLS-1$
            46, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_26 = new TagInfo("c:get", //$NON-NLS-1$
            48, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_71 = new TagInfo("c:get", //$NON-NLS-1$
            48, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_15 = new TagInfo("c:get", //$NON-NLS-1$
            49, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_33 = new TagInfo("c:get", //$NON-NLS-1$
            50, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_36 = new TagInfo("c:get", //$NON-NLS-1$
            51, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_18 = new TagInfo("c:get", //$NON-NLS-1$
            57, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_55 = new TagInfo("c:get", //$NON-NLS-1$
            57, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/responseQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_92 = new TagInfo("c:get", //$NON-NLS-1$
            57, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_41 = new TagInfo("c:get", //$NON-NLS-1$
            62, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_18 = new TagInfo("c:get", //$NON-NLS-1$
            66, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_55 = new TagInfo("c:get", //$NON-NLS-1$
            66, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/storeQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_89 = new TagInfo("c:get", //$NON-NLS-1$
            66, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_77_1 = new TagInfo("c:choose", //$NON-NLS-1$
            77, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_78_1 = new TagInfo("c:when", //$NON-NLS-1$
            78, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofSOAPResponse = 'none'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_82_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            82, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_88_26 = new TagInfo("c:get", //$NON-NLS-1$
            88, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_64 = new TagInfo("c:get", //$NON-NLS-1$
            88, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_41 = new TagInfo("c:get", //$NON-NLS-1$
            102, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_24 = new TagInfo("c:get", //$NON-NLS-1$
            106, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_62 = new TagInfo("c:get", //$NON-NLS-1$
            106, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_111_1 = new TagInfo("c:if", //$NON-NLS-1$
            111, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_24 = new TagInfo("c:get", //$NON-NLS-1$
            112, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_62 = new TagInfo("c:get", //$NON-NLS-1$
            112, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_138_2 = new TagInfo("c:if", //$NON-NLS-1$
            138, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_146_1 = new TagInfo("c:if", //$NON-NLS-1$
            146, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_20 = new TagInfo("c:get", //$NON-NLS-1$
            150, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_150_58 = new TagInfo("c:get", //$NON-NLS-1$
            150, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_151_18 = new TagInfo("c:get", //$NON-NLS-1$
            151, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_153_1 = new TagInfo("c:if", //$NON-NLS-1$
            153, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_25 = new TagInfo("c:get", //$NON-NLS-1$
            156, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_63 = new TagInfo("c:get", //$NON-NLS-1$
            156, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_23 = new TagInfo("c:get", //$NON-NLS-1$
            157, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_160_1 = new TagInfo("c:if", //$NON-NLS-1$
            160, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_164_5 = new TagInfo("c:if", //$NON-NLS-1$
            164, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_34 = new TagInfo("c:get", //$NON-NLS-1$
            166, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_72 = new TagInfo("c:get", //$NON-NLS-1$
            166, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_169_1 = new TagInfo("c:if", //$NON-NLS-1$
            169, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_34 = new TagInfo("c:get", //$NON-NLS-1$
            171, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_72 = new TagInfo("c:get", //$NON-NLS-1$
            171, 72,
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
        out.write("    xmlns:ComIbmMQGet.msgnode=\"ComIbmMQGet.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQInput.msgnode=\"ComIbmMQInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPReply.msgnode=\"ComIbmSOAPReply.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_2.setRuntimeParent(null);
        _jettag_c_if_10_2.setTagInfo(_td_c_if_10_2);
        _jettag_c_if_10_2.doStart(context, out);
        while (_jettag_c_if_10_2.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_11.setRuntimeParent(_jettag_c_if_10_2);
            _jettag_c_get_11_11.setTagInfo(_td_c_get_11_11);
            _jettag_c_get_11_11.doStart(context, out);
            _jettag_c_get_11_11.doEnd();
            RuntimeTagElement _jettag_c_get_11_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_49.setRuntimeParent(_jettag_c_if_10_2);
            _jettag_c_get_11_49.setTagInfo(_td_c_get_11_49);
            _jettag_c_get_11_49.doStart(context, out);
            _jettag_c_get_11_49.doEnd();
            out.write(".subflow=    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_6.setRuntimeParent(_jettag_c_if_10_2);
            _jettag_c_get_12_6.setTagInfo(_td_c_get_12_6);
            _jettag_c_get_12_6.doStart(context, out);
            _jettag_c_get_12_6.doEnd();
            RuntimeTagElement _jettag_c_get_12_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_44.setRuntimeParent(_jettag_c_if_10_2);
            _jettag_c_get_12_44.setTagInfo(_td_c_get_12_44);
            _jettag_c_get_12_44.doStart(context, out);
            _jettag_c_get_12_44.doEnd();
            out.write(".subflow\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_10_2.handleBodyContent(out);
        }
        _jettag_c_if_10_2.doEnd();
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_11.setRuntimeParent(null);
        _jettag_c_get_15_11.setTagInfo(_td_c_get_15_11);
        _jettag_c_get_15_11.doStart(context, out);
        _jettag_c_get_15_11.doEnd();
        RuntimeTagElement _jettag_c_get_15_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_49.setRuntimeParent(null);
        _jettag_c_get_15_49.setTagInfo(_td_c_get_15_49);
        _jettag_c_get_15_49.doStart(context, out);
        _jettag_c_get_15_49.doEnd();
        out.write(".subflow=    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_6.setRuntimeParent(null);
        _jettag_c_get_16_6.setTagInfo(_td_c_get_16_6);
        _jettag_c_get_16_6.doStart(context, out);
        _jettag_c_get_16_6.doEnd();
        RuntimeTagElement _jettag_c_get_16_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_44.setRuntimeParent(null);
        _jettag_c_get_16_44.setTagInfo(_td_c_get_16_44);
        _jettag_c_get_16_44.doStart(context, out);
        _jettag_c_get_16_44.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_11.setRuntimeParent(null);
        _jettag_c_get_18_11.setTagInfo(_td_c_get_18_11);
        _jettag_c_get_18_11.doStart(context, out);
        _jettag_c_get_18_11.doEnd();
        RuntimeTagElement _jettag_c_get_18_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_49.setRuntimeParent(null);
        _jettag_c_get_18_49.setTagInfo(_td_c_get_18_49);
        _jettag_c_get_18_49.doStart(context, out);
        _jettag_c_get_18_49.doEnd();
        out.write(".subflow=    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_6.setRuntimeParent(null);
        _jettag_c_get_19_6.setTagInfo(_td_c_get_19_6);
        _jettag_c_get_19_6.doStart(context, out);
        _jettag_c_get_19_6.doEnd();
        RuntimeTagElement _jettag_c_get_19_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_44.setRuntimeParent(null);
        _jettag_c_get_19_44.setTagInfo(_td_c_get_19_44);
        _jettag_c_get_19_44.doStart(context, out);
        _jettag_c_get_19_44.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("     nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_13.setRuntimeParent(null);
        _jettag_c_get_24_13.setTagInfo(_td_c_get_24_13);
        _jettag_c_get_24_13.doStart(context, out);
        _jettag_c_get_24_13.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_15.setRuntimeParent(null);
        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
        _jettag_c_get_25_15.doStart(context, out);
        _jettag_c_get_25_15.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_34_1.setRuntimeParent(null);
        _jettag_c_if_34_1.setTagInfo(_td_c_if_34_1);
        _jettag_c_if_34_1.doStart(context, out);
        while (_jettag_c_if_34_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ResponseLoggingOn\" name=\"ResponseLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_34_1.handleBodyContent(out);
        }
        _jettag_c_if_34_1.doEnd();
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"Response\" bundleName=\"Response\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_15.setRuntimeParent(null);
        _jettag_c_get_41_15.setTagInfo(_td_c_get_41_15);
        _jettag_c_get_41_15.doStart(context, out);
        _jettag_c_get_41_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_36.setRuntimeParent(null);
        _jettag_c_get_43_36.setTagInfo(_td_c_get_43_36);
        _jettag_c_get_43_36.doStart(context, out);
        _jettag_c_get_43_36.doEnd();
        out.write("/icons/full/obj16/Response.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_36.setRuntimeParent(null);
        _jettag_c_get_45_36.setTagInfo(_td_c_get_45_36);
        _jettag_c_get_45_36.doStart(context, out);
        _jettag_c_get_45_36.doEnd();
        out.write("/icons/full/obj30/Response.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_62.setRuntimeParent(null);
        _jettag_c_get_46_62.setTagInfo(_td_c_get_46_62);
        _jettag_c_get_46_62.doStart(context, out);
        _jettag_c_get_46_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_26.setRuntimeParent(null);
        _jettag_c_get_48_26.setTagInfo(_td_c_get_48_26);
        _jettag_c_get_48_26.doStart(context, out);
        _jettag_c_get_48_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_48_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_71.setRuntimeParent(null);
        _jettag_c_get_48_71.setTagInfo(_td_c_get_48_71);
        _jettag_c_get_48_71.doStart(context, out);
        _jettag_c_get_48_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_15.setRuntimeParent(null);
        _jettag_c_get_49_15.setTagInfo(_td_c_get_49_15);
        _jettag_c_get_49_15.doStart(context, out);
        _jettag_c_get_49_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_33.setRuntimeParent(null);
        _jettag_c_get_50_33.setTagInfo(_td_c_get_50_33);
        _jettag_c_get_50_33.doStart(context, out);
        _jettag_c_get_50_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_36.setRuntimeParent(null);
        _jettag_c_get_51_36.setTagInfo(_td_c_get_51_36);
        _jettag_c_get_51_36.doStart(context, out);
        _jettag_c_get_51_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"15,34\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_18.setRuntimeParent(null);
        _jettag_c_get_57_18.setTagInfo(_td_c_get_57_18);
        _jettag_c_get_57_18.doStart(context, out);
        _jettag_c_get_57_18.doEnd();
        RuntimeTagElement _jettag_c_get_57_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_55.setRuntimeParent(null);
        _jettag_c_get_57_55.setTagInfo(_td_c_get_57_55);
        _jettag_c_get_57_55.doStart(context, out);
        _jettag_c_get_57_55.doEnd();
        RuntimeTagElement _jettag_c_get_57_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_92); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_92.setRuntimeParent(null);
        _jettag_c_get_57_92.setTagInfo(_td_c_get_57_92);
        _jettag_c_get_57_92.doStart(context, out);
        _jettag_c_get_57_92.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      messageDomainProperty=\"XMLNSC\" transactionMode=\"no\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Get Response\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_13\" location=\"87,39\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_62_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_41.setRuntimeParent(null);
        _jettag_c_get_62_41.setTagInfo(_td_c_get_62_41);
        _jettag_c_get_62_41.doStart(context, out);
        _jettag_c_get_62_41.doEnd();
        out.write("SynchRR_SetResponseMode.Main\" computeMode=\"destination\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set Response Mode\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQGet.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_19\" location=\"397,65\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_18.setRuntimeParent(null);
        _jettag_c_get_66_18.setTagInfo(_td_c_get_66_18);
        _jettag_c_get_66_18.doStart(context, out);
        _jettag_c_get_66_18.doEnd();
        RuntimeTagElement _jettag_c_get_66_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_55.setRuntimeParent(null);
        _jettag_c_get_66_55.setTagInfo(_td_c_get_66_55);
        _jettag_c_get_66_55.doStart(context, out);
        _jettag_c_get_66_55.doEnd();
        RuntimeTagElement _jettag_c_get_66_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_89.setRuntimeParent(null);
        _jettag_c_get_66_89.setTagInfo(_td_c_get_66_89);
        _jettag_c_get_66_89.doStart(context, out);
        _jettag_c_get_66_89.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      messageDomainProperty=\"BLOB\" transactionMode=\"no\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      generateMode=\"localEnvironment\" copyMessage=\"copyEntireMessage\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      getWithCorrelID=\"true\" outputDataLocation=\"OutputLocalEnvironment\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      resultDataLocation=\"ResultRoot\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Recover Reply ID\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("              </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPReply.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_21\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"730,65\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_77_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_77_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_77_1.setRuntimeParent(null);
        _jettag_c_choose_77_1.setTagInfo(_td_c_choose_77_1);
        _jettag_c_choose_77_1.doStart(context, out);
        JET2Writer _jettag_c_choose_77_1_saved_out = out;
        while (_jettag_c_choose_77_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_78_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_78_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_78_1.setRuntimeParent(_jettag_c_choose_77_1);
            _jettag_c_when_78_1.setTagInfo(_td_c_when_78_1);
            _jettag_c_when_78_1.doStart(context, out);
            JET2Writer _jettag_c_when_78_1_saved_out = out;
            while (_jettag_c_when_78_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("validateMaster=\"none\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_78_1.handleBodyContent(out);
            }
            out = _jettag_c_when_78_1_saved_out;
            _jettag_c_when_78_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_otherwise_82_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_82_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_82_1.setRuntimeParent(_jettag_c_choose_77_1);
            _jettag_c_otherwise_82_1.setTagInfo(_td_c_otherwise_82_1);
            _jettag_c_otherwise_82_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_82_1_saved_out = out;
            while (_jettag_c_otherwise_82_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("validateMaster=\"contentAndValue\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_82_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_82_1_saved_out;
            _jettag_c_otherwise_82_1.doEnd();
            _jettag_c_choose_77_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_77_1_saved_out;
        _jettag_c_choose_77_1.doEnd();
        out.write(" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"SOAP Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_88_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_26.setRuntimeParent(null);
        _jettag_c_get_88_26.setTagInfo(_td_c_get_88_26);
        _jettag_c_get_88_26.doStart(context, out);
        _jettag_c_get_88_26.doEnd();
        RuntimeTagElement _jettag_c_get_88_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_64.setRuntimeParent(null);
        _jettag_c_get_88_64.setTagInfo(_td_c_get_88_64);
        _jettag_c_get_88_64.doStart(context, out);
        _jettag_c_get_88_64.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        xmi:id=\"FCMComposite_1_5\"  location=\"281,40\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Response Processor\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmHTTPHeader.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_24\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"626,61\" httpInputHeader=\"DeleteHeader\" httpResponseHeader=\"DeleteHeader\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      httpRequestHeader=\"DeleteHeader\" httpReplyHeader=\"Add\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Add Reply Header\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"188,40\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Respond First\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" location=\"521,60\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_102_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_102_41.setRuntimeParent(null);
        _jettag_c_get_102_41.setTagInfo(_td_c_get_102_41);
        _jettag_c_get_102_41.doStart(context, out);
        _jettag_c_get_102_41.doEnd();
        out.write("SynchRR_RestoreReplyId.Main\" computeMode=\"destinationAndMessage\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set up for Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_106_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_106_24.setRuntimeParent(null);
        _jettag_c_get_106_24.setTagInfo(_td_c_get_106_24);
        _jettag_c_get_106_24.doStart(context, out);
        _jettag_c_get_106_24.doEnd();
        RuntimeTagElement _jettag_c_get_106_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_106_62.setRuntimeParent(null);
        _jettag_c_get_106_62.setTagInfo(_td_c_get_106_62);
        _jettag_c_get_106_62.doStart(context, out);
        _jettag_c_get_106_62.doEnd();
        out.write(".subflow:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"101,142\" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_111_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_111_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_111_1.setRuntimeParent(null);
        _jettag_c_if_111_1.setTagInfo(_td_c_if_111_1);
        _jettag_c_if_111_1.doStart(context, out);
        while (_jettag_c_if_111_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_112_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_112_24.setRuntimeParent(_jettag_c_if_111_1);
            _jettag_c_get_112_24.setTagInfo(_td_c_get_112_24);
            _jettag_c_get_112_24.doStart(context, out);
            _jettag_c_get_112_24.doEnd();
            RuntimeTagElement _jettag_c_get_112_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_112_62.setRuntimeParent(_jettag_c_if_111_1);
            _jettag_c_get_112_62.setTagInfo(_td_c_get_112_62);
            _jettag_c_get_112_62.doStart(context, out);
            _jettag_c_get_112_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_7\" location=\"296,149\" >");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_111_1.handleBodyContent(out);
        }
        _jettag_c_if_111_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_12\" targetNode=\"FCMComposite_1_13\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_13\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      targetNode=\"FCMComposite_1_21\" sourceNode=\"FCMComposite_1_24\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_5\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_20\" targetNode=\"FCMComposite_1_19\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_5\" sourceTerminalName=\"OutTerminal.Output\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_6\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_19\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_24\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_2\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </connections>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_138_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_138_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_138_2.setRuntimeParent(null);
        _jettag_c_if_138_2.setTagInfo(_td_c_if_138_2);
        _jettag_c_if_138_2.doStart(context, out);
        while (_jettag_c_if_138_2.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.Input\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </connections>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_138_2.handleBodyContent(out);
        }
        _jettag_c_if_138_2.doEnd();
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_146_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_146_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_146_1.setRuntimeParent(null);
        _jettag_c_if_146_1.setTagInfo(_td_c_if_146_1);
        _jettag_c_if_146_1.doStart(context, out);
        while (_jettag_c_if_146_1.okToProcessBody()) {
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_150_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_150_20.setRuntimeParent(_jettag_c_if_146_1);
            _jettag_c_get_150_20.setTagInfo(_td_c_get_150_20);
            _jettag_c_get_150_20.doStart(context, out);
            _jettag_c_get_150_20.doEnd();
            RuntimeTagElement _jettag_c_get_150_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_150_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_150_58.setRuntimeParent(_jettag_c_if_146_1);
            _jettag_c_get_150_58.setTagInfo(_td_c_get_150_58);
            _jettag_c_get_150_58.doStart(context, out);
            _jettag_c_get_150_58.doEnd();
            out.write("\"  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("       pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_151_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_151_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_151_18.setRuntimeParent(_jettag_c_if_146_1);
            _jettag_c_get_151_18.setTagInfo(_td_c_get_151_18);
            _jettag_c_get_151_18.doStart(context, out);
            _jettag_c_get_151_18.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_146_1.handleBodyContent(out);
        }
        _jettag_c_if_146_1.doEnd();
        RuntimeTagElement _jettag_c_if_153_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_153_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_153_1.setRuntimeParent(null);
        _jettag_c_if_153_1.setTagInfo(_td_c_if_153_1);
        _jettag_c_if_153_1.doStart(context, out);
        while (_jettag_c_if_153_1.okToProcessBody()) {
            out.write("          <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ResponseLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ResponseLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_156_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_156_25.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_156_25.setTagInfo(_td_c_get_156_25);
            _jettag_c_get_156_25.doStart(context, out);
            _jettag_c_get_156_25.doEnd();
            RuntimeTagElement _jettag_c_get_156_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_156_63.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_156_63.setTagInfo(_td_c_get_156_63);
            _jettag_c_get_156_63.doStart(context, out);
            _jettag_c_get_156_63.doEnd();
            out.write("\"  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_157_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_157_23.setRuntimeParent(_jettag_c_if_153_1);
            _jettag_c_get_157_23.setTagInfo(_td_c_get_157_23);
            _jettag_c_get_157_23.doStart(context, out);
            _jettag_c_get_157_23.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_153_1.handleBodyContent(out);
        }
        _jettag_c_if_153_1.doEnd();
        RuntimeTagElement _jettag_c_if_160_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_160_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_160_1.setRuntimeParent(null);
        _jettag_c_if_160_1.setTagInfo(_td_c_if_160_1);
        _jettag_c_if_160_1.doStart(context, out);
        while (_jettag_c_if_160_1.okToProcessBody()) {
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_160_1.handleBodyContent(out);
        }
        _jettag_c_if_160_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_164_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_164_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_164_5.setRuntimeParent(null);
        _jettag_c_if_164_5.setTagInfo(_td_c_if_164_5);
        _jettag_c_if_164_5.doStart(context, out);
        while (_jettag_c_if_164_5.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_2\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_166_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_34.setRuntimeParent(_jettag_c_if_164_5);
            _jettag_c_get_166_34.setTagInfo(_td_c_get_166_34);
            _jettag_c_get_166_34.doStart(context, out);
            _jettag_c_get_166_34.doEnd();
            RuntimeTagElement _jettag_c_get_166_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_166_72.setRuntimeParent(_jettag_c_if_164_5);
            _jettag_c_get_166_72.setTagInfo(_td_c_get_166_72);
            _jettag_c_get_166_72.doStart(context, out);
            _jettag_c_get_166_72.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_164_5.handleBodyContent(out);
        }
        _jettag_c_if_164_5.doEnd();
        RuntimeTagElement _jettag_c_if_169_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_169_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_169_1.setRuntimeParent(null);
        _jettag_c_if_169_1.setTagInfo(_td_c_if_169_1);
        _jettag_c_if_169_1.doStart(context, out);
        while (_jettag_c_if_169_1.okToProcessBody()) {
            out.write("      <attributeLinks promotedAttribute=\"Property.ResponseLoggingOn\" overriddenNodes=\"FCMComposite_1_7\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_171_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_34.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_171_34.setTagInfo(_td_c_get_171_34);
            _jettag_c_get_171_34.doStart(context, out);
            _jettag_c_get_171_34.doEnd();
            RuntimeTagElement _jettag_c_get_171_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_171_72.setRuntimeParent(_jettag_c_if_169_1);
            _jettag_c_get_171_72.setTagInfo(_td_c_get_171_72);
            _jettag_c_get_171_72.doStart(context, out);
            _jettag_c_get_171_72.doEnd();
            out.write(".subflow#Property.ResponseLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_169_1.handleBodyContent(out);
        }
        _jettag_c_if_169_1.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
