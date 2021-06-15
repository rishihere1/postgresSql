package com.example.demopostgresql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@StaticMetamodel(CampaignMerchantDetail.class)
@Setter
@Table(name = CampaignMerchantDetailNames.TABLE_NAME)
public class CampaignMerchantDetail {
  private static final long serialVersionUID = 18436757L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name="uuid", strategy = "uuid2")
  @Column(name = "ID")
  private String id;

  @Column(name = CampaignMerchantDetailNames.CAMPAIGN_CODE)
  private String campaignCode;

  @Column(name = CampaignMerchantDetailNames.MERCHANT_CODE)
  private String merchantCode;

  @Column(name = CampaignMerchantDetailNames.JOINING_DATE)
  private Date joiningDate;

  @JsonBackReference
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = CampaignMerchantDetailNames.CAMPAIGN_FK)
  private Campaign campaign;

}
