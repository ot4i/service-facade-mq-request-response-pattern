package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_ResponseProcessorsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_ResponseProcessorsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_12 = new TagInfo("c:get", //$NON-NLS-1$
            8, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_61 = new TagInfo("c:get", //$NON-NLS-1$
            12, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_17 = new TagInfo("c:get", //$NON-NLS-1$
            13, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_15 = new TagInfo("c:get", //$NON-NLS-1$
            14, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_36 = new TagInfo("c:get", //$NON-NLS-1$
            16, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_90 = new TagInfo("c:get", //$NON-NLS-1$
            16, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_36 = new TagInfo("c:get", //$NON-NLS-1$
            18, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_90 = new TagInfo("c:get", //$NON-NLS-1$
            18, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_63 = new TagInfo("c:get", //$NON-NLS-1$
            19, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_26 = new TagInfo("c:get", //$NON-NLS-1$
            21, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_71 = new TagInfo("c:get", //$NON-NLS-1$
            21, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_15 = new TagInfo("c:get", //$NON-NLS-1$
            22, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_33 = new TagInfo("c:get", //$NON-NLS-1$
            23, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_36 = new TagInfo("c:get", //$NON-NLS-1$
            24, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_95 = new TagInfo("c:get", //$NON-NLS-1$
            29, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_19 = new TagInfo("c:get", //$NON-NLS-1$
            30, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_97 = new TagInfo("c:get", //$NON-NLS-1$
            33, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_19 = new TagInfo("c:get", //$NON-NLS-1$
            34, 19,
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
        out.write("    xmlns:ComIbmPassthru.msgnode=\"ComIbmPassthru.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_12.setRuntimeParent(null);
        _jettag_c_get_8_12.setTagInfo(_td_c_get_8_12);
        _jettag_c_get_8_12.doStart(context, out);
        _jettag_c_get_8_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_15.setRuntimeParent(null);
        _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
        _jettag_c_get_9_15.doStart(context, out);
        _jettag_c_get_9_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_61.setRuntimeParent(null);
        _jettag_c_get_12_61.setTagInfo(_td_c_get_12_61);
        _jettag_c_get_12_61.doStart(context, out);
        _jettag_c_get_12_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_17.setRuntimeParent(null);
        _jettag_c_get_13_17.setTagInfo(_td_c_get_13_17);
        _jettag_c_get_13_17.doStart(context, out);
        _jettag_c_get_13_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_15.setRuntimeParent(null);
        _jettag_c_get_14_15.setTagInfo(_td_c_get_14_15);
        _jettag_c_get_14_15.doStart(context, out);
        _jettag_c_get_14_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_36.setRuntimeParent(null);
        _jettag_c_get_16_36.setTagInfo(_td_c_get_16_36);
        _jettag_c_get_16_36.doStart(context, out);
        _jettag_c_get_16_36.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_90.setRuntimeParent(null);
        _jettag_c_get_16_90.setTagInfo(_td_c_get_16_90);
        _jettag_c_get_16_90.doStart(context, out);
        _jettag_c_get_16_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_36.setRuntimeParent(null);
        _jettag_c_get_18_36.setTagInfo(_td_c_get_18_36);
        _jettag_c_get_18_36.doStart(context, out);
        _jettag_c_get_18_36.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_90); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_90.setRuntimeParent(null);
        _jettag_c_get_18_90.setTagInfo(_td_c_get_18_90);
        _jettag_c_get_18_90.doStart(context, out);
        _jettag_c_get_18_90.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_63.setRuntimeParent(null);
        _jettag_c_get_19_63.setTagInfo(_td_c_get_19_63);
        _jettag_c_get_19_63.doStart(context, out);
        _jettag_c_get_19_63.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_26.setRuntimeParent(null);
        _jettag_c_get_21_26.setTagInfo(_td_c_get_21_26);
        _jettag_c_get_21_26.doStart(context, out);
        _jettag_c_get_21_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_71.setRuntimeParent(null);
        _jettag_c_get_21_71.setTagInfo(_td_c_get_21_71);
        _jettag_c_get_21_71.doStart(context, out);
        _jettag_c_get_21_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_15.setRuntimeParent(null);
        _jettag_c_get_22_15.setTagInfo(_td_c_get_22_15);
        _jettag_c_get_22_15.doStart(context, out);
        _jettag_c_get_22_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_33.setRuntimeParent(null);
        _jettag_c_get_23_33.setTagInfo(_td_c_get_23_33);
        _jettag_c_get_23_33.doStart(context, out);
        _jettag_c_get_23_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_36.setRuntimeParent(null);
        _jettag_c_get_24_36.setTagInfo(_td_c_get_24_36);
        _jettag_c_get_24_36.doStart(context, out);
        _jettag_c_get_24_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"100,100\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_95.setRuntimeParent(null);
        _jettag_c_get_29_95.setTagInfo(_td_c_get_29_95);
        _jettag_c_get_29_95.doStart(context, out);
        _jettag_c_get_29_95.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_19.setRuntimeParent(null);
        _jettag_c_get_30_19.setTagInfo(_td_c_get_30_19);
        _jettag_c_get_30_19.doStart(context, out);
        _jettag_c_get_30_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output\" location=\"300,100\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"OutTerminal.Output\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_97.setRuntimeParent(null);
        _jettag_c_get_33_97.setTagInfo(_td_c_get_33_97);
        _jettag_c_get_33_97.doStart(context, out);
        _jettag_c_get_33_97.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_19.setRuntimeParent(null);
        _jettag_c_get_34_19.setTagInfo(_td_c_get_34_19);
        _jettag_c_get_34_19.doStart(context, out);
        _jettag_c_get_34_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmPassthru.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"200,100\" label=\"Customisable subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Passthrough\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_1\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"OutTerminal.Output\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
