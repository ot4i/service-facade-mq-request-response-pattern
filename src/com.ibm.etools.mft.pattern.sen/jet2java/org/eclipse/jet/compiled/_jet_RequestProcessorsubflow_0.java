package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_RequestProcessorsubflow_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_RequestProcessorsubflow_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_7_12 = new TagInfo("c:get", //$NON-NLS-1$
            7, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_15 = new TagInfo("c:get", //$NON-NLS-1$
            8, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_15 = new TagInfo("c:get", //$NON-NLS-1$
            12, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_86 = new TagInfo("c:get", //$NON-NLS-1$
            13, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_86 = new TagInfo("c:get", //$NON-NLS-1$
            14, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_62 = new TagInfo("c:get", //$NON-NLS-1$
            15, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_26 = new TagInfo("c:get", //$NON-NLS-1$
            17, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_71 = new TagInfo("c:get", //$NON-NLS-1$
            17, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_33 = new TagInfo("c:get", //$NON-NLS-1$
            19, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_36 = new TagInfo("c:get", //$NON-NLS-1$
            20, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_124 = new TagInfo("c:get", //$NON-NLS-1$
            25, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_126 = new TagInfo("c:get", //$NON-NLS-1$
            28, 126,
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
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_12.setRuntimeParent(null);
        _jettag_c_get_7_12.setTagInfo(_td_c_get_7_12);
        _jettag_c_get_7_12.doStart(context, out);
        _jettag_c_get_7_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_15.setRuntimeParent(null);
        _jettag_c_get_8_15.setTagInfo(_td_c_get_8_15);
        _jettag_c_get_8_15.doStart(context, out);
        _jettag_c_get_8_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"Request_Processor\" bundleName=\"Request_Processor\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_15.setRuntimeParent(null);
        _jettag_c_get_12_15.setTagInfo(_td_c_get_12_15);
        _jettag_c_get_12_15.doStart(context, out);
        _jettag_c_get_12_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_86.setRuntimeParent(null);
        _jettag_c_get_13_86.setTagInfo(_td_c_get_13_86);
        _jettag_c_get_13_86.doStart(context, out);
        _jettag_c_get_13_86.doEnd();
        out.write("/icons/full/obj16/Request_Processor.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_86.setRuntimeParent(null);
        _jettag_c_get_14_86.setTagInfo(_td_c_get_14_86);
        _jettag_c_get_14_86.doStart(context, out);
        _jettag_c_get_14_86.doEnd();
        out.write("/icons/full/obj30/Request_Processor.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_62.setRuntimeParent(null);
        _jettag_c_get_15_62.setTagInfo(_td_c_get_15_62);
        _jettag_c_get_15_62.doStart(context, out);
        _jettag_c_get_15_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_26.setRuntimeParent(null);
        _jettag_c_get_17_26.setTagInfo(_td_c_get_17_26);
        _jettag_c_get_17_26.doStart(context, out);
        _jettag_c_get_17_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_71.setRuntimeParent(null);
        _jettag_c_get_17_71.setTagInfo(_td_c_get_17_71);
        _jettag_c_get_17_71.doStart(context, out);
        _jettag_c_get_17_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_15.setRuntimeParent(null);
        _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
        _jettag_c_get_18_15.doStart(context, out);
        _jettag_c_get_18_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_33.setRuntimeParent(null);
        _jettag_c_get_19_33.setTagInfo(_td_c_get_19_33);
        _jettag_c_get_19_33.doStart(context, out);
        _jettag_c_get_19_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_36.setRuntimeParent(null);
        _jettag_c_get_20_36.setTagInfo(_td_c_get_20_36);
        _jettag_c_get_20_36.doStart(context, out);
        _jettag_c_get_20_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"100,100\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" bundleName=\"Request_Processor\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_124); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_124.setRuntimeParent(null);
        _jettag_c_get_25_124.setTagInfo(_td_c_get_25_124);
        _jettag_c_get_25_124.doStart(context, out);
        _jettag_c_get_25_124.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSink\" xmi:id=\"OutTerminal.Output\" location=\"300,100\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"OutTerminal.Output\" bundleName=\"Request_Processor\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_126.setRuntimeParent(null);
        _jettag_c_get_28_126.setTagInfo(_td_c_get_28_126);
        _jettag_c_get_28_126.doStart(context, out);
        _jettag_c_get_28_126.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmPassthru.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" location=\"200,100\" label=\"Customisable subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Passthrough\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_1\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"OutTerminal.Output\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
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
