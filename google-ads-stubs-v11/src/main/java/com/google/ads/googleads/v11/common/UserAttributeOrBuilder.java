// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/offline_user_data.proto

package com.google.ads.googleads.v11.common;

public interface UserAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.UserAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Advertiser defined lifetime value for the user.
   * </pre>
   *
   * <code>optional int64 lifetime_value_micros = 1;</code>
   * @return Whether the lifetimeValueMicros field is set.
   */
  boolean hasLifetimeValueMicros();
  /**
   * <pre>
   * Advertiser defined lifetime value for the user.
   * </pre>
   *
   * <code>optional int64 lifetime_value_micros = 1;</code>
   * @return The lifetimeValueMicros.
   */
  long getLifetimeValueMicros();

  /**
   * <pre>
   * Advertiser defined lifetime value bucket for the user. The valid range for
   * a lifetime value bucket is from 1 (low) to 10 (high), except for remove
   * operation where 0 will also be accepted.
   * </pre>
   *
   * <code>optional int32 lifetime_value_bucket = 2;</code>
   * @return Whether the lifetimeValueBucket field is set.
   */
  boolean hasLifetimeValueBucket();
  /**
   * <pre>
   * Advertiser defined lifetime value bucket for the user. The valid range for
   * a lifetime value bucket is from 1 (low) to 10 (high), except for remove
   * operation where 0 will also be accepted.
   * </pre>
   *
   * <code>optional int32 lifetime_value_bucket = 2;</code>
   * @return The lifetimeValueBucket.
   */
  int getLifetimeValueBucket();

  /**
   * <pre>
   * Timestamp of the last purchase made by the user.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string last_purchase_date_time = 3;</code>
   * @return The lastPurchaseDateTime.
   */
  java.lang.String getLastPurchaseDateTime();
  /**
   * <pre>
   * Timestamp of the last purchase made by the user.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string last_purchase_date_time = 3;</code>
   * @return The bytes for lastPurchaseDateTime.
   */
  com.google.protobuf.ByteString
      getLastPurchaseDateTimeBytes();

  /**
   * <pre>
   * Advertiser defined average number of purchases that are made by the user in
   * a 30 day period.
   * </pre>
   *
   * <code>int32 average_purchase_count = 4;</code>
   * @return The averagePurchaseCount.
   */
  int getAveragePurchaseCount();

  /**
   * <pre>
   * Advertiser defined average purchase value in micros for the user.
   * </pre>
   *
   * <code>int64 average_purchase_value_micros = 5;</code>
   * @return The averagePurchaseValueMicros.
   */
  long getAveragePurchaseValueMicros();

  /**
   * <pre>
   * Timestamp when the user was acquired.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string acquisition_date_time = 6;</code>
   * @return The acquisitionDateTime.
   */
  java.lang.String getAcquisitionDateTime();
  /**
   * <pre>
   * Timestamp when the user was acquired.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string acquisition_date_time = 6;</code>
   * @return The bytes for acquisitionDateTime.
   */
  com.google.protobuf.ByteString
      getAcquisitionDateTimeBytes();

  /**
   * <pre>
   * The shopping loyalty related data. Shopping utilizes this data to provide
   * users with a better experience. Accessible only to merchants on the
   * allow-list with the user's consent.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.ShoppingLoyalty shopping_loyalty = 7;</code>
   * @return Whether the shoppingLoyalty field is set.
   */
  boolean hasShoppingLoyalty();
  /**
   * <pre>
   * The shopping loyalty related data. Shopping utilizes this data to provide
   * users with a better experience. Accessible only to merchants on the
   * allow-list with the user's consent.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.ShoppingLoyalty shopping_loyalty = 7;</code>
   * @return The shoppingLoyalty.
   */
  com.google.ads.googleads.v11.common.ShoppingLoyalty getShoppingLoyalty();
  /**
   * <pre>
   * The shopping loyalty related data. Shopping utilizes this data to provide
   * users with a better experience. Accessible only to merchants on the
   * allow-list with the user's consent.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v11.common.ShoppingLoyalty shopping_loyalty = 7;</code>
   */
  com.google.ads.googleads.v11.common.ShoppingLoyaltyOrBuilder getShoppingLoyaltyOrBuilder();
}
