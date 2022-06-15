// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/ad_group_extension_setting_service.proto

package com.google.ads.googleads.v11.services;

public final class AdGroupExtensionSettingServiceProto {
  private AdGroupExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_AdGroupExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_AdGroupExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v11/services/ad_g" +
      "roup_extension_setting_service.proto\022!go" +
      "ogle.ads.googleads.v11.services\032:google/" +
      "ads/googleads/v11/enums/response_content" +
      "_type.proto\032Cgoogle/ads/googleads/v11/re" +
      "sources/ad_group_extension_setting.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"\317\001\n%MutateAdGroupExtensio" +
      "nSettingsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340" +
      "A\002\022\\\n\noperations\030\002 \003(\0132C.google.ads.goog" +
      "leads.v11.services.AdGroupExtensionSetti" +
      "ngOperationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(" +
      "\010\022\025\n\rvalidate_only\030\004 \001(\010\"\263\003\n AdGroupExte" +
      "nsionSettingOperation\022/\n\013update_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\022j\n\025respon" +
      "se_content_type\030\005 \001(\0162K.google.ads.googl" +
      "eads.v11.enums.ResponseContentTypeEnum.R" +
      "esponseContentType\022M\n\006create\030\001 \001(\0132;.goo" +
      "gle.ads.googleads.v11.resources.AdGroupE" +
      "xtensionSettingH\000\022M\n\006update\030\002 \001(\0132;.goog" +
      "le.ads.googleads.v11.resources.AdGroupEx" +
      "tensionSettingH\000\022G\n\006remove\030\003 \001(\tB5\372A2\n0g" +
      "oogleads.googleapis.com/AdGroupExtension" +
      "SettingH\000B\013\n\toperation\"\264\001\n&MutateAdGroup" +
      "ExtensionSettingsResponse\0221\n\025partial_fai" +
      "lure_error\030\003 \001(\0132\022.google.rpc.Status\022W\n\007" +
      "results\030\002 \003(\0132F.google.ads.googleads.v11" +
      ".services.MutateAdGroupExtensionSettingR" +
      "esult\"\324\001\n#MutateAdGroupExtensionSettingR" +
      "esult\022L\n\rresource_name\030\001 \001(\tB5\372A2\n0googl" +
      "eads.googleapis.com/AdGroupExtensionSett" +
      "ing\022_\n\032ad_group_extension_setting\030\002 \001(\0132" +
      ";.google.ads.googleads.v11.resources.AdG" +
      "roupExtensionSetting2\203\003\n\036AdGroupExtensio" +
      "nSettingService\022\231\002\n\036MutateAdGroupExtensi" +
      "onSettings\022H.google.ads.googleads.v11.se" +
      "rvices.MutateAdGroupExtensionSettingsReq" +
      "uest\032I.google.ads.googleads.v11.services" +
      ".MutateAdGroupExtensionSettingsResponse\"" +
      "b\202\323\344\223\002C\">/v11/customers/{customer_id=*}/" +
      "adGroupExtensionSettings:mutate:\001*\332A\026cus" +
      "tomer_id,operations\032E\312A\030googleads.google" +
      "apis.com\322A\'https://www.googleapis.com/au" +
      "th/adwordsB\217\002\n%com.google.ads.googleads." +
      "v11.servicesB#AdGroupExtensionSettingSer" +
      "viceProtoP\001ZIgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v11/services;se" +
      "rvices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11." +
      "Services\312\002!Google\\Ads\\GoogleAds\\V11\\Serv" +
      "ices\352\002%Google::Ads::GoogleAds::V11::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_AdGroupExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_AdGroupExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_AdGroupExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ResponseContentType", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAdGroupExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupExtensionSetting", });
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
    com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
