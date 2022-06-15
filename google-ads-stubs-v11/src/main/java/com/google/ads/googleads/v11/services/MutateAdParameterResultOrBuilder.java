// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/ad_parameter_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateAdParameterResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateAdParameterResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdParameter ad_parameter = 2;</code>
   * @return Whether the adParameter field is set.
   */
  boolean hasAdParameter();
  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdParameter ad_parameter = 2;</code>
   * @return The adParameter.
   */
  com.google.ads.googleads.v11.resources.AdParameter getAdParameter();
  /**
   * <pre>
   * The mutated AdParameter with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.AdParameter ad_parameter = 2;</code>
   */
  com.google.ads.googleads.v11.resources.AdParameterOrBuilder getAdParameterOrBuilder();
}
