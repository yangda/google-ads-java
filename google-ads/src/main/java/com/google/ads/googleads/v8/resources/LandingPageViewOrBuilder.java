// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/landing_page_view.proto

package com.google.ads.googleads.v8.resources;

public interface LandingPageViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.LandingPageView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the landing page view.
   * Landing page view resource names have the form:
   * `customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the unexpandedFinalUrl field is set.
   */
  boolean hasUnexpandedFinalUrl();
  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The unexpandedFinalUrl.
   */
  java.lang.String getUnexpandedFinalUrl();
  /**
   * <pre>
   * Output only. The advertiser-specified final URL.
   * </pre>
   *
   * <code>string unexpanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for unexpandedFinalUrl.
   */
  com.google.protobuf.ByteString
      getUnexpandedFinalUrlBytes();
}
