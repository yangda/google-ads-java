// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/criterion_category_availability.proto

package com.google.ads.googleads.v7.common;

public interface CriterionCategoryChannelAvailabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.CriterionCategoryChannelAvailability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format of the channel availability. Can be ALL_CHANNELS (the rest of the
   * fields will not be set), CHANNEL_TYPE (only advertising_channel_type type
   * will be set, the category is available to all sub types under it) or
   * CHANNEL_TYPE_AND_SUBTYPES (advertising_channel_type,
   * advertising_channel_sub_type, and include_default_channel_sub_type will all
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode availability_mode = 1;</code>
   * @return The enum numeric value on the wire for availabilityMode.
   */
  int getAvailabilityModeValue();
  /**
   * <pre>
   * Format of the channel availability. Can be ALL_CHANNELS (the rest of the
   * fields will not be set), CHANNEL_TYPE (only advertising_channel_type type
   * will be set, the category is available to all sub types under it) or
   * CHANNEL_TYPE_AND_SUBTYPES (advertising_channel_type,
   * advertising_channel_sub_type, and include_default_channel_sub_type will all
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode availability_mode = 1;</code>
   * @return The availabilityMode.
   */
  com.google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode getAvailabilityMode();

  /**
   * <pre>
   * Channel type the category is available to.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2;</code>
   * @return The enum numeric value on the wire for advertisingChannelType.
   */
  int getAdvertisingChannelTypeValue();
  /**
   * <pre>
   * Channel type the category is available to.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2;</code>
   * @return The advertisingChannelType.
   */
  com.google.ads.googleads.v7.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType getAdvertisingChannelType();

  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   * @return A list containing the advertisingChannelSubType.
   */
  java.util.List<com.google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType> getAdvertisingChannelSubTypeList();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   * @return The count of advertisingChannelSubType.
   */
  int getAdvertisingChannelSubTypeCount();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   * @param index The index of the element to return.
   * @return The advertisingChannelSubType at the given index.
   */
  com.google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType getAdvertisingChannelSubType(int index);
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   * @return A list containing the enum numeric values on the wire for advertisingChannelSubType.
   */
  java.util.List<java.lang.Integer>
  getAdvertisingChannelSubTypeValueList();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of advertisingChannelSubType at the given index.
   */
  int getAdvertisingChannelSubTypeValue(int index);

  /**
   * <pre>
   * Whether default channel sub type is included. For example,
   * advertising_channel_type being DISPLAY and include_default_channel_sub_type
   * being false means that the default display campaign where channel sub type
   * is not set is not included in this availability configuration.
   * </pre>
   *
   * <code>optional bool include_default_channel_sub_type = 5;</code>
   * @return Whether the includeDefaultChannelSubType field is set.
   */
  boolean hasIncludeDefaultChannelSubType();
  /**
   * <pre>
   * Whether default channel sub type is included. For example,
   * advertising_channel_type being DISPLAY and include_default_channel_sub_type
   * being false means that the default display campaign where channel sub type
   * is not set is not included in this availability configuration.
   * </pre>
   *
   * <code>optional bool include_default_channel_sub_type = 5;</code>
   * @return The includeDefaultChannelSubType.
   */
  boolean getIncludeDefaultChannelSubType();
}
