// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/merchant_center_link.proto

package com.google.ads.googleads.v8.resources;

/**
 * <pre>
 * A data sharing connection, proposed or in use,
 * between a Google Ads Customer and a Merchant Center account.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.resources.MerchantCenterLink}
 */
public final class MerchantCenterLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.resources.MerchantCenterLink)
    MerchantCenterLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MerchantCenterLink.newBuilder() to construct.
  private MerchantCenterLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MerchantCenterLink() {
    resourceName_ = "";
    merchantCenterAccountName_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MerchantCenterLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MerchantCenterLink(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 40: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 48: {
            bitField0_ |= 0x00000001;
            id_ = input.readInt64();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            merchantCenterAccountName_ = s;
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
    return com.google.ads.googleads.v8.resources.MerchantCenterLinkProto.internal_static_google_ads_googleads_v8_resources_MerchantCenterLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.resources.MerchantCenterLinkProto.internal_static_google_ads_googleads_v8_resources_MerchantCenterLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.resources.MerchantCenterLink.class, com.google.ads.googleads.v8.resources.MerchantCenterLink.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
   * Immutable. The resource name of the merchant center link.
   * Merchant center link resource names have the form:
   * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

  public static final int ID_FIELD_NUMBER = 6;
  private long id_;
  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The ID of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int MERCHANT_CENTER_ACCOUNT_NAME_FIELD_NUMBER = 7;
  private volatile java.lang.Object merchantCenterAccountName_;
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the merchantCenterAccountName field is set.
   */
  @java.lang.Override
  public boolean hasMerchantCenterAccountName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The merchantCenterAccountName.
   */
  @java.lang.Override
  public java.lang.String getMerchantCenterAccountName() {
    java.lang.Object ref = merchantCenterAccountName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      merchantCenterAccountName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The name of the Merchant Center account.
   * This field is readonly.
   * </pre>
   *
   * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for merchantCenterAccountName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMerchantCenterAccountNameBytes() {
    java.lang.Object ref = merchantCenterAccountName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      merchantCenterAccountName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * The status of the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus result = com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.UNRECOGNIZED : result;
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (status_ != com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(6, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, merchantCenterAccountName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (status_ != com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, merchantCenterAccountName_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.resources.MerchantCenterLink)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.resources.MerchantCenterLink other = (com.google.ads.googleads.v8.resources.MerchantCenterLink) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasMerchantCenterAccountName() != other.hasMerchantCenterAccountName()) return false;
    if (hasMerchantCenterAccountName()) {
      if (!getMerchantCenterAccountName()
          .equals(other.getMerchantCenterAccountName())) return false;
    }
    if (status_ != other.status_) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasMerchantCenterAccountName()) {
      hash = (37 * hash) + MERCHANT_CENTER_ACCOUNT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMerchantCenterAccountName().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.MerchantCenterLink parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.resources.MerchantCenterLink prototype) {
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
   * A data sharing connection, proposed or in use,
   * between a Google Ads Customer and a Merchant Center account.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.resources.MerchantCenterLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.resources.MerchantCenterLink)
      com.google.ads.googleads.v8.resources.MerchantCenterLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.resources.MerchantCenterLinkProto.internal_static_google_ads_googleads_v8_resources_MerchantCenterLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.resources.MerchantCenterLinkProto.internal_static_google_ads_googleads_v8_resources_MerchantCenterLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.resources.MerchantCenterLink.class, com.google.ads.googleads.v8.resources.MerchantCenterLink.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.resources.MerchantCenterLink.newBuilder()
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

      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      merchantCenterAccountName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.resources.MerchantCenterLinkProto.internal_static_google_ads_googleads_v8_resources_MerchantCenterLink_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.MerchantCenterLink getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.resources.MerchantCenterLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.MerchantCenterLink build() {
      com.google.ads.googleads.v8.resources.MerchantCenterLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.MerchantCenterLink buildPartial() {
      com.google.ads.googleads.v8.resources.MerchantCenterLink result = new com.google.ads.googleads.v8.resources.MerchantCenterLink(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.merchantCenterAccountName_ = merchantCenterAccountName_;
      result.status_ = status_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v8.resources.MerchantCenterLink) {
        return mergeFrom((com.google.ads.googleads.v8.resources.MerchantCenterLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.resources.MerchantCenterLink other) {
      if (other == com.google.ads.googleads.v8.resources.MerchantCenterLink.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasMerchantCenterAccountName()) {
        bitField0_ |= 0x00000002;
        merchantCenterAccountName_ = other.merchantCenterAccountName_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.google.ads.googleads.v8.resources.MerchantCenterLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.resources.MerchantCenterLink) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the merchant center link.
     * Merchant center link resource names have the form:
     * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the merchant center link.
     * Merchant center link resource names have the form:
     * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the merchant center link.
     * Merchant center link resource names have the form:
     * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the merchant center link.
     * Merchant center link resource names have the form:
     * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the merchant center link.
     * Merchant center link resource names have the form:
     * `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private long id_ ;
    /**
     * <pre>
     * Output only. The ID of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The ID of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Output only. The ID of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object merchantCenterAccountName_ = "";
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the merchantCenterAccountName field is set.
     */
    public boolean hasMerchantCenterAccountName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The merchantCenterAccountName.
     */
    public java.lang.String getMerchantCenterAccountName() {
      java.lang.Object ref = merchantCenterAccountName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        merchantCenterAccountName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for merchantCenterAccountName.
     */
    public com.google.protobuf.ByteString
        getMerchantCenterAccountNameBytes() {
      java.lang.Object ref = merchantCenterAccountName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        merchantCenterAccountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The merchantCenterAccountName to set.
     * @return This builder for chaining.
     */
    public Builder setMerchantCenterAccountName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      merchantCenterAccountName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearMerchantCenterAccountName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      merchantCenterAccountName_ = getDefaultInstance().getMerchantCenterAccountName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The name of the Merchant Center account.
     * This field is readonly.
     * </pre>
     *
     * <code>string merchant_center_account_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for merchantCenterAccountName to set.
     * @return This builder for chaining.
     */
    public Builder setMerchantCenterAccountNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      merchantCenterAccountName_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * The status of the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * The status of the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus result = com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The status of the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus status = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.resources.MerchantCenterLink)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.MerchantCenterLink)
  private static final com.google.ads.googleads.v8.resources.MerchantCenterLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.resources.MerchantCenterLink();
  }

  public static com.google.ads.googleads.v8.resources.MerchantCenterLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MerchantCenterLink>
      PARSER = new com.google.protobuf.AbstractParser<MerchantCenterLink>() {
    @java.lang.Override
    public MerchantCenterLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MerchantCenterLink(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MerchantCenterLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MerchantCenterLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.resources.MerchantCenterLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

