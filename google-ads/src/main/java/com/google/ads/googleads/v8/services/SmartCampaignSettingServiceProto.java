// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v8.services;

public final class SmartCampaignSettingServiceProto {
  private SmartCampaignSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetSmartCampaignSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetSmartCampaignSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_SmartCampaignSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_SmartCampaignSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v8/services/smart" +
      "_campaign_setting_service.proto\022 google." +
      "ads.googleads.v8.services\0329google/ads/go" +
      "ogleads/v8/enums/response_content_type.p" +
      "roto\032>google/ads/googleads/v8/resources/" +
      "smart_campaign_setting.proto\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032 google/protobuf" +
      "/field_mask.proto\032\027google/rpc/status.pro" +
      "to\"n\n\036GetSmartCampaignSettingRequest\022L\n\r" +
      "resource_name\030\001 \001(\tB5\340A\002\372A/\n-googleads.g" +
      "oogleapis.com/SmartCampaignSetting\"\263\002\n\"M" +
      "utateSmartCampaignSettingsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022X\n\noperations\030\002 \003(\0132" +
      "?.google.ads.googleads.v8.services.Smart" +
      "CampaignSettingOperationB\003\340A\002\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n" +
      "\025response_content_type\030\005 \001(\0162J.google.ad" +
      "s.googleads.v8.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\231\001\n\035SmartCampai" +
      "gnSettingOperation\022G\n\006update\030\001 \001(\01327.goo" +
      "gle.ads.googleads.v8.resources.SmartCamp" +
      "aignSetting\022/\n\013update_mask\030\002 \001(\0132\032.googl" +
      "e.protobuf.FieldMask\"\255\001\n#MutateSmartCamp" +
      "aignSettingsResponse\0221\n\025partial_failure_" +
      "error\030\001 \001(\0132\022.google.rpc.Status\022S\n\007resul" +
      "ts\030\002 \003(\0132B.google.ads.googleads.v8.servi" +
      "ces.MutateSmartCampaignSettingResult\"\222\001\n" +
      " MutateSmartCampaignSettingResult\022\025\n\rres" +
      "ource_name\030\001 \001(\t\022W\n\026smart_campaign_setti" +
      "ng\030\002 \001(\01327.google.ads.googleads.v8.resou" +
      "rces.SmartCampaignSetting2\331\004\n\033SmartCampa" +
      "ignSettingService\022\345\001\n\027GetSmartCampaignSe" +
      "tting\022@.google.ads.googleads.v8.services" +
      ".GetSmartCampaignSettingRequest\0327.google" +
      ".ads.googleads.v8.resources.SmartCampaig" +
      "nSetting\"O\202\323\344\223\0029\0227/v8/{resource_name=cus" +
      "tomers/*/smartCampaignSettings/*}\332A\rreso" +
      "urce_name\022\212\002\n\033MutateSmartCampaignSetting" +
      "s\022D.google.ads.googleads.v8.services.Mut" +
      "ateSmartCampaignSettingsRequest\032E.google" +
      ".ads.googleads.v8.services.MutateSmartCa" +
      "mpaignSettingsResponse\"^\202\323\344\223\002?\":/v8/cust" +
      "omers/{customer_id=*}/smartCampaignSetti" +
      "ngs:mutate:\001*\332A\026customer_id,operations\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\207\002\n$com.go" +
      "ogle.ads.googleads.v8.servicesB SmartCam" +
      "paignSettingServiceProtoP\001ZHgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v8/services;services\242\002\003GAA\252\002 Google.Ads." +
      "GoogleAds.V8.Services\312\002 Google\\Ads\\Googl" +
      "eAds\\V8\\Services\352\002$Google::Ads::GoogleAd" +
      "s::V8::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.resources.SmartCampaignSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetSmartCampaignSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetSmartCampaignSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetSmartCampaignSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v8_services_SmartCampaignSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v8_services_SmartCampaignSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_SmartCampaignSettingOperation_descriptor,
        new java.lang.String[] { "Update", "UpdateMask", });
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateSmartCampaignSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "SmartCampaignSetting", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v8.resources.SmartCampaignSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
