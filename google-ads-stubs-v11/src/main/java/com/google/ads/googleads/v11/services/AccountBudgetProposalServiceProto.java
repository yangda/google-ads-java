// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/account_budget_proposal_service.proto

package com.google.ads.googleads.v11.services;

public final class AccountBudgetProposalServiceProto {
  private AccountBudgetProposalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_AccountBudgetProposalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_AccountBudgetProposalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v11/services/acco" +
      "unt_budget_proposal_service.proto\022!googl" +
      "e.ads.googleads.v11.services\032@google/ads" +
      "/googleads/v11/resources/account_budget_" +
      "proposal.proto\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\260\001\n\"MutateAccountBudgetProposalReque" +
      "st\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022Y\n\toperatio" +
      "n\030\002 \001(\0132A.google.ads.googleads.v11.servi" +
      "ces.AccountBudgetProposalOperationB\003\340A\002\022" +
      "\025\n\rvalidate_only\030\003 \001(\010\"\362\001\n\036AccountBudget" +
      "ProposalOperation\022/\n\013update_mask\030\003 \001(\0132\032" +
      ".google.protobuf.FieldMask\022K\n\006create\030\002 \001" +
      "(\01329.google.ads.googleads.v11.resources." +
      "AccountBudgetProposalH\000\022E\n\006remove\030\001 \001(\tB" +
      "3\372A0\n.googleads.googleapis.com/AccountBu" +
      "dgetProposalH\000B\013\n\toperation\"{\n#MutateAcc" +
      "ountBudgetProposalResponse\022T\n\006result\030\002 \001" +
      "(\0132D.google.ads.googleads.v11.services.M" +
      "utateAccountBudgetProposalResult\"o\n!Muta" +
      "teAccountBudgetProposalResult\022J\n\rresourc" +
      "e_name\030\001 \001(\tB3\372A0\n.googleads.googleapis." +
      "com/AccountBudgetProposal2\365\002\n\034AccountBud" +
      "getProposalService\022\215\002\n\033MutateAccountBudg" +
      "etProposal\022E.google.ads.googleads.v11.se" +
      "rvices.MutateAccountBudgetProposalReques" +
      "t\032F.google.ads.googleads.v11.services.Mu" +
      "tateAccountBudgetProposalResponse\"_\202\323\344\223\002" +
      "A\"</v11/customers/{customer_id=*}/accoun" +
      "tBudgetProposals:mutate:\001*\332A\025customer_id" +
      ",operation\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\215\002\n%com.google.ads.googleads.v11.servi" +
      "cesB!AccountBudgetProposalServiceProtoP\001" +
      "ZIgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v11/services;services\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V11.Services\312\002!" +
      "Google\\Ads\\GoogleAds\\V11\\Services\352\002%Goog" +
      "le::Ads::GoogleAds::V11::Servicesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.resources.AccountBudgetProposalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_AccountBudgetProposalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_AccountBudgetProposalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_AccountBudgetProposalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateAccountBudgetProposalResult_descriptor,
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
    com.google.ads.googleads.v11.resources.AccountBudgetProposalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
