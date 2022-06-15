// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/ad_group_ad_label_service.proto

package com.google.ads.googleads.v11.services;

public interface AdGroupAdLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.AdGroupAdLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAdLabel create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAdLabel create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.AdGroupAdLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group ad
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdGroupAdLabel create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.AdGroupAdLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the ad group ad label
   * being removed, in this format:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}_{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group ad label
   * being removed, in this format:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}_{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group ad label
   * being removed, in this format:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}_{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v11.services.AdGroupAdLabelOperation.OperationCase getOperationCase();
}
