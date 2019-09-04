package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionControlInputModelVoiceChannelOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionControlInputModel
 */
public class CRVoiceChannelOperatingSessionControlInputModel   {
  private String advancedVoiceServicesOperationsServicingSessionReference = null;

  private String voiceChannelOperatingSessionInstanceReference = null;

  private Object voiceChannelOperatingSessionControlActionTaskRecord = null;

  private CRVoiceChannelOperatingSessionControlInputModelVoiceChannelOperatingSessionControlActionRequest voiceChannelOperatingSessionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return voiceChannelOperatingSessionControlActionTaskRecord
  **/

  public Object getVoiceChannelOperatingSessionControlActionTaskRecord() {
    return voiceChannelOperatingSessionControlActionTaskRecord;
  }

  public void setVoiceChannelOperatingSessionControlActionTaskRecord(Object voiceChannelOperatingSessionControlActionTaskRecord) {
    this.voiceChannelOperatingSessionControlActionTaskRecord = voiceChannelOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get voiceChannelOperatingSessionControlActionRequest
   * @return voiceChannelOperatingSessionControlActionRequest
  **/

  public CRVoiceChannelOperatingSessionControlInputModelVoiceChannelOperatingSessionControlActionRequest getVoiceChannelOperatingSessionControlActionRequest() {
    return voiceChannelOperatingSessionControlActionRequest;
  }

  public void setVoiceChannelOperatingSessionControlActionRequest(CRVoiceChannelOperatingSessionControlInputModelVoiceChannelOperatingSessionControlActionRequest voiceChannelOperatingSessionControlActionRequest) {
    this.voiceChannelOperatingSessionControlActionRequest = voiceChannelOperatingSessionControlActionRequest;
  }


}

