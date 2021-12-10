// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/criteria.proto

package com.google.ads.googleads.v8.common;

public interface ProductCustomAttributeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.ProductCustomAttributeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   * @return The enum numeric value on the wire for index.
   */
  int getIndexValue();
  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   * @return The index.
   */
  com.google.ads.googleads.v8.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex getIndex();
}
