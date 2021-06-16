// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/enums/user_list_size_range.proto

package com.google.ads.googleads.v8.enums;

/**
 * <pre>
 * Size range in terms of number of users of a UserList.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.enums.UserListSizeRangeEnum}
 */
public final class UserListSizeRangeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.enums.UserListSizeRangeEnum)
    UserListSizeRangeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListSizeRangeEnum.newBuilder() to construct.
  private UserListSizeRangeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListSizeRangeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListSizeRangeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserListSizeRangeEnum(
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
    return com.google.ads.googleads.v8.enums.UserListSizeRangeProto.internal_static_google_ads_googleads_v8_enums_UserListSizeRangeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.enums.UserListSizeRangeProto.internal_static_google_ads_googleads_v8_enums_UserListSizeRangeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.class, com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum containing possible user list size ranges.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.enums.UserListSizeRangeEnum.UserListSizeRange}
   */
  public enum UserListSizeRange
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * User list has less than 500 users.
     * </pre>
     *
     * <code>LESS_THAN_FIVE_HUNDRED = 2;</code>
     */
    LESS_THAN_FIVE_HUNDRED(2),
    /**
     * <pre>
     * User list has number of users in range of 500 to 1000.
     * </pre>
     *
     * <code>LESS_THAN_ONE_THOUSAND = 3;</code>
     */
    LESS_THAN_ONE_THOUSAND(3),
    /**
     * <pre>
     * User list has number of users in range of 1000 to 10000.
     * </pre>
     *
     * <code>ONE_THOUSAND_TO_TEN_THOUSAND = 4;</code>
     */
    ONE_THOUSAND_TO_TEN_THOUSAND(4),
    /**
     * <pre>
     * User list has number of users in range of 10000 to 50000.
     * </pre>
     *
     * <code>TEN_THOUSAND_TO_FIFTY_THOUSAND = 5;</code>
     */
    TEN_THOUSAND_TO_FIFTY_THOUSAND(5),
    /**
     * <pre>
     * User list has number of users in range of 50000 to 100000.
     * </pre>
     *
     * <code>FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND = 6;</code>
     */
    FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND(6),
    /**
     * <pre>
     * User list has number of users in range of 100000 to 300000.
     * </pre>
     *
     * <code>ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND = 7;</code>
     */
    ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND(7),
    /**
     * <pre>
     * User list has number of users in range of 300000 to 500000.
     * </pre>
     *
     * <code>THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND = 8;</code>
     */
    THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND(8),
    /**
     * <pre>
     * User list has number of users in range of 500000 to 1 million.
     * </pre>
     *
     * <code>FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION = 9;</code>
     */
    FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION(9),
    /**
     * <pre>
     * User list has number of users in range of 1 to 2 millions.
     * </pre>
     *
     * <code>ONE_MILLION_TO_TWO_MILLION = 10;</code>
     */
    ONE_MILLION_TO_TWO_MILLION(10),
    /**
     * <pre>
     * User list has number of users in range of 2 to 3 millions.
     * </pre>
     *
     * <code>TWO_MILLION_TO_THREE_MILLION = 11;</code>
     */
    TWO_MILLION_TO_THREE_MILLION(11),
    /**
     * <pre>
     * User list has number of users in range of 3 to 5 millions.
     * </pre>
     *
     * <code>THREE_MILLION_TO_FIVE_MILLION = 12;</code>
     */
    THREE_MILLION_TO_FIVE_MILLION(12),
    /**
     * <pre>
     * User list has number of users in range of 5 to 10 millions.
     * </pre>
     *
     * <code>FIVE_MILLION_TO_TEN_MILLION = 13;</code>
     */
    FIVE_MILLION_TO_TEN_MILLION(13),
    /**
     * <pre>
     * User list has number of users in range of 10 to 20 millions.
     * </pre>
     *
     * <code>TEN_MILLION_TO_TWENTY_MILLION = 14;</code>
     */
    TEN_MILLION_TO_TWENTY_MILLION(14),
    /**
     * <pre>
     * User list has number of users in range of 20 to 30 millions.
     * </pre>
     *
     * <code>TWENTY_MILLION_TO_THIRTY_MILLION = 15;</code>
     */
    TWENTY_MILLION_TO_THIRTY_MILLION(15),
    /**
     * <pre>
     * User list has number of users in range of 30 to 50 millions.
     * </pre>
     *
     * <code>THIRTY_MILLION_TO_FIFTY_MILLION = 16;</code>
     */
    THIRTY_MILLION_TO_FIFTY_MILLION(16),
    /**
     * <pre>
     * User list has over 50 million users.
     * </pre>
     *
     * <code>OVER_FIFTY_MILLION = 17;</code>
     */
    OVER_FIFTY_MILLION(17),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * User list has less than 500 users.
     * </pre>
     *
     * <code>LESS_THAN_FIVE_HUNDRED = 2;</code>
     */
    public static final int LESS_THAN_FIVE_HUNDRED_VALUE = 2;
    /**
     * <pre>
     * User list has number of users in range of 500 to 1000.
     * </pre>
     *
     * <code>LESS_THAN_ONE_THOUSAND = 3;</code>
     */
    public static final int LESS_THAN_ONE_THOUSAND_VALUE = 3;
    /**
     * <pre>
     * User list has number of users in range of 1000 to 10000.
     * </pre>
     *
     * <code>ONE_THOUSAND_TO_TEN_THOUSAND = 4;</code>
     */
    public static final int ONE_THOUSAND_TO_TEN_THOUSAND_VALUE = 4;
    /**
     * <pre>
     * User list has number of users in range of 10000 to 50000.
     * </pre>
     *
     * <code>TEN_THOUSAND_TO_FIFTY_THOUSAND = 5;</code>
     */
    public static final int TEN_THOUSAND_TO_FIFTY_THOUSAND_VALUE = 5;
    /**
     * <pre>
     * User list has number of users in range of 50000 to 100000.
     * </pre>
     *
     * <code>FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND = 6;</code>
     */
    public static final int FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND_VALUE = 6;
    /**
     * <pre>
     * User list has number of users in range of 100000 to 300000.
     * </pre>
     *
     * <code>ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND = 7;</code>
     */
    public static final int ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND_VALUE = 7;
    /**
     * <pre>
     * User list has number of users in range of 300000 to 500000.
     * </pre>
     *
     * <code>THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND = 8;</code>
     */
    public static final int THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND_VALUE = 8;
    /**
     * <pre>
     * User list has number of users in range of 500000 to 1 million.
     * </pre>
     *
     * <code>FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION = 9;</code>
     */
    public static final int FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION_VALUE = 9;
    /**
     * <pre>
     * User list has number of users in range of 1 to 2 millions.
     * </pre>
     *
     * <code>ONE_MILLION_TO_TWO_MILLION = 10;</code>
     */
    public static final int ONE_MILLION_TO_TWO_MILLION_VALUE = 10;
    /**
     * <pre>
     * User list has number of users in range of 2 to 3 millions.
     * </pre>
     *
     * <code>TWO_MILLION_TO_THREE_MILLION = 11;</code>
     */
    public static final int TWO_MILLION_TO_THREE_MILLION_VALUE = 11;
    /**
     * <pre>
     * User list has number of users in range of 3 to 5 millions.
     * </pre>
     *
     * <code>THREE_MILLION_TO_FIVE_MILLION = 12;</code>
     */
    public static final int THREE_MILLION_TO_FIVE_MILLION_VALUE = 12;
    /**
     * <pre>
     * User list has number of users in range of 5 to 10 millions.
     * </pre>
     *
     * <code>FIVE_MILLION_TO_TEN_MILLION = 13;</code>
     */
    public static final int FIVE_MILLION_TO_TEN_MILLION_VALUE = 13;
    /**
     * <pre>
     * User list has number of users in range of 10 to 20 millions.
     * </pre>
     *
     * <code>TEN_MILLION_TO_TWENTY_MILLION = 14;</code>
     */
    public static final int TEN_MILLION_TO_TWENTY_MILLION_VALUE = 14;
    /**
     * <pre>
     * User list has number of users in range of 20 to 30 millions.
     * </pre>
     *
     * <code>TWENTY_MILLION_TO_THIRTY_MILLION = 15;</code>
     */
    public static final int TWENTY_MILLION_TO_THIRTY_MILLION_VALUE = 15;
    /**
     * <pre>
     * User list has number of users in range of 30 to 50 millions.
     * </pre>
     *
     * <code>THIRTY_MILLION_TO_FIFTY_MILLION = 16;</code>
     */
    public static final int THIRTY_MILLION_TO_FIFTY_MILLION_VALUE = 16;
    /**
     * <pre>
     * User list has over 50 million users.
     * </pre>
     *
     * <code>OVER_FIFTY_MILLION = 17;</code>
     */
    public static final int OVER_FIFTY_MILLION_VALUE = 17;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UserListSizeRange valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserListSizeRange forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return LESS_THAN_FIVE_HUNDRED;
        case 3: return LESS_THAN_ONE_THOUSAND;
        case 4: return ONE_THOUSAND_TO_TEN_THOUSAND;
        case 5: return TEN_THOUSAND_TO_FIFTY_THOUSAND;
        case 6: return FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND;
        case 7: return ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND;
        case 8: return THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND;
        case 9: return FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION;
        case 10: return ONE_MILLION_TO_TWO_MILLION;
        case 11: return TWO_MILLION_TO_THREE_MILLION;
        case 12: return THREE_MILLION_TO_FIVE_MILLION;
        case 13: return FIVE_MILLION_TO_TEN_MILLION;
        case 14: return TEN_MILLION_TO_TWENTY_MILLION;
        case 15: return TWENTY_MILLION_TO_THIRTY_MILLION;
        case 16: return THIRTY_MILLION_TO_FIFTY_MILLION;
        case 17: return OVER_FIFTY_MILLION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserListSizeRange>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserListSizeRange> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserListSizeRange>() {
            public UserListSizeRange findValueByNumber(int number) {
              return UserListSizeRange.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserListSizeRange[] VALUES = values();

    public static UserListSizeRange valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private UserListSizeRange(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.enums.UserListSizeRangeEnum.UserListSizeRange)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v8.enums.UserListSizeRangeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.enums.UserListSizeRangeEnum other = (com.google.ads.googleads.v8.enums.UserListSizeRangeEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.enums.UserListSizeRangeEnum prototype) {
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
   * Size range in terms of number of users of a UserList.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.enums.UserListSizeRangeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.enums.UserListSizeRangeEnum)
      com.google.ads.googleads.v8.enums.UserListSizeRangeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.UserListSizeRangeProto.internal_static_google_ads_googleads_v8_enums_UserListSizeRangeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.enums.UserListSizeRangeProto.internal_static_google_ads_googleads_v8_enums_UserListSizeRangeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.class, com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.enums.UserListSizeRangeProto.internal_static_google_ads_googleads_v8_enums_UserListSizeRangeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.UserListSizeRangeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.UserListSizeRangeEnum build() {
      com.google.ads.googleads.v8.enums.UserListSizeRangeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.UserListSizeRangeEnum buildPartial() {
      com.google.ads.googleads.v8.enums.UserListSizeRangeEnum result = new com.google.ads.googleads.v8.enums.UserListSizeRangeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v8.enums.UserListSizeRangeEnum) {
        return mergeFrom((com.google.ads.googleads.v8.enums.UserListSizeRangeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.enums.UserListSizeRangeEnum other) {
      if (other == com.google.ads.googleads.v8.enums.UserListSizeRangeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v8.enums.UserListSizeRangeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.enums.UserListSizeRangeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.enums.UserListSizeRangeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.UserListSizeRangeEnum)
  private static final com.google.ads.googleads.v8.enums.UserListSizeRangeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.enums.UserListSizeRangeEnum();
  }

  public static com.google.ads.googleads.v8.enums.UserListSizeRangeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListSizeRangeEnum>
      PARSER = new com.google.protobuf.AbstractParser<UserListSizeRangeEnum>() {
    @java.lang.Override
    public UserListSizeRangeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserListSizeRangeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserListSizeRangeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListSizeRangeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.enums.UserListSizeRangeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

