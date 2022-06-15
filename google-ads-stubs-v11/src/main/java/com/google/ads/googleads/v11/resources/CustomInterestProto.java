// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/custom_interest.proto

package com.google.ads.googleads.v11.resources;

public final class CustomInterestProto {
  private CustomInterestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_CustomInterest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_CustomInterest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_CustomInterestMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_CustomInterestMember_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v11/resources/cus" +
      "tom_interest.proto\022\"google.ads.googleads" +
      ".v11.resources\032@google/ads/googleads/v11" +
      "/enums/custom_interest_member_type.proto" +
      "\032;google/ads/googleads/v11/enums/custom_" +
      "interest_status.proto\0329google/ads/google" +
      "ads/v11/enums/custom_interest_type.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\252\004\n\016CustomInterest\022" +
      "F\n\rresource_name\030\001 \001(\tB/\340A\005\372A)\n\'googlead" +
      "s.googleapis.com/CustomInterest\022\024\n\002id\030\010 " +
      "\001(\003B\003\340A\003H\000\210\001\001\022]\n\006status\030\003 \001(\0162M.google.a" +
      "ds.googleads.v11.enums.CustomInterestSta" +
      "tusEnum.CustomInterestStatus\022\021\n\004name\030\t \001" +
      "(\tH\001\210\001\001\022W\n\004type\030\005 \001(\0162I.google.ads.googl" +
      "eads.v11.enums.CustomInterestTypeEnum.Cu" +
      "stomInterestType\022\030\n\013description\030\n \001(\tH\002\210" +
      "\001\001\022I\n\007members\030\007 \003(\01328.google.ads.googlea" +
      "ds.v11.resources.CustomInterestMember:j\352" +
      "Ag\n\'googleads.googleapis.com/CustomInter" +
      "est\022<customers/{customer_id}/customInter" +
      "ests/{custom_interest_id}B\005\n\003_idB\007\n\005_nam" +
      "eB\016\n\014_description\"\250\001\n\024CustomInterestMemb" +
      "er\022j\n\013member_type\030\001 \001(\0162U.google.ads.goo" +
      "gleads.v11.enums.CustomInterestMemberTyp" +
      "eEnum.CustomInterestMemberType\022\026\n\tparame" +
      "ter\030\003 \001(\tH\000\210\001\001B\014\n\n_parameterB\205\002\n&com.goo" +
      "gle.ads.googleads.v11.resourcesB\023CustomI" +
      "nterestProtoP\001ZKgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v11/resource" +
      "s;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds" +
      ".V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V1" +
      "1\\Resources\352\002&Google::Ads::GoogleAds::V1" +
      "1::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.CustomInterestMemberTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.CustomInterestStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.CustomInterestTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_CustomInterest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_CustomInterest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_CustomInterest_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "Name", "Type", "Description", "Members", "Id", "Name", "Description", });
    internal_static_google_ads_googleads_v11_resources_CustomInterestMember_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_resources_CustomInterestMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_CustomInterestMember_descriptor,
        new java.lang.String[] { "MemberType", "Parameter", "Parameter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.CustomInterestMemberTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.CustomInterestStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.CustomInterestTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
