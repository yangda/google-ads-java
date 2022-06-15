// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/billing_setup_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateBillingSetupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateBillingSetupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Id of the customer to apply the billing setup mutate operation to.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. Id of the customer to apply the billing setup mutate operation to.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.BillingSetupOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.BillingSetupOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v11.services.BillingSetupOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.BillingSetupOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v11.services.BillingSetupOperationOrBuilder getOperationOrBuilder();
}
