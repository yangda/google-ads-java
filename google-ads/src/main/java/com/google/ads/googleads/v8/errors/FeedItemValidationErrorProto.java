// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/errors/feed_item_validation_error.proto

package com.google.ads.googleads.v8.errors;

public final class FeedItemValidationErrorProto {
  private FeedItemValidationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_errors_FeedItemValidationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_errors_FeedItemValidationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v8/errors/feed_it" +
      "em_validation_error.proto\022\036google.ads.go" +
      "ogleads.v8.errors\032\034google/api/annotation" +
      "s.proto\"\356\033\n\033FeedItemValidationErrorEnum\"" +
      "\316\033\n\027FeedItemValidationError\022\017\n\013UNSPECIFI" +
      "ED\020\000\022\013\n\007UNKNOWN\020\001\022\024\n\020STRING_TOO_SHORT\020\002\022" +
      "\023\n\017STRING_TOO_LONG\020\003\022\027\n\023VALUE_NOT_SPECIF" +
      "IED\020\004\022(\n$INVALID_DOMESTIC_PHONE_NUMBER_F" +
      "ORMAT\020\005\022\030\n\024INVALID_PHONE_NUMBER\020\006\022*\n&PHO" +
      "NE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY\020\007\022#\n" +
      "\037PREMIUM_RATE_NUMBER_NOT_ALLOWED\020\010\022\032\n\026DI" +
      "SALLOWED_NUMBER_TYPE\020\t\022\026\n\022VALUE_OUT_OF_R" +
      "ANGE\020\n\022*\n&CALLTRACKING_NOT_SUPPORTED_FOR" +
      "_COUNTRY\020\013\022.\n*CUSTOMER_NOT_IN_ALLOWLIST_" +
      "FOR_CALLTRACKING\020c\022\030\n\024INVALID_COUNTRY_CO" +
      "DE\020\r\022\022\n\016INVALID_APP_ID\020\016\022!\n\035MISSING_ATTR" +
      "IBUTES_FOR_FIELDS\020\017\022\023\n\017INVALID_TYPE_ID\020\020" +
      "\022\031\n\025INVALID_EMAIL_ADDRESS\020\021\022\025\n\021INVALID_H" +
      "TTPS_URL\020\022\022\034\n\030MISSING_DELIVERY_ADDRESS\020\023" +
      "\022\035\n\031START_DATE_AFTER_END_DATE\020\024\022 \n\034MISSI" +
      "NG_FEED_ITEM_START_TIME\020\025\022\036\n\032MISSING_FEE" +
      "D_ITEM_END_TIME\020\026\022\030\n\024MISSING_FEED_ITEM_I" +
      "D\020\027\022#\n\037VANITY_PHONE_NUMBER_NOT_ALLOWED\020\030" +
      "\022$\n INVALID_REVIEW_EXTENSION_SNIPPET\020\031\022\031" +
      "\n\025INVALID_NUMBER_FORMAT\020\032\022\027\n\023INVALID_DAT" +
      "E_FORMAT\020\033\022\030\n\024INVALID_PRICE_FORMAT\020\034\022\035\n\031" +
      "UNKNOWN_PLACEHOLDER_FIELD\020\035\022.\n*MISSING_E" +
      "NHANCED_SITELINK_DESCRIPTION_LINE\020\036\022&\n\"R" +
      "EVIEW_EXTENSION_SOURCE_INELIGIBLE\020\037\022\'\n#H" +
      "YPHENS_IN_REVIEW_EXTENSION_SNIPPET\020 \022-\n)" +
      "DOUBLE_QUOTES_IN_REVIEW_EXTENSION_SNIPPE" +
      "T\020!\022&\n\"QUOTES_IN_REVIEW_EXTENSION_SNIPPE" +
      "T\020\"\022\037\n\033INVALID_FORM_ENCODED_PARAMS\020#\022\036\n\032" +
      "INVALID_URL_PARAMETER_NAME\020$\022\027\n\023NO_GEOCO" +
      "DING_RESULT\020%\022(\n$SOURCE_NAME_IN_REVIEW_E" +
      "XTENSION_TEXT\020&\022-\n)CARRIER_SPECIFIC_SHOR" +
      "T_NUMBER_NOT_ALLOWED\020\'\022 \n\034INVALID_PLACEH" +
      "OLDER_FIELD_ID\020(\022\023\n\017INVALID_URL_TAG\020)\022\021\n" +
      "\rLIST_TOO_LONG\020*\022\"\n\036INVALID_ATTRIBUTES_C" +
      "OMBINATION\020+\022\024\n\020DUPLICATE_VALUES\020,\022%\n!IN" +
      "VALID_CALL_CONVERSION_ACTION_ID\020-\022!\n\035CAN" +
      "NOT_SET_WITHOUT_FINAL_URLS\020.\022$\n APP_ID_D" +
      "OESNT_EXIST_IN_APP_STORE\020/\022\025\n\021INVALID_FI" +
      "NAL_URL\0200\022\030\n\024INVALID_TRACKING_URL\0201\022*\n&I" +
      "NVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL\0202\022" +
      "\022\n\016LIST_TOO_SHORT\0203\022\027\n\023INVALID_USER_ACTI" +
      "ON\0204\022\025\n\021INVALID_TYPE_NAME\0205\022\037\n\033INVALID_E" +
      "VENT_CHANGE_STATUS\0206\022\033\n\027INVALID_SNIPPETS" +
      "_HEADER\0207\022\034\n\030INVALID_ANDROID_APP_LINK\0208\022" +
      ";\n7NUMBER_TYPE_WITH_CALLTRACKING_NOT_SUP" +
      "PORTED_FOR_COUNTRY\0209\022\032\n\026RESERVED_KEYWORD" +
      "_OTHER\020:\022\033\n\027DUPLICATE_OPTION_LABELS\020;\022\035\n" +
      "\031DUPLICATE_OPTION_PREFILLS\020<\022\030\n\024UNEQUAL_" +
      "LIST_LENGTHS\020=\022\037\n\033INCONSISTENT_CURRENCY_" +
      "CODES\020>\022*\n&PRICE_EXTENSION_HAS_DUPLICATE" +
      "D_HEADERS\020?\022.\n*ITEM_HAS_DUPLICATED_HEADE" +
      "R_AND_DESCRIPTION\020@\022%\n!PRICE_EXTENSION_H" +
      "AS_TOO_FEW_ITEMS\020A\022\025\n\021UNSUPPORTED_VALUE\020" +
      "B\022\034\n\030INVALID_FINAL_MOBILE_URL\020C\022%\n!INVAL" +
      "ID_KEYWORDLESS_AD_RULE_LABEL\020D\022\'\n#VALUE_" +
      "TRACK_PARAMETER_NOT_SUPPORTED\020E\022*\n&UNSUP" +
      "PORTED_VALUE_IN_SELECTED_LANGUAGE\020F\022\030\n\024I" +
      "NVALID_IOS_APP_LINK\020G\022,\n(MISSING_IOS_APP" +
      "_LINK_OR_IOS_APP_STORE_ID\020H\022\032\n\026PROMOTION" +
      "_INVALID_TIME\020I\0229\n5PROMOTION_CANNOT_SET_" +
      "PERCENT_OFF_AND_MONEY_AMOUNT_OFF\020J\022>\n:PR" +
      "OMOTION_CANNOT_SET_PROMOTION_CODE_AND_OR" +
      "DERS_OVER_AMOUNT\020K\022%\n!TOO_MANY_DECIMAL_P" +
      "LACES_SPECIFIED\020L\022\036\n\032AD_CUSTOMIZERS_NOT_" +
      "ALLOWED\020M\022\031\n\025INVALID_LANGUAGE_CODE\020N\022\030\n\024" +
      "UNSUPPORTED_LANGUAGE\020O\022\033\n\027IF_FUNCTION_NO" +
      "T_ALLOWED\020P\022\034\n\030INVALID_FINAL_URL_SUFFIX\020" +
      "Q\022#\n\037INVALID_TAG_IN_FINAL_URL_SUFFIX\020R\022#" +
      "\n\037INVALID_FINAL_URL_SUFFIX_FORMAT\020S\0220\n,C" +
      "USTOMER_CONSENT_FOR_CALL_RECORDING_REQUI" +
      "RED\020T\022\'\n#ONLY_ONE_DELIVERY_OPTION_IS_ALL" +
      "OWED\020U\022\035\n\031NO_DELIVERY_OPTION_IS_SET\020V\022&\n" +
      "\"INVALID_CONVERSION_REPORTING_STATE\020W\022\024\n" +
      "\020IMAGE_SIZE_WRONG\020X\022+\n\'EMAIL_DELIVERY_NO" +
      "T_AVAILABLE_IN_COUNTRY\020Y\022\'\n#AUTO_REPLY_N" +
      "OT_AVAILABLE_IN_COUNTRY\020Z\022\032\n\026INVALID_LAT" +
      "ITUDE_VALUE\020[\022\033\n\027INVALID_LONGITUDE_VALUE" +
      "\020\\\022\023\n\017TOO_MANY_LABELS\020]\022\025\n\021INVALID_IMAGE" +
      "_URL\020^\022\032\n\026MISSING_LATITUDE_VALUE\020_\022\033\n\027MI" +
      "SSING_LONGITUDE_VALUE\020`\022\025\n\021ADDRESS_NOT_F" +
      "OUND\020a\022\032\n\026ADDRESS_NOT_TARGETABLE\020b\022\024\n\020IN" +
      "VALID_ASSET_ID\020d\022\033\n\027INCOMPATIBLE_ASSET_T" +
      "YPE\020e\022\037\n\033IMAGE_ERROR_UNEXPECTED_SIZE\020f\022(" +
      "\n$IMAGE_ERROR_ASPECT_RATIO_NOT_ALLOWED\020g" +
      "\022\036\n\032IMAGE_ERROR_FILE_TOO_LARGE\020h\022\"\n\036IMAG" +
      "E_ERROR_FORMAT_NOT_ALLOWED\020i\022$\n IMAGE_ER" +
      "ROR_CONSTRAINTS_VIOLATED\020j\022\034\n\030IMAGE_ERRO" +
      "R_SERVER_ERROR\020kB\367\001\n\"com.google.ads.goog" +
      "leads.v8.errorsB\034FeedItemValidationError" +
      "ProtoP\001ZDgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v8/errors;errors\242\002\003" +
      "GAA\252\002\036Google.Ads.GoogleAds.V8.Errors\312\002\036G" +
      "oogle\\Ads\\GoogleAds\\V8\\Errors\352\002\"Google::" +
      "Ads::GoogleAds::V8::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_errors_FeedItemValidationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_errors_FeedItemValidationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_errors_FeedItemValidationErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
