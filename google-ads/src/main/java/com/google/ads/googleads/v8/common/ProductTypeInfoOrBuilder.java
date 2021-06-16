// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/criteria.proto

package com.google.ads.googleads.v8.common;

public interface ProductTypeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.ProductTypeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value of the type.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Level of the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Level of the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.ProductTypeLevelEnum.ProductTypeLevel level = 2;</code>
   * @return The level.
   */
  com.google.ads.googleads.v8.enums.ProductTypeLevelEnum.ProductTypeLevel getLevel();
}
