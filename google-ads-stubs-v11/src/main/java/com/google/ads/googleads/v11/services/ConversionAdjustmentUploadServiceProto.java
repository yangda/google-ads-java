// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v11.services;

public final class ConversionAdjustmentUploadServiceProto {
  private ConversionAdjustmentUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ConversionAdjustment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ConversionAdjustment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_RestatementValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_RestatementValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_GclidDateTimePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_GclidDateTimePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ConversionAdjustmentResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ConversionAdjustmentResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v11/services/conv" +
      "ersion_adjustment_upload_service.proto\022!" +
      "google.ads.googleads.v11.services\0327googl" +
      "e/ads/googleads/v11/common/offline_user_" +
      "data.proto\032?google/ads/googleads/v11/enu" +
      "ms/conversion_adjustment_type.proto\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\037google/api/field_behavior.pr" +
      "oto\032\027google/rpc/status.proto\"\321\001\n\"UploadC" +
      "onversionAdjustmentsRequest\022\030\n\013customer_" +
      "id\030\001 \001(\tB\003\340A\002\022\\\n\026conversion_adjustments\030" +
      "\002 \003(\01327.google.ads.googleads.v11.service" +
      "s.ConversionAdjustmentB\003\340A\002\022\034\n\017partial_f" +
      "ailure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\"\250\001\n#UploadConversionAdjustmentsResponse" +
      "\0221\n\025partial_failure_error\030\001 \001(\0132\022.google" +
      ".rpc.Status\022N\n\007results\030\002 \003(\0132=.google.ad" +
      "s.googleads.v11.services.ConversionAdjus" +
      "tmentResult\"\263\004\n\024ConversionAdjustment\022R\n\024" +
      "gclid_date_time_pair\030\014 \001(\01324.google.ads." +
      "googleads.v11.services.GclidDateTimePair" +
      "\022\025\n\010order_id\030\r \001(\tH\000\210\001\001\022\036\n\021conversion_ac" +
      "tion\030\010 \001(\tH\001\210\001\001\022!\n\024adjustment_date_time\030" +
      "\t \001(\tH\002\210\001\001\022n\n\017adjustment_type\030\005 \001(\0162U.go" +
      "ogle.ads.googleads.v11.enums.ConversionA" +
      "djustmentTypeEnum.ConversionAdjustmentTy" +
      "pe\022N\n\021restatement_value\030\006 \001(\01323.google.a" +
      "ds.googleads.v11.services.RestatementVal" +
      "ue\022I\n\020user_identifiers\030\n \003(\0132/.google.ad" +
      "s.googleads.v11.common.UserIdentifier\022\027\n" +
      "\nuser_agent\030\013 \001(\tH\003\210\001\001B\013\n\t_order_idB\024\n\022_" +
      "conversion_actionB\027\n\025_adjustment_date_ti" +
      "meB\r\n\013_user_agent\"p\n\020RestatementValue\022\033\n" +
      "\016adjusted_value\030\003 \001(\001H\000\210\001\001\022\032\n\rcurrency_c" +
      "ode\030\004 \001(\tH\001\210\001\001B\021\n\017_adjusted_valueB\020\n\016_cu" +
      "rrency_code\"m\n\021GclidDateTimePair\022\022\n\005gcli" +
      "d\030\003 \001(\tH\000\210\001\001\022!\n\024conversion_date_time\030\004 \001" +
      "(\tH\001\210\001\001B\010\n\006_gclidB\027\n\025_conversion_date_ti" +
      "me\"\344\002\n\032ConversionAdjustmentResult\022R\n\024gcl" +
      "id_date_time_pair\030\t \001(\01324.google.ads.goo" +
      "gleads.v11.services.GclidDateTimePair\022\020\n" +
      "\010order_id\030\n \001(\t\022\036\n\021conversion_action\030\007 \001" +
      "(\tH\000\210\001\001\022!\n\024adjustment_date_time\030\010 \001(\tH\001\210" +
      "\001\001\022n\n\017adjustment_type\030\005 \001(\0162U.google.ads" +
      ".googleads.v11.enums.ConversionAdjustmen" +
      "tTypeEnum.ConversionAdjustmentTypeB\024\n\022_c" +
      "onversion_actionB\027\n\025_adjustment_date_tim" +
      "e2\225\003\n!ConversionAdjustmentUploadService\022" +
      "\250\002\n\033UploadConversionAdjustments\022E.google" +
      ".ads.googleads.v11.services.UploadConver" +
      "sionAdjustmentsRequest\032F.google.ads.goog" +
      "leads.v11.services.UploadConversionAdjus" +
      "tmentsResponse\"z\202\323\344\223\002?\":/v11/customers/{" +
      "customer_id=*}:uploadConversionAdjustmen" +
      "ts:\001*\332A2customer_id,conversion_adjustmen" +
      "ts,partial_failure\032E\312A\030googleads.googlea" +
      "pis.com\322A\'https://www.googleapis.com/aut" +
      "h/adwordsB\222\002\n%com.google.ads.googleads.v" +
      "11.servicesB&ConversionAdjustmentUploadS" +
      "erviceProtoP\001ZIgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v11/services;" +
      "services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      "1.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Se" +
      "rvices\352\002%Google::Ads::GoogleAds::V11::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionAdjustmentTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ConversionAdjustments", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadConversionAdjustmentsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_ConversionAdjustment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_ConversionAdjustment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ConversionAdjustment_descriptor,
        new java.lang.String[] { "GclidDateTimePair", "OrderId", "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "RestatementValue", "UserIdentifiers", "UserAgent", "OrderId", "ConversionAction", "AdjustmentDateTime", "UserAgent", });
    internal_static_google_ads_googleads_v11_services_RestatementValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_RestatementValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_RestatementValue_descriptor,
        new java.lang.String[] { "AdjustedValue", "CurrencyCode", "AdjustedValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v11_services_GclidDateTimePair_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v11_services_GclidDateTimePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_GclidDateTimePair_descriptor,
        new java.lang.String[] { "Gclid", "ConversionDateTime", "Gclid", "ConversionDateTime", });
    internal_static_google_ads_googleads_v11_services_ConversionAdjustmentResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v11_services_ConversionAdjustmentResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ConversionAdjustmentResult_descriptor,
        new java.lang.String[] { "GclidDateTimePair", "OrderId", "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "ConversionAction", "AdjustmentDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionAdjustmentTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
