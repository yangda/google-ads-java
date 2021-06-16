// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/account_budget_proposal.proto

package com.google.ads.googleads.v8.resources;

public final class AccountBudgetProposalProto {
  private AccountBudgetProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_AccountBudgetProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_AccountBudgetProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v8/resources/acco" +
      "unt_budget_proposal.proto\022!google.ads.go" +
      "ogleads.v8.resources\032Bgoogle/ads/googlea" +
      "ds/v8/enums/account_budget_proposal_stat" +
      "us.proto\032@google/ads/googleads/v8/enums/" +
      "account_budget_proposal_type.proto\0327goog" +
      "le/ads/googleads/v8/enums/spending_limit" +
      "_type.proto\032-google/ads/googleads/v8/enu" +
      "ms/time_type.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\034" +
      "google/api/annotations.proto\"\367\016\n\025Account" +
      "BudgetProposal\022M\n\rresource_name\030\001 \001(\tB6\340" +
      "A\005\372A0\n.googleads.googleapis.com/AccountB" +
      "udgetProposal\022\024\n\002id\030\031 \001(\003B\003\340A\003H\005\210\001\001\022I\n\rb" +
      "illing_setup\030\032 \001(\tB-\340A\005\372A\'\n%googleads.go" +
      "ogleapis.com/BillingSetupH\006\210\001\001\022K\n\016accoun" +
      "t_budget\030\033 \001(\tB.\340A\005\372A(\n&googleads.google" +
      "apis.com/AccountBudgetH\007\210\001\001\022r\n\rproposal_" +
      "type\030\004 \001(\0162V.google.ads.googleads.v8.enu" +
      "ms.AccountBudgetProposalTypeEnum.Account" +
      "BudgetProposalTypeB\003\340A\005\022o\n\006status\030\017 \001(\0162" +
      "Z.google.ads.googleads.v8.enums.AccountB" +
      "udgetProposalStatusEnum.AccountBudgetPro" +
      "posalStatusB\003\340A\003\022\037\n\rproposed_name\030\034 \001(\tB" +
      "\003\340A\005H\010\210\001\001\022*\n\030approved_start_date_time\030\036 " +
      "\001(\tB\003\340A\003H\t\210\001\001\0220\n\036proposed_purchase_order" +
      "_number\030# \001(\tB\003\340A\005H\n\210\001\001\022 \n\016proposed_note" +
      "s\030$ \001(\tB\003\340A\005H\013\210\001\001\022$\n\022creation_date_time\030" +
      "% \001(\tB\003\340A\003H\014\210\001\001\022$\n\022approval_date_time\030& " +
      "\001(\tB\003\340A\003H\r\210\001\001\022\'\n\030proposed_start_date_tim" +
      "e\030\035 \001(\tB\003\340A\005H\000\022]\n\030proposed_start_time_ty" +
      "pe\030\007 \001(\01624.google.ads.googleads.v8.enums" +
      ".TimeTypeEnum.TimeTypeB\003\340A\005H\000\022%\n\026propose" +
      "d_end_date_time\030\037 \001(\tB\003\340A\005H\001\022[\n\026proposed" +
      "_end_time_type\030\t \001(\01624.google.ads.google" +
      "ads.v8.enums.TimeTypeEnum.TimeTypeB\003\340A\005H" +
      "\001\022%\n\026approved_end_date_time\030  \001(\tB\003\340A\003H\002" +
      "\022[\n\026approved_end_time_type\030\026 \001(\01624.googl" +
      "e.ads.googleads.v8.enums.TimeTypeEnum.Ti" +
      "meTypeB\003\340A\003H\002\022-\n\036proposed_spending_limit" +
      "_micros\030! \001(\003B\003\340A\005H\003\022s\n\034proposed_spendin" +
      "g_limit_type\030\013 \001(\0162F.google.ads.googlead" +
      "s.v8.enums.SpendingLimitTypeEnum.Spendin" +
      "gLimitTypeB\003\340A\005H\003\022-\n\036approved_spending_l" +
      "imit_micros\030\" \001(\003B\003\340A\003H\004\022s\n\034approved_spe" +
      "nding_limit_type\030\030 \001(\0162F.google.ads.goog" +
      "leads.v8.enums.SpendingLimitTypeEnum.Spe" +
      "ndingLimitTypeB\003\340A\003H\004:\200\001\352A}\n.googleads.g" +
      "oogleapis.com/AccountBudgetProposal\022Kcus" +
      "tomers/{customer_id}/accountBudgetPropos" +
      "als/{account_budget_proposal_id}B\025\n\023prop" +
      "osed_start_timeB\023\n\021proposed_end_timeB\023\n\021" +
      "approved_end_timeB\031\n\027proposed_spending_l" +
      "imitB\031\n\027approved_spending_limitB\005\n\003_idB\020" +
      "\n\016_billing_setupB\021\n\017_account_budgetB\020\n\016_" +
      "proposed_nameB\033\n\031_approved_start_date_ti" +
      "meB!\n\037_proposed_purchase_order_numberB\021\n" +
      "\017_proposed_notesB\025\n\023_creation_date_timeB" +
      "\025\n\023_approval_date_timeB\207\002\n%com.google.ad" +
      "s.googleads.v8.resourcesB\032AccountBudgetP" +
      "roposalProtoP\001ZJgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v8/resources" +
      ";resources\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\R" +
      "esources\352\002%Google::Ads::GoogleAds::V8::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.AccountBudgetProposalStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.AccountBudgetProposalTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.SpendingLimitTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_AccountBudgetProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_AccountBudgetProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_AccountBudgetProposal_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "BillingSetup", "AccountBudget", "ProposalType", "Status", "ProposedName", "ApprovedStartDateTime", "ProposedPurchaseOrderNumber", "ProposedNotes", "CreationDateTime", "ApprovalDateTime", "ProposedStartDateTime", "ProposedStartTimeType", "ProposedEndDateTime", "ProposedEndTimeType", "ApprovedEndDateTime", "ApprovedEndTimeType", "ProposedSpendingLimitMicros", "ProposedSpendingLimitType", "ApprovedSpendingLimitMicros", "ApprovedSpendingLimitType", "ProposedStartTime", "ProposedEndTime", "ApprovedEndTime", "ProposedSpendingLimit", "ApprovedSpendingLimit", "Id", "BillingSetup", "AccountBudget", "ProposedName", "ApprovedStartDateTime", "ProposedPurchaseOrderNumber", "ProposedNotes", "CreationDateTime", "ApprovalDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.AccountBudgetProposalStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.AccountBudgetProposalTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.SpendingLimitTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
