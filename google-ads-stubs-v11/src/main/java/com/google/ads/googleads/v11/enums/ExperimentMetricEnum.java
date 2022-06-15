// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/enums/experiment_metric.proto

package com.google.ads.googleads.v11.enums;

/**
 * <pre>
 * Container for enum describing the type of experiment metric.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.enums.ExperimentMetricEnum}
 */
public final class ExperimentMetricEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.enums.ExperimentMetricEnum)
    ExperimentMetricEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExperimentMetricEnum.newBuilder() to construct.
  private ExperimentMetricEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExperimentMetricEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExperimentMetricEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExperimentMetricEnum(
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
    return com.google.ads.googleads.v11.enums.ExperimentMetricProto.internal_static_google_ads_googleads_v11_enums_ExperimentMetricEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.enums.ExperimentMetricProto.internal_static_google_ads_googleads_v11_enums_ExperimentMetricEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.enums.ExperimentMetricEnum.class, com.google.ads.googleads.v11.enums.ExperimentMetricEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of experiment metric.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.enums.ExperimentMetricEnum.ExperimentMetric}
   */
  public enum ExperimentMetric
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
     * The goal of the experiment is clicks.
     * </pre>
     *
     * <code>CLICKS = 2;</code>
     */
    CLICKS(2),
    /**
     * <pre>
     * The goal of the experiment is impressions.
     * </pre>
     *
     * <code>IMPRESSIONS = 3;</code>
     */
    IMPRESSIONS(3),
    /**
     * <pre>
     * The goal of the experiment is cost.
     * </pre>
     *
     * <code>COST = 4;</code>
     */
    COST(4),
    /**
     * <pre>
     * The goal of the experiment is conversion rate.
     * </pre>
     *
     * <code>CONVERSIONS_PER_INTERACTION_RATE = 5;</code>
     */
    CONVERSIONS_PER_INTERACTION_RATE(5),
    /**
     * <pre>
     * The goal of the experiment is cost per conversion.
     * </pre>
     *
     * <code>COST_PER_CONVERSION = 6;</code>
     */
    COST_PER_CONVERSION(6),
    /**
     * <pre>
     * The goal of the experiment is conversion value per cost.
     * </pre>
     *
     * <code>CONVERSIONS_VALUE_PER_COST = 7;</code>
     */
    CONVERSIONS_VALUE_PER_COST(7),
    /**
     * <pre>
     * The goal of the experiment is avg cpc.
     * </pre>
     *
     * <code>AVERAGE_CPC = 8;</code>
     */
    AVERAGE_CPC(8),
    /**
     * <pre>
     * The goal of the experiment is ctr.
     * </pre>
     *
     * <code>CTR = 9;</code>
     */
    CTR(9),
    /**
     * <pre>
     * The goal of the experiment is incremental conversions.
     * </pre>
     *
     * <code>INCREMENTAL_CONVERSIONS = 10;</code>
     */
    INCREMENTAL_CONVERSIONS(10),
    /**
     * <pre>
     * The goal of the experiment is completed video views.
     * </pre>
     *
     * <code>COMPLETED_VIDEO_VIEWS = 11;</code>
     */
    COMPLETED_VIDEO_VIEWS(11),
    /**
     * <pre>
     * The goal of the experiment is custom algorithms.
     * </pre>
     *
     * <code>CUSTOM_ALGORITHMS = 12;</code>
     */
    CUSTOM_ALGORITHMS(12),
    /**
     * <pre>
     * The goal of the experiment is conversions.
     * </pre>
     *
     * <code>CONVERSIONS = 13;</code>
     */
    CONVERSIONS(13),
    /**
     * <pre>
     * The goal of the experiment is conversion value.
     * </pre>
     *
     * <code>CONVERSION_VALUE = 14;</code>
     */
    CONVERSION_VALUE(14),
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
     * The goal of the experiment is clicks.
     * </pre>
     *
     * <code>CLICKS = 2;</code>
     */
    public static final int CLICKS_VALUE = 2;
    /**
     * <pre>
     * The goal of the experiment is impressions.
     * </pre>
     *
     * <code>IMPRESSIONS = 3;</code>
     */
    public static final int IMPRESSIONS_VALUE = 3;
    /**
     * <pre>
     * The goal of the experiment is cost.
     * </pre>
     *
     * <code>COST = 4;</code>
     */
    public static final int COST_VALUE = 4;
    /**
     * <pre>
     * The goal of the experiment is conversion rate.
     * </pre>
     *
     * <code>CONVERSIONS_PER_INTERACTION_RATE = 5;</code>
     */
    public static final int CONVERSIONS_PER_INTERACTION_RATE_VALUE = 5;
    /**
     * <pre>
     * The goal of the experiment is cost per conversion.
     * </pre>
     *
     * <code>COST_PER_CONVERSION = 6;</code>
     */
    public static final int COST_PER_CONVERSION_VALUE = 6;
    /**
     * <pre>
     * The goal of the experiment is conversion value per cost.
     * </pre>
     *
     * <code>CONVERSIONS_VALUE_PER_COST = 7;</code>
     */
    public static final int CONVERSIONS_VALUE_PER_COST_VALUE = 7;
    /**
     * <pre>
     * The goal of the experiment is avg cpc.
     * </pre>
     *
     * <code>AVERAGE_CPC = 8;</code>
     */
    public static final int AVERAGE_CPC_VALUE = 8;
    /**
     * <pre>
     * The goal of the experiment is ctr.
     * </pre>
     *
     * <code>CTR = 9;</code>
     */
    public static final int CTR_VALUE = 9;
    /**
     * <pre>
     * The goal of the experiment is incremental conversions.
     * </pre>
     *
     * <code>INCREMENTAL_CONVERSIONS = 10;</code>
     */
    public static final int INCREMENTAL_CONVERSIONS_VALUE = 10;
    /**
     * <pre>
     * The goal of the experiment is completed video views.
     * </pre>
     *
     * <code>COMPLETED_VIDEO_VIEWS = 11;</code>
     */
    public static final int COMPLETED_VIDEO_VIEWS_VALUE = 11;
    /**
     * <pre>
     * The goal of the experiment is custom algorithms.
     * </pre>
     *
     * <code>CUSTOM_ALGORITHMS = 12;</code>
     */
    public static final int CUSTOM_ALGORITHMS_VALUE = 12;
    /**
     * <pre>
     * The goal of the experiment is conversions.
     * </pre>
     *
     * <code>CONVERSIONS = 13;</code>
     */
    public static final int CONVERSIONS_VALUE = 13;
    /**
     * <pre>
     * The goal of the experiment is conversion value.
     * </pre>
     *
     * <code>CONVERSION_VALUE = 14;</code>
     */
    public static final int CONVERSION_VALUE_VALUE = 14;


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
    public static ExperimentMetric valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExperimentMetric forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CLICKS;
        case 3: return IMPRESSIONS;
        case 4: return COST;
        case 5: return CONVERSIONS_PER_INTERACTION_RATE;
        case 6: return COST_PER_CONVERSION;
        case 7: return CONVERSIONS_VALUE_PER_COST;
        case 8: return AVERAGE_CPC;
        case 9: return CTR;
        case 10: return INCREMENTAL_CONVERSIONS;
        case 11: return COMPLETED_VIDEO_VIEWS;
        case 12: return CUSTOM_ALGORITHMS;
        case 13: return CONVERSIONS;
        case 14: return CONVERSION_VALUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExperimentMetric>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExperimentMetric> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExperimentMetric>() {
            public ExperimentMetric findValueByNumber(int number) {
              return ExperimentMetric.forNumber(number);
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
      return com.google.ads.googleads.v11.enums.ExperimentMetricEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExperimentMetric[] VALUES = values();

    public static ExperimentMetric valueOf(
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

    private ExperimentMetric(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.enums.ExperimentMetricEnum.ExperimentMetric)
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
    if (!(obj instanceof com.google.ads.googleads.v11.enums.ExperimentMetricEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.enums.ExperimentMetricEnum other = (com.google.ads.googleads.v11.enums.ExperimentMetricEnum) obj;

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

  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.enums.ExperimentMetricEnum prototype) {
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
   * Container for enum describing the type of experiment metric.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.enums.ExperimentMetricEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.enums.ExperimentMetricEnum)
      com.google.ads.googleads.v11.enums.ExperimentMetricEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.enums.ExperimentMetricProto.internal_static_google_ads_googleads_v11_enums_ExperimentMetricEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.enums.ExperimentMetricProto.internal_static_google_ads_googleads_v11_enums_ExperimentMetricEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.enums.ExperimentMetricEnum.class, com.google.ads.googleads.v11.enums.ExperimentMetricEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.enums.ExperimentMetricEnum.newBuilder()
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
      return com.google.ads.googleads.v11.enums.ExperimentMetricProto.internal_static_google_ads_googleads_v11_enums_ExperimentMetricEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ExperimentMetricEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.enums.ExperimentMetricEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ExperimentMetricEnum build() {
      com.google.ads.googleads.v11.enums.ExperimentMetricEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ExperimentMetricEnum buildPartial() {
      com.google.ads.googleads.v11.enums.ExperimentMetricEnum result = new com.google.ads.googleads.v11.enums.ExperimentMetricEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.enums.ExperimentMetricEnum) {
        return mergeFrom((com.google.ads.googleads.v11.enums.ExperimentMetricEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.enums.ExperimentMetricEnum other) {
      if (other == com.google.ads.googleads.v11.enums.ExperimentMetricEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v11.enums.ExperimentMetricEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.enums.ExperimentMetricEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.enums.ExperimentMetricEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.enums.ExperimentMetricEnum)
  private static final com.google.ads.googleads.v11.enums.ExperimentMetricEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.enums.ExperimentMetricEnum();
  }

  public static com.google.ads.googleads.v11.enums.ExperimentMetricEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExperimentMetricEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExperimentMetricEnum>() {
    @java.lang.Override
    public ExperimentMetricEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExperimentMetricEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExperimentMetricEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExperimentMetricEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.enums.ExperimentMetricEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

