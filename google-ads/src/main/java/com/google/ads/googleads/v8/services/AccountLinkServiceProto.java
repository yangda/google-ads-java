// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/account_link_service.proto

package com.google.ads.googleads.v8.services;

public final class AccountLinkServiceProto {
  private AccountLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_CreateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_CreateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_AccountLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_AccountLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateAccountLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v8/services/accou" +
      "nt_link_service.proto\022 google.ads.google" +
      "ads.v8.services\0324google/ads/googleads/v8" +
      "/resources/account_link.proto\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032 google/protobu" +
      "f/field_mask.proto\"\\\n\025GetAccountLinkRequ" +
      "est\022C\n\rresource_name\030\001 \001(\tB,\340A\002\372A&\n$goog" +
      "leads.googleapis.com/AccountLink\"\177\n\030Crea" +
      "teAccountLinkRequest\022\030\n\013customer_id\030\001 \001(" +
      "\tB\003\340A\002\022I\n\014account_link\030\002 \001(\0132..google.ad" +
      "s.googleads.v8.resources.AccountLinkB\003\340A" +
      "\002\"2\n\031CreateAccountLinkResponse\022\025\n\rresour" +
      "ce_name\030\001 \001(\t\"\264\001\n\030MutateAccountLinkReque" +
      "st\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022N\n\toperatio" +
      "n\030\002 \001(\01326.google.ads.googleads.v8.servic" +
      "es.AccountLinkOperationB\003\340A\002\022\027\n\017partial_" +
      "failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\250\001\n" +
      "\024AccountLinkOperation\022/\n\013update_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\022@\n\006update" +
      "\030\002 \001(\0132..google.ads.googleads.v8.resourc" +
      "es.AccountLinkH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\top" +
      "eration\"f\n\031MutateAccountLinkResponse\022I\n\006" +
      "result\030\001 \001(\01329.google.ads.googleads.v8.s" +
      "ervices.MutateAccountLinkResult\"0\n\027Mutat" +
      "eAccountLinkResult\022\025\n\rresource_name\030\001 \001(" +
      "\t2\354\005\n\022AccountLinkService\022\301\001\n\016GetAccountL" +
      "ink\0227.google.ads.googleads.v8.services.G" +
      "etAccountLinkRequest\032..google.ads.google" +
      "ads.v8.resources.AccountLink\"F\202\323\344\223\0020\022./v" +
      "8/{resource_name=customers/*/accountLink" +
      "s/*}\332A\rresource_name\022\345\001\n\021CreateAccountLi" +
      "nk\022:.google.ads.googleads.v8.services.Cr" +
      "eateAccountLinkRequest\032;.google.ads.goog" +
      "leads.v8.services.CreateAccountLinkRespo" +
      "nse\"W\202\323\344\223\0026\"1/v8/customers/{customer_id=" +
      "*}/accountLinks:create:\001*\332A\030customer_id," +
      "account_link\022\342\001\n\021MutateAccountLink\022:.goo" +
      "gle.ads.googleads.v8.services.MutateAcco" +
      "untLinkRequest\032;.google.ads.googleads.v8" +
      ".services.MutateAccountLinkResponse\"T\202\323\344" +
      "\223\0026\"1/v8/customers/{customer_id=*}/accou" +
      "ntLinks:mutate:\001*\332A\025customer_id,operatio" +
      "n\032E\312A\030googleads.googleapis.com\322A\'https:/" +
      "/www.googleapis.com/auth/adwordsB\376\001\n$com" +
      ".google.ads.googleads.v8.servicesB\027Accou" +
      "ntLinkServiceProtoP\001ZHgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v8/ser" +
      "vices;services\242\002\003GAA\252\002 Google.Ads.Google" +
      "Ads.V8.Services\312\002 Google\\Ads\\GoogleAds\\V" +
      "8\\Services\352\002$Google::Ads::GoogleAds::V8:" +
      ":Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.resources.AccountLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetAccountLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_CreateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "AccountLink", });
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v8_services_CreateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_CreateAccountLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v8_services_AccountLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v8_services_AccountLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_AccountLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateAccountLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v8_services_MutateAccountLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateAccountLinkResult_descriptor,
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
    com.google.ads.googleads.v8.resources.AccountLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
