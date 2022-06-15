// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/ad_group_extension_setting.proto

package com.google.ads.googleads.v11.resources;

public interface AdGroupExtensionSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.AdGroupExtensionSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group extension setting.
   * AdGroupExtensionSetting resource names have the form:
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group extension setting.
   * AdGroupExtensionSetting resource names have the form:
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The extension type of the ad group extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for extensionType.
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * Immutable. The extension type of the ad group extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The extensionType.
   */
  com.google.ads.googleads.v11.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Immutable. The resource name of the ad group. The linked extension feed items will
   * serve under this ad group.
   * AdGroup resource names have the form:
   * `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 7 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the extensionFeedItems.
   */
  java.util.List<java.lang.String>
      getExtensionFeedItemsList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 7 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of extensionFeedItems.
   */
  int getExtensionFeedItemsCount();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 7 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The extensionFeedItems at the given index.
   */
  java.lang.String getExtensionFeedItems(int index);
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the ad group.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 7 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the extensionFeedItems at the given index.
   */
  com.google.protobuf.ByteString
      getExtensionFeedItemsBytes(int index);

  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 5;</code>
   * @return The device.
   */
  com.google.ads.googleads.v11.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice getDevice();
}
