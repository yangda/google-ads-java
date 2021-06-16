// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/ad_type_infos.proto

package com.google.ads.googleads.v8.common;

public interface GmailAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.GmailAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.GmailTeaser teaser = 1;</code>
   * @return Whether the teaser field is set.
   */
  boolean hasTeaser();
  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.GmailTeaser teaser = 1;</code>
   * @return The teaser.
   */
  com.google.ads.googleads.v8.common.GmailTeaser getTeaser();
  /**
   * <pre>
   * The Gmail teaser.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.GmailTeaser teaser = 1;</code>
   */
  com.google.ads.googleads.v8.common.GmailTeaserOrBuilder getTeaserOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>string header_image = 10;</code>
   * @return Whether the headerImage field is set.
   */
  boolean hasHeaderImage();
  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>string header_image = 10;</code>
   * @return The headerImage.
   */
  java.lang.String getHeaderImage();
  /**
   * <pre>
   * The MediaFile resource name of the header image. Valid image types are GIF,
   * JPEG and PNG. The minimum size is 300x100 pixels and the aspect ratio must
   * be between 3:1 and 5:1 (+-1%).
   * </pre>
   *
   * <code>string header_image = 10;</code>
   * @return The bytes for headerImage.
   */
  com.google.protobuf.ByteString
      getHeaderImageBytes();

  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>string marketing_image = 11;</code>
   * @return Whether the marketingImage field is set.
   */
  boolean hasMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>string marketing_image = 11;</code>
   * @return The marketingImage.
   */
  java.lang.String getMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image. Valid image types are
   * GIF, JPEG and PNG. The image must either be landscape with a minimum size
   * of 600x314 pixels and aspect ratio of 600:314 (+-1%) or square with a
   * minimum size of 300x300 pixels and aspect ratio of 1:1 (+-1%)
   * </pre>
   *
   * <code>string marketing_image = 11;</code>
   * @return The bytes for marketingImage.
   */
  com.google.protobuf.ByteString
      getMarketingImageBytes();

  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_headline = 12;</code>
   * @return Whether the marketingImageHeadline field is set.
   */
  boolean hasMarketingImageHeadline();
  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_headline = 12;</code>
   * @return The marketingImageHeadline.
   */
  java.lang.String getMarketingImageHeadline();
  /**
   * <pre>
   * Headline of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_headline = 12;</code>
   * @return The bytes for marketingImageHeadline.
   */
  com.google.protobuf.ByteString
      getMarketingImageHeadlineBytes();

  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_description = 13;</code>
   * @return Whether the marketingImageDescription field is set.
   */
  boolean hasMarketingImageDescription();
  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_description = 13;</code>
   * @return The marketingImageDescription.
   */
  java.lang.String getMarketingImageDescription();
  /**
   * <pre>
   * Description of the marketing image.
   * </pre>
   *
   * <code>string marketing_image_description = 13;</code>
   * @return The bytes for marketingImageDescription.
   */
  com.google.protobuf.ByteString
      getMarketingImageDescriptionBytes();

  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   * @return Whether the marketingImageDisplayCallToAction field is set.
   */
  boolean hasMarketingImageDisplayCallToAction();
  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   * @return The marketingImageDisplayCallToAction.
   */
  com.google.ads.googleads.v8.common.DisplayCallToAction getMarketingImageDisplayCallToAction();
  /**
   * <pre>
   * Display-call-to-action of the marketing image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction marketing_image_display_call_to_action = 6;</code>
   */
  com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder getMarketingImageDisplayCallToActionOrBuilder();

  /**
   * <pre>
   * Product images. Up to 15 images are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductImage product_images = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.ProductImage> 
      getProductImagesList();
  /**
   * <pre>
   * Product images. Up to 15 images are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductImage product_images = 7;</code>
   */
  com.google.ads.googleads.v8.common.ProductImage getProductImages(int index);
  /**
   * <pre>
   * Product images. Up to 15 images are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductImage product_images = 7;</code>
   */
  int getProductImagesCount();
  /**
   * <pre>
   * Product images. Up to 15 images are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductImage product_images = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.ProductImageOrBuilder> 
      getProductImagesOrBuilderList();
  /**
   * <pre>
   * Product images. Up to 15 images are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductImage product_images = 7;</code>
   */
  com.google.ads.googleads.v8.common.ProductImageOrBuilder getProductImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Product videos. Up to 7 videos are supported. At least one product video
   * or a marketing image must be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductVideo product_videos = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.ProductVideo> 
      getProductVideosList();
  /**
   * <pre>
   * Product videos. Up to 7 videos are supported. At least one product video
   * or a marketing image must be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductVideo product_videos = 8;</code>
   */
  com.google.ads.googleads.v8.common.ProductVideo getProductVideos(int index);
  /**
   * <pre>
   * Product videos. Up to 7 videos are supported. At least one product video
   * or a marketing image must be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductVideo product_videos = 8;</code>
   */
  int getProductVideosCount();
  /**
   * <pre>
   * Product videos. Up to 7 videos are supported. At least one product video
   * or a marketing image must be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductVideo product_videos = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.ProductVideoOrBuilder> 
      getProductVideosOrBuilderList();
  /**
   * <pre>
   * Product videos. Up to 7 videos are supported. At least one product video
   * or a marketing image must be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.ProductVideo product_videos = 8;</code>
   */
  com.google.ads.googleads.v8.common.ProductVideoOrBuilder getProductVideosOrBuilder(
      int index);
}
