// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * Request message for
 * [OfflineUserDataJobService.CreateOfflineUserDataJob][google.ads.googleads.v11.services.OfflineUserDataJobService.CreateOfflineUserDataJob].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest}
 */
public final class CreateOfflineUserDataJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)
    CreateOfflineUserDataJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOfflineUserDataJobRequest.newBuilder() to construct.
  private CreateOfflineUserDataJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOfflineUserDataJobRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOfflineUserDataJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateOfflineUserDataJobRequest(
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

            customerId_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder subBuilder = null;
            if (job_ != null) {
              subBuilder = job_.toBuilder();
            }
            job_ = input.readMessage(com.google.ads.googleads.v11.resources.OfflineUserDataJob.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(job_);
              job_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            validateOnly_ = input.readBool();
            break;
          }
          case 40: {

            enableMatchRateRangePreview_ = input.readBool();
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
    return com.google.ads.googleads.v11.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v11_services_CreateOfflineUserDataJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v11_services_CreateOfflineUserDataJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.class, com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.resources.OfflineUserDataJob job_;
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.OfflineUserDataJob getJob() {
    return job_ == null ? com.google.ads.googleads.v11.resources.OfflineUserDataJob.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.OfflineUserDataJobOrBuilder getJobOrBuilder() {
    return getJob();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  public static final int ENABLE_MATCH_RATE_RANGE_PREVIEW_FIELD_NUMBER = 5;
  private boolean enableMatchRateRangePreview_;
  /**
   * <pre>
   * If true, match rate range for the offline user data job is calculated and
   * made available in the resource.
   * </pre>
   *
   * <code>bool enable_match_rate_range_preview = 5;</code>
   * @return The enableMatchRateRangePreview.
   */
  @java.lang.Override
  public boolean getEnableMatchRateRangePreview() {
    return enableMatchRateRangePreview_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (job_ != null) {
      output.writeMessage(2, getJob());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    if (enableMatchRateRangePreview_ != false) {
      output.writeBool(5, enableMatchRateRangePreview_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJob());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
    }
    if (enableMatchRateRangePreview_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, enableMatchRateRangePreview_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest other = (com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob()
          .equals(other.getJob())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (getEnableMatchRateRangePreview()
        != other.getEnableMatchRateRangePreview()) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (37 * hash) + ENABLE_MATCH_RATE_RANGE_PREVIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableMatchRateRangePreview());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest prototype) {
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
   * Request message for
   * [OfflineUserDataJobService.CreateOfflineUserDataJob][google.ads.googleads.v11.services.OfflineUserDataJobService.CreateOfflineUserDataJob].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)
      com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v11_services_CreateOfflineUserDataJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v11_services_CreateOfflineUserDataJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.class, com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.newBuilder()
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
      customerId_ = "";

      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      validateOnly_ = false;

      enableMatchRateRangePreview_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v11_services_CreateOfflineUserDataJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest build() {
      com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest buildPartial() {
      com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest result = new com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest(this);
      result.customerId_ = customerId_;
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
      result.enableMatchRateRangePreview_ = enableMatchRateRangePreview_;
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
      if (other instanceof com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest) {
        return mergeFrom((com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest other) {
      if (other == com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      if (other.getEnableMatchRateRangePreview() != false) {
        setEnableMatchRateRangePreview(other.getEnableMatchRateRangePreview());
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
      com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer for which to create an offline user data job.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer for which to create an offline user data job.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer for which to create an offline user data job.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer for which to create an offline user data job.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer for which to create an offline user data job.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.resources.OfflineUserDataJob job_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.OfflineUserDataJob, com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder, com.google.ads.googleads.v11.resources.OfflineUserDataJobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The job.
     */
    public com.google.ads.googleads.v11.resources.OfflineUserDataJob getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.ads.googleads.v11.resources.OfflineUserDataJob.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(com.google.ads.googleads.v11.resources.OfflineUserDataJob value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(
        com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeJob(com.google.ads.googleads.v11.resources.OfflineUserDataJob value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
            com.google.ads.googleads.v11.resources.OfflineUserDataJob.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder getJobBuilder() {
      
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.resources.OfflineUserDataJobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.ads.googleads.v11.resources.OfflineUserDataJob.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * Required. The offline user data job to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.OfflineUserDataJob, com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder, com.google.ads.googleads.v11.resources.OfflineUserDataJobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.resources.OfflineUserDataJob, com.google.ads.googleads.v11.resources.OfflineUserDataJob.Builder, com.google.ads.googleads.v11.resources.OfflineUserDataJobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
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
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
      onChanged();
      return this;
    }

    private boolean enableMatchRateRangePreview_ ;
    /**
     * <pre>
     * If true, match rate range for the offline user data job is calculated and
     * made available in the resource.
     * </pre>
     *
     * <code>bool enable_match_rate_range_preview = 5;</code>
     * @return The enableMatchRateRangePreview.
     */
    @java.lang.Override
    public boolean getEnableMatchRateRangePreview() {
      return enableMatchRateRangePreview_;
    }
    /**
     * <pre>
     * If true, match rate range for the offline user data job is calculated and
     * made available in the resource.
     * </pre>
     *
     * <code>bool enable_match_rate_range_preview = 5;</code>
     * @param value The enableMatchRateRangePreview to set.
     * @return This builder for chaining.
     */
    public Builder setEnableMatchRateRangePreview(boolean value) {
      
      enableMatchRateRangePreview_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, match rate range for the offline user data job is calculated and
     * made available in the resource.
     * </pre>
     *
     * <code>bool enable_match_rate_range_preview = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableMatchRateRangePreview() {
      
      enableMatchRateRangePreview_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest)
  private static final com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest();
  }

  public static com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOfflineUserDataJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOfflineUserDataJobRequest>() {
    @java.lang.Override
    public CreateOfflineUserDataJobRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateOfflineUserDataJobRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateOfflineUserDataJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOfflineUserDataJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.CreateOfflineUserDataJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

