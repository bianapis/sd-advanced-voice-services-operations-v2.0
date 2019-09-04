package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis
 */
public class CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis   {
  private String voiceChannelOperatingSessionInstanceAnalysisData = null;

  private String voiceChannelOperatingSessionInstanceAnalysisReportType = null;

  private Object voiceChannelOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return voiceChannelOperatingSessionInstanceAnalysisData
  **/

  public String getVoiceChannelOperatingSessionInstanceAnalysisData() {
    return voiceChannelOperatingSessionInstanceAnalysisData;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysisData(String voiceChannelOperatingSessionInstanceAnalysisData) {
    this.voiceChannelOperatingSessionInstanceAnalysisData = voiceChannelOperatingSessionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return voiceChannelOperatingSessionInstanceAnalysisReport
  **/

  public Object getVoiceChannelOperatingSessionInstanceAnalysisReport() {
    return voiceChannelOperatingSessionInstanceAnalysisReport;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysisReport(Object voiceChannelOperatingSessionInstanceAnalysisReport) {
    this.voiceChannelOperatingSessionInstanceAnalysisReport = voiceChannelOperatingSessionInstanceAnalysisReport;
  }


}

