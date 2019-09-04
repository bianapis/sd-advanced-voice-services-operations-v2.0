package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord
 */
public class CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord   {
  private String voiceChannelOperatingSessionInstanceReportData = null;

  private String voiceChannelOperatingSessionInstanceReportType = null;

  private Object voiceChannelOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return voiceChannelOperatingSessionInstanceReportData
  **/

  public String getVoiceChannelOperatingSessionInstanceReportData() {
    return voiceChannelOperatingSessionInstanceReportData;
  }

  public void setVoiceChannelOperatingSessionInstanceReportData(String voiceChannelOperatingSessionInstanceReportData) {
    this.voiceChannelOperatingSessionInstanceReportData = voiceChannelOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return voiceChannelOperatingSessionInstanceReport
  **/

  public Object getVoiceChannelOperatingSessionInstanceReport() {
    return voiceChannelOperatingSessionInstanceReport;
  }

  public void setVoiceChannelOperatingSessionInstanceReport(Object voiceChannelOperatingSessionInstanceReport) {
    this.voiceChannelOperatingSessionInstanceReport = voiceChannelOperatingSessionInstanceReport;
  }


}

