package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveOutputModelOutboundInstanceRecord
 */
public class BQOutboundRetrieveOutputModelOutboundInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private Object customerContactDialogueRecord = null;

  private String vChannelCustomerDeviceReference = null;

  private String vChannelOutboundConnectionStartTime = null;

  private String vChannelOutboundConnectionDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The source of the outbound connection request 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer contact record used accessing outbound channel 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The target device being accessed 
   * @return vChannelCustomerDeviceReference
  **/

  public String getVChannelCustomerDeviceReference() {
    return vChannelCustomerDeviceReference;
  }

  @JsonProperty("vChannelCustomerDeviceReference")
  public void setVChannelCustomerDeviceReference(String vChannelCustomerDeviceReference) {
    this.vChannelCustomerDeviceReference = vChannelCustomerDeviceReference;
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

