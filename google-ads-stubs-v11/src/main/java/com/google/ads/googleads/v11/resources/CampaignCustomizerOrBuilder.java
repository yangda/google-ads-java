// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/campaign_customizer.proto

package com.google.ads.googleads.v11.resources;

public interface CampaignCustomizerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.CampaignCustomizer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign customizer.
   * Campaign customizer resource names have the form:
   * `customers/{customer_id}/campaignCustomizers/{campaign_id}~{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign customizer.
   * Campaign customizer resource names have the form:
   * `customers/{customer_id}/campaignCustomizers/{campaign_id}~{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which the customizer attribute is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the customizer attribute is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Required. Immutable. The customizer attribute which is linked to the campaign.
   * </pre>
   *
   * <code>string customizer_attribute = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The customizerAttribute.
   */
  java.lang.String getCustomizerAttribute();
  /**
   * <pre>
   * Required. Immutable. The customizer attribute which is linked to the campaign.
   * </pre>
   *
   * <code>string customizer_attribute = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customizerAttribute.
   */
  com.google.protobuf.ByteString
      getCustomizerAttributeBytes();

  /**
   * <pre>
   * Output only. The status of the campaign customizer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CustomizerValueStatusEnum.CustomizerValueStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign customizer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CustomizerValueStatusEnum.CustomizerValueStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v11.enums.CustomizerValueStatusEnum.CustomizerValueStatus getStatus();

  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this level. The
   * value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CustomizerValue value = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this level. The
   * value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CustomizerValue value = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The value.
   */
  com.google.ads.googleads.v11.common.CustomizerValue getValue();
  /**
   * <pre>
   * Required. The value to associate with the customizer attribute at this level. The
   * value must be of the type specified for the CustomizerAttribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CustomizerValue value = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v11.common.CustomizerValueOrBuilder getValueOrBuilder();
}
