// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v8.services;

public interface UploadConversionAdjustmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.UploadConversionAdjustmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Errors that pertain to conversion adjustment failures in the partial
   * failure mode. Returned when all errors occur inside the adjustments. If any
   * errors occur outside the adjustments (e.g. auth errors), we return an RPC
   * level error.
   * See
   * https://developers.google.com/google-ads/api/docs/best-practices/partial-failures
   * for more information about partial failure.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to conversion adjustment failures in the partial
   * failure mode. Returned when all errors occur inside the adjustments. If any
   * errors occur outside the adjustments (e.g. auth errors), we return an RPC
   * level error.
   * See
   * https://developers.google.com/google-ads/api/docs/best-practices/partial-failures
   * for more information about partial failure.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to conversion adjustment failures in the partial
   * failure mode. Returned when all errors occur inside the adjustments. If any
   * errors occur outside the adjustments (e.g. auth errors), we return an RPC
   * level error.
   * See
   * https://developers.google.com/google-ads/api/docs/best-practices/partial-failures
   * for more information about partial failure.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();

  /**
   * <pre>
   * Returned for successfully processed conversion adjustments. Proto will be
   * empty for rows that received an error. Results are not returned when
   * validate_only is true.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.ConversionAdjustmentResult results = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v8.services.ConversionAdjustmentResult> 
      getResultsList();
  /**
   * <pre>
   * Returned for successfully processed conversion adjustments. Proto will be
   * empty for rows that received an error. Results are not returned when
   * validate_only is true.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.ConversionAdjustmentResult results = 2;</code>
   */
  com.google.ads.googleads.v8.services.ConversionAdjustmentResult getResults(int index);
  /**
   * <pre>
   * Returned for successfully processed conversion adjustments. Proto will be
   * empty for rows that received an error. Results are not returned when
   * validate_only is true.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.ConversionAdjustmentResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Returned for successfully processed conversion adjustments. Proto will be
   * empty for rows that received an error. Results are not returned when
   * validate_only is true.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.ConversionAdjustmentResult results = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.services.ConversionAdjustmentResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Returned for successfully processed conversion adjustments. Proto will be
   * empty for rows that received an error. Results are not returned when
   * validate_only is true.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.ConversionAdjustmentResult results = 2;</code>
   */
  com.google.ads.googleads.v8.services.ConversionAdjustmentResultOrBuilder getResultsOrBuilder(
      int index);
}
