package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionUpdateInputModel
 */
public class CRVoiceChannelOperatingSessionUpdateInputModel   {
  private String advancedVoiceServicesOperationsServicingSessionReference = null;

  private String voiceChannelOperatingSessionInstanceReference = null;

  private CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private Object voiceChannelOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return advancedVoiceServicesOperationsServicingSessionReference
  **/

  public String getAdvancedVoiceServicesOperationsServicingSessionReference() {
    return advancedVoiceServicesOperationsServicingSessionReference;
  }

  public void setAdvancedVoiceServicesOperationsServicingSessionReference(String advancedVoiceServicesOperationsServicingSessionReference) {
    this.advancedVoiceServicesOperationsServicingSessionReference = advancedVoiceServicesOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Voice Channel Operating Session instance 
   * @return voiceChannelOperatingSessionInstanceReference
  **/

  public String getVoiceChannelOperatingSessionInstanceReference() {
    return voiceChannelOperatingSessionInstanceReference;
  }

  public void setVoiceChannelOperatingSessionInstanceReference(String voiceChannelOperatingSessionInstanceReference) {
    this.voiceChannelOperatingSessionInstanceReference = voiceChannelOperatingSessionInstanceReference;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return voiceChannelOperatingSessionUpdateActionTaskRecord
  **/

  public Object getVoiceChannelOperatingSessionUpdateActionTaskRecord() {
    return voiceChannelOperatingSessionUpdateActionTaskRecord;
  }

  public void setVoiceChannelOperatingSessionUpdateActionTaskRecord(Object voiceChannelOperatingSessionUpdateActionTaskRecord) {
    this.voiceChannelOperatingSessionUpdateActionTaskRecord = voiceChannelOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

