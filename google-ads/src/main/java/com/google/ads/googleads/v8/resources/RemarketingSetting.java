// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/customer.proto

package com.google.ads.googleads.v8.resources;

/**
 * <pre>
 * Remarketing setting for a customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.resources.RemarketingSetting}
 */
public final class RemarketingSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.resources.RemarketingSetting)
    RemarketingSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemarketingSetting.newBuilder() to construct.
  private RemarketingSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemarketingSetting() {
    googleGlobalSiteTag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemarketingSetting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemarketingSetting(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            googleGlobalSiteTag_ = s;
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
    return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_RemarketingSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_RemarketingSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.resources.RemarketingSetting.class, com.google.ads.googleads.v8.resources.RemarketingSetting.Builder.class);
  }

  private int bitField0_;
  public static final int GOOGLE_GLOBAL_SITE_TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object googleGlobalSiteTag_;
  /**
   * <pre>
   * Output only. The Google global site tag.
   * </pre>
   *
   * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the googleGlobalSiteTag field is set.
   */
  @java.lang.Override
  public boolean hasGoogleGlobalSiteTag() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The Google global site tag.
   * </pre>
   *
   * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The googleGlobalSiteTag.
   */
  @java.lang.Override
  public java.lang.String getGoogleGlobalSiteTag() {
    java.lang.Object ref = googleGlobalSiteTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      googleGlobalSiteTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The Google global site tag.
   * </pre>
   *
   * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for googleGlobalSiteTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGoogleGlobalSiteTagBytes() {
    java.lang.Object ref = googleGlobalSiteTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      googleGlobalSiteTag_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, googleGlobalSiteTag_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, googleGlobalSiteTag_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.resources.RemarketingSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.resources.RemarketingSetting other = (com.google.ads.googleads.v8.resources.RemarketingSetting) obj;

    if (hasGoogleGlobalSiteTag() != other.hasGoogleGlobalSiteTag()) return false;
    if (hasGoogleGlobalSiteTag()) {
      if (!getGoogleGlobalSiteTag()
          .equals(other.getGoogleGlobalSiteTag())) return false;
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
    if (hasGoogleGlobalSiteTag()) {
      hash = (37 * hash) + GOOGLE_GLOBAL_SITE_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleGlobalSiteTag().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.RemarketingSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.resources.RemarketingSetting prototype) {
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
   * Remarketing setting for a customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.resources.RemarketingSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.resources.RemarketingSetting)
      com.google.ads.googleads.v8.resources.RemarketingSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_RemarketingSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_RemarketingSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.resources.RemarketingSetting.class, com.google.ads.googleads.v8.resources.RemarketingSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.resources.RemarketingSetting.newBuilder()
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
      googleGlobalSiteTag_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_RemarketingSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.RemarketingSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.resources.RemarketingSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.RemarketingSetting build() {
      com.google.ads.googleads.v8.resources.RemarketingSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.RemarketingSetting buildPartial() {
      com.google.ads.googleads.v8.resources.RemarketingSetting result = new com.google.ads.googleads.v8.resources.RemarketingSetting(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.googleGlobalSiteTag_ = googleGlobalSiteTag_;
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
      if (other instanceof com.google.ads.googleads.v8.resources.RemarketingSetting) {
        return mergeFrom((com.google.ads.googleads.v8.resources.RemarketingSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.resources.RemarketingSetting other) {
      if (other == com.google.ads.googleads.v8.resources.RemarketingSetting.getDefaultInstance()) return this;
      if (other.hasGoogleGlobalSiteTag()) {
        bitField0_ |= 0x00000001;
        googleGlobalSiteTag_ = other.googleGlobalSiteTag_;
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
      com.google.ads.googleads.v8.resources.RemarketingSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.resources.RemarketingSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object googleGlobalSiteTag_ = "";
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the googleGlobalSiteTag field is set.
     */
    public boolean hasGoogleGlobalSiteTag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The googleGlobalSiteTag.
     */
    public java.lang.String getGoogleGlobalSiteTag() {
      java.lang.Object ref = googleGlobalSiteTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        googleGlobalSiteTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for googleGlobalSiteTag.
     */
    public com.google.protobuf.ByteString
        getGoogleGlobalSiteTagBytes() {
      java.lang.Object ref = googleGlobalSiteTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        googleGlobalSiteTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The googleGlobalSiteTag to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleGlobalSiteTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      googleGlobalSiteTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearGoogleGlobalSiteTag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      googleGlobalSiteTag_ = getDefaultInstance().getGoogleGlobalSiteTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Google global site tag.
     * </pre>
     *
     * <code>string google_global_site_tag = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for googleGlobalSiteTag to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleGlobalSiteTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      googleGlobalSiteTag_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.resources.RemarketingSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.RemarketingSetting)
  private static final com.google.ads.googleads.v8.resources.RemarketingSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.resources.RemarketingSetting();
  }

  public static com.google.ads.googleads.v8.resources.RemarketingSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemarketingSetting>
      PARSER = new com.google.protobuf.AbstractParser<RemarketingSetting>() {
    @java.lang.Override
    public RemarketingSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemarketingSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemarketingSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemarketingSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.resources.RemarketingSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

