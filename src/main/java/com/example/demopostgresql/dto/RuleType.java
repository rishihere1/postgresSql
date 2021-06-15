package com.example.demopostgresql.dto;

public enum RuleType {
  BRAND("Brand"),
  CATEGORY("Category"),
  MERCHANT("Merchant");

  private String description;

  private RuleType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}
