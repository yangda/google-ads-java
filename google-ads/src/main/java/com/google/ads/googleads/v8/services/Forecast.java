// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/reach_plan_service.proto

package com.google.ads.googleads.v8.services;

/**
 * <pre>
 * Forecasted traffic metrics for the planned products and targeting.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.services.Forecast}
 */
public final class Forecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.services.Forecast)
    ForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Forecast.newBuilder() to construct.
  private Forecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Forecast() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Forecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Forecast(
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
          case 40: {
            bitField0_ |= 0x00000001;
            onTargetReach_ = input.readInt64();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000002;
            totalReach_ = input.readInt64();
            break;
          }
          case 56: {
            bitField0_ |= 0x00000004;
            onTargetImpressions_ = input.readInt64();
            break;
          }
          case 64: {
            bitField0_ |= 0x00000008;
            totalImpressions_ = input.readInt64();
            break;
          }
          case 72: {
            bitField0_ |= 0x00000010;
            viewableImpressions_ = input.readInt64();
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
    return com.google.ads.googleads.v8.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v8_services_Forecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v8_services_Forecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.services.Forecast.class, com.google.ads.googleads.v8.services.Forecast.Builder.class);
  }

  private int bitField0_;
  public static final int ON_TARGET_REACH_FIELD_NUMBER = 5;
  private long onTargetReach_;
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_reach = 5;</code>
   * @return Whether the onTargetReach field is set.
   */
  @java.lang.Override
  public boolean hasOnTargetReach() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_reach = 5;</code>
   * @return The onTargetReach.
   */
  @java.lang.Override
  public long getOnTargetReach() {
    return onTargetReach_;
  }

  public static final int TOTAL_REACH_FIELD_NUMBER = 6;
  private long totalReach_;
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>int64 total_reach = 6;</code>
   * @return Whether the totalReach field is set.
   */
  @java.lang.Override
  public boolean hasTotalReach() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>int64 total_reach = 6;</code>
   * @return The totalReach.
   */
  @java.lang.Override
  public long getTotalReach() {
    return totalReach_;
  }

  public static final int ON_TARGET_IMPRESSIONS_FIELD_NUMBER = 7;
  private long onTargetImpressions_;
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_impressions = 7;</code>
   * @return Whether the onTargetImpressions field is set.
   */
  @java.lang.Override
  public boolean hasOnTargetImpressions() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_impressions = 7;</code>
   * @return The onTargetImpressions.
   */
  @java.lang.Override
  public long getOnTargetImpressions() {
    return onTargetImpressions_;
  }

  public static final int TOTAL_IMPRESSIONS_FIELD_NUMBER = 8;
  private long totalImpressions_;
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>int64 total_impressions = 8;</code>
   * @return Whether the totalImpressions field is set.
   */
  @java.lang.Override
  public boolean hasTotalImpressions() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>int64 total_impressions = 8;</code>
   * @return The totalImpressions.
   */
  @java.lang.Override
  public long getTotalImpressions() {
    return totalImpressions_;
  }

  public static final int VIEWABLE_IMPRESSIONS_FIELD_NUMBER = 9;
  private long viewableImpressions_;
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>int64 viewable_impressions = 9;</code>
   * @return Whether the viewableImpressions field is set.
   */
  @java.lang.Override
  public boolean hasViewableImpressions() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>int64 viewable_impressions = 9;</code>
   * @return The viewableImpressions.
   */
  @java.lang.Override
  public long getViewableImpressions() {
    return viewableImpressions_;
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
      output.writeInt64(5, onTargetReach_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(6, totalReach_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(7, onTargetImpressions_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(8, totalImpressions_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(9, viewableImpressions_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, onTargetReach_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, totalReach_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, onTargetImpressions_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, totalImpressions_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, viewableImpressions_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.services.Forecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.services.Forecast other = (com.google.ads.googleads.v8.services.Forecast) obj;

    if (hasOnTargetReach() != other.hasOnTargetReach()) return false;
    if (hasOnTargetReach()) {
      if (getOnTargetReach()
          != other.getOnTargetReach()) return false;
    }
    if (hasTotalReach() != other.hasTotalReach()) return false;
    if (hasTotalReach()) {
      if (getTotalReach()
          != other.getTotalReach()) return false;
    }
    if (hasOnTargetImpressions() != other.hasOnTargetImpressions()) return false;
    if (hasOnTargetImpressions()) {
      if (getOnTargetImpressions()
          != other.getOnTargetImpressions()) return false;
    }
    if (hasTotalImpressions() != other.hasTotalImpressions()) return false;
    if (hasTotalImpressions()) {
      if (getTotalImpressions()
          != other.getTotalImpressions()) return false;
    }
    if (hasViewableImpressions() != other.hasViewableImpressions()) return false;
    if (hasViewableImpressions()) {
      if (getViewableImpressions()
          != other.getViewableImpressions()) return false;
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
    if (hasOnTargetReach()) {
      hash = (37 * hash) + ON_TARGET_REACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOnTargetReach());
    }
    if (hasTotalReach()) {
      hash = (37 * hash) + TOTAL_REACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalReach());
    }
    if (hasOnTargetImpressions()) {
      hash = (37 * hash) + ON_TARGET_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOnTargetImpressions());
    }
    if (hasTotalImpressions()) {
      hash = (37 * hash) + TOTAL_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalImpressions());
    }
    if (hasViewableImpressions()) {
      hash = (37 * hash) + VIEWABLE_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getViewableImpressions());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.Forecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.services.Forecast prototype) {
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
   * Forecasted traffic metrics for the planned products and targeting.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.services.Forecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.services.Forecast)
      com.google.ads.googleads.v8.services.ForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v8_services_Forecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v8_services_Forecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.services.Forecast.class, com.google.ads.googleads.v8.services.Forecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.services.Forecast.newBuilder()
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
      onTargetReach_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      totalReach_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      onTargetImpressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      totalImpressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      viewableImpressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v8_services_Forecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.Forecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.services.Forecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.Forecast build() {
      com.google.ads.googleads.v8.services.Forecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.Forecast buildPartial() {
      com.google.ads.googleads.v8.services.Forecast result = new com.google.ads.googleads.v8.services.Forecast(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.onTargetReach_ = onTargetReach_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalReach_ = totalReach_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.onTargetImpressions_ = onTargetImpressions_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.totalImpressions_ = totalImpressions_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.viewableImpressions_ = viewableImpressions_;
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof com.google.ads.googleads.v8.services.Forecast) {
        return mergeFrom((com.google.ads.googleads.v8.services.Forecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.services.Forecast other) {
      if (other == com.google.ads.googleads.v8.services.Forecast.getDefaultInstance()) return this;
      if (other.hasOnTargetReach()) {
        setOnTargetReach(other.getOnTargetReach());
      }
      if (other.hasTotalReach()) {
        setTotalReach(other.getTotalReach());
      }
      if (other.hasOnTargetImpressions()) {
        setOnTargetImpressions(other.getOnTargetImpressions());
      }
      if (other.hasTotalImpressions()) {
        setTotalImpressions(other.getTotalImpressions());
      }
      if (other.hasViewableImpressions()) {
        setViewableImpressions(other.getViewableImpressions());
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
      com.google.ads.googleads.v8.services.Forecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.services.Forecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long onTargetReach_ ;
    /**
     * <pre>
     * Number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times that exactly
     * matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_reach = 5;</code>
     * @return Whether the onTargetReach field is set.
     */
    @java.lang.Override
    public boolean hasOnTargetReach() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times that exactly
     * matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_reach = 5;</code>
     * @return The onTargetReach.
     */
    @java.lang.Override
    public long getOnTargetReach() {
      return onTargetReach_;
    }
    /**
     * <pre>
     * Number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times that exactly
     * matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_reach = 5;</code>
     * @param value The onTargetReach to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetReach(long value) {
      bitField0_ |= 0x00000001;
      onTargetReach_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times that exactly
     * matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_reach = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetReach() {
      bitField0_ = (bitField0_ & ~0x00000001);
      onTargetReach_ = 0L;
      onChanged();
      return this;
    }

    private long totalReach_ ;
    /**
     * <pre>
     * Total number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times. This includes
     * people that may fall outside the specified Targeting.
     * </pre>
     *
     * <code>int64 total_reach = 6;</code>
     * @return Whether the totalReach field is set.
     */
    @java.lang.Override
    public boolean hasTotalReach() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Total number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times. This includes
     * people that may fall outside the specified Targeting.
     * </pre>
     *
     * <code>int64 total_reach = 6;</code>
     * @return The totalReach.
     */
    @java.lang.Override
    public long getTotalReach() {
      return totalReach_;
    }
    /**
     * <pre>
     * Total number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times. This includes
     * people that may fall outside the specified Targeting.
     * </pre>
     *
     * <code>int64 total_reach = 6;</code>
     * @param value The totalReach to set.
     * @return This builder for chaining.
     */
    public Builder setTotalReach(long value) {
      bitField0_ |= 0x00000002;
      totalReach_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of unique people reached at least
     * GenerateReachForecastRequest.min_effective_frequency times. This includes
     * people that may fall outside the specified Targeting.
     * </pre>
     *
     * <code>int64 total_reach = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalReach() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalReach_ = 0L;
      onChanged();
      return this;
    }

    private long onTargetImpressions_ ;
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 7;</code>
     * @return Whether the onTargetImpressions field is set.
     */
    @java.lang.Override
    public boolean hasOnTargetImpressions() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 7;</code>
     * @return The onTargetImpressions.
     */
    @java.lang.Override
    public long getOnTargetImpressions() {
      return onTargetImpressions_;
    }
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 7;</code>
     * @param value The onTargetImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetImpressions(long value) {
      bitField0_ |= 0x00000004;
      onTargetImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetImpressions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      onTargetImpressions_ = 0L;
      onChanged();
      return this;
    }

    private long totalImpressions_ ;
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 8;</code>
     * @return Whether the totalImpressions field is set.
     */
    @java.lang.Override
    public boolean hasTotalImpressions() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 8;</code>
     * @return The totalImpressions.
     */
    @java.lang.Override
    public long getTotalImpressions() {
      return totalImpressions_;
    }
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 8;</code>
     * @param value The totalImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setTotalImpressions(long value) {
      bitField0_ |= 0x00000008;
      totalImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalImpressions() {
      bitField0_ = (bitField0_ & ~0x00000008);
      totalImpressions_ = 0L;
      onChanged();
      return this;
    }

    private long viewableImpressions_ ;
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>int64 viewable_impressions = 9;</code>
     * @return Whether the viewableImpressions field is set.
     */
    @java.lang.Override
    public boolean hasViewableImpressions() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>int64 viewable_impressions = 9;</code>
     * @return The viewableImpressions.
     */
    @java.lang.Override
    public long getViewableImpressions() {
      return viewableImpressions_;
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>int64 viewable_impressions = 9;</code>
     * @param value The viewableImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setViewableImpressions(long value) {
      bitField0_ |= 0x00000010;
      viewableImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>int64 viewable_impressions = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewableImpressions() {
      bitField0_ = (bitField0_ & ~0x00000010);
      viewableImpressions_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.services.Forecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.Forecast)
  private static final com.google.ads.googleads.v8.services.Forecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.services.Forecast();
  }

  public static com.google.ads.googleads.v8.services.Forecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Forecast>
      PARSER = new com.google.protobuf.AbstractParser<Forecast>() {
    @java.lang.Override
    public Forecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Forecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Forecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Forecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.services.Forecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

