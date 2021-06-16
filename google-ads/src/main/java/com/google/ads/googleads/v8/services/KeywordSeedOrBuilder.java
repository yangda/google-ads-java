// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v8.services;

public interface KeywordSeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.KeywordSeed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return A list containing the keywords.
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return The count of keywords.
   */
  int getKeywordsCount();
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  java.lang.String getKeywords(int index);
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);
}
