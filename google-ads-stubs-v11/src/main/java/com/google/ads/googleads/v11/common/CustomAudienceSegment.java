// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/audiences.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Custom audience segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.CustomAudienceSegment}
 */
public final class CustomAudienceSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.CustomAudienceSegment)
    CustomAudienceSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomAudienceSegment.newBuilder() to construct.
  private CustomAudienceSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomAudienceSegment() {
    customAudience_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomAudienceSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomAudienceSegment(
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
            bitField0_ |= 0x00000001;
            customAudience_ = s;
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
    return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_CustomAudienceSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_CustomAudienceSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.CustomAudienceSegment.class, com.google.ads.googleads.v11.common.CustomAudienceSegment.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOM_AUDIENCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object customAudience_;
  /**
   * <pre>
   * The custom audience resource.
   * </pre>
   *
   * <code>optional string custom_audience = 1;</code>
   * @return Whether the customAudience field is set.
   */
  @java.lang.Override
  public boolean hasCustomAudience() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The custom audience resource.
   * </pre>
   *
   * <code>optional string custom_audience = 1;</code>
   * @return The customAudience.
   */
  @java.lang.Override
  public java.lang.String getCustomAudience() {
    java.lang.Object ref = customAudience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customAudience_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The custom audience resource.
   * </pre>
   *
   * <code>optional string custom_audience = 1;</code>
   * @return The bytes for customAudience.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomAudienceBytes() {
    java.lang.Object ref = customAudience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customAudience_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customAudience_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customAudience_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.CustomAudienceSegment)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.CustomAudienceSegment other = (com.google.ads.googleads.v11.common.CustomAudienceSegment) obj;

    if (hasCustomAudience() != other.hasCustomAudience()) return false;
    if (hasCustomAudience()) {
      if (!getCustomAudience()
          .equals(other.getCustomAudience())) return false;
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
    if (hasCustomAudience()) {
      hash = (37 * hash) + CUSTOM_AUDIENCE_FIELD_NUMBER;
      hash = (53 * hash) + getCustomAudience().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.CustomAudienceSegment parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.CustomAudienceSegment prototype) {
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
   * Custom audience segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.CustomAudienceSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.CustomAudienceSegment)
      com.google.ads.googleads.v11.common.CustomAudienceSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_CustomAudienceSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_CustomAudienceSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.CustomAudienceSegment.class, com.google.ads.googleads.v11.common.CustomAudienceSegment.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.CustomAudienceSegment.newBuilder()
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
      customAudience_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_CustomAudienceSegment_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.CustomAudienceSegment getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.CustomAudienceSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.CustomAudienceSegment build() {
      com.google.ads.googleads.v11.common.CustomAudienceSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.CustomAudienceSegment buildPartial() {
      com.google.ads.googleads.v11.common.CustomAudienceSegment result = new com.google.ads.googleads.v11.common.CustomAudienceSegment(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.customAudience_ = customAudience_;
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
      if (other instanceof com.google.ads.googleads.v11.common.CustomAudienceSegment) {
        return mergeFrom((com.google.ads.googleads.v11.common.CustomAudienceSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.CustomAudienceSegment other) {
      if (other == com.google.ads.googleads.v11.common.CustomAudienceSegment.getDefaultInstance()) return this;
      if (other.hasCustomAudience()) {
        bitField0_ |= 0x00000001;
        customAudience_ = other.customAudience_;
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
      com.google.ads.googleads.v11.common.CustomAudienceSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.CustomAudienceSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object customAudience_ = "";
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @return Whether the customAudience field is set.
     */
    public boolean hasCustomAudience() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @return The customAudience.
     */
    public java.lang.String getCustomAudience() {
      java.lang.Object ref = customAudience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customAudience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @return The bytes for customAudience.
     */
    public com.google.protobuf.ByteString
        getCustomAudienceBytes() {
      java.lang.Object ref = customAudience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customAudience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @param value The customAudience to set.
     * @return This builder for chaining.
     */
    public Builder setCustomAudience(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      customAudience_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomAudience() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customAudience_ = getDefaultInstance().getCustomAudience();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The custom audience resource.
     * </pre>
     *
     * <code>optional string custom_audience = 1;</code>
     * @param value The bytes for customAudience to set.
     * @return This builder for chaining.
     */
    public Builder setCustomAudienceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      customAudience_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.CustomAudienceSegment)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.CustomAudienceSegment)
  private static final com.google.ads.googleads.v11.common.CustomAudienceSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.CustomAudienceSegment();
  }

  public static com.google.ads.googleads.v11.common.CustomAudienceSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomAudienceSegment>
      PARSER = new com.google.protobuf.AbstractParser<CustomAudienceSegment>() {
    @java.lang.Override
    public CustomAudienceSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomAudienceSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomAudienceSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomAudienceSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.CustomAudienceSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

