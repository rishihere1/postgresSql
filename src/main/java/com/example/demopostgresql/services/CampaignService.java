package com.example.demopostgresql.services;

import java.util.List;

import com.example.demopostgresql.entity.CampaignSkuDetail;

/**
 * @author rishi - created on 30/08/20
 **/
public interface CampaignService {

  void addCampaignSkuDetail(CampaignSkuDetail campaignSkuDetail);

  List<CampaignSkuDetail> getCampaignSkuDetailByCampaignCode(String campaignCode, String categoryCode);

  void transactionAnnotationExample(int quota, String campaignCode) throws Exception;

  void deleteByCampaignCode(String campaignCode);

  void clearAutomaticallyTest(CampaignSkuDetail campaignSkuDetail);
}
