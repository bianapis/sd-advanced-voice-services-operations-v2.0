package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord;
import org.bian.dto.CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelOperatingSessionRetrieveOutputModel
 */
public class CRVoiceChannelOperatingSessionRetrieveOutputModel   {
  private CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord = null;

  private String voiceChannelOperatingSessionRetrieveActionTaskReference = null;

  private Object voiceChannelOperatingSessionRetrieveActionTaskRecord = null;

  private String voiceChannelOperatingSessionRetrieveActionResponse = null;

  private CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord voiceChannelOperatingSessionInstanceReportRecord = null;

  private CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis voiceChannelOperatingSessionInstanceAnalysis = null;


  /**
   * Get voiceChannelOperatingSessionInstanceRecord
   * @return voiceChannelOperatingSessionInstanceRecord
  **/

  public CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord getVoiceChannelOperatingSessionInstanceRecord() {
    return voiceChannelOperatingSessionInstanceRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceRecord(CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord voiceChannelOperatingSessionInstanceRecord) {
    this.voiceChannelOperatingSessionInstanceRecord = voiceChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Operating Session instance retrieve service call 
   * @return voiceChannelOperatingSessionRetrieveActionTaskReference
  **/

  public String getVoiceChannelOperatingSessionRetrieveActionTaskReference() {
    return voiceChannelOperatingSessionRetrieveActionTaskReference;
  }

  public void setVoiceChannelOperatingSessionRetrieveActionTaskReference(String voiceChannelOperatingSessionRetrieveActionTaskReference) {
    this.voiceChannelOperatingSessionRetrieveActionTaskReference = voiceChannelOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return voiceChannelOperatingSessionRetrieveActionResponse
  **/

  public String getVoiceChannelOperatingSessionRetrieveActionResponse() {
    return voiceChannelOperatingSessionRetrieveActionResponse;
  }

  public void setVoiceChannelOperatingSessionRetrieveActionResponse(String voiceChannelOperatingSessionRetrieveActionResponse) {
    this.voiceChannelOperatingSessionRetrieveActionResponse = voiceChannelOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceReportRecord
   * @return voiceChannelOperatingSessionInstanceReportRecord
  **/

  public CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord getVoiceChannelOperatingSessionInstanceReportRecord() {
    return voiceChannelOperatingSessionInstanceReportRecord;
  }

  public void setVoiceChannelOperatingSessionInstanceReportRecord(CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceReportRecord voiceChannelOperatingSessionInstanceReportRecord) {
    this.voiceChannelOperatingSessionInstanceReportRecord = voiceChannelOperatingSessionInstanceReportRecord;
  }


  /**
   * Get voiceChannelOperatingSessionInstanceAnalysis
   * @return voiceChannelOperatingSessionInstanceAnalysis
  **/

  public CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis getVoiceChannelOperatingSessionInstanceAnalysis() {
    return voiceChannelOperatingSessionInstanceAnalysis;
  }

  public void setVoiceChannelOperatingSessionInstanceAnalysis(CRVoiceChannelOperatingSessionRetrieveOutputModelVoiceChannelOperatingSessionInstanceAnalysis voiceChannelOperatingSessionInstanceAnalysis) {
    this.voiceChannelOperatingSessionInstanceAnalysis = voiceChannelOperatingSessionInstanceAnalysis;
  }


}

