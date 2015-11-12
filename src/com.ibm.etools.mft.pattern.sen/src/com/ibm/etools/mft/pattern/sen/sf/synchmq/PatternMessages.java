/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.sen.sf.synchmq;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.sen.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.sen.sf.synchmq.messages"; //$NON-NLS-1$
	private static final String[] enumerations = { "MQEI_UNLIMITED" }; //$NON-NLS-1$
	private static final Map<String, String> map;	

	public static String getStringStatic(String key) {
		return map.get(key);
	}
	
	public String getString(String key) {
		return map.get(key);
	}
	
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_instanceName;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_patternLevel;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_patternLevel_description;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_inputInformation;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_inputInformation_description;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_responseInformation;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_responseInformation_description;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_providerInformation;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_providerInformation_description;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_log; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_log_description; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_errorHandling; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_group_errorHandling_description; 

	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_instanceName_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_deployableServiceWsdl_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_responseQueue_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_storeQueue_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_expiryofStoreQueueMessages_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_providerRequestQueue_watermark;	
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_logQueue_watermark;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_errorQueue_watermark;

	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_1;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_2;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_3;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_4;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_5;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_6;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_esql_8;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_jet_1;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_jet_2;
	
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_1;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_2;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_3;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_5;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_6;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_7;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_8;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_9;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_10;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_11;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_12;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_13;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_14;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_14_queueManager;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_15;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_15_queueManager;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_16;  
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_16_queueManager;  
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_22;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_25;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_26;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_27; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_28;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_29;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_30;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_31;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_32;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_33;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_34;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_summary_35;

	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_validationEnum_none;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_validationEnum_contentAndValue;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_responseTimeEnum_MQEI_UNLIMITED;

	// Pattern level
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_instanceName;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_instanceName_default;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_brokerSchema; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_flowPrefix;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_flowSuffix;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_queuePrefix;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_queueSuffix;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_shortDescription; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_shortDescription_default;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_longDescription; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_longDescription_default;

	// Input information 			
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_deployableServiceWsdl;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_validationofSOAPRequest;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_validationofSOAPResponse;
				
	// Response information 	
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_responseQueue;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_storeQueue;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_expiryofStoreQueueMessages;
			    
	// Provider information 			
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_providerRequestQueueManager; 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_providerRequestQueue;
				
	// Logging and error handling 
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_loggingRequired;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_loggingRequired_default;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_logQueueManager;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_logQueue;
	
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_errorMessageRequired;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_errorMessageRequired_default;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_errorQueueManager;
	public static String com_ibm_etools_mft_pattern_sen_sf_synchmq_pov_root_errorQueue;
					
	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);		
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}
