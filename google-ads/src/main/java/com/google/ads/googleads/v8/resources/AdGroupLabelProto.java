// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/ad_group_label.proto

package com.google.ads.googleads.v8.resources;

public final class AdGroupLabelProto {
  private AdGroupLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_AdGroupLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_AdGroupLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v8/resources/ad_g" +
      "roup_label.proto\022!google.ads.googleads.v" +
      "8.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\034google/" +
      "api/annotations.proto\"\324\002\n\014AdGroupLabel\022D" +
      "\n\rresource_name\030\001 \001(\tB-\340A\005\372A\'\n%googleads" +
      ".googleapis.com/AdGroupLabel\022?\n\010ad_group" +
      "\030\004 \001(\tB(\340A\005\372A\"\n googleads.googleapis.com" +
      "/AdGroupH\000\210\001\001\022:\n\005label\030\005 \001(\tB&\340A\005\372A \n\036go" +
      "ogleads.googleapis.com/LabelH\001\210\001\001:j\352Ag\n%" +
      "googleads.googleapis.com/AdGroupLabel\022>c" +
      "ustomers/{customer_id}/adGroupLabels/{ad" +
      "_group_id}~{label_id}B\013\n\t_ad_groupB\010\n\006_l" +
      "abelB\376\001\n%com.google.ads.googleads.v8.res" +
      "ourcesB\021AdGroupLabelProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v8/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V8.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V8\\Resources\352\002%Google::Ads::Goo" +
      "gleAds::V8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_AdGroupLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_AdGroupLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_AdGroupLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "Label", "AdGroup", "Label", });
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
