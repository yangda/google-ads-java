// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/conversion_goal_campaign_config_service.proto

package com.google.ads.googleads.v11.services;

public final class ConversionGoalCampaignConfigServiceProto {
  private ConversionGoalCampaignConfigServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ConversionGoalCampaignConfigOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ConversionGoalCampaignConfigOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/ads/googleads/v11/services/conv" +
      "ersion_goal_campaign_config_service.prot" +
      "o\022!google.ads.googleads.v11.services\032:go" +
      "ogle/ads/googleads/v11/enums/response_co" +
      "ntent_type.proto\032Hgoogle/ads/googleads/v" +
      "11/resources/conversion_goal_campaign_co" +
      "nfig.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032 google/protobuf/field_mask.proto\"" +
      "\254\002\n*MutateConversionGoalCampaignConfigsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022a\n\noper" +
      "ations\030\002 \003(\0132H.google.ads.googleads.v11." +
      "services.ConversionGoalCampaignConfigOpe" +
      "rationB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\022j\n\025re" +
      "sponse_content_type\030\004 \001(\0162K.google.ads.g" +
      "oogleads.v11.enums.ResponseContentTypeEn" +
      "um.ResponseContentType\"\271\001\n%ConversionGoa" +
      "lCampaignConfigOperation\022/\n\013update_mask\030" +
      "\002 \001(\0132\032.google.protobuf.FieldMask\022R\n\006upd" +
      "ate\030\001 \001(\0132@.google.ads.googleads.v11.res" +
      "ources.ConversionGoalCampaignConfigH\000B\013\n" +
      "\toperation\"\213\001\n+MutateConversionGoalCampa" +
      "ignConfigsResponse\022\\\n\007results\030\001 \003(\0132K.go" +
      "ogle.ads.googleads.v11.services.MutateCo" +
      "nversionGoalCampaignConfigResult\"\350\001\n(Mut" +
      "ateConversionGoalCampaignConfigResult\022Q\n" +
      "\rresource_name\030\001 \001(\tB:\372A7\n5googleads.goo" +
      "gleapis.com/ConversionGoalCampaignConfig" +
      "\022i\n\037conversion_goal_campaign_config\030\002 \001(" +
      "\0132@.google.ads.googleads.v11.resources.C" +
      "onversionGoalCampaignConfig2\234\003\n#Conversi" +
      "onGoalCampaignConfigService\022\255\002\n#MutateCo" +
      "nversionGoalCampaignConfigs\022M.google.ads" +
      ".googleads.v11.services.MutateConversion" +
      "GoalCampaignConfigsRequest\032N.google.ads." +
      "googleads.v11.services.MutateConversionG" +
      "oalCampaignConfigsResponse\"g\202\323\344\223\002H\"C/v11" +
      "/customers/{customer_id=*}/conversionGoa" +
      "lCampaignConfigs:mutate:\001*\332A\026customer_id" +
      ",operations\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\224\002\n%com.google.ads.googleads.v11.serv" +
      "icesB(ConversionGoalCampaignConfigServic" +
      "eProtoP\001ZIgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v11/services;servi" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Ser" +
      "vices\312\002!Google\\Ads\\GoogleAds\\V11\\Service" +
      "s\352\002%Google::Ads::GoogleAds::V11::Service" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.ConversionGoalCampaignConfigProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v11_services_ConversionGoalCampaignConfigOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_ConversionGoalCampaignConfigOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ConversionGoalCampaignConfigOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateConversionGoalCampaignConfigResult_descriptor,
        new java.lang.String[] { "ResourceName", "ConversionGoalCampaignConfig", });
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
    com.google.ads.googleads.v11.resources.ConversionGoalCampaignConfigProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
