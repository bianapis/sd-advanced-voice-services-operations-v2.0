package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecord   {
  private CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord = null;


  /**
   * Get vChannelProductionIssueRecord
   * @return vChannelProductionIssueRecord
  **/

  public CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord getVChannelProductionIssueRecord() {
    return vChannelProductionIssueRecord;
  }

  @JsonProperty("vChannelProductionIssueRecord")
  public void setVChannelProductionIssueRecord(CRVoiceChannelOperatingSessionRequestOutputModelVoiceChannelOperatingSessionInstanceRecordVChannelProductionIssueRecord vChannelProductionIssueRecord) {
    this.vChannelProductionIssueRecord = vChannelProductionIssueRecord;
  }


}

