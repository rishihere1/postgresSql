package com.example.demopostgresql.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.demopostgresql.repository.RuleType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = CampaignRuleSetNames.TABLE_NAME)
public class CampaignRuleSet {
  private static final long serialVersionUID = 16736757L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name="uuid", strategy = "uuid2")
  @Column(name = "ID")
  private String id;

  @Column(name = CampaignRuleSetNames.IS_IGNORED)
  private Boolean isIgnored;

  @Column(name = CampaignRuleSetNames.RULE_TYPE)
  @Enumerated(EnumType.STRING)
  private RuleType ruleType;

  @JsonManagedReference
  @OneToMany(fetch = FetchType.LAZY,
          cascade = CascadeType.ALL,
          mappedBy = "campaignRuleSet",
          orphanRemoval = true)
  private List<CampaignRuleEntityCode> ruleEntityCodes;

  @JsonBackReference
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = CampaignRuleSetNames.CAMPAIGN_FK)
  private Campaign campaign;

}
