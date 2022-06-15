// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/enums/app_campaign_bidding_strategy_goal_type.proto

package com.google.ads.googleads.v11.enums;

/**
 * <pre>
 * Container for enum describing goal towards which the bidding strategy of an
 * app campaign should optimize for.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum}
 */
public final class AppCampaignBiddingStrategyGoalTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)
    AppCampaignBiddingStrategyGoalTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppCampaignBiddingStrategyGoalTypeEnum.newBuilder() to construct.
  private AppCampaignBiddingStrategyGoalTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppCampaignBiddingStrategyGoalTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppCampaignBiddingStrategyGoalTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppCampaignBiddingStrategyGoalTypeEnum(
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
    return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeProto.internal_static_google_ads_googleads_v11_enums_AppCampaignBiddingStrategyGoalTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeProto.internal_static_google_ads_googleads_v11_enums_AppCampaignBiddingStrategyGoalTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.class, com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Goal type of App campaign BiddingStrategy.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.AppCampaignBiddingStrategyGoalType}
   */
  public enum AppCampaignBiddingStrategyGoalType
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
     * Aim to maximize the number of app installs. The cpa bid is the
     * target cost per install.
     * </pre>
     *
     * <code>OPTIMIZE_INSTALLS_TARGET_INSTALL_COST = 2;</code>
     */
    OPTIMIZE_INSTALLS_TARGET_INSTALL_COST(2),
    /**
     * <pre>
     * Aim to maximize the long term number of selected in-app conversions from
     * app installs. The cpa bid is the target cost per install.
     * </pre>
     *
     * <code>OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST = 3;</code>
     */
    OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST(3),
    /**
     * <pre>
     * Aim to maximize the long term number of selected in-app conversions from
     * app installs. The cpa bid is the target cost per in-app conversion. Note
     * that the actual cpa may seem higher than the target cpa at first, since
     * the long term conversions haven't happened yet.
     * </pre>
     *
     * <code>OPTIMIZE_IN_APP_CONVERSIONS_TARGET_CONVERSION_COST = 4;</code>
     */
    OPTIMIZE_IN_APP_CONVERSIONS_TARGET_CONVERSION_COST(4),
    /**
     * <pre>
     * Aim to maximize all conversions' value, i.e. install + selected in-app
     * conversions while achieving or exceeding target return on advertising
     * spend.
     * </pre>
     *
     * <code>OPTIMIZE_RETURN_ON_ADVERTISING_SPEND = 5;</code>
     */
    OPTIMIZE_RETURN_ON_ADVERTISING_SPEND(5),
    /**
     * <pre>
     * Aim to maximize the pre-registration of the app.
     * </pre>
     *
     * <code>OPTIMIZE_PRE_REGISTRATION_CONVERSION_VOLUME = 6;</code>
     */
    OPTIMIZE_PRE_REGISTRATION_CONVERSION_VOLUME(6),
    /**
     * <pre>
     * Aim to maximize installation of the app without target cost-per-install.
     * </pre>
     *
     * <code>OPTIMIZE_INSTALLS_WITHOUT_TARGET_INSTALL_COST = 7;</code>
     */
    OPTIMIZE_INSTALLS_WITHOUT_TARGET_INSTALL_COST(7),
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
     * Aim to maximize the number of app installs. The cpa bid is the
     * target cost per install.
     * </pre>
     *
     * <code>OPTIMIZE_INSTALLS_TARGET_INSTALL_COST = 2;</code>
     */
    public static final int OPTIMIZE_INSTALLS_TARGET_INSTALL_COST_VALUE = 2;
    /**
     * <pre>
     * Aim to maximize the long term number of selected in-app conversions from
     * app installs. The cpa bid is the target cost per install.
     * </pre>
     *
     * <code>OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST = 3;</code>
     */
    public static final int OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST_VALUE = 3;
    /**
     * <pre>
     * Aim to maximize the long term number of selected in-app conversions from
     * app installs. The cpa bid is the target cost per in-app conversion. Note
     * that the actual cpa may seem higher than the target cpa at first, since
     * the long term conversions haven't happened yet.
     * </pre>
     *
     * <code>OPTIMIZE_IN_APP_CONVERSIONS_TARGET_CONVERSION_COST = 4;</code>
     */
    public static final int OPTIMIZE_IN_APP_CONVERSIONS_TARGET_CONVERSION_COST_VALUE = 4;
    /**
     * <pre>
     * Aim to maximize all conversions' value, i.e. install + selected in-app
     * conversions while achieving or exceeding target return on advertising
     * spend.
     * </pre>
     *
     * <code>OPTIMIZE_RETURN_ON_ADVERTISING_SPEND = 5;</code>
     */
    public static final int OPTIMIZE_RETURN_ON_ADVERTISING_SPEND_VALUE = 5;
    /**
     * <pre>
     * Aim to maximize the pre-registration of the app.
     * </pre>
     *
     * <code>OPTIMIZE_PRE_REGISTRATION_CONVERSION_VOLUME = 6;</code>
     */
    public static final int OPTIMIZE_PRE_REGISTRATION_CONVERSION_VOLUME_VALUE = 6;
    /**
     * <pre>
     * Aim to maximize installation of the app without target cost-per-install.
     * </pre>
     *
     * <code>OPTIMIZE_INSTALLS_WITHOUT_TARGET_INSTALL_COST = 7;</code>
     */
    public static final int OPTIMIZE_INSTALLS_WITHOUT_TARGET_INSTALL_COST_VALUE = 7;


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
    public static AppCampaignBiddingStrategyGoalType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AppCampaignBiddingStrategyGoalType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return OPTIMIZE_INSTALLS_TARGET_INSTALL_COST;
        case 3: return OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST;
        case 4: return OPTIMIZE_IN_APP_CONVERSIONS_TARGET_CONVERSION_COST;
        case 5: return OPTIMIZE_RETURN_ON_ADVERTISING_SPEND;
        case 6: return OPTIMIZE_PRE_REGISTRATION_CONVERSION_VOLUME;
        case 7: return OPTIMIZE_INSTALLS_WITHOUT_TARGET_INSTALL_COST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AppCampaignBiddingStrategyGoalType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AppCampaignBiddingStrategyGoalType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AppCampaignBiddingStrategyGoalType>() {
            public AppCampaignBiddingStrategyGoalType findValueByNumber(int number) {
              return AppCampaignBiddingStrategyGoalType.forNumber(number);
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
      return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AppCampaignBiddingStrategyGoalType[] VALUES = values();

    public static AppCampaignBiddingStrategyGoalType valueOf(
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

    private AppCampaignBiddingStrategyGoalType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.AppCampaignBiddingStrategyGoalType)
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
    if (!(obj instanceof com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum other = (com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum) obj;

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

  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum prototype) {
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
   * Container for enum describing goal towards which the bidding strategy of an
   * app campaign should optimize for.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)
      com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeProto.internal_static_google_ads_googleads_v11_enums_AppCampaignBiddingStrategyGoalTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeProto.internal_static_google_ads_googleads_v11_enums_AppCampaignBiddingStrategyGoalTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.class, com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeProto.internal_static_google_ads_googleads_v11_enums_AppCampaignBiddingStrategyGoalTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum build() {
      com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum buildPartial() {
      com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum result = new com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum other) {
      if (other == com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum)
  private static final com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum();
  }

  public static com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppCampaignBiddingStrategyGoalTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AppCampaignBiddingStrategyGoalTypeEnum>() {
    @java.lang.Override
    public AppCampaignBiddingStrategyGoalTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppCampaignBiddingStrategyGoalTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppCampaignBiddingStrategyGoalTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppCampaignBiddingStrategyGoalTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.enums.AppCampaignBiddingStrategyGoalTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

