// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/asset_group_listing_group_filter_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateAssetGroupListingGroupFilterResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateAssetGroupListingGroupFilterResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated AssetGroupListingGroupFilter with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupListingGroupFilter asset_group_listing_group_filter = 2;</code>
   * @return Whether the assetGroupListingGroupFilter field is set.
   */
  boolean hasAssetGroupListingGroupFilter();
  /**
   * <pre>
   * The mutated AssetGroupListingGroupFilter with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupListingGroupFilter asset_group_listing_group_filter = 2;</code>
   * @return The assetGroupListingGroupFilter.
   */
  com.google.ads.googleads.v11.resources.AssetGroupListingGroupFilter getAssetGroupListingGroupFilter();
  /**
   * <pre>
   * The mutated AssetGroupListingGroupFilter with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AssetGroupListingGroupFilter asset_group_listing_group_filter = 2;</code>
   */
  com.google.ads.googleads.v11.resources.AssetGroupListingGroupFilterOrBuilder getAssetGroupListingGroupFilterOrBuilder();
}
