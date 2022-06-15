// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/offline_user_data_job.proto

package com.google.ads.googleads.v11.resources;

public interface OfflineUserDataJobMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.OfflineUserDataJobMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Match rate of the Customer Match user list upload. Describes the estimated
   * match rate when the status of the job is "RUNNING" and final match rate
   * when the final match rate is available after the status of the job is
   * "SUCCESS/FAILED".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for matchRateRange.
   */
  int getMatchRateRangeValue();
  /**
   * <pre>
   * Output only. Match rate of the Customer Match user list upload. Describes the estimated
   * match rate when the status of the job is "RUNNING" and final match rate
   * when the final match rate is available after the status of the job is
   * "SUCCESS/FAILED".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The matchRateRange.
   */
  com.google.ads.googleads.v11.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange getMatchRateRange();
}
