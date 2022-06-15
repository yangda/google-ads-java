// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/final_app_url.proto

package com.google.ads.googleads.v11.common;

public interface FinalAppUrlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.FinalAppUrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operating system targeted by this URL. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
   * @return The enum numeric value on the wire for osType.
   */
  int getOsTypeValue();
  /**
   * <pre>
   * The operating system targeted by this URL. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
   * @return The osType.
   */
  com.google.ads.googleads.v11.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType getOsType();

  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
