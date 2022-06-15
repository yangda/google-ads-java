// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/campaign_conversion_goal_service.proto

package com.google.ads.googleads.v11.services;

public final class CampaignConversionGoalServiceProto {
  private CampaignConversionGoalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CampaignConversionGoalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CampaignConversionGoalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v11/services/camp" +
      "aign_conversion_goal_service.proto\022!goog" +
      "le.ads.googleads.v11.services\032Agoogle/ad" +
      "s/googleads/v11/resources/campaign_conve" +
      "rsion_goal.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032 google/protobuf/field_mask." +
      "proto\"\264\001\n$MutateCampaignConversionGoalsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022[\n\noper" +
      "ations\030\002 \003(\0132B.google.ads.googleads.v11." +
      "services.CampaignConversionGoalOperation" +
      "B\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\"\255\001\n\037Campaig" +
      "nConversionGoalOperation\022/\n\013update_mask\030" +
      "\002 \001(\0132\032.google.protobuf.FieldMask\022L\n\006upd" +
      "ate\030\001 \001(\0132:.google.ads.googleads.v11.res" +
      "ources.CampaignConversionGoalH\000B\013\n\topera" +
      "tion\"\177\n%MutateCampaignConversionGoalsRes" +
      "ponse\022V\n\007results\030\001 \003(\0132E.google.ads.goog" +
      "leads.v11.services.MutateCampaignConvers" +
      "ionGoalResult\"q\n\"MutateCampaignConversio" +
      "nGoalResult\022K\n\rresource_name\030\001 \001(\tB4\372A1\n" +
      "/googleads.googleapis.com/CampaignConver" +
      "sionGoal2\376\002\n\035CampaignConversionGoalServi" +
      "ce\022\225\002\n\035MutateCampaignConversionGoals\022G.g" +
      "oogle.ads.googleads.v11.services.MutateC" +
      "ampaignConversionGoalsRequest\032H.google.a" +
      "ds.googleads.v11.services.MutateCampaign" +
      "ConversionGoalsResponse\"a\202\323\344\223\002B\"=/v11/cu" +
      "stomers/{customer_id=*}/campaignConversi" +
      "onGoals:mutate:\001*\332A\026customer_id,operatio" +
      "ns\032E\312A\030googleads.googleapis.com\322A\'https:" +
      "//www.googleapis.com/auth/adwordsB\216\002\n%co" +
      "m.google.ads.googleads.v11.servicesB\"Cam" +
      "paignConversionGoalServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v11/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V11.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads" +
      "::GoogleAds::V11::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.resources.CampaignConversionGoalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_CampaignConversionGoalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_CampaignConversionGoalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CampaignConversionGoalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignConversionGoalResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v11.resources.CampaignConversionGoalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
