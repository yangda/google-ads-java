// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/errors/bidding_error.proto

package com.google.ads.googleads.v11.errors;

/**
 * <pre>
 * Container for enum describing possible bidding errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.errors.BiddingErrorEnum}
 */
public final class BiddingErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.errors.BiddingErrorEnum)
    BiddingErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BiddingErrorEnum.newBuilder() to construct.
  private BiddingErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BiddingErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BiddingErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BiddingErrorEnum(
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
    return com.google.ads.googleads.v11.errors.BiddingErrorProto.internal_static_google_ads_googleads_v11_errors_BiddingErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.errors.BiddingErrorProto.internal_static_google_ads_googleads_v11_errors_BiddingErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.errors.BiddingErrorEnum.class, com.google.ads.googleads.v11.errors.BiddingErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible bidding errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.errors.BiddingErrorEnum.BiddingError}
   */
  public enum BiddingError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Cannot transition to new bidding strategy.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED = 2;</code>
     */
    BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED(2),
    /**
     * <pre>
     * Cannot attach bidding strategy to campaign.
     * </pre>
     *
     * <code>CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN = 7;</code>
     */
    CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN(7),
    /**
     * <pre>
     * Bidding strategy is not supported or cannot be used as anonymous.
     * </pre>
     *
     * <code>INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE = 10;</code>
     */
    INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE(10),
    /**
     * <pre>
     * The type does not match the named strategy's type.
     * </pre>
     *
     * <code>INVALID_BIDDING_STRATEGY_TYPE = 14;</code>
     */
    INVALID_BIDDING_STRATEGY_TYPE(14),
    /**
     * <pre>
     * The bid is invalid.
     * </pre>
     *
     * <code>INVALID_BID = 17;</code>
     */
    INVALID_BID(17),
    /**
     * <pre>
     * Bidding strategy is not available for the account type.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = 18;</code>
     */
    BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE(18),
    /**
     * <pre>
     * Conversion tracking is not enabled in the campaign that has value-based
     * bidding transitions.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED = 19;</code>
     */
    CONVERSION_TRACKING_NOT_ENABLED(19),
    /**
     * <pre>
     * Not enough conversions tracked for value-based bidding transitions.
     * </pre>
     *
     * <code>NOT_ENOUGH_CONVERSIONS = 20;</code>
     */
    NOT_ENOUGH_CONVERSIONS(20),
    /**
     * <pre>
     * Campaign can not be created with given bidding strategy. It can be
     * transitioned to the strategy, once eligible.
     * </pre>
     *
     * <code>CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY = 21;</code>
     */
    CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY(21),
    /**
     * <pre>
     * Cannot target content network only as campaign uses Page One Promoted
     * bidding strategy.
     * </pre>
     *
     * <code>CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY = 23;</code>
     */
    CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY(23),
    /**
     * <pre>
     * Budget Optimizer and Target Spend bidding strategies are not supported
     * for campaigns with AdSchedule targeting.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE = 24;</code>
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE(24),
    /**
     * <pre>
     * Pay per conversion is not available to all the customer, only few
     * customers on the allow-list can use this.
     * </pre>
     *
     * <code>PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = 25;</code>
     */
    PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER(25),
    /**
     * <pre>
     * Pay per conversion is not allowed with Target CPA.
     * </pre>
     *
     * <code>PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = 26;</code>
     */
    PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA(26),
    /**
     * <pre>
     * Cannot set bidding strategy to Manual CPM for search network only
     * campaigns.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS = 27;</code>
     */
    BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS(27),
    /**
     * <pre>
     * The bidding strategy is not supported for use in drafts or experiments.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS = 28;</code>
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS(28),
    /**
     * <pre>
     * Bidding strategy type does not support product type ad group criterion.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION = 29;</code>
     */
    BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION(29),
    /**
     * <pre>
     * Bid amount is too small.
     * </pre>
     *
     * <code>BID_TOO_SMALL = 30;</code>
     */
    BID_TOO_SMALL(30),
    /**
     * <pre>
     * Bid amount is too big.
     * </pre>
     *
     * <code>BID_TOO_BIG = 31;</code>
     */
    BID_TOO_BIG(31),
    /**
     * <pre>
     * Bid has too many fractional digit precision.
     * </pre>
     *
     * <code>BID_TOO_MANY_FRACTIONAL_DIGITS = 32;</code>
     */
    BID_TOO_MANY_FRACTIONAL_DIGITS(32),
    /**
     * <pre>
     * Invalid domain name specified.
     * </pre>
     *
     * <code>INVALID_DOMAIN_NAME = 33;</code>
     */
    INVALID_DOMAIN_NAME(33),
    /**
     * <pre>
     * The field is not compatible with the payment mode.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_PAYMENT_MODE = 34;</code>
     */
    NOT_COMPATIBLE_WITH_PAYMENT_MODE(34),
    /**
     * <pre>
     * The field is not compatible with the budget type.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_BUDGET_TYPE = 35;</code>
     */
    NOT_COMPATIBLE_WITH_BUDGET_TYPE(35),
    /**
     * <pre>
     * The field is not compatible with the bidding strategy type.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_BIDDING_STRATEGY_TYPE = 36;</code>
     */
    NOT_COMPATIBLE_WITH_BIDDING_STRATEGY_TYPE(36),
    /**
     * <pre>
     * Bidding strategy type is incompatible with shared budget.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHARED_BUDGET = 37;</code>
     */
    BIDDING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHARED_BUDGET(37),
    /**
     * <pre>
     * The attached bidding strategy and budget must be aligned with each other
     * if alignment is specified on either entity.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ALIGNED = 38;</code>
     */
    BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ALIGNED(38),
    /**
     * <pre>
     * The attached bidding strategy and budget must be attached to the same
     * campaigns to become aligned.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ATTACHED_TO_THE_SAME_CAMPAIGNS_TO_ALIGN = 39;</code>
     */
    BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ATTACHED_TO_THE_SAME_CAMPAIGNS_TO_ALIGN(39),
    /**
     * <pre>
     * The aligned bidding strategy and budget must be removed at the same time.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_REMOVED_TOGETHER = 40;</code>
     */
    BIDDING_STRATEGY_AND_BUDGET_MUST_BE_REMOVED_TOGETHER(40),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Cannot transition to new bidding strategy.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED = 2;</code>
     */
    public static final int BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED_VALUE = 2;
    /**
     * <pre>
     * Cannot attach bidding strategy to campaign.
     * </pre>
     *
     * <code>CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN = 7;</code>
     */
    public static final int CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN_VALUE = 7;
    /**
     * <pre>
     * Bidding strategy is not supported or cannot be used as anonymous.
     * </pre>
     *
     * <code>INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE = 10;</code>
     */
    public static final int INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE_VALUE = 10;
    /**
     * <pre>
     * The type does not match the named strategy's type.
     * </pre>
     *
     * <code>INVALID_BIDDING_STRATEGY_TYPE = 14;</code>
     */
    public static final int INVALID_BIDDING_STRATEGY_TYPE_VALUE = 14;
    /**
     * <pre>
     * The bid is invalid.
     * </pre>
     *
     * <code>INVALID_BID = 17;</code>
     */
    public static final int INVALID_BID_VALUE = 17;
    /**
     * <pre>
     * Bidding strategy is not available for the account type.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = 18;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE_VALUE = 18;
    /**
     * <pre>
     * Conversion tracking is not enabled in the campaign that has value-based
     * bidding transitions.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED = 19;</code>
     */
    public static final int CONVERSION_TRACKING_NOT_ENABLED_VALUE = 19;
    /**
     * <pre>
     * Not enough conversions tracked for value-based bidding transitions.
     * </pre>
     *
     * <code>NOT_ENOUGH_CONVERSIONS = 20;</code>
     */
    public static final int NOT_ENOUGH_CONVERSIONS_VALUE = 20;
    /**
     * <pre>
     * Campaign can not be created with given bidding strategy. It can be
     * transitioned to the strategy, once eligible.
     * </pre>
     *
     * <code>CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY = 21;</code>
     */
    public static final int CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY_VALUE = 21;
    /**
     * <pre>
     * Cannot target content network only as campaign uses Page One Promoted
     * bidding strategy.
     * </pre>
     *
     * <code>CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY = 23;</code>
     */
    public static final int CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY_VALUE = 23;
    /**
     * <pre>
     * Budget Optimizer and Target Spend bidding strategies are not supported
     * for campaigns with AdSchedule targeting.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE = 24;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE_VALUE = 24;
    /**
     * <pre>
     * Pay per conversion is not available to all the customer, only few
     * customers on the allow-list can use this.
     * </pre>
     *
     * <code>PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = 25;</code>
     */
    public static final int PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER_VALUE = 25;
    /**
     * <pre>
     * Pay per conversion is not allowed with Target CPA.
     * </pre>
     *
     * <code>PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = 26;</code>
     */
    public static final int PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA_VALUE = 26;
    /**
     * <pre>
     * Cannot set bidding strategy to Manual CPM for search network only
     * campaigns.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS = 27;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS_VALUE = 27;
    /**
     * <pre>
     * The bidding strategy is not supported for use in drafts or experiments.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS = 28;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS_VALUE = 28;
    /**
     * <pre>
     * Bidding strategy type does not support product type ad group criterion.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION = 29;</code>
     */
    public static final int BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION_VALUE = 29;
    /**
     * <pre>
     * Bid amount is too small.
     * </pre>
     *
     * <code>BID_TOO_SMALL = 30;</code>
     */
    public static final int BID_TOO_SMALL_VALUE = 30;
    /**
     * <pre>
     * Bid amount is too big.
     * </pre>
     *
     * <code>BID_TOO_BIG = 31;</code>
     */
    public static final int BID_TOO_BIG_VALUE = 31;
    /**
     * <pre>
     * Bid has too many fractional digit precision.
     * </pre>
     *
     * <code>BID_TOO_MANY_FRACTIONAL_DIGITS = 32;</code>
     */
    public static final int BID_TOO_MANY_FRACTIONAL_DIGITS_VALUE = 32;
    /**
     * <pre>
     * Invalid domain name specified.
     * </pre>
     *
     * <code>INVALID_DOMAIN_NAME = 33;</code>
     */
    public static final int INVALID_DOMAIN_NAME_VALUE = 33;
    /**
     * <pre>
     * The field is not compatible with the payment mode.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_PAYMENT_MODE = 34;</code>
     */
    public static final int NOT_COMPATIBLE_WITH_PAYMENT_MODE_VALUE = 34;
    /**
     * <pre>
     * The field is not compatible with the budget type.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_BUDGET_TYPE = 35;</code>
     */
    public static final int NOT_COMPATIBLE_WITH_BUDGET_TYPE_VALUE = 35;
    /**
     * <pre>
     * The field is not compatible with the bidding strategy type.
     * </pre>
     *
     * <code>NOT_COMPATIBLE_WITH_BIDDING_STRATEGY_TYPE = 36;</code>
     */
    public static final int NOT_COMPATIBLE_WITH_BIDDING_STRATEGY_TYPE_VALUE = 36;
    /**
     * <pre>
     * Bidding strategy type is incompatible with shared budget.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHARED_BUDGET = 37;</code>
     */
    public static final int BIDDING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHARED_BUDGET_VALUE = 37;
    /**
     * <pre>
     * The attached bidding strategy and budget must be aligned with each other
     * if alignment is specified on either entity.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ALIGNED = 38;</code>
     */
    public static final int BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ALIGNED_VALUE = 38;
    /**
     * <pre>
     * The attached bidding strategy and budget must be attached to the same
     * campaigns to become aligned.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ATTACHED_TO_THE_SAME_CAMPAIGNS_TO_ALIGN = 39;</code>
     */
    public static final int BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ATTACHED_TO_THE_SAME_CAMPAIGNS_TO_ALIGN_VALUE = 39;
    /**
     * <pre>
     * The aligned bidding strategy and budget must be removed at the same time.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_AND_BUDGET_MUST_BE_REMOVED_TOGETHER = 40;</code>
     */
    public static final int BIDDING_STRATEGY_AND_BUDGET_MUST_BE_REMOVED_TOGETHER_VALUE = 40;


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
    public static BiddingError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BiddingError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED;
        case 7: return CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN;
        case 10: return INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE;
        case 14: return INVALID_BIDDING_STRATEGY_TYPE;
        case 17: return INVALID_BID;
        case 18: return BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE;
        case 19: return CONVERSION_TRACKING_NOT_ENABLED;
        case 20: return NOT_ENOUGH_CONVERSIONS;
        case 21: return CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY;
        case 23: return CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY;
        case 24: return BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE;
        case 25: return PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER;
        case 26: return PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA;
        case 27: return BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS;
        case 28: return BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS;
        case 29: return BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION;
        case 30: return BID_TOO_SMALL;
        case 31: return BID_TOO_BIG;
        case 32: return BID_TOO_MANY_FRACTIONAL_DIGITS;
        case 33: return INVALID_DOMAIN_NAME;
        case 34: return NOT_COMPATIBLE_WITH_PAYMENT_MODE;
        case 35: return NOT_COMPATIBLE_WITH_BUDGET_TYPE;
        case 36: return NOT_COMPATIBLE_WITH_BIDDING_STRATEGY_TYPE;
        case 37: return BIDDING_STRATEGY_TYPE_INCOMPATIBLE_WITH_SHARED_BUDGET;
        case 38: return BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ALIGNED;
        case 39: return BIDDING_STRATEGY_AND_BUDGET_MUST_BE_ATTACHED_TO_THE_SAME_CAMPAIGNS_TO_ALIGN;
        case 40: return BIDDING_STRATEGY_AND_BUDGET_MUST_BE_REMOVED_TOGETHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BiddingError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BiddingError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BiddingError>() {
            public BiddingError findValueByNumber(int number) {
              return BiddingError.forNumber(number);
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
      return com.google.ads.googleads.v11.errors.BiddingErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BiddingError[] VALUES = values();

    public static BiddingError valueOf(
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

    private BiddingError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.errors.BiddingErrorEnum.BiddingError)
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
    if (!(obj instanceof com.google.ads.googleads.v11.errors.BiddingErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.errors.BiddingErrorEnum other = (com.google.ads.googleads.v11.errors.BiddingErrorEnum) obj;

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

  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.errors.BiddingErrorEnum prototype) {
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
   * Container for enum describing possible bidding errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.errors.BiddingErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.errors.BiddingErrorEnum)
      com.google.ads.googleads.v11.errors.BiddingErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.errors.BiddingErrorProto.internal_static_google_ads_googleads_v11_errors_BiddingErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.errors.BiddingErrorProto.internal_static_google_ads_googleads_v11_errors_BiddingErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.errors.BiddingErrorEnum.class, com.google.ads.googleads.v11.errors.BiddingErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.errors.BiddingErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v11.errors.BiddingErrorProto.internal_static_google_ads_googleads_v11_errors_BiddingErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.BiddingErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.errors.BiddingErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.BiddingErrorEnum build() {
      com.google.ads.googleads.v11.errors.BiddingErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.BiddingErrorEnum buildPartial() {
      com.google.ads.googleads.v11.errors.BiddingErrorEnum result = new com.google.ads.googleads.v11.errors.BiddingErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.errors.BiddingErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v11.errors.BiddingErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.errors.BiddingErrorEnum other) {
      if (other == com.google.ads.googleads.v11.errors.BiddingErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v11.errors.BiddingErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.errors.BiddingErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.errors.BiddingErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.errors.BiddingErrorEnum)
  private static final com.google.ads.googleads.v11.errors.BiddingErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.errors.BiddingErrorEnum();
  }

  public static com.google.ads.googleads.v11.errors.BiddingErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BiddingErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<BiddingErrorEnum>() {
    @java.lang.Override
    public BiddingErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BiddingErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BiddingErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BiddingErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.errors.BiddingErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

