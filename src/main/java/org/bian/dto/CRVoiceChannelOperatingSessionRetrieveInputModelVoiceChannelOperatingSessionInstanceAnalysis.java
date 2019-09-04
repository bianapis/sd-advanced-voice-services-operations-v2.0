package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis
 */
public class CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis   {
  private String voiceChannelOperatingSessionInstanceAnalysisReference = null;

  private String voiceChannelOperatingSessionInstanceAnalysisReportType = null;

  private String voiceChannelOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return voiceChannelOperatingSessionInstanceAnalysisReference
  **/

  public String getVoiceChannelOperatingSessionInstanceAnalysisReference() {
    return voiceChannelOperatingSessionInstanceAnalysisReference;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysisReference(String voiceChannelOperatingSessionInstanceAnalysisReference) {
    this.voiceChannelOperatingSessionInstanceAnalysisReference = voiceChannelOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return voiceChannelOperatingSessionInstanceAnalysisReportType
  **/

  public String getVoiceChannelOperatingSessionInstanceAnalysisReportType() {
    return voiceChannelOperatingSessionInstanceAnalysisReportType;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysisReportType(String voiceChannelOperatingSessionInstanceAnalysisReportType) {
    this.voiceChannelOperatingSessionInstanceAnalysisReportType = voiceChannelOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return voiceChannelOperatingSessionInstanceAnalysisParameters
  **/

  public String getVoiceChannelOperatingSessionInstanceAnalysisParameters() {
    return voiceChannelOperatingSessionInstanceAnalysisParameters;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysisParameters(String voiceChannelOperatingSessionInstanceAnalysisParameters) {
    this.voiceChannelOperatingSessionInstanceAnalysisParameters = voiceChannelOperatingSessionInstanceAnalysisParameters;
  }


}

