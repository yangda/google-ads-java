// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/shared_set.proto

package com.google.ads.googleads.v8.resources;

public final class SharedSetProto {
  private SharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_SharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_SharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v8/resources/shar" +
      "ed_set.proto\022!google.ads.googleads.v8.re" +
      "sources\0325google/ads/googleads/v8/enums/s" +
      "hared_set_status.proto\0323google/ads/googl" +
      "eads/v8/enums/shared_set_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\034google/api/annotations." +
      "proto\"\370\003\n\tSharedSet\022A\n\rresource_name\030\001 \001" +
      "(\tB*\340A\005\372A$\n\"googleads.googleapis.com/Sha" +
      "redSet\022\024\n\002id\030\010 \001(\003B\003\340A\003H\000\210\001\001\022Q\n\004type\030\003 \001" +
      "(\0162>.google.ads.googleads.v8.enums.Share" +
      "dSetTypeEnum.SharedSetTypeB\003\340A\005\022\021\n\004name\030" +
      "\t \001(\tH\001\210\001\001\022W\n\006status\030\005 \001(\0162B.google.ads." +
      "googleads.v8.enums.SharedSetStatusEnum.S" +
      "haredSetStatusB\003\340A\003\022\036\n\014member_count\030\n \001(" +
      "\003B\003\340A\003H\002\210\001\001\022!\n\017reference_count\030\013 \001(\003B\003\340A" +
      "\003H\003\210\001\001:[\352AX\n\"googleads.googleapis.com/Sh" +
      "aredSet\0222customers/{customer_id}/sharedS" +
      "ets/{shared_set_id}B\005\n\003_idB\007\n\005_nameB\017\n\r_" +
      "member_countB\022\n\020_reference_countB\373\001\n%com" +
      ".google.ads.googleads.v8.resourcesB\016Shar" +
      "edSetProtoP\001ZJgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v8/resources;r" +
      "esources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8" +
      ".Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Res" +
      "ources\352\002%Google::Ads::GoogleAds::V8::Res" +
      "ourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.SharedSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.SharedSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_SharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_SharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_SharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "Name", "Status", "MemberCount", "ReferenceCount", "Id", "Name", "MemberCount", "ReferenceCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.SharedSetStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.SharedSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
