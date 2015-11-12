package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summary implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summary() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_45 = new TagInfo("c:get", //$NON-NLS-1$
            40, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_88 = new TagInfo("c:get", //$NON-NLS-1$
            40, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_128 = new TagInfo("c:get", //$NON-NLS-1$
            40, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_6 = new TagInfo("c:get", //$NON-NLS-1$
            41, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_45 = new TagInfo("c:get", //$NON-NLS-1$
            45, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_88 = new TagInfo("c:get", //$NON-NLS-1$
            45, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_128 = new TagInfo("c:get", //$NON-NLS-1$
            45, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_6 = new TagInfo("c:get", //$NON-NLS-1$
            46, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_45 = new TagInfo("c:get", //$NON-NLS-1$
            55, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_88 = new TagInfo("c:get", //$NON-NLS-1$
            55, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_128 = new TagInfo("c:get", //$NON-NLS-1$
            55, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_6 = new TagInfo("c:get", //$NON-NLS-1$
            56, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_45 = new TagInfo("c:get", //$NON-NLS-1$
            60, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_88 = new TagInfo("c:get", //$NON-NLS-1$
            60, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_128 = new TagInfo("c:get", //$NON-NLS-1$
            60, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_6 = new TagInfo("c:get", //$NON-NLS-1$
            61, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_45 = new TagInfo("c:get", //$NON-NLS-1$
            65, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_88 = new TagInfo("c:get", //$NON-NLS-1$
            65, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_128 = new TagInfo("c:get", //$NON-NLS-1$
            65, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_6 = new TagInfo("c:get", //$NON-NLS-1$
            66, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_69_4 = new TagInfo("c:if", //$NON-NLS-1$
            69, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_46 = new TagInfo("c:get", //$NON-NLS-1$
            71, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_89 = new TagInfo("c:get", //$NON-NLS-1$
            71, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_129 = new TagInfo("c:get", //$NON-NLS-1$
            71, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_7 = new TagInfo("c:get", //$NON-NLS-1$
            72, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_85_3 = new TagInfo("c:choose", //$NON-NLS-1$
            85, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_86_4 = new TagInfo("c:when", //$NON-NLS-1$
            86, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/portType) \r\n\t\t\t\tand string-length($root/serviceWsdl/portType) > 0\r\n\t\t\t\tand boolean($root/serviceWsdl/binding)\r\n\t\t\t\tand string-length($root/serviceWsdl/binding) > 0\r\n\t\t\t\tand boolean($root/serviceWsdl/port)\r\n\t\t\t\tand boolean($root/serviceWsdl/portType)\r\n\t\t\t\tand boolean($root/serviceWsdl/targetNamespace)\r\n\t\t\t\tand string-length($root/serviceWsdl/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_95_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            95, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_120_4 = new TagInfo("c:if", //$NON-NLS-1$
            120, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_122_6 = new TagInfo("c:choose", //$NON-NLS-1$
            122, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_123_7 = new TagInfo("c:when", //$NON-NLS-1$
            123, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_126_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            126, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_132_4 = new TagInfo("c:if", //$NON-NLS-1$
            132, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_134_6 = new TagInfo("c:choose", //$NON-NLS-1$
            134, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_135_7 = new TagInfo("c:when", //$NON-NLS-1$
            135, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_138_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            138, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_145_5 = new TagInfo("c:choose", //$NON-NLS-1$
            145, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_146_6 = new TagInfo("c:when", //$NON-NLS-1$
            146, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/providerRequestQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_149_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            149, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_167_3 = new TagInfo("c:choose", //$NON-NLS-1$
            167, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_168_4 = new TagInfo("c:when", //$NON-NLS-1$
            168, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_177_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            177, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_184_3 = new TagInfo("c:choose", //$NON-NLS-1$
            184, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_185_4 = new TagInfo("c:when", //$NON-NLS-1$
            185, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_194_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            194, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sen.sf.synchmq.PatternMessages messages = new com.ibm.etools.mft.pattern.sen.sf.synchmq.PatternMessages();

        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<title>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write("_summary.html</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<link rel=\"stylesheet\" href=\"summary.css\" media=\"screen\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction setStatus(txt){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = txt;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a name=\"NoPlace\"></a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div id=\"banner\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.35", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.1", new Object[] { "$root/instanceName" }) );
        out.write("</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.3") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.5", new Object[] { "$root/@projectname" }) );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_45.setRuntimeParent(null);
        _jettag_c_get_40_45.setTagInfo(_td_c_get_40_45);
        _jettag_c_get_40_45.doStart(context, out);
        _jettag_c_get_40_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_88.setRuntimeParent(null);
        _jettag_c_get_40_88.setTagInfo(_td_c_get_40_88);
        _jettag_c_get_40_88.doStart(context, out);
        _jettag_c_get_40_88.doEnd();
        RuntimeTagElement _jettag_c_get_40_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_128.setRuntimeParent(null);
        _jettag_c_get_40_128.setTagInfo(_td_c_get_40_128);
        _jettag_c_get_40_128.doStart(context, out);
        _jettag_c_get_40_128.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_6.setRuntimeParent(null);
        _jettag_c_get_41_6.setTagInfo(_td_c_get_41_6);
        _jettag_c_get_41_6.doStart(context, out);
        _jettag_c_get_41_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_45.setRuntimeParent(null);
        _jettag_c_get_45_45.setTagInfo(_td_c_get_45_45);
        _jettag_c_get_45_45.doStart(context, out);
        _jettag_c_get_45_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_88.setRuntimeParent(null);
        _jettag_c_get_45_88.setTagInfo(_td_c_get_45_88);
        _jettag_c_get_45_88.doStart(context, out);
        _jettag_c_get_45_88.doEnd();
        RuntimeTagElement _jettag_c_get_45_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_128.setRuntimeParent(null);
        _jettag_c_get_45_128.setTagInfo(_td_c_get_45_128);
        _jettag_c_get_45_128.doStart(context, out);
        _jettag_c_get_45_128.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_6.setRuntimeParent(null);
        _jettag_c_get_46_6.setTagInfo(_td_c_get_46_6);
        _jettag_c_get_46_6.doStart(context, out);
        _jettag_c_get_46_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.6") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_55_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_45.setRuntimeParent(null);
        _jettag_c_get_55_45.setTagInfo(_td_c_get_55_45);
        _jettag_c_get_55_45.doStart(context, out);
        _jettag_c_get_55_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_55_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_88.setRuntimeParent(null);
        _jettag_c_get_55_88.setTagInfo(_td_c_get_55_88);
        _jettag_c_get_55_88.doStart(context, out);
        _jettag_c_get_55_88.doEnd();
        RuntimeTagElement _jettag_c_get_55_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_128.setRuntimeParent(null);
        _jettag_c_get_55_128.setTagInfo(_td_c_get_55_128);
        _jettag_c_get_55_128.doStart(context, out);
        _jettag_c_get_55_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_56_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_56_6.setRuntimeParent(null);
        _jettag_c_get_56_6.setTagInfo(_td_c_get_56_6);
        _jettag_c_get_56_6.doStart(context, out);
        _jettag_c_get_56_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_60_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_45.setRuntimeParent(null);
        _jettag_c_get_60_45.setTagInfo(_td_c_get_60_45);
        _jettag_c_get_60_45.doStart(context, out);
        _jettag_c_get_60_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_60_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_88.setRuntimeParent(null);
        _jettag_c_get_60_88.setTagInfo(_td_c_get_60_88);
        _jettag_c_get_60_88.doStart(context, out);
        _jettag_c_get_60_88.doEnd();
        RuntimeTagElement _jettag_c_get_60_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_60_128.setRuntimeParent(null);
        _jettag_c_get_60_128.setTagInfo(_td_c_get_60_128);
        _jettag_c_get_60_128.doStart(context, out);
        _jettag_c_get_60_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_61_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_6.setRuntimeParent(null);
        _jettag_c_get_61_6.setTagInfo(_td_c_get_61_6);
        _jettag_c_get_61_6.doStart(context, out);
        _jettag_c_get_61_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_65_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_45.setRuntimeParent(null);
        _jettag_c_get_65_45.setTagInfo(_td_c_get_65_45);
        _jettag_c_get_65_45.doStart(context, out);
        _jettag_c_get_65_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_65_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_88.setRuntimeParent(null);
        _jettag_c_get_65_88.setTagInfo(_td_c_get_65_88);
        _jettag_c_get_65_88.doStart(context, out);
        _jettag_c_get_65_88.doEnd();
        RuntimeTagElement _jettag_c_get_65_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_128.setRuntimeParent(null);
        _jettag_c_get_65_128.setTagInfo(_td_c_get_65_128);
        _jettag_c_get_65_128.doStart(context, out);
        _jettag_c_get_65_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_6.setRuntimeParent(null);
        _jettag_c_get_66_6.setTagInfo(_td_c_get_66_6);
        _jettag_c_get_66_6.doStart(context, out);
        _jettag_c_get_66_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_69_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_69_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_69_4.setRuntimeParent(null);
        _jettag_c_if_69_4.setTagInfo(_td_c_if_69_4);
        _jettag_c_if_69_4.doStart(context, out);
        while (_jettag_c_if_69_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_71_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_71_46.setRuntimeParent(_jettag_c_if_69_4);
            _jettag_c_get_71_46.setTagInfo(_td_c_get_71_46);
            _jettag_c_get_71_46.doStart(context, out);
            _jettag_c_get_71_46.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_71_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_71_89.setRuntimeParent(_jettag_c_if_69_4);
            _jettag_c_get_71_89.setTagInfo(_td_c_get_71_89);
            _jettag_c_get_71_89.doStart(context, out);
            _jettag_c_get_71_89.doEnd();
            RuntimeTagElement _jettag_c_get_71_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_129); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_71_129.setRuntimeParent(_jettag_c_if_69_4);
            _jettag_c_get_71_129.setTagInfo(_td_c_get_71_129);
            _jettag_c_get_71_129.doStart(context, out);
            _jettag_c_get_71_129.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_7.setRuntimeParent(_jettag_c_if_69_4);
            _jettag_c_get_72_7.setTagInfo(_td_c_get_72_7);
            _jettag_c_get_72_7.doStart(context, out);
            _jettag_c_get_72_7.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_69_4.handleBodyContent(out);
        }
        _jettag_c_if_69_4.doEnd();
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.7", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_85_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_85_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_85_3.setRuntimeParent(null);
        _jettag_c_choose_85_3.setTagInfo(_td_c_choose_85_3);
        _jettag_c_choose_85_3.doStart(context, out);
        JET2Writer _jettag_c_choose_85_3_saved_out = out;
        while (_jettag_c_choose_85_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_86_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_86_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_86_4.setRuntimeParent(_jettag_c_choose_85_3);
            _jettag_c_when_86_4.setTagInfo(_td_c_when_86_4);
            _jettag_c_when_86_4.doStart(context, out);
            JET2Writer _jettag_c_when_86_4_saved_out = out;
            while (_jettag_c_when_86_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                _jettag_c_when_86_4.handleBodyContent(out);
            }
            out = _jettag_c_when_86_4_saved_out;
            _jettag_c_when_86_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_95_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_95_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_95_4.setRuntimeParent(_jettag_c_choose_85_3);
            _jettag_c_otherwise_95_4.setTagInfo(_td_c_otherwise_95_4);
            _jettag_c_otherwise_95_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_95_4_saved_out = out;
            while (_jettag_c_otherwise_95_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<h3>");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.33") );
                out.write("</h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.34", new Object[] { "$root/@request" }) );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_95_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_95_4_saved_out;
            _jettag_c_otherwise_95_4.doEnd();
            _jettag_c_choose_85_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_85_3_saved_out;
        _jettag_c_choose_85_3.doEnd();
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.8") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.9") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.10") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.11", new Object[] { "$root/queuePrefix", "$root/responseQueue", "$root/queueSuffix" }) );
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.12", new Object[] { "$root/queuePrefix", "$root/storeQueue", "$root/queueSuffix" }) );
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.13") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_120_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_120_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_120_4.setRuntimeParent(null);
        _jettag_c_if_120_4.setTagInfo(_td_c_if_120_4);
        _jettag_c_if_120_4.doStart(context, out);
        while (_jettag_c_if_120_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_122_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_122_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_122_6.setRuntimeParent(_jettag_c_if_120_4);
            _jettag_c_choose_122_6.setTagInfo(_td_c_choose_122_6);
            _jettag_c_choose_122_6.doStart(context, out);
            JET2Writer _jettag_c_choose_122_6_saved_out = out;
            while (_jettag_c_choose_122_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_123_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_123_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_123_7.setRuntimeParent(_jettag_c_choose_122_6);
                _jettag_c_when_123_7.setTagInfo(_td_c_when_123_7);
                _jettag_c_when_123_7.doStart(context, out);
                JET2Writer _jettag_c_when_123_7_saved_out = out;
                while (_jettag_c_when_123_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.14.queueManager", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_123_7.handleBodyContent(out);
                }
                out = _jettag_c_when_123_7_saved_out;
                _jettag_c_when_123_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_126_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_126_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_126_7.setRuntimeParent(_jettag_c_choose_122_6);
                _jettag_c_otherwise_126_7.setTagInfo(_td_c_otherwise_126_7);
                _jettag_c_otherwise_126_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_126_7_saved_out = out;
                while (_jettag_c_otherwise_126_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.14", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_126_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_126_7_saved_out;
                _jettag_c_otherwise_126_7.doEnd();
                _jettag_c_choose_122_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_122_6_saved_out;
            _jettag_c_choose_122_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_120_4.handleBodyContent(out);
        }
        _jettag_c_if_120_4.doEnd();
        RuntimeTagElement _jettag_c_if_132_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_132_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_132_4.setRuntimeParent(null);
        _jettag_c_if_132_4.setTagInfo(_td_c_if_132_4);
        _jettag_c_if_132_4.doStart(context, out);
        while (_jettag_c_if_132_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_134_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_134_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_134_6.setRuntimeParent(_jettag_c_if_132_4);
            _jettag_c_choose_134_6.setTagInfo(_td_c_choose_134_6);
            _jettag_c_choose_134_6.doStart(context, out);
            JET2Writer _jettag_c_choose_134_6_saved_out = out;
            while (_jettag_c_choose_134_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_135_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_135_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_135_7.setRuntimeParent(_jettag_c_choose_134_6);
                _jettag_c_when_135_7.setTagInfo(_td_c_when_135_7);
                _jettag_c_when_135_7.doStart(context, out);
                JET2Writer _jettag_c_when_135_7_saved_out = out;
                while (_jettag_c_when_135_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.15.queueManager", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix", "$root/logQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_135_7.handleBodyContent(out);
                }
                out = _jettag_c_when_135_7_saved_out;
                _jettag_c_when_135_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_138_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_138_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_138_7.setRuntimeParent(_jettag_c_choose_134_6);
                _jettag_c_otherwise_138_7.setTagInfo(_td_c_otherwise_138_7);
                _jettag_c_otherwise_138_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_138_7_saved_out = out;
                while (_jettag_c_otherwise_138_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.15", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_138_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_138_7_saved_out;
                _jettag_c_otherwise_138_7.doEnd();
                _jettag_c_choose_134_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_134_6_saved_out;
            _jettag_c_choose_134_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_132_4.handleBodyContent(out);
        }
        _jettag_c_if_132_4.doEnd();
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_145_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_145_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_145_5.setRuntimeParent(null);
        _jettag_c_choose_145_5.setTagInfo(_td_c_choose_145_5);
        _jettag_c_choose_145_5.doStart(context, out);
        JET2Writer _jettag_c_choose_145_5_saved_out = out;
        while (_jettag_c_choose_145_5.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_146_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_146_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_146_6.setRuntimeParent(_jettag_c_choose_145_5);
            _jettag_c_when_146_6.setTagInfo(_td_c_when_146_6);
            _jettag_c_when_146_6.doStart(context, out);
            JET2Writer _jettag_c_when_146_6_saved_out = out;
            while (_jettag_c_when_146_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.16.queueManager", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix", "$root/providerRequestQueueManager" }) );
                out.write(NL);         
                _jettag_c_when_146_6.handleBodyContent(out);
            }
            out = _jettag_c_when_146_6_saved_out;
            _jettag_c_when_146_6.doEnd();
            RuntimeTagElement _jettag_c_otherwise_149_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_149_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_149_6.setRuntimeParent(_jettag_c_choose_145_5);
            _jettag_c_otherwise_149_6.setTagInfo(_td_c_otherwise_149_6);
            _jettag_c_otherwise_149_6.doStart(context, out);
            JET2Writer _jettag_c_otherwise_149_6_saved_out = out;
            while (_jettag_c_otherwise_149_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.16", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix" }) );
                out.write(NL);         
                _jettag_c_otherwise_149_6.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_149_6_saved_out;
            _jettag_c_otherwise_149_6.doEnd();
            _jettag_c_choose_145_5.handleBodyContent(out);
        }
        out = _jettag_c_choose_145_5_saved_out;
        _jettag_c_choose_145_5.doEnd();
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.22") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.32") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.25") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_167_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_167_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_167_3.setRuntimeParent(null);
        _jettag_c_choose_167_3.setTagInfo(_td_c_choose_167_3);
        _jettag_c_choose_167_3.doStart(context, out);
        JET2Writer _jettag_c_choose_167_3_saved_out = out;
        while (_jettag_c_choose_167_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_168_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_168_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_168_4.setRuntimeParent(_jettag_c_choose_167_3);
            _jettag_c_when_168_4.setTagInfo(_td_c_when_168_4);
            _jettag_c_when_168_4.doStart(context, out);
            JET2Writer _jettag_c_when_168_4_saved_out = out;
            while (_jettag_c_when_168_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.26") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.27") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_168_4.handleBodyContent(out);
            }
            out = _jettag_c_when_168_4_saved_out;
            _jettag_c_when_168_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_177_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_177_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_177_4.setRuntimeParent(_jettag_c_choose_167_3);
            _jettag_c_otherwise_177_4.setTagInfo(_td_c_otherwise_177_4);
            _jettag_c_otherwise_177_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_177_4_saved_out = out;
            while (_jettag_c_otherwise_177_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.28") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_177_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_177_4_saved_out;
            _jettag_c_otherwise_177_4.doEnd();
            _jettag_c_choose_167_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_167_3_saved_out;
        _jettag_c_choose_167_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_184_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_184_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_184_3.setRuntimeParent(null);
        _jettag_c_choose_184_3.setTagInfo(_td_c_choose_184_3);
        _jettag_c_choose_184_3.doStart(context, out);
        JET2Writer _jettag_c_choose_184_3_saved_out = out;
        while (_jettag_c_choose_184_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_185_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_185_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_185_4.setRuntimeParent(_jettag_c_choose_184_3);
            _jettag_c_when_185_4.setTagInfo(_td_c_when_185_4);
            _jettag_c_when_185_4.doStart(context, out);
            JET2Writer _jettag_c_when_185_4_saved_out = out;
            while (_jettag_c_when_185_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.29") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.30") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_185_4.handleBodyContent(out);
            }
            out = _jettag_c_when_185_4_saved_out;
            _jettag_c_when_185_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_194_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_194_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_194_4.setRuntimeParent(_jettag_c_choose_184_3);
            _jettag_c_otherwise_194_4.setTagInfo(_td_c_otherwise_194_4);
            _jettag_c_otherwise_194_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_194_4_saved_out = out;
            while (_jettag_c_otherwise_194_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.summary.31") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_194_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_194_4_saved_out;
            _jettag_c_otherwise_194_4.doEnd();
            _jettag_c_choose_184_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_184_3_saved_out;
        _jettag_c_choose_184_3.doEnd();
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
