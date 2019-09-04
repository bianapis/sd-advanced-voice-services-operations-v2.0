/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AdvancedVoiceServicesOperationsApiService {

	SDAdvancedVoiceServicesOperationsActivateOutputModel activate(SDAdvancedVoiceServicesOperationsActivateInputModel request);
	
	SDAdvancedVoiceServicesOperationsConfigureOutputModel configure(String sdReferenceId, SDAdvancedVoiceServicesOperationsConfigureInputModel request);
	
	CRVoiceChannelOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionControlInputModel request);
	
	SDAdvancedVoiceServicesOperationsFeedbackOutputModel feedback(String sdReferenceId, SDAdvancedVoiceServicesOperationsFeedbackInputModel request);
	
	CRVoiceChannelOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRVoiceChannelOperatingSessionInitiateInputModel request);
	
	BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request);
	
	BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request);
	
	CRVoiceChannelOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionRequestInputModel request);
	
	CRVoiceChannelOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDAdvancedVoiceServicesOperationsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRVoiceChannelOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionUpdateInputModel request);
	
}
