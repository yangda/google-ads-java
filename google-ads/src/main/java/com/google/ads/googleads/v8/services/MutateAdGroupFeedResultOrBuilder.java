// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/ad_group_feed_service.proto

package com.google.ads.googleads.v8.services;

public interface MutateAdGroupFeedResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.MutateAdGroupFeedResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated ad group feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.AdGroupFeed ad_group_feed = 2;</code>
   * @return Whether the adGroupFeed field is set.
   */
  boolean hasAdGroupFeed();
  /**
   * <pre>
   * The mutated ad group feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.AdGroupFeed ad_group_feed = 2;</code>
   * @return The adGroupFeed.
   */
  com.google.ads.googleads.v8.resources.AdGroupFeed getAdGroupFeed();
  /**
   * <pre>
   * The mutated ad group feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.AdGroupFeed ad_group_feed = 2;</code>
   */
  com.google.ads.googleads.v8.resources.AdGroupFeedOrBuilder getAdGroupFeedOrBuilder();
}
