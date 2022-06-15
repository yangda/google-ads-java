// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/user_lists.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * A rule item composed of a date operation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.UserListDateRuleItemInfo}
 */
public final class UserListDateRuleItemInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.UserListDateRuleItemInfo)
    UserListDateRuleItemInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListDateRuleItemInfo.newBuilder() to construct.
  private UserListDateRuleItemInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListDateRuleItemInfo() {
    operator_ = 0;
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListDateRuleItemInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserListDateRuleItemInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            operator_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            value_ = s;
            break;
          }
          case 40: {
            bitField0_ |= 0x00000002;
            offsetInDays_ = input.readInt64();
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
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_UserListDateRuleItemInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_UserListDateRuleItemInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.class, com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_;
  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * Date comparison operator.
   * This field is required and must be populated when creating new date
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator getOperator() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator result = com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.valueOf(operator_);
    return result == null ? com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private volatile java.lang.Object value_;
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * String representing date value to be compared with the rule variable.
   * Supported date format is YYYY-MM-DD.
   * Times are reported in the customer's time zone.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFSET_IN_DAYS_FIELD_NUMBER = 5;
  private long offsetInDays_;
  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>optional int64 offset_in_days = 5;</code>
   * @return Whether the offsetInDays field is set.
   */
  @java.lang.Override
  public boolean hasOffsetInDays() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The relative date value of the right hand side denoted by number of days
   * offset from now. The value field will override this field when both are
   * present.
   * </pre>
   *
   * <code>optional int64 offset_in_days = 5;</code>
   * @return The offsetInDays.
   */
  @java.lang.Override
  public long getOffsetInDays() {
    return offsetInDays_;
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
    if (operator_ != com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, offsetInDays_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, offsetInDays_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.UserListDateRuleItemInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.UserListDateRuleItemInfo other = (com.google.ads.googleads.v11.common.UserListDateRuleItemInfo) obj;

    if (operator_ != other.operator_) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasOffsetInDays() != other.hasOffsetInDays()) return false;
    if (hasOffsetInDays()) {
      if (getOffsetInDays()
          != other.getOffsetInDays()) return false;
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasOffsetInDays()) {
      hash = (37 * hash) + OFFSET_IN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOffsetInDays());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.UserListDateRuleItemInfo prototype) {
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
   * A rule item composed of a date operation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.UserListDateRuleItemInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.UserListDateRuleItemInfo)
      com.google.ads.googleads.v11.common.UserListDateRuleItemInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_UserListDateRuleItemInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_UserListDateRuleItemInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.class, com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.newBuilder()
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
      operator_ = 0;

      value_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      offsetInDays_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_UserListDateRuleItemInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.UserListDateRuleItemInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.UserListDateRuleItemInfo build() {
      com.google.ads.googleads.v11.common.UserListDateRuleItemInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.UserListDateRuleItemInfo buildPartial() {
      com.google.ads.googleads.v11.common.UserListDateRuleItemInfo result = new com.google.ads.googleads.v11.common.UserListDateRuleItemInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.operator_ = operator_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.value_ = value_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offsetInDays_ = offsetInDays_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v11.common.UserListDateRuleItemInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.UserListDateRuleItemInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.UserListDateRuleItemInfo other) {
      if (other == com.google.ads.googleads.v11.common.UserListDateRuleItemInfo.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasValue()) {
        bitField0_ |= 0x00000001;
        value_ = other.value_;
        onChanged();
      }
      if (other.hasOffsetInDays()) {
        setOffsetInDays(other.getOffsetInDays());
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
      com.google.ads.googleads.v11.common.UserListDateRuleItemInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.UserListDateRuleItemInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int operator_ = 0;
    /**
     * <pre>
     * Date comparison operator.
     * This field is required and must be populated when creating new date
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * Date comparison operator.
     * This field is required and must be populated when creating new date
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date comparison operator.
     * This field is required and must be populated when creating new date
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator getOperator() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator result = com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.valueOf(operator_);
      return result == null ? com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Date comparison operator.
     * This field is required and must be populated when creating new date
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date comparison operator.
     * This field is required and must be populated when creating new date
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator operator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      
      operator_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String representing date value to be compared with the rule variable.
     * Supported date format is YYYY-MM-DD.
     * Times are reported in the customer's time zone.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }

    private long offsetInDays_ ;
    /**
     * <pre>
     * The relative date value of the right hand side denoted by number of days
     * offset from now. The value field will override this field when both are
     * present.
     * </pre>
     *
     * <code>optional int64 offset_in_days = 5;</code>
     * @return Whether the offsetInDays field is set.
     */
    @java.lang.Override
    public boolean hasOffsetInDays() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The relative date value of the right hand side denoted by number of days
     * offset from now. The value field will override this field when both are
     * present.
     * </pre>
     *
     * <code>optional int64 offset_in_days = 5;</code>
     * @return The offsetInDays.
     */
    @java.lang.Override
    public long getOffsetInDays() {
      return offsetInDays_;
    }
    /**
     * <pre>
     * The relative date value of the right hand side denoted by number of days
     * offset from now. The value field will override this field when both are
     * present.
     * </pre>
     *
     * <code>optional int64 offset_in_days = 5;</code>
     * @param value The offsetInDays to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetInDays(long value) {
      bitField0_ |= 0x00000002;
      offsetInDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relative date value of the right hand side denoted by number of days
     * offset from now. The value field will override this field when both are
     * present.
     * </pre>
     *
     * <code>optional int64 offset_in_days = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffsetInDays() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offsetInDays_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.UserListDateRuleItemInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.UserListDateRuleItemInfo)
  private static final com.google.ads.googleads.v11.common.UserListDateRuleItemInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.UserListDateRuleItemInfo();
  }

  public static com.google.ads.googleads.v11.common.UserListDateRuleItemInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListDateRuleItemInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListDateRuleItemInfo>() {
    @java.lang.Override
    public UserListDateRuleItemInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserListDateRuleItemInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserListDateRuleItemInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListDateRuleItemInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.UserListDateRuleItemInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

