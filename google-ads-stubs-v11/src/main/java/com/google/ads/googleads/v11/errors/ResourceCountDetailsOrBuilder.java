// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/errors/errors.proto

package com.google.ads.googleads.v11.errors;

public interface ResourceCountDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.errors.ResourceCountDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The enclosingId.
   */
  java.lang.String getEnclosingId();
  /**
   * <pre>
   * The ID of the resource whose limit was exceeded.
   * External customer ID if the limit is for a customer.
   * </pre>
   *
   * <code>string enclosing_id = 1;</code>
   * @return The bytes for enclosingId.
   */
  com.google.protobuf.ByteString
      getEnclosingIdBytes();

  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The enclosingResource.
   */
  java.lang.String getEnclosingResource();
  /**
   * <pre>
   * The name of the resource (Customer, Campaign etc.) whose limit was
   * exceeded.
   * </pre>
   *
   * <code>string enclosing_resource = 5;</code>
   * @return The bytes for enclosingResource.
   */
  com.google.protobuf.ByteString
      getEnclosingResourceBytes();

  /**
   * <pre>
   * The limit which was exceeded.
   * </pre>
   *
   * <code>int32 limit = 2;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The enum numeric value on the wire for limitType.
   */
  int getLimitTypeValue();
  /**
   * <pre>
   * The resource limit type which was exceeded.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType limit_type = 3;</code>
   * @return The limitType.
   */
  com.google.ads.googleads.v11.enums.ResourceLimitTypeEnum.ResourceLimitType getLimitType();

  /**
   * <pre>
   * The count of existing entities.
   * </pre>
   *
   * <code>int32 existing_count = 4;</code>
   * @return The existingCount.
   */
  int getExistingCount();
}
