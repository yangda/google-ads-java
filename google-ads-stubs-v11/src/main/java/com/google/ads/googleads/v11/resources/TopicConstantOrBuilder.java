// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/topic_constant.proto

package com.google.ads.googleads.v11.resources;

public interface TopicConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.TopicConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the topic constant.
   * topic constant resource names have the form:
   * `topicConstants/{topic_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the topic constant.
   * topic constant resource names have the form:
   * `topicConstants/{topic_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the topic.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the topic.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>optional string topic_constant_parent = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the topicConstantParent field is set.
   */
  boolean hasTopicConstantParent();
  /**
   * <pre>
   * Output only. Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>optional string topic_constant_parent = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The topicConstantParent.
   */
  java.lang.String getTopicConstantParent();
  /**
   * <pre>
   * Output only. Resource name of parent of the topic constant.
   * </pre>
   *
   * <code>optional string topic_constant_parent = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for topicConstantParent.
   */
  com.google.protobuf.ByteString
      getTopicConstantParentBytes();

  /**
   * <pre>
   * Output only. The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated string path = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the path.
   */
  java.util.List<java.lang.String>
      getPathList();
  /**
   * <pre>
   * Output only. The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated string path = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of path.
   */
  int getPathCount();
  /**
   * <pre>
   * Output only. The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated string path = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  java.lang.String getPath(int index);
  /**
   * <pre>
   * Output only. The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * {"Pets &amp; Animals", "Pets", "Dogs"} represents the
   * "Pets &amp; Animals/Pets/Dogs" category. List of available topic categories at
   * https://developers.google.com/adwords/api/docs/appendix/verticals
   * </pre>
   *
   * <code>repeated string path = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the path at the given index.
   */
  com.google.protobuf.ByteString
      getPathBytes(int index);
}
