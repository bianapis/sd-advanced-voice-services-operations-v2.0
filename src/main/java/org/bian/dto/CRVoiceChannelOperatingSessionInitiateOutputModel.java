package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionInitiateOutputModel
 */
public class CRVoiceChannelOperatingSessionInitiateOutputModel   {
  private String voiceChannelOperatingSessionInstanceReference = null;

  private String voiceChannelOperatingSessionInitiateActionReference = null;

  private Object voiceChannelOperatingSessionInitiateActionRecord = null;

  private String voiceChannelOperatingSessionInstanceStatus = null;

  private CRVoiceChannelOperatingSessionInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return voiceChannelOperatingSessionInitiateActionReference
  **/

  public String getVoiceChannelOperatingSessionInitiateActionReference() {
    return voiceChannelOperatingSessionInitiateActionReference;
  }

  public void setVoiceChannelOperatingSessionInitiateActionReference(String voiceChannelOperatingSessionInitiateActionReference) {
    this.voiceChannelOperatingSessionInitiateActionReference = voiceChannelOperatingSessionInitiateActionReference;
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

  public CRVoiceChannelOperatingSessionInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


}

