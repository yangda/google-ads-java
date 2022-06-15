// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/audiences.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Dimension specifying users by their age.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.AgeDimension}
 */
public final class AgeDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.AgeDimension)
    AgeDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeDimension.newBuilder() to construct.
  private AgeDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeDimension() {
    ageRanges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeDimension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AgeDimension(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ageRanges_ = new java.util.ArrayList<com.google.ads.googleads.v11.common.AgeSegment>();
              mutable_bitField0_ |= 0x00000001;
            }
            ageRanges_.add(
                input.readMessage(com.google.ads.googleads.v11.common.AgeSegment.parser(), extensionRegistry));
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            includeUndetermined_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ageRanges_ = java.util.Collections.unmodifiableList(ageRanges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_AgeDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_AgeDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.AgeDimension.class, com.google.ads.googleads.v11.common.AgeDimension.Builder.class);
  }

  private int bitField0_;
  public static final int AGE_RANGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v11.common.AgeSegment> ageRanges_;
  /**
   * <pre>
   * Contiguous age range to be included in the dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v11.common.AgeSegment> getAgeRangesList() {
    return ageRanges_;
  }
  /**
   * <pre>
   * Contiguous age range to be included in the dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v11.common.AgeSegmentOrBuilder> 
      getAgeRangesOrBuilderList() {
    return ageRanges_;
  }
  /**
   * <pre>
   * Contiguous age range to be included in the dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
   */
  @java.lang.Override
  public int getAgeRangesCount() {
    return ageRanges_.size();
  }
  /**
   * <pre>
   * Contiguous age range to be included in the dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.AgeSegment getAgeRanges(int index) {
    return ageRanges_.get(index);
  }
  /**
   * <pre>
   * Contiguous age range to be included in the dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.AgeSegmentOrBuilder getAgeRangesOrBuilder(
      int index) {
    return ageRanges_.get(index);
  }

  public static final int INCLUDE_UNDETERMINED_FIELD_NUMBER = 2;
  private boolean includeUndetermined_;
  /**
   * <pre>
   * Include users whose age is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return Whether the includeUndetermined field is set.
   */
  @java.lang.Override
  public boolean hasIncludeUndetermined() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Include users whose age is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return The includeUndetermined.
   */
  @java.lang.Override
  public boolean getIncludeUndetermined() {
    return includeUndetermined_;
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
    for (int i = 0; i < ageRanges_.size(); i++) {
      output.writeMessage(1, ageRanges_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(2, includeUndetermined_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ageRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ageRanges_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeUndetermined_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.AgeDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.AgeDimension other = (com.google.ads.googleads.v11.common.AgeDimension) obj;

    if (!getAgeRangesList()
        .equals(other.getAgeRangesList())) return false;
    if (hasIncludeUndetermined() != other.hasIncludeUndetermined()) return false;
    if (hasIncludeUndetermined()) {
      if (getIncludeUndetermined()
          != other.getIncludeUndetermined()) return false;
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
    if (getAgeRangesCount() > 0) {
      hash = (37 * hash) + AGE_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getAgeRangesList().hashCode();
    }
    if (hasIncludeUndetermined()) {
      hash = (37 * hash) + INCLUDE_UNDETERMINED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIncludeUndetermined());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.AgeDimension prototype) {
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
   * Dimension specifying users by their age.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.AgeDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.AgeDimension)
      com.google.ads.googleads.v11.common.AgeDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_AgeDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_AgeDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.AgeDimension.class, com.google.ads.googleads.v11.common.AgeDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.AgeDimension.newBuilder()
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
        getAgeRangesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ageRangesBuilder_ == null) {
        ageRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ageRangesBuilder_.clear();
      }
      includeUndetermined_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.AudiencesProto.internal_static_google_ads_googleads_v11_common_AgeDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.AgeDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeDimension build() {
      com.google.ads.googleads.v11.common.AgeDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeDimension buildPartial() {
      com.google.ads.googleads.v11.common.AgeDimension result = new com.google.ads.googleads.v11.common.AgeDimension(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (ageRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ageRanges_ = java.util.Collections.unmodifiableList(ageRanges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ageRanges_ = ageRanges_;
      } else {
        result.ageRanges_ = ageRangesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeUndetermined_ = includeUndetermined_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.ads.googleads.v11.common.AgeDimension) {
        return mergeFrom((com.google.ads.googleads.v11.common.AgeDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.AgeDimension other) {
      if (other == com.google.ads.googleads.v11.common.AgeDimension.getDefaultInstance()) return this;
      if (ageRangesBuilder_ == null) {
        if (!other.ageRanges_.isEmpty()) {
          if (ageRanges_.isEmpty()) {
            ageRanges_ = other.ageRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgeRangesIsMutable();
            ageRanges_.addAll(other.ageRanges_);
          }
          onChanged();
        }
      } else {
        if (!other.ageRanges_.isEmpty()) {
          if (ageRangesBuilder_.isEmpty()) {
            ageRangesBuilder_.dispose();
            ageRangesBuilder_ = null;
            ageRanges_ = other.ageRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ageRangesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgeRangesFieldBuilder() : null;
          } else {
            ageRangesBuilder_.addAllMessages(other.ageRanges_);
          }
        }
      }
      if (other.hasIncludeUndetermined()) {
        setIncludeUndetermined(other.getIncludeUndetermined());
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
      com.google.ads.googleads.v11.common.AgeDimension parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.AgeDimension) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v11.common.AgeSegment> ageRanges_ =
      java.util.Collections.emptyList();
    private void ensureAgeRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ageRanges_ = new java.util.ArrayList<com.google.ads.googleads.v11.common.AgeSegment>(ageRanges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.common.AgeSegment, com.google.ads.googleads.v11.common.AgeSegment.Builder, com.google.ads.googleads.v11.common.AgeSegmentOrBuilder> ageRangesBuilder_;

    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.common.AgeSegment> getAgeRangesList() {
      if (ageRangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ageRanges_);
      } else {
        return ageRangesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public int getAgeRangesCount() {
      if (ageRangesBuilder_ == null) {
        return ageRanges_.size();
      } else {
        return ageRangesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public com.google.ads.googleads.v11.common.AgeSegment getAgeRanges(int index) {
      if (ageRangesBuilder_ == null) {
        return ageRanges_.get(index);
      } else {
        return ageRangesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder setAgeRanges(
        int index, com.google.ads.googleads.v11.common.AgeSegment value) {
      if (ageRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeRangesIsMutable();
        ageRanges_.set(index, value);
        onChanged();
      } else {
        ageRangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder setAgeRanges(
        int index, com.google.ads.googleads.v11.common.AgeSegment.Builder builderForValue) {
      if (ageRangesBuilder_ == null) {
        ensureAgeRangesIsMutable();
        ageRanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        ageRangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder addAgeRanges(com.google.ads.googleads.v11.common.AgeSegment value) {
      if (ageRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeRangesIsMutable();
        ageRanges_.add(value);
        onChanged();
      } else {
        ageRangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder addAgeRanges(
        int index, com.google.ads.googleads.v11.common.AgeSegment value) {
      if (ageRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeRangesIsMutable();
        ageRanges_.add(index, value);
        onChanged();
      } else {
        ageRangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder addAgeRanges(
        com.google.ads.googleads.v11.common.AgeSegment.Builder builderForValue) {
      if (ageRangesBuilder_ == null) {
        ensureAgeRangesIsMutable();
        ageRanges_.add(builderForValue.build());
        onChanged();
      } else {
        ageRangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder addAgeRanges(
        int index, com.google.ads.googleads.v11.common.AgeSegment.Builder builderForValue) {
      if (ageRangesBuilder_ == null) {
        ensureAgeRangesIsMutable();
        ageRanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        ageRangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder addAllAgeRanges(
        java.lang.Iterable<? extends com.google.ads.googleads.v11.common.AgeSegment> values) {
      if (ageRangesBuilder_ == null) {
        ensureAgeRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ageRanges_);
        onChanged();
      } else {
        ageRangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder clearAgeRanges() {
      if (ageRangesBuilder_ == null) {
        ageRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ageRangesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public Builder removeAgeRanges(int index) {
      if (ageRangesBuilder_ == null) {
        ensureAgeRangesIsMutable();
        ageRanges_.remove(index);
        onChanged();
      } else {
        ageRangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public com.google.ads.googleads.v11.common.AgeSegment.Builder getAgeRangesBuilder(
        int index) {
      return getAgeRangesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public com.google.ads.googleads.v11.common.AgeSegmentOrBuilder getAgeRangesOrBuilder(
        int index) {
      if (ageRangesBuilder_ == null) {
        return ageRanges_.get(index);  } else {
        return ageRangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v11.common.AgeSegmentOrBuilder> 
         getAgeRangesOrBuilderList() {
      if (ageRangesBuilder_ != null) {
        return ageRangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ageRanges_);
      }
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public com.google.ads.googleads.v11.common.AgeSegment.Builder addAgeRangesBuilder() {
      return getAgeRangesFieldBuilder().addBuilder(
          com.google.ads.googleads.v11.common.AgeSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public com.google.ads.googleads.v11.common.AgeSegment.Builder addAgeRangesBuilder(
        int index) {
      return getAgeRangesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v11.common.AgeSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Contiguous age range to be included in the dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.common.AgeSegment age_ranges = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.common.AgeSegment.Builder> 
         getAgeRangesBuilderList() {
      return getAgeRangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.common.AgeSegment, com.google.ads.googleads.v11.common.AgeSegment.Builder, com.google.ads.googleads.v11.common.AgeSegmentOrBuilder> 
        getAgeRangesFieldBuilder() {
      if (ageRangesBuilder_ == null) {
        ageRangesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v11.common.AgeSegment, com.google.ads.googleads.v11.common.AgeSegment.Builder, com.google.ads.googleads.v11.common.AgeSegmentOrBuilder>(
                ageRanges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ageRanges_ = null;
      }
      return ageRangesBuilder_;
    }

    private boolean includeUndetermined_ ;
    /**
     * <pre>
     * Include users whose age is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return Whether the includeUndetermined field is set.
     */
    @java.lang.Override
    public boolean hasIncludeUndetermined() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Include users whose age is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return The includeUndetermined.
     */
    @java.lang.Override
    public boolean getIncludeUndetermined() {
      return includeUndetermined_;
    }
    /**
     * <pre>
     * Include users whose age is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @param value The includeUndetermined to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeUndetermined(boolean value) {
      bitField0_ |= 0x00000002;
      includeUndetermined_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Include users whose age is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeUndetermined() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeUndetermined_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.AgeDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.AgeDimension)
  private static final com.google.ads.googleads.v11.common.AgeDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.AgeDimension();
  }

  public static com.google.ads.googleads.v11.common.AgeDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeDimension>
      PARSER = new com.google.protobuf.AbstractParser<AgeDimension>() {
    @java.lang.Override
    public AgeDimension parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AgeDimension(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AgeDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.AgeDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

