package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_1 = new TagInfo("c:if", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/expiryofStoreQueueMessages) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_12_2 = new TagInfo("c:log", //$NON-NLS-1$
            12, 2,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_1 = new TagInfo("c:set", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_41 = new TagInfo("c:get", //$NON-NLS-1$
            18, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/expiryofStoreQueueMessages", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_19_1 = new TagInfo("c:choose", //$NON-NLS-1$
            19, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_20_2 = new TagInfo("c:when", //$NON-NLS-1$
            20, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/expiryofStoreQueueMessages = 'MQEI_UNLIMITED'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_21_2 = new TagInfo("c:when", //$NON-NLS-1$
            21, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/expiryofStoreQueueMessages > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_3 = new TagInfo("c:if", //$NON-NLS-1$
            22, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/expiryofStoreQueueMessages > 9999999999", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_23_4 = new TagInfo("c:set", //$NON-NLS-1$
            23, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "mqmdExpiry", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_26_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            26, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_log_27_3 = new TagInfo("c:log", //$NON-NLS-1$
            27, 3,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_34_1 = new TagInfo("c:set", //$NON-NLS-1$
            34, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_42 = new TagInfo("c:get", //$NON-NLS-1$
            34, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_35_1 = new TagInfo("c:set", //$NON-NLS-1$
            35, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_42 = new TagInfo("c:get", //$NON-NLS-1$
            35, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_36_1 = new TagInfo("c:set", //$NON-NLS-1$
            36, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_39_1 = new TagInfo("c:set", //$NON-NLS-1$
            39, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_38 = new TagInfo("c:get", //$NON-NLS-1$
            39, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_79 = new TagInfo("c:get", //$NON-NLS-1$
            39, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_40_1 = new TagInfo("c:set", //$NON-NLS-1$
            40, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_47 = new TagInfo("c:get", //$NON-NLS-1$
            40, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_97 = new TagInfo("c:get", //$NON-NLS-1$
            40, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_41_1 = new TagInfo("c:set", //$NON-NLS-1$
            41, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_39 = new TagInfo("c:get", //$NON-NLS-1$
            41, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_81 = new TagInfo("c:get", //$NON-NLS-1$
            41, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_42_1 = new TagInfo("c:set", //$NON-NLS-1$
            42, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_36 = new TagInfo("c:get", //$NON-NLS-1$
            42, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_75 = new TagInfo("c:get", //$NON-NLS-1$
            42, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_43_1 = new TagInfo("c:set", //$NON-NLS-1$
            43, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_34 = new TagInfo("c:get", //$NON-NLS-1$
            43, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_71 = new TagInfo("c:get", //$NON-NLS-1$
            43, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_44_1 = new TagInfo("c:set", //$NON-NLS-1$
            44, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_48 = new TagInfo("c:get", //$NON-NLS-1$
            44, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_99 = new TagInfo("c:get", //$NON-NLS-1$
            44, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_52_1 = new TagInfo("ws:project", //$NON-NLS-1$
            52, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/instanceName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_53_2 = new TagInfo("ws:file", //$NON-NLS-1$
            53, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/summary.jet", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/{$root/instanceName}_summary.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_55_2 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            55, 2,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "css/summary.css", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/summary.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_58_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            58, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$patternConfigurationFolderName}/icons", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_59_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            59, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/header-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "header-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_61_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            61, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/section.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "section.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_63_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            63, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/summary-title.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "summary-title.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_65_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            65, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/title-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "title-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_71_1 = new TagInfo("ws:project", //$NON-NLS-1$
            71, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/@projectname}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_72_2 = new TagInfo("ws:file", //$NON-NLS-1$
            72, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                ".project", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_75_2 = new TagInfo("c:set", //$NON-NLS-1$
            75, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_40 = new TagInfo("c:get", //$NON-NLS-1$
            75, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_76_2 = new TagInfo("c:set", //$NON-NLS-1$
            76, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_43 = new TagInfo("c:get", //$NON-NLS-1$
            76, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_81 = new TagInfo("c:get", //$NON-NLS-1$
            76, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_77_2 = new TagInfo("c:set", //$NON-NLS-1$
            77, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_46 = new TagInfo("c:get", //$NON-NLS-1$
            77, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_84 = new TagInfo("c:get", //$NON-NLS-1$
            77, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_78_2 = new TagInfo("c:set", //$NON-NLS-1$
            78, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_50 = new TagInfo("c:get", //$NON-NLS-1$
            78, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_88 = new TagInfo("c:get", //$NON-NLS-1$
            78, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_79_2 = new TagInfo("ws:file", //$NON-NLS-1$
            79, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Error.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Error.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_80_2 = new TagInfo("ws:file", //$NON-NLS-1$
            80, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@error}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_83_2 = new TagInfo("c:if", //$NON-NLS-1$
            83, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_84_3 = new TagInfo("c:set", //$NON-NLS-1$
            84, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_41 = new TagInfo("c:get", //$NON-NLS-1$
            84, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_85_3 = new TagInfo("c:set", //$NON-NLS-1$
            85, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_44 = new TagInfo("c:get", //$NON-NLS-1$
            85, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_82 = new TagInfo("c:get", //$NON-NLS-1$
            85, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_86_3 = new TagInfo("c:set", //$NON-NLS-1$
            86, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_47 = new TagInfo("c:get", //$NON-NLS-1$
            86, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_85 = new TagInfo("c:get", //$NON-NLS-1$
            86, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_87_3 = new TagInfo("c:set", //$NON-NLS-1$
            87, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_51 = new TagInfo("c:get", //$NON-NLS-1$
            87, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_89 = new TagInfo("c:get", //$NON-NLS-1$
            87, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_88_3 = new TagInfo("ws:file", //$NON-NLS-1$
            88, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Log.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Log.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_89_3 = new TagInfo("ws:file", //$NON-NLS-1$
            89, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@log}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_93_2 = new TagInfo("c:set", //$NON-NLS-1$
            93, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_40 = new TagInfo("c:get", //$NON-NLS-1$
            93, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_94_2 = new TagInfo("c:set", //$NON-NLS-1$
            94, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_43 = new TagInfo("c:get", //$NON-NLS-1$
            94, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_81 = new TagInfo("c:get", //$NON-NLS-1$
            94, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_95_2 = new TagInfo("c:set", //$NON-NLS-1$
            95, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_46 = new TagInfo("c:get", //$NON-NLS-1$
            95, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_84 = new TagInfo("c:get", //$NON-NLS-1$
            95, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_96_2 = new TagInfo("c:set", //$NON-NLS-1$
            96, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_50 = new TagInfo("c:get", //$NON-NLS-1$
            96, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_88 = new TagInfo("c:get", //$NON-NLS-1$
            96, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_97_2 = new TagInfo("ws:file", //$NON-NLS-1$
            97, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@request}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_98_2 = new TagInfo("ws:file", //$NON-NLS-1$
            98, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Intermediary.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Intermediary.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_101_2 = new TagInfo("c:set", //$NON-NLS-1$
            101, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_40 = new TagInfo("c:get", //$NON-NLS-1$
            101, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_102_2 = new TagInfo("c:set", //$NON-NLS-1$
            102, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_43 = new TagInfo("c:get", //$NON-NLS-1$
            102, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_81 = new TagInfo("c:get", //$NON-NLS-1$
            102, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_103_2 = new TagInfo("c:set", //$NON-NLS-1$
            103, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_46 = new TagInfo("c:get", //$NON-NLS-1$
            103, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_84 = new TagInfo("c:get", //$NON-NLS-1$
            103, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_104_2 = new TagInfo("c:set", //$NON-NLS-1$
            104, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_50 = new TagInfo("c:get", //$NON-NLS-1$
            104, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_88 = new TagInfo("c:get", //$NON-NLS-1$
            104, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_105_2 = new TagInfo("ws:file", //$NON-NLS-1$
            105, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@requestprocessor}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_108_2 = new TagInfo("c:set", //$NON-NLS-1$
            108, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_40 = new TagInfo("c:get", //$NON-NLS-1$
            108, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@response", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_109_2 = new TagInfo("c:set", //$NON-NLS-1$
            109, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_43 = new TagInfo("c:get", //$NON-NLS-1$
            109, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_81 = new TagInfo("c:get", //$NON-NLS-1$
            109, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_110_2 = new TagInfo("c:set", //$NON-NLS-1$
            110, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_46 = new TagInfo("c:get", //$NON-NLS-1$
            110, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_84 = new TagInfo("c:get", //$NON-NLS-1$
            110, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_111_2 = new TagInfo("c:set", //$NON-NLS-1$
            111, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_50 = new TagInfo("c:get", //$NON-NLS-1$
            111, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_88 = new TagInfo("c:get", //$NON-NLS-1$
            111, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_112_2 = new TagInfo("ws:file", //$NON-NLS-1$
            112, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@response}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/Response.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_115_2 = new TagInfo("c:set", //$NON-NLS-1$
            115, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_40 = new TagInfo("c:get", //$NON-NLS-1$
            115, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@responseprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_116_2 = new TagInfo("c:set", //$NON-NLS-1$
            116, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_43 = new TagInfo("c:get", //$NON-NLS-1$
            116, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_81 = new TagInfo("c:get", //$NON-NLS-1$
            116, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_117_2 = new TagInfo("c:set", //$NON-NLS-1$
            117, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_46 = new TagInfo("c:get", //$NON-NLS-1$
            117, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_84 = new TagInfo("c:get", //$NON-NLS-1$
            117, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_118_2 = new TagInfo("c:set", //$NON-NLS-1$
            118, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_50 = new TagInfo("c:get", //$NON-NLS-1$
            118, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_88 = new TagInfo("c:get", //$NON-NLS-1$
            118, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_119_2 = new TagInfo("ws:file", //$NON-NLS-1$
            119, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@responseprocessor}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/synchmq/templates/root/ResponseProcessor.subflow.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sen.sf.synchmq.PatternMessages messages = new com.ibm.etools.mft.pattern.sen.sf.synchmq.PatternMessages();

        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        // Validate expiry time until later iteration when it has its own validator 
        RuntimeTagElement _jettag_c_if_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_11_1.setRuntimeParent(null);
        _jettag_c_if_11_1.setTagInfo(_td_c_if_11_1);
        _jettag_c_if_11_1.doStart(context, out);
        while (_jettag_c_if_11_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_log_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_12_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_12_2.setRuntimeParent(_jettag_c_if_11_1);
            _jettag_c_log_12_2.setTagInfo(_td_c_log_12_2);
            _jettag_c_log_12_2.doStart(context, out);
            JET2Writer _jettag_c_log_12_2_saved_out = out;
            while (_jettag_c_log_12_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t    ");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.jet.1") );
                out.write(NL);         
                _jettag_c_log_12_2.handleBodyContent(out);
            }
            out = _jettag_c_log_12_2_saved_out;
            _jettag_c_log_12_2.doEnd();
     if (true) return; 
            _jettag_c_if_11_1.handleBodyContent(out);
        }
        _jettag_c_if_11_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_18_1.setRuntimeParent(null);
        _jettag_c_set_18_1.setTagInfo(_td_c_set_18_1);
        _jettag_c_set_18_1.doStart(context, out);
        JET2Writer _jettag_c_set_18_1_saved_out = out;
        while (_jettag_c_set_18_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_18_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_41.setRuntimeParent(_jettag_c_set_18_1);
            _jettag_c_get_18_41.setTagInfo(_td_c_get_18_41);
            _jettag_c_get_18_41.doStart(context, out);
            _jettag_c_get_18_41.doEnd();
            _jettag_c_set_18_1.handleBodyContent(out);
        }
        out = _jettag_c_set_18_1_saved_out;
        _jettag_c_set_18_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_19_1.setRuntimeParent(null);
        _jettag_c_choose_19_1.setTagInfo(_td_c_choose_19_1);
        _jettag_c_choose_19_1.doStart(context, out);
        JET2Writer _jettag_c_choose_19_1_saved_out = out;
        while (_jettag_c_choose_19_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_20_2.setRuntimeParent(_jettag_c_choose_19_1);
            _jettag_c_when_20_2.setTagInfo(_td_c_when_20_2);
            _jettag_c_when_20_2.doStart(context, out);
            JET2Writer _jettag_c_when_20_2_saved_out = out;
            while (_jettag_c_when_20_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                _jettag_c_when_20_2.handleBodyContent(out);
            }
            out = _jettag_c_when_20_2_saved_out;
            _jettag_c_when_20_2.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_21_2.setRuntimeParent(_jettag_c_choose_19_1);
            _jettag_c_when_21_2.setTagInfo(_td_c_when_21_2);
            _jettag_c_when_21_2.doStart(context, out);
            JET2Writer _jettag_c_when_21_2_saved_out = out;
            while (_jettag_c_when_21_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_3.setRuntimeParent(_jettag_c_when_21_2);
                _jettag_c_if_22_3.setTagInfo(_td_c_if_22_3);
                _jettag_c_if_22_3.doStart(context, out);
                while (_jettag_c_if_22_3.okToProcessBody()) {
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_23_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_23_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_23_4.setRuntimeParent(_jettag_c_if_22_3);
                    _jettag_c_set_23_4.setTagInfo(_td_c_set_23_4);
                    _jettag_c_set_23_4.doStart(context, out);
                    JET2Writer _jettag_c_set_23_4_saved_out = out;
                    while (_jettag_c_set_23_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("999999999");  //$NON-NLS-1$        
                        _jettag_c_set_23_4.handleBodyContent(out);
                    }
                    out = _jettag_c_set_23_4_saved_out;
                    _jettag_c_set_23_4.doEnd();
                    out.write(NL);         
                    _jettag_c_if_22_3.handleBodyContent(out);
                }
                _jettag_c_if_22_3.doEnd();
                _jettag_c_when_21_2.handleBodyContent(out);
            }
            out = _jettag_c_when_21_2_saved_out;
            _jettag_c_when_21_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_26_2.setRuntimeParent(_jettag_c_choose_19_1);
            _jettag_c_otherwise_26_2.setTagInfo(_td_c_otherwise_26_2);
            _jettag_c_otherwise_26_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_26_2_saved_out = out;
            while (_jettag_c_otherwise_26_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_log_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_27_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_27_3.setRuntimeParent(_jettag_c_otherwise_26_2);
                _jettag_c_log_27_3.setTagInfo(_td_c_log_27_3);
                _jettag_c_log_27_3.doStart(context, out);
                JET2Writer _jettag_c_log_27_3_saved_out = out;
                while (_jettag_c_log_27_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t    \t");  //$NON-NLS-1$        
                    out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.synchmq.jet.2") );
                    out.write(NL);         
                    _jettag_c_log_27_3.handleBodyContent(out);
                }
                out = _jettag_c_log_27_3_saved_out;
                _jettag_c_log_27_3.doEnd();
         if (true) return; 
                _jettag_c_otherwise_26_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_26_2_saved_out;
            _jettag_c_otherwise_26_2.doEnd();
            _jettag_c_choose_19_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_19_1_saved_out;
        _jettag_c_choose_19_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_34_1.setRuntimeParent(null);
        _jettag_c_set_34_1.setTagInfo(_td_c_set_34_1);
        _jettag_c_set_34_1.doStart(context, out);
        JET2Writer _jettag_c_set_34_1_saved_out = out;
        while (_jettag_c_set_34_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_34_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_42.setRuntimeParent(_jettag_c_set_34_1);
            _jettag_c_get_34_42.setTagInfo(_td_c_get_34_42);
            _jettag_c_get_34_42.doStart(context, out);
            _jettag_c_get_34_42.doEnd();
            out.write("_Flows");  //$NON-NLS-1$        
            _jettag_c_set_34_1.handleBodyContent(out);
        }
        out = _jettag_c_set_34_1_saved_out;
        _jettag_c_set_34_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_35_1.setRuntimeParent(null);
        _jettag_c_set_35_1.setTagInfo(_td_c_set_35_1);
        _jettag_c_set_35_1.doStart(context, out);
        JET2Writer _jettag_c_set_35_1_saved_out = out;
        while (_jettag_c_set_35_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_35_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_42.setRuntimeParent(_jettag_c_set_35_1);
            _jettag_c_get_35_42.setTagInfo(_td_c_get_35_42);
            _jettag_c_get_35_42.doStart(context, out);
            _jettag_c_get_35_42.doEnd();
            _jettag_c_set_35_1.handleBodyContent(out);
        }
        out = _jettag_c_set_35_1_saved_out;
        _jettag_c_set_35_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_36_1.setRuntimeParent(null);
        _jettag_c_set_36_1.setTagInfo(_td_c_set_36_1);
        _jettag_c_set_36_1.doStart(context, out);
        JET2Writer _jettag_c_set_36_1_saved_out = out;
        while (_jettag_c_set_36_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("1.0");  //$NON-NLS-1$        
            _jettag_c_set_36_1.handleBodyContent(out);
        }
        out = _jettag_c_set_36_1_saved_out;
        _jettag_c_set_36_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Make a name for each message flow 
        RuntimeTagElement _jettag_c_set_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_39_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_39_1.setRuntimeParent(null);
        _jettag_c_set_39_1.setTagInfo(_td_c_set_39_1);
        _jettag_c_set_39_1.doStart(context, out);
        JET2Writer _jettag_c_set_39_1_saved_out = out;
        while (_jettag_c_set_39_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_39_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_38.setRuntimeParent(_jettag_c_set_39_1);
            _jettag_c_get_39_38.setTagInfo(_td_c_get_39_38);
            _jettag_c_get_39_38.doStart(context, out);
            _jettag_c_get_39_38.doEnd();
            out.write("Request");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_39_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_79.setRuntimeParent(_jettag_c_set_39_1);
            _jettag_c_get_39_79.setTagInfo(_td_c_get_39_79);
            _jettag_c_get_39_79.doStart(context, out);
            _jettag_c_get_39_79.doEnd();
            _jettag_c_set_39_1.handleBodyContent(out);
        }
        out = _jettag_c_set_39_1_saved_out;
        _jettag_c_set_39_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_40_1.setRuntimeParent(null);
        _jettag_c_set_40_1.setTagInfo(_td_c_set_40_1);
        _jettag_c_set_40_1.doStart(context, out);
        JET2Writer _jettag_c_set_40_1_saved_out = out;
        while (_jettag_c_set_40_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_40_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_47.setRuntimeParent(_jettag_c_set_40_1);
            _jettag_c_get_40_47.setTagInfo(_td_c_get_40_47);
            _jettag_c_get_40_47.doStart(context, out);
            _jettag_c_get_40_47.doEnd();
            out.write("RequestProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_40_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_97.setRuntimeParent(_jettag_c_set_40_1);
            _jettag_c_get_40_97.setTagInfo(_td_c_get_40_97);
            _jettag_c_get_40_97.doStart(context, out);
            _jettag_c_get_40_97.doEnd();
            _jettag_c_set_40_1.handleBodyContent(out);
        }
        out = _jettag_c_set_40_1_saved_out;
        _jettag_c_set_40_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_41_1.setRuntimeParent(null);
        _jettag_c_set_41_1.setTagInfo(_td_c_set_41_1);
        _jettag_c_set_41_1.doStart(context, out);
        JET2Writer _jettag_c_set_41_1_saved_out = out;
        while (_jettag_c_set_41_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_41_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_39.setRuntimeParent(_jettag_c_set_41_1);
            _jettag_c_get_41_39.setTagInfo(_td_c_get_41_39);
            _jettag_c_get_41_39.doStart(context, out);
            _jettag_c_get_41_39.doEnd();
            out.write("Response");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_41_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_81.setRuntimeParent(_jettag_c_set_41_1);
            _jettag_c_get_41_81.setTagInfo(_td_c_get_41_81);
            _jettag_c_get_41_81.doStart(context, out);
            _jettag_c_get_41_81.doEnd();
            _jettag_c_set_41_1.handleBodyContent(out);
        }
        out = _jettag_c_set_41_1_saved_out;
        _jettag_c_set_41_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_42_1.setRuntimeParent(null);
        _jettag_c_set_42_1.setTagInfo(_td_c_set_42_1);
        _jettag_c_set_42_1.doStart(context, out);
        JET2Writer _jettag_c_set_42_1_saved_out = out;
        while (_jettag_c_set_42_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_42_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_36.setRuntimeParent(_jettag_c_set_42_1);
            _jettag_c_get_42_36.setTagInfo(_td_c_get_42_36);
            _jettag_c_get_42_36.doStart(context, out);
            _jettag_c_get_42_36.doEnd();
            out.write("Error");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_75.setRuntimeParent(_jettag_c_set_42_1);
            _jettag_c_get_42_75.setTagInfo(_td_c_get_42_75);
            _jettag_c_get_42_75.doStart(context, out);
            _jettag_c_get_42_75.doEnd();
            _jettag_c_set_42_1.handleBodyContent(out);
        }
        out = _jettag_c_set_42_1_saved_out;
        _jettag_c_set_42_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_43_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_43_1.setRuntimeParent(null);
        _jettag_c_set_43_1.setTagInfo(_td_c_set_43_1);
        _jettag_c_set_43_1.doStart(context, out);
        JET2Writer _jettag_c_set_43_1_saved_out = out;
        while (_jettag_c_set_43_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_43_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_43_34.setRuntimeParent(_jettag_c_set_43_1);
            _jettag_c_get_43_34.setTagInfo(_td_c_get_43_34);
            _jettag_c_get_43_34.doStart(context, out);
            _jettag_c_get_43_34.doEnd();
            out.write("Log");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_43_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_43_71.setRuntimeParent(_jettag_c_set_43_1);
            _jettag_c_get_43_71.setTagInfo(_td_c_get_43_71);
            _jettag_c_get_43_71.doStart(context, out);
            _jettag_c_get_43_71.doEnd();
            _jettag_c_set_43_1.handleBodyContent(out);
        }
        out = _jettag_c_set_43_1_saved_out;
        _jettag_c_set_43_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_44_1.setRuntimeParent(null);
        _jettag_c_set_44_1.setTagInfo(_td_c_set_44_1);
        _jettag_c_set_44_1.doStart(context, out);
        JET2Writer _jettag_c_set_44_1_saved_out = out;
        while (_jettag_c_set_44_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_44_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_44_48.setRuntimeParent(_jettag_c_set_44_1);
            _jettag_c_get_44_48.setTagInfo(_td_c_get_44_48);
            _jettag_c_get_44_48.doStart(context, out);
            _jettag_c_get_44_48.doEnd();
            out.write("ResponseProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_44_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_44_99.setRuntimeParent(_jettag_c_set_44_1);
            _jettag_c_get_44_99.setTagInfo(_td_c_get_44_99);
            _jettag_c_get_44_99.doStart(context, out);
            _jettag_c_get_44_99.doEnd();
            _jettag_c_set_44_1.handleBodyContent(out);
        }
        out = _jettag_c_set_44_1_saved_out;
        _jettag_c_set_44_1.doEnd();
        out.write(NL);         
        out.write(NL);         
 com.ibm.etools.mft.pattern.sen.plugin.PatternUtility.configureWSDL(
	context, "$root/deployableServiceWsdl", "serviceWsdl"); 
        out.write(NL);         
 com.ibm.etools.mft.pattern.sen.plugin.PatternUtility.getPatternConfigurationFolderName(context, "patternConfigurationFolderName"); 
        out.write(NL);         
        // Pattern reference project 
        RuntimeTagElement _jettag_ws_project_52_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_52_1.setRuntimeParent(null);
        _jettag_ws_project_52_1.setTagInfo(_td_ws_project_52_1);
        _jettag_ws_project_52_1.doStart(context, out);
        while (_jettag_ws_project_52_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_53_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_53_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_53_2.setRuntimeParent(_jettag_ws_project_52_1);
            _jettag_ws_file_53_2.setTagInfo(_td_ws_file_53_2);
            _jettag_ws_file_53_2.doStart(context, out);
            _jettag_ws_file_53_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_55_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_55_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_55_2.setRuntimeParent(_jettag_ws_project_52_1);
            _jettag_ws_copyFile_55_2.setTagInfo(_td_ws_copyFile_55_2);
            _jettag_ws_copyFile_55_2.doStart(context, out);
            _jettag_ws_copyFile_55_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_58_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_58_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_58_2.setRuntimeParent(_jettag_ws_project_52_1);
            _jettag_ws_folder_58_2.setTagInfo(_td_ws_folder_58_2);
            _jettag_ws_folder_58_2.doStart(context, out);
            while (_jettag_ws_folder_58_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_59_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_59_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_59_3.setRuntimeParent(_jettag_ws_folder_58_2);
                _jettag_ws_copyFile_59_3.setTagInfo(_td_ws_copyFile_59_3);
                _jettag_ws_copyFile_59_3.doStart(context, out);
                _jettag_ws_copyFile_59_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_61_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_61_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_61_3.setRuntimeParent(_jettag_ws_folder_58_2);
                _jettag_ws_copyFile_61_3.setTagInfo(_td_ws_copyFile_61_3);
                _jettag_ws_copyFile_61_3.doStart(context, out);
                _jettag_ws_copyFile_61_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_63_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_63_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_63_3.setRuntimeParent(_jettag_ws_folder_58_2);
                _jettag_ws_copyFile_63_3.setTagInfo(_td_ws_copyFile_63_3);
                _jettag_ws_copyFile_63_3.doStart(context, out);
                _jettag_ws_copyFile_63_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_65_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_65_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_65_3.setRuntimeParent(_jettag_ws_folder_58_2);
                _jettag_ws_copyFile_65_3.setTagInfo(_td_ws_copyFile_65_3);
                _jettag_ws_copyFile_65_3.doStart(context, out);
                _jettag_ws_copyFile_65_3.doEnd();
                out.write(NL);         
                _jettag_ws_folder_58_2.handleBodyContent(out);
            }
            _jettag_ws_folder_58_2.doEnd();
            _jettag_ws_project_52_1.handleBodyContent(out);
        }
        _jettag_ws_project_52_1.doEnd();
        out.write(NL);         
        // Message flow project 
        RuntimeTagElement _jettag_ws_project_71_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_71_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_71_1.setRuntimeParent(null);
        _jettag_ws_project_71_1.setTagInfo(_td_ws_project_71_1);
        _jettag_ws_project_71_1.doStart(context, out);
        while (_jettag_ws_project_71_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_72_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_72_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_72_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_72_2.setTagInfo(_td_ws_file_72_2);
            _jettag_ws_file_72_2.doStart(context, out);
            _jettag_ws_file_72_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Error 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_75_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_75_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_75_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_75_2.setTagInfo(_td_c_set_75_2);
            _jettag_c_set_75_2.doStart(context, out);
            JET2Writer _jettag_c_set_75_2_saved_out = out;
            while (_jettag_c_set_75_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_75_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_40.setRuntimeParent(_jettag_c_set_75_2);
                _jettag_c_get_75_40.setTagInfo(_td_c_get_75_40);
                _jettag_c_get_75_40.doStart(context, out);
                _jettag_c_get_75_40.doEnd();
                _jettag_c_set_75_2.handleBodyContent(out);
            }
            out = _jettag_c_set_75_2_saved_out;
            _jettag_c_set_75_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_76_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_76_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_76_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_76_2.setTagInfo(_td_c_set_76_2);
            _jettag_c_set_76_2.doStart(context, out);
            JET2Writer _jettag_c_set_76_2_saved_out = out;
            while (_jettag_c_set_76_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_76_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_43.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_43.setTagInfo(_td_c_get_76_43);
                _jettag_c_get_76_43.doStart(context, out);
                _jettag_c_get_76_43.doEnd();
                RuntimeTagElement _jettag_c_get_76_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_81.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_81.setTagInfo(_td_c_get_76_81);
                _jettag_c_get_76_81.doStart(context, out);
                _jettag_c_get_76_81.doEnd();
                _jettag_c_set_76_2.handleBodyContent(out);
            }
            out = _jettag_c_set_76_2_saved_out;
            _jettag_c_set_76_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_77_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_77_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_77_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_77_2.setTagInfo(_td_c_set_77_2);
            _jettag_c_set_77_2.doStart(context, out);
            JET2Writer _jettag_c_set_77_2_saved_out = out;
            while (_jettag_c_set_77_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_77_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_46.setRuntimeParent(_jettag_c_set_77_2);
                _jettag_c_get_77_46.setTagInfo(_td_c_get_77_46);
                _jettag_c_get_77_46.doStart(context, out);
                _jettag_c_get_77_46.doEnd();
                RuntimeTagElement _jettag_c_get_77_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_84.setRuntimeParent(_jettag_c_set_77_2);
                _jettag_c_get_77_84.setTagInfo(_td_c_get_77_84);
                _jettag_c_get_77_84.doStart(context, out);
                _jettag_c_get_77_84.doEnd();
                _jettag_c_set_77_2.handleBodyContent(out);
            }
            out = _jettag_c_set_77_2_saved_out;
            _jettag_c_set_77_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_78_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_78_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_78_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_78_2.setTagInfo(_td_c_set_78_2);
            _jettag_c_set_78_2.doStart(context, out);
            JET2Writer _jettag_c_set_78_2_saved_out = out;
            while (_jettag_c_set_78_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_78_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_50.setRuntimeParent(_jettag_c_set_78_2);
                _jettag_c_get_78_50.setTagInfo(_td_c_get_78_50);
                _jettag_c_get_78_50.doStart(context, out);
                _jettag_c_get_78_50.doEnd();
                RuntimeTagElement _jettag_c_get_78_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_88.setRuntimeParent(_jettag_c_set_78_2);
                _jettag_c_get_78_88.setTagInfo(_td_c_get_78_88);
                _jettag_c_get_78_88.doStart(context, out);
                _jettag_c_get_78_88.doEnd();
                _jettag_c_set_78_2.handleBodyContent(out);
            }
            out = _jettag_c_set_78_2_saved_out;
            _jettag_c_set_78_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_79_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_79_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_79_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_79_2.setTagInfo(_td_ws_file_79_2);
            _jettag_ws_file_79_2.doStart(context, out);
            _jettag_ws_file_79_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_80_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_80_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_80_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_80_2.setTagInfo(_td_ws_file_80_2);
            _jettag_ws_file_80_2.doStart(context, out);
            _jettag_ws_file_80_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Logging 
            RuntimeTagElement _jettag_c_if_83_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_83_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_83_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_if_83_2.setTagInfo(_td_c_if_83_2);
            _jettag_c_if_83_2.doStart(context, out);
            while (_jettag_c_if_83_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_84_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_84_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_84_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_c_set_84_3.setTagInfo(_td_c_set_84_3);
                _jettag_c_set_84_3.doStart(context, out);
                JET2Writer _jettag_c_set_84_3_saved_out = out;
                while (_jettag_c_set_84_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_84_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_41); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_84_41.setRuntimeParent(_jettag_c_set_84_3);
                    _jettag_c_get_84_41.setTagInfo(_td_c_get_84_41);
                    _jettag_c_get_84_41.doStart(context, out);
                    _jettag_c_get_84_41.doEnd();
                    _jettag_c_set_84_3.handleBodyContent(out);
                }
                out = _jettag_c_set_84_3_saved_out;
                _jettag_c_set_84_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_85_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_85_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_85_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_c_set_85_3.setTagInfo(_td_c_set_85_3);
                _jettag_c_set_85_3.doStart(context, out);
                JET2Writer _jettag_c_set_85_3_saved_out = out;
                while (_jettag_c_set_85_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_85_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_44.setRuntimeParent(_jettag_c_set_85_3);
                    _jettag_c_get_85_44.setTagInfo(_td_c_get_85_44);
                    _jettag_c_get_85_44.doStart(context, out);
                    _jettag_c_get_85_44.doEnd();
                    RuntimeTagElement _jettag_c_get_85_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_82.setRuntimeParent(_jettag_c_set_85_3);
                    _jettag_c_get_85_82.setTagInfo(_td_c_get_85_82);
                    _jettag_c_get_85_82.doStart(context, out);
                    _jettag_c_get_85_82.doEnd();
                    _jettag_c_set_85_3.handleBodyContent(out);
                }
                out = _jettag_c_set_85_3_saved_out;
                _jettag_c_set_85_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_86_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_86_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_86_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_c_set_86_3.setTagInfo(_td_c_set_86_3);
                _jettag_c_set_86_3.doStart(context, out);
                JET2Writer _jettag_c_set_86_3_saved_out = out;
                while (_jettag_c_set_86_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_86_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_86_47.setRuntimeParent(_jettag_c_set_86_3);
                    _jettag_c_get_86_47.setTagInfo(_td_c_get_86_47);
                    _jettag_c_get_86_47.doStart(context, out);
                    _jettag_c_get_86_47.doEnd();
                    RuntimeTagElement _jettag_c_get_86_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_86_85.setRuntimeParent(_jettag_c_set_86_3);
                    _jettag_c_get_86_85.setTagInfo(_td_c_get_86_85);
                    _jettag_c_get_86_85.doStart(context, out);
                    _jettag_c_get_86_85.doEnd();
                    _jettag_c_set_86_3.handleBodyContent(out);
                }
                out = _jettag_c_set_86_3_saved_out;
                _jettag_c_set_86_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_87_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_87_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_87_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_c_set_87_3.setTagInfo(_td_c_set_87_3);
                _jettag_c_set_87_3.doStart(context, out);
                JET2Writer _jettag_c_set_87_3_saved_out = out;
                while (_jettag_c_set_87_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_87_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_87_51.setRuntimeParent(_jettag_c_set_87_3);
                    _jettag_c_get_87_51.setTagInfo(_td_c_get_87_51);
                    _jettag_c_get_87_51.doStart(context, out);
                    _jettag_c_get_87_51.doEnd();
                    RuntimeTagElement _jettag_c_get_87_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_87_89.setRuntimeParent(_jettag_c_set_87_3);
                    _jettag_c_get_87_89.setTagInfo(_td_c_get_87_89);
                    _jettag_c_get_87_89.doStart(context, out);
                    _jettag_c_get_87_89.doEnd();
                    _jettag_c_set_87_3.handleBodyContent(out);
                }
                out = _jettag_c_set_87_3_saved_out;
                _jettag_c_set_87_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_88_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_88_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_88_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_ws_file_88_3.setTagInfo(_td_ws_file_88_3);
                _jettag_ws_file_88_3.doStart(context, out);
                _jettag_ws_file_88_3.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_89_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_89_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_89_3.setRuntimeParent(_jettag_c_if_83_2);
                _jettag_ws_file_89_3.setTagInfo(_td_ws_file_89_3);
                _jettag_ws_file_89_3.doStart(context, out);
                _jettag_ws_file_89_3.doEnd();
                out.write(NL);         
                _jettag_c_if_83_2.handleBodyContent(out);
            }
            _jettag_c_if_83_2.doEnd();
            out.write(NL);         
            // Request 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_93_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_93_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_93_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_93_2.setTagInfo(_td_c_set_93_2);
            _jettag_c_set_93_2.doStart(context, out);
            JET2Writer _jettag_c_set_93_2_saved_out = out;
            while (_jettag_c_set_93_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_93_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_40.setRuntimeParent(_jettag_c_set_93_2);
                _jettag_c_get_93_40.setTagInfo(_td_c_get_93_40);
                _jettag_c_get_93_40.doStart(context, out);
                _jettag_c_get_93_40.doEnd();
                _jettag_c_set_93_2.handleBodyContent(out);
            }
            out = _jettag_c_set_93_2_saved_out;
            _jettag_c_set_93_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_94_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_94_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_94_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_94_2.setTagInfo(_td_c_set_94_2);
            _jettag_c_set_94_2.doStart(context, out);
            JET2Writer _jettag_c_set_94_2_saved_out = out;
            while (_jettag_c_set_94_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_94_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_43.setRuntimeParent(_jettag_c_set_94_2);
                _jettag_c_get_94_43.setTagInfo(_td_c_get_94_43);
                _jettag_c_get_94_43.doStart(context, out);
                _jettag_c_get_94_43.doEnd();
                RuntimeTagElement _jettag_c_get_94_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_81.setRuntimeParent(_jettag_c_set_94_2);
                _jettag_c_get_94_81.setTagInfo(_td_c_get_94_81);
                _jettag_c_get_94_81.doStart(context, out);
                _jettag_c_get_94_81.doEnd();
                _jettag_c_set_94_2.handleBodyContent(out);
            }
            out = _jettag_c_set_94_2_saved_out;
            _jettag_c_set_94_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_95_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_95_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_95_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_95_2.setTagInfo(_td_c_set_95_2);
            _jettag_c_set_95_2.doStart(context, out);
            JET2Writer _jettag_c_set_95_2_saved_out = out;
            while (_jettag_c_set_95_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_95_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_95_46.setRuntimeParent(_jettag_c_set_95_2);
                _jettag_c_get_95_46.setTagInfo(_td_c_get_95_46);
                _jettag_c_get_95_46.doStart(context, out);
                _jettag_c_get_95_46.doEnd();
                RuntimeTagElement _jettag_c_get_95_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_95_84.setRuntimeParent(_jettag_c_set_95_2);
                _jettag_c_get_95_84.setTagInfo(_td_c_get_95_84);
                _jettag_c_get_95_84.doStart(context, out);
                _jettag_c_get_95_84.doEnd();
                _jettag_c_set_95_2.handleBodyContent(out);
            }
            out = _jettag_c_set_95_2_saved_out;
            _jettag_c_set_95_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_96_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_96_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_96_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_96_2.setTagInfo(_td_c_set_96_2);
            _jettag_c_set_96_2.doStart(context, out);
            JET2Writer _jettag_c_set_96_2_saved_out = out;
            while (_jettag_c_set_96_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_96_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_50.setRuntimeParent(_jettag_c_set_96_2);
                _jettag_c_get_96_50.setTagInfo(_td_c_get_96_50);
                _jettag_c_get_96_50.doStart(context, out);
                _jettag_c_get_96_50.doEnd();
                RuntimeTagElement _jettag_c_get_96_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_88.setRuntimeParent(_jettag_c_set_96_2);
                _jettag_c_get_96_88.setTagInfo(_td_c_get_96_88);
                _jettag_c_get_96_88.doStart(context, out);
                _jettag_c_get_96_88.doEnd();
                _jettag_c_set_96_2.handleBodyContent(out);
            }
            out = _jettag_c_set_96_2_saved_out;
            _jettag_c_set_96_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_97_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_97_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_97_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_97_2.setTagInfo(_td_ws_file_97_2);
            _jettag_ws_file_97_2.doStart(context, out);
            _jettag_ws_file_97_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_98_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_98_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_98_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_98_2.setTagInfo(_td_ws_file_98_2);
            _jettag_ws_file_98_2.doStart(context, out);
            _jettag_ws_file_98_2.doEnd();
            out.write("   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            // Request processor 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_101_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_101_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_101_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_101_2.setTagInfo(_td_c_set_101_2);
            _jettag_c_set_101_2.doStart(context, out);
            JET2Writer _jettag_c_set_101_2_saved_out = out;
            while (_jettag_c_set_101_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_101_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_101_40.setRuntimeParent(_jettag_c_set_101_2);
                _jettag_c_get_101_40.setTagInfo(_td_c_get_101_40);
                _jettag_c_get_101_40.doStart(context, out);
                _jettag_c_get_101_40.doEnd();
                _jettag_c_set_101_2.handleBodyContent(out);
            }
            out = _jettag_c_set_101_2_saved_out;
            _jettag_c_set_101_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_102_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_102_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_102_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_102_2.setTagInfo(_td_c_set_102_2);
            _jettag_c_set_102_2.doStart(context, out);
            JET2Writer _jettag_c_set_102_2_saved_out = out;
            while (_jettag_c_set_102_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_102_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_102_43.setRuntimeParent(_jettag_c_set_102_2);
                _jettag_c_get_102_43.setTagInfo(_td_c_get_102_43);
                _jettag_c_get_102_43.doStart(context, out);
                _jettag_c_get_102_43.doEnd();
                RuntimeTagElement _jettag_c_get_102_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_102_81.setRuntimeParent(_jettag_c_set_102_2);
                _jettag_c_get_102_81.setTagInfo(_td_c_get_102_81);
                _jettag_c_get_102_81.doStart(context, out);
                _jettag_c_get_102_81.doEnd();
                _jettag_c_set_102_2.handleBodyContent(out);
            }
            out = _jettag_c_set_102_2_saved_out;
            _jettag_c_set_102_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_103_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_103_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_103_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_103_2.setTagInfo(_td_c_set_103_2);
            _jettag_c_set_103_2.doStart(context, out);
            JET2Writer _jettag_c_set_103_2_saved_out = out;
            while (_jettag_c_set_103_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_103_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_103_46.setRuntimeParent(_jettag_c_set_103_2);
                _jettag_c_get_103_46.setTagInfo(_td_c_get_103_46);
                _jettag_c_get_103_46.doStart(context, out);
                _jettag_c_get_103_46.doEnd();
                RuntimeTagElement _jettag_c_get_103_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_103_84.setRuntimeParent(_jettag_c_set_103_2);
                _jettag_c_get_103_84.setTagInfo(_td_c_get_103_84);
                _jettag_c_get_103_84.doStart(context, out);
                _jettag_c_get_103_84.doEnd();
                _jettag_c_set_103_2.handleBodyContent(out);
            }
            out = _jettag_c_set_103_2_saved_out;
            _jettag_c_set_103_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_104_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_104_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_104_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_104_2.setTagInfo(_td_c_set_104_2);
            _jettag_c_set_104_2.doStart(context, out);
            JET2Writer _jettag_c_set_104_2_saved_out = out;
            while (_jettag_c_set_104_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_104_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_50.setRuntimeParent(_jettag_c_set_104_2);
                _jettag_c_get_104_50.setTagInfo(_td_c_get_104_50);
                _jettag_c_get_104_50.doStart(context, out);
                _jettag_c_get_104_50.doEnd();
                RuntimeTagElement _jettag_c_get_104_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_88.setRuntimeParent(_jettag_c_set_104_2);
                _jettag_c_get_104_88.setTagInfo(_td_c_get_104_88);
                _jettag_c_get_104_88.doStart(context, out);
                _jettag_c_get_104_88.doEnd();
                _jettag_c_set_104_2.handleBodyContent(out);
            }
            out = _jettag_c_set_104_2_saved_out;
            _jettag_c_set_104_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_105_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_105_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_105_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_105_2.setTagInfo(_td_ws_file_105_2);
            _jettag_ws_file_105_2.doStart(context, out);
            _jettag_ws_file_105_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Response 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_108_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_108_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_108_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_108_2.setTagInfo(_td_c_set_108_2);
            _jettag_c_set_108_2.doStart(context, out);
            JET2Writer _jettag_c_set_108_2_saved_out = out;
            while (_jettag_c_set_108_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_108_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_108_40.setRuntimeParent(_jettag_c_set_108_2);
                _jettag_c_get_108_40.setTagInfo(_td_c_get_108_40);
                _jettag_c_get_108_40.doStart(context, out);
                _jettag_c_get_108_40.doEnd();
                _jettag_c_set_108_2.handleBodyContent(out);
            }
            out = _jettag_c_set_108_2_saved_out;
            _jettag_c_set_108_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_109_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_109_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_109_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_109_2.setTagInfo(_td_c_set_109_2);
            _jettag_c_set_109_2.doStart(context, out);
            JET2Writer _jettag_c_set_109_2_saved_out = out;
            while (_jettag_c_set_109_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_109_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_43.setRuntimeParent(_jettag_c_set_109_2);
                _jettag_c_get_109_43.setTagInfo(_td_c_get_109_43);
                _jettag_c_get_109_43.doStart(context, out);
                _jettag_c_get_109_43.doEnd();
                RuntimeTagElement _jettag_c_get_109_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_81.setRuntimeParent(_jettag_c_set_109_2);
                _jettag_c_get_109_81.setTagInfo(_td_c_get_109_81);
                _jettag_c_get_109_81.doStart(context, out);
                _jettag_c_get_109_81.doEnd();
                _jettag_c_set_109_2.handleBodyContent(out);
            }
            out = _jettag_c_set_109_2_saved_out;
            _jettag_c_set_109_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_110_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_110_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_110_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_110_2.setTagInfo(_td_c_set_110_2);
            _jettag_c_set_110_2.doStart(context, out);
            JET2Writer _jettag_c_set_110_2_saved_out = out;
            while (_jettag_c_set_110_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_110_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_46.setRuntimeParent(_jettag_c_set_110_2);
                _jettag_c_get_110_46.setTagInfo(_td_c_get_110_46);
                _jettag_c_get_110_46.doStart(context, out);
                _jettag_c_get_110_46.doEnd();
                RuntimeTagElement _jettag_c_get_110_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_84.setRuntimeParent(_jettag_c_set_110_2);
                _jettag_c_get_110_84.setTagInfo(_td_c_get_110_84);
                _jettag_c_get_110_84.doStart(context, out);
                _jettag_c_get_110_84.doEnd();
                _jettag_c_set_110_2.handleBodyContent(out);
            }
            out = _jettag_c_set_110_2_saved_out;
            _jettag_c_set_110_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_111_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_111_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_111_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_111_2.setTagInfo(_td_c_set_111_2);
            _jettag_c_set_111_2.doStart(context, out);
            JET2Writer _jettag_c_set_111_2_saved_out = out;
            while (_jettag_c_set_111_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_111_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_50.setRuntimeParent(_jettag_c_set_111_2);
                _jettag_c_get_111_50.setTagInfo(_td_c_get_111_50);
                _jettag_c_get_111_50.doStart(context, out);
                _jettag_c_get_111_50.doEnd();
                RuntimeTagElement _jettag_c_get_111_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_88.setRuntimeParent(_jettag_c_set_111_2);
                _jettag_c_get_111_88.setTagInfo(_td_c_get_111_88);
                _jettag_c_get_111_88.doStart(context, out);
                _jettag_c_get_111_88.doEnd();
                _jettag_c_set_111_2.handleBodyContent(out);
            }
            out = _jettag_c_set_111_2_saved_out;
            _jettag_c_set_111_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_112_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_112_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_112_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_112_2.setTagInfo(_td_ws_file_112_2);
            _jettag_ws_file_112_2.doStart(context, out);
            _jettag_ws_file_112_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Response processor 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_115_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_115_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_115_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_115_2.setTagInfo(_td_c_set_115_2);
            _jettag_c_set_115_2.doStart(context, out);
            JET2Writer _jettag_c_set_115_2_saved_out = out;
            while (_jettag_c_set_115_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_115_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_115_40.setRuntimeParent(_jettag_c_set_115_2);
                _jettag_c_get_115_40.setTagInfo(_td_c_get_115_40);
                _jettag_c_get_115_40.doStart(context, out);
                _jettag_c_get_115_40.doEnd();
                _jettag_c_set_115_2.handleBodyContent(out);
            }
            out = _jettag_c_set_115_2_saved_out;
            _jettag_c_set_115_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_116_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_116_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_116_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_116_2.setTagInfo(_td_c_set_116_2);
            _jettag_c_set_116_2.doStart(context, out);
            JET2Writer _jettag_c_set_116_2_saved_out = out;
            while (_jettag_c_set_116_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_116_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_116_43.setRuntimeParent(_jettag_c_set_116_2);
                _jettag_c_get_116_43.setTagInfo(_td_c_get_116_43);
                _jettag_c_get_116_43.doStart(context, out);
                _jettag_c_get_116_43.doEnd();
                RuntimeTagElement _jettag_c_get_116_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_116_81.setRuntimeParent(_jettag_c_set_116_2);
                _jettag_c_get_116_81.setTagInfo(_td_c_get_116_81);
                _jettag_c_get_116_81.doStart(context, out);
                _jettag_c_get_116_81.doEnd();
                _jettag_c_set_116_2.handleBodyContent(out);
            }
            out = _jettag_c_set_116_2_saved_out;
            _jettag_c_set_116_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_117_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_117_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_117_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_117_2.setTagInfo(_td_c_set_117_2);
            _jettag_c_set_117_2.doStart(context, out);
            JET2Writer _jettag_c_set_117_2_saved_out = out;
            while (_jettag_c_set_117_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_117_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_117_46.setRuntimeParent(_jettag_c_set_117_2);
                _jettag_c_get_117_46.setTagInfo(_td_c_get_117_46);
                _jettag_c_get_117_46.doStart(context, out);
                _jettag_c_get_117_46.doEnd();
                RuntimeTagElement _jettag_c_get_117_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_117_84.setRuntimeParent(_jettag_c_set_117_2);
                _jettag_c_get_117_84.setTagInfo(_td_c_get_117_84);
                _jettag_c_get_117_84.doStart(context, out);
                _jettag_c_get_117_84.doEnd();
                _jettag_c_set_117_2.handleBodyContent(out);
            }
            out = _jettag_c_set_117_2_saved_out;
            _jettag_c_set_117_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_118_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_118_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_118_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_c_set_118_2.setTagInfo(_td_c_set_118_2);
            _jettag_c_set_118_2.doStart(context, out);
            JET2Writer _jettag_c_set_118_2_saved_out = out;
            while (_jettag_c_set_118_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_118_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_118_50.setRuntimeParent(_jettag_c_set_118_2);
                _jettag_c_get_118_50.setTagInfo(_td_c_get_118_50);
                _jettag_c_get_118_50.doStart(context, out);
                _jettag_c_get_118_50.doEnd();
                RuntimeTagElement _jettag_c_get_118_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_118_88.setRuntimeParent(_jettag_c_set_118_2);
                _jettag_c_get_118_88.setTagInfo(_td_c_get_118_88);
                _jettag_c_get_118_88.doStart(context, out);
                _jettag_c_get_118_88.doEnd();
                _jettag_c_set_118_2.handleBodyContent(out);
            }
            out = _jettag_c_set_118_2_saved_out;
            _jettag_c_set_118_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_119_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_119_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_119_2.setRuntimeParent(_jettag_ws_project_71_1);
            _jettag_ws_file_119_2.setTagInfo(_td_ws_file_119_2);
            _jettag_ws_file_119_2.doStart(context, out);
            _jettag_ws_file_119_2.doEnd();
            out.write(NL);         
            _jettag_ws_project_71_1.handleBodyContent(out);
        }
        _jettag_ws_project_71_1.doEnd();
    }
}
