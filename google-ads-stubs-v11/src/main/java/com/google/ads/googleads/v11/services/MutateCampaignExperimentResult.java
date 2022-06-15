// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/campaign_experiment_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The result for the campaign experiment mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.MutateCampaignExperimentResult}
 */
public final class MutateCampaignExperimentResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.MutateCampaignExperimentResult)
    MutateCampaignExperimentResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignExperimentResult.newBuilder() to construct.
  private MutateCampaignExperimentResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignExperimentResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignExperimentResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCampaignExperimentResult(
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

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v11.resources.CampaignExperiment.Builder subBuilder = null;
            if (campaignExperiment_ != null) {
              subBuilder = campaignExperiment_.toBuilder();
            }
            campaignExperiment_ = input.readMessage(com.google.ads.googleads.v11.resources.CampaignExperiment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaignExperiment_);
              campaignExperiment_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v11.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.class, com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_EXPERIMENT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.resources.CampaignExperiment campaignExperiment_;
  /**
   * <pre>
   * The mutated campaign experiment with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
   * @return Whether the campaignExperiment field is set.
   */
  @java.lang.Override
  public boolean hasCampaignExperiment() {
    return campaignExperiment_ != null;
  }
  /**
   * <pre>
   * The mutated campaign experiment with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
   * @return The campaignExperiment.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.CampaignExperiment getCampaignExperiment() {
    return campaignExperiment_ == null ? com.google.ads.googleads.v11.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
  }
  /**
   * <pre>
   * The mutated campaign experiment with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.CampaignExperimentOrBuilder getCampaignExperimentOrBuilder() {
    return getCampaignExperiment();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (campaignExperiment_ != null) {
      output.writeMessage(2, getCampaignExperiment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (campaignExperiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignExperiment());
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.MutateCampaignExperimentResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.MutateCampaignExperimentResult other = (com.google.ads.googleads.v11.services.MutateCampaignExperimentResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignExperiment() != other.hasCampaignExperiment()) return false;
    if (hasCampaignExperiment()) {
      if (!getCampaignExperiment()
          .equals(other.getCampaignExperiment())) return false;
    }
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCampaignExperiment()) {
      hash = (37 * hash) + CAMPAIGN_EXPERIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignExperiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.MutateCampaignExperimentResult prototype) {
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
   * The result for the campaign experiment mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.MutateCampaignExperimentResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.MutateCampaignExperimentResult)
      com.google.ads.googleads.v11.services.MutateCampaignExperimentResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.class, com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.newBuilder()
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
      resourceName_ = "";

      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = null;
      } else {
        campaignExperiment_ = null;
        campaignExperimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateCampaignExperimentResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateCampaignExperimentResult build() {
      com.google.ads.googleads.v11.services.MutateCampaignExperimentResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateCampaignExperimentResult buildPartial() {
      com.google.ads.googleads.v11.services.MutateCampaignExperimentResult result = new com.google.ads.googleads.v11.services.MutateCampaignExperimentResult(this);
      result.resourceName_ = resourceName_;
      if (campaignExperimentBuilder_ == null) {
        result.campaignExperiment_ = campaignExperiment_;
      } else {
        result.campaignExperiment_ = campaignExperimentBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v11.services.MutateCampaignExperimentResult) {
        return mergeFrom((com.google.ads.googleads.v11.services.MutateCampaignExperimentResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.MutateCampaignExperimentResult other) {
      if (other == com.google.ads.googleads.v11.services.MutateCampaignExperimentResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCampaignExperiment()) {
        mergeCampaignExperiment(other.getCampaignExperiment());
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
      com.google.ads.googleads.v11.services.MutateCampaignExperimentResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.services.MutateCampaignExperimentResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.resources.CampaignExperiment campaignExperiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.CampaignExperiment, com.google.ads.googleads.v11.resources.CampaignExperiment.Builder, com.google.ads.googleads.v11.resources.CampaignExperimentOrBuilder> campaignExperimentBuilder_;
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     * @return Whether the campaignExperiment field is set.
     */
    public boolean hasCampaignExperiment() {
      return campaignExperimentBuilder_ != null || campaignExperiment_ != null;
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     * @return The campaignExperiment.
     */
    public com.google.ads.googleads.v11.resources.CampaignExperiment getCampaignExperiment() {
      if (campaignExperimentBuilder_ == null) {
        return campaignExperiment_ == null ? com.google.ads.googleads.v11.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
      } else {
        return campaignExperimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public Builder setCampaignExperiment(com.google.ads.googleads.v11.resources.CampaignExperiment value) {
      if (campaignExperimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignExperiment_ = value;
        onChanged();
      } else {
        campaignExperimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public Builder setCampaignExperiment(
        com.google.ads.googleads.v11.resources.CampaignExperiment.Builder builderForValue) {
      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = builderForValue.build();
        onChanged();
      } else {
        campaignExperimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public Builder mergeCampaignExperiment(com.google.ads.googleads.v11.resources.CampaignExperiment value) {
      if (campaignExperimentBuilder_ == null) {
        if (campaignExperiment_ != null) {
          campaignExperiment_ =
            com.google.ads.googleads.v11.resources.CampaignExperiment.newBuilder(campaignExperiment_).mergeFrom(value).buildPartial();
        } else {
          campaignExperiment_ = value;
        }
        onChanged();
      } else {
        campaignExperimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public Builder clearCampaignExperiment() {
      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = null;
        onChanged();
      } else {
        campaignExperiment_ = null;
        campaignExperimentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public com.google.ads.googleads.v11.resources.CampaignExperiment.Builder getCampaignExperimentBuilder() {
      
      onChanged();
      return getCampaignExperimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    public com.google.ads.googleads.v11.resources.CampaignExperimentOrBuilder getCampaignExperimentOrBuilder() {
      if (campaignExperimentBuilder_ != null) {
        return campaignExperimentBuilder_.getMessageOrBuilder();
      } else {
        return campaignExperiment_ == null ?
            com.google.ads.googleads.v11.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
      }
    }
    /**
     * <pre>
     * The mutated campaign experiment with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.CampaignExperiment campaign_experiment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.CampaignExperiment, com.google.ads.googleads.v11.resources.CampaignExperiment.Builder, com.google.ads.googleads.v11.resources.CampaignExperimentOrBuilder> 
        getCampaignExperimentFieldBuilder() {
      if (campaignExperimentBuilder_ == null) {
        campaignExperimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.resources.CampaignExperiment, com.google.ads.googleads.v11.resources.CampaignExperiment.Builder, com.google.ads.googleads.v11.resources.CampaignExperimentOrBuilder>(
                getCampaignExperiment(),
                getParentForChildren(),
                isClean());
        campaignExperiment_ = null;
      }
      return campaignExperimentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.MutateCampaignExperimentResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.MutateCampaignExperimentResult)
  private static final com.google.ads.googleads.v11.services.MutateCampaignExperimentResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.MutateCampaignExperimentResult();
  }

  public static com.google.ads.googleads.v11.services.MutateCampaignExperimentResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignExperimentResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignExperimentResult>() {
    @java.lang.Override
    public MutateCampaignExperimentResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCampaignExperimentResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignExperimentResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignExperimentResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateCampaignExperimentResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

