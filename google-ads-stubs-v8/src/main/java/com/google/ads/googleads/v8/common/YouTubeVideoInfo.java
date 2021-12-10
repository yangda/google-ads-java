// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/criteria.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * A YouTube Video criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.YouTubeVideoInfo}
 */
public final class YouTubeVideoInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.YouTubeVideoInfo)
    YouTubeVideoInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YouTubeVideoInfo.newBuilder() to construct.
  private YouTubeVideoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YouTubeVideoInfo() {
    videoId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YouTubeVideoInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private YouTubeVideoInfo(
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
            videoId_ = s;
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
    return com.google.ads.googleads.v8.common.CriteriaProto.internal_static_google_ads_googleads_v8_common_YouTubeVideoInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.CriteriaProto.internal_static_google_ads_googleads_v8_common_YouTubeVideoInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.YouTubeVideoInfo.class, com.google.ads.googleads.v8.common.YouTubeVideoInfo.Builder.class);
  }

  private int bitField0_;
  public static final int VIDEO_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object videoId_;
  /**
   * <pre>
   * YouTube video id as it appears on the YouTube watch page.
   * </pre>
   *
   * <code>optional string video_id = 2;</code>
   * @return Whether the videoId field is set.
   */
  @java.lang.Override
  public boolean hasVideoId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * YouTube video id as it appears on the YouTube watch page.
   * </pre>
   *
   * <code>optional string video_id = 2;</code>
   * @return The videoId.
   */
  @java.lang.Override
  public java.lang.String getVideoId() {
    java.lang.Object ref = videoId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      videoId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * YouTube video id as it appears on the YouTube watch page.
   * </pre>
   *
   * <code>optional string video_id = 2;</code>
   * @return The bytes for videoId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVideoIdBytes() {
    java.lang.Object ref = videoId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      videoId_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, videoId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, videoId_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.common.YouTubeVideoInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.YouTubeVideoInfo other = (com.google.ads.googleads.v8.common.YouTubeVideoInfo) obj;

    if (hasVideoId() != other.hasVideoId()) return false;
    if (hasVideoId()) {
      if (!getVideoId()
          .equals(other.getVideoId())) return false;
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
    if (hasVideoId()) {
      hash = (37 * hash) + VIDEO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVideoId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.common.YouTubeVideoInfo prototype) {
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
   * A YouTube Video criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.YouTubeVideoInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.YouTubeVideoInfo)
      com.google.ads.googleads.v8.common.YouTubeVideoInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.CriteriaProto.internal_static_google_ads_googleads_v8_common_YouTubeVideoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.CriteriaProto.internal_static_google_ads_googleads_v8_common_YouTubeVideoInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.YouTubeVideoInfo.class, com.google.ads.googleads.v8.common.YouTubeVideoInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.YouTubeVideoInfo.newBuilder()
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
      videoId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.CriteriaProto.internal_static_google_ads_googleads_v8_common_YouTubeVideoInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.YouTubeVideoInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.YouTubeVideoInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.YouTubeVideoInfo build() {
      com.google.ads.googleads.v8.common.YouTubeVideoInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.YouTubeVideoInfo buildPartial() {
      com.google.ads.googleads.v8.common.YouTubeVideoInfo result = new com.google.ads.googleads.v8.common.YouTubeVideoInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.videoId_ = videoId_;
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
      if (other instanceof com.google.ads.googleads.v8.common.YouTubeVideoInfo) {
        return mergeFrom((com.google.ads.googleads.v8.common.YouTubeVideoInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.YouTubeVideoInfo other) {
      if (other == com.google.ads.googleads.v8.common.YouTubeVideoInfo.getDefaultInstance()) return this;
      if (other.hasVideoId()) {
        bitField0_ |= 0x00000001;
        videoId_ = other.videoId_;
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
      com.google.ads.googleads.v8.common.YouTubeVideoInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.YouTubeVideoInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object videoId_ = "";
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @return Whether the videoId field is set.
     */
    public boolean hasVideoId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @return The videoId.
     */
    public java.lang.String getVideoId() {
      java.lang.Object ref = videoId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        videoId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @return The bytes for videoId.
     */
    public com.google.protobuf.ByteString
        getVideoIdBytes() {
      java.lang.Object ref = videoId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        videoId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @param value The videoId to set.
     * @return This builder for chaining.
     */
    public Builder setVideoId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      videoId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVideoId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      videoId_ = getDefaultInstance().getVideoId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YouTube video id as it appears on the YouTube watch page.
     * </pre>
     *
     * <code>optional string video_id = 2;</code>
     * @param value The bytes for videoId to set.
     * @return This builder for chaining.
     */
    public Builder setVideoIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      videoId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.YouTubeVideoInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.YouTubeVideoInfo)
  private static final com.google.ads.googleads.v8.common.YouTubeVideoInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.YouTubeVideoInfo();
  }

  public static com.google.ads.googleads.v8.common.YouTubeVideoInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YouTubeVideoInfo>
      PARSER = new com.google.protobuf.AbstractParser<YouTubeVideoInfo>() {
    @java.lang.Override
    public YouTubeVideoInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new YouTubeVideoInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<YouTubeVideoInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YouTubeVideoInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.YouTubeVideoInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

