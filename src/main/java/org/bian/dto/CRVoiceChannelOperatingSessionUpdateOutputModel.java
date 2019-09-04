package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionUpdateOutputModel
 */
public class CRVoiceChannelOperatingSessionUpdateOutputModel   {
  private CRVoiceChannelOperatingSessionUpdateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private String voiceChannelOperatingSessionUpdateActionTaskReference = null;

  private Object voiceChannelOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return voiceChannelOperatingSessionUpdateActionTaskReference
  **/

  public String getVoiceChannelOperatingSessionUpdateActionTaskReference() {
    return voiceChannelOperatingSessionUpdateActionTaskReference;
  }

  public void setVoiceChannelOperatingSessionUpdateActionTaskReference(String voiceChannelOperatingSessionUpdateActionTaskReference) {
    this.voiceChannelOperatingSessionUpdateActionTaskReference = voiceChannelOperatingSessionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

