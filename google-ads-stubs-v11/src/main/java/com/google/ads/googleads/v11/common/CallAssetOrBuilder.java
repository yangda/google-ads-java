// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/asset_types.proto

package com.google.ads.googleads.v11.common;

public interface CallAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.CallAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Two-letter country code of the phone number. Examples: 'US', 'us'.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Required. Two-letter country code of the phone number. Examples: 'US', 'us'.
   * </pre>
   *
   * <code>string country_code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Required. The advertiser's raw phone number. Examples: '1234567890', '(123)456-7890'
   * </pre>
   *
   * <code>string phone_number = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * Required. The advertiser's raw phone number. Examples: '1234567890', '(123)456-7890'
   * </pre>
   *
   * <code>string phone_number = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * Indicates whether this CallAsset should use its own call conversion
   * setting, follow the account level setting, or disable call conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 3;</code>
   * @return The enum numeric value on the wire for callConversionReportingState.
   */
  int getCallConversionReportingStateValue();
  /**
   * <pre>
   * Indicates whether this CallAsset should use its own call conversion
   * setting, follow the account level setting, or disable call conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 3;</code>
   * @return The callConversionReportingState.
   */
  com.google.ads.googleads.v11.enums.CallConversionReportingStateEnum.CallConversionReportingState getCallConversionReportingState();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set, the
   * default conversion action is used. This field only has effect if
   * call_conversion_reporting_state is set to
   * USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION.
   * </pre>
   *
   * <code>string call_conversion_action = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The callConversionAction.
   */
  java.lang.String getCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set, the
   * default conversion action is used. This field only has effect if
   * call_conversion_reporting_state is set to
   * USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION.
   * </pre>
   *
   * <code>string call_conversion_action = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for callConversionAction.
   */
  com.google.protobuf.ByteString
      getCallConversionActionBytes();

  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdScheduleInfo ad_schedule_targets = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AdScheduleInfo> 
      getAdScheduleTargetsList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdScheduleInfo ad_schedule_targets = 5;</code>
   */
  com.google.ads.googleads.v11.common.AdScheduleInfo getAdScheduleTargets(int index);
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdScheduleInfo ad_schedule_targets = 5;</code>
   */
  int getAdScheduleTargetsCount();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdScheduleInfo ad_schedule_targets = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AdScheduleInfoOrBuilder> 
      getAdScheduleTargetsOrBuilderList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AdScheduleInfo ad_schedule_targets = 5;</code>
   */
  com.google.ads.googleads.v11.common.AdScheduleInfoOrBuilder getAdScheduleTargetsOrBuilder(
      int index);
}
