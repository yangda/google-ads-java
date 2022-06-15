// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/ad_type_infos.proto

package com.google.ads.googleads.v11.common;

public interface VideoTrueViewInStreamAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.VideoTrueViewInStreamAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The actionButtonLabel.
   */
  java.lang.String getActionButtonLabel();
  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The bytes for actionButtonLabel.
   */
  com.google.protobuf.ByteString
      getActionButtonLabelBytes();

  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The actionHeadline.
   */
  java.lang.String getActionHeadline();
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The bytes for actionHeadline.
   */
  com.google.protobuf.ByteString
      getActionHeadlineBytes();

  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdImageAsset companion_banner = 7;</code>
   * @return Whether the companionBanner field is set.
   */
  boolean hasCompanionBanner();
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdImageAsset companion_banner = 7;</code>
   * @return The companionBanner.
   */
  com.google.ads.googleads.v11.common.AdImageAsset getCompanionBanner();
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdImageAsset companion_banner = 7;</code>
   */
  com.google.ads.googleads.v11.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder();
}
