// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/hotel_performance_view.proto

package com.google.ads.googleads.v8.resources;

public final class HotelPerformanceViewProto {
  private HotelPerformanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_HotelPerformanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_HotelPerformanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v8/resources/hote" +
      "l_performance_view.proto\022!google.ads.goo" +
      "gleads.v8.resources\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\034google/api/annotations.proto\"\306\001\n\024HotelP" +
      "erformanceView\022L\n\rresource_name\030\001 \001(\tB5\340" +
      "A\003\372A/\n-googleads.googleapis.com/HotelPer" +
      "formanceView:`\352A]\n-googleads.googleapis." +
      "com/HotelPerformanceView\022,customers/{cus" +
      "tomer_id}/hotelPerformanceViewB\206\002\n%com.g" +
      "oogle.ads.googleads.v8.resourcesB\031HotelP" +
      "erformanceViewProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v8/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V8.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V8\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_HotelPerformanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_HotelPerformanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_HotelPerformanceView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
