package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveInputModel
 */
public class CRVoiceChannelOperatingSessionRetrieveInputModel   {
  private Object voiceChannelOperatingSessionRetrieveActionTaskRecord = null;

  private String voiceChannelOperatingSessionRetrieveActionRequest = null;

  private CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord voiceChannelOperatingSessionInstanceReportRecord = null;

  private CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis voiceChannelOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return voiceChannelOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getVoiceChannelOperatingSessionRetrieveActionTaskRecord() {
    return voiceChannelOperatingSessionRetrieveActionTaskRecord;
  }

  public void setVoiceChannelOperatingSessionRetrieveActionTaskRecord(Object voiceChannelOperatingSessionRetrieveActionTaskRecord) {
    this.voiceChannelOperatingSessionRetrieveActionTaskRecord = voiceChannelOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return voiceChannelOperatingSessionRetrieveActionRequest
  **/

  public String getVoiceChannelOperatingSessionRetrieveActionRequest() {
    return voiceChannelOperatingSessionRetrieveActionRequest;
  }

  public void setVoiceChannelOperatingSessionRetrieveActionRequest(String voiceChannelOperatingSessionRetrieveActionRequest) {
    this.voiceChannelOperatingSessionRetrieveActionRequest = voiceChannelOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceReportRecord
   * @return voiceChannelOperatingSessionInstanceReportRecord
  **/

  public CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord getVoiceChannelOperatingSessionInstanceReportRecord() {
    return voiceChannelOperatingSessionInstanceReportRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceReportRecord(CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceReportRecord voiceChannelOperatingSessionInstanceReportRecord) {
    this.voiceChannelOperatingSessionInstanceReportRecord = voiceChannelOperatingSessionInstanceReportRecord;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceAnalysis
   * @return voiceChannelOperatingSessionInstanceAnalysis
  **/

  public CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis getVoiceChannelOperatingSessionInstanceAnalysis() {
    return voiceChannelOperatingSessionInstanceAnalysis;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysis(CRVoiceChannelOperatingSessionRetrieveInputModelVoiceChannelOperatingSessionInstanceAnalysis voiceChannelOperatingSessionInstanceAnalysis) {
    this.voiceChannelOperatingSessionInstanceAnalysis = voiceChannelOperatingSessionInstanceAnalysis;
  }


}

