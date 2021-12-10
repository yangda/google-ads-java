// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/frequency_cap.proto

package com.google.ads.googleads.v8.common;

public interface FrequencyCapEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.FrequencyCapEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.FrequencyCapKey key = 1;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.FrequencyCapKey key = 1;</code>
   * @return The key.
   */
  com.google.ads.googleads.v8.common.FrequencyCapKey getKey();
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.FrequencyCapKey key = 1;</code>
   */
  com.google.ads.googleads.v8.common.FrequencyCapKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>optional int32 cap = 3;</code>
   * @return Whether the cap field is set.
   */
  boolean hasCap();
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>optional int32 cap = 3;</code>
   * @return The cap.
   */
  int getCap();
}
