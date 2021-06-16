// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/campaign_asset.proto

package com.google.ads.googleads.v8.resources;

public final class CampaignAssetProto {
  private CampaignAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_CampaignAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_CampaignAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v8/resources/camp" +
      "aign_asset.proto\022!google.ads.googleads.v" +
      "8.resources\0324google/ads/googleads/v8/enu" +
      "ms/asset_field_type.proto\0325google/ads/go" +
      "ogleads/v8/enums/asset_link_status.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\034google/api/annotat" +
      "ions.proto\"\225\004\n\rCampaignAsset\022E\n\rresource" +
      "_name\030\001 \001(\tB.\340A\005\372A(\n&googleads.googleapi" +
      "s.com/CampaignAsset\022@\n\010campaign\030\006 \001(\tB)\340" +
      "A\005\372A#\n!googleads.googleapis.com/Campaign" +
      "H\000\210\001\001\022:\n\005asset\030\007 \001(\tB&\340A\005\372A \n\036googleads." +
      "googleapis.com/AssetH\001\210\001\001\022Y\n\nfield_type\030" +
      "\004 \001(\0162@.google.ads.googleads.v8.enums.As" +
      "setFieldTypeEnum.AssetFieldTypeB\003\340A\005\022R\n\006" +
      "status\030\005 \001(\0162B.google.ads.googleads.v8.e" +
      "nums.AssetLinkStatusEnum.AssetLinkStatus" +
      ":y\352Av\n&googleads.googleapis.com/Campaign" +
      "Asset\022Lcustomers/{customer_id}/campaignA" +
      "ssets/{campaign_id}~{asset_id}~{field_ty" +
      "pe}B\013\n\t_campaignB\010\n\006_assetB\377\001\n%com.googl" +
      "e.ads.googleads.v8.resourcesB\022CampaignAs" +
      "setProtoP\001ZJgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v8/resources;res" +
      "ources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.R" +
      "esources\312\002!Google\\Ads\\GoogleAds\\V8\\Resou" +
      "rces\352\002%Google::Ads::GoogleAds::V8::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_CampaignAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_CampaignAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_CampaignAsset_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Asset", "FieldType", "Status", "Campaign", "Asset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.AssetLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
