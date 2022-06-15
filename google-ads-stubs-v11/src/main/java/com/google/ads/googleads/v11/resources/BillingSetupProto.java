// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/billing_setup.proto

package com.google.ads.googleads.v11.resources;

public final class BillingSetupProto {
  private BillingSetupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_BillingSetup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_BillingSetup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_BillingSetup_PaymentsAccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v11/resources/bil" +
      "ling_setup.proto\022\"google.ads.googleads.v" +
      "11.resources\0329google/ads/googleads/v11/e" +
      "nums/billing_setup_status.proto\032.google/" +
      "ads/googleads/v11/enums/time_type.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\"\372\010\n\014BillingSetup\022D\n\r" +
      "resource_name\030\001 \001(\tB-\340A\005\372A\'\n%googleads.g" +
      "oogleapis.com/BillingSetup\022\024\n\002id\030\017 \001(\003B\003" +
      "\340A\003H\002\210\001\001\022^\n\006status\030\003 \001(\0162I.google.ads.go" +
      "ogleads.v11.enums.BillingSetupStatusEnum" +
      ".BillingSetupStatusB\003\340A\003\022O\n\020payments_acc" +
      "ount\030\022 \001(\tB0\340A\005\372A*\n(googleads.googleapis" +
      ".com/PaymentsAccountH\003\210\001\001\022h\n\025payments_ac" +
      "count_info\030\014 \001(\0132D.google.ads.googleads." +
      "v11.resources.BillingSetup.PaymentsAccou" +
      "ntInfoB\003\340A\005\022\036\n\017start_date_time\030\020 \001(\tB\003\340A" +
      "\005H\000\022U\n\017start_time_type\030\n \001(\01625.google.ad" +
      "s.googleads.v11.enums.TimeTypeEnum.TimeT" +
      "ypeB\003\340A\005H\000\022\034\n\rend_date_time\030\021 \001(\tB\003\340A\003H\001" +
      "\022S\n\rend_time_type\030\016 \001(\01625.google.ads.goo" +
      "gleads.v11.enums.TimeTypeEnum.TimeTypeB\003" +
      "\340A\003H\001\032\354\002\n\023PaymentsAccountInfo\022%\n\023payment" +
      "s_account_id\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\'\n\025payments" +
      "_account_name\030\007 \001(\tB\003\340A\005H\001\210\001\001\022%\n\023payment" +
      "s_profile_id\030\010 \001(\tB\003\340A\005H\002\210\001\001\022\'\n\025payments" +
      "_profile_name\030\t \001(\tB\003\340A\003H\003\210\001\001\022/\n\035seconda" +
      "ry_payments_profile_id\030\n \001(\tB\003\340A\003H\004\210\001\001B\026" +
      "\n\024_payments_account_idB\030\n\026_payments_acco" +
      "unt_nameB\026\n\024_payments_profile_idB\030\n\026_pay" +
      "ments_profile_nameB \n\036_secondary_payment" +
      "s_profile_id:d\352Aa\n%googleads.googleapis." +
      "com/BillingSetup\0228customers/{customer_id" +
      "}/billingSetups/{billing_setup_id}B\014\n\nst" +
      "art_timeB\n\n\010end_timeB\005\n\003_idB\023\n\021_payments" +
      "_accountB\203\002\n&com.google.ads.googleads.v1" +
      "1.resourcesB\021BillingSetupProtoP\001ZKgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v11/resources;resources\242\002\003GAA\252\002\"Go" +
      "ogle.Ads.GoogleAds.V11.Resources\312\002\"Googl" +
      "e\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::" +
      "Ads::GoogleAds::V11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.BillingSetupStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_BillingSetup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_BillingSetup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_BillingSetup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "PaymentsAccount", "PaymentsAccountInfo", "StartDateTime", "StartTimeType", "EndDateTime", "EndTimeType", "StartTime", "EndTime", "Id", "PaymentsAccount", });
    internal_static_google_ads_googleads_v11_resources_BillingSetup_PaymentsAccountInfo_descriptor =
      internal_static_google_ads_googleads_v11_resources_BillingSetup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_BillingSetup_PaymentsAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_BillingSetup_PaymentsAccountInfo_descriptor,
        new java.lang.String[] { "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", "PaymentsAccountId", "PaymentsAccountName", "PaymentsProfileId", "PaymentsProfileName", "SecondaryPaymentsProfileId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.BillingSetupStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
