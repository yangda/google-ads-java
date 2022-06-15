// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/feed_mapping_service.proto

package com.google.ads.googleads.v11.services;

public interface FeedMappingOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.FeedMappingOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed mapping.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.FeedMapping create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed mapping.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.FeedMapping create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.FeedMapping getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed mapping.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.FeedMapping create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.FeedMappingOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed feed mapping is
   * expected, in this format:
   * `customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed mapping is
   * expected, in this format:
   * `customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed mapping is
   * expected, in this format:
   * `customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v11.services.FeedMappingOperation.OperationCase getOperationCase();
}
