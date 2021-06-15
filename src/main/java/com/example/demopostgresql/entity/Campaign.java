package com.example.demopostgresql.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = CampaignNames.TABLE_NAME)
public class Campaign {
  private static final long serialVersionUID = 18434897L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name="uuid", strategy = "uuid2")
  @Column(name = "ID")
  private String id;


  @Column(name = CampaignNames.CAMPAIGN_CODE,
          unique = true)
  private String campaignCode;

  @Column(name = CampaignNames.PROMO_DISPLAY_NAME)
  private String campaignDisplayName;

  @Column(name = CampaignNames.PROMO_UNIQUE_NAME,
          unique = true)
  private String campaignName;

  @Column(name = CampaignNames.PROMO_DISPLAY_DESC)
  private String externalDesc;

  @Column(name = CampaignNames.PROMO_INTERNAL_DESC)
  private String internalDesc;

  @Column(name = CampaignNames.PROMO_START_TIME)
  private Date promoStartTime;

  @Column(name = CampaignNames.PROMO_END_TIME)
  private Date promoEndTime;

  @Column(name = CampaignNames.REG_START_TIME)
  private Date regStartTime;

  @Column(name = CampaignNames.REG_END_TIME)
  private Date regEndTime;

  @Column(name = CampaignNames.REVIEW_START_TIME)
  private Date reviewStartTime;

  @Column(name = CampaignNames.REVIEW_END_TIME)
  private Date reviewEndTime;

  @Column(name = CampaignNames.MIN_DISCOUNT)
  private Double minDiscount;

  @Column(name = CampaignNames.MAX_DISCOUNT)
  private Double maxDiscount;

  @Column(name = CampaignNames.TARGET_SALES)
  private Double totalSales;

  @Column(name = CampaignNames.TARGET_ORDERS)
  private Integer totalOrders;

  @Column(name = CampaignNames.TERMS_AND_COND)
  private String termsAndConditions;

  @Column(name = CampaignNames.PROMO_BANNER_URL)
  private String promoBannerUrl;

  @Column(name = CampaignNames.TAG_LABEL)
  private String tagLabel;

  @Column(name = CampaignNames.EXCLUSIVE)
  private Boolean exclusive;

  @Column(name = CampaignNames.MIN_FINAL_PRICE)
  private Double minFinalPrice;

  @JsonManagedReference
  @OneToMany(mappedBy = "campaign",
             fetch = FetchType.LAZY,
             cascade = CascadeType.ALL)
  private Set<CampaignRuleSet> campaignRuleSets = new HashSet<CampaignRuleSet>();

  @Column(name = CampaignNames.CREATOR_EMAIL)
  private String creatorEmail;

  @Column(name = CampaignNames.CAMPAIGN_TYPE)
  @Enumerated(EnumType.STRING)
  private CampaignType campaignType;

  @Column(name = CampaignNames.MIN_QUOTA)
  private Integer minQuota;

  @Column(name = CampaignNames.PRODUCT_CARD_BACKGROUND_COLOR_HEXCODE)
  private String productCardBackgroundColorHexcode;

  @Column(name = CampaignNames.PROMO_TAB_IMAGE_URL)
  private String promoTabImageUrl;

  @Column(name = CampaignNames.PRODUCT_CARD_TITLE_IMAGE_URL)
  private String productCardTitleImageUrl;

  @Column(name = CampaignNames.PRODUCT_CARD_BACKGROUND_IMAGE_URL)
  private String productCardBackgroundImageUrl;

  @Column(name = CampaignNames.PRODUCT_CARD_BADGE_IMAGE_URL)
  private String productCardBadgeImageUrl;

  @Column(name = CampaignNames.SELLER_RATING)
  private Integer sellerRating;

  @Column(name = CampaignNames.PERFECT_TRANSACTION)
  private Integer perfectTransaction;

  @Column(name = CampaignNames.ON_TIME_FULFILLMENT)
  private Integer onTimeFulfillment;

  @JsonManagedReference
  @OneToMany(mappedBy = "campaign",
      fetch = FetchType.LAZY,
      cascade = CascadeType.ALL)
  private Set<CampaignMerchantDetail> campaignMerchantDetails = new HashSet<>();
}
