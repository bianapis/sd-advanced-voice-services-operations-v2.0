package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelInboundInstanceRecord
 */
public class BQInboundRetrieveOutputModelInboundInstanceRecord   {
  private String vChannelDeviceReference = null;

  private String vChannelDevicePropertyValue = null;

  private String vChannelInboundConnectionStartTime = null;

  private String vChannelInboundConnectionDuration = null;

  private String vChannelInboundConnectionContactReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Details of the device being used for access 
   * @return vChannelDeviceReference
  **/

  public String getVChannelDeviceReference() {
    return vChannelDeviceReference;
  }

  @JsonProperty("vChannelDeviceReference")
  public void setVChannelDeviceReference(String vChannelDeviceReference) {
    this.vChannelDeviceReference = vChannelDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Property of the device that can be used in identification ( e.g. ANI phone number) 
   * @return vChannelDevicePropertyValue
  **/

  public String getVChannelDevicePropertyValue() {
    return vChannelDevicePropertyValue;
  }

  @JsonProperty("vChannelDevicePropertyValue")
  public void setVChannelDevicePropertyValue(String vChannelDevicePropertyValue) {
    this.vChannelDevicePropertyValue = vChannelDevicePropertyValue;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Internal reference retuned by Service Domain-Contact Handler for routing  
   * @return vChannelInboundConnectionContactReference
  **/

  public String getVChannelInboundConnectionContactReference() {
    return vChannelInboundConnectionContactReference;
  }

  @JsonProperty("vChannelInboundConnectionContactReference")
  public void setVChannelInboundConnectionContactReference(String vChannelInboundConnectionContactReference) {
    this.vChannelInboundConnectionContactReference = vChannelInboundConnectionContactReference;
  }


}

