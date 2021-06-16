// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/errors/multiplier_error.proto

package com.google.ads.googleads.v8.errors;

public final class MultiplierErrorProto {
  private MultiplierErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_errors_MultiplierErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_errors_MultiplierErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v8/errors/multipl" +
      "ier_error.proto\022\036google.ads.googleads.v8" +
      ".errors\032\034google/api/annotations.proto\"\317\004" +
      "\n\023MultiplierErrorEnum\"\267\004\n\017MultiplierErro" +
      "r\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\027\n\023MULTI" +
      "PLIER_TOO_HIGH\020\002\022\026\n\022MULTIPLIER_TOO_LOW\020\003" +
      "\022\036\n\032TOO_MANY_FRACTIONAL_DIGITS\020\004\022/\n+MULT" +
      "IPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY\020" +
      "\005\0223\n/MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BI" +
      "D_IS_MISSING\020\006\022\033\n\027NO_MULTIPLIER_SPECIFIE" +
      "D\020\007\0220\n,MULTIPLIER_CAUSES_BID_TO_EXCEED_D" +
      "AILY_BUDGET\020\010\0222\n.MULTIPLIER_CAUSES_BID_T" +
      "O_EXCEED_MONTHLY_BUDGET\020\t\0221\n-MULTIPLIER_" +
      "CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET\020\n\0223\n/" +
      "MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLO" +
      "WED_BID\020\013\0221\n-BID_LESS_THAN_MIN_ALLOWED_B" +
      "ID_WITH_MULTIPLIER\020\014\0221\n-MULTIPLIER_AND_B" +
      "IDDING_STRATEGY_TYPE_MISMATCH\020\rB\357\001\n\"com." +
      "google.ads.googleads.v8.errorsB\024Multipli" +
      "erErrorProtoP\001ZDgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v8/errors;er" +
      "rors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Err" +
      "ors\312\002\036Google\\Ads\\GoogleAds\\V8\\Errors\352\002\"G" +
      "oogle::Ads::GoogleAds::V8::Errorsb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_errors_MultiplierErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_errors_MultiplierErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_errors_MultiplierErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
