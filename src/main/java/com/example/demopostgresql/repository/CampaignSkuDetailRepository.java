package com.example.demopostgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demopostgresql.entity.CampaignSkuDetail;

/**
 * @author rishi - created on 30/08/20
 **/
@Repository
public interface CampaignSkuDetailRepository extends JpaRepository<CampaignSkuDetail, String> {

  List<CampaignSkuDetail> findByCampaignCodeAndCategoryCode(String campaignCode, String categoryCode);

  @Modifying(clearAutomatically = true)
  @Query("update CampaignSkuDetail c set c.quota = ?1 where campaignCode = ?2")
  void updateQuota(int i, String campaignCode);

  CampaignSkuDetail findByCampaignCode(String campaignCode);
}
