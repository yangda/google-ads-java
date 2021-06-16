// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/keyword_plan_service.proto

package com.google.ads.googleads.v8.services;

public interface KeywordPlanCampaignForecastCurveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.KeywordPlanCampaignForecastCurve)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>string keyword_plan_campaign = 3;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>string keyword_plan_campaign = 3;</code>
   * @return The keywordPlanCampaign.
   */
  java.lang.String getKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>string keyword_plan_campaign = 3;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes();

  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return Whether the maxCpcBidForecastCurve field is set.
   */
  boolean hasMaxCpcBidForecastCurve();
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return The maxCpcBidForecastCurve.
   */
  com.google.ads.googleads.v8.services.KeywordPlanMaxCpcBidForecastCurve getMaxCpcBidForecastCurve();
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   */
  com.google.ads.googleads.v8.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder getMaxCpcBidForecastCurveOrBuilder();
}
