// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v8.services;

public final class CampaignExtensionSettingServiceProto {
  private CampaignExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetCampaignExtensionSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetCampaignExtensionSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_CampaignExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_CampaignExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v8/services/campa" +
      "ign_extension_setting_service.proto\022 goo" +
      "gle.ads.googleads.v8.services\0329google/ad" +
      "s/googleads/v8/enums/response_content_ty" +
      "pe.proto\032Bgoogle/ads/googleads/v8/resour" +
      "ces/campaign_extension_setting.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032 google/" +
      "protobuf/field_mask.proto\032\027google/rpc/st" +
      "atus.proto\"v\n\"GetCampaignExtensionSettin" +
      "gRequest\022P\n\rresource_name\030\001 \001(\tB9\340A\002\372A3\n" +
      "1googleads.googleapis.com/CampaignExtens" +
      "ionSetting\"\273\002\n&MutateCampaignExtensionSe" +
      "ttingsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022" +
      "\\\n\noperations\030\002 \003(\0132C.google.ads.googlea" +
      "ds.v8.services.CampaignExtensionSettingO" +
      "perationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025" +
      "\n\rvalidate_only\030\004 \001(\010\022i\n\025response_conten" +
      "t_type\030\005 \001(\0162J.google.ads.googleads.v8.e" +
      "nums.ResponseContentTypeEnum.ResponseCon" +
      "tentType\"\221\002\n!CampaignExtensionSettingOpe" +
      "ration\022/\n\013update_mask\030\004 \001(\0132\032.google.pro" +
      "tobuf.FieldMask\022M\n\006create\030\001 \001(\0132;.google" +
      ".ads.googleads.v8.resources.CampaignExte" +
      "nsionSettingH\000\022M\n\006update\030\002 \001(\0132;.google." +
      "ads.googleads.v8.resources.CampaignExten" +
      "sionSettingH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\topera" +
      "tion\"\265\001\n\'MutateCampaignExtensionSettings" +
      "Response\0221\n\025partial_failure_error\030\003 \001(\0132" +
      "\022.google.rpc.Status\022W\n\007results\030\002 \003(\0132F.g" +
      "oogle.ads.googleads.v8.services.MutateCa" +
      "mpaignExtensionSettingResult\"\236\001\n$MutateC" +
      "ampaignExtensionSettingResult\022\025\n\rresourc" +
      "e_name\030\001 \001(\t\022_\n\032campaign_extension_setti" +
      "ng\030\002 \001(\0132;.google.ads.googleads.v8.resou" +
      "rces.CampaignExtensionSetting2\375\004\n\037Campai" +
      "gnExtensionSettingService\022\365\001\n\033GetCampaig" +
      "nExtensionSetting\022D.google.ads.googleads" +
      ".v8.services.GetCampaignExtensionSetting" +
      "Request\032;.google.ads.googleads.v8.resour" +
      "ces.CampaignExtensionSetting\"S\202\323\344\223\002=\022;/v" +
      "8/{resource_name=customers/*/campaignExt" +
      "ensionSettings/*}\332A\rresource_name\022\232\002\n\037Mu" +
      "tateCampaignExtensionSettings\022H.google.a" +
      "ds.googleads.v8.services.MutateCampaignE" +
      "xtensionSettingsRequest\032I.google.ads.goo" +
      "gleads.v8.services.MutateCampaignExtensi" +
      "onSettingsResponse\"b\202\323\344\223\002C\">/v8/customer" +
      "s/{customer_id=*}/campaignExtensionSetti" +
      "ngs:mutate:\001*\332A\026customer_id,operations\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\213\002\n$com.go" +
      "ogle.ads.googleads.v8.servicesB$Campaign" +
      "ExtensionSettingServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v8/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V8\\Services\352\002$Google::Ads::Goog" +
      "leAds::V8::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.resources.CampaignExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetCampaignExtensionSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetCampaignExtensionSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetCampaignExtensionSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v8_services_CampaignExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v8_services_CampaignExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_CampaignExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignExtensionSetting", });
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
    com.google.ads.googleads.v8.resources.CampaignExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
