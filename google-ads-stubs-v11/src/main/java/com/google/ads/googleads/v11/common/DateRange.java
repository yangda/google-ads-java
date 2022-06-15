// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/dates.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * A date range.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.DateRange}
 */
public final class DateRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.DateRange)
    DateRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateRange.newBuilder() to construct.
  private DateRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateRange() {
    startDate_ = "";
    endDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DateRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DateRange(
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
            startDate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            endDate_ = s;
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
    return com.google.ads.googleads.v11.common.DatesProto.internal_static_google_ads_googleads_v11_common_DateRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.DatesProto.internal_static_google_ads_googleads_v11_common_DateRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.DateRange.class, com.google.ads.googleads.v11.common.DateRange.Builder.class);
  }

  private int bitField0_;
  public static final int START_DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object startDate_;
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return Whether the startDate field is set.
   */
  @java.lang.Override
  public boolean hasStartDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 3;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_DATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object endDate_;
  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return Whether the endDate field is set.
   */
  @java.lang.Override
  public boolean hasEndDate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return The endDate.
   */
  @java.lang.Override
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The end date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   * @return The bytes for endDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startDate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, endDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startDate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, endDate_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.DateRange)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.DateRange other = (com.google.ads.googleads.v11.common.DateRange) obj;

    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate()
          .equals(other.getStartDate())) return false;
    }
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate()
          .equals(other.getEndDate())) return false;
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
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.DateRange parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.DateRange prototype) {
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
   * A date range.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.DateRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.DateRange)
      com.google.ads.googleads.v11.common.DateRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.DatesProto.internal_static_google_ads_googleads_v11_common_DateRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.DatesProto.internal_static_google_ads_googleads_v11_common_DateRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.DateRange.class, com.google.ads.googleads.v11.common.DateRange.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.DateRange.newBuilder()
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
      startDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      endDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.DatesProto.internal_static_google_ads_googleads_v11_common_DateRange_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.DateRange getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.DateRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.DateRange build() {
      com.google.ads.googleads.v11.common.DateRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.DateRange buildPartial() {
      com.google.ads.googleads.v11.common.DateRange result = new com.google.ads.googleads.v11.common.DateRange(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.startDate_ = startDate_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.endDate_ = endDate_;
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
      if (other instanceof com.google.ads.googleads.v11.common.DateRange) {
        return mergeFrom((com.google.ads.googleads.v11.common.DateRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.DateRange other) {
      if (other == com.google.ads.googleads.v11.common.DateRange.getDefaultInstance()) return this;
      if (other.hasStartDate()) {
        bitField0_ |= 0x00000001;
        startDate_ = other.startDate_;
        onChanged();
      }
      if (other.hasEndDate()) {
        bitField0_ |= 0x00000002;
        endDate_ = other.endDate_;
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
      com.google.ads.googleads.v11.common.DateRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.DateRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object startDate_ = "";
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @return Whether the startDate field is set.
     */
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDate_ = getDefaultInstance().getStartDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 3;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @return Whether the endDate field is set.
     */
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      endDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endDate_ = getDefaultInstance().getEndDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string end_date = 4;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      endDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.DateRange)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.DateRange)
  private static final com.google.ads.googleads.v11.common.DateRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.DateRange();
  }

  public static com.google.ads.googleads.v11.common.DateRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateRange>
      PARSER = new com.google.protobuf.AbstractParser<DateRange>() {
    @java.lang.Override
    public DateRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DateRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DateRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.DateRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

