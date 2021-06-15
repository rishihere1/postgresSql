package com.example.demopostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demopostgresql.entity.CampaignRuleEntityCode;

/**
 * @author rishi - created on 05/06/21
 **/
@Repository
public interface CampaignEntityCodesRepository extends JpaRepository<CampaignRuleEntityCode, String> {
}
