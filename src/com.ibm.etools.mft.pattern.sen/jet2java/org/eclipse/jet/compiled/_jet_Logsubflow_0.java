package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow_0() {
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
    private static final TagInfo _td_c_get_26_10 = new TagInfo("c:get", //$NON-NLS-1$
            26, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_17 = new TagInfo("c:get", //$NON-NLS-1$
            27, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_15 = new TagInfo("c:get", //$NON-NLS-1$
            28, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_36 = new TagInfo("c:get", //$NON-NLS-1$
            30, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_90 = new TagInfo("c:get", //$NON-NLS-1$
            30, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_36 = new TagInfo("c:get", //$NON-NLS-1$
            32, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_90 = new TagInfo("c:get", //$NON-NLS-1$
            32, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_65 = new TagInfo("c:get", //$NON-NLS-1$
            33, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_26 = new TagInfo("c:get", //$NON-NLS-1$
            35, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_71 = new TagInfo("c:get", //$NON-NLS-1$
            35, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_15 = new TagInfo("c:get", //$NON-NLS-1$
            36, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_33 = new TagInfo("c:get", //$NON-NLS-1$
            37, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_36 = new TagInfo("c:get", //$NON-NLS-1$
            38, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_41 = new TagInfo("c:get", //$NON-NLS-1$
            43, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_25 = new TagInfo("c:get", //$NON-NLS-1$
            48, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_18 = new TagInfo("c:get", //$NON-NLS-1$
            49, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_55 = new TagInfo("c:get", //$NON-NLS-1$
            49, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_87 = new TagInfo("c:get", //$NON-NLS-1$
            49, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_40 = new TagInfo("c:get", //$NON-NLS-1$
            54, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_41 = new TagInfo("c:get", //$NON-NLS-1$
            66, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_21 = new TagInfo("c:get", //$NON-NLS-1$
            71, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_61 = new TagInfo("c:get", //$NON-NLS-1$
            71, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_21 = new TagInfo("c:get", //$NON-NLS-1$
            83, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_20 = new TagInfo("c:get", //$NON-NLS-1$
            84, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_21 = new TagInfo("c:get", //$NON-NLS-1$
            88, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_20 = new TagInfo("c:get", //$NON-NLS-1$
            89, 20,
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
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.RequestLoggingOn\" name=\"RequestLoggingOn\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ResponseLoggingOn\" name=\"ResponseLoggingOn\" ");  //$NON-NLS-1$        
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
        RuntimeTagElement _jettag_c_get_26_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_10.setRuntimeParent(null);
        _jettag_c_get_26_10.setTagInfo(_td_c_get_26_10);
        _jettag_c_get_26_10.doStart(context, out);
        _jettag_c_get_26_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_17.setRuntimeParent(null);
        _jettag_c_get_27_17.setTagInfo(_td_c_get_27_17);
        _jettag_c_get_27_17.doStart(context, out);
        _jettag_c_get_27_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_15.setRuntimeParent(null);
        _jettag_c_get_28_15.setTagInfo(_td_c_get_28_15);
        _jettag_c_get_28_15.doStart(context, out);
        _jettag_c_get_28_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_36.setRuntimeParent(null);
        _jettag_c_get_30_36.setTagInfo(_td_c_get_30_36);
        _jettag_c_get_30_36.doStart(context, out);
        _jettag_c_get_30_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_90.setRuntimeParent(null);
        _jettag_c_get_30_90.setTagInfo(_td_c_get_30_90);
        _jettag_c_get_30_90.doStart(context, out);
        _jettag_c_get_30_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_36.setRuntimeParent(null);
        _jettag_c_get_32_36.setTagInfo(_td_c_get_32_36);
        _jettag_c_get_32_36.doStart(context, out);
        _jettag_c_get_32_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_90.setRuntimeParent(null);
        _jettag_c_get_32_90.setTagInfo(_td_c_get_32_90);
        _jettag_c_get_32_90.doStart(context, out);
        _jettag_c_get_32_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_65.setRuntimeParent(null);
        _jettag_c_get_33_65.setTagInfo(_td_c_get_33_65);
        _jettag_c_get_33_65.doStart(context, out);
        _jettag_c_get_33_65.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_26.setRuntimeParent(null);
        _jettag_c_get_35_26.setTagInfo(_td_c_get_35_26);
        _jettag_c_get_35_26.doStart(context, out);
        _jettag_c_get_35_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_71.setRuntimeParent(null);
        _jettag_c_get_35_71.setTagInfo(_td_c_get_35_71);
        _jettag_c_get_35_71.doStart(context, out);
        _jettag_c_get_35_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_15.setRuntimeParent(null);
        _jettag_c_get_36_15.setTagInfo(_td_c_get_36_15);
        _jettag_c_get_36_15.doStart(context, out);
        _jettag_c_get_36_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_33.setRuntimeParent(null);
        _jettag_c_get_37_33.setTagInfo(_td_c_get_37_33);
        _jettag_c_get_37_33.doStart(context, out);
        _jettag_c_get_37_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_36.setRuntimeParent(null);
        _jettag_c_get_38_36.setTagInfo(_td_c_get_38_36);
        _jettag_c_get_38_36.doStart(context, out);
        _jettag_c_get_38_36.doEnd();
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
        RuntimeTagElement _jettag_c_get_43_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_41.setRuntimeParent(null);
        _jettag_c_get_43_41.setTagInfo(_td_c_get_43_41);
        _jettag_c_get_43_41.doStart(context, out);
        _jettag_c_get_43_41.doEnd();
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
        RuntimeTagElement _jettag_c_get_48_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_48_25.setRuntimeParent(null);
        _jettag_c_get_48_25.setTagInfo(_td_c_get_48_25);
        _jettag_c_get_48_25.doStart(context, out);
        _jettag_c_get_48_25.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      queueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_18.setRuntimeParent(null);
        _jettag_c_get_49_18.setTagInfo(_td_c_get_49_18);
        _jettag_c_get_49_18.doStart(context, out);
        _jettag_c_get_49_18.doEnd();
        RuntimeTagElement _jettag_c_get_49_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_55.setRuntimeParent(null);
        _jettag_c_get_49_55.setTagInfo(_td_c_get_49_55);
        _jettag_c_get_49_55.doStart(context, out);
        _jettag_c_get_49_55.doEnd();
        RuntimeTagElement _jettag_c_get_49_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_87.setRuntimeParent(null);
        _jettag_c_get_49_87.setTagInfo(_td_c_get_49_87);
        _jettag_c_get_49_87.doStart(context, out);
        _jettag_c_get_49_87.doEnd();
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
        RuntimeTagElement _jettag_c_get_54_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_54_40.setRuntimeParent(null);
        _jettag_c_get_54_40.setTagInfo(_td_c_get_54_40);
        _jettag_c_get_54_40.doStart(context, out);
        _jettag_c_get_54_40.doEnd();
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
        RuntimeTagElement _jettag_c_get_66_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_41.setRuntimeParent(null);
        _jettag_c_get_66_41.setTagInfo(_td_c_get_66_41);
        _jettag_c_get_66_41.doStart(context, out);
        _jettag_c_get_66_41.doEnd();
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
        RuntimeTagElement _jettag_c_get_71_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_71_21.setRuntimeParent(null);
        _jettag_c_get_71_21.setTagInfo(_td_c_get_71_21);
        _jettag_c_get_71_21.doStart(context, out);
        _jettag_c_get_71_21.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_71_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_71_61.setRuntimeParent(null);
        _jettag_c_get_71_61.setTagInfo(_td_c_get_71_61);
        _jettag_c_get_71_61.doStart(context, out);
        _jettag_c_get_71_61.doEnd();
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
        out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.RequestLoggingOn\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.RequestLoggingOn\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_83_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_83_21.setRuntimeParent(null);
        _jettag_c_get_83_21.setTagInfo(_td_c_get_83_21);
        _jettag_c_get_83_21.doStart(context, out);
        _jettag_c_get_83_21.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_84_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_84_20.setRuntimeParent(null);
        _jettag_c_get_84_20.setTagInfo(_td_c_get_84_20);
        _jettag_c_get_84_20.doStart(context, out);
        _jettag_c_get_84_20.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         describedAttribute=\"Property.ResponseLoggingOn\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ResponseLoggingOn\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_88_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_88_21.setRuntimeParent(null);
        _jettag_c_get_88_21.setTagInfo(_td_c_get_88_21);
        _jettag_c_get_88_21.doStart(context, out);
        _jettag_c_get_88_21.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_89_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_89_20.setRuntimeParent(null);
        _jettag_c_get_89_20.setTagInfo(_td_c_get_89_20);
        _jettag_c_get_89_20.doStart(context, out);
        _jettag_c_get_89_20.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
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
