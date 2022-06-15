// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/user_list_service.proto

package com.google.ads.googleads.v11.services;

public final class UserListServiceProto {
  private UserListServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateUserListsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateUserListsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UserListOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UserListOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateUserListsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateUserListsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateUserListResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateUserListResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v11/services/user" +
      "_list_service.proto\022!google.ads.googlead" +
      "s.v11.services\0322google/ads/googleads/v11" +
      "/resources/user_list.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\"\261\001\n\026MutateUserListsRequest\022\030\n\013customer_" +
      "id\030\001 \001(\tB\003\340A\002\022M\n\noperations\030\002 \003(\01324.goog" +
      "le.ads.googleads.v11.services.UserListOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"\213\002\n\021UserListOperati" +
      "on\022/\n\013update_mask\030\004 \001(\0132\032.google.protobu" +
      "f.FieldMask\022>\n\006create\030\001 \001(\0132,.google.ads" +
      ".googleads.v11.resources.UserListH\000\022>\n\006u" +
      "pdate\030\002 \001(\0132,.google.ads.googleads.v11.r" +
      "esources.UserListH\000\0228\n\006remove\030\003 \001(\tB&\372A#" +
      "\n!googleads.googleapis.com/UserListH\000B\013\n" +
      "\toperation\"\226\001\n\027MutateUserListsResponse\0221" +
      "\n\025partial_failure_error\030\003 \001(\0132\022.google.r" +
      "pc.Status\022H\n\007results\030\002 \003(\01327.google.ads." +
      "googleads.v11.services.MutateUserListRes" +
      "ult\"U\n\024MutateUserListResult\022=\n\rresource_" +
      "name\030\001 \001(\tB&\372A#\n!googleads.googleapis.co" +
      "m/UserList2\270\002\n\017UserListService\022\335\001\n\017Mutat" +
      "eUserLists\0229.google.ads.googleads.v11.se" +
      "rvices.MutateUserListsRequest\032:.google.a" +
      "ds.googleads.v11.services.MutateUserList" +
      "sResponse\"S\202\323\344\223\0024\"//v11/customers/{custo" +
      "mer_id=*}/userLists:mutate:\001*\332A\026customer" +
      "_id,operations\032E\312A\030googleads.googleapis." +
      "com\322A\'https://www.googleapis.com/auth/ad" +
      "wordsB\200\002\n%com.google.ads.googleads.v11.s" +
      "ervicesB\024UserListServiceProtoP\001ZIgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v11/services;services\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V11.Services\312\002!Google\\Ad" +
      "s\\GoogleAds\\V11\\Services\352\002%Google::Ads::" +
      "GoogleAds::V11::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.resources.UserListProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateUserListsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateUserListsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateUserListsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_UserListOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_UserListOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UserListOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateUserListsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateUserListsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateUserListsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_MutateUserListResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateUserListResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateUserListResult_descriptor,
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
    com.google.ads.googleads.v11.resources.UserListProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
