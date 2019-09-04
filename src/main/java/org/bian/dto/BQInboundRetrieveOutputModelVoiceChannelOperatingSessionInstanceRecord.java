package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class BQInboundRetrieveOutputModelVoiceChannelOperatingSessionInstanceRecord   {
  private String advancedVoiceServicesOperationsServiceMenu = null;

  private String vChannelServiceSessionStatistics = null;


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


}

