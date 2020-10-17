package com.example.demopostgresql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demopostgresql.entity.CampaignSkuDetail;
import com.example.demopostgresql.repository.CampaignSkuDetailRepository;
import com.example.demopostgresql.services.CampaignService;

/**
 * @author rishi - created on 30/08/20
 **/
@Service
public class CampaignServiceImpl implements CampaignService {

  @Autowired
  private CampaignSkuDetailRepository campaignSkuDetailRepository;

  @Override
  public void addCampaignSkuDetail(CampaignSkuDetail campaignSkuDetail) {
    campaignSkuDetailRepository.save(campaignSkuDetail);
  }

  @Override
  public List<CampaignSkuDetail> getCampaignSkuDetailByCampaignCode(String campaignCode, String categoryCode) {
    return campaignSkuDetailRepository.findByCampaignCodeAndCategoryCode(campaignCode, categoryCode);
  }

  @Override
  @Transactional
  public void transactionAnnotationExample(int quota, String campaignCode) throws Exception {
    updateCampaign(quota, campaignCode);
    CampaignSkuDetail campaignSkuDetail = campaignSkuDetailRepository.findByCampaignCode(campaignCode);
    System.out.println("-------------------------------------------------------");
    System.out.println(campaignSkuDetail.getQuota());
    System.out.println("-------------------------------------------------------");
    campaignSkuDetail.setDiscount(20050D);
  }

  private void updateCampaign(int quota, String campaignCode) {
    campaignSkuDetailRepository.updateQuota(quota, campaignCode);
  }
}
