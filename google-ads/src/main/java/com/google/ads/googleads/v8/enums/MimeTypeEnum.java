// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/enums/mime_type.proto

package com.google.ads.googleads.v8.enums;

/**
 * <pre>
 * Container for enum describing the mime types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.enums.MimeTypeEnum}
 */
public final class MimeTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.enums.MimeTypeEnum)
    MimeTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MimeTypeEnum.newBuilder() to construct.
  private MimeTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MimeTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MimeTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MimeTypeEnum(
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
    return com.google.ads.googleads.v8.enums.MimeTypeProto.internal_static_google_ads_googleads_v8_enums_MimeTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.enums.MimeTypeProto.internal_static_google_ads_googleads_v8_enums_MimeTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.enums.MimeTypeEnum.class, com.google.ads.googleads.v8.enums.MimeTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The mime type
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.enums.MimeTypeEnum.MimeType}
   */
  public enum MimeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The mime type has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * MIME type of image/jpeg.
     * </pre>
     *
     * <code>IMAGE_JPEG = 2;</code>
     */
    IMAGE_JPEG(2),
    /**
     * <pre>
     * MIME type of image/gif.
     * </pre>
     *
     * <code>IMAGE_GIF = 3;</code>
     */
    IMAGE_GIF(3),
    /**
     * <pre>
     * MIME type of image/png.
     * </pre>
     *
     * <code>IMAGE_PNG = 4;</code>
     */
    IMAGE_PNG(4),
    /**
     * <pre>
     * MIME type of application/x-shockwave-flash.
     * </pre>
     *
     * <code>FLASH = 5;</code>
     */
    FLASH(5),
    /**
     * <pre>
     * MIME type of text/html.
     * </pre>
     *
     * <code>TEXT_HTML = 6;</code>
     */
    TEXT_HTML(6),
    /**
     * <pre>
     * MIME type of application/pdf.
     * </pre>
     *
     * <code>PDF = 7;</code>
     */
    PDF(7),
    /**
     * <pre>
     * MIME type of application/msword.
     * </pre>
     *
     * <code>MSWORD = 8;</code>
     */
    MSWORD(8),
    /**
     * <pre>
     * MIME type of application/vnd.ms-excel.
     * </pre>
     *
     * <code>MSEXCEL = 9;</code>
     */
    MSEXCEL(9),
    /**
     * <pre>
     * MIME type of application/rtf.
     * </pre>
     *
     * <code>RTF = 10;</code>
     */
    RTF(10),
    /**
     * <pre>
     * MIME type of audio/wav.
     * </pre>
     *
     * <code>AUDIO_WAV = 11;</code>
     */
    AUDIO_WAV(11),
    /**
     * <pre>
     * MIME type of audio/mp3.
     * </pre>
     *
     * <code>AUDIO_MP3 = 12;</code>
     */
    AUDIO_MP3(12),
    /**
     * <pre>
     * MIME type of application/x-html5-ad-zip.
     * </pre>
     *
     * <code>HTML5_AD_ZIP = 13;</code>
     */
    HTML5_AD_ZIP(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The mime type has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * MIME type of image/jpeg.
     * </pre>
     *
     * <code>IMAGE_JPEG = 2;</code>
     */
    public static final int IMAGE_JPEG_VALUE = 2;
    /**
     * <pre>
     * MIME type of image/gif.
     * </pre>
     *
     * <code>IMAGE_GIF = 3;</code>
     */
    public static final int IMAGE_GIF_VALUE = 3;
    /**
     * <pre>
     * MIME type of image/png.
     * </pre>
     *
     * <code>IMAGE_PNG = 4;</code>
     */
    public static final int IMAGE_PNG_VALUE = 4;
    /**
     * <pre>
     * MIME type of application/x-shockwave-flash.
     * </pre>
     *
     * <code>FLASH = 5;</code>
     */
    public static final int FLASH_VALUE = 5;
    /**
     * <pre>
     * MIME type of text/html.
     * </pre>
     *
     * <code>TEXT_HTML = 6;</code>
     */
    public static final int TEXT_HTML_VALUE = 6;
    /**
     * <pre>
     * MIME type of application/pdf.
     * </pre>
     *
     * <code>PDF = 7;</code>
     */
    public static final int PDF_VALUE = 7;
    /**
     * <pre>
     * MIME type of application/msword.
     * </pre>
     *
     * <code>MSWORD = 8;</code>
     */
    public static final int MSWORD_VALUE = 8;
    /**
     * <pre>
     * MIME type of application/vnd.ms-excel.
     * </pre>
     *
     * <code>MSEXCEL = 9;</code>
     */
    public static final int MSEXCEL_VALUE = 9;
    /**
     * <pre>
     * MIME type of application/rtf.
     * </pre>
     *
     * <code>RTF = 10;</code>
     */
    public static final int RTF_VALUE = 10;
    /**
     * <pre>
     * MIME type of audio/wav.
     * </pre>
     *
     * <code>AUDIO_WAV = 11;</code>
     */
    public static final int AUDIO_WAV_VALUE = 11;
    /**
     * <pre>
     * MIME type of audio/mp3.
     * </pre>
     *
     * <code>AUDIO_MP3 = 12;</code>
     */
    public static final int AUDIO_MP3_VALUE = 12;
    /**
     * <pre>
     * MIME type of application/x-html5-ad-zip.
     * </pre>
     *
     * <code>HTML5_AD_ZIP = 13;</code>
     */
    public static final int HTML5_AD_ZIP_VALUE = 13;


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
    public static MimeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MimeType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return IMAGE_JPEG;
        case 3: return IMAGE_GIF;
        case 4: return IMAGE_PNG;
        case 5: return FLASH;
        case 6: return TEXT_HTML;
        case 7: return PDF;
        case 8: return MSWORD;
        case 9: return MSEXCEL;
        case 10: return RTF;
        case 11: return AUDIO_WAV;
        case 12: return AUDIO_MP3;
        case 13: return HTML5_AD_ZIP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MimeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MimeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MimeType>() {
            public MimeType findValueByNumber(int number) {
              return MimeType.forNumber(number);
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
      return com.google.ads.googleads.v8.enums.MimeTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MimeType[] VALUES = values();

    public static MimeType valueOf(
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

    private MimeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.enums.MimeTypeEnum.MimeType)
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
    if (!(obj instanceof com.google.ads.googleads.v8.enums.MimeTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.enums.MimeTypeEnum other = (com.google.ads.googleads.v8.enums.MimeTypeEnum) obj;

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

  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.enums.MimeTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.enums.MimeTypeEnum prototype) {
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
   * Container for enum describing the mime types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.enums.MimeTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.enums.MimeTypeEnum)
      com.google.ads.googleads.v8.enums.MimeTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.enums.MimeTypeProto.internal_static_google_ads_googleads_v8_enums_MimeTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.enums.MimeTypeProto.internal_static_google_ads_googleads_v8_enums_MimeTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.enums.MimeTypeEnum.class, com.google.ads.googleads.v8.enums.MimeTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.enums.MimeTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v8.enums.MimeTypeProto.internal_static_google_ads_googleads_v8_enums_MimeTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.MimeTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.enums.MimeTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.MimeTypeEnum build() {
      com.google.ads.googleads.v8.enums.MimeTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.enums.MimeTypeEnum buildPartial() {
      com.google.ads.googleads.v8.enums.MimeTypeEnum result = new com.google.ads.googleads.v8.enums.MimeTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v8.enums.MimeTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v8.enums.MimeTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.enums.MimeTypeEnum other) {
      if (other == com.google.ads.googleads.v8.enums.MimeTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v8.enums.MimeTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.enums.MimeTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.enums.MimeTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.MimeTypeEnum)
  private static final com.google.ads.googleads.v8.enums.MimeTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.enums.MimeTypeEnum();
  }

  public static com.google.ads.googleads.v8.enums.MimeTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MimeTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<MimeTypeEnum>() {
    @java.lang.Override
    public MimeTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MimeTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MimeTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MimeTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.enums.MimeTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

