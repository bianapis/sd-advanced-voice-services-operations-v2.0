package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelInboundInstanceRecord
 */
public class BQInboundInitiateInputModelInboundInstanceRecord   {
  private String vChannelDeviceReference = null;

  private String vChannelDevicePropertyValue = null;

  private String vChannelInboundConnectionContactReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Details of the device being used for access 
   * @return vChannelDeviceReference
  **/

  public String getVChannelDeviceReference() {
    return vChannelDeviceReference;
  }

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

  public void setVChannelDevicePropertyValue(String vChannelDevicePropertyValue) {
    this.vChannelDevicePropertyValue = vChannelDevicePropertyValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Internal reference retuned by Service Domain-Contact Handler for routing  
   * @return vChannelInboundConnectionContactReference
  **/

  public String getVChannelInboundConnectionContactReference() {
    return vChannelInboundConnectionContactReference;
  }

  public void setVChannelInboundConnectionContactReference(String vChannelInboundConnectionContactReference) {
    this.vChannelInboundConnectionContactReference = vChannelInboundConnectionContactReference;
  }


}

