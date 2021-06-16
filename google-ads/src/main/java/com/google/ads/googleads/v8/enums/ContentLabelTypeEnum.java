// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/enums/content_label_type.proto

package com.google.ads.googleads.v8.enums;

/**
 * <pre>
 * Container for enum describing content label types in ContentLabel.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.enums.ContentLabelTypeEnum}
 */
public final class ContentLabelTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.enums.ContentLabelTypeEnum)
    ContentLabelTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContentLabelTypeEnum.newBuilder() to construct.
  private ContentLabelTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContentLabelTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContentLabelTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContentLabelTypeEnum(
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
    return com.google.ads.googleads.v8.enums.ContentLabelTypeProto.internal_static_google_ads_googleads_v8_enums_ContentLabelTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.enums.ContentLabelTypeProto.internal_static_google_ads_googleads_v8_enums_ContentLabelTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.class, com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum listing the content label types supported by ContentLabel criterion.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.enums.ContentLabelTypeEnum.ContentLabelType}
   */
  public enum ContentLabelType
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
     * Sexually suggestive content.
     * </pre>
     *
     * <code>SEXUALLY_SUGGESTIVE = 2;</code>
     */
    SEXUALLY_SUGGESTIVE(2),
    /**
     * <pre>
     * Below the fold placement.
     * </pre>
     *
     * <code>BELOW_THE_FOLD = 3;</code>
     */
    BELOW_THE_FOLD(3),
    /**
     * <pre>
     * Parked domain.
     * </pre>
     *
     * <code>PARKED_DOMAIN = 4;</code>
     */
    PARKED_DOMAIN(4),
    /**
     * <pre>
     * Juvenile, gross &amp; bizarre content.
     * </pre>
     *
     * <code>JUVENILE = 6;</code>
     */
    JUVENILE(6),
    /**
     * <pre>
     * Profanity &amp; rough language.
     * </pre>
     *
     * <code>PROFANITY = 7;</code>
     */
    PROFANITY(7),
    /**
     * <pre>
     * Death &amp; tragedy.
     * </pre>
     *
     * <code>TRAGEDY = 8;</code>
     */
    TRAGEDY(8),
    /**
     * <pre>
     * Video.
     * </pre>
     *
     * <code>VIDEO = 9;</code>
     */
    VIDEO(9),
    /**
     * <pre>
     * Content rating: G.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_G = 10;</code>
     */
    VIDEO_RATING_DV_G(10),
    /**
     * <pre>
     * Content rating: PG.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_PG = 11;</code>
     */
    VIDEO_RATING_DV_PG(11),
    /**
     * <pre>
     * Content rating: T.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_T = 12;</code>
     */
    VIDEO_RATING_DV_T(12),
    /**
     * <pre>
     * Content rating: MA.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_MA = 13;</code>
     */
    VIDEO_RATING_DV_MA(13),
    /**
     * <pre>
     * Content rating: not yet rated.
     * </pre>
     *
     * <code>VIDEO_NOT_YET_RATED = 14;</code>
     */
    VIDEO_NOT_YET_RATED(14),
    /**
     * <pre>
     * Embedded video.
     * </pre>
     *
     * <code>EMBEDDED_VIDEO = 15;</code>
     */
    EMBEDDED_VIDEO(15),
    /**
     * <pre>
     * Live streaming video.
     * </pre>
     *
     * <code>LIVE_STREAMING_VIDEO = 16;</code>
     */
    LIVE_STREAMING_VIDEO(16),
    /**
     * <pre>
     * Sensitive social issues.
     * </pre>
     *
     * <code>SOCIAL_ISSUES = 17;</code>
     */
    SOCIAL_ISSUES(17),
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
     * Sexually suggestive content.
     * </pre>
     *
     * <code>SEXUALLY_SUGGESTIVE = 2;</code>
     */
    public static final int SEXUALLY_SUGGESTIVE_VALUE = 2;
    /**
     * <pre>
     * Below the fold placement.
     * </pre>
     *
     * <code>BELOW_THE_FOLD = 3;</code>
     */
    public static final int BELOW_THE_FOLD_VALUE = 3;
    /**
     * <pre>
     * Parked domain.
     * </pre>
     *
     * <code>PARKED_DOMAIN = 4;</code>
     */
    public static final int PARKED_DOMAIN_VALUE = 4;
    /**
     * <pre>
     * Juvenile, gross &amp; bizarre content.
     * </pre>
     *
     * <code>JUVENILE = 6;</code>
     */
    public static final int JUVENILE_VALUE = 6;
    /**
     * <pre>
     * Profanity &amp; rough language.
     * </pre>
     *
     * <code>PROFANITY = 7;</code>
     */
    public static final int PROFANITY_VALUE = 7;
    /**
     * <pre>
     * Death &amp; tragedy.
     * </pre>
     *
     * <code>TRAGEDY = 8;</code>
     */
    public static final int TRAGEDY_VALUE = 8;
    /**
     * <pre>
     * Video.
     * </pre>
     *
     * <code>VIDEO = 9;</code>
     */
    public static final int VIDEO_VALUE = 9;
    /**
     * <pre>
     * Content rating: G.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_G = 10;</code>
     */
    public static final int VIDEO_RATING_DV_G_VALUE = 10;
    /**
     * <pre>
     * Content rating: PG.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_PG = 11;</code>
     */
    public static final int VIDEO_RATING_DV_PG_VALUE = 11;
    /**
     * <pre>
     * Content rating: T.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_T = 12;</code>
     */
    public static final int VIDEO_RATING_DV_T_VALUE = 12;
    /**
     * <pre>
     * Content rating: MA.
     * </pre>
     *
     * <code>VIDEO_RATING_DV_MA = 13;</code>
     */
    public static final int VIDEO_RATING_DV_MA_VALUE = 13;
    /**
     * <pre>
     * Content rating: not yet rated.
     * </pre>
     *
     * <code>VIDEO_NOT_YET_RATED = 14;</code>
     */
    public static final int VIDEO_NOT_YET_RATED_VALUE = 14;
    /**
     * <pre>
     * Embedded video.
     * </pre>
     *
     * <code>EMBEDDED_VIDEO = 15;</code>
     */
    public static final int EMBEDDED_VIDEO_VALUE = 15;
    /**
     * <pre>
     * Live streaming video.
     * </pre>
     *
     * <code>LIVE_STREAMING_VIDEO = 16;</code>
     */
    public static final int LIVE_STREAMING_VIDEO_VALUE = 16;
    /**
     * <pre>
     * Sensitive social issues.
     * </pre>
     *
     * <code>SOCIAL_ISSUES = 17;</code>
     */
    public static final int SOCIAL_ISSUES_VALUE = 17;


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
    public static ContentLabelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ContentLabelType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SEXUALLY_SUGGESTIVE;
        case 3: return BELOW_THE_FOLD;
        case 4: return PARKED_DOMAIN;
        case 6: return JUVENILE;
        case 7: return PROFANITY;
        case 8: return TRAGEDY;
        case 9: return VIDEO;
        case 10: return VIDEO_RATING_DV_G;
        case 11: return VIDEO_RATING_DV_PG;
        case 12: return VIDEO_RATING_DV_T;
        case 13: return VIDEO_RATING_DV_MA;
        case 14: return VIDEO_NOT_YET_RATED;
        case 15: return EMBEDDED_VIDEO;
        case 16: return LIVE_STREAMING_VIDEO;
        case 17: return SOCIAL_ISSUES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ContentLabelType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ContentLabelType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ContentLabelType>() {
            public ContentLabelType findValueByNumber(int number) {
              return ContentLabelType.forNumber(number);
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
      return com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ContentLabelType[] VALUES = values();

    public static ContentLabelType valueOf(
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

    private ContentLabelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.enums.ContentLabelTypeEnum.ContentLabelType)
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
    if (!(obj instanceof com.google.ads.googleads.v8.enums.ContentLabelTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.enums.ContentLabelTypeEnum other = (com.google.ads.googleads.v8.enums.ContentLabelTypeEnum) obj;

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

  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.enums.ContentLabelTypeEnum prototype) {
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
   * Container for enum describing content label types in ContentLabel.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.enums.ContentLabelTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.enums.ContentLabelTypeEnum)
      com.google.ads.googleads.v8.enums.ContentLabelTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.ContentLabelTypeProto.internal_static_google_ads_googleads_v8_enums_ContentLabelTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.enums.ContentLabelTypeProto.internal_static_google_ads_googleads_v8_enums_ContentLabelTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.class, com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v8.enums.ContentLabelTypeProto.internal_static_google_ads_googleads_v8_enums_ContentLabelTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.ContentLabelTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.ContentLabelTypeEnum build() {
      com.google.ads.googleads.v8.enums.ContentLabelTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.ContentLabelTypeEnum buildPartial() {
      com.google.ads.googleads.v8.enums.ContentLabelTypeEnum result = new com.google.ads.googleads.v8.enums.ContentLabelTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v8.enums.ContentLabelTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v8.enums.ContentLabelTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.enums.ContentLabelTypeEnum other) {
      if (other == com.google.ads.googleads.v8.enums.ContentLabelTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v8.enums.ContentLabelTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.enums.ContentLabelTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.enums.ContentLabelTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.ContentLabelTypeEnum)
  private static final com.google.ads.googleads.v8.enums.ContentLabelTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.enums.ContentLabelTypeEnum();
  }

  public static com.google.ads.googleads.v8.enums.ContentLabelTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContentLabelTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ContentLabelTypeEnum>() {
    @java.lang.Override
    public ContentLabelTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContentLabelTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContentLabelTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContentLabelTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.enums.ContentLabelTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

