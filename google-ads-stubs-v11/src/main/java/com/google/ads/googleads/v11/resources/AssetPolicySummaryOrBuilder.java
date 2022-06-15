// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/asset.proto

package com.google.ads.googleads.v11.resources;

public interface AssetPolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.AssetPolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * Output only. The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * Output only. The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * Output only. The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * Output only. The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Where in the review process this asset is.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for reviewStatus.
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Output only. Where in the review process this asset is.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reviewStatus.
   */
  com.google.ads.googleads.v11.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * Output only. The overall approval status of this asset, calculated based on the status
   * of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvalStatus.
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * Output only. The overall approval status of this asset, calculated based on the status
   * of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvalStatus.
   */
  com.google.ads.googleads.v11.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();
}
