package com.example.demopostgresql.entity;

/**
 * @author rishi - created on 15/03/21
 **/
public enum  CampaignType {
  REGULAR("Regular"),
  FLASH_SALE("Flash Sale");

  private String description;

  CampaignType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
