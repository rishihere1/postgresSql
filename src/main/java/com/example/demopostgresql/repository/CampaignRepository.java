package com.example.demopostgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demopostgresql.entity.Campaign;

/**
 * @author rishi - created on 15/03/21
 **/
@Repository
public interface CampaignRepository extends JpaRepository<Campaign, String>, JpaSpecificationExecutor<Campaign> {

//  @Query(value = "SELECT COUNT(c.id) from Campaign c WHERE c.campaignStatus IN ('REVIEWING', 'EDITING', 'SUPERVISE', "
//      + "'PREPARING_CONTENT', 'CONTENT_DONE', 'REGISTERED', 'REVIEW_SKU') AND c.campaignType = 'REGULAR' AND "
//      + "c.exclusive = true AND c.assetMissing = true AND c.markForDelete = false AND c.storeId = :storeId")
//  Long x(@Param("storeId") String storeId);

  @Query(value = "select c from Campaign c JOIN c.campaignRuleSets r where r.isIgnored = false and r.ruleType = 'MERCHANT'")
  List<Campaign> filter();
}
