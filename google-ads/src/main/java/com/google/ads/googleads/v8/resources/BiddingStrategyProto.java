// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/bidding_strategy.proto

package com.google.ads.googleads.v8.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v8/resources/bidd" +
      "ing_strategy.proto\022!google.ads.googleads" +
      ".v8.resources\032,google/ads/googleads/v8/c" +
      "ommon/bidding.proto\032;google/ads/googlead" +
      "s/v8/enums/bidding_strategy_status.proto" +
      "\0329google/ads/googleads/v8/enums/bidding_" +
      "strategy_type.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\321\t\n\017Biddin" +
      "gStrategy\022G\n\rresource_name\030\001 \001(\tB0\340A\005\372A*" +
      "\n(googleads.googleapis.com/BiddingStrate" +
      "gy\022\024\n\002id\030\020 \001(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\021 \001(\tH\002" +
      "\210\001\001\022c\n\006status\030\017 \001(\0162N.google.ads.googlea" +
      "ds.v8.enums.BiddingStrategyStatusEnum.Bi" +
      "ddingStrategyStatusB\003\340A\003\022]\n\004type\030\005 \001(\0162J" +
      ".google.ads.googleads.v8.enums.BiddingSt" +
      "rategyTypeEnum.BiddingStrategyTypeB\003\340A\003\022" +
      "\032\n\rcurrency_code\030\027 \001(\tB\003\340A\005\022)\n\027effective" +
      "_currency_code\030\024 \001(\tB\003\340A\003H\003\210\001\001\022 \n\016campai" +
      "gn_count\030\022 \001(\003B\003\340A\003H\004\210\001\001\022,\n\032non_removed_" +
      "campaign_count\030\023 \001(\003B\003\340A\003H\005\210\001\001\022C\n\014enhanc" +
      "ed_cpc\030\007 \001(\0132+.google.ads.googleads.v8.c" +
      "ommon.EnhancedCpcH\000\022\\\n\031maximize_conversi" +
      "on_value\030\025 \001(\01327.google.ads.googleads.v8" +
      ".common.MaximizeConversionValueH\000\022S\n\024max" +
      "imize_conversions\030\026 \001(\01323.google.ads.goo" +
      "gleads.v8.common.MaximizeConversionsH\000\022?" +
      "\n\ntarget_cpa\030\t \001(\0132).google.ads.googlead" +
      "s.v8.common.TargetCpaH\000\022X\n\027target_impres" +
      "sion_share\0300 \001(\01325.google.ads.googleads." +
      "v8.common.TargetImpressionShareH\000\022A\n\013tar" +
      "get_roas\030\013 \001(\0132*.google.ads.googleads.v8" +
      ".common.TargetRoasH\000\022C\n\014target_spend\030\014 \001" +
      "(\0132+.google.ads.googleads.v8.common.Targ" +
      "etSpendH\000:n\352Ak\n(googleads.googleapis.com" +
      "/BiddingStrategy\022?customers/{customer_id" +
      "}/biddingStrategies/{bidding_strategy_id" +
      "}B\010\n\006schemeB\005\n\003_idB\007\n\005_nameB\032\n\030_effectiv" +
      "e_currency_codeB\021\n\017_campaign_countB\035\n\033_n" +
      "on_removed_campaign_countB\201\002\n%com.google" +
      ".ads.googleads.v8.resourcesB\024BiddingStra" +
      "tegyProtoP\001ZJgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v8/resources;re" +
      "sources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8." +
      "Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Reso" +
      "urces\352\002%Google::Ads::GoogleAds::V8::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "CurrencyCode", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "MaximizeConversionValue", "MaximizeConversions", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", "Id", "Name", "EffectiveCurrencyCode", "CampaignCount", "NonRemovedCampaignCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v8.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
