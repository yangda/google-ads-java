// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/conversion_value_rule_set_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateConversionValueRuleSetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateConversionValueRuleSetResult)
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
   * The mutated conversion value rule set with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionValueRuleSet conversion_value_rule_set = 2;</code>
   * @return Whether the conversionValueRuleSet field is set.
   */
  boolean hasConversionValueRuleSet();
  /**
   * <pre>
   * The mutated conversion value rule set with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionValueRuleSet conversion_value_rule_set = 2;</code>
   * @return The conversionValueRuleSet.
   */
  com.google.ads.googleads.v11.resources.ConversionValueRuleSet getConversionValueRuleSet();
  /**
   * <pre>
   * The mutated conversion value rule set with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionValueRuleSet conversion_value_rule_set = 2;</code>
   */
  com.google.ads.googleads.v11.resources.ConversionValueRuleSetOrBuilder getConversionValueRuleSetOrBuilder();
}
