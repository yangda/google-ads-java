// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/customer_user_access_service.proto

package com.google.ads.googleads.v8.services;

public interface CustomerUserAccessOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.CustomerUserAccessOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The customer user access is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.CustomerUserAccess update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The customer user access is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.CustomerUserAccess update = 1;</code>
   * @return The update.
   */
  com.google.ads.googleads.v8.resources.CustomerUserAccess getUpdate();
  /**
   * <pre>
   * Update operation: The customer user access is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.CustomerUserAccess update = 1;</code>
   */
  com.google.ads.googleads.v8.resources.CustomerUserAccessOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed access is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccesses/{CustomerUserAccess.user_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed access is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccesses/{CustomerUserAccess.user_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed access is
   * expected, in this format:
   * `customers/{customer_id}/customerUserAccesses/{CustomerUserAccess.user_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v8.services.CustomerUserAccessOperation.OperationCase getOperationCase();
}
