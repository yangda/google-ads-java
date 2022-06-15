// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/ad_type_infos.proto

package com.google.ads.googleads.v11.common;

public interface DisplayUploadAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.DisplayUploadAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The product type of this ad. See comments on the enum for details.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
   * @return The enum numeric value on the wire for displayUploadProductType.
   */
  int getDisplayUploadProductTypeValue();
  /**
   * <pre>
   * The product type of this ad. See comments on the enum for details.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType display_upload_product_type = 1;</code>
   * @return The displayUploadProductType.
   */
  com.google.ads.googleads.v11.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType getDisplayUploadProductType();

  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdMediaBundleAsset media_bundle = 2;</code>
   * @return Whether the mediaBundle field is set.
   */
  boolean hasMediaBundle();
  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdMediaBundleAsset media_bundle = 2;</code>
   * @return The mediaBundle.
   */
  com.google.ads.googleads.v11.common.AdMediaBundleAsset getMediaBundle();
  /**
   * <pre>
   * A media bundle asset to be used in the ad. For information about the
   * media bundle for HTML5_UPLOAD_AD, see
   * https://support.google.com/google-ads/answer/1722096
   * Media bundles that are part of dynamic product types use a special format
   * that needs to be created through the Google Web Designer. See
   * https://support.google.com/webdesigner/answer/7543898 for more
   * information.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AdMediaBundleAsset media_bundle = 2;</code>
   */
  com.google.ads.googleads.v11.common.AdMediaBundleAssetOrBuilder getMediaBundleOrBuilder();

  public com.google.ads.googleads.v11.common.DisplayUploadAdInfo.MediaAssetCase getMediaAssetCase();
}
