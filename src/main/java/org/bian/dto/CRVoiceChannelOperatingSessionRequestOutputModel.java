package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRequestOutputModel
 */
public class CRVoiceChannelOperatingSessionRequestOutputModel   {
  private CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private String voiceChannelOperatingSessionRequestActionTaskReference = null;

  private Object voiceChannelOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Operating Session instance request service call 
   * @return voiceChannelOperatingSessionRequestActionTaskReference
  **/

  public String getVoiceChannelOperatingSessionRequestActionTaskReference() {
    return voiceChannelOperatingSessionRequestActionTaskReference;
  }

  public void setVoiceChannelOperatingSessionRequestActionTaskReference(String voiceChannelOperatingSessionRequestActionTaskReference) {
    this.voiceChannelOperatingSessionRequestActionTaskReference = voiceChannelOperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return voiceChannelOperatingSessionRequestActionTaskRecord
  **/

  public Object getVoiceChannelOperatingSessionRequestActionTaskRecord() {
    return voiceChannelOperatingSessionRequestActionTaskRecord;
  }

  public void setVoiceChannelOperatingSessionRequestActionTaskRecord(Object voiceChannelOperatingSessionRequestActionTaskRecord) {
    this.voiceChannelOperatingSessionRequestActionTaskRecord = voiceChannelOperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

