// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/ad_type_infos.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * Product image specific data.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.ProductImage}
 */
public final class ProductImage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.ProductImage)
    ProductImageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductImage.newBuilder() to construct.
  private ProductImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductImage() {
    productImage_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductImage(
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
          case 26: {
            com.google.ads.googleads.v8.common.DisplayCallToAction.Builder subBuilder = null;
            if (displayCallToAction_ != null) {
              subBuilder = displayCallToAction_.toBuilder();
            }
            displayCallToAction_ = input.readMessage(com.google.ads.googleads.v8.common.DisplayCallToAction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(displayCallToAction_);
              displayCallToAction_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            productImage_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            description_ = s;
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
    return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_ProductImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_ProductImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.ProductImage.class, com.google.ads.googleads.v8.common.ProductImage.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_IMAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object productImage_;
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>string product_image = 4;</code>
   * @return Whether the productImage field is set.
   */
  @java.lang.Override
  public boolean hasProductImage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>string product_image = 4;</code>
   * @return The productImage.
   */
  @java.lang.Override
  public java.lang.String getProductImage() {
    java.lang.Object ref = productImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productImage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>string product_image = 4;</code>
   * @return The bytes for productImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductImageBytes() {
    java.lang.Object ref = productImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_CALL_TO_ACTION_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v8.common.DisplayCallToAction displayCallToAction_;
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
   * @return Whether the displayCallToAction field is set.
   */
  @java.lang.Override
  public boolean hasDisplayCallToAction() {
    return displayCallToAction_ != null;
  }
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
   * @return The displayCallToAction.
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.common.DisplayCallToAction getDisplayCallToAction() {
    return displayCallToAction_ == null ? com.google.ads.googleads.v8.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
  }
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder getDisplayCallToActionOrBuilder() {
    return getDisplayCallToAction();
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
    if (displayCallToAction_ != null) {
      output.writeMessage(3, getDisplayCallToAction());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, productImage_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (displayCallToAction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDisplayCallToAction());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, productImage_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.common.ProductImage)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.ProductImage other = (com.google.ads.googleads.v8.common.ProductImage) obj;

    if (hasProductImage() != other.hasProductImage()) return false;
    if (hasProductImage()) {
      if (!getProductImage()
          .equals(other.getProductImage())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (hasDisplayCallToAction() != other.hasDisplayCallToAction()) return false;
    if (hasDisplayCallToAction()) {
      if (!getDisplayCallToAction()
          .equals(other.getDisplayCallToAction())) return false;
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
    if (hasProductImage()) {
      hash = (37 * hash) + PRODUCT_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getProductImage().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    if (hasDisplayCallToAction()) {
      hash = (37 * hash) + DISPLAY_CALL_TO_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayCallToAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.ProductImage parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.common.ProductImage prototype) {
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
   * Product image specific data.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.ProductImage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.ProductImage)
      com.google.ads.googleads.v8.common.ProductImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_ProductImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_ProductImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.ProductImage.class, com.google.ads.googleads.v8.common.ProductImage.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.ProductImage.newBuilder()
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
      productImage_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (displayCallToActionBuilder_ == null) {
        displayCallToAction_ = null;
      } else {
        displayCallToAction_ = null;
        displayCallToActionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_ProductImage_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.ProductImage getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.ProductImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.ProductImage build() {
      com.google.ads.googleads.v8.common.ProductImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.ProductImage buildPartial() {
      com.google.ads.googleads.v8.common.ProductImage result = new com.google.ads.googleads.v8.common.ProductImage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.productImage_ = productImage_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.description_ = description_;
      if (displayCallToActionBuilder_ == null) {
        result.displayCallToAction_ = displayCallToAction_;
      } else {
        result.displayCallToAction_ = displayCallToActionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v8.common.ProductImage) {
        return mergeFrom((com.google.ads.googleads.v8.common.ProductImage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.ProductImage other) {
      if (other == com.google.ads.googleads.v8.common.ProductImage.getDefaultInstance()) return this;
      if (other.hasProductImage()) {
        bitField0_ |= 0x00000001;
        productImage_ = other.productImage_;
        onChanged();
      }
      if (other.hasDescription()) {
        bitField0_ |= 0x00000002;
        description_ = other.description_;
        onChanged();
      }
      if (other.hasDisplayCallToAction()) {
        mergeDisplayCallToAction(other.getDisplayCallToAction());
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
      com.google.ads.googleads.v8.common.ProductImage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.ProductImage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object productImage_ = "";
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @return Whether the productImage field is set.
     */
    public boolean hasProductImage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @return The productImage.
     */
    public java.lang.String getProductImage() {
      java.lang.Object ref = productImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @return The bytes for productImage.
     */
    public com.google.protobuf.ByteString
        getProductImageBytes() {
      java.lang.Object ref = productImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @param value The productImage to set.
     * @return This builder for chaining.
     */
    public Builder setProductImage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      productImage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductImage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      productImage_ = getDefaultInstance().getProductImage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>string product_image = 4;</code>
     * @param value The bytes for productImage to set.
     * @return This builder for chaining.
     */
    public Builder setProductImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      productImage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000002);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      description_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v8.common.DisplayCallToAction displayCallToAction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.common.DisplayCallToAction, com.google.ads.googleads.v8.common.DisplayCallToAction.Builder, com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder> displayCallToActionBuilder_;
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     * @return Whether the displayCallToAction field is set.
     */
    public boolean hasDisplayCallToAction() {
      return displayCallToActionBuilder_ != null || displayCallToAction_ != null;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     * @return The displayCallToAction.
     */
    public com.google.ads.googleads.v8.common.DisplayCallToAction getDisplayCallToAction() {
      if (displayCallToActionBuilder_ == null) {
        return displayCallToAction_ == null ? com.google.ads.googleads.v8.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
      } else {
        return displayCallToActionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder setDisplayCallToAction(com.google.ads.googleads.v8.common.DisplayCallToAction value) {
      if (displayCallToActionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayCallToAction_ = value;
        onChanged();
      } else {
        displayCallToActionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder setDisplayCallToAction(
        com.google.ads.googleads.v8.common.DisplayCallToAction.Builder builderForValue) {
      if (displayCallToActionBuilder_ == null) {
        displayCallToAction_ = builderForValue.build();
        onChanged();
      } else {
        displayCallToActionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder mergeDisplayCallToAction(com.google.ads.googleads.v8.common.DisplayCallToAction value) {
      if (displayCallToActionBuilder_ == null) {
        if (displayCallToAction_ != null) {
          displayCallToAction_ =
            com.google.ads.googleads.v8.common.DisplayCallToAction.newBuilder(displayCallToAction_).mergeFrom(value).buildPartial();
        } else {
          displayCallToAction_ = value;
        }
        onChanged();
      } else {
        displayCallToActionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder clearDisplayCallToAction() {
      if (displayCallToActionBuilder_ == null) {
        displayCallToAction_ = null;
        onChanged();
      } else {
        displayCallToAction_ = null;
        displayCallToActionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public com.google.ads.googleads.v8.common.DisplayCallToAction.Builder getDisplayCallToActionBuilder() {
      
      onChanged();
      return getDisplayCallToActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder getDisplayCallToActionOrBuilder() {
      if (displayCallToActionBuilder_ != null) {
        return displayCallToActionBuilder_.getMessageOrBuilder();
      } else {
        return displayCallToAction_ == null ?
            com.google.ads.googleads.v8.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
      }
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.common.DisplayCallToAction, com.google.ads.googleads.v8.common.DisplayCallToAction.Builder, com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder> 
        getDisplayCallToActionFieldBuilder() {
      if (displayCallToActionBuilder_ == null) {
        displayCallToActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v8.common.DisplayCallToAction, com.google.ads.googleads.v8.common.DisplayCallToAction.Builder, com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder>(
                getDisplayCallToAction(),
                getParentForChildren(),
                isClean());
        displayCallToAction_ = null;
      }
      return displayCallToActionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.ProductImage)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.ProductImage)
  private static final com.google.ads.googleads.v8.common.ProductImage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.ProductImage();
  }

  public static com.google.ads.googleads.v8.common.ProductImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductImage>
      PARSER = new com.google.protobuf.AbstractParser<ProductImage>() {
    @java.lang.Override
    public ProductImage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductImage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.ProductImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

