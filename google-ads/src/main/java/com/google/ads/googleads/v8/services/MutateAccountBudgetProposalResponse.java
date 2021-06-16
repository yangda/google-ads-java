// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/account_budget_proposal_service.proto

package com.google.ads.googleads.v8.services;

/**
 * <pre>
 * Response message for account-level budget mutate operations.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse}
 */
public final class MutateAccountBudgetProposalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)
    MutateAccountBudgetProposalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAccountBudgetProposalResponse.newBuilder() to construct.
  private MutateAccountBudgetProposalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAccountBudgetProposalResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAccountBudgetProposalResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAccountBudgetProposalResponse(
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
          case 18: {
            com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v8.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v8_services_MutateAccountBudgetProposalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v8_services_MutateAccountBudgetProposalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.class, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result_;
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult getResult() {
    return result_ == null ? com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResultOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse other = (com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse prototype) {
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
   * Response message for account-level budget mutate operations.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)
      com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v8_services_MutateAccountBudgetProposalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v8_services_MutateAccountBudgetProposalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.class, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.newBuilder()
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
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v8_services_MutateAccountBudgetProposalResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse build() {
      com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse buildPartial() {
      com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse result = new com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse) {
        return mergeFrom((com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse other) {
      if (other == com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     * @return The result.
     */
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder setResult(com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder setResult(
        com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder mergeResult(com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse)
  private static final com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse();
  }

  public static com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAccountBudgetProposalResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateAccountBudgetProposalResponse>() {
    @java.lang.Override
    public MutateAccountBudgetProposalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAccountBudgetProposalResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAccountBudgetProposalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAccountBudgetProposalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.services.MutateAccountBudgetProposalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

