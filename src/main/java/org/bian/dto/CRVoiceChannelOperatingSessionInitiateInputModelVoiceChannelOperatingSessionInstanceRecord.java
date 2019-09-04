package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecord   {
  private String advancedVoiceServicesOperationsServiceMenu = null;

  private String vChannelServiceSessionReportType = null;

  private CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return vChannelServiceSessionReportType
  **/

  public String getVChannelServiceSessionReportType() {
    return vChannelServiceSessionReportType;
  }

  public void setVChannelServiceSessionReportType(String vChannelServiceSessionReportType) {
    this.vChannelServiceSessionReportType = vChannelServiceSessionReportType;
  }


  /**
   * Get vChannelProductionIssueRecord
   * @return vChannelProductionIssueRecord
  **/

  public CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord getVChannelProductionIssueRecord() {
    return vChannelProductionIssueRecord;
  }

  public void setVChannelProductionIssueRecord(CRVoiceChannelOperatingSessionInitiateInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord) {
    this.vChannelProductionIssueRecord = vChannelProductionIssueRecord;
  }


}

