// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/campaign_criterion_service.proto

package com.google.ads.googleads.v8.services;

public final class CampaignCriterionServiceProto {
  private CampaignCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetCampaignCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetCampaignCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_CampaignCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_CampaignCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCampaignCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v8/services/campa" +
      "ign_criterion_service.proto\022 google.ads." +
      "googleads.v8.services\0329google/ads/google" +
      "ads/v8/enums/response_content_type.proto" +
      "\032:google/ads/googleads/v8/resources/camp" +
      "aign_criterion.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032 google/protobuf/field_m" +
      "ask.proto\032\027google/rpc/status.proto\"h\n\033Ge" +
      "tCampaignCriterionRequest\022I\n\rresource_na" +
      "me\030\001 \001(\tB2\340A\002\372A,\n*googleads.googleapis.c" +
      "om/CampaignCriterion\"\253\002\n\035MutateCampaignC" +
      "riteriaRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002" +
      "\022U\n\noperations\030\002 \003(\0132<.google.ads.google" +
      "ads.v8.services.CampaignCriterionOperati" +
      "onB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvali" +
      "date_only\030\004 \001(\010\022i\n\025response_content_type" +
      "\030\005 \001(\0162J.google.ads.googleads.v8.enums.R" +
      "esponseContentTypeEnum.ResponseContentTy" +
      "pe\"\374\001\n\032CampaignCriterionOperation\022/\n\013upd" +
      "ate_mask\030\004 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\022F\n\006create\030\001 \001(\01324.google.ads.googlead" +
      "s.v8.resources.CampaignCriterionH\000\022F\n\006up" +
      "date\030\002 \001(\01324.google.ads.googleads.v8.res" +
      "ources.CampaignCriterionH\000\022\020\n\006remove\030\003 \001" +
      "(\tH\000B\013\n\toperation\"\245\001\n\036MutateCampaignCrit" +
      "eriaResponse\0221\n\025partial_failure_error\030\003 " +
      "\001(\0132\022.google.rpc.Status\022P\n\007results\030\002 \003(\013" +
      "2?.google.ads.googleads.v8.services.Muta" +
      "teCampaignCriterionResult\"\210\001\n\035MutateCamp" +
      "aignCriterionResult\022\025\n\rresource_name\030\001 \001" +
      "(\t\022P\n\022campaign_criterion\030\002 \001(\01324.google." +
      "ads.googleads.v8.resources.CampaignCrite" +
      "rion2\264\004\n\030CampaignCriterionService\022\327\001\n\024Ge" +
      "tCampaignCriterion\022=.google.ads.googlead" +
      "s.v8.services.GetCampaignCriterionReques" +
      "t\0324.google.ads.googleads.v8.resources.Ca" +
      "mpaignCriterion\"J\202\323\344\223\0024\0222/v8/{resource_n" +
      "ame=customers/*/campaignCriteria/*}\332A\rre" +
      "source_name\022\366\001\n\026MutateCampaignCriteria\022?" +
      ".google.ads.googleads.v8.services.Mutate" +
      "CampaignCriteriaRequest\032@.google.ads.goo" +
      "gleads.v8.services.MutateCampaignCriteri" +
      "aResponse\"Y\202\323\344\223\002:\"5/v8/customers/{custom" +
      "er_id=*}/campaignCriteria:mutate:\001*\332A\026cu" +
      "stomer_id,operations\032E\312A\030googleads.googl" +
      "eapis.com\322A\'https://www.googleapis.com/a" +
      "uth/adwordsB\204\002\n$com.google.ads.googleads" +
      ".v8.servicesB\035CampaignCriterionServicePr" +
      "otoP\001ZHgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v8/services;services\242" +
      "\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services" +
      "\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Go" +
      "ogle::Ads::GoogleAds::V8::Servicesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.resources.CampaignCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetCampaignCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetCampaignCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetCampaignCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v8_services_CampaignCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v8_services_CampaignCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_CampaignCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v8_services_MutateCampaignCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCampaignCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignCriterion", });
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
    com.google.ads.googleads.v8.resources.CampaignCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
