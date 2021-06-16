// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/custom_audience.proto

package com.google.ads.googleads.v8.resources;

public interface CustomAudienceMemberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.CustomAudienceMember)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of custom audience member, KEYWORD, URL, PLACE_CATEGORY or APP.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CustomAudienceMemberTypeEnum.CustomAudienceMemberType member_type = 1;</code>
   * @return The enum numeric value on the wire for memberType.
   */
  int getMemberTypeValue();
  /**
   * <pre>
   * The type of custom audience member, KEYWORD, URL, PLACE_CATEGORY or APP.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CustomAudienceMemberTypeEnum.CustomAudienceMemberType member_type = 1;</code>
   * @return The memberType.
   */
  com.google.ads.googleads.v8.enums.CustomAudienceMemberTypeEnum.CustomAudienceMemberType getMemberType();

  /**
   * <pre>
   * A keyword or keyword phrase — at most 10 words and 80 characters.
   * Languages with double-width characters such as Chinese, Japanese,
   * or Korean, are allowed 40 characters, which describes the user's
   * interests or actions.
   * </pre>
   *
   * <code>string keyword = 2;</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * A keyword or keyword phrase — at most 10 words and 80 characters.
   * Languages with double-width characters such as Chinese, Japanese,
   * or Korean, are allowed 40 characters, which describes the user's
   * interests or actions.
   * </pre>
   *
   * <code>string keyword = 2;</code>
   * @return The keyword.
   */
  java.lang.String getKeyword();
  /**
   * <pre>
   * A keyword or keyword phrase — at most 10 words and 80 characters.
   * Languages with double-width characters such as Chinese, Japanese,
   * or Korean, are allowed 40 characters, which describes the user's
   * interests or actions.
   * </pre>
   *
   * <code>string keyword = 2;</code>
   * @return The bytes for keyword.
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <pre>
   * An HTTP URL, protocol-included — at most 2048 characters, which includes
   * contents users have interests in.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * An HTTP URL, protocol-included — at most 2048 characters, which includes
   * contents users have interests in.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * An HTTP URL, protocol-included — at most 2048 characters, which includes
   * contents users have interests in.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * A place type described by a place category users visit.
   * </pre>
   *
   * <code>int64 place_category = 4;</code>
   * @return Whether the placeCategory field is set.
   */
  boolean hasPlaceCategory();
  /**
   * <pre>
   * A place type described by a place category users visit.
   * </pre>
   *
   * <code>int64 place_category = 4;</code>
   * @return The placeCategory.
   */
  long getPlaceCategory();

  /**
   * <pre>
   * A package name of Android apps which users installed such as
   * com.google.example.
   * </pre>
   *
   * <code>string app = 5;</code>
   * @return Whether the app field is set.
   */
  boolean hasApp();
  /**
   * <pre>
   * A package name of Android apps which users installed such as
   * com.google.example.
   * </pre>
   *
   * <code>string app = 5;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * A package name of Android apps which users installed such as
   * com.google.example.
   * </pre>
   *
   * <code>string app = 5;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  public com.google.ads.googleads.v8.resources.CustomAudienceMember.ValueCase getValueCase();
}
