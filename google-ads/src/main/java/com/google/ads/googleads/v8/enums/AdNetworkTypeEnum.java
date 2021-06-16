// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/enums/ad_network_type.proto

package com.google.ads.googleads.v8.enums;

/**
 * <pre>
 * Container for enumeration of Google Ads network types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.enums.AdNetworkTypeEnum}
 */
public final class AdNetworkTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.enums.AdNetworkTypeEnum)
    AdNetworkTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdNetworkTypeEnum.newBuilder() to construct.
  private AdNetworkTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdNetworkTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdNetworkTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdNetworkTypeEnum(
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
    return com.google.ads.googleads.v8.enums.AdNetworkTypeProto.internal_static_google_ads_googleads_v8_enums_AdNetworkTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.enums.AdNetworkTypeProto.internal_static_google_ads_googleads_v8_enums_AdNetworkTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.class, com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates Google Ads network types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.enums.AdNetworkTypeEnum.AdNetworkType}
   */
  public enum AdNetworkType
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Google search.
     * </pre>
     *
     * <code>SEARCH = 2;</code>
     */
    SEARCH(2),
    /**
     * <pre>
     * Search partners.
     * </pre>
     *
     * <code>SEARCH_PARTNERS = 3;</code>
     */
    SEARCH_PARTNERS(3),
    /**
     * <pre>
     * Display Network.
     * </pre>
     *
     * <code>CONTENT = 4;</code>
     */
    CONTENT(4),
    /**
     * <pre>
     * YouTube Search.
     * </pre>
     *
     * <code>YOUTUBE_SEARCH = 5;</code>
     */
    YOUTUBE_SEARCH(5),
    /**
     * <pre>
     * YouTube Videos
     * </pre>
     *
     * <code>YOUTUBE_WATCH = 6;</code>
     */
    YOUTUBE_WATCH(6),
    /**
     * <pre>
     * Cross-network.
     * </pre>
     *
     * <code>MIXED = 7;</code>
     */
    MIXED(7),
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
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Google search.
     * </pre>
     *
     * <code>SEARCH = 2;</code>
     */
    public static final int SEARCH_VALUE = 2;
    /**
     * <pre>
     * Search partners.
     * </pre>
     *
     * <code>SEARCH_PARTNERS = 3;</code>
     */
    public static final int SEARCH_PARTNERS_VALUE = 3;
    /**
     * <pre>
     * Display Network.
     * </pre>
     *
     * <code>CONTENT = 4;</code>
     */
    public static final int CONTENT_VALUE = 4;
    /**
     * <pre>
     * YouTube Search.
     * </pre>
     *
     * <code>YOUTUBE_SEARCH = 5;</code>
     */
    public static final int YOUTUBE_SEARCH_VALUE = 5;
    /**
     * <pre>
     * YouTube Videos
     * </pre>
     *
     * <code>YOUTUBE_WATCH = 6;</code>
     */
    public static final int YOUTUBE_WATCH_VALUE = 6;
    /**
     * <pre>
     * Cross-network.
     * </pre>
     *
     * <code>MIXED = 7;</code>
     */
    public static final int MIXED_VALUE = 7;


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
    public static AdNetworkType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdNetworkType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SEARCH;
        case 3: return SEARCH_PARTNERS;
        case 4: return CONTENT;
        case 5: return YOUTUBE_SEARCH;
        case 6: return YOUTUBE_WATCH;
        case 7: return MIXED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdNetworkType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdNetworkType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdNetworkType>() {
            public AdNetworkType findValueByNumber(int number) {
              return AdNetworkType.forNumber(number);
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
      return com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdNetworkType[] VALUES = values();

    public static AdNetworkType valueOf(
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

    private AdNetworkType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.enums.AdNetworkTypeEnum.AdNetworkType)
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
    if (!(obj instanceof com.google.ads.googleads.v8.enums.AdNetworkTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.enums.AdNetworkTypeEnum other = (com.google.ads.googleads.v8.enums.AdNetworkTypeEnum) obj;

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

  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.enums.AdNetworkTypeEnum prototype) {
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
   * Container for enumeration of Google Ads network types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.enums.AdNetworkTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.enums.AdNetworkTypeEnum)
      com.google.ads.googleads.v8.enums.AdNetworkTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.AdNetworkTypeProto.internal_static_google_ads_googleads_v8_enums_AdNetworkTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.enums.AdNetworkTypeProto.internal_static_google_ads_googleads_v8_enums_AdNetworkTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.class, com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v8.enums.AdNetworkTypeProto.internal_static_google_ads_googleads_v8_enums_AdNetworkTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.AdNetworkTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.AdNetworkTypeEnum build() {
      com.google.ads.googleads.v8.enums.AdNetworkTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.AdNetworkTypeEnum buildPartial() {
      com.google.ads.googleads.v8.enums.AdNetworkTypeEnum result = new com.google.ads.googleads.v8.enums.AdNetworkTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v8.enums.AdNetworkTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v8.enums.AdNetworkTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.enums.AdNetworkTypeEnum other) {
      if (other == com.google.ads.googleads.v8.enums.AdNetworkTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v8.enums.AdNetworkTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.enums.AdNetworkTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.enums.AdNetworkTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.AdNetworkTypeEnum)
  private static final com.google.ads.googleads.v8.enums.AdNetworkTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.enums.AdNetworkTypeEnum();
  }

  public static com.google.ads.googleads.v8.enums.AdNetworkTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdNetworkTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdNetworkTypeEnum>() {
    @java.lang.Override
    public AdNetworkTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdNetworkTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdNetworkTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdNetworkTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.enums.AdNetworkTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

