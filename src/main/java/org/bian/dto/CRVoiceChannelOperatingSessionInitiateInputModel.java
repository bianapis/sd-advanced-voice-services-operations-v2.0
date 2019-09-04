package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionInitiateInputModel
 */
public class CRVoiceChannelOperatingSessionInitiateInputModel   {
  private String advancedVoiceServicesOperationsServicingSessionReference = null;

  private Object voiceChannelOperatingSessionInitiateActionRecord = null;

  private String voiceChannelOperatingSessionInstanceStatus = null;

  private CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return voiceChannelOperatingSessionInitiateActionRecord
  **/

  public Object getVoiceChannelOperatingSessionInitiateActionRecord() {
    return voiceChannelOperatingSessionInitiateActionRecord;
  }

  public void setVoiceChannelOperatingSessionInitiateActionRecord(Object voiceChannelOperatingSessionInitiateActionRecord) {
    this.voiceChannelOperatingSessionInitiateActionRecord = voiceChannelOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Voice Channel Operating Session instance (e.g. initialised, pending, active) 
   * @return voiceChannelOperatingSessionInstanceStatus
  **/

  public String getVoiceChannelOperatingSessionInstanceStatus() {
    return voiceChannelOperatingSessionInstanceStatus;
  }

  public void setVoiceChannelOperatingSessionInstanceStatus(String voiceChannelOperatingSessionInstanceStatus) {
    this.voiceChannelOperatingSessionInstanceStatus = voiceChannelOperatingSessionInstanceStatus;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


}

