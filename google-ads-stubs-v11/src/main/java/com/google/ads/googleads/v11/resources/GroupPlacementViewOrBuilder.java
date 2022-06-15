// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/group_placement_view.proto

package com.google.ads.googleads.v11.resources;

public interface GroupPlacementViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.GroupPlacementView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the group placement view.
   * Group placement view resource names have the form:
   * `customers/{customer_id}/groupPlacementViews/{ad_group_id}~{base64_placement}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the group placement view.
   * Group placement view resource names have the form:
   * `customers/{customer_id}/groupPlacementViews/{ad_group_id}~{base64_placement}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The automatic placement string at group level, e. g. web domain, mobile
   * app ID, or a YouTube channel ID.
   * </pre>
   *
   * <code>optional string placement = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Output only. The automatic placement string at group level, e. g. web domain, mobile
   * app ID, or a YouTube channel ID.
   * </pre>
   *
   * <code>optional string placement = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placement.
   */
  java.lang.String getPlacement();
  /**
   * <pre>
   * Output only. The automatic placement string at group level, e. g. web domain, mobile
   * app ID, or a YouTube channel ID.
   * </pre>
   *
   * <code>optional string placement = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for placement.
   */
  com.google.protobuf.ByteString
      getPlacementBytes();

  /**
   * <pre>
   * Output only. Domain name for websites and YouTube channel name for YouTube channels.
   * </pre>
   *
   * <code>optional string display_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * Output only. Domain name for websites and YouTube channel name for YouTube channels.
   * </pre>
   *
   * <code>optional string display_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. Domain name for websites and YouTube channel name for YouTube channels.
   * </pre>
   *
   * <code>optional string display_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>optional string target_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetUrl field is set.
   */
  boolean hasTargetUrl();
  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>optional string target_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetUrl.
   */
  java.lang.String getTargetUrl();
  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>optional string target_url = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for targetUrl.
   */
  com.google.protobuf.ByteString
      getTargetUrlBytes();

  /**
   * <pre>
   * Output only. Type of the placement, e.g. Website, YouTube Channel, Mobile Application.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PlacementTypeEnum.PlacementType placement_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for placementType.
   */
  int getPlacementTypeValue();
  /**
   * <pre>
   * Output only. Type of the placement, e.g. Website, YouTube Channel, Mobile Application.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.PlacementTypeEnum.PlacementType placement_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placementType.
   */
  com.google.ads.googleads.v11.enums.PlacementTypeEnum.PlacementType getPlacementType();
}
