// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/errors/criterion_error.proto

package com.google.ads.googleads.v11.errors;

public final class CriterionErrorProto {
  private CriterionErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_errors_CriterionErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_errors_CriterionErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v11/errors/criter" +
      "ion_error.proto\022\037google.ads.googleads.v1" +
      "1.errors\"\222)\n\022CriterionErrorEnum\"\373(\n\016Crit" +
      "erionError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001" +
      "\022\032\n\026CONCRETE_TYPE_REQUIRED\020\002\022\035\n\031INVALID_" +
      "EXCLUDED_CATEGORY\020\003\022\030\n\024INVALID_KEYWORD_T" +
      "EXT\020\004\022\031\n\025KEYWORD_TEXT_TOO_LONG\020\005\022\036\n\032KEYW" +
      "ORD_HAS_TOO_MANY_WORDS\020\006\022\035\n\031KEYWORD_HAS_" +
      "INVALID_CHARS\020\007\022\031\n\025INVALID_PLACEMENT_URL" +
      "\020\010\022\025\n\021INVALID_USER_LIST\020\t\022\031\n\025INVALID_USE" +
      "R_INTEREST\020\n\022$\n INVALID_FORMAT_FOR_PLACE" +
      "MENT_URL\020\013\022\035\n\031PLACEMENT_URL_IS_TOO_LONG\020" +
      "\014\022\"\n\036PLACEMENT_URL_HAS_ILLEGAL_CHAR\020\r\022,\n" +
      "(PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LIN" +
      "E\020\016\0229\n5PLACEMENT_IS_NOT_AVAILABLE_FOR_TA" +
      "RGETING_OR_EXCLUSION\020\017\022\026\n\022INVALID_TOPIC_" +
      "PATH\020\020\022\036\n\032INVALID_YOUTUBE_CHANNEL_ID\020\021\022\034" +
      "\n\030INVALID_YOUTUBE_VIDEO_ID\020\022\022\'\n#YOUTUBE_" +
      "VERTICAL_CHANNEL_DEPRECATED\020\023\022*\n&YOUTUBE" +
      "_DEMOGRAPHIC_CHANNEL_DEPRECATED\020\024\022\033\n\027YOU" +
      "TUBE_URL_UNSUPPORTED\020\025\022 \n\034CANNOT_EXCLUDE" +
      "_CRITERIA_TYPE\020\026\022\034\n\030CANNOT_ADD_CRITERIA_" +
      "TYPE\020\027\022$\n CANNOT_EXCLUDE_SIMILAR_USER_LI" +
      "ST\020\032\022\037\n\033CANNOT_ADD_CLOSED_USER_LIST\020\033\022:\n" +
      "6CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH" +
      "_ONLY_CAMPAIGNS\020\034\0225\n1CANNOT_ADD_DISPLAY_" +
      "ONLY_LISTS_TO_SEARCH_CAMPAIGNS\020\035\0227\n3CANN" +
      "OT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CA" +
      "MPAIGNS\020\036\0221\n-CANNOT_ADD_USER_INTERESTS_T" +
      "O_SEARCH_CAMPAIGNS\020\037\0229\n5CANNOT_SET_BIDS_" +
      "ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS\020 \022" +
      "7\n3CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR" +
      "_CAMPAIGN_TYPE\020!\022\035\n\031INVALID_COMBINED_AUD" +
      "IENCE\020z\022\033\n\027INVALID_CUSTOM_AFFINITY\020`\022\031\n\025" +
      "INVALID_CUSTOM_INTENT\020a\022\033\n\027INVALID_CUSTO" +
      "M_AUDIENCE\020y\022\026\n\022INVALID_IP_ADDRESS\020\"\022\025\n\021" +
      "INVALID_IP_FORMAT\020#\022\026\n\022INVALID_MOBILE_AP" +
      "P\020$\022\037\n\033INVALID_MOBILE_APP_CATEGORY\020%\022\030\n\024" +
      "INVALID_CRITERION_ID\020&\022\033\n\027CANNOT_TARGET_" +
      "CRITERION\020\'\022$\n CANNOT_TARGET_OBSOLETE_CR" +
      "ITERION\020(\022\"\n\036CRITERION_ID_AND_TYPE_MISMA" +
      "TCH\020)\022\034\n\030INVALID_PROXIMITY_RADIUS\020*\022\"\n\036I" +
      "NVALID_PROXIMITY_RADIUS_UNITS\020+\022 \n\034INVAL" +
      "ID_STREETADDRESS_LENGTH\020,\022\033\n\027INVALID_CIT" +
      "YNAME_LENGTH\020-\022\035\n\031INVALID_REGIONCODE_LEN" +
      "GTH\020.\022\035\n\031INVALID_REGIONNAME_LENGTH\020/\022\035\n\031" +
      "INVALID_POSTALCODE_LENGTH\0200\022\030\n\024INVALID_C" +
      "OUNTRY_CODE\0201\022\024\n\020INVALID_LATITUDE\0202\022\025\n\021I" +
      "NVALID_LONGITUDE\0203\0226\n2PROXIMITY_GEOPOINT" +
      "_AND_ADDRESS_BOTH_CANNOT_BE_NULL\0204\022\035\n\031IN" +
      "VALID_PROXIMITY_ADDRESS\0205\022\034\n\030INVALID_USE" +
      "R_DOMAIN_NAME\0206\022 \n\034CRITERION_PARAMETER_T" +
      "OO_LONG\0207\022&\n\"AD_SCHEDULE_TIME_INTERVALS_" +
      "OVERLAP\0208\0222\n.AD_SCHEDULE_INTERVAL_CANNOT" +
      "_SPAN_MULTIPLE_DAYS\0209\022%\n!AD_SCHEDULE_INV" +
      "ALID_TIME_INTERVAL\020:\0220\n,AD_SCHEDULE_EXCE" +
      "EDED_INTERVALS_PER_DAY_LIMIT\020;\022/\n+AD_SCH" +
      "EDULE_CRITERION_ID_MISMATCHING_FIELDS\020<\022" +
      "$\n CANNOT_BID_MODIFY_CRITERION_TYPE\020=\0222\n" +
      ".CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OP" +
      "TED_OUT\020>\022(\n$CANNOT_BID_MODIFY_NEGATIVE_" +
      "CRITERION\020?\022\037\n\033BID_MODIFIER_ALREADY_EXIS" +
      "TS\020@\022\027\n\023FEED_ID_NOT_ALLOWED\020A\022(\n$ACCOUNT" +
      "_INELIGIBLE_FOR_CRITERIA_TYPE\020B\022.\n*CRITE" +
      "RIA_TYPE_INVALID_FOR_BIDDING_STRATEGY\020C\022" +
      "\034\n\030CANNOT_EXCLUDE_CRITERION\020D\022\033\n\027CANNOT_" +
      "REMOVE_CRITERION\020E\022$\n INVALID_PRODUCT_BI" +
      "DDING_CATEGORY\020L\022\034\n\030MISSING_SHOPPING_SET" +
      "TING\020M\022\035\n\031INVALID_MATCHING_FUNCTION\020N\022\037\n" +
      "\033LOCATION_FILTER_NOT_ALLOWED\020O\022$\n INVALI" +
      "D_FEED_FOR_LOCATION_FILTER\020b\022\033\n\027LOCATION" +
      "_FILTER_INVALID\020P\0227\n3CANNOT_SET_GEO_TARG" +
      "ET_CONSTANTS_WITH_FEED_ITEM_SETS\020{\022!\n\035IN" +
      "VALID_LOCATION_GROUP_RADIUS\020|\022&\n\"INVALID" +
      "_LOCATION_GROUP_RADIUS_UNIT\020}\0222\n.CANNOT_" +
      "ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP\020" +
      "Q\0229\n5HOTEL_LENGTH_OF_STAY_OVERLAPS_WITH_" +
      "EXISTING_CRITERION\020R\022A\n=HOTEL_ADVANCE_BO" +
      "OKING_WINDOW_OVERLAPS_WITH_EXISTING_CRIT" +
      "ERION\020S\022.\n*FIELD_INCOMPATIBLE_WITH_NEGAT" +
      "IVE_TARGETING\020T\022\035\n\031INVALID_WEBPAGE_CONDI" +
      "TION\020U\022!\n\035INVALID_WEBPAGE_CONDITION_URL\020" +
      "V\022)\n%WEBPAGE_CONDITION_URL_CANNOT_BE_EMP" +
      "TY\020W\022.\n*WEBPAGE_CONDITION_URL_UNSUPPORTE" +
      "D_PROTOCOL\020X\022.\n*WEBPAGE_CONDITION_URL_CA" +
      "NNOT_BE_IP_ADDRESS\020Y\022E\nAWEBPAGE_CONDITIO" +
      "N_URL_DOMAIN_NOT_CONSISTENT_WITH_CAMPAIG" +
      "N_SETTING\020Z\0221\n-WEBPAGE_CONDITION_URL_CAN" +
      "NOT_BE_PUBLIC_SUFFIX\020[\022/\n+WEBPAGE_CONDIT" +
      "ION_URL_INVALID_PUBLIC_SUFFIX\020\\\0229\n5WEBPA" +
      "GE_CONDITION_URL_VALUE_TRACK_VALUE_NOT_S" +
      "UPPORTED\020]\022<\n8WEBPAGE_CRITERION_URL_EQUA" +
      "LS_CAN_HAVE_ONLY_ONE_CONDITION\020^\0227\n3WEBP" +
      "AGE_CRITERION_NOT_SUPPORTED_ON_NON_DSA_A" +
      "D_GROUP\020_\0227\n3CANNOT_TARGET_USER_LIST_FOR" +
      "_SMART_DISPLAY_CAMPAIGNS\020c\0221\n-CANNOT_TAR" +
      "GET_PLACEMENTS_FOR_SEARCH_CAMPAIGNS\020~\022*\n" +
      "&LISTING_SCOPE_TOO_MANY_DIMENSION_TYPES\020" +
      "d\022\'\n#LISTING_SCOPE_TOO_MANY_IN_OPERATORS" +
      "\020e\022+\n\'LISTING_SCOPE_IN_OPERATOR_NOT_SUPP" +
      "ORTED\020f\022$\n DUPLICATE_LISTING_DIMENSION_T" +
      "YPE\020g\022%\n!DUPLICATE_LISTING_DIMENSION_VAL" +
      "UE\020h\0220\n,CANNOT_SET_BIDS_ON_LISTING_GROUP" +
      "_SUBDIVISION\020i\022#\n\037INVALID_LISTING_GROUP_" +
      "HIERARCHY\020j\022+\n\'LISTING_GROUP_UNIT_CANNOT" +
      "_HAVE_CHILDREN\020k\0222\n.LISTING_GROUP_SUBDIV" +
      "ISION_REQUIRES_OTHERS_CASE\020l\022:\n6LISTING_" +
      "GROUP_REQUIRES_SAME_DIMENSION_TYPE_AS_SI" +
      "BLINGS\020m\022 \n\034LISTING_GROUP_ALREADY_EXISTS" +
      "\020n\022 \n\034LISTING_GROUP_DOES_NOT_EXIST\020o\022#\n\037" +
      "LISTING_GROUP_CANNOT_BE_REMOVED\020p\022\036\n\032INV" +
      "ALID_LISTING_GROUP_TYPE\020q\022*\n&LISTING_GRO" +
      "UP_ADD_MAY_ONLY_USE_TEMP_ID\020r\022\032\n\026LISTING" +
      "_SCOPE_TOO_LONG\020s\022%\n!LISTING_SCOPE_TOO_M" +
      "ANY_DIMENSIONS\020t\022\032\n\026LISTING_GROUP_TOO_LO" +
      "NG\020u\022\037\n\033LISTING_GROUP_TREE_TOO_DEEP\020v\022\035\n" +
      "\031INVALID_LISTING_DIMENSION\020w\022\"\n\036INVALID_" +
      "LISTING_DIMENSION_TYPE\020x\022@\n<ADVERTISER_N" +
      "OT_ON_ALLOWLIST_FOR_COMBINED_AUDIENCE_ON" +
      "_DISPLAY\020\177\022,\n\'CANNOT_TARGET_REMOVED_COMB" +
      "INED_AUDIENCE\020\200\001\022!\n\034INVALID_COMBINED_AUD" +
      "IENCE_ID\020\201\001\022*\n%CANNOT_TARGET_REMOVED_CUS" +
      "TOM_AUDIENCE\020\202\001\022?\n:HOTEL_CHECK_IN_DATE_R" +
      "ANGE_OVERLAPS_WITH_EXISTING_CRITERION\020\203\001" +
      "\0223\n.HOTEL_CHECK_IN_DATE_RANGE_START_DATE" +
      "_TOO_EARLY\020\204\001\0220\n+HOTEL_CHECK_IN_DATE_RAN" +
      "GE_END_DATE_TOO_LATE\020\205\001\022\'\n\"HOTEL_CHECK_I" +
      "N_DATE_RANGE_REVERSED\020\206\001\022-\n(BROAD_MATCH_" +
      "MODIFIER_KEYWORD_NOT_ALLOWED\020\207\001\022)\n$ONE_A" +
      "UDIENCE_ALLOWED_PER_ASSET_GROUP\020\210\001\022,\n\'AU" +
      "DIENCE_NOT_ELIGIBLE_FOR_CAMPAIGN_TYPE\020\211\001" +
      "\022F\nAAUDIENCE_NOT_ALLOWED_TO_ATTACH_WHEN_" +
      "AUDIENCE_GROUPED_SET_TO_FALSE\020\212\001\022+\n&CANN" +
      "OT_TARGET_CUSTOMER_MATCH_USER_LIST\020\213\001B\363\001" +
      "\n#com.google.ads.googleads.v11.errorsB\023C" +
      "riterionErrorProtoP\001ZEgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v11/er" +
      "rors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds" +
      ".V11.Errors\312\002\037Google\\Ads\\GoogleAds\\V11\\E" +
      "rrors\352\002#Google::Ads::GoogleAds::V11::Err" +
      "orsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v11_errors_CriterionErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_errors_CriterionErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_errors_CriterionErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
