// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/enums/feed_item_quality_disapproval_reason.proto

package com.google.ads.googleads.v11.enums;

/**
 * <pre>
 * Container for enum describing possible quality evaluation disapproval reasons
 * of a feed item.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum}
 */
public final class FeedItemQualityDisapprovalReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)
    FeedItemQualityDisapprovalReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedItemQualityDisapprovalReasonEnum.newBuilder() to construct.
  private FeedItemQualityDisapprovalReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedItemQualityDisapprovalReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedItemQualityDisapprovalReasonEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedItemQualityDisapprovalReasonEnum(
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
    return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonProto.internal_static_google_ads_googleads_v11_enums_FeedItemQualityDisapprovalReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonProto.internal_static_google_ads_googleads_v11_enums_FeedItemQualityDisapprovalReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.class, com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible quality evaluation disapproval reasons of a feed item.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason}
   */
  public enum FeedItemQualityDisapprovalReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
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
     * Price contains repetitive headers.
     * </pre>
     *
     * <code>PRICE_TABLE_REPETITIVE_HEADERS = 2;</code>
     */
    PRICE_TABLE_REPETITIVE_HEADERS(2),
    /**
     * <pre>
     * Price contains repetitive description.
     * </pre>
     *
     * <code>PRICE_TABLE_REPETITIVE_DESCRIPTION = 3;</code>
     */
    PRICE_TABLE_REPETITIVE_DESCRIPTION(3),
    /**
     * <pre>
     * Price contains inconsistent items.
     * </pre>
     *
     * <code>PRICE_TABLE_INCONSISTENT_ROWS = 4;</code>
     */
    PRICE_TABLE_INCONSISTENT_ROWS(4),
    /**
     * <pre>
     * Price contains qualifiers in description.
     * </pre>
     *
     * <code>PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS = 5;</code>
     */
    PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS(5),
    /**
     * <pre>
     * Price contains an unsupported language.
     * </pre>
     *
     * <code>PRICE_UNSUPPORTED_LANGUAGE = 6;</code>
     */
    PRICE_UNSUPPORTED_LANGUAGE(6),
    /**
     * <pre>
     * Price item header is not relevant to the price type.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH = 7;</code>
     */
    PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH(7),
    /**
     * <pre>
     * Price item header has promotional text.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT = 8;</code>
     */
    PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT(8),
    /**
     * <pre>
     * Price item description is not relevant to the item header.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT = 9;</code>
     */
    PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT(9),
    /**
     * <pre>
     * Price item description contains promotional text.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT = 10;</code>
     */
    PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT(10),
    /**
     * <pre>
     * Price item header and description are repetitive.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE = 11;</code>
     */
    PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE(11),
    /**
     * <pre>
     * Price item is in a foreign language, nonsense, or can't be rated.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_UNRATEABLE = 12;</code>
     */
    PRICE_TABLE_ROW_UNRATEABLE(12),
    /**
     * <pre>
     * Price item price is invalid or inaccurate.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_PRICE_INVALID = 13;</code>
     */
    PRICE_TABLE_ROW_PRICE_INVALID(13),
    /**
     * <pre>
     * Price item URL is invalid or irrelevant.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_URL_INVALID = 14;</code>
     */
    PRICE_TABLE_ROW_URL_INVALID(14),
    /**
     * <pre>
     * Price item header or description has price.
     * </pre>
     *
     * <code>PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE = 15;</code>
     */
    PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE(15),
    /**
     * <pre>
     * Structured snippet values do not match the header.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED = 16;</code>
     */
    STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED(16),
    /**
     * <pre>
     * Structured snippet values are repeated.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_REPEATED_VALUES = 17;</code>
     */
    STRUCTURED_SNIPPETS_REPEATED_VALUES(17),
    /**
     * <pre>
     * Structured snippet values violate editorial guidelines like punctuation.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES = 18;</code>
     */
    STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES(18),
    /**
     * <pre>
     * Structured snippet contain promotional text.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT = 19;</code>
     */
    STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
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
     * Price contains repetitive headers.
     * </pre>
     *
     * <code>PRICE_TABLE_REPETITIVE_HEADERS = 2;</code>
     */
    public static final int PRICE_TABLE_REPETITIVE_HEADERS_VALUE = 2;
    /**
     * <pre>
     * Price contains repetitive description.
     * </pre>
     *
     * <code>PRICE_TABLE_REPETITIVE_DESCRIPTION = 3;</code>
     */
    public static final int PRICE_TABLE_REPETITIVE_DESCRIPTION_VALUE = 3;
    /**
     * <pre>
     * Price contains inconsistent items.
     * </pre>
     *
     * <code>PRICE_TABLE_INCONSISTENT_ROWS = 4;</code>
     */
    public static final int PRICE_TABLE_INCONSISTENT_ROWS_VALUE = 4;
    /**
     * <pre>
     * Price contains qualifiers in description.
     * </pre>
     *
     * <code>PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS = 5;</code>
     */
    public static final int PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS_VALUE = 5;
    /**
     * <pre>
     * Price contains an unsupported language.
     * </pre>
     *
     * <code>PRICE_UNSUPPORTED_LANGUAGE = 6;</code>
     */
    public static final int PRICE_UNSUPPORTED_LANGUAGE_VALUE = 6;
    /**
     * <pre>
     * Price item header is not relevant to the price type.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH = 7;</code>
     */
    public static final int PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH_VALUE = 7;
    /**
     * <pre>
     * Price item header has promotional text.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT = 8;</code>
     */
    public static final int PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT_VALUE = 8;
    /**
     * <pre>
     * Price item description is not relevant to the item header.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT = 9;</code>
     */
    public static final int PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT_VALUE = 9;
    /**
     * <pre>
     * Price item description contains promotional text.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT = 10;</code>
     */
    public static final int PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT_VALUE = 10;
    /**
     * <pre>
     * Price item header and description are repetitive.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE = 11;</code>
     */
    public static final int PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE_VALUE = 11;
    /**
     * <pre>
     * Price item is in a foreign language, nonsense, or can't be rated.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_UNRATEABLE = 12;</code>
     */
    public static final int PRICE_TABLE_ROW_UNRATEABLE_VALUE = 12;
    /**
     * <pre>
     * Price item price is invalid or inaccurate.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_PRICE_INVALID = 13;</code>
     */
    public static final int PRICE_TABLE_ROW_PRICE_INVALID_VALUE = 13;
    /**
     * <pre>
     * Price item URL is invalid or irrelevant.
     * </pre>
     *
     * <code>PRICE_TABLE_ROW_URL_INVALID = 14;</code>
     */
    public static final int PRICE_TABLE_ROW_URL_INVALID_VALUE = 14;
    /**
     * <pre>
     * Price item header or description has price.
     * </pre>
     *
     * <code>PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE = 15;</code>
     */
    public static final int PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE_VALUE = 15;
    /**
     * <pre>
     * Structured snippet values do not match the header.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED = 16;</code>
     */
    public static final int STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED_VALUE = 16;
    /**
     * <pre>
     * Structured snippet values are repeated.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_REPEATED_VALUES = 17;</code>
     */
    public static final int STRUCTURED_SNIPPETS_REPEATED_VALUES_VALUE = 17;
    /**
     * <pre>
     * Structured snippet values violate editorial guidelines like punctuation.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES = 18;</code>
     */
    public static final int STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES_VALUE = 18;
    /**
     * <pre>
     * Structured snippet contain promotional text.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT = 19;</code>
     */
    public static final int STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT_VALUE = 19;


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
    public static FeedItemQualityDisapprovalReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FeedItemQualityDisapprovalReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PRICE_TABLE_REPETITIVE_HEADERS;
        case 3: return PRICE_TABLE_REPETITIVE_DESCRIPTION;
        case 4: return PRICE_TABLE_INCONSISTENT_ROWS;
        case 5: return PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS;
        case 6: return PRICE_UNSUPPORTED_LANGUAGE;
        case 7: return PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH;
        case 8: return PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT;
        case 9: return PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT;
        case 10: return PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT;
        case 11: return PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE;
        case 12: return PRICE_TABLE_ROW_UNRATEABLE;
        case 13: return PRICE_TABLE_ROW_PRICE_INVALID;
        case 14: return PRICE_TABLE_ROW_URL_INVALID;
        case 15: return PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE;
        case 16: return STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED;
        case 17: return STRUCTURED_SNIPPETS_REPEATED_VALUES;
        case 18: return STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES;
        case 19: return STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedItemQualityDisapprovalReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedItemQualityDisapprovalReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedItemQualityDisapprovalReason>() {
            public FeedItemQualityDisapprovalReason findValueByNumber(int number) {
              return FeedItemQualityDisapprovalReason.forNumber(number);
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
      return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedItemQualityDisapprovalReason[] VALUES = values();

    public static FeedItemQualityDisapprovalReason valueOf(
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

    private FeedItemQualityDisapprovalReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason)
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
    if (!(obj instanceof com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum other = (com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum) obj;

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

  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum prototype) {
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
   * Container for enum describing possible quality evaluation disapproval reasons
   * of a feed item.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)
      com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonProto.internal_static_google_ads_googleads_v11_enums_FeedItemQualityDisapprovalReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonProto.internal_static_google_ads_googleads_v11_enums_FeedItemQualityDisapprovalReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.class, com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.newBuilder()
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
      return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonProto.internal_static_google_ads_googleads_v11_enums_FeedItemQualityDisapprovalReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum build() {
      com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum buildPartial() {
      com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum result = new com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum other) {
      if (other == com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum)
  private static final com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum();
  }

  public static com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedItemQualityDisapprovalReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedItemQualityDisapprovalReasonEnum>() {
    @java.lang.Override
    public FeedItemQualityDisapprovalReasonEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedItemQualityDisapprovalReasonEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedItemQualityDisapprovalReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedItemQualityDisapprovalReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.enums.FeedItemQualityDisapprovalReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

