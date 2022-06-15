// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/change_event.proto

package com.google.ads.googleads.v11.resources;

public final class ChangeEventProto {
  private ChangeEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_ChangeEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_ChangedResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_ChangeEvent_ChangedResource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v11/resources/cha" +
      "nge_event.proto\022\"google.ads.googleads.v1" +
      "1.resources\0327google/ads/googleads/v11/en" +
      "ums/change_client_type.proto\032?google/ads" +
      "/googleads/v11/enums/change_event_resour" +
      "ce_type.proto\032>google/ads/googleads/v11/" +
      "enums/resource_change_operation.proto\032+g" +
      "oogle/ads/googleads/v11/resources/ad.pro" +
      "to\0321google/ads/googleads/v11/resources/a" +
      "d_group.proto\0324google/ads/googleads/v11/" +
      "resources/ad_group_ad.proto\0327google/ads/" +
      "googleads/v11/resources/ad_group_asset.p" +
      "roto\032>google/ads/googleads/v11/resources" +
      "/ad_group_bid_modifier.proto\032;google/ads" +
      "/googleads/v11/resources/ad_group_criter" +
      "ion.proto\0326google/ads/googleads/v11/reso" +
      "urces/ad_group_feed.proto\032.google/ads/go" +
      "ogleads/v11/resources/asset.proto\0322googl" +
      "e/ads/googleads/v11/resources/asset_set." +
      "proto\0328google/ads/googleads/v11/resource" +
      "s/asset_set_asset.proto\0321google/ads/goog" +
      "leads/v11/resources/campaign.proto\0327goog" +
      "le/ads/googleads/v11/resources/campaign_" +
      "asset.proto\032;google/ads/googleads/v11/re" +
      "sources/campaign_asset_set.proto\0328google" +
      "/ads/googleads/v11/resources/campaign_bu" +
      "dget.proto\032;google/ads/googleads/v11/res" +
      "ources/campaign_criterion.proto\0326google/" +
      "ads/googleads/v11/resources/campaign_fee" +
      "d.proto\0327google/ads/googleads/v11/resour" +
      "ces/customer_asset.proto\032-google/ads/goo" +
      "gleads/v11/resources/feed.proto\0322google/" +
      "ads/googleads/v11/resources/feed_item.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032 google/protobuf" +
      "/field_mask.proto\"\321\024\n\013ChangeEvent\022C\n\rres" +
      "ource_name\030\001 \001(\tB,\340A\003\372A&\n$googleads.goog" +
      "leapis.com/ChangeEvent\022\035\n\020change_date_ti" +
      "me\030\002 \001(\tB\003\340A\003\022v\n\024change_resource_type\030\003 " +
      "\001(\0162S.google.ads.googleads.v11.enums.Cha" +
      "ngeEventResourceTypeEnum.ChangeEventReso" +
      "urceTypeB\003\340A\003\022!\n\024change_resource_name\030\004 " +
      "\001(\tB\003\340A\003\022_\n\013client_type\030\005 \001(\0162E.google.a" +
      "ds.googleads.v11.enums.ChangeClientTypeE" +
      "num.ChangeClientTypeB\003\340A\003\022\027\n\nuser_email\030" +
      "\006 \001(\tB\003\340A\003\022Z\n\014old_resource\030\007 \001(\0132?.googl" +
      "e.ads.googleads.v11.resources.ChangeEven" +
      "t.ChangedResourceB\003\340A\003\022Z\n\014new_resource\030\010" +
      " \001(\0132?.google.ads.googleads.v11.resource" +
      "s.ChangeEvent.ChangedResourceB\003\340A\003\022{\n\031re" +
      "source_change_operation\030\t \001(\0162S.google.a" +
      "ds.googleads.v11.enums.ResourceChangeOpe" +
      "rationEnum.ResourceChangeOperationB\003\340A\003\022" +
      "7\n\016changed_fields\030\n \001(\0132\032.google.protobu" +
      "f.FieldMaskB\003\340A\003\022;\n\010campaign\030\013 \001(\tB)\340A\003\372" +
      "A#\n!googleads.googleapis.com/Campaign\022:\n" +
      "\010ad_group\030\014 \001(\tB(\340A\003\372A\"\n googleads.googl" +
      "eapis.com/AdGroup\0223\n\004feed\030\r \001(\tB%\340A\003\372A\037\n" +
      "\035googleads.googleapis.com/Feed\022<\n\tfeed_i" +
      "tem\030\016 \001(\tB)\340A\003\372A#\n!googleads.googleapis." +
      "com/FeedItem\0225\n\005asset\030\024 \001(\tB&\340A\003\372A \n\036goo" +
      "gleads.googleapis.com/Asset\032\263\013\n\017ChangedR" +
      "esource\0227\n\002ad\030\001 \001(\0132&.google.ads.googlea" +
      "ds.v11.resources.AdB\003\340A\003\022B\n\010ad_group\030\002 \001" +
      "(\0132+.google.ads.googleads.v11.resources." +
      "AdGroupB\003\340A\003\022U\n\022ad_group_criterion\030\003 \001(\013" +
      "24.google.ads.googleads.v11.resources.Ad" +
      "GroupCriterionB\003\340A\003\022C\n\010campaign\030\004 \001(\0132,." +
      "google.ads.googleads.v11.resources.Campa" +
      "ignB\003\340A\003\022P\n\017campaign_budget\030\005 \001(\01322.goog" +
      "le.ads.googleads.v11.resources.CampaignB" +
      "udgetB\003\340A\003\022Z\n\025ad_group_bid_modifier\030\006 \001(" +
      "\01326.google.ads.googleads.v11.resources.A" +
      "dGroupBidModifierB\003\340A\003\022V\n\022campaign_crite" +
      "rion\030\007 \001(\01325.google.ads.googleads.v11.re" +
      "sources.CampaignCriterionB\003\340A\003\022;\n\004feed\030\010" +
      " \001(\0132(.google.ads.googleads.v11.resource" +
      "s.FeedB\003\340A\003\022D\n\tfeed_item\030\t \001(\0132,.google." +
      "ads.googleads.v11.resources.FeedItemB\003\340A" +
      "\003\022L\n\rcampaign_feed\030\n \001(\01320.google.ads.go" +
      "ogleads.v11.resources.CampaignFeedB\003\340A\003\022" +
      "K\n\rad_group_feed\030\013 \001(\0132/.google.ads.goog" +
      "leads.v11.resources.AdGroupFeedB\003\340A\003\022G\n\013" +
      "ad_group_ad\030\014 \001(\0132-.google.ads.googleads" +
      ".v11.resources.AdGroupAdB\003\340A\003\022=\n\005asset\030\r" +
      " \001(\0132).google.ads.googleads.v11.resource" +
      "s.AssetB\003\340A\003\022N\n\016customer_asset\030\016 \001(\01321.g" +
      "oogle.ads.googleads.v11.resources.Custom" +
      "erAssetB\003\340A\003\022N\n\016campaign_asset\030\017 \001(\01321.g" +
      "oogle.ads.googleads.v11.resources.Campai" +
      "gnAssetB\003\340A\003\022M\n\016ad_group_asset\030\020 \001(\01320.g" +
      "oogle.ads.googleads.v11.resources.AdGrou" +
      "pAssetB\003\340A\003\022D\n\tasset_set\030\021 \001(\0132,.google." +
      "ads.googleads.v11.resources.AssetSetB\003\340A" +
      "\003\022O\n\017asset_set_asset\030\022 \001(\01321.google.ads." +
      "googleads.v11.resources.AssetSetAssetB\003\340" +
      "A\003\022U\n\022campaign_asset_set\030\023 \001(\01324.google." +
      "ads.googleads.v11.resources.CampaignAsse" +
      "tSetB\003\340A\003:\201\001\352A~\n$googleads.googleapis.co" +
      "m/ChangeEvent\022Vcustomers/{customer_id}/c" +
      "hangeEvents/{timestamp_micros}~{command_" +
      "index}~{mutate_index}B\202\002\n&com.google.ads" +
      ".googleads.v11.resourcesB\020ChangeEventPro" +
      "toP\001ZKgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v11/resources;resource" +
      "s\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resou" +
      "rces\312\002\"Google\\Ads\\GoogleAds\\V11\\Resource" +
      "s\352\002&Google::Ads::GoogleAds::V11::Resourc" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ChangeClientTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ChangeEventResourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ResourceChangeOperationProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupAdProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupAssetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupBidModifierProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AdGroupFeedProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AssetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AssetSetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.AssetSetAssetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignAssetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignAssetSetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignBudgetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignCriterionProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignFeedProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CustomerAssetProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.FeedProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.FeedItemProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_ChangeEvent_descriptor,
        new java.lang.String[] { "ResourceName", "ChangeDateTime", "ChangeResourceType", "ChangeResourceName", "ClientType", "UserEmail", "OldResource", "NewResource", "ResourceChangeOperation", "ChangedFields", "Campaign", "AdGroup", "Feed", "FeedItem", "Asset", });
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_ChangedResource_descriptor =
      internal_static_google_ads_googleads_v11_resources_ChangeEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_ChangeEvent_ChangedResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_ChangeEvent_ChangedResource_descriptor,
        new java.lang.String[] { "Ad", "AdGroup", "AdGroupCriterion", "Campaign", "CampaignBudget", "AdGroupBidModifier", "CampaignCriterion", "Feed", "FeedItem", "CampaignFeed", "AdGroupFeed", "AdGroupAd", "Asset", "CustomerAsset", "CampaignAsset", "AdGroupAsset", "AssetSet", "AssetSetAsset", "CampaignAssetSet", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.ChangeClientTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ChangeEventResourceTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ResourceChangeOperationProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupAdProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupAssetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupBidModifierProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupCriterionProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AdGroupFeedProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AssetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AssetSetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.AssetSetAssetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignAssetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignAssetSetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignBudgetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignCriterionProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignFeedProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CustomerAssetProto.getDescriptor();
    com.google.ads.googleads.v11.resources.FeedProto.getDescriptor();
    com.google.ads.googleads.v11.resources.FeedItemProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
