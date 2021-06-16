// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/conversion_upload_service.proto

package com.google.ads.googleads.v8.services;

public interface CartDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.CartData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Merchant Center ID where the items are uploaded.
   * </pre>
   *
   * <code>string merchant_id = 1;</code>
   * @return The merchantId.
   */
  java.lang.String getMerchantId();
  /**
   * <pre>
   * The Merchant Center ID where the items are uploaded.
   * </pre>
   *
   * <code>string merchant_id = 1;</code>
   * @return The bytes for merchantId.
   */
  com.google.protobuf.ByteString
      getMerchantIdBytes();

  /**
   * <pre>
   * The country code associated with the feed where the items are uploaded.
   * </pre>
   *
   * <code>string feed_country_code = 2;</code>
   * @return The feedCountryCode.
   */
  java.lang.String getFeedCountryCode();
  /**
   * <pre>
   * The country code associated with the feed where the items are uploaded.
   * </pre>
   *
   * <code>string feed_country_code = 2;</code>
   * @return The bytes for feedCountryCode.
   */
  com.google.protobuf.ByteString
      getFeedCountryCodeBytes();

  /**
   * <pre>
   * The language code associated with the feed where the items are uploaded.
   * </pre>
   *
   * <code>string feed_language_code = 3;</code>
   * @return The feedLanguageCode.
   */
  java.lang.String getFeedLanguageCode();
  /**
   * <pre>
   * The language code associated with the feed where the items are uploaded.
   * </pre>
   *
   * <code>string feed_language_code = 3;</code>
   * @return The bytes for feedLanguageCode.
   */
  com.google.protobuf.ByteString
      getFeedLanguageCodeBytes();

  /**
   * <pre>
   * Sum of all transaction level discounts, such as free shipping and
   * coupon discounts for the whole cart. The currency code is the same
   * as that in the ClickConversion message.
   * </pre>
   *
   * <code>double local_transaction_cost = 4;</code>
   * @return The localTransactionCost.
   */
  double getLocalTransactionCost();

  /**
   * <pre>
   * Data of the items purchased.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CartData.Item items = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v8.services.CartData.Item> 
      getItemsList();
  /**
   * <pre>
   * Data of the items purchased.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CartData.Item items = 5;</code>
   */
  com.google.ads.googleads.v8.services.CartData.Item getItems(int index);
  /**
   * <pre>
   * Data of the items purchased.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CartData.Item items = 5;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * Data of the items purchased.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CartData.Item items = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.services.CartData.ItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * Data of the items purchased.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CartData.Item items = 5;</code>
   */
  com.google.ads.googleads.v8.services.CartData.ItemOrBuilder getItemsOrBuilder(
      int index);
}
