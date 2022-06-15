// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/campaign_experiment_service.proto

package com.google.ads.googleads.v11.services;

public interface PromoteCampaignExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.PromoteCampaignExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the campaign experiment to promote.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignExperiment.
   */
  java.lang.String getCampaignExperiment();
  /**
   * <pre>
   * Required. The resource name of the campaign experiment to promote.
   * </pre>
   *
   * <code>string campaign_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignExperiment.
   */
  com.google.protobuf.ByteString
      getCampaignExperimentBytes();

  /**
   * <pre>
   * If true, the request is validated but no Long Running Operation is created.
   * Only errors are returned.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
