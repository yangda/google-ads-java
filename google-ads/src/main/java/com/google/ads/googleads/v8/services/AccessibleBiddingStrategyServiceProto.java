// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/accessible_bidding_strategy_service.proto

package com.google.ads.googleads.v8.services;

public final class AccessibleBiddingStrategyServiceProto {
  private AccessibleBiddingStrategyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetAccessibleBiddingStrategyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetAccessibleBiddingStrategyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v8/services/acces" +
      "sible_bidding_strategy_service.proto\022 go" +
      "ogle.ads.googleads.v8.services\032Cgoogle/a" +
      "ds/googleads/v8/resources/accessible_bid" +
      "ding_strategy.proto\032\034google/api/annotati" +
      "ons.proto\032\027google/api/client.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\"x\n#GetAccessibleBiddingSt" +
      "rategyRequest\022Q\n\rresource_name\030\001 \001(\tB:\340A" +
      "\002\372A4\n2googleads.googleapis.com/Accessibl" +
      "eBiddingStrategy2\346\002\n AccessibleBiddingSt" +
      "rategyService\022\372\001\n\034GetAccessibleBiddingSt" +
      "rategy\022E.google.ads.googleads.v8.service" +
      "s.GetAccessibleBiddingStrategyRequest\032<." +
      "google.ads.googleads.v8.resources.Access" +
      "ibleBiddingStrategy\"U\202\323\344\223\002?\022=/v8/{resour" +
      "ce_name=customers/*/accessibleBiddingStr" +
      "ategies/*}\332A\rresource_name\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\214\002\n$com.google.ads.goo" +
      "gleads.v8.servicesB%AccessibleBiddingStr" +
      "ategyServiceProtoP\001ZHgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v8/serv" +
      "ices;services\242\002\003GAA\252\002 Google.Ads.GoogleA" +
      "ds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8" +
      "\\Services\352\002$Google::Ads::GoogleAds::V8::" +
      "Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.resources.AccessibleBiddingStrategyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetAccessibleBiddingStrategyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetAccessibleBiddingStrategyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetAccessibleBiddingStrategyRequest_descriptor,
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
    com.google.ads.googleads.v8.resources.AccessibleBiddingStrategyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
