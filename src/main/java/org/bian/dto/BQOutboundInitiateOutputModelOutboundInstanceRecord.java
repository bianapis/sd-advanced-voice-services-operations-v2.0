package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateOutputModelOutboundInstanceRecord   {
  private Object customerContactDialogueRecord = null;

  private String vChannelOutboundConnectionStartTime = null;

  private String vChannelOutboundConnectionDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record used to handle the contact (see Service Domain-Contact Handler for complete definition) 
   * @return customerContactDialogueRecord
  **/

  public Object getCustomerContactDialogueRecord() {
    return customerContactDialogueRecord;
  }

  public void setCustomerContactDialogueRecord(Object customerContactDialogueRecord) {
    this.customerContactDialogueRecord = customerContactDialogueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Detail used for statistics 
   * @return vChannelOutboundConnectionStartTime
  **/

  public String getVChannelOutboundConnectionStartTime() {
    return vChannelOutboundConnectionStartTime;
  }

  @JsonProperty("vChannelOutboundConnectionStartTime")
  public void setVChannelOutboundConnectionStartTime(String vChannelOutboundConnectionStartTime) {
    this.vChannelOutboundConnectionStartTime = vChannelOutboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detail used for statistics 
   * @return vChannelOutboundConnectionDuration
  **/

  public String getVChannelOutboundConnectionDuration() {
    return vChannelOutboundConnectionDuration;
  }

  @JsonProperty("vChannelOutboundConnectionDuration")
  public void setVChannelOutboundConnectionDuration(String vChannelOutboundConnectionDuration) {
    this.vChannelOutboundConnectionDuration = vChannelOutboundConnectionDuration;
  }


}

