// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/merchant_center_link.proto

package com.google.ads.googleads.v8.resources;

public interface MerchantCenterLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.MerchantCenterLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>optional string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the merchantCenterAccountName field is set.
   */
  boolean hasMerchantCenterAccountName();
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>optional string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The merchantCenterAccountName.
   */
  java.lang.String getMerchantCenterAccountName();
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>optional string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for merchantCenterAccountName.
   */
  com.google.protobuf.ByteString
      getMerchantCenterAccountNameBytes();

  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus getStatus();
}
