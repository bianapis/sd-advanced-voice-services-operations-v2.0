package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord
 */
public class CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord   {
  private String voiceChannelOperatingSessionInstanceReportReference = null;

  private String voiceChannelOperatingSessionInstanceReportType = null;

  private String voiceChannelOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return voiceChannelOperatingSessionInstanceReportReference
  **/

  public String getVoiceChannelOperatingSessionInstanceReportReference() {
    return voiceChannelOperatingSessionInstanceReportReference;
  }

  public void setVoiceChannelOperatingSessionInstanceReportReference(String voiceChannelOperatingSessionInstanceReportReference) {
    this.voiceChannelOperatingSessionInstanceReportReference = voiceChannelOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return voiceChannelOperatingSessionInstanceReportType
  **/

  public String getVoiceChannelOperatingSessionInstanceReportType() {
    return voiceChannelOperatingSessionInstanceReportType;
  }

  public void setVoiceChannelOperatingSessionInstanceReportType(String voiceChannelOperatingSessionInstanceReportType) {
    this.voiceChannelOperatingSessionInstanceReportType = voiceChannelOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return voiceChannelOperatingSessionInstanceReportParameters
  **/

  public String getVoiceChannelOperatingSessionInstanceReportParameters() {
    return voiceChannelOperatingSessionInstanceReportParameters;
  }

  public void setVoiceChannelOperatingSessionInstanceReportParameters(String voiceChannelOperatingSessionInstanceReportParameters) {
    this.voiceChannelOperatingSessionInstanceReportParameters = voiceChannelOperatingSessionInstanceReportParameters;
  }


}

