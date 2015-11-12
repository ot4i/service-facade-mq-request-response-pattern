package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_4_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_6_1 = new TagInfo("c:set", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_42 = new TagInfo("c:get", //$NON-NLS-1$
            6, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_7_1 = new TagInfo("c:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_42 = new TagInfo("c:get", //$NON-NLS-1$
            7, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_11_1 = new TagInfo("c:set", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternInstanceProjectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_57 = new TagInfo("c:get", //$NON-NLS-1$
            11, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_14_1 = new TagInfo("c:set", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_38 = new TagInfo("c:get", //$NON-NLS-1$
            14, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_79 = new TagInfo("c:get", //$NON-NLS-1$
            14, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_15_1 = new TagInfo("c:set", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_47 = new TagInfo("c:get", //$NON-NLS-1$
            15, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_97 = new TagInfo("c:get", //$NON-NLS-1$
            15, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_16_1 = new TagInfo("c:set", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_36 = new TagInfo("c:get", //$NON-NLS-1$
            16, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_75 = new TagInfo("c:get", //$NON-NLS-1$
            16, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_17_1 = new TagInfo("c:set", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_34 = new TagInfo("c:get", //$NON-NLS-1$
            17, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_71 = new TagInfo("c:get", //$NON-NLS-1$
            17, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_25_1 = new TagInfo("ws:project", //$NON-NLS-1$
            25, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/instanceName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_26_2 = new TagInfo("ws:file", //$NON-NLS-1$
            26, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "sen/sf/onewayackmq/templates/root/summary.jet", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/{$root/instanceName}_summary.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_28_2 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            28, 2,
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
    private static final TagInfo _td_ws_folder_31_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            31, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$patternConfigurationFolderName}/icons", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_32_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            32, 3,
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
    private static final TagInfo _td_ws_copyFile_34_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            34, 3,
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
    private static final TagInfo _td_ws_copyFile_36_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            36, 3,
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
    private static final TagInfo _td_ws_copyFile_38_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            38, 3,
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
    private static final TagInfo _td_ws_project_44_1 = new TagInfo("ws:project", //$NON-NLS-1$
            44, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/@projectname}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_45_2 = new TagInfo("ws:file", //$NON-NLS-1$
            45, 2,
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
                "sen/sf/onewayackmq/templates/root/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_48_2 = new TagInfo("c:set", //$NON-NLS-1$
            48, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_40 = new TagInfo("c:get", //$NON-NLS-1$
            48, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_49_2 = new TagInfo("c:set", //$NON-NLS-1$
            49, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_43 = new TagInfo("c:get", //$NON-NLS-1$
            49, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_81 = new TagInfo("c:get", //$NON-NLS-1$
            49, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_50_2 = new TagInfo("c:set", //$NON-NLS-1$
            50, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_46 = new TagInfo("c:get", //$NON-NLS-1$
            50, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_84 = new TagInfo("c:get", //$NON-NLS-1$
            50, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_51_2 = new TagInfo("c:set", //$NON-NLS-1$
            51, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_50 = new TagInfo("c:get", //$NON-NLS-1$
            51, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_88 = new TagInfo("c:get", //$NON-NLS-1$
            51, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_52_2 = new TagInfo("ws:file", //$NON-NLS-1$
            52, 2,
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
                "sen/sf/onewayackmq/templates/root/Error.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_53_2 = new TagInfo("ws:file", //$NON-NLS-1$
            53, 2,
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
                "sen/sf/onewayackmq/templates/root/Error.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_2 = new TagInfo("c:if", //$NON-NLS-1$
            56, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_57_3 = new TagInfo("c:set", //$NON-NLS-1$
            57, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_41 = new TagInfo("c:get", //$NON-NLS-1$
            57, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_58_3 = new TagInfo("c:set", //$NON-NLS-1$
            58, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_44 = new TagInfo("c:get", //$NON-NLS-1$
            58, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_82 = new TagInfo("c:get", //$NON-NLS-1$
            58, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_59_3 = new TagInfo("c:set", //$NON-NLS-1$
            59, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_47 = new TagInfo("c:get", //$NON-NLS-1$
            59, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_85 = new TagInfo("c:get", //$NON-NLS-1$
            59, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_60_3 = new TagInfo("c:set", //$NON-NLS-1$
            60, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_51 = new TagInfo("c:get", //$NON-NLS-1$
            60, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_89 = new TagInfo("c:get", //$NON-NLS-1$
            60, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_61_3 = new TagInfo("ws:file", //$NON-NLS-1$
            61, 3,
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
                "sen/sf/onewayackmq/templates/root/Log.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_62_3 = new TagInfo("ws:file", //$NON-NLS-1$
            62, 3,
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
                "sen/sf/onewayackmq/templates/root/Log.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_66_2 = new TagInfo("c:set", //$NON-NLS-1$
            66, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_40 = new TagInfo("c:get", //$NON-NLS-1$
            66, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@request", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_67_2 = new TagInfo("c:set", //$NON-NLS-1$
            67, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_43 = new TagInfo("c:get", //$NON-NLS-1$
            67, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_81 = new TagInfo("c:get", //$NON-NLS-1$
            67, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_68_2 = new TagInfo("c:set", //$NON-NLS-1$
            68, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_46 = new TagInfo("c:get", //$NON-NLS-1$
            68, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_84 = new TagInfo("c:get", //$NON-NLS-1$
            68, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_69_2 = new TagInfo("c:set", //$NON-NLS-1$
            69, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_50 = new TagInfo("c:get", //$NON-NLS-1$
            69, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_88 = new TagInfo("c:get", //$NON-NLS-1$
            69, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_70_2 = new TagInfo("ws:file", //$NON-NLS-1$
            70, 2,
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
                "sen/sf/onewayackmq/templates/root/Request.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_71_2 = new TagInfo("ws:file", //$NON-NLS-1$
            71, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Request.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sen/sf/onewayackmq/templates/root/Request.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_74_2 = new TagInfo("c:set", //$NON-NLS-1$
            74, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_40 = new TagInfo("c:get", //$NON-NLS-1$
            74, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@requestprocessor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_75_2 = new TagInfo("c:set", //$NON-NLS-1$
            75, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_43 = new TagInfo("c:get", //$NON-NLS-1$
            75, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_81 = new TagInfo("c:get", //$NON-NLS-1$
            75, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_76_2 = new TagInfo("c:set", //$NON-NLS-1$
            76, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_46 = new TagInfo("c:get", //$NON-NLS-1$
            76, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_84 = new TagInfo("c:get", //$NON-NLS-1$
            76, 84,
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
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_50 = new TagInfo("c:get", //$NON-NLS-1$
            77, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_88 = new TagInfo("c:get", //$NON-NLS-1$
            77, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_78_2 = new TagInfo("ws:file", //$NON-NLS-1$
            78, 2,
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
                "sen/sf/onewayackmq/templates/root/RequestProcessor.subflow.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_4_1.setRuntimeParent(null);
        _jettag_c_setVariable_4_1.setTagInfo(_td_c_setVariable_4_1);
        _jettag_c_setVariable_4_1.doStart(context, out);
        _jettag_c_setVariable_4_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_6_1.setRuntimeParent(null);
        _jettag_c_set_6_1.setTagInfo(_td_c_set_6_1);
        _jettag_c_set_6_1.doStart(context, out);
        JET2Writer _jettag_c_set_6_1_saved_out = out;
        while (_jettag_c_set_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_6_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_42.setRuntimeParent(_jettag_c_set_6_1);
            _jettag_c_get_6_42.setTagInfo(_td_c_get_6_42);
            _jettag_c_get_6_42.doStart(context, out);
            _jettag_c_get_6_42.doEnd();
            out.write("_Flows");  //$NON-NLS-1$        
            _jettag_c_set_6_1.handleBodyContent(out);
        }
        out = _jettag_c_set_6_1_saved_out;
        _jettag_c_set_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_7_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_42.setRuntimeParent(_jettag_c_set_7_1);
            _jettag_c_get_7_42.setTagInfo(_td_c_get_7_42);
            _jettag_c_get_7_42.doStart(context, out);
            _jettag_c_get_7_42.doEnd();
            _jettag_c_set_7_1.handleBodyContent(out);
        }
        out = _jettag_c_set_7_1_saved_out;
        _jettag_c_set_7_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_8_1.setRuntimeParent(null);
        _jettag_c_set_8_1.setTagInfo(_td_c_set_8_1);
        _jettag_c_set_8_1.doStart(context, out);
        JET2Writer _jettag_c_set_8_1_saved_out = out;
        while (_jettag_c_set_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("1.0");  //$NON-NLS-1$        
            _jettag_c_set_8_1.handleBodyContent(out);
        }
        out = _jettag_c_set_8_1_saved_out;
        _jettag_c_set_8_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Pass back derived attribute value for pattern instance project name 
        RuntimeTagElement _jettag_c_set_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_11_1.setRuntimeParent(null);
        _jettag_c_set_11_1.setTagInfo(_td_c_set_11_1);
        _jettag_c_set_11_1.doStart(context, out);
        JET2Writer _jettag_c_set_11_1_saved_out = out;
        while (_jettag_c_set_11_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_11_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_57.setRuntimeParent(_jettag_c_set_11_1);
            _jettag_c_get_11_57.setTagInfo(_td_c_get_11_57);
            _jettag_c_get_11_57.doStart(context, out);
            _jettag_c_get_11_57.doEnd();
            _jettag_c_set_11_1.handleBodyContent(out);
        }
        out = _jettag_c_set_11_1_saved_out;
        _jettag_c_set_11_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Make a name for each message flow 
        RuntimeTagElement _jettag_c_set_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_14_1.setRuntimeParent(null);
        _jettag_c_set_14_1.setTagInfo(_td_c_set_14_1);
        _jettag_c_set_14_1.doStart(context, out);
        JET2Writer _jettag_c_set_14_1_saved_out = out;
        while (_jettag_c_set_14_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_14_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_38.setRuntimeParent(_jettag_c_set_14_1);
            _jettag_c_get_14_38.setTagInfo(_td_c_get_14_38);
            _jettag_c_get_14_38.doStart(context, out);
            _jettag_c_get_14_38.doEnd();
            out.write("Request");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_79.setRuntimeParent(_jettag_c_set_14_1);
            _jettag_c_get_14_79.setTagInfo(_td_c_get_14_79);
            _jettag_c_get_14_79.doStart(context, out);
            _jettag_c_get_14_79.doEnd();
            _jettag_c_set_14_1.handleBodyContent(out);
        }
        out = _jettag_c_set_14_1_saved_out;
        _jettag_c_set_14_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_15_1.setRuntimeParent(null);
        _jettag_c_set_15_1.setTagInfo(_td_c_set_15_1);
        _jettag_c_set_15_1.doStart(context, out);
        JET2Writer _jettag_c_set_15_1_saved_out = out;
        while (_jettag_c_set_15_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_15_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_47.setRuntimeParent(_jettag_c_set_15_1);
            _jettag_c_get_15_47.setTagInfo(_td_c_get_15_47);
            _jettag_c_get_15_47.doStart(context, out);
            _jettag_c_get_15_47.doEnd();
            out.write("RequestProcessor");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_97.setRuntimeParent(_jettag_c_set_15_1);
            _jettag_c_get_15_97.setTagInfo(_td_c_get_15_97);
            _jettag_c_get_15_97.doStart(context, out);
            _jettag_c_get_15_97.doEnd();
            _jettag_c_set_15_1.handleBodyContent(out);
        }
        out = _jettag_c_set_15_1_saved_out;
        _jettag_c_set_15_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_16_1.setRuntimeParent(null);
        _jettag_c_set_16_1.setTagInfo(_td_c_set_16_1);
        _jettag_c_set_16_1.doStart(context, out);
        JET2Writer _jettag_c_set_16_1_saved_out = out;
        while (_jettag_c_set_16_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_16_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_36.setRuntimeParent(_jettag_c_set_16_1);
            _jettag_c_get_16_36.setTagInfo(_td_c_get_16_36);
            _jettag_c_get_16_36.doStart(context, out);
            _jettag_c_get_16_36.doEnd();
            out.write("Error");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_75.setRuntimeParent(_jettag_c_set_16_1);
            _jettag_c_get_16_75.setTagInfo(_td_c_get_16_75);
            _jettag_c_get_16_75.doStart(context, out);
            _jettag_c_get_16_75.doEnd();
            _jettag_c_set_16_1.handleBodyContent(out);
        }
        out = _jettag_c_set_16_1_saved_out;
        _jettag_c_set_16_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_17_1.setRuntimeParent(null);
        _jettag_c_set_17_1.setTagInfo(_td_c_set_17_1);
        _jettag_c_set_17_1.doStart(context, out);
        JET2Writer _jettag_c_set_17_1_saved_out = out;
        while (_jettag_c_set_17_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_17_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_34.setRuntimeParent(_jettag_c_set_17_1);
            _jettag_c_get_17_34.setTagInfo(_td_c_get_17_34);
            _jettag_c_get_17_34.doStart(context, out);
            _jettag_c_get_17_34.doEnd();
            out.write("Log");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_71); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_71.setRuntimeParent(_jettag_c_set_17_1);
            _jettag_c_get_17_71.setTagInfo(_td_c_get_17_71);
            _jettag_c_get_17_71.doStart(context, out);
            _jettag_c_get_17_71.doEnd();
            _jettag_c_set_17_1.handleBodyContent(out);
        }
        out = _jettag_c_set_17_1_saved_out;
        _jettag_c_set_17_1.doEnd();
        out.write(NL);         
        out.write(NL);         
 com.ibm.etools.mft.pattern.sen.plugin.PatternUtility.configureWSDL(
	context, "$root/deployableServiceWsdl", "serviceWsdl"); 
        out.write(NL);         
 com.ibm.etools.mft.pattern.sen.plugin.PatternUtility.getPatternConfigurationFolderName(context, "patternConfigurationFolderName"); 
        out.write(NL);         
        // Pattern reference project 
        RuntimeTagElement _jettag_ws_project_25_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_25_1.setRuntimeParent(null);
        _jettag_ws_project_25_1.setTagInfo(_td_ws_project_25_1);
        _jettag_ws_project_25_1.doStart(context, out);
        while (_jettag_ws_project_25_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_26_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_26_2.setRuntimeParent(_jettag_ws_project_25_1);
            _jettag_ws_file_26_2.setTagInfo(_td_ws_file_26_2);
            _jettag_ws_file_26_2.doStart(context, out);
            _jettag_ws_file_26_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_28_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_28_2.setRuntimeParent(_jettag_ws_project_25_1);
            _jettag_ws_copyFile_28_2.setTagInfo(_td_ws_copyFile_28_2);
            _jettag_ws_copyFile_28_2.doStart(context, out);
            _jettag_ws_copyFile_28_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_31_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_31_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_31_2.setRuntimeParent(_jettag_ws_project_25_1);
            _jettag_ws_folder_31_2.setTagInfo(_td_ws_folder_31_2);
            _jettag_ws_folder_31_2.doStart(context, out);
            while (_jettag_ws_folder_31_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_32_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_32_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_32_3.setRuntimeParent(_jettag_ws_folder_31_2);
                _jettag_ws_copyFile_32_3.setTagInfo(_td_ws_copyFile_32_3);
                _jettag_ws_copyFile_32_3.doStart(context, out);
                _jettag_ws_copyFile_32_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_34_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_34_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_34_3.setRuntimeParent(_jettag_ws_folder_31_2);
                _jettag_ws_copyFile_34_3.setTagInfo(_td_ws_copyFile_34_3);
                _jettag_ws_copyFile_34_3.doStart(context, out);
                _jettag_ws_copyFile_34_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_36_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_36_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_36_3.setRuntimeParent(_jettag_ws_folder_31_2);
                _jettag_ws_copyFile_36_3.setTagInfo(_td_ws_copyFile_36_3);
                _jettag_ws_copyFile_36_3.doStart(context, out);
                _jettag_ws_copyFile_36_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_38_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_38_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_38_3.setRuntimeParent(_jettag_ws_folder_31_2);
                _jettag_ws_copyFile_38_3.setTagInfo(_td_ws_copyFile_38_3);
                _jettag_ws_copyFile_38_3.doStart(context, out);
                _jettag_ws_copyFile_38_3.doEnd();
                out.write(NL);         
                _jettag_ws_folder_31_2.handleBodyContent(out);
            }
            _jettag_ws_folder_31_2.doEnd();
            _jettag_ws_project_25_1.handleBodyContent(out);
        }
        _jettag_ws_project_25_1.doEnd();
        out.write(NL);         
        // Message flow project 
        RuntimeTagElement _jettag_ws_project_44_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_44_1.setRuntimeParent(null);
        _jettag_ws_project_44_1.setTagInfo(_td_ws_project_44_1);
        _jettag_ws_project_44_1.doStart(context, out);
        while (_jettag_ws_project_44_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_45_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_45_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_45_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_45_2.setTagInfo(_td_ws_file_45_2);
            _jettag_ws_file_45_2.doStart(context, out);
            _jettag_ws_file_45_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Error 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_48_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_48_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_48_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_48_2.setTagInfo(_td_c_set_48_2);
            _jettag_c_set_48_2.doStart(context, out);
            JET2Writer _jettag_c_set_48_2_saved_out = out;
            while (_jettag_c_set_48_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_48_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_40.setRuntimeParent(_jettag_c_set_48_2);
                _jettag_c_get_48_40.setTagInfo(_td_c_get_48_40);
                _jettag_c_get_48_40.doStart(context, out);
                _jettag_c_get_48_40.doEnd();
                _jettag_c_set_48_2.handleBodyContent(out);
            }
            out = _jettag_c_set_48_2_saved_out;
            _jettag_c_set_48_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_49_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_49_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_49_2.setTagInfo(_td_c_set_49_2);
            _jettag_c_set_49_2.doStart(context, out);
            JET2Writer _jettag_c_set_49_2_saved_out = out;
            while (_jettag_c_set_49_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_49_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_43.setRuntimeParent(_jettag_c_set_49_2);
                _jettag_c_get_49_43.setTagInfo(_td_c_get_49_43);
                _jettag_c_get_49_43.doStart(context, out);
                _jettag_c_get_49_43.doEnd();
                RuntimeTagElement _jettag_c_get_49_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_81.setRuntimeParent(_jettag_c_set_49_2);
                _jettag_c_get_49_81.setTagInfo(_td_c_get_49_81);
                _jettag_c_get_49_81.doStart(context, out);
                _jettag_c_get_49_81.doEnd();
                _jettag_c_set_49_2.handleBodyContent(out);
            }
            out = _jettag_c_set_49_2_saved_out;
            _jettag_c_set_49_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_50_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_50_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_50_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_50_2.setTagInfo(_td_c_set_50_2);
            _jettag_c_set_50_2.doStart(context, out);
            JET2Writer _jettag_c_set_50_2_saved_out = out;
            while (_jettag_c_set_50_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_50_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_46.setRuntimeParent(_jettag_c_set_50_2);
                _jettag_c_get_50_46.setTagInfo(_td_c_get_50_46);
                _jettag_c_get_50_46.doStart(context, out);
                _jettag_c_get_50_46.doEnd();
                RuntimeTagElement _jettag_c_get_50_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_84.setRuntimeParent(_jettag_c_set_50_2);
                _jettag_c_get_50_84.setTagInfo(_td_c_get_50_84);
                _jettag_c_get_50_84.doStart(context, out);
                _jettag_c_get_50_84.doEnd();
                _jettag_c_set_50_2.handleBodyContent(out);
            }
            out = _jettag_c_set_50_2_saved_out;
            _jettag_c_set_50_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_51_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_51_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_51_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_51_2.setTagInfo(_td_c_set_51_2);
            _jettag_c_set_51_2.doStart(context, out);
            JET2Writer _jettag_c_set_51_2_saved_out = out;
            while (_jettag_c_set_51_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_51_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_50.setRuntimeParent(_jettag_c_set_51_2);
                _jettag_c_get_51_50.setTagInfo(_td_c_get_51_50);
                _jettag_c_get_51_50.doStart(context, out);
                _jettag_c_get_51_50.doEnd();
                RuntimeTagElement _jettag_c_get_51_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_88.setRuntimeParent(_jettag_c_set_51_2);
                _jettag_c_get_51_88.setTagInfo(_td_c_get_51_88);
                _jettag_c_get_51_88.doStart(context, out);
                _jettag_c_get_51_88.doEnd();
                _jettag_c_set_51_2.handleBodyContent(out);
            }
            out = _jettag_c_set_51_2_saved_out;
            _jettag_c_set_51_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_52_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_52_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_52_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_52_2.setTagInfo(_td_ws_file_52_2);
            _jettag_ws_file_52_2.doStart(context, out);
            _jettag_ws_file_52_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_53_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_53_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_53_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_53_2.setTagInfo(_td_ws_file_53_2);
            _jettag_ws_file_53_2.doStart(context, out);
            _jettag_ws_file_53_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Logging 
            RuntimeTagElement _jettag_c_if_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_56_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_if_56_2.setTagInfo(_td_c_if_56_2);
            _jettag_c_if_56_2.doStart(context, out);
            while (_jettag_c_if_56_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_57_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_57_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_c_set_57_3.setTagInfo(_td_c_set_57_3);
                _jettag_c_set_57_3.doStart(context, out);
                JET2Writer _jettag_c_set_57_3_saved_out = out;
                while (_jettag_c_set_57_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_57_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_41); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_41.setRuntimeParent(_jettag_c_set_57_3);
                    _jettag_c_get_57_41.setTagInfo(_td_c_get_57_41);
                    _jettag_c_get_57_41.doStart(context, out);
                    _jettag_c_get_57_41.doEnd();
                    _jettag_c_set_57_3.handleBodyContent(out);
                }
                out = _jettag_c_set_57_3_saved_out;
                _jettag_c_set_57_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_58_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_58_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_58_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_c_set_58_3.setTagInfo(_td_c_set_58_3);
                _jettag_c_set_58_3.doStart(context, out);
                JET2Writer _jettag_c_set_58_3_saved_out = out;
                while (_jettag_c_set_58_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_58_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_58_44.setRuntimeParent(_jettag_c_set_58_3);
                    _jettag_c_get_58_44.setTagInfo(_td_c_get_58_44);
                    _jettag_c_get_58_44.doStart(context, out);
                    _jettag_c_get_58_44.doEnd();
                    RuntimeTagElement _jettag_c_get_58_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_58_82.setRuntimeParent(_jettag_c_set_58_3);
                    _jettag_c_get_58_82.setTagInfo(_td_c_get_58_82);
                    _jettag_c_get_58_82.doStart(context, out);
                    _jettag_c_get_58_82.doEnd();
                    _jettag_c_set_58_3.handleBodyContent(out);
                }
                out = _jettag_c_set_58_3_saved_out;
                _jettag_c_set_58_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_59_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_59_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_59_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_c_set_59_3.setTagInfo(_td_c_set_59_3);
                _jettag_c_set_59_3.doStart(context, out);
                JET2Writer _jettag_c_set_59_3_saved_out = out;
                while (_jettag_c_set_59_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_59_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_59_47.setRuntimeParent(_jettag_c_set_59_3);
                    _jettag_c_get_59_47.setTagInfo(_td_c_get_59_47);
                    _jettag_c_get_59_47.doStart(context, out);
                    _jettag_c_get_59_47.doEnd();
                    RuntimeTagElement _jettag_c_get_59_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_59_85.setRuntimeParent(_jettag_c_set_59_3);
                    _jettag_c_get_59_85.setTagInfo(_td_c_get_59_85);
                    _jettag_c_get_59_85.doStart(context, out);
                    _jettag_c_get_59_85.doEnd();
                    _jettag_c_set_59_3.handleBodyContent(out);
                }
                out = _jettag_c_set_59_3_saved_out;
                _jettag_c_set_59_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_60_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_60_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_60_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_c_set_60_3.setTagInfo(_td_c_set_60_3);
                _jettag_c_set_60_3.doStart(context, out);
                JET2Writer _jettag_c_set_60_3_saved_out = out;
                while (_jettag_c_set_60_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_60_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_51.setRuntimeParent(_jettag_c_set_60_3);
                    _jettag_c_get_60_51.setTagInfo(_td_c_get_60_51);
                    _jettag_c_get_60_51.doStart(context, out);
                    _jettag_c_get_60_51.doEnd();
                    RuntimeTagElement _jettag_c_get_60_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_89.setRuntimeParent(_jettag_c_set_60_3);
                    _jettag_c_get_60_89.setTagInfo(_td_c_get_60_89);
                    _jettag_c_get_60_89.doStart(context, out);
                    _jettag_c_get_60_89.doEnd();
                    _jettag_c_set_60_3.handleBodyContent(out);
                }
                out = _jettag_c_set_60_3_saved_out;
                _jettag_c_set_60_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_61_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_61_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_61_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_ws_file_61_3.setTagInfo(_td_ws_file_61_3);
                _jettag_ws_file_61_3.doStart(context, out);
                _jettag_ws_file_61_3.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_62_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_62_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_62_3.setRuntimeParent(_jettag_c_if_56_2);
                _jettag_ws_file_62_3.setTagInfo(_td_ws_file_62_3);
                _jettag_ws_file_62_3.doStart(context, out);
                _jettag_ws_file_62_3.doEnd();
                out.write(NL);         
                _jettag_c_if_56_2.handleBodyContent(out);
            }
            _jettag_c_if_56_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Request 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_66_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_66_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_66_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_66_2.setTagInfo(_td_c_set_66_2);
            _jettag_c_set_66_2.doStart(context, out);
            JET2Writer _jettag_c_set_66_2_saved_out = out;
            while (_jettag_c_set_66_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_66_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_40.setRuntimeParent(_jettag_c_set_66_2);
                _jettag_c_get_66_40.setTagInfo(_td_c_get_66_40);
                _jettag_c_get_66_40.doStart(context, out);
                _jettag_c_get_66_40.doEnd();
                _jettag_c_set_66_2.handleBodyContent(out);
            }
            out = _jettag_c_set_66_2_saved_out;
            _jettag_c_set_66_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_67_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_67_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_67_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_67_2.setTagInfo(_td_c_set_67_2);
            _jettag_c_set_67_2.doStart(context, out);
            JET2Writer _jettag_c_set_67_2_saved_out = out;
            while (_jettag_c_set_67_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_67_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_43.setRuntimeParent(_jettag_c_set_67_2);
                _jettag_c_get_67_43.setTagInfo(_td_c_get_67_43);
                _jettag_c_get_67_43.doStart(context, out);
                _jettag_c_get_67_43.doEnd();
                RuntimeTagElement _jettag_c_get_67_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_81.setRuntimeParent(_jettag_c_set_67_2);
                _jettag_c_get_67_81.setTagInfo(_td_c_get_67_81);
                _jettag_c_get_67_81.doStart(context, out);
                _jettag_c_get_67_81.doEnd();
                _jettag_c_set_67_2.handleBodyContent(out);
            }
            out = _jettag_c_set_67_2_saved_out;
            _jettag_c_set_67_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_68_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_68_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_68_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_68_2.setTagInfo(_td_c_set_68_2);
            _jettag_c_set_68_2.doStart(context, out);
            JET2Writer _jettag_c_set_68_2_saved_out = out;
            while (_jettag_c_set_68_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_68_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_46.setRuntimeParent(_jettag_c_set_68_2);
                _jettag_c_get_68_46.setTagInfo(_td_c_get_68_46);
                _jettag_c_get_68_46.doStart(context, out);
                _jettag_c_get_68_46.doEnd();
                RuntimeTagElement _jettag_c_get_68_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_68_84.setRuntimeParent(_jettag_c_set_68_2);
                _jettag_c_get_68_84.setTagInfo(_td_c_get_68_84);
                _jettag_c_get_68_84.doStart(context, out);
                _jettag_c_get_68_84.doEnd();
                _jettag_c_set_68_2.handleBodyContent(out);
            }
            out = _jettag_c_set_68_2_saved_out;
            _jettag_c_set_68_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_69_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_69_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_69_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_69_2.setTagInfo(_td_c_set_69_2);
            _jettag_c_set_69_2.doStart(context, out);
            JET2Writer _jettag_c_set_69_2_saved_out = out;
            while (_jettag_c_set_69_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_69_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_50.setRuntimeParent(_jettag_c_set_69_2);
                _jettag_c_get_69_50.setTagInfo(_td_c_get_69_50);
                _jettag_c_get_69_50.doStart(context, out);
                _jettag_c_get_69_50.doEnd();
                RuntimeTagElement _jettag_c_get_69_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_88.setRuntimeParent(_jettag_c_set_69_2);
                _jettag_c_get_69_88.setTagInfo(_td_c_get_69_88);
                _jettag_c_get_69_88.doStart(context, out);
                _jettag_c_get_69_88.doEnd();
                _jettag_c_set_69_2.handleBodyContent(out);
            }
            out = _jettag_c_set_69_2_saved_out;
            _jettag_c_set_69_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_70_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_70_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_70_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_70_2.setTagInfo(_td_ws_file_70_2);
            _jettag_ws_file_70_2.doStart(context, out);
            _jettag_ws_file_70_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_71_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_71_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_71_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_71_2.setTagInfo(_td_ws_file_71_2);
            _jettag_ws_file_71_2.doStart(context, out);
            _jettag_ws_file_71_2.doEnd();
            out.write("   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // Request processor 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_74_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_74_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_74_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_74_2.setTagInfo(_td_c_set_74_2);
            _jettag_c_set_74_2.doStart(context, out);
            JET2Writer _jettag_c_set_74_2_saved_out = out;
            while (_jettag_c_set_74_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_74_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_74_40.setRuntimeParent(_jettag_c_set_74_2);
                _jettag_c_get_74_40.setTagInfo(_td_c_get_74_40);
                _jettag_c_get_74_40.doStart(context, out);
                _jettag_c_get_74_40.doEnd();
                _jettag_c_set_74_2.handleBodyContent(out);
            }
            out = _jettag_c_set_74_2_saved_out;
            _jettag_c_set_74_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_75_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_75_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_75_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_75_2.setTagInfo(_td_c_set_75_2);
            _jettag_c_set_75_2.doStart(context, out);
            JET2Writer _jettag_c_set_75_2_saved_out = out;
            while (_jettag_c_set_75_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_75_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_43.setRuntimeParent(_jettag_c_set_75_2);
                _jettag_c_get_75_43.setTagInfo(_td_c_get_75_43);
                _jettag_c_get_75_43.doStart(context, out);
                _jettag_c_get_75_43.doEnd();
                RuntimeTagElement _jettag_c_get_75_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_81.setRuntimeParent(_jettag_c_set_75_2);
                _jettag_c_get_75_81.setTagInfo(_td_c_get_75_81);
                _jettag_c_get_75_81.doStart(context, out);
                _jettag_c_get_75_81.doEnd();
                _jettag_c_set_75_2.handleBodyContent(out);
            }
            out = _jettag_c_set_75_2_saved_out;
            _jettag_c_set_75_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_76_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_76_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_76_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_76_2.setTagInfo(_td_c_set_76_2);
            _jettag_c_set_76_2.doStart(context, out);
            JET2Writer _jettag_c_set_76_2_saved_out = out;
            while (_jettag_c_set_76_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_76_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_46.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_46.setTagInfo(_td_c_get_76_46);
                _jettag_c_get_76_46.doStart(context, out);
                _jettag_c_get_76_46.doEnd();
                RuntimeTagElement _jettag_c_get_76_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_76_84.setRuntimeParent(_jettag_c_set_76_2);
                _jettag_c_get_76_84.setTagInfo(_td_c_get_76_84);
                _jettag_c_get_76_84.doStart(context, out);
                _jettag_c_get_76_84.doEnd();
                _jettag_c_set_76_2.handleBodyContent(out);
            }
            out = _jettag_c_set_76_2_saved_out;
            _jettag_c_set_76_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_77_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_77_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_77_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_c_set_77_2.setTagInfo(_td_c_set_77_2);
            _jettag_c_set_77_2.doStart(context, out);
            JET2Writer _jettag_c_set_77_2_saved_out = out;
            while (_jettag_c_set_77_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_77_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_50.setRuntimeParent(_jettag_c_set_77_2);
                _jettag_c_get_77_50.setTagInfo(_td_c_get_77_50);
                _jettag_c_get_77_50.doStart(context, out);
                _jettag_c_get_77_50.doEnd();
                RuntimeTagElement _jettag_c_get_77_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_88.setRuntimeParent(_jettag_c_set_77_2);
                _jettag_c_get_77_88.setTagInfo(_td_c_get_77_88);
                _jettag_c_get_77_88.doStart(context, out);
                _jettag_c_get_77_88.doEnd();
                _jettag_c_set_77_2.handleBodyContent(out);
            }
            out = _jettag_c_set_77_2_saved_out;
            _jettag_c_set_77_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_78_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_78_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_78_2.setRuntimeParent(_jettag_ws_project_44_1);
            _jettag_ws_file_78_2.setTagInfo(_td_ws_file_78_2);
            _jettag_ws_file_78_2.doStart(context, out);
            _jettag_ws_file_78_2.doEnd();
            out.write(NL);         
            _jettag_ws_project_44_1.handleBodyContent(out);
        }
        _jettag_ws_project_44_1.doEnd();
    }
}
