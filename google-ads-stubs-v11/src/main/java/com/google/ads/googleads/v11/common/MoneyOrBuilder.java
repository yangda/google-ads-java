// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/feed_common.proto

package com.google.ads.googleads.v11.common;

public interface MoneyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.Money)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>optional string currency_code = 3;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>optional int64 amount_micros = 4;</code>
   * @return Whether the amountMicros field is set.
   */
  boolean hasAmountMicros();
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>optional int64 amount_micros = 4;</code>
   * @return The amountMicros.
   */
  long getAmountMicros();
}
