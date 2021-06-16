// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/metrics.proto

package com.google.ads.googleads.v8.common;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v8/common/metrics" +
      ".proto\022\036google.ads.googleads.v8.common\032:" +
      "google/ads/googleads/v8/enums/interactio" +
      "n_event_type.proto\0328google/ads/googleads" +
      "/v8/enums/quality_score_bucket.proto\032\034go" +
      "ogle/api/annotations.proto\"\257D\n\007Metrics\0220" +
      "\n\"absolute_top_impression_percentage\030\267\001 " +
      "\001(\001H\000\210\001\001\022\035\n\017active_view_cpm\030\270\001 \001(\001H\001\210\001\001\022" +
      "\035\n\017active_view_ctr\030\271\001 \001(\001H\002\210\001\001\022%\n\027active" +
      "_view_impressions\030\272\001 \001(\003H\003\210\001\001\022\'\n\031active_" +
      "view_measurability\030\273\001 \001(\001H\004\210\001\001\0220\n\"active" +
      "_view_measurable_cost_micros\030\274\001 \001(\003H\005\210\001\001" +
      "\0220\n\"active_view_measurable_impressions\030\275" +
      "\001 \001(\003H\006\210\001\001\022%\n\027active_view_viewability\030\276\001" +
      " \001(\001H\007\210\001\001\0224\n&all_conversions_from_intera" +
      "ctions_rate\030\277\001 \001(\001H\010\210\001\001\022#\n\025all_conversio" +
      "ns_value\030\300\001 \001(\001H\t\210\001\001\0221\n(all_conversions_" +
      "value_by_conversion_date\030\360\001 \001(\001\022\035\n\017all_c" +
      "onversions\030\301\001 \001(\001H\n\210\001\001\022+\n\"all_conversion" +
      "s_by_conversion_date\030\361\001 \001(\001\022,\n\036all_conve" +
      "rsions_value_per_cost\030\302\001 \001(\001H\013\210\001\001\0220\n\"all" +
      "_conversions_from_click_to_call\030\303\001 \001(\001H\014" +
      "\210\001\001\022-\n\037all_conversions_from_directions\030\304" +
      "\001 \001(\001H\r\210\001\001\022E\n7all_conversions_from_inter" +
      "actions_value_per_interaction\030\305\001 \001(\001H\016\210\001" +
      "\001\022\'\n\031all_conversions_from_menu\030\306\001 \001(\001H\017\210" +
      "\001\001\022(\n\032all_conversions_from_order\030\307\001 \001(\001H" +
      "\020\210\001\001\0223\n%all_conversions_from_other_engag" +
      "ement\030\310\001 \001(\001H\021\210\001\001\022.\n all_conversions_fro" +
      "m_store_visit\030\311\001 \001(\001H\022\210\001\001\0220\n\"all_convers" +
      "ions_from_store_website\030\312\001 \001(\001H\023\210\001\001\022\032\n\014a" +
      "verage_cost\030\313\001 \001(\001H\024\210\001\001\022\031\n\013average_cpc\030\314" +
      "\001 \001(\001H\025\210\001\001\022\031\n\013average_cpe\030\315\001 \001(\001H\026\210\001\001\022\031\n" +
      "\013average_cpm\030\316\001 \001(\001H\027\210\001\001\022\031\n\013average_cpv\030" +
      "\317\001 \001(\001H\030\210\001\001\022 \n\022average_page_views\030\320\001 \001(\001" +
      "H\031\210\001\001\022\"\n\024average_time_on_site\030\321\001 \001(\001H\032\210\001" +
      "\001\022\'\n\031benchmark_average_max_cpc\030\322\001 \001(\001H\033\210" +
      "\001\001\022\033\n\rbenchmark_ctr\030\323\001 \001(\001H\034\210\001\001\022\031\n\013bounc" +
      "e_rate\030\324\001 \001(\001H\035\210\001\001\022\024\n\006clicks\030\203\001 \001(\003H\036\210\001\001" +
      "\022\035\n\017combined_clicks\030\234\001 \001(\003H\037\210\001\001\022\'\n\031combi" +
      "ned_clicks_per_query\030\235\001 \001(\001H \210\001\001\022\036\n\020comb" +
      "ined_queries\030\236\001 \001(\003H!\210\001\001\0222\n$content_budg" +
      "et_lost_impression_share\030\237\001 \001(\001H\"\210\001\001\022&\n\030" +
      "content_impression_share\030\240\001 \001(\001H#\210\001\001\0228\n*" +
      "conversion_last_received_request_date_ti" +
      "me\030\241\001 \001(\tH$\210\001\001\022-\n\037conversion_last_conver" +
      "sion_date\030\242\001 \001(\tH%\210\001\001\0220\n\"content_rank_lo" +
      "st_impression_share\030\243\001 \001(\001H&\210\001\001\0220\n\"conve" +
      "rsions_from_interactions_rate\030\244\001 \001(\001H\'\210\001" +
      "\001\022\037\n\021conversions_value\030\245\001 \001(\001H(\210\001\001\022-\n$co" +
      "nversions_value_by_conversion_date\030\362\001 \001(" +
      "\001\022(\n\032conversions_value_per_cost\030\246\001 \001(\001H)" +
      "\210\001\001\022A\n3conversions_from_interactions_val" +
      "ue_per_interaction\030\247\001 \001(\001H*\210\001\001\022\031\n\013conver" +
      "sions\030\250\001 \001(\001H+\210\001\001\022\'\n\036conversions_by_conv" +
      "ersion_date\030\363\001 \001(\001\022\031\n\013cost_micros\030\251\001 \001(\003" +
      "H,\210\001\001\022&\n\030cost_per_all_conversions\030\252\001 \001(\001" +
      "H-\210\001\001\022!\n\023cost_per_conversion\030\253\001 \001(\001H.\210\001\001" +
      "\022:\n,cost_per_current_model_attributed_co" +
      "nversion\030\254\001 \001(\001H/\210\001\001\022&\n\030cross_device_con" +
      "versions\030\255\001 \001(\001H0\210\001\001\022\021\n\003ctr\030\256\001 \001(\001H1\210\001\001\022" +
      "2\n$current_model_attributed_conversions\030" +
      "\257\001 \001(\001H2\210\001\001\022I\n;current_model_attributed_" +
      "conversions_from_interactions_rate\030\260\001 \001(" +
      "\001H3\210\001\001\022Z\nLcurrent_model_attributed_conve" +
      "rsions_from_interactions_value_per_inter" +
      "action\030\261\001 \001(\001H4\210\001\001\0228\n*current_model_attr" +
      "ibuted_conversions_value\030\262\001 \001(\001H5\210\001\001\022A\n3" +
      "current_model_attributed_conversions_val" +
      "ue_per_cost\030\263\001 \001(\001H6\210\001\001\022\035\n\017engagement_ra" +
      "te\030\264\001 \001(\001H7\210\001\001\022\031\n\013engagements\030\265\001 \001(\003H8\210\001" +
      "\001\022-\n\037hotel_average_lead_value_micros\030\325\001 " +
      "\001(\001H9\210\001\001\022/\n!hotel_price_difference_perce" +
      "ntage\030\326\001 \001(\001H:\210\001\001\022(\n\032hotel_eligible_impr" +
      "essions\030\327\001 \001(\003H;\210\001\001\022s\n!historical_creati" +
      "ve_quality_score\030P \001(\0162H.google.ads.goog" +
      "leads.v8.enums.QualityScoreBucketEnum.Qu" +
      "alityScoreBucket\022w\n%historical_landing_p" +
      "age_quality_score\030Q \001(\0162H.google.ads.goo" +
      "gleads.v8.enums.QualityScoreBucketEnum.Q" +
      "ualityScoreBucket\022&\n\030historical_quality_" +
      "score\030\330\001 \001(\003H<\210\001\001\022q\n\037historical_search_p" +
      "redicted_ctr\030S \001(\0162H.google.ads.googlead" +
      "s.v8.enums.QualityScoreBucketEnum.Qualit" +
      "yScoreBucket\022\034\n\016gmail_forwards\030\331\001 \001(\003H=\210" +
      "\001\001\022\031\n\013gmail_saves\030\332\001 \001(\003H>\210\001\001\022$\n\026gmail_s" +
      "econdary_clicks\030\333\001 \001(\003H?\210\001\001\022*\n\034impressio" +
      "ns_from_store_reach\030\334\001 \001(\003H@\210\001\001\022\031\n\013impre" +
      "ssions\030\335\001 \001(\003HA\210\001\001\022\036\n\020interaction_rate\030\336" +
      "\001 \001(\001HB\210\001\001\022\032\n\014interactions\030\337\001 \001(\003HC\210\001\001\022m" +
      "\n\027interaction_event_types\030d \003(\0162L.google" +
      ".ads.googleads.v8.enums.InteractionEvent" +
      "TypeEnum.InteractionEventType\022 \n\022invalid" +
      "_click_rate\030\340\001 \001(\001HD\210\001\001\022\034\n\016invalid_click" +
      "s\030\341\001 \001(\003HE\210\001\001\022\033\n\rmessage_chats\030\342\001 \001(\003HF\210" +
      "\001\001\022!\n\023message_impressions\030\343\001 \001(\003HG\210\001\001\022\037\n" +
      "\021message_chat_rate\030\344\001 \001(\001HH\210\001\001\022/\n!mobile" +
      "_friendly_clicks_percentage\030\345\001 \001(\001HI\210\001\001\022" +
      "\'\n\031optimization_score_uplift\030\367\001 \001(\001HJ\210\001\001" +
      "\022$\n\026optimization_score_url\030\370\001 \001(\tHK\210\001\001\022\034" +
      "\n\016organic_clicks\030\346\001 \001(\003HL\210\001\001\022&\n\030organic_" +
      "clicks_per_query\030\347\001 \001(\001HM\210\001\001\022!\n\023organic_" +
      "impressions\030\350\001 \001(\003HN\210\001\001\022+\n\035organic_impre" +
      "ssions_per_query\030\351\001 \001(\001HO\210\001\001\022\035\n\017organic_" +
      "queries\030\352\001 \001(\003HP\210\001\001\022\"\n\024percent_new_visit" +
      "ors\030\353\001 \001(\001HQ\210\001\001\022\031\n\013phone_calls\030\354\001 \001(\003HR\210" +
      "\001\001\022\037\n\021phone_impressions\030\355\001 \001(\003HS\210\001\001\022 \n\022p" +
      "hone_through_rate\030\356\001 \001(\001HT\210\001\001\022\032\n\014relativ" +
      "e_ctr\030\357\001 \001(\001HU\210\001\001\0222\n$search_absolute_top" +
      "_impression_share\030\210\001 \001(\001HV\210\001\001\022>\n0search_" +
      "budget_lost_absolute_top_impression_shar" +
      "e\030\211\001 \001(\001HW\210\001\001\0221\n#search_budget_lost_impr" +
      "ession_share\030\212\001 \001(\001HX\210\001\001\0225\n\'search_budge" +
      "t_lost_top_impression_share\030\213\001 \001(\001HY\210\001\001\022" +
      " \n\022search_click_share\030\214\001 \001(\001HZ\210\001\001\0221\n#sea" +
      "rch_exact_match_impression_share\030\215\001 \001(\001H" +
      "[\210\001\001\022%\n\027search_impression_share\030\216\001 \001(\001H\\" +
      "\210\001\001\022<\n.search_rank_lost_absolute_top_imp" +
      "ression_share\030\217\001 \001(\001H]\210\001\001\022/\n!search_rank" +
      "_lost_impression_share\030\220\001 \001(\001H^\210\001\001\0223\n%se" +
      "arch_rank_lost_top_impression_share\030\221\001 \001" +
      "(\001H_\210\001\001\022)\n\033search_top_impression_share\030\222" +
      "\001 \001(\001H`\210\001\001\022\031\n\013speed_score\030\223\001 \001(\003Ha\210\001\001\022\'\n" +
      "\031top_impression_percentage\030\224\001 \001(\001Hb\210\001\001\022>" +
      "\n0valid_accelerated_mobile_pages_clicks_" +
      "percentage\030\225\001 \001(\001Hc\210\001\001\022\'\n\031value_per_all_" +
      "conversions\030\226\001 \001(\001Hd\210\001\001\022:\n,value_per_all" +
      "_conversions_by_conversion_date\030\364\001 \001(\001He" +
      "\210\001\001\022\"\n\024value_per_conversion\030\227\001 \001(\001Hf\210\001\001\022" +
      "6\n(value_per_conversions_by_conversion_d" +
      "ate\030\365\001 \001(\001Hg\210\001\001\022;\n-value_per_current_mod" +
      "el_attributed_conversion\030\230\001 \001(\001Hh\210\001\001\022&\n\030" +
      "video_quartile_p100_rate\030\204\001 \001(\001Hi\210\001\001\022%\n\027" +
      "video_quartile_p25_rate\030\205\001 \001(\001Hj\210\001\001\022%\n\027v" +
      "ideo_quartile_p50_rate\030\206\001 \001(\001Hk\210\001\001\022%\n\027vi" +
      "deo_quartile_p75_rate\030\207\001 \001(\001Hl\210\001\001\022\035\n\017vid" +
      "eo_view_rate\030\231\001 \001(\001Hm\210\001\001\022\031\n\013video_views\030" +
      "\232\001 \001(\003Hn\210\001\001\022&\n\030view_through_conversions\030" +
      "\233\001 \001(\003Ho\210\001\001\022\"\n\031sk_ad_network_conversions" +
      "\030\366\001 \001(\003B%\n#_absolute_top_impression_perc" +
      "entageB\022\n\020_active_view_cpmB\022\n\020_active_vi" +
      "ew_ctrB\032\n\030_active_view_impressionsB\034\n\032_a" +
      "ctive_view_measurabilityB%\n#_active_view" +
      "_measurable_cost_microsB%\n#_active_view_" +
      "measurable_impressionsB\032\n\030_active_view_v" +
      "iewabilityB)\n\'_all_conversions_from_inte" +
      "ractions_rateB\030\n\026_all_conversions_valueB" +
      "\022\n\020_all_conversionsB!\n\037_all_conversions_" +
      "value_per_costB%\n#_all_conversions_from_" +
      "click_to_callB\"\n _all_conversions_from_d" +
      "irectionsB:\n8_all_conversions_from_inter" +
      "actions_value_per_interactionB\034\n\032_all_co" +
      "nversions_from_menuB\035\n\033_all_conversions_" +
      "from_orderB(\n&_all_conversions_from_othe" +
      "r_engagementB#\n!_all_conversions_from_st" +
      "ore_visitB%\n#_all_conversions_from_store" +
      "_websiteB\017\n\r_average_costB\016\n\014_average_cp" +
      "cB\016\n\014_average_cpeB\016\n\014_average_cpmB\016\n\014_av" +
      "erage_cpvB\025\n\023_average_page_viewsB\027\n\025_ave" +
      "rage_time_on_siteB\034\n\032_benchmark_average_" +
      "max_cpcB\020\n\016_benchmark_ctrB\016\n\014_bounce_rat" +
      "eB\t\n\007_clicksB\022\n\020_combined_clicksB\034\n\032_com" +
      "bined_clicks_per_queryB\023\n\021_combined_quer" +
      "iesB\'\n%_content_budget_lost_impression_s" +
      "hareB\033\n\031_content_impression_shareB-\n+_co" +
      "nversion_last_received_request_date_time" +
      "B\"\n _conversion_last_conversion_dateB%\n#" +
      "_content_rank_lost_impression_shareB%\n#_" +
      "conversions_from_interactions_rateB\024\n\022_c" +
      "onversions_valueB\035\n\033_conversions_value_p" +
      "er_costB6\n4_conversions_from_interaction" +
      "s_value_per_interactionB\016\n\014_conversionsB" +
      "\016\n\014_cost_microsB\033\n\031_cost_per_all_convers" +
      "ionsB\026\n\024_cost_per_conversionB/\n-_cost_pe" +
      "r_current_model_attributed_conversionB\033\n" +
      "\031_cross_device_conversionsB\006\n\004_ctrB\'\n%_c" +
      "urrent_model_attributed_conversionsB>\n<_" +
      "current_model_attributed_conversions_fro" +
      "m_interactions_rateBO\nM_current_model_at" +
      "tributed_conversions_from_interactions_v" +
      "alue_per_interactionB-\n+_current_model_a" +
      "ttributed_conversions_valueB6\n4_current_" +
      "model_attributed_conversions_value_per_c" +
      "ostB\022\n\020_engagement_rateB\016\n\014_engagementsB" +
      "\"\n _hotel_average_lead_value_microsB$\n\"_" +
      "hotel_price_difference_percentageB\035\n\033_ho" +
      "tel_eligible_impressionsB\033\n\031_historical_" +
      "quality_scoreB\021\n\017_gmail_forwardsB\016\n\014_gma" +
      "il_savesB\031\n\027_gmail_secondary_clicksB\037\n\035_" +
      "impressions_from_store_reachB\016\n\014_impress" +
      "ionsB\023\n\021_interaction_rateB\017\n\r_interactio" +
      "nsB\025\n\023_invalid_click_rateB\021\n\017_invalid_cl" +
      "icksB\020\n\016_message_chatsB\026\n\024_message_impre" +
      "ssionsB\024\n\022_message_chat_rateB$\n\"_mobile_" +
      "friendly_clicks_percentageB\034\n\032_optimizat" +
      "ion_score_upliftB\031\n\027_optimization_score_" +
      "urlB\021\n\017_organic_clicksB\033\n\031_organic_click" +
      "s_per_queryB\026\n\024_organic_impressionsB \n\036_" +
      "organic_impressions_per_queryB\022\n\020_organi" +
      "c_queriesB\027\n\025_percent_new_visitorsB\016\n\014_p" +
      "hone_callsB\024\n\022_phone_impressionsB\025\n\023_pho" +
      "ne_through_rateB\017\n\r_relative_ctrB\'\n%_sea" +
      "rch_absolute_top_impression_shareB3\n1_se" +
      "arch_budget_lost_absolute_top_impression" +
      "_shareB&\n$_search_budget_lost_impression" +
      "_shareB*\n(_search_budget_lost_top_impres" +
      "sion_shareB\025\n\023_search_click_shareB&\n$_se" +
      "arch_exact_match_impression_shareB\032\n\030_se" +
      "arch_impression_shareB1\n/_search_rank_lo" +
      "st_absolute_top_impression_shareB$\n\"_sea" +
      "rch_rank_lost_impression_shareB(\n&_searc" +
      "h_rank_lost_top_impression_shareB\036\n\034_sea" +
      "rch_top_impression_shareB\016\n\014_speed_score" +
      "B\034\n\032_top_impression_percentageB3\n1_valid" +
      "_accelerated_mobile_pages_clicks_percent" +
      "ageB\034\n\032_value_per_all_conversionsB/\n-_va" +
      "lue_per_all_conversions_by_conversion_da" +
      "teB\027\n\025_value_per_conversionB+\n)_value_pe" +
      "r_conversions_by_conversion_dateB0\n._val" +
      "ue_per_current_model_attributed_conversi" +
      "onB\033\n\031_video_quartile_p100_rateB\032\n\030_vide" +
      "o_quartile_p25_rateB\032\n\030_video_quartile_p" +
      "50_rateB\032\n\030_video_quartile_p75_rateB\022\n\020_" +
      "video_view_rateB\016\n\014_video_viewsB\033\n\031_view" +
      "_through_conversionsB\347\001\n\"com.google.ads." +
      "googleads.v8.commonB\014MetricsProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v8/common;common\242\002\003GAA\252\002\036Google" +
      ".Ads.GoogleAds.V8.Common\312\002\036Google\\Ads\\Go" +
      "ogleAds\\V8\\Common\352\002\"Google::Ads::GoogleA" +
      "ds::V8::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversionsValueByConversionDate", "AllConversions", "AllConversionsByConversionDate", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValueByConversionDate", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "ConversionsByConversionDate", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", "SkAdNetworkConversions", "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalQualityScore", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", });
    com.google.ads.googleads.v8.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.QualityScoreBucketProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
