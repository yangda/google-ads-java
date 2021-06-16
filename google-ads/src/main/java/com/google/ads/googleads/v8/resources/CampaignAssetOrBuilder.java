// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/campaign_asset.proto

package com.google.ads.googleads.v8.resources;

public interface CampaignAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.CampaignAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign asset.
   * CampaignAsset resource names have the form:
   * `customers/{customer_id}/campaignAssets/{campaign_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign asset.
   * CampaignAsset resource names have the form:
   * `customers/{customer_id}/campaignAssets/{campaign_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which the asset is linked.
   * </pre>
   *
   * <code>string campaign = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the asset is linked.
   * </pre>
   *
   * <code>string campaign = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the asset is linked.
   * </pre>
   *
   * <code>string campaign = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Immutable. The asset which is linked to the campaign.
   * </pre>
   *
   * <code>string asset = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <pre>
   * Immutable. The asset which is linked to the campaign.
   * </pre>
   *
   * <code>string asset = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Immutable. The asset which is linked to the campaign.
   * </pre>
   *
   * <code>string asset = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Immutable. Role that the asset takes under the linked campaign.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldType field_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Immutable. Role that the asset takes under the linked campaign.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldType field_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();

  /**
   * <pre>
   * Status of the campaign asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.AssetLinkStatusEnum.AssetLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the campaign asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.AssetLinkStatusEnum.AssetLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v8.enums.AssetLinkStatusEnum.AssetLinkStatus getStatus();
}
