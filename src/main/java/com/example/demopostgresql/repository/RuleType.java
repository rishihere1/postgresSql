package com.example.demopostgresql.repository;

public enum RuleType {
  BRAND("Brand"), CATEGORY("Category"), MERCHANT("Merchant"), SELLER_RATING("Seller rating"), ONTIME_FULFILLMENT(
      "Ontime fulfilment"), PERFECT_TRANSACTION("Perfect transaction");

  private String description;

  private RuleType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}