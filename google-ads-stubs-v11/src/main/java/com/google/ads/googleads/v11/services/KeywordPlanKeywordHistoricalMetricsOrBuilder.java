// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

public interface KeywordPlanKeywordHistoricalMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.KeywordPlanKeywordHistoricalMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'cars'.
   * Starting V5, the list of de-duped queries will be included in
   * close_variants field.
   * </pre>
   *
   * <code>optional string search_query = 4;</code>
   * @return Whether the searchQuery field is set.
   */
  boolean hasSearchQuery();
  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'cars'.
   * Starting V5, the list of de-duped queries will be included in
   * close_variants field.
   * </pre>
   *
   * <code>optional string search_query = 4;</code>
   * @return The searchQuery.
   */
  java.lang.String getSearchQuery();
  /**
   * <pre>
   * The text of the query associated with one or more ad_group_keywords in the
   * plan.
   * Note that we de-dupe your keywords list, eliminating close variants before
   * returning the plan's keywords as text. For example, if your plan originally
   * contained the keywords 'car' and 'cars', the returned search query will
   * only contain 'cars'.
   * Starting V5, the list of de-duped queries will be included in
   * close_variants field.
   * </pre>
   *
   * <code>optional string search_query = 4;</code>
   * @return The bytes for searchQuery.
   */
  com.google.protobuf.ByteString
      getSearchQueryBytes();

  /**
   * <pre>
   * The list of close variant queries for search_query whose search results
   * are combined into the search_query.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @return A list containing the closeVariants.
   */
  java.util.List<java.lang.String>
      getCloseVariantsList();
  /**
   * <pre>
   * The list of close variant queries for search_query whose search results
   * are combined into the search_query.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @return The count of closeVariants.
   */
  int getCloseVariantsCount();
  /**
   * <pre>
   * The list of close variant queries for search_query whose search results
   * are combined into the search_query.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @param index The index of the element to return.
   * @return The closeVariants at the given index.
   */
  java.lang.String getCloseVariants(int index);
  /**
   * <pre>
   * The list of close variant queries for search_query whose search results
   * are combined into the search_query.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the closeVariants at the given index.
   */
  com.google.protobuf.ByteString
      getCloseVariantsBytes(int index);

  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return Whether the keywordMetrics field is set.
   */
  boolean hasKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return The keywordMetrics.
   */
  com.google.ads.googleads.v11.common.KeywordPlanHistoricalMetrics getKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for the query associated with one or more
   * ad_group_keywords in the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   */
  com.google.ads.googleads.v11.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordMetricsOrBuilder();
}
