// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/campaign_experiment.proto

package com.google.ads.googleads.v8.resources;

public interface CampaignExperimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.CampaignExperiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign experiment.
   * Campaign experiment resource names have the form:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign experiment.
   * Campaign experiment resource names have the form:
   * `customers/{customer_id}/campaignExperiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the campaign experiment.
   * This field is read-only.
   * </pre>
   *
   * <code>int64 id = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the campaign experiment.
   * This field is read-only.
   * </pre>
   *
   * <code>int64 id = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>string campaign_draft = 14 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaignDraft field is set.
   */
  boolean hasCampaignDraft();
  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>string campaign_draft = 14 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignDraft.
   */
  java.lang.String getCampaignDraft();
  /**
   * <pre>
   * Immutable. The campaign draft with staged changes to the base campaign.
   * </pre>
   *
   * <code>string campaign_draft = 14 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignDraft.
   */
  com.google.protobuf.ByteString
      getCampaignDraftBytes();

  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 15;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 15;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the campaign experiment.
   * This field is required when creating new campaign experiments
   * and must not conflict with the name of another non-removed
   * campaign experiment or campaign.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>string name = 15;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>string description = 16;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>string description = 16;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the experiment.
   * </pre>
   *
   * <code>string description = 16;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Immutable. Share of traffic directed to experiment as a percent (must be between 1 and
   * 99 inclusive. Base campaign receives the remainder of the traffic
   * (100 - traffic_split_percent). Required for create.
   * </pre>
   *
   * <code>int64 traffic_split_percent = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the trafficSplitPercent field is set.
   */
  boolean hasTrafficSplitPercent();
  /**
   * <pre>
   * Immutable. Share of traffic directed to experiment as a percent (must be between 1 and
   * 99 inclusive. Base campaign receives the remainder of the traffic
   * (100 - traffic_split_percent). Required for create.
   * </pre>
   *
   * <code>int64 traffic_split_percent = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The trafficSplitPercent.
   */
  long getTrafficSplitPercent();

  /**
   * <pre>
   * Immutable. Determines the behavior of the traffic split.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType traffic_split_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for trafficSplitType.
   */
  int getTrafficSplitTypeValue();
  /**
   * <pre>
   * Immutable. Determines the behavior of the traffic split.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType traffic_split_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The trafficSplitType.
   */
  com.google.ads.googleads.v8.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType getTrafficSplitType();

  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>string experiment_campaign = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the experimentCampaign field is set.
   */
  boolean hasExperimentCampaign();
  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>string experiment_campaign = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The experimentCampaign.
   */
  java.lang.String getExperimentCampaign();
  /**
   * <pre>
   * Output only. The experiment campaign, as opposed to the base campaign.
   * </pre>
   *
   * <code>string experiment_campaign = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for experimentCampaign.
   */
  com.google.protobuf.ByteString
      getExperimentCampaignBytes();

  /**
   * <pre>
   * Output only. The status of the campaign experiment. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign experiment. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v8.enums.CampaignExperimentStatusEnum.CampaignExperimentStatus getStatus();

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>string long_running_operation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>string long_running_operation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  java.lang.String getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of experiment create or promote. The most recent long
   * running operation is returned.
   * </pre>
   *
   * <code>string long_running_operation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for longRunningOperation.
   */
  com.google.protobuf.ByteString
      getLongRunningOperationBytes();

  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>string start_date = 20;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>string start_date = 20;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Date when the campaign experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone. Cannot be changed once the experiment starts.
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>string start_date = 20;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * The last day of the campaign experiment. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>string end_date = 21;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * The last day of the campaign experiment. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>string end_date = 21;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * The last day of the campaign experiment. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>string end_date = 21;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
