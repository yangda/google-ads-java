// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/keyword_theme_constant.proto

package com.google.ads.googleads.v8.resources;

public interface KeywordThemeConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.KeywordThemeConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the keyword theme constant.
   * Keyword theme constant resource names have the form:
   * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the keyword theme constant.
   * Keyword theme constant resource names have the form:
   * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ISO-3166 Alpha-2 country code of the constant, eg. "US".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string country_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166 Alpha-2 country code of the constant, eg. "US".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string country_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166 Alpha-2 country code of the constant, eg. "US".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string country_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Output only. The ISO-639-1 language code with 2 letters of the constant, eg. "en".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * Output only. The ISO-639-1 language code with 2 letters of the constant, eg. "en".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Output only. The ISO-639-1 language code with 2 letters of the constant, eg. "en".
   * To display and query matching purpose, the keyword theme needs to be
   * localized.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Output only. The display name of the keyword theme or sub keyword theme.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * Output only. The display name of the keyword theme or sub keyword theme.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. The display name of the keyword theme or sub keyword theme.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
