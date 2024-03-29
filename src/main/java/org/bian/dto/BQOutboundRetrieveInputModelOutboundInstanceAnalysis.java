package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveInputModelOutboundInstanceAnalysis
 */
public class BQOutboundRetrieveInputModelOutboundInstanceAnalysis   {
  private String outboundInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return outboundInstanceAnalysisReference
  **/

  public String getOutboundInstanceAnalysisReference() {
    return outboundInstanceAnalysisReference;
  }

  public void setOutboundInstanceAnalysisReference(String outboundInstanceAnalysisReference) {
    this.outboundInstanceAnalysisReference = outboundInstanceAnalysisReference;
  }


}

