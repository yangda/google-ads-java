// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/customer.proto

package com.google.ads.googleads.v8.resources;

/**
 * <pre>
 * Call reporting setting for a customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.resources.CallReportingSetting}
 */
public final class CallReportingSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.resources.CallReportingSetting)
    CallReportingSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallReportingSetting.newBuilder() to construct.
  private CallReportingSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallReportingSetting() {
    callConversionAction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CallReportingSetting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CallReportingSetting(
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
          case 80: {
            bitField0_ |= 0x00000001;
            callReportingEnabled_ = input.readBool();
            break;
          }
          case 88: {
            bitField0_ |= 0x00000002;
            callConversionReportingEnabled_ = input.readBool();
            break;
          }
          case 98: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            callConversionAction_ = s;
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
    return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_CallReportingSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_CallReportingSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.resources.CallReportingSetting.class, com.google.ads.googleads.v8.resources.CallReportingSetting.Builder.class);
  }

  private int bitField0_;
  public static final int CALL_REPORTING_ENABLED_FIELD_NUMBER = 10;
  private boolean callReportingEnabled_;
  /**
   * <pre>
   * Enable reporting of phone call events by redirecting them via Google
   * System.
   * </pre>
   *
   * <code>optional bool call_reporting_enabled = 10;</code>
   * @return Whether the callReportingEnabled field is set.
   */
  @java.lang.Override
  public boolean hasCallReportingEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Enable reporting of phone call events by redirecting them via Google
   * System.
   * </pre>
   *
   * <code>optional bool call_reporting_enabled = 10;</code>
   * @return The callReportingEnabled.
   */
  @java.lang.Override
  public boolean getCallReportingEnabled() {
    return callReportingEnabled_;
  }

  public static final int CALL_CONVERSION_REPORTING_ENABLED_FIELD_NUMBER = 11;
  private boolean callConversionReportingEnabled_;
  /**
   * <pre>
   * Whether to enable call conversion reporting.
   * </pre>
   *
   * <code>optional bool call_conversion_reporting_enabled = 11;</code>
   * @return Whether the callConversionReportingEnabled field is set.
   */
  @java.lang.Override
  public boolean hasCallConversionReportingEnabled() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether to enable call conversion reporting.
   * </pre>
   *
   * <code>optional bool call_conversion_reporting_enabled = 11;</code>
   * @return The callConversionReportingEnabled.
   */
  @java.lang.Override
  public boolean getCallConversionReportingEnabled() {
    return callConversionReportingEnabled_;
  }

  public static final int CALL_CONVERSION_ACTION_FIELD_NUMBER = 12;
  private volatile java.lang.Object callConversionAction_;
  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the callConversionAction field is set.
   */
  @java.lang.Override
  public boolean hasCallConversionAction() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return The callConversionAction.
   */
  @java.lang.Override
  public java.lang.String getCallConversionAction() {
    java.lang.Object ref = callConversionAction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callConversionAction_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Customer-level call conversion action to attribute a call conversion to.
   * If not set a default conversion action is used. Only in effect when
   * call_conversion_reporting_enabled is set to true.
   * </pre>
   *
   * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for callConversionAction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallConversionActionBytes() {
    java.lang.Object ref = callConversionAction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callConversionAction_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeBool(10, callReportingEnabled_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(11, callConversionReportingEnabled_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, callConversionAction_);
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
        .computeBoolSize(10, callReportingEnabled_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, callConversionReportingEnabled_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, callConversionAction_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.resources.CallReportingSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.resources.CallReportingSetting other = (com.google.ads.googleads.v8.resources.CallReportingSetting) obj;

    if (hasCallReportingEnabled() != other.hasCallReportingEnabled()) return false;
    if (hasCallReportingEnabled()) {
      if (getCallReportingEnabled()
          != other.getCallReportingEnabled()) return false;
    }
    if (hasCallConversionReportingEnabled() != other.hasCallConversionReportingEnabled()) return false;
    if (hasCallConversionReportingEnabled()) {
      if (getCallConversionReportingEnabled()
          != other.getCallConversionReportingEnabled()) return false;
    }
    if (hasCallConversionAction() != other.hasCallConversionAction()) return false;
    if (hasCallConversionAction()) {
      if (!getCallConversionAction()
          .equals(other.getCallConversionAction())) return false;
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
    if (hasCallReportingEnabled()) {
      hash = (37 * hash) + CALL_REPORTING_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCallReportingEnabled());
    }
    if (hasCallConversionReportingEnabled()) {
      hash = (37 * hash) + CALL_CONVERSION_REPORTING_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCallConversionReportingEnabled());
    }
    if (hasCallConversionAction()) {
      hash = (37 * hash) + CALL_CONVERSION_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getCallConversionAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.resources.CallReportingSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.resources.CallReportingSetting prototype) {
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
   * Call reporting setting for a customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.resources.CallReportingSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.resources.CallReportingSetting)
      com.google.ads.googleads.v8.resources.CallReportingSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_CallReportingSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_CallReportingSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.resources.CallReportingSetting.class, com.google.ads.googleads.v8.resources.CallReportingSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.resources.CallReportingSetting.newBuilder()
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
      callReportingEnabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      callConversionReportingEnabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      callConversionAction_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.resources.CustomerProto.internal_static_google_ads_googleads_v8_resources_CallReportingSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.CallReportingSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.resources.CallReportingSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.CallReportingSetting build() {
      com.google.ads.googleads.v8.resources.CallReportingSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.resources.CallReportingSetting buildPartial() {
      com.google.ads.googleads.v8.resources.CallReportingSetting result = new com.google.ads.googleads.v8.resources.CallReportingSetting(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callReportingEnabled_ = callReportingEnabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.callConversionReportingEnabled_ = callConversionReportingEnabled_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.callConversionAction_ = callConversionAction_;
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
      if (other instanceof com.google.ads.googleads.v8.resources.CallReportingSetting) {
        return mergeFrom((com.google.ads.googleads.v8.resources.CallReportingSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.resources.CallReportingSetting other) {
      if (other == com.google.ads.googleads.v8.resources.CallReportingSetting.getDefaultInstance()) return this;
      if (other.hasCallReportingEnabled()) {
        setCallReportingEnabled(other.getCallReportingEnabled());
      }
      if (other.hasCallConversionReportingEnabled()) {
        setCallConversionReportingEnabled(other.getCallConversionReportingEnabled());
      }
      if (other.hasCallConversionAction()) {
        bitField0_ |= 0x00000004;
        callConversionAction_ = other.callConversionAction_;
        onChanged();
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
      com.google.ads.googleads.v8.resources.CallReportingSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.resources.CallReportingSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean callReportingEnabled_ ;
    /**
     * <pre>
     * Enable reporting of phone call events by redirecting them via Google
     * System.
     * </pre>
     *
     * <code>optional bool call_reporting_enabled = 10;</code>
     * @return Whether the callReportingEnabled field is set.
     */
    @java.lang.Override
    public boolean hasCallReportingEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Enable reporting of phone call events by redirecting them via Google
     * System.
     * </pre>
     *
     * <code>optional bool call_reporting_enabled = 10;</code>
     * @return The callReportingEnabled.
     */
    @java.lang.Override
    public boolean getCallReportingEnabled() {
      return callReportingEnabled_;
    }
    /**
     * <pre>
     * Enable reporting of phone call events by redirecting them via Google
     * System.
     * </pre>
     *
     * <code>optional bool call_reporting_enabled = 10;</code>
     * @param value The callReportingEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setCallReportingEnabled(boolean value) {
      bitField0_ |= 0x00000001;
      callReportingEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable reporting of phone call events by redirecting them via Google
     * System.
     * </pre>
     *
     * <code>optional bool call_reporting_enabled = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallReportingEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callReportingEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean callConversionReportingEnabled_ ;
    /**
     * <pre>
     * Whether to enable call conversion reporting.
     * </pre>
     *
     * <code>optional bool call_conversion_reporting_enabled = 11;</code>
     * @return Whether the callConversionReportingEnabled field is set.
     */
    @java.lang.Override
    public boolean hasCallConversionReportingEnabled() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Whether to enable call conversion reporting.
     * </pre>
     *
     * <code>optional bool call_conversion_reporting_enabled = 11;</code>
     * @return The callConversionReportingEnabled.
     */
    @java.lang.Override
    public boolean getCallConversionReportingEnabled() {
      return callConversionReportingEnabled_;
    }
    /**
     * <pre>
     * Whether to enable call conversion reporting.
     * </pre>
     *
     * <code>optional bool call_conversion_reporting_enabled = 11;</code>
     * @param value The callConversionReportingEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setCallConversionReportingEnabled(boolean value) {
      bitField0_ |= 0x00000002;
      callConversionReportingEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to enable call conversion reporting.
     * </pre>
     *
     * <code>optional bool call_conversion_reporting_enabled = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallConversionReportingEnabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      callConversionReportingEnabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object callConversionAction_ = "";
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @return Whether the callConversionAction field is set.
     */
    public boolean hasCallConversionAction() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @return The callConversionAction.
     */
    public java.lang.String getCallConversionAction() {
      java.lang.Object ref = callConversionAction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callConversionAction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for callConversionAction.
     */
    public com.google.protobuf.ByteString
        getCallConversionActionBytes() {
      java.lang.Object ref = callConversionAction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callConversionAction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @param value The callConversionAction to set.
     * @return This builder for chaining.
     */
    public Builder setCallConversionAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      callConversionAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCallConversionAction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      callConversionAction_ = getDefaultInstance().getCallConversionAction();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Customer-level call conversion action to attribute a call conversion to.
     * If not set a default conversion action is used. Only in effect when
     * call_conversion_reporting_enabled is set to true.
     * </pre>
     *
     * <code>optional string call_conversion_action = 12 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for callConversionAction to set.
     * @return This builder for chaining.
     */
    public Builder setCallConversionActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      callConversionAction_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.resources.CallReportingSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.CallReportingSetting)
  private static final com.google.ads.googleads.v8.resources.CallReportingSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.resources.CallReportingSetting();
  }

  public static com.google.ads.googleads.v8.resources.CallReportingSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallReportingSetting>
      PARSER = new com.google.protobuf.AbstractParser<CallReportingSetting>() {
    @java.lang.Override
    public CallReportingSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallReportingSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallReportingSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallReportingSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.resources.CallReportingSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

