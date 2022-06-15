// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/ad_type_infos.proto

package com.google.ads.googleads.v11.common;

public interface DisplayCallToActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.DisplayCallToAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return Whether the textColor field is set.
   */
  boolean hasTextColor();
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return The textColor.
   */
  java.lang.String getTextColor();
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return The bytes for textColor.
   */
  com.google.protobuf.ByteString
      getTextColorBytes();

  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return Whether the urlCollectionId field is set.
   */
  boolean hasUrlCollectionId();
  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return The urlCollectionId.
   */
  java.lang.String getUrlCollectionId();
  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return The bytes for urlCollectionId.
   */
  com.google.protobuf.ByteString
      getUrlCollectionIdBytes();
}
