// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/gender_view.proto

package com.google.ads.googleads.v8.resources;

public final class GenderViewProto {
  private GenderViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_GenderView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_GenderView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v8/resources/gend" +
      "er_view.proto\022!google.ads.googleads.v8.r" +
      "esources\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032\034google/api" +
      "/annotations.proto\"\274\001\n\nGenderView\022B\n\rres" +
      "ource_name\030\001 \001(\tB+\340A\003\372A%\n#googleads.goog" +
      "leapis.com/GenderView:j\352Ag\n#googleads.go" +
      "ogleapis.com/GenderView\022@customers/{cust" +
      "omer_id}/genderViews/{ad_group_id}~{crit" +
      "erion_id}B\374\001\n%com.google.ads.googleads.v" +
      "8.resourcesB\017GenderViewProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v8/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V8.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V8\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_GenderView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_GenderView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_GenderView_descriptor,
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
