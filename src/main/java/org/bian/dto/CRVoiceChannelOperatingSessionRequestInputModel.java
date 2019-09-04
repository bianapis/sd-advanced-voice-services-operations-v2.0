package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRequestInputModelRequestRecordType;
import org.bian.dto.CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRequestInputModel
 */
public class CRVoiceChannelOperatingSessionRequestInputModel   {
  private String advancedVoiceServicesOperationsServicingSessionReference = null;

  private String voiceChannelOperatingSessionInstanceReference = null;

  private CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private Object voiceChannelOperatingSessionRequestActionTaskRecord = null;

  private CRVoiceChannelOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRVoiceChannelOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRVoiceChannelOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

