// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_draft_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * Request message for [CampaignDraftService.PromoteCampaignDraft][google.ads.googleads.v7.services.CampaignDraftService.PromoteCampaignDraft].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.PromoteCampaignDraftRequest}
 */
public final class PromoteCampaignDraftRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.PromoteCampaignDraftRequest)
    PromoteCampaignDraftRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromoteCampaignDraftRequest.newBuilder() to construct.
  private PromoteCampaignDraftRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromoteCampaignDraftRequest() {
    campaignDraft_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromoteCampaignDraftRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PromoteCampaignDraftRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            campaignDraft_ = s;
            break;
          }
          case 16: {

            validateOnly_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v7.services.CampaignDraftServiceProto.internal_static_google_ads_googleads_v7_services_PromoteCampaignDraftRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CampaignDraftServiceProto.internal_static_google_ads_googleads_v7_services_PromoteCampaignDraftRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.class, com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.Builder.class);
  }

  public static final int CAMPAIGN_DRAFT_FIELD_NUMBER = 1;
  private volatile java.lang.Object campaignDraft_;
  /**
   * <pre>
   * Required. The resource name of the campaign draft to promote.
   * </pre>
   *
   * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The campaignDraft.
   */
  @java.lang.Override
  public java.lang.String getCampaignDraft() {
    java.lang.Object ref = campaignDraft_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaignDraft_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the campaign draft to promote.
   * </pre>
   *
   * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for campaignDraft.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignDraftBytes() {
    java.lang.Object ref = campaignDraft_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaignDraft_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_;
  /**
   * <pre>
   * If true, the request is validated but no Long Running Operation is created.
   * Only errors are returned.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignDraft_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, campaignDraft_);
    }
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignDraft_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, campaignDraft_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validateOnly_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest other = (com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest) obj;

    if (!getCampaignDraft()
        .equals(other.getCampaignDraft())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAMPAIGN_DRAFT_FIELD_NUMBER;
    hash = (53 * hash) + getCampaignDraft().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for [CampaignDraftService.PromoteCampaignDraft][google.ads.googleads.v7.services.CampaignDraftService.PromoteCampaignDraft].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.PromoteCampaignDraftRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.PromoteCampaignDraftRequest)
      com.google.ads.googleads.v7.services.PromoteCampaignDraftRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignDraftServiceProto.internal_static_google_ads_googleads_v7_services_PromoteCampaignDraftRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CampaignDraftServiceProto.internal_static_google_ads_googleads_v7_services_PromoteCampaignDraftRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.class, com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      campaignDraft_ = "";

      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CampaignDraftServiceProto.internal_static_google_ads_googleads_v7_services_PromoteCampaignDraftRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest build() {
      com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest buildPartial() {
      com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest result = new com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest(this);
      result.campaignDraft_ = campaignDraft_;
      result.validateOnly_ = validateOnly_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest) {
        return mergeFrom((com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest other) {
      if (other == com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest.getDefaultInstance()) return this;
      if (!other.getCampaignDraft().isEmpty()) {
        campaignDraft_ = other.campaignDraft_;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object campaignDraft_ = "";
    /**
     * <pre>
     * Required. The resource name of the campaign draft to promote.
     * </pre>
     *
     * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The campaignDraft.
     */
    public java.lang.String getCampaignDraft() {
      java.lang.Object ref = campaignDraft_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaignDraft_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the campaign draft to promote.
     * </pre>
     *
     * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for campaignDraft.
     */
    public com.google.protobuf.ByteString
        getCampaignDraftBytes() {
      java.lang.Object ref = campaignDraft_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaignDraft_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the campaign draft to promote.
     * </pre>
     *
     * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The campaignDraft to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignDraft(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaignDraft_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the campaign draft to promote.
     * </pre>
     *
     * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignDraft() {
      
      campaignDraft_ = getDefaultInstance().getCampaignDraft();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the campaign draft to promote.
     * </pre>
     *
     * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for campaignDraft to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignDraftBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaignDraft_ = value;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, the request is validated but no Long Running Operation is created.
     * Only errors are returned.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, the request is validated but no Long Running Operation is created.
     * Only errors are returned.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the request is validated but no Long Running Operation is created.
     * Only errors are returned.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.PromoteCampaignDraftRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.PromoteCampaignDraftRequest)
  private static final com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest();
  }

  public static com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromoteCampaignDraftRequest>
      PARSER = new com.google.protobuf.AbstractParser<PromoteCampaignDraftRequest>() {
    @java.lang.Override
    public PromoteCampaignDraftRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PromoteCampaignDraftRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PromoteCampaignDraftRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromoteCampaignDraftRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.PromoteCampaignDraftRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

