// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/segments.proto

package com.google.ads.googleads.v7.common;

public interface KeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.Keyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return Whether the adGroupCriterion field is set.
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return The adGroupCriterion.
   */
  java.lang.String getAdGroupCriterion();
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return The bytes for adGroupCriterion.
   */
  com.google.protobuf.ByteString
      getAdGroupCriterionBytes();

  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordInfo info = 2;</code>
   * @return The info.
   */
  com.google.ads.googleads.v7.common.KeywordInfo getInfo();
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.KeywordInfo info = 2;</code>
   */
  com.google.ads.googleads.v7.common.KeywordInfoOrBuilder getInfoOrBuilder();
}
