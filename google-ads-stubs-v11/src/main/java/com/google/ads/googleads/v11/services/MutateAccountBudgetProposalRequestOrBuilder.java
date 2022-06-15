// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/account_budget_proposal_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateAccountBudgetProposalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateAccountBudgetProposalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on an individual account-level budget proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.AccountBudgetProposalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on an individual account-level budget proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.AccountBudgetProposalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v11.services.AccountBudgetProposalOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on an individual account-level budget proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.AccountBudgetProposalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v11.services.AccountBudgetProposalOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
