package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateInputModel
 */
public class BQOutboundInitiateInputModel   {
  private BQInboundInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private String voiceChannelOperatingSessionInstanceReference = null;

  private Object outboundInitiateActionRecord = null;

  private BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord = null;


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(BQInboundInitiateOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
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
   * @return outboundInitiateActionRecord
  **/

  public Object getOutboundInitiateActionRecord() {
    return outboundInitiateActionRecord;
  }

  public void setOutboundInitiateActionRecord(Object outboundInitiateActionRecord) {
    this.outboundInitiateActionRecord = outboundInitiateActionRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundInitiateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


}

