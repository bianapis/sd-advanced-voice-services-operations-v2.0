package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord
 */
public class BQInboundInitiateInputModelVoiceChannelOperatingSessionInstanceRecord   {
  private String advancedVoiceServicesOperationsServiceMenu = null;


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


}

