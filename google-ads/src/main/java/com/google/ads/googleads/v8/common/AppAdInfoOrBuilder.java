// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/ad_type_infos.proto

package com.google.ads.googleads.v8.common;

public interface AppAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.AppAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mandatory ad text.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.AdTextAsset mandatory_ad_text = 1;</code>
   * @return Whether the mandatoryAdText field is set.
   */
  boolean hasMandatoryAdText();
  /**
   * <pre>
   * Mandatory ad text.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.AdTextAsset mandatory_ad_text = 1;</code>
   * @return The mandatoryAdText.
   */
  com.google.ads.googleads.v8.common.AdTextAsset getMandatoryAdText();
  /**
   * <pre>
   * Mandatory ad text.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.AdTextAsset mandatory_ad_text = 1;</code>
   */
  com.google.ads.googleads.v8.common.AdTextAssetOrBuilder getMandatoryAdTextOrBuilder();

  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset headlines = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset headlines = 2;</code>
   */
  com.google.ads.googleads.v8.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset headlines = 2;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset headlines = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset headlines = 2;</code>
   */
  com.google.ads.googleads.v8.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset descriptions = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset descriptions = 3;</code>
   */
  com.google.ads.googleads.v8.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset descriptions = 3;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset descriptions = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdTextAsset descriptions = 3;</code>
   */
  com.google.ads.googleads.v8.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * List of image assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdImageAsset images = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdImageAsset> 
      getImagesList();
  /**
   * <pre>
   * List of image assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdImageAsset images = 4;</code>
   */
  com.google.ads.googleads.v8.common.AdImageAsset getImages(int index);
  /**
   * <pre>
   * List of image assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdImageAsset images = 4;</code>
   */
  int getImagesCount();
  /**
   * <pre>
   * List of image assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdImageAsset images = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdImageAssetOrBuilder> 
      getImagesOrBuilderList();
  /**
   * <pre>
   * List of image assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdImageAsset images = 4;</code>
   */
  com.google.ads.googleads.v8.common.AdImageAssetOrBuilder getImagesOrBuilder(
      int index);

  /**
   * <pre>
   * List of YouTube video assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdVideoAsset youtube_videos = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdVideoAsset> 
      getYoutubeVideosList();
  /**
   * <pre>
   * List of YouTube video assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdVideoAsset youtube_videos = 5;</code>
   */
  com.google.ads.googleads.v8.common.AdVideoAsset getYoutubeVideos(int index);
  /**
   * <pre>
   * List of YouTube video assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdVideoAsset youtube_videos = 5;</code>
   */
  int getYoutubeVideosCount();
  /**
   * <pre>
   * List of YouTube video assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdVideoAsset youtube_videos = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdVideoAssetOrBuilder> 
      getYoutubeVideosOrBuilderList();
  /**
   * <pre>
   * List of YouTube video assets that may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdVideoAsset youtube_videos = 5;</code>
   */
  com.google.ads.googleads.v8.common.AdVideoAssetOrBuilder getYoutubeVideosOrBuilder(
      int index);

  /**
   * <pre>
   * List of media bundle assets that may be used with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdMediaBundleAsset html5_media_bundles = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdMediaBundleAsset> 
      getHtml5MediaBundlesList();
  /**
   * <pre>
   * List of media bundle assets that may be used with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdMediaBundleAsset html5_media_bundles = 6;</code>
   */
  com.google.ads.googleads.v8.common.AdMediaBundleAsset getHtml5MediaBundles(int index);
  /**
   * <pre>
   * List of media bundle assets that may be used with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdMediaBundleAsset html5_media_bundles = 6;</code>
   */
  int getHtml5MediaBundlesCount();
  /**
   * <pre>
   * List of media bundle assets that may be used with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdMediaBundleAsset html5_media_bundles = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdMediaBundleAssetOrBuilder> 
      getHtml5MediaBundlesOrBuilderList();
  /**
   * <pre>
   * List of media bundle assets that may be used with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdMediaBundleAsset html5_media_bundles = 6;</code>
   */
  com.google.ads.googleads.v8.common.AdMediaBundleAssetOrBuilder getHtml5MediaBundlesOrBuilder(
      int index);
}
