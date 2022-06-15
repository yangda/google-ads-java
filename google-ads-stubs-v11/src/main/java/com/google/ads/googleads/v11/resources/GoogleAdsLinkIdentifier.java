// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/account_link.proto

package com.google.ads.googleads.v11.resources;

/**
 * <pre>
 * The identifier for Google Ads account.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier}
 */
public final class GoogleAdsLinkIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)
    GoogleAdsLinkIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleAdsLinkIdentifier.newBuilder() to construct.
  private GoogleAdsLinkIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleAdsLinkIdentifier() {
    customer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GoogleAdsLinkIdentifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoogleAdsLinkIdentifier(
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            customer_ = s;
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
    return com.google.ads.googleads.v11.resources.AccountLinkProto.internal_static_google_ads_googleads_v11_resources_GoogleAdsLinkIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.resources.AccountLinkProto.internal_static_google_ads_googleads_v11_resources_GoogleAdsLinkIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.class, com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_FIELD_NUMBER = 3;
  private volatile java.lang.Object customer_;
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the customer field is set.
   */
  @java.lang.Override
  public boolean hasCustomer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The customer.
   */
  @java.lang.Override
  public java.lang.String getCustomer() {
    java.lang.Object ref = customer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerBytes() {
    java.lang.Object ref = customer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customer_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier other = (com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier) obj;

    if (hasCustomer() != other.hasCustomer()) return false;
    if (hasCustomer()) {
      if (!getCustomer()
          .equals(other.getCustomer())) return false;
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
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier prototype) {
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
   * The identifier for Google Ads account.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)
      com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.resources.AccountLinkProto.internal_static_google_ads_googleads_v11_resources_GoogleAdsLinkIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.resources.AccountLinkProto.internal_static_google_ads_googleads_v11_resources_GoogleAdsLinkIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.class, com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.newBuilder()
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
      customer_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.resources.AccountLinkProto.internal_static_google_ads_googleads_v11_resources_GoogleAdsLinkIdentifier_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier build() {
      com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier buildPartial() {
      com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier result = new com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.customer_ = customer_;
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
      if (other instanceof com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier) {
        return mergeFrom((com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier other) {
      if (other == com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier.getDefaultInstance()) return this;
      if (other.hasCustomer()) {
        bitField0_ |= 0x00000001;
        customer_ = other.customer_;
        onChanged();
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
      com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object customer_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The customer.
     */
    public java.lang.String getCustomer() {
      java.lang.Object ref = customer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for customer.
     */
    public com.google.protobuf.ByteString
        getCustomerBytes() {
      java.lang.Object ref = customer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The customer to set.
     * @return This builder for chaining.
     */
    public Builder setCustomer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      customer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customer_ = getDefaultInstance().getCustomer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the Google Ads account.
     * This field is required and should not be empty when creating a new
     * Google Ads link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string customer = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for customer to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      customer_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier)
  private static final com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier();
  }

  public static com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleAdsLinkIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<GoogleAdsLinkIdentifier>() {
    @java.lang.Override
    public GoogleAdsLinkIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoogleAdsLinkIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoogleAdsLinkIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleAdsLinkIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

