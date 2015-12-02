package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Errorsubflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Errorsubflow_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_14_12 = new TagInfo("c:get", //$NON-NLS-1$
            14, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_15 = new TagInfo("c:get", //$NON-NLS-1$
            15, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_1 = new TagInfo("c:if", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_17 = new TagInfo("c:get", //$NON-NLS-1$
            24, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_36 = new TagInfo("c:get", //$NON-NLS-1$
            27, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_36 = new TagInfo("c:get", //$NON-NLS-1$
            29, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_62 = new TagInfo("c:get", //$NON-NLS-1$
            30, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_26 = new TagInfo("c:get", //$NON-NLS-1$
            32, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_71 = new TagInfo("c:get", //$NON-NLS-1$
            32, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_15 = new TagInfo("c:get", //$NON-NLS-1$
            33, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_33 = new TagInfo("c:get", //$NON-NLS-1$
            34, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_36 = new TagInfo("c:get", //$NON-NLS-1$
            35, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_19 = new TagInfo("c:get", //$NON-NLS-1$
            41, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_19 = new TagInfo("c:get", //$NON-NLS-1$
            42, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_41 = new TagInfo("c:get", //$NON-NLS-1$
            45, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_1 = new TagInfo("c:if", //$NON-NLS-1$
            49, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_40 = new TagInfo("c:get", //$NON-NLS-1$
            53, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_25 = new TagInfo("c:get", //$NON-NLS-1$
            59, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_18 = new TagInfo("c:get", //$NON-NLS-1$
            60, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_55 = new TagInfo("c:get", //$NON-NLS-1$
            60, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_91 = new TagInfo("c:get", //$NON-NLS-1$
            60, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_33 = new TagInfo("c:get", //$NON-NLS-1$
            69, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_40 = new TagInfo("c:get", //$NON-NLS-1$
            73, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_76_2 = new TagInfo("c:if", //$NON-NLS-1$
            76, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_88_1 = new TagInfo("c:if", //$NON-NLS-1$
            88, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_19 = new TagInfo("c:get", //$NON-NLS-1$
            91, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_19 = new TagInfo("c:get", //$NON-NLS-1$
            92, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
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
        out.write("    xmlns:ComIbmDatabase.msgnode=\"ComIbmDatabase.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPReply.msgnode=\"ComIbmSOAPReply.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmThrow.msgnode=\"ComIbmThrow.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_12.setRuntimeParent(null);
        _jettag_c_get_14_12.setTagInfo(_td_c_get_14_12);
        _jettag_c_get_14_12.doStart(context, out);
        _jettag_c_get_14_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_15.setRuntimeParent(null);
        _jettag_c_get_15_15.setTagInfo(_td_c_get_15_15);
        _jettag_c_get_15_15.doStart(context, out);
        _jettag_c_get_15_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_18_1.setRuntimeParent(null);
        _jettag_c_if_18_1.setTagInfo(_td_c_if_18_1);
        _jettag_c_if_18_1.doStart(context, out);
        while (_jettag_c_if_18_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_18_1.handleBodyContent(out);
        }
        _jettag_c_if_18_1.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"Error\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_17.setRuntimeParent(null);
        _jettag_c_get_24_17.setTagInfo(_td_c_get_24_17);
        _jettag_c_get_24_17.doStart(context, out);
        _jettag_c_get_24_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_15.setRuntimeParent(null);
        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
        _jettag_c_get_25_15.doStart(context, out);
        _jettag_c_get_25_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_36.setRuntimeParent(null);
        _jettag_c_get_27_36.setTagInfo(_td_c_get_27_36);
        _jettag_c_get_27_36.doStart(context, out);
        _jettag_c_get_27_36.doEnd();
        out.write("/icons/full/obj16/Error.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_36.setRuntimeParent(null);
        _jettag_c_get_29_36.setTagInfo(_td_c_get_29_36);
        _jettag_c_get_29_36.doStart(context, out);
        _jettag_c_get_29_36.doEnd();
        out.write("/icons/full/obj30/Error.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_62.setRuntimeParent(null);
        _jettag_c_get_30_62.setTagInfo(_td_c_get_30_62);
        _jettag_c_get_30_62.doStart(context, out);
        _jettag_c_get_30_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_26.setRuntimeParent(null);
        _jettag_c_get_32_26.setTagInfo(_td_c_get_32_26);
        _jettag_c_get_32_26.doStart(context, out);
        _jettag_c_get_32_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_71.setRuntimeParent(null);
        _jettag_c_get_32_71.setTagInfo(_td_c_get_32_71);
        _jettag_c_get_32_71.doStart(context, out);
        _jettag_c_get_32_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_15.setRuntimeParent(null);
        _jettag_c_get_33_15.setTagInfo(_td_c_get_33_15);
        _jettag_c_get_33_15.doStart(context, out);
        _jettag_c_get_33_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_33.setRuntimeParent(null);
        _jettag_c_get_34_33.setTagInfo(_td_c_get_34_33);
        _jettag_c_get_34_33.doStart(context, out);
        _jettag_c_get_34_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_36.setRuntimeParent(null);
        _jettag_c_get_35_36.setTagInfo(_td_c_get_35_36);
        _jettag_c_get_35_36.doStart(context, out);
        _jettag_c_get_35_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"38,42\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_19.setRuntimeParent(null);
        _jettag_c_get_41_19.setTagInfo(_td_c_get_41_19);
        _jettag_c_get_41_19.doStart(context, out);
        _jettag_c_get_41_19.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_19.setRuntimeParent(null);
        _jettag_c_get_42_19.setTagInfo(_td_c_get_42_19);
        _jettag_c_get_42_19.doStart(context, out);
        _jettag_c_get_42_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"155,42\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_41.setRuntimeParent(null);
        _jettag_c_get_45_41.setTagInfo(_td_c_get_45_41);
        _jettag_c_get_45_41.doStart(context, out);
        _jettag_c_get_45_41.doEnd();
        out.write("SF_Build_Error_Message.Main\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Build Error Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>  ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_49_1.setRuntimeParent(null);
        _jettag_c_if_49_1.setTagInfo(_td_c_if_49_1);
        _jettag_c_if_49_1.doStart(context, out);
        while (_jettag_c_if_49_1.okToProcessBody()) {
            out.write(NL);         
            out.write("      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"490,43\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_40.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_53_40.setTagInfo(_td_c_get_53_40);
            _jettag_c_get_53_40.doStart(context, out);
            _jettag_c_get_53_40.doEnd();
            out.write("CheckErrorLogging.Main\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      throwExceptionOnDatabaseError=\"false\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Error Logging On?\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"644,57\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueManagerName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_59_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_59_25.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_59_25.setTagInfo(_td_c_get_59_25);
            _jettag_c_get_59_25.doStart(context, out);
            _jettag_c_get_59_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_60_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_18.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_60_18.setTagInfo(_td_c_get_60_18);
            _jettag_c_get_60_18.doStart(context, out);
            _jettag_c_get_60_18.doEnd();
            RuntimeTagElement _jettag_c_get_60_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_55.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_60_55.setTagInfo(_td_c_get_60_55);
            _jettag_c_get_60_55.doStart(context, out);
            _jettag_c_get_60_55.doEnd();
            RuntimeTagElement _jettag_c_get_60_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_91.setRuntimeParent(_jettag_c_if_49_1);
            _jettag_c_get_60_91.setTagInfo(_td_c_get_60_91);
            _jettag_c_get_60_91.doStart(context, out);
            _jettag_c_get_60_91.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Output Error Message\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_49_1.handleBodyContent(out);
        }
        _jettag_c_if_49_1.doEnd();
        out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"323,44\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Message First\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"600,220\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      statement=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_69_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_69_33.setRuntimeParent(null);
        _jettag_c_get_69_33.setTagInfo(_td_c_get_69_33);
        _jettag_c_get_69_33.doStart(context, out);
        _jettag_c_get_69_33.doEnd();
        out.write("Throw.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw Fault\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"283,216\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_73_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_40.setRuntimeParent(null);
        _jettag_c_get_73_40.setTagInfo(_td_c_get_73_40);
        _jettag_c_get_73_40.doStart(context, out);
        _jettag_c_get_73_40.doEnd();
        out.write("CheckifMessageSent.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Check if Message Sent\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes> ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_76_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_76_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_76_2.setRuntimeParent(null);
        _jettag_c_if_76_2.setTagInfo(_td_c_if_76_2);
        _jettag_c_if_76_2.doStart(context, out);
        while (_jettag_c_if_76_2.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_12\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_76_2.handleBodyContent(out);
        }
        _jettag_c_if_76_2.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_7\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.unknown\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_4\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_88_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_88_1.setRuntimeParent(null);
        _jettag_c_if_88_1.setTagInfo(_td_c_if_88_1);
        _jettag_c_if_88_1.doStart(context, out);
        while (_jettag_c_if_88_1.okToProcessBody()) {
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \t\tbundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_91_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_91_19.setRuntimeParent(_jettag_c_if_88_1);
            _jettag_c_get_91_19.setTagInfo(_td_c_get_91_19);
            _jettag_c_get_91_19.doStart(context, out);
            _jettag_c_get_91_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_92_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_92_19.setRuntimeParent(_jettag_c_if_88_1);
            _jettag_c_get_92_19.setTagInfo(_td_c_get_92_19);
            _jettag_c_get_92_19.doStart(context, out);
            _jettag_c_get_92_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_88_1.handleBodyContent(out);
        }
        _jettag_c_if_88_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
