// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/customer_manager_link.proto

package com.google.ads.googleads.v11.resources;

/**
 * <pre>
 * Represents customer-manager link relationship.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.resources.CustomerManagerLink}
 */
public final class CustomerManagerLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.resources.CustomerManagerLink)
    CustomerManagerLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerManagerLink.newBuilder() to construct.
  private CustomerManagerLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerManagerLink() {
    resourceName_ = "";
    managerCustomer_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerManagerLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomerManagerLink(
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
          case 40: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            managerCustomer_ = s;
            break;
          }
          case 56: {
            bitField0_ |= 0x00000002;
            managerLinkId_ = input.readInt64();
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
    return com.google.ads.googleads.v11.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v11_resources_CustomerManagerLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v11_resources_CustomerManagerLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.resources.CustomerManagerLink.class, com.google.ads.googleads.v11.resources.CustomerManagerLink.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

  public static final int MANAGER_CUSTOMER_FIELD_NUMBER = 6;
  private volatile java.lang.Object managerCustomer_;
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the managerCustomer field is set.
   */
  @java.lang.Override
  public boolean hasManagerCustomer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The managerCustomer.
   */
  @java.lang.Override
  public java.lang.String getManagerCustomer() {
    java.lang.Object ref = managerCustomer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      managerCustomer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for managerCustomer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getManagerCustomerBytes() {
    java.lang.Object ref = managerCustomer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      managerCustomer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANAGER_LINK_ID_FIELD_NUMBER = 7;
  private long managerLinkId_;
  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the managerLinkId field is set.
   */
  @java.lang.Override
  public boolean hasManagerLinkId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The managerLinkId.
   */
  @java.lang.Override
  public long getManagerLinkId() {
    return managerLinkId_;
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus result = com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (status_ != com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, managerCustomer_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(7, managerLinkId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (status_ != com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, managerCustomer_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, managerLinkId_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.resources.CustomerManagerLink)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.resources.CustomerManagerLink other = (com.google.ads.googleads.v11.resources.CustomerManagerLink) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasManagerCustomer() != other.hasManagerCustomer()) return false;
    if (hasManagerCustomer()) {
      if (!getManagerCustomer()
          .equals(other.getManagerCustomer())) return false;
    }
    if (hasManagerLinkId() != other.hasManagerLinkId()) return false;
    if (hasManagerLinkId()) {
      if (getManagerLinkId()
          != other.getManagerLinkId()) return false;
    }
    if (status_ != other.status_) return false;
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
    if (hasManagerCustomer()) {
      hash = (37 * hash) + MANAGER_CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getManagerCustomer().hashCode();
    }
    if (hasManagerLinkId()) {
      hash = (37 * hash) + MANAGER_LINK_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getManagerLinkId());
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.CustomerManagerLink parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.resources.CustomerManagerLink prototype) {
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
   * Represents customer-manager link relationship.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.resources.CustomerManagerLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.resources.CustomerManagerLink)
      com.google.ads.googleads.v11.resources.CustomerManagerLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v11_resources_CustomerManagerLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v11_resources_CustomerManagerLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.resources.CustomerManagerLink.class, com.google.ads.googleads.v11.resources.CustomerManagerLink.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.resources.CustomerManagerLink.newBuilder()
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

      managerCustomer_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      managerLinkId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.resources.CustomerManagerLinkProto.internal_static_google_ads_googleads_v11_resources_CustomerManagerLink_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.CustomerManagerLink getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.resources.CustomerManagerLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.CustomerManagerLink build() {
      com.google.ads.googleads.v11.resources.CustomerManagerLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.CustomerManagerLink buildPartial() {
      com.google.ads.googleads.v11.resources.CustomerManagerLink result = new com.google.ads.googleads.v11.resources.CustomerManagerLink(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.managerCustomer_ = managerCustomer_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.managerLinkId_ = managerLinkId_;
        to_bitField0_ |= 0x00000002;
      }
      result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v11.resources.CustomerManagerLink) {
        return mergeFrom((com.google.ads.googleads.v11.resources.CustomerManagerLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.resources.CustomerManagerLink other) {
      if (other == com.google.ads.googleads.v11.resources.CustomerManagerLink.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasManagerCustomer()) {
        bitField0_ |= 0x00000001;
        managerCustomer_ = other.managerCustomer_;
        onChanged();
      }
      if (other.hasManagerLinkId()) {
        setManagerLinkId(other.getManagerLinkId());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.google.ads.googleads.v11.resources.CustomerManagerLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.resources.CustomerManagerLink) e.getUnfinishedMessage();
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
     * Immutable. Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Name of the resource.
     * CustomerManagerLink resource names have the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object managerCustomer_ = "";
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return Whether the managerCustomer field is set.
     */
    public boolean hasManagerCustomer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The managerCustomer.
     */
    public java.lang.String getManagerCustomer() {
      java.lang.Object ref = managerCustomer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        managerCustomer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for managerCustomer.
     */
    public com.google.protobuf.ByteString
        getManagerCustomerBytes() {
      java.lang.Object ref = managerCustomer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        managerCustomer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The managerCustomer to set.
     * @return This builder for chaining.
     */
    public Builder setManagerCustomer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      managerCustomer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearManagerCustomer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      managerCustomer_ = getDefaultInstance().getManagerCustomer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The manager customer linked to the customer.
     * </pre>
     *
     * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for managerCustomer to set.
     * @return This builder for chaining.
     */
    public Builder setManagerCustomerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      managerCustomer_ = value;
      onChanged();
      return this;
    }

    private long managerLinkId_ ;
    /**
     * <pre>
     * Output only. ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the managerLinkId field is set.
     */
    @java.lang.Override
    public boolean hasManagerLinkId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The managerLinkId.
     */
    @java.lang.Override
    public long getManagerLinkId() {
      return managerLinkId_;
    }
    /**
     * <pre>
     * Output only. ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The managerLinkId to set.
     * @return This builder for chaining.
     */
    public Builder setManagerLinkId(long value) {
      bitField0_ |= 0x00000002;
      managerLinkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. ID of the customer-manager link. This field is read only.
     * </pre>
     *
     * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearManagerLinkId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      managerLinkId_ = 0L;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus result = com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the link between the customer and the manager.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.resources.CustomerManagerLink)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.resources.CustomerManagerLink)
  private static final com.google.ads.googleads.v11.resources.CustomerManagerLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.resources.CustomerManagerLink();
  }

  public static com.google.ads.googleads.v11.resources.CustomerManagerLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerManagerLink>
      PARSER = new com.google.protobuf.AbstractParser<CustomerManagerLink>() {
    @java.lang.Override
    public CustomerManagerLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomerManagerLink(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerManagerLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerManagerLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.resources.CustomerManagerLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

