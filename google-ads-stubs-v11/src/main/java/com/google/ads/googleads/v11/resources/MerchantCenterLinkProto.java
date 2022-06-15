// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/merchant_center_link.proto

package com.google.ads.googleads.v11.resources;

public final class MerchantCenterLinkProto {
  private MerchantCenterLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_MerchantCenterLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_MerchantCenterLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v11/resources/mer" +
      "chant_center_link.proto\022\"google.ads.goog" +
      "leads.v11.resources\032@google/ads/googlead" +
      "s/v11/enums/merchant_center_link_status." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\251\003\n\022MerchantCe" +
      "nterLink\022J\n\rresource_name\030\001 \001(\tB3\340A\005\372A-\n" +
      "+googleads.googleapis.com/MerchantCenter" +
      "Link\022\024\n\002id\030\006 \001(\003B\003\340A\003H\000\210\001\001\022.\n\034merchant_c" +
      "enter_account_name\030\007 \001(\tB\003\340A\003H\001\210\001\001\022e\n\006st" +
      "atus\030\005 \001(\0162U.google.ads.googleads.v11.en" +
      "ums.MerchantCenterLinkStatusEnum.Merchan" +
      "tCenterLinkStatus:r\352Ao\n+googleads.google" +
      "apis.com/MerchantCenterLink\022@customers/{" +
      "customer_id}/merchantCenterLinks/{mercha" +
      "nt_center_id}B\005\n\003_idB\037\n\035_merchant_center" +
      "_account_nameB\211\002\n&com.google.ads.googlea" +
      "ds.v11.resourcesB\027MerchantCenterLinkProt" +
      "oP\001ZKgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v11/resources;resources" +
      "\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resour" +
      "ces\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources" +
      "\352\002&Google::Ads::GoogleAds::V11::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.MerchantCenterLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_MerchantCenterLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_MerchantCenterLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_MerchantCenterLink_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "MerchantCenterAccountName", "Status", "Id", "MerchantCenterAccountName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.MerchantCenterLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
