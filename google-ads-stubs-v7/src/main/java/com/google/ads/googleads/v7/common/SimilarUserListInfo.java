// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/user_lists.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * SimilarUserList is a list of users which are similar to users from another
 * UserList. These lists are read-only and automatically created by Google.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.SimilarUserListInfo}
 */
public final class SimilarUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.SimilarUserListInfo)
    SimilarUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimilarUserListInfo.newBuilder() to construct.
  private SimilarUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimilarUserListInfo() {
    seedUserList_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimilarUserListInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimilarUserListInfo(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            seedUserList_ = s;
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
    return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_SimilarUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_SimilarUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.SimilarUserListInfo.class, com.google.ads.googleads.v7.common.SimilarUserListInfo.Builder.class);
  }

  private int bitField0_;
  public static final int SEED_USER_LIST_FIELD_NUMBER = 2;
  private volatile java.lang.Object seedUserList_;
  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return Whether the seedUserList field is set.
   */
  @java.lang.Override
  public boolean hasSeedUserList() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return The seedUserList.
   */
  @java.lang.Override
  public java.lang.String getSeedUserList() {
    java.lang.Object ref = seedUserList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seedUserList_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return The bytes for seedUserList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSeedUserListBytes() {
    java.lang.Object ref = seedUserList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seedUserList_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, seedUserList_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, seedUserList_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.SimilarUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.SimilarUserListInfo other = (com.google.ads.googleads.v7.common.SimilarUserListInfo) obj;

    if (hasSeedUserList() != other.hasSeedUserList()) return false;
    if (hasSeedUserList()) {
      if (!getSeedUserList()
          .equals(other.getSeedUserList())) return false;
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
    if (hasSeedUserList()) {
      hash = (37 * hash) + SEED_USER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSeedUserList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.SimilarUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.SimilarUserListInfo prototype) {
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
   * SimilarUserList is a list of users which are similar to users from another
   * UserList. These lists are read-only and automatically created by Google.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.SimilarUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.SimilarUserListInfo)
      com.google.ads.googleads.v7.common.SimilarUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_SimilarUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_SimilarUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.SimilarUserListInfo.class, com.google.ads.googleads.v7.common.SimilarUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.SimilarUserListInfo.newBuilder()
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
      seedUserList_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_SimilarUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.SimilarUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.SimilarUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.SimilarUserListInfo build() {
      com.google.ads.googleads.v7.common.SimilarUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.SimilarUserListInfo buildPartial() {
      com.google.ads.googleads.v7.common.SimilarUserListInfo result = new com.google.ads.googleads.v7.common.SimilarUserListInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.seedUserList_ = seedUserList_;
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
      if (other instanceof com.google.ads.googleads.v7.common.SimilarUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.SimilarUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.SimilarUserListInfo other) {
      if (other == com.google.ads.googleads.v7.common.SimilarUserListInfo.getDefaultInstance()) return this;
      if (other.hasSeedUserList()) {
        bitField0_ |= 0x00000001;
        seedUserList_ = other.seedUserList_;
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
      com.google.ads.googleads.v7.common.SimilarUserListInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.SimilarUserListInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object seedUserList_ = "";
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @return Whether the seedUserList field is set.
     */
    public boolean hasSeedUserList() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @return The seedUserList.
     */
    public java.lang.String getSeedUserList() {
      java.lang.Object ref = seedUserList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seedUserList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @return The bytes for seedUserList.
     */
    public com.google.protobuf.ByteString
        getSeedUserListBytes() {
      java.lang.Object ref = seedUserList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seedUserList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @param value The seedUserList to set.
     * @return This builder for chaining.
     */
    public Builder setSeedUserList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      seedUserList_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeedUserList() {
      bitField0_ = (bitField0_ & ~0x00000001);
      seedUserList_ = getDefaultInstance().getSeedUserList();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Seed UserList from which this list is derived.
     * </pre>
     *
     * <code>optional string seed_user_list = 2;</code>
     * @param value The bytes for seedUserList to set.
     * @return This builder for chaining.
     */
    public Builder setSeedUserListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      seedUserList_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.SimilarUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.SimilarUserListInfo)
  private static final com.google.ads.googleads.v7.common.SimilarUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.SimilarUserListInfo();
  }

  public static com.google.ads.googleads.v7.common.SimilarUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimilarUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<SimilarUserListInfo>() {
    @java.lang.Override
    public SimilarUserListInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimilarUserListInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimilarUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimilarUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.SimilarUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

