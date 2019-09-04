package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord   {
  private String advancedVoiceServicesOperationsServiceMenu = null;

  private String vChannelServiceSessionStatistics = null;

  private String vChannelServiceSessionReportType = null;

  private Object vChannelServiceSessionReport = null;

  private CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service Domain attribute referenced during the session covering the menu options 
   * @return advancedVoiceServicesOperationsServiceMenu
  **/

  public String getAdvancedVoiceServicesOperationsServiceMenu() {
    return advancedVoiceServicesOperationsServiceMenu;
  }

  
  public void setAdvancedVoiceServicesOperationsServiceMenu(String advancedVoiceServicesOperationsServiceMenu) {
    this.advancedVoiceServicesOperationsServiceMenu = advancedVoiceServicesOperationsServiceMenu;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session 
   * @return vChannelServiceSessionStatistics
  **/

  public String getVChannelServiceSessionStatistics() {
    return vChannelServiceSessionStatistics;
  }

  @JsonProperty("vChannelServiceSessionStatistics")
  public void setVChannelServiceSessionStatistics(String vChannelServiceSessionStatistics) {
    this.vChannelServiceSessionStatistics = vChannelServiceSessionStatistics;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return vChannelServiceSessionReportType
  **/

  public String getVChannelServiceSessionReportType() {
    return vChannelServiceSessionReportType;
  }

  @JsonProperty("vChannelServiceSessionReportType")
  public void setVChannelServiceSessionReportType(String vChannelServiceSessionReportType) {
    this.vChannelServiceSessionReportType = vChannelServiceSessionReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session activity report 
   * @return vChannelServiceSessionReport
  **/

  public Object getVChannelServiceSessionReport() {
    return vChannelServiceSessionReport;
  }

  @JsonProperty("vChannelServiceSessionReport")
  public void setVChannelServiceSessionReport(Object vChannelServiceSessionReport) {
    this.vChannelServiceSessionReport = vChannelServiceSessionReport;
  }


  /**
   * Get vChannelProductionIssueRecord
   * @return vChannelProductionIssueRecord
  **/

  public CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord getVChannelProductionIssueRecord() {
    return vChannelProductionIssueRecord;
  }

  @JsonProperty("vChannelProductionIssueRecord")
  public void setVChannelProductionIssueRecord(CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord) {
    this.vChannelProductionIssueRecord = vChannelProductionIssueRecord;
  }


}

