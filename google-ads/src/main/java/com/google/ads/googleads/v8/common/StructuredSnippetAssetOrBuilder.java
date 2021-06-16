// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/asset_types.proto

package com.google.ads.googleads.v8.common;

public interface StructuredSnippetAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.StructuredSnippetAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The header of the snippet.
   * This string should be one of the predefined values at
   * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <pre>
   * Required. The header of the snippet.
   * This string should be one of the predefined values at
   * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
