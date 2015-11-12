package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summary_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summary_0() {
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
    private static final TagInfo _td_c_get_50_45 = new TagInfo("c:get", //$NON-NLS-1$
            50, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_88 = new TagInfo("c:get", //$NON-NLS-1$
            50, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_128 = new TagInfo("c:get", //$NON-NLS-1$
            50, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_6 = new TagInfo("c:get", //$NON-NLS-1$
            51, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
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
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_6 = new TagInfo("c:get", //$NON-NLS-1$
            56, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_4 = new TagInfo("c:if", //$NON-NLS-1$
            59, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_45 = new TagInfo("c:get", //$NON-NLS-1$
            61, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_88 = new TagInfo("c:get", //$NON-NLS-1$
            61, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_128 = new TagInfo("c:get", //$NON-NLS-1$
            61, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_6 = new TagInfo("c:get", //$NON-NLS-1$
            62, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_75_3 = new TagInfo("c:choose", //$NON-NLS-1$
            75, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_76_4 = new TagInfo("c:when", //$NON-NLS-1$
            76, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWsdl/portType) \r\n\t\t\t\tand string-length($root/serviceWsdl/portType) > 0\r\n\t\t\t\tand boolean($root/serviceWsdl/binding)\r\n\t\t\t\tand string-length($root/serviceWsdl/binding) > 0\r\n\t\t\t\tand boolean($root/serviceWsdl/port)\r\n\t\t\t\tand boolean($root/serviceWsdl/portType)\r\n\t\t\t\tand boolean($root/serviceWsdl/targetNamespace)\r\n\t\t\t\tand string-length($root/serviceWsdl/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_85_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            85, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_94_4 = new TagInfo("c:if", //$NON-NLS-1$
            94, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_96_6 = new TagInfo("c:choose", //$NON-NLS-1$
            96, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_97_7 = new TagInfo("c:when", //$NON-NLS-1$
            97, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_100_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            100, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_106_4 = new TagInfo("c:if", //$NON-NLS-1$
            106, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_108_6 = new TagInfo("c:choose", //$NON-NLS-1$
            108, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_109_7 = new TagInfo("c:when", //$NON-NLS-1$
            109, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_112_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            112, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_119_5 = new TagInfo("c:choose", //$NON-NLS-1$
            119, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_120_6 = new TagInfo("c:when", //$NON-NLS-1$
            120, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/providerRequestQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_123_6 = new TagInfo("c:otherwise", //$NON-NLS-1$
            123, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_141_3 = new TagInfo("c:choose", //$NON-NLS-1$
            141, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_142_4 = new TagInfo("c:when", //$NON-NLS-1$
            142, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_151_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            151, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_158_3 = new TagInfo("c:choose", //$NON-NLS-1$
            158, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_159_4 = new TagInfo("c:when", //$NON-NLS-1$
            159, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_168_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            168, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sen.sf.onewayackmq.PatternMessages messages = new com.ibm.etools.mft.pattern.sen.sf.onewayackmq.PatternMessages();

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
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.35", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.1", new Object[] { "$root/instanceName" }) );
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.3") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.5", new Object[] { "$root/@projectname" }) );
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
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.6") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_45.setRuntimeParent(null);
        _jettag_c_get_50_45.setTagInfo(_td_c_get_50_45);
        _jettag_c_get_50_45.doStart(context, out);
        _jettag_c_get_50_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_88.setRuntimeParent(null);
        _jettag_c_get_50_88.setTagInfo(_td_c_get_50_88);
        _jettag_c_get_50_88.doStart(context, out);
        _jettag_c_get_50_88.doEnd();
        RuntimeTagElement _jettag_c_get_50_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_128.setRuntimeParent(null);
        _jettag_c_get_50_128.setTagInfo(_td_c_get_50_128);
        _jettag_c_get_50_128.doStart(context, out);
        _jettag_c_get_50_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_6.setRuntimeParent(null);
        _jettag_c_get_51_6.setTagInfo(_td_c_get_51_6);
        _jettag_c_get_51_6.doStart(context, out);
        _jettag_c_get_51_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
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
        RuntimeTagElement _jettag_c_if_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_59_4.setRuntimeParent(null);
        _jettag_c_if_59_4.setTagInfo(_td_c_if_59_4);
        _jettag_c_if_59_4.doStart(context, out);
        while (_jettag_c_if_59_4.okToProcessBody()) {
            out.write("\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_61_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_61_45.setRuntimeParent(_jettag_c_if_59_4);
            _jettag_c_get_61_45.setTagInfo(_td_c_get_61_45);
            _jettag_c_get_61_45.doStart(context, out);
            _jettag_c_get_61_45.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_61_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_61_88.setRuntimeParent(_jettag_c_if_59_4);
            _jettag_c_get_61_88.setTagInfo(_td_c_get_61_88);
            _jettag_c_get_61_88.doStart(context, out);
            _jettag_c_get_61_88.doEnd();
            RuntimeTagElement _jettag_c_get_61_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_128); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_61_128.setRuntimeParent(_jettag_c_if_59_4);
            _jettag_c_get_61_128.setTagInfo(_td_c_get_61_128);
            _jettag_c_get_61_128.doStart(context, out);
            _jettag_c_get_61_128.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_6.setRuntimeParent(_jettag_c_if_59_4);
            _jettag_c_get_62_6.setTagInfo(_td_c_get_62_6);
            _jettag_c_get_62_6.doStart(context, out);
            _jettag_c_get_62_6.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_59_4.handleBodyContent(out);
        }
        _jettag_c_if_59_4.doEnd();
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
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.7", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_75_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_75_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_75_3.setRuntimeParent(null);
        _jettag_c_choose_75_3.setTagInfo(_td_c_choose_75_3);
        _jettag_c_choose_75_3.doStart(context, out);
        JET2Writer _jettag_c_choose_75_3_saved_out = out;
        while (_jettag_c_choose_75_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_76_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_76_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_76_4.setRuntimeParent(_jettag_c_choose_75_3);
            _jettag_c_when_76_4.setTagInfo(_td_c_when_76_4);
            _jettag_c_when_76_4.doStart(context, out);
            JET2Writer _jettag_c_when_76_4_saved_out = out;
            while (_jettag_c_when_76_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                _jettag_c_when_76_4.handleBodyContent(out);
            }
            out = _jettag_c_when_76_4_saved_out;
            _jettag_c_when_76_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_85_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_85_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_85_4.setRuntimeParent(_jettag_c_choose_75_3);
            _jettag_c_otherwise_85_4.setTagInfo(_td_c_otherwise_85_4);
            _jettag_c_otherwise_85_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_85_4_saved_out = out;
            while (_jettag_c_otherwise_85_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<h3>");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.33") );
                out.write("</h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.34", new Object[] { "$root/@request" }) );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_85_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_85_4_saved_out;
            _jettag_c_otherwise_85_4.doEnd();
            _jettag_c_choose_75_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_75_3_saved_out;
        _jettag_c_choose_75_3.doEnd();
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.8") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_94_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_94_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_94_4.setRuntimeParent(null);
        _jettag_c_if_94_4.setTagInfo(_td_c_if_94_4);
        _jettag_c_if_94_4.doStart(context, out);
        while (_jettag_c_if_94_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_96_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_96_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_96_6.setRuntimeParent(_jettag_c_if_94_4);
            _jettag_c_choose_96_6.setTagInfo(_td_c_choose_96_6);
            _jettag_c_choose_96_6.doStart(context, out);
            JET2Writer _jettag_c_choose_96_6_saved_out = out;
            while (_jettag_c_choose_96_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_97_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_97_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_97_7.setRuntimeParent(_jettag_c_choose_96_6);
                _jettag_c_when_97_7.setTagInfo(_td_c_when_97_7);
                _jettag_c_when_97_7.doStart(context, out);
                JET2Writer _jettag_c_when_97_7_saved_out = out;
                while (_jettag_c_when_97_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.14.queueManager", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_97_7.handleBodyContent(out);
                }
                out = _jettag_c_when_97_7_saved_out;
                _jettag_c_when_97_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_100_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_100_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_100_7.setRuntimeParent(_jettag_c_choose_96_6);
                _jettag_c_otherwise_100_7.setTagInfo(_td_c_otherwise_100_7);
                _jettag_c_otherwise_100_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_100_7_saved_out = out;
                while (_jettag_c_otherwise_100_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.14", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_100_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_100_7_saved_out;
                _jettag_c_otherwise_100_7.doEnd();
                _jettag_c_choose_96_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_96_6_saved_out;
            _jettag_c_choose_96_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_94_4.handleBodyContent(out);
        }
        _jettag_c_if_94_4.doEnd();
        RuntimeTagElement _jettag_c_if_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_106_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_106_4.setRuntimeParent(null);
        _jettag_c_if_106_4.setTagInfo(_td_c_if_106_4);
        _jettag_c_if_106_4.doStart(context, out);
        while (_jettag_c_if_106_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_108_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_108_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_108_6.setRuntimeParent(_jettag_c_if_106_4);
            _jettag_c_choose_108_6.setTagInfo(_td_c_choose_108_6);
            _jettag_c_choose_108_6.doStart(context, out);
            JET2Writer _jettag_c_choose_108_6_saved_out = out;
            while (_jettag_c_choose_108_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_109_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_109_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_109_7.setRuntimeParent(_jettag_c_choose_108_6);
                _jettag_c_when_109_7.setTagInfo(_td_c_when_109_7);
                _jettag_c_when_109_7.doStart(context, out);
                JET2Writer _jettag_c_when_109_7_saved_out = out;
                while (_jettag_c_when_109_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.15.queueManager", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix", "$root/logQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_109_7.handleBodyContent(out);
                }
                out = _jettag_c_when_109_7_saved_out;
                _jettag_c_when_109_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_112_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_112_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_112_7.setRuntimeParent(_jettag_c_choose_108_6);
                _jettag_c_otherwise_112_7.setTagInfo(_td_c_otherwise_112_7);
                _jettag_c_otherwise_112_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_112_7_saved_out = out;
                while (_jettag_c_otherwise_112_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.15", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_112_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_112_7_saved_out;
                _jettag_c_otherwise_112_7.doEnd();
                _jettag_c_choose_108_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_108_6_saved_out;
            _jettag_c_choose_108_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_106_4.handleBodyContent(out);
        }
        _jettag_c_if_106_4.doEnd();
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_119_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_119_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_119_5.setRuntimeParent(null);
        _jettag_c_choose_119_5.setTagInfo(_td_c_choose_119_5);
        _jettag_c_choose_119_5.doStart(context, out);
        JET2Writer _jettag_c_choose_119_5_saved_out = out;
        while (_jettag_c_choose_119_5.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_120_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_120_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_120_6.setRuntimeParent(_jettag_c_choose_119_5);
            _jettag_c_when_120_6.setTagInfo(_td_c_when_120_6);
            _jettag_c_when_120_6.doStart(context, out);
            JET2Writer _jettag_c_when_120_6_saved_out = out;
            while (_jettag_c_when_120_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.16.queueManager", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix", "$root/providerRequestQueueManager" }) );
                out.write(NL);         
                _jettag_c_when_120_6.handleBodyContent(out);
            }
            out = _jettag_c_when_120_6_saved_out;
            _jettag_c_when_120_6.doEnd();
            RuntimeTagElement _jettag_c_otherwise_123_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_123_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_123_6.setRuntimeParent(_jettag_c_choose_119_5);
            _jettag_c_otherwise_123_6.setTagInfo(_td_c_otherwise_123_6);
            _jettag_c_otherwise_123_6.doStart(context, out);
            JET2Writer _jettag_c_otherwise_123_6_saved_out = out;
            while (_jettag_c_otherwise_123_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.16", new Object[] { "$root/queuePrefix", "$root/providerRequestQueue", "$root/queueSuffix" }) );
                out.write(NL);         
                _jettag_c_otherwise_123_6.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_123_6_saved_out;
            _jettag_c_otherwise_123_6.doEnd();
            _jettag_c_choose_119_5.handleBodyContent(out);
        }
        out = _jettag_c_choose_119_5_saved_out;
        _jettag_c_choose_119_5.doEnd();
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.22") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.32") );
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
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.25") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_141_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_141_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_141_3.setRuntimeParent(null);
        _jettag_c_choose_141_3.setTagInfo(_td_c_choose_141_3);
        _jettag_c_choose_141_3.doStart(context, out);
        JET2Writer _jettag_c_choose_141_3_saved_out = out;
        while (_jettag_c_choose_141_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_142_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_142_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_142_4.setRuntimeParent(_jettag_c_choose_141_3);
            _jettag_c_when_142_4.setTagInfo(_td_c_when_142_4);
            _jettag_c_when_142_4.doStart(context, out);
            JET2Writer _jettag_c_when_142_4_saved_out = out;
            while (_jettag_c_when_142_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.26") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.27") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_142_4.handleBodyContent(out);
            }
            out = _jettag_c_when_142_4_saved_out;
            _jettag_c_when_142_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_151_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_151_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_151_4.setRuntimeParent(_jettag_c_choose_141_3);
            _jettag_c_otherwise_151_4.setTagInfo(_td_c_otherwise_151_4);
            _jettag_c_otherwise_151_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_151_4_saved_out = out;
            while (_jettag_c_otherwise_151_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.28") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_151_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_151_4_saved_out;
            _jettag_c_otherwise_151_4.doEnd();
            _jettag_c_choose_141_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_141_3_saved_out;
        _jettag_c_choose_141_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_158_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_158_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_158_3.setRuntimeParent(null);
        _jettag_c_choose_158_3.setTagInfo(_td_c_choose_158_3);
        _jettag_c_choose_158_3.doStart(context, out);
        JET2Writer _jettag_c_choose_158_3_saved_out = out;
        while (_jettag_c_choose_158_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_159_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_159_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_159_4.setRuntimeParent(_jettag_c_choose_158_3);
            _jettag_c_when_159_4.setTagInfo(_td_c_when_159_4);
            _jettag_c_when_159_4.doStart(context, out);
            JET2Writer _jettag_c_when_159_4_saved_out = out;
            while (_jettag_c_when_159_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.29") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.30") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_159_4.handleBodyContent(out);
            }
            out = _jettag_c_when_159_4_saved_out;
            _jettag_c_when_159_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_168_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_168_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_168_4.setRuntimeParent(_jettag_c_choose_158_3);
            _jettag_c_otherwise_168_4.setTagInfo(_td_c_otherwise_168_4);
            _jettag_c_otherwise_168_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_168_4_saved_out = out;
            while (_jettag_c_otherwise_168_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.summary.31") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_168_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_168_4_saved_out;
            _jettag_c_otherwise_168_4.doEnd();
            _jettag_c_choose_158_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_158_3_saved_out;
        _jettag_c_choose_158_3.doEnd();
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
