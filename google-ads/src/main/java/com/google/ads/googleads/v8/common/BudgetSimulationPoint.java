// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/simulation.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * Projected metrics for a specific budget amount.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.BudgetSimulationPoint}
 */
public final class BudgetSimulationPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.BudgetSimulationPoint)
    BudgetSimulationPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BudgetSimulationPoint.newBuilder() to construct.
  private BudgetSimulationPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BudgetSimulationPoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BudgetSimulationPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BudgetSimulationPoint(
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
          case 8: {

            budgetAmountMicros_ = input.readInt64();
            break;
          }
          case 16: {

            requiredCpcBidCeilingMicros_ = input.readInt64();
            break;
          }
          case 25: {

            biddableConversions_ = input.readDouble();
            break;
          }
          case 33: {

            biddableConversionsValue_ = input.readDouble();
            break;
          }
          case 40: {

            clicks_ = input.readInt64();
            break;
          }
          case 48: {

            costMicros_ = input.readInt64();
            break;
          }
          case 56: {

            impressions_ = input.readInt64();
            break;
          }
          case 64: {

            topSlotImpressions_ = input.readInt64();
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
    return com.google.ads.googleads.v8.common.SimulationProto.internal_static_google_ads_googleads_v8_common_BudgetSimulationPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.SimulationProto.internal_static_google_ads_googleads_v8_common_BudgetSimulationPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.BudgetSimulationPoint.class, com.google.ads.googleads.v8.common.BudgetSimulationPoint.Builder.class);
  }

  public static final int BUDGET_AMOUNT_MICROS_FIELD_NUMBER = 1;
  private long budgetAmountMicros_;
  /**
   * <pre>
   * The simulated budget upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 budget_amount_micros = 1;</code>
   * @return The budgetAmountMicros.
   */
  @java.lang.Override
  public long getBudgetAmountMicros() {
    return budgetAmountMicros_;
  }

  public static final int REQUIRED_CPC_BID_CEILING_MICROS_FIELD_NUMBER = 2;
  private long requiredCpcBidCeilingMicros_;
  /**
   * <pre>
   * Projected required daily cpc bid ceiling that the advertiser must set to
   * realize this simulation, in micros of the advertiser currency.
   * Only campaigns with the Target Spend bidding strategy support this field.
   * </pre>
   *
   * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
   * @return The requiredCpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getRequiredCpcBidCeilingMicros() {
    return requiredCpcBidCeilingMicros_;
  }

  public static final int BIDDABLE_CONVERSIONS_FIELD_NUMBER = 3;
  private double biddableConversions_;
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 3;</code>
   * @return The biddableConversions.
   */
  @java.lang.Override
  public double getBiddableConversions() {
    return biddableConversions_;
  }

  public static final int BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER = 4;
  private double biddableConversionsValue_;
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 4;</code>
   * @return The biddableConversionsValue.
   */
  @java.lang.Override
  public double getBiddableConversionsValue() {
    return biddableConversionsValue_;
  }

  public static final int CLICKS_FIELD_NUMBER = 5;
  private long clicks_;
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 5;</code>
   * @return The clicks.
   */
  @java.lang.Override
  public long getClicks() {
    return clicks_;
  }

  public static final int COST_MICROS_FIELD_NUMBER = 6;
  private long costMicros_;
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 6;</code>
   * @return The costMicros.
   */
  @java.lang.Override
  public long getCostMicros() {
    return costMicros_;
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 7;
  private long impressions_;
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 7;</code>
   * @return The impressions.
   */
  @java.lang.Override
  public long getImpressions() {
    return impressions_;
  }

  public static final int TOP_SLOT_IMPRESSIONS_FIELD_NUMBER = 8;
  private long topSlotImpressions_;
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 8;</code>
   * @return The topSlotImpressions.
   */
  @java.lang.Override
  public long getTopSlotImpressions() {
    return topSlotImpressions_;
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
    if (budgetAmountMicros_ != 0L) {
      output.writeInt64(1, budgetAmountMicros_);
    }
    if (requiredCpcBidCeilingMicros_ != 0L) {
      output.writeInt64(2, requiredCpcBidCeilingMicros_);
    }
    if (biddableConversions_ != 0D) {
      output.writeDouble(3, biddableConversions_);
    }
    if (biddableConversionsValue_ != 0D) {
      output.writeDouble(4, biddableConversionsValue_);
    }
    if (clicks_ != 0L) {
      output.writeInt64(5, clicks_);
    }
    if (costMicros_ != 0L) {
      output.writeInt64(6, costMicros_);
    }
    if (impressions_ != 0L) {
      output.writeInt64(7, impressions_);
    }
    if (topSlotImpressions_ != 0L) {
      output.writeInt64(8, topSlotImpressions_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (budgetAmountMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, budgetAmountMicros_);
    }
    if (requiredCpcBidCeilingMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, requiredCpcBidCeilingMicros_);
    }
    if (biddableConversions_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, biddableConversions_);
    }
    if (biddableConversionsValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, biddableConversionsValue_);
    }
    if (clicks_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, clicks_);
    }
    if (costMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, costMicros_);
    }
    if (impressions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, impressions_);
    }
    if (topSlotImpressions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, topSlotImpressions_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.common.BudgetSimulationPoint)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.BudgetSimulationPoint other = (com.google.ads.googleads.v8.common.BudgetSimulationPoint) obj;

    if (getBudgetAmountMicros()
        != other.getBudgetAmountMicros()) return false;
    if (getRequiredCpcBidCeilingMicros()
        != other.getRequiredCpcBidCeilingMicros()) return false;
    if (java.lang.Double.doubleToLongBits(getBiddableConversions())
        != java.lang.Double.doubleToLongBits(
            other.getBiddableConversions())) return false;
    if (java.lang.Double.doubleToLongBits(getBiddableConversionsValue())
        != java.lang.Double.doubleToLongBits(
            other.getBiddableConversionsValue())) return false;
    if (getClicks()
        != other.getClicks()) return false;
    if (getCostMicros()
        != other.getCostMicros()) return false;
    if (getImpressions()
        != other.getImpressions()) return false;
    if (getTopSlotImpressions()
        != other.getTopSlotImpressions()) return false;
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
    hash = (37 * hash) + BUDGET_AMOUNT_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBudgetAmountMicros());
    hash = (37 * hash) + REQUIRED_CPC_BID_CEILING_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequiredCpcBidCeilingMicros());
    hash = (37 * hash) + BIDDABLE_CONVERSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBiddableConversions()));
    hash = (37 * hash) + BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBiddableConversionsValue()));
    hash = (37 * hash) + CLICKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClicks());
    hash = (37 * hash) + COST_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCostMicros());
    hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getImpressions());
    hash = (37 * hash) + TOP_SLOT_IMPRESSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopSlotImpressions());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.common.BudgetSimulationPoint prototype) {
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
   * Projected metrics for a specific budget amount.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.BudgetSimulationPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.BudgetSimulationPoint)
      com.google.ads.googleads.v8.common.BudgetSimulationPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.SimulationProto.internal_static_google_ads_googleads_v8_common_BudgetSimulationPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.SimulationProto.internal_static_google_ads_googleads_v8_common_BudgetSimulationPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.BudgetSimulationPoint.class, com.google.ads.googleads.v8.common.BudgetSimulationPoint.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.BudgetSimulationPoint.newBuilder()
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
      budgetAmountMicros_ = 0L;

      requiredCpcBidCeilingMicros_ = 0L;

      biddableConversions_ = 0D;

      biddableConversionsValue_ = 0D;

      clicks_ = 0L;

      costMicros_ = 0L;

      impressions_ = 0L;

      topSlotImpressions_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.SimulationProto.internal_static_google_ads_googleads_v8_common_BudgetSimulationPoint_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.BudgetSimulationPoint getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.BudgetSimulationPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.BudgetSimulationPoint build() {
      com.google.ads.googleads.v8.common.BudgetSimulationPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.BudgetSimulationPoint buildPartial() {
      com.google.ads.googleads.v8.common.BudgetSimulationPoint result = new com.google.ads.googleads.v8.common.BudgetSimulationPoint(this);
      result.budgetAmountMicros_ = budgetAmountMicros_;
      result.requiredCpcBidCeilingMicros_ = requiredCpcBidCeilingMicros_;
      result.biddableConversions_ = biddableConversions_;
      result.biddableConversionsValue_ = biddableConversionsValue_;
      result.clicks_ = clicks_;
      result.costMicros_ = costMicros_;
      result.impressions_ = impressions_;
      result.topSlotImpressions_ = topSlotImpressions_;
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
      if (other instanceof com.google.ads.googleads.v8.common.BudgetSimulationPoint) {
        return mergeFrom((com.google.ads.googleads.v8.common.BudgetSimulationPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.BudgetSimulationPoint other) {
      if (other == com.google.ads.googleads.v8.common.BudgetSimulationPoint.getDefaultInstance()) return this;
      if (other.getBudgetAmountMicros() != 0L) {
        setBudgetAmountMicros(other.getBudgetAmountMicros());
      }
      if (other.getRequiredCpcBidCeilingMicros() != 0L) {
        setRequiredCpcBidCeilingMicros(other.getRequiredCpcBidCeilingMicros());
      }
      if (other.getBiddableConversions() != 0D) {
        setBiddableConversions(other.getBiddableConversions());
      }
      if (other.getBiddableConversionsValue() != 0D) {
        setBiddableConversionsValue(other.getBiddableConversionsValue());
      }
      if (other.getClicks() != 0L) {
        setClicks(other.getClicks());
      }
      if (other.getCostMicros() != 0L) {
        setCostMicros(other.getCostMicros());
      }
      if (other.getImpressions() != 0L) {
        setImpressions(other.getImpressions());
      }
      if (other.getTopSlotImpressions() != 0L) {
        setTopSlotImpressions(other.getTopSlotImpressions());
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
      com.google.ads.googleads.v8.common.BudgetSimulationPoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.BudgetSimulationPoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long budgetAmountMicros_ ;
    /**
     * <pre>
     * The simulated budget upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 budget_amount_micros = 1;</code>
     * @return The budgetAmountMicros.
     */
    @java.lang.Override
    public long getBudgetAmountMicros() {
      return budgetAmountMicros_;
    }
    /**
     * <pre>
     * The simulated budget upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 budget_amount_micros = 1;</code>
     * @param value The budgetAmountMicros to set.
     * @return This builder for chaining.
     */
    public Builder setBudgetAmountMicros(long value) {
      
      budgetAmountMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The simulated budget upon which projected metrics are based.
     * </pre>
     *
     * <code>int64 budget_amount_micros = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBudgetAmountMicros() {
      
      budgetAmountMicros_ = 0L;
      onChanged();
      return this;
    }

    private long requiredCpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Projected required daily cpc bid ceiling that the advertiser must set to
     * realize this simulation, in micros of the advertiser currency.
     * Only campaigns with the Target Spend bidding strategy support this field.
     * </pre>
     *
     * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
     * @return The requiredCpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getRequiredCpcBidCeilingMicros() {
      return requiredCpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Projected required daily cpc bid ceiling that the advertiser must set to
     * realize this simulation, in micros of the advertiser currency.
     * Only campaigns with the Target Spend bidding strategy support this field.
     * </pre>
     *
     * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
     * @param value The requiredCpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredCpcBidCeilingMicros(long value) {
      
      requiredCpcBidCeilingMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected required daily cpc bid ceiling that the advertiser must set to
     * realize this simulation, in micros of the advertiser currency.
     * Only campaigns with the Target Spend bidding strategy support this field.
     * </pre>
     *
     * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequiredCpcBidCeilingMicros() {
      
      requiredCpcBidCeilingMicros_ = 0L;
      onChanged();
      return this;
    }

    private double biddableConversions_ ;
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 3;</code>
     * @return The biddableConversions.
     */
    @java.lang.Override
    public double getBiddableConversions() {
      return biddableConversions_;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 3;</code>
     * @param value The biddableConversions to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversions(double value) {
      
      biddableConversions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversions() {
      
      biddableConversions_ = 0D;
      onChanged();
      return this;
    }

    private double biddableConversionsValue_ ;
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 4;</code>
     * @return The biddableConversionsValue.
     */
    @java.lang.Override
    public double getBiddableConversionsValue() {
      return biddableConversionsValue_;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 4;</code>
     * @param value The biddableConversionsValue to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversionsValue(double value) {
      
      biddableConversionsValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions.
     * </pre>
     *
     * <code>double biddable_conversions_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversionsValue() {
      
      biddableConversionsValue_ = 0D;
      onChanged();
      return this;
    }

    private long clicks_ ;
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 5;</code>
     * @return The clicks.
     */
    @java.lang.Override
    public long getClicks() {
      return clicks_;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 5;</code>
     * @param value The clicks to set.
     * @return This builder for chaining.
     */
    public Builder setClicks(long value) {
      
      clicks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>int64 clicks = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicks() {
      
      clicks_ = 0L;
      onChanged();
      return this;
    }

    private long costMicros_ ;
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 6;</code>
     * @return The costMicros.
     */
    @java.lang.Override
    public long getCostMicros() {
      return costMicros_;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 6;</code>
     * @param value The costMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCostMicros(long value) {
      
      costMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>int64 cost_micros = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCostMicros() {
      
      costMicros_ = 0L;
      onChanged();
      return this;
    }

    private long impressions_ ;
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 7;</code>
     * @return The impressions.
     */
    @java.lang.Override
    public long getImpressions() {
      return impressions_;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 7;</code>
     * @param value The impressions to set.
     * @return This builder for chaining.
     */
    public Builder setImpressions(long value) {
      
      impressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>int64 impressions = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearImpressions() {
      
      impressions_ = 0L;
      onChanged();
      return this;
    }

    private long topSlotImpressions_ ;
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 8;</code>
     * @return The topSlotImpressions.
     */
    @java.lang.Override
    public long getTopSlotImpressions() {
      return topSlotImpressions_;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 8;</code>
     * @param value The topSlotImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setTopSlotImpressions(long value) {
      
      topSlotImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * Only search advertising channel type supports this field.
     * </pre>
     *
     * <code>int64 top_slot_impressions = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopSlotImpressions() {
      
      topSlotImpressions_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.BudgetSimulationPoint)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.BudgetSimulationPoint)
  private static final com.google.ads.googleads.v8.common.BudgetSimulationPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.BudgetSimulationPoint();
  }

  public static com.google.ads.googleads.v8.common.BudgetSimulationPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BudgetSimulationPoint>
      PARSER = new com.google.protobuf.AbstractParser<BudgetSimulationPoint>() {
    @java.lang.Override
    public BudgetSimulationPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BudgetSimulationPoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BudgetSimulationPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BudgetSimulationPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.BudgetSimulationPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

