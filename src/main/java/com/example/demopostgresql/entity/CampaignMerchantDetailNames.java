package com.example.demopostgresql.entity;

public final class CampaignMerchantDetailNames {

  public static final String TABLE_NAME = "camp_merchant_detail";
  public static final String CAMPAIGN_CODE = "campaign_code";
  public static final String MERCHANT_CODE = "merchant_code";
  public static final String JOINING_DATE = "joining_date";
  public static final String MERCHANT_STATUS = "merchant_status";
  public static final String CAMPAIGN_FK = "campaign_fk";
  public static final String UNIQUE_CONSTRAINT = "UK_CAMP_MERCH_DETAIL_MERCHANT_CODE_CAMP_CODE_STOREID";
  
  private CampaignMerchantDetailNames() {
    //No Implementation Required
  }

}
