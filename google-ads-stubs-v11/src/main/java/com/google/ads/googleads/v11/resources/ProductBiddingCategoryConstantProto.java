// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/product_bidding_category_constant.proto

package com.google.ads.googleads.v11.resources;

public final class ProductBiddingCategoryConstantProto {
  private ProductBiddingCategoryConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_ProductBiddingCategoryConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_ProductBiddingCategoryConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v11/resources/pro" +
      "duct_bidding_category_constant.proto\022\"go" +
      "ogle.ads.googleads.v11.resources\032Cgoogle" +
      "/ads/googleads/v11/enums/product_bidding" +
      "_category_level.proto\032Dgoogle/ads/google" +
      "ads/v11/enums/product_bidding_category_s" +
      "tatus.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\263\006\n\036Prod" +
      "uctBiddingCategoryConstant\022V\n\rresource_n" +
      "ame\030\001 \001(\tB?\340A\003\372A9\n7googleads.googleapis." +
      "com/ProductBiddingCategoryConstant\022\024\n\002id" +
      "\030\n \001(\003B\003\340A\003H\000\210\001\001\022\036\n\014country_code\030\013 \001(\tB\003" +
      "\340A\003H\001\210\001\001\022v\n(product_bidding_category_con" +
      "stant_parent\030\014 \001(\tB?\340A\003\372A9\n7googleads.go" +
      "ogleapis.com/ProductBiddingCategoryConst" +
      "antH\002\210\001\001\022o\n\005level\030\005 \001(\0162[.google.ads.goo" +
      "gleads.v11.enums.ProductBiddingCategoryL" +
      "evelEnum.ProductBiddingCategoryLevelB\003\340A" +
      "\003\022r\n\006status\030\006 \001(\0162].google.ads.googleads" +
      ".v11.enums.ProductBiddingCategoryStatusE" +
      "num.ProductBiddingCategoryStatusB\003\340A\003\022\037\n" +
      "\rlanguage_code\030\r \001(\tB\003\340A\003H\003\210\001\001\022 \n\016locali" +
      "zed_name\030\016 \001(\tB\003\340A\003H\004\210\001\001:y\352Av\n7googleads" +
      ".googleapis.com/ProductBiddingCategoryCo" +
      "nstant\022;productBiddingCategoryConstants/" +
      "{country_code}~{level}~{id}B\005\n\003_idB\017\n\r_c" +
      "ountry_codeB+\n)_product_bidding_category" +
      "_constant_parentB\020\n\016_language_codeB\021\n\017_l" +
      "ocalized_nameB\225\002\n&com.google.ads.googlea" +
      "ds.v11.resourcesB#ProductBiddingCategory" +
      "ConstantProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v11/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "11\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ProductBiddingCategoryLevelProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ProductBiddingCategoryStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_ProductBiddingCategoryConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_ProductBiddingCategoryConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_ProductBiddingCategoryConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CountryCode", "ProductBiddingCategoryConstantParent", "Level", "Status", "LanguageCode", "LocalizedName", "Id", "CountryCode", "ProductBiddingCategoryConstantParent", "LanguageCode", "LocalizedName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.ProductBiddingCategoryLevelProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ProductBiddingCategoryStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
