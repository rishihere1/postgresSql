package com.example.demopostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demopostgresql.entity.CampaignRuleSet;

/**
 * @author rishi - created on 05/06/21
 **/
@Repository
public interface CampaignRuleSetRepository extends JpaRepository<CampaignRuleSet, String> {


}
