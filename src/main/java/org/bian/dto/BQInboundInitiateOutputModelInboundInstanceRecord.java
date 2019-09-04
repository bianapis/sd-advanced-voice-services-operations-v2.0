package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModelInboundInstanceRecord
 */
public class BQInboundInitiateOutputModelInboundInstanceRecord   {
  private String vChannelInboundConnectionStartTime = null;

  private String vChannelInboundConnectionDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Detail used for statistics 
   * @return vChannelInboundConnectionStartTime
  **/

  public String getVChannelInboundConnectionStartTime() {
    return vChannelInboundConnectionStartTime;
  }

  @JsonProperty("vChannelInboundConnectionStartTime")
  public void setVChannelInboundConnectionStartTime(String vChannelInboundConnectionStartTime) {
    this.vChannelInboundConnectionStartTime = vChannelInboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detain used for statistics 
   * @return vChannelInboundConnectionDuration
  **/

  public String getVChannelInboundConnectionDuration() {
    return vChannelInboundConnectionDuration;
  }

  @JsonProperty("vChannelInboundConnectionDuration")
  public void setVChannelInboundConnectionDuration(String vChannelInboundConnectionDuration) {
    this.vChannelInboundConnectionDuration = vChannelInboundConnectionDuration;
  }


}

