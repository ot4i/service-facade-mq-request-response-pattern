package org.eclipse.jet.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map pathToTemplateOrdinalMap = new HashMap(25);
    static {
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/dump.jet", //$NON-NLS-1$
                new Integer(0));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/main.jet", //$NON-NLS-1$
                new Integer(1));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(2));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(3));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(4));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(5));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Request.esql.jet", //$NON-NLS-1$
                new Integer(6));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
                new Integer(7));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(8));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(9));
        pathToTemplateOrdinalMap.put("sen/sf/onewayackmq/templates/root/summary.jet", //$NON-NLS-1$
                new Integer(10));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/dump.jet", //$NON-NLS-1$
                new Integer(11));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/main.jet", //$NON-NLS-1$
                new Integer(12));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(13));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(14));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Intermediary.esql.jet", //$NON-NLS-1$
                new Integer(15));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(16));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(17));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
                new Integer(18));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(19));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/Response.msgflow.jet", //$NON-NLS-1$
                new Integer(20));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/ResponseProcessor.subflow.jet", //$NON-NLS-1$
                new Integer(21));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/project.jet", //$NON-NLS-1$
                new Integer(22));
        pathToTemplateOrdinalMap.put("sen/sf/synchmq/templates/root/summary.jet", //$NON-NLS-1$
                new Integer(23));
        pathToTemplateOrdinalMap.put("sen/templates/main.jet", //$NON-NLS-1$
                new Integer(24));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = (Integer)pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // sen/sf/onewayackmq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump_0();
            case 1: // sen/sf/onewayackmq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_0();
            case 2: // sen/sf/onewayackmq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql_0();
            case 3: // sen/sf/onewayackmq/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow();
            case 4: // sen/sf/onewayackmq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql_0();
            case 5: // sen/sf/onewayackmq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow();
            case 6: // sen/sf/onewayackmq/templates/root/Request.esql.jet
                return new org.eclipse.jet.compiled._jet_Requestesql();
            case 7: // sen/sf/onewayackmq/templates/root/Request.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Requestmsgflow();
            case 8: // sen/sf/onewayackmq/templates/root/RequestProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_RequestProcessorsubflow_0();
            case 9: // sen/sf/onewayackmq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project();
            case 10: // sen/sf/onewayackmq/templates/root/summary.jet
                return new org.eclipse.jet.compiled._jet_summary_0();
            case 11: // sen/sf/synchmq/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump();
            case 12: // sen/sf/synchmq/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main();
            case 13: // sen/sf/synchmq/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql();
            case 14: // sen/sf/synchmq/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow_0();
            case 15: // sen/sf/synchmq/templates/root/Intermediary.esql.jet
                return new org.eclipse.jet.compiled._jet_Intermediaryesql();
            case 16: // sen/sf/synchmq/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql();
            case 17: // sen/sf/synchmq/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow_0();
            case 18: // sen/sf/synchmq/templates/root/Request.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Requestmsgflow_0();
            case 19: // sen/sf/synchmq/templates/root/RequestProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_RequestProcessorsubflow();
            case 20: // sen/sf/synchmq/templates/root/Response.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Responsemsgflow();
            case 21: // sen/sf/synchmq/templates/root/ResponseProcessor.subflow.jet
                return new org.eclipse.jet.compiled._jet_ResponseProcessorsubflow();
            case 22: // sen/sf/synchmq/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project_0();
            case 23: // sen/sf/synchmq/templates/root/summary.jet
                return new org.eclipse.jet.compiled._jet_summary();
            case 24: // sen/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_1();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
