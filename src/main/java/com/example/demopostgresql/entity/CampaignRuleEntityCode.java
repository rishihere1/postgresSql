package com.example.demopostgresql.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = CampaignRuleEntityCodeNames.TABLE_NAME)
public class CampaignRuleEntityCode {
  private static final long serialVersionUID = 18678757L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name="uuid", strategy = "uuid2")
  @Column(name = "ID")
  private String id;

  @Column(name = CampaignRuleEntityCodeNames.ENTITY_CODE)
  private String entityCode;

  @JsonBackReference
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = CampaignRuleEntityCodeNames.CAMPAIGN_RULE_FK)
  private CampaignRuleSet campaignRuleSet;

}
