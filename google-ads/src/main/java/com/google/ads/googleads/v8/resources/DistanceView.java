// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/distance_view.proto

package com.google.ads.googleads.v8.resources;

/**
 * <pre>
 * A distance view with metrics aggregated by the user's distance from an
 * advertiser's location extensions. Each DistanceBucket includes all
 * impressions that fall within its distance and a single impression will
 * contribute to the metrics for all DistanceBuckets that include the user's
 * distance.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.resources.DistanceView}
 */
public final class DistanceView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.resources.DistanceView)
    DistanceViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DistanceView.newBuilder() to construct.
  private DistanceView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DistanceView() {
    resourceName_ = "";
    distanceBucket_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DistanceView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DistanceView(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            distanceBucket_ = rawValue;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000001;
            metricSystem_ = input.readBool();
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
    return com.google.ads.googleads.v8.resources.DistanceViewProto.internal_static_google_ads_googleads_v8_resources_DistanceView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.resources.DistanceViewProto.internal_static_google_ads_googleads_v8_resources_DistanceView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.resources.DistanceView.class, com.google.ads.googleads.v8.resources.DistanceView.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the distance view.
   * Distance view resource names have the form:
   * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The resource name of the distance view.
   * Distance view resource names have the form:
   * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISTANCE_BUCKET_FIELD_NUMBER = 2;
  private int distanceBucket_;
  /**
   * <pre>
   * Output only. Grouping of user distance from location extensions.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for distanceBucket.
   */
  @java.lang.Override public int getDistanceBucketValue() {
    return distanceBucket_;
  }
  /**
   * <pre>
   * Output only. Grouping of user distance from location extensions.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The distanceBucket.
   */
  @java.lang.Override public com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket getDistanceBucket() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket result = com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.valueOf(distanceBucket_);
    return result == null ? com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.UNRECOGNIZED : result;
  }

  public static final int METRIC_SYSTEM_FIELD_NUMBER = 4;
  private boolean metricSystem_;
  /**
   * <pre>
   * Output only. True if the DistanceBucket is using the metric system, false otherwise.
   * </pre>
   *
   * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metricSystem field is set.
   */
  @java.lang.Override
  public boolean hasMetricSystem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. True if the DistanceBucket is using the metric system, false otherwise.
   * </pre>
   *
   * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metricSystem.
   */
  @java.lang.Override
  public boolean getMetricSystem() {
    return metricSystem_;
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (distanceBucket_ != com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, distanceBucket_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(4, metricSystem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (distanceBucket_ != com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, distanceBucket_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, metricSystem_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.resources.DistanceView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.resources.DistanceView other = (com.google.ads.googleads.v8.resources.DistanceView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (distanceBucket_ != other.distanceBucket_) return false;
    if (hasMetricSystem() != other.hasMetricSystem()) return false;
    if (hasMetricSystem()) {
      if (getMetricSystem()
          != other.getMetricSystem()) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + DISTANCE_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + distanceBucket_;
    if (hasMetricSystem()) {
      hash = (37 * hash) + METRIC_SYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMetricSystem());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.DistanceView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.resources.DistanceView prototype) {
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
   * A distance view with metrics aggregated by the user's distance from an
   * advertiser's location extensions. Each DistanceBucket includes all
   * impressions that fall within its distance and a single impression will
   * contribute to the metrics for all DistanceBuckets that include the user's
   * distance.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.resources.DistanceView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.resources.DistanceView)
      com.google.ads.googleads.v8.resources.DistanceViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.resources.DistanceViewProto.internal_static_google_ads_googleads_v8_resources_DistanceView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.resources.DistanceViewProto.internal_static_google_ads_googleads_v8_resources_DistanceView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.resources.DistanceView.class, com.google.ads.googleads.v8.resources.DistanceView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.resources.DistanceView.newBuilder()
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
      resourceName_ = "";

      distanceBucket_ = 0;

      metricSystem_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.resources.DistanceViewProto.internal_static_google_ads_googleads_v8_resources_DistanceView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.DistanceView getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.resources.DistanceView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.DistanceView build() {
      com.google.ads.googleads.v8.resources.DistanceView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.DistanceView buildPartial() {
      com.google.ads.googleads.v8.resources.DistanceView result = new com.google.ads.googleads.v8.resources.DistanceView(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      result.distanceBucket_ = distanceBucket_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricSystem_ = metricSystem_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v8.resources.DistanceView) {
        return mergeFrom((com.google.ads.googleads.v8.resources.DistanceView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.resources.DistanceView other) {
      if (other == com.google.ads.googleads.v8.resources.DistanceView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.distanceBucket_ != 0) {
        setDistanceBucketValue(other.getDistanceBucketValue());
      }
      if (other.hasMetricSystem()) {
        setMetricSystem(other.getMetricSystem());
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
      com.google.ads.googleads.v8.resources.DistanceView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.resources.DistanceView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the distance view.
     * Distance view resource names have the form:
     * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the distance view.
     * Distance view resource names have the form:
     * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the distance view.
     * Distance view resource names have the form:
     * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the distance view.
     * Distance view resource names have the form:
     * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the distance view.
     * Distance view resource names have the form:
     * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private int distanceBucket_ = 0;
    /**
     * <pre>
     * Output only. Grouping of user distance from location extensions.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for distanceBucket.
     */
    @java.lang.Override public int getDistanceBucketValue() {
      return distanceBucket_;
    }
    /**
     * <pre>
     * Output only. Grouping of user distance from location extensions.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for distanceBucket to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceBucketValue(int value) {
      
      distanceBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Grouping of user distance from location extensions.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The distanceBucket.
     */
    @java.lang.Override
    public com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket getDistanceBucket() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket result = com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.valueOf(distanceBucket_);
      return result == null ? com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Grouping of user distance from location extensions.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The distanceBucket to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceBucket(com.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      distanceBucket_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Grouping of user distance from location extensions.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceBucket() {
      
      distanceBucket_ = 0;
      onChanged();
      return this;
    }

    private boolean metricSystem_ ;
    /**
     * <pre>
     * Output only. True if the DistanceBucket is using the metric system, false otherwise.
     * </pre>
     *
     * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the metricSystem field is set.
     */
    @java.lang.Override
    public boolean hasMetricSystem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. True if the DistanceBucket is using the metric system, false otherwise.
     * </pre>
     *
     * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The metricSystem.
     */
    @java.lang.Override
    public boolean getMetricSystem() {
      return metricSystem_;
    }
    /**
     * <pre>
     * Output only. True if the DistanceBucket is using the metric system, false otherwise.
     * </pre>
     *
     * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The metricSystem to set.
     * @return This builder for chaining.
     */
    public Builder setMetricSystem(boolean value) {
      bitField0_ |= 0x00000001;
      metricSystem_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. True if the DistanceBucket is using the metric system, false otherwise.
     * </pre>
     *
     * <code>bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricSystem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricSystem_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.resources.DistanceView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.DistanceView)
  private static final com.google.ads.googleads.v8.resources.DistanceView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.resources.DistanceView();
  }

  public static com.google.ads.googleads.v8.resources.DistanceView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DistanceView>
      PARSER = new com.google.protobuf.AbstractParser<DistanceView>() {
    @java.lang.Override
    public DistanceView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DistanceView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DistanceView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DistanceView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.resources.DistanceView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

