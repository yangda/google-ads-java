// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/ad_group_asset_service.proto

package com.google.ads.googleads.v11.services;

public interface AdGroupAssetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.AdGroupAssetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.AdGroupAsset getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.AdGroupAssetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad group asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset update = 3;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad group asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset update = 3;</code>
   * @return The update.
   */
  com.google.ads.googleads.v11.resources.AdGroupAsset getUpdate();
  /**
   * <pre>
   * Update operation: The ad group asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAsset update = 3;</code>
   */
  com.google.ads.googleads.v11.resources.AdGroupAssetOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group asset is
   * expected, in this format:
   * `customers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group asset is
   * expected, in this format:
   * `customers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group asset is
   * expected, in this format:
   * `customers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v11.services.AdGroupAssetOperation.OperationCase getOperationCase();
}
