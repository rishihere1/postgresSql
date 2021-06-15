package com.example.demopostgresql.dto;

/**
 * @author rishi - created on 15/03/21
 **/
public enum CampaignStatus {

  FAILED("Failed", 0),
  REVIEWING("Reviewing", 1),
  EDITING("Editing", 2),
  SUPERVISE("Supervise", 3),
  PREPARING_CONTENT("Preparing content", 4),
  CONTENT_DONE("Content done", 5),
  REGISTERED("Registered", 6),
  REVIEW_SKU("Review SKU", 7),
  PUBLISHED("published", 8),
  LIVE("Live", 9),
  ENDED("Ended", 10),
  FORCED_STOP("Forced stop", 11),
  PENDING("Pending", 12),
  WAITING_FOR_APPROVAL("Waiting for Approval", 13),
  APPROVED("Approved", 14);

  private String description;
  private int sequence;

  private CampaignStatus(String description, int sequence) {
    this.description = description;
    this.sequence = sequence;
  }

  public String getDescription() {
    return description;
  }

  public int getSequence() {
    return sequence;
  }
}
