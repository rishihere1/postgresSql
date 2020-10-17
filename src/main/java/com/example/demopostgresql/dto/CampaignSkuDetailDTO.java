package com.example.demopostgresql.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author rishi - created on 30/08/20
 **/
@Data
@Builder
public class CampaignSkuDetailDTO {

  private String itemSkuId;

  private String productSku;

  private String productCode;

  private Double discount;

  private String campaignCode;

  private String categoryCode;

  private int quota;

  private String merchantCode;

}
