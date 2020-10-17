package com.example.demopostgresql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author rishi - created on 30/08/20
 **/
@Data
@Entity
@Table(name = CampaignSkuDetail.TABLE)
public class CampaignSkuDetail {
  public static final String TABLE = "campaign_sku_detail";

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name="uuid",strategy = "uuid2")
  @Column(name = "ID")
  private String id;

  @Column(name = "item_sku_id")
  private String itemSkuId;

  @Column(name = "product_sku")
  private String productSku;

  @Column(name = "product_code")
  private String productCode;

  @Column(name = "discount")
  private Double discount;

  @Column(name = "campaign_code")
  private String campaignCode;

  @Column(name = "category_code")
  private String categoryCode;

  @Column(name = "quota")
  private int quota;

  @Column(name = "merchant_code")
  private String merchantCode;
}
