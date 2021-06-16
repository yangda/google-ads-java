// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/customer_label_service.proto

package com.google.ads.googleads.v8.services;

public final class CustomerLabelServiceProto {
  private CustomerLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_GetCustomerLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_GetCustomerLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_CustomerLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_CustomerLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_services_MutateCustomerLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v8/services/custo" +
      "mer_label_service.proto\022 google.ads.goog" +
      "leads.v8.services\0326google/ads/googleads/" +
      "v8/resources/customer_label.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032\027google/rpc" +
      "/status.proto\"`\n\027GetCustomerLabelRequest" +
      "\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372A(\n&googlea" +
      "ds.googleapis.com/CustomerLabel\"\272\001\n\033Muta" +
      "teCustomerLabelsRequest\022\030\n\013customer_id\030\001" +
      " \001(\tB\003\340A\002\022Q\n\noperations\030\002 \003(\01328.google.a" +
      "ds.googleads.v8.services.CustomerLabelOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"{\n\026CustomerLabelOpe" +
      "ration\022B\n\006create\030\001 \001(\01320.google.ads.goog" +
      "leads.v8.resources.CustomerLabelH\000\022\020\n\006re" +
      "move\030\002 \001(\tH\000B\013\n\toperation\"\237\001\n\034MutateCust" +
      "omerLabelsResponse\0221\n\025partial_failure_er" +
      "ror\030\003 \001(\0132\022.google.rpc.Status\022L\n\007results" +
      "\030\002 \003(\0132;.google.ads.googleads.v8.service" +
      "s.MutateCustomerLabelResult\"2\n\031MutateCus" +
      "tomerLabelResult\022\025\n\rresource_name\030\001 \001(\t2" +
      "\232\004\n\024CustomerLabelService\022\311\001\n\020GetCustomer" +
      "Label\0229.google.ads.googleads.v8.services" +
      ".GetCustomerLabelRequest\0320.google.ads.go" +
      "ogleads.v8.resources.CustomerLabel\"H\202\323\344\223" +
      "\0022\0220/v8/{resource_name=customers/*/custo" +
      "merLabels/*}\332A\rresource_name\022\356\001\n\024MutateC" +
      "ustomerLabels\022=.google.ads.googleads.v8." +
      "services.MutateCustomerLabelsRequest\032>.g" +
      "oogle.ads.googleads.v8.services.MutateCu" +
      "stomerLabelsResponse\"W\202\323\344\223\0028\"3/v8/custom" +
      "ers/{customer_id=*}/customerLabels:mutat" +
      "e:\001*\332A\026customer_id,operations\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\200\002\n$com.google.ads." +
      "googleads.v8.servicesB\031CustomerLabelServ" +
      "iceProtoP\001ZHgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v8/services;serv" +
      "ices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Ser" +
      "vices\312\002 Google\\Ads\\GoogleAds\\V8\\Services" +
      "\352\002$Google::Ads::GoogleAds::V8::Servicesb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.resources.CustomerLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_services_GetCustomerLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_services_GetCustomerLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_GetCustomerLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v8_services_CustomerLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v8_services_CustomerLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_CustomerLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCustomerLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v8_services_MutateCustomerLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_services_MutateCustomerLabelResult_descriptor,
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
    com.google.ads.googleads.v8.resources.CustomerLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
