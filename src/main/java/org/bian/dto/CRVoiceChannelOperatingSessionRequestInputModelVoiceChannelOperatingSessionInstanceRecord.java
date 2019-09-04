package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecord   {
  private CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord = null;


  /**
   * Get vChannelProductionIssueRecord
   * @return vChannelProductionIssueRecord
  **/

  public CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord getVChannelProductionIssueRecord() {
    return vChannelProductionIssueRecord;
  }

  public void setVChannelProductionIssueRecord(CRVoiceChannelOperatingSessionRequestInputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord) {
    this.vChannelProductionIssueRecord = vChannelProductionIssueRecord;
  }


}

