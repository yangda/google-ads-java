// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/batch_job_service.proto

package com.google.ads.googleads.v11.services;

public interface BatchJobOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.BatchJobOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.BatchJob create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.BatchJob create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.BatchJob getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.BatchJob create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.BatchJobOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: The batch job must not have been run. A resource name
   * for the removed batch job is expected, in this format:
   * `customers/{customer_id}/batchJobs/{batch_job_id}`
   * </pre>
   *
   * <code>string remove = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: The batch job must not have been run. A resource name
   * for the removed batch job is expected, in this format:
   * `customers/{customer_id}/batchJobs/{batch_job_id}`
   * </pre>
   *
   * <code>string remove = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: The batch job must not have been run. A resource name
   * for the removed batch job is expected, in this format:
   * `customers/{customer_id}/batchJobs/{batch_job_id}`
   * </pre>
   *
   * <code>string remove = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v11.services.BatchJobOperation.OperationCase getOperationCase();
}
