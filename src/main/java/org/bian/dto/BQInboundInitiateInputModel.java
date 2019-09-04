package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateInputModelInboundInstanceRecord;
import org.bian.dto.BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModel
 */
public class BQInboundInitiateInputModel   {
  private BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private String voiceChannelOperatingSessionInstanceReference = null;

  private Object inboundInitiateActionRecord = null;

  private BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord = null;


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Voice Channel Operating Session instance 
   * @return voiceChannelOperatingSessionInstanceReference
  **/

  public String getVoiceChannelOperatingSessionInstanceReference() {
    return voiceChannelOperatingSessionInstanceReference;
  }

  public void setVoiceChannelOperatingSessionInstanceReference(String voiceChannelOperatingSessionInstanceReference) {
    this.voiceChannelOperatingSessionInstanceReference = voiceChannelOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return inboundInitiateActionRecord
  **/

  public Object getInboundInitiateActionRecord() {
    return inboundInitiateActionRecord;
  }

  public void setInboundInitiateActionRecord(Object inboundInitiateActionRecord) {
    this.inboundInitiateActionRecord = inboundInitiateActionRecord;
  }


  /**
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundInitiateInputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundInitiateInputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


}

