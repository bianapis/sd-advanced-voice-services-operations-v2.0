package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionControlOutputModel
 */
public class CRVoiceChannelOperatingSessionControlOutputModel   {
  private String voiceChannelOperatingSessionControlActionTaskReference = null;

  private Object voiceChannelOperatingSessionControlActionTaskRecord = null;

  private String voiceChannelOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Operating Session instance control processing service call 
   * @return voiceChannelOperatingSessionControlActionTaskReference
  **/

  public String getVoiceChannelOperatingSessionControlActionTaskReference() {
    return voiceChannelOperatingSessionControlActionTaskReference;
  }

  public void setVoiceChannelOperatingSessionControlActionTaskReference(String voiceChannelOperatingSessionControlActionTaskReference) {
    this.voiceChannelOperatingSessionControlActionTaskReference = voiceChannelOperatingSessionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return voiceChannelOperatingSessionControlActionResponse
  **/

  public String getVoiceChannelOperatingSessionControlActionResponse() {
    return voiceChannelOperatingSessionControlActionResponse;
  }

  public void setVoiceChannelOperatingSessionControlActionResponse(String voiceChannelOperatingSessionControlActionResponse) {
    this.voiceChannelOperatingSessionControlActionResponse = voiceChannelOperatingSessionControlActionResponse;
  }


}

