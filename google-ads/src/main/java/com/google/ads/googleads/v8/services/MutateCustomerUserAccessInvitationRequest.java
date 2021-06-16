// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/customer_user_access_invitation_service.proto

package com.google.ads.googleads.v8.services;

/**
 * <pre>
 * Request message for
 * [CustomerUserAccessInvitation.MutateCustomerUserAccessInvitation][]
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest}
 */
public final class MutateCustomerUserAccessInvitationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)
    MutateCustomerUserAccessInvitationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomerUserAccessInvitationRequest.newBuilder() to construct.
  private MutateCustomerUserAccessInvitationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomerUserAccessInvitationRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCustomerUserAccessInvitationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCustomerUserAccessInvitationRequest(
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
            com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder subBuilder = null;
            if (operation_ != null) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v8.services.CustomerUserAccessInvitationServiceProto.internal_static_google_ads_googleads_v8_services_MutateCustomerUserAccessInvitationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.services.CustomerUserAccessInvitationServiceProto.internal_static_google_ads_googleads_v8_services_MutateCustomerUserAccessInvitationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.class, com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer whose access invitation is being modified.
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
   * Required. The ID of the customer whose access invitation is being modified.
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

  public static final int OPERATION_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation_;
  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  @java.lang.Override
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation getOperation() {
    return operation_ == null ? com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperationOrBuilder getOperationOrBuilder() {
    return getOperation();
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
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (operation_ != null) {
      output.writeMessage(2, getOperation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperation());
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
    if (!(obj instanceof com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest other = (com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasOperation() != other.hasOperation()) return false;
    if (hasOperation()) {
      if (!getOperation()
          .equals(other.getOperation())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest prototype) {
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
   * [CustomerUserAccessInvitation.MutateCustomerUserAccessInvitation][]
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)
      com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.services.CustomerUserAccessInvitationServiceProto.internal_static_google_ads_googleads_v8_services_MutateCustomerUserAccessInvitationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.services.CustomerUserAccessInvitationServiceProto.internal_static_google_ads_googleads_v8_services_MutateCustomerUserAccessInvitationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.class, com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.newBuilder()
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

      if (operationBuilder_ == null) {
        operation_ = null;
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.services.CustomerUserAccessInvitationServiceProto.internal_static_google_ads_googleads_v8_services_MutateCustomerUserAccessInvitationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest build() {
      com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest buildPartial() {
      com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest result = new com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest(this);
      result.customerId_ = customerId_;
      if (operationBuilder_ == null) {
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest) {
        return mergeFrom((com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest other) {
      if (other == com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
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
      com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest) e.getUnfinishedMessage();
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
     * Required. The ID of the customer whose access invitation is being modified.
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
     * Required. The ID of the customer whose access invitation is being modified.
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
     * Required. The ID of the customer whose access invitation is being modified.
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
     * Required. The ID of the customer whose access invitation is being modified.
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
     * Required. The ID of the customer whose access invitation is being modified.
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

    private com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the operation field is set.
     */
    public boolean hasOperation() {
      return operationBuilder_ != null || operation_ != null;
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The operation.
     */
    public com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperation(com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        operationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperation(
        com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeOperation(com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation value) {
      if (operationBuilder_ == null) {
        if (operation_ != null) {
          operation_ =
            com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.newBuilder(operation_).mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        operationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = null;
        onChanged();
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder getOperationBuilder() {
      
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * Required. The operation to perform on the access invitation
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperation.Builder, com.google.ads.googleads.v8.services.CustomerUserAccessInvitationOperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest)
  private static final com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest();
  }

  public static com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomerUserAccessInvitationRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomerUserAccessInvitationRequest>() {
    @java.lang.Override
    public MutateCustomerUserAccessInvitationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCustomerUserAccessInvitationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCustomerUserAccessInvitationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomerUserAccessInvitationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.services.MutateCustomerUserAccessInvitationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

