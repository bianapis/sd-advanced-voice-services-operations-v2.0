/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AdvancedVoiceServicesOperationsApiServiceImpl implements AdvancedVoiceServicesOperationsApiService {

	public SDAdvancedVoiceServicesOperationsActivateOutputModel activate(SDAdvancedVoiceServicesOperationsActivateInputModel request){
		return JsonReader.read("activate-SDAdvancedVoiceServicesOperationsActivateOutputModel.json",new TypeReference<SDAdvancedVoiceServicesOperationsActivateOutputModel>(){});
	}
	
	public SDAdvancedVoiceServicesOperationsConfigureOutputModel configure(String sdReferenceId, SDAdvancedVoiceServicesOperationsConfigureInputModel request){
		return JsonReader.read("configure-SDAdvancedVoiceServicesOperationsConfigureOutputModel.json",new TypeReference<SDAdvancedVoiceServicesOperationsConfigureOutputModel>(){});
	}
	
	public CRVoiceChannelOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRVoiceChannelOperatingSessionControlOutputModel.json",new TypeReference<CRVoiceChannelOperatingSessionControlOutputModel>(){});
	}
	
	public SDAdvancedVoiceServicesOperationsFeedbackOutputModel feedback(String sdReferenceId, SDAdvancedVoiceServicesOperationsFeedbackInputModel request){
		return JsonReader.read("feedback-SDAdvancedVoiceServicesOperationsFeedbackOutputModel.json",new TypeReference<SDAdvancedVoiceServicesOperationsFeedbackOutputModel>(){});
	}
	
	public CRVoiceChannelOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRVoiceChannelOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRVoiceChannelOperatingSessionInitiateOutputModel.json",new TypeReference<CRVoiceChannelOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request){
		return JsonReader.read("initiate-BQInboundInitiateOutputModel.json",new TypeReference<BQInboundInitiateOutputModel>(){});
	}
	
	public BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundInitiateOutputModel.json",new TypeReference<BQOutboundInitiateOutputModel>(){});
	}
	
	public CRVoiceChannelOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRVoiceChannelOperatingSessionRequestOutputModel.json",new TypeReference<CRVoiceChannelOperatingSessionRequestOutputModel>(){});
	}
	
	public CRVoiceChannelOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRVoiceChannelOperatingSessionRetrieveOutputModel.json",new TypeReference<CRVoiceChannelOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDAdvancedVoiceServicesOperationsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAdvancedVoiceServicesOperationsRetrieveOutputModel.json",new TypeReference<SDAdvancedVoiceServicesOperationsRetrieveOutputModel>(){});
	}
	
	public BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundRetrieveOutputModel.json",new TypeReference<BQInboundRetrieveOutputModel>(){});
	}
	
	public BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundRetrieveOutputModel.json",new TypeReference<BQOutboundRetrieveOutputModel>(){});
	}
	
	public CRVoiceChannelOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRVoiceChannelOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRVoiceChannelOperatingSessionUpdateOutputModel.json",new TypeReference<CRVoiceChannelOperatingSessionUpdateOutputModel>(){});
	}
	
}
