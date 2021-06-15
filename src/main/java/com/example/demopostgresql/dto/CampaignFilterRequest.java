package com.example.demopostgresql.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rishi - created on 12/06/21
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampaignFilterRequest {

  private String campaignName;
  private String campaignCode;
  private List<CampaignStatus> campaignStatus;
  private List<String> createdBy;
  private Date createdDate;
  private Date promoStartTime;
  private Date promoEndTime;
  private Boolean merchantNumRequired;
  private Boolean productNumRequired;
  private String merchantCode;
  private Boolean countMerchantProducts;
  private Boolean campaignStatusSortRequired;
  private boolean merchantEnrolledInfoRequired;
  private boolean showMerchantRegisteredCampaignOnly;
  private int sellerRating;
}
