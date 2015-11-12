package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_12_12 = new TagInfo("c:get", //$NON-NLS-1$
            12, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_15 = new TagInfo("c:get", //$NON-NLS-1$
            13, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_10 = new TagInfo("c:get", //$NON-NLS-1$
            22, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_17 = new TagInfo("c:get", //$NON-NLS-1$
            23, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_15 = new TagInfo("c:get", //$NON-NLS-1$
            24, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_36 = new TagInfo("c:get", //$NON-NLS-1$
            26, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_90 = new TagInfo("c:get", //$NON-NLS-1$
            26, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_36 = new TagInfo("c:get", //$NON-NLS-1$
            28, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_90 = new TagInfo("c:get", //$NON-NLS-1$
            28, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_65 = new TagInfo("c:get", //$NON-NLS-1$
            29, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_26 = new TagInfo("c:get", //$NON-NLS-1$
            31, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_71 = new TagInfo("c:get", //$NON-NLS-1$
            31, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_15 = new TagInfo("c:get", //$NON-NLS-1$
            32, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_33 = new TagInfo("c:get", //$NON-NLS-1$
            33, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_36 = new TagInfo("c:get", //$NON-NLS-1$
            34, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_41 = new TagInfo("c:get", //$NON-NLS-1$
            39, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_25 = new TagInfo("c:get", //$NON-NLS-1$
            44, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_18 = new TagInfo("c:get", //$NON-NLS-1$
            45, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_55 = new TagInfo("c:get", //$NON-NLS-1$
            45, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_87 = new TagInfo("c:get", //$NON-NLS-1$
            45, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_40 = new TagInfo("c:get", //$NON-NLS-1$
            50, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_41 = new TagInfo("c:get", //$NON-NLS-1$
            62, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_21 = new TagInfo("c:get", //$NON-NLS-1$
            67, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_61 = new TagInfo("c:get", //$NON-NLS-1$
            67, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_21 = new TagInfo("c:get", //$NON-NLS-1$
            79, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_20 = new TagInfo("c:get", //$NON-NLS-1$
            80, 20,
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
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTryCatch.msgnode=\"ComIbmTryCatch.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_12.setRuntimeParent(null);
        _jettag_c_get_12_12.setTagInfo(_td_c_get_12_12);
        _jettag_c_get_12_12.doStart(context, out);
        _jettag_c_get_12_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_15.setRuntimeParent(null);
        _jettag_c_get_13_15.setTagInfo(_td_c_get_13_15);
        _jettag_c_get_13_15.doStart(context, out);
        _jettag_c_get_13_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.LoggingOn\" name=\"LoggingOn\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_10.setRuntimeParent(null);
        _jettag_c_get_22_10.setTagInfo(_td_c_get_22_10);
        _jettag_c_get_22_10.doStart(context, out);
        _jettag_c_get_22_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_17.setRuntimeParent(null);
        _jettag_c_get_23_17.setTagInfo(_td_c_get_23_17);
        _jettag_c_get_23_17.doStart(context, out);
        _jettag_c_get_23_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_15.setRuntimeParent(null);
        _jettag_c_get_24_15.setTagInfo(_td_c_get_24_15);
        _jettag_c_get_24_15.doStart(context, out);
        _jettag_c_get_24_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_36.setRuntimeParent(null);
        _jettag_c_get_26_36.setTagInfo(_td_c_get_26_36);
        _jettag_c_get_26_36.doStart(context, out);
        _jettag_c_get_26_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_90.setRuntimeParent(null);
        _jettag_c_get_26_90.setTagInfo(_td_c_get_26_90);
        _jettag_c_get_26_90.doStart(context, out);
        _jettag_c_get_26_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_36.setRuntimeParent(null);
        _jettag_c_get_28_36.setTagInfo(_td_c_get_28_36);
        _jettag_c_get_28_36.doStart(context, out);
        _jettag_c_get_28_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_90.setRuntimeParent(null);
        _jettag_c_get_28_90.setTagInfo(_td_c_get_28_90);
        _jettag_c_get_28_90.doStart(context, out);
        _jettag_c_get_28_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_65.setRuntimeParent(null);
        _jettag_c_get_29_65.setTagInfo(_td_c_get_29_65);
        _jettag_c_get_29_65.doStart(context, out);
        _jettag_c_get_29_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_26.setRuntimeParent(null);
        _jettag_c_get_31_26.setTagInfo(_td_c_get_31_26);
        _jettag_c_get_31_26.doStart(context, out);
        _jettag_c_get_31_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_71.setRuntimeParent(null);
        _jettag_c_get_31_71.setTagInfo(_td_c_get_31_71);
        _jettag_c_get_31_71.doStart(context, out);
        _jettag_c_get_31_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_15.setRuntimeParent(null);
        _jettag_c_get_32_15.setTagInfo(_td_c_get_32_15);
        _jettag_c_get_32_15.doStart(context, out);
        _jettag_c_get_32_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_33.setRuntimeParent(null);
        _jettag_c_get_33_33.setTagInfo(_td_c_get_33_33);
        _jettag_c_get_33_33.doStart(context, out);
        _jettag_c_get_33_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_36.setRuntimeParent(null);
        _jettag_c_get_34_36.setTagInfo(_td_c_get_34_36);
        _jettag_c_get_34_36.doStart(context, out);
        _jettag_c_get_34_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"374,118\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_41.setRuntimeParent(null);
        _jettag_c_get_39_41.setTagInfo(_td_c_get_39_41);
        _jettag_c_get_39_41.doStart(context, out);
        _jettag_c_get_39_41.doEnd();
        out.write("CreateLogMessage.Main\" computeMode=\"destinationAndMessage\" throwExceptionOnDatabaseError=\"false\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Log Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" location=\"529,118\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_25.setRuntimeParent(null);
        _jettag_c_get_44_25.setTagInfo(_td_c_get_44_25);
        _jettag_c_get_44_25.doStart(context, out);
        _jettag_c_get_44_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_18.setRuntimeParent(null);
        _jettag_c_get_45_18.setTagInfo(_td_c_get_45_18);
        _jettag_c_get_45_18.doStart(context, out);
        _jettag_c_get_45_18.doEnd();
        RuntimeTagElement _jettag_c_get_45_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_55.setRuntimeParent(null);
        _jettag_c_get_45_55.setTagInfo(_td_c_get_45_55);
        _jettag_c_get_45_55.doStart(context, out);
        _jettag_c_get_45_55.doEnd();
        RuntimeTagElement _jettag_c_get_45_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_87.setRuntimeParent(null);
        _jettag_c_get_45_87.setTagInfo(_td_c_get_45_87);
        _jettag_c_get_45_87.doStart(context, out);
        _jettag_c_get_45_87.doEnd();
        out.write("\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"MQOutput\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"267,106\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_40.setRuntimeParent(null);
        _jettag_c_get_50_40.setTagInfo(_td_c_get_50_40);
        _jettag_c_get_50_40.doStart(context, out);
        _jettag_c_get_50_40.doEnd();
        out.write("CheckLogging.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Logging On?\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"106,67\" rotation=\"TOP_TO_BOTTOM\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Catch Logging Errors\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTrace.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_16\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"406,236\" pattern=\"&#xD;&#xA;Logging Failure&#xD;&#xA;=========&#xD;&#xA;&#xD;&#xA;${Environment.PatternVariables}&#xD;&#xA;==========\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace if Write Fails\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_17\" location=\"208,230\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_62_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_62_41.setRuntimeParent(null);
        _jettag_c_get_62_41.setTagInfo(_td_c_get_62_41);
        _jettag_c_get_62_41.doStart(context, out);
        _jettag_c_get_62_41.doEnd();
        out.write("SF_CreateTraceData.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Trace Data\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"19,47\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_21.setRuntimeParent(null);
        _jettag_c_get_67_21.setTagInfo(_td_c_get_67_21);
        _jettag_c_get_67_21.doStart(context, out);
        _jettag_c_get_67_21.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_61.setRuntimeParent(null);
        _jettag_c_get_67_61.setTagInfo(_td_c_get_67_61);
        _jettag_c_get_67_61.doStart(context, out);
        _jettag_c_get_67_61.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_16\" targetNode=\"FCMComposite_1_16\" sourceNode=\"FCMComposite_1_17\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_15\" targetNode=\"FCMComposite_1_17\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_11\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.try\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_11\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_11\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_15\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.LoggingOn\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.LoggingOn\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_79_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_21.setRuntimeParent(null);
        _jettag_c_get_79_21.setTagInfo(_td_c_get_79_21);
        _jettag_c_get_79_21.doStart(context, out);
        _jettag_c_get_79_21.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_80_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_80_20.setRuntimeParent(null);
        _jettag_c_get_80_20.setTagInfo(_td_c_get_80_20);
        _jettag_c_get_80_20.doStart(context, out);
        _jettag_c_get_80_20.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
