// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/metrics.proto

package com.google.ads.googleads.v11.common;

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
    internal_static_google_ads_googleads_v11_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v11/common/metric" +
      "s.proto\022\037google.ads.googleads.v11.common" +
      "\032;google/ads/googleads/v11/enums/interac" +
      "tion_event_type.proto\0329google/ads/google" +
      "ads/v11/enums/quality_score_bucket.proto" +
      "\"\213L\n\007Metrics\0220\n\"absolute_top_impression_" +
      "percentage\030\267\001 \001(\001H\000\210\001\001\022\035\n\017active_view_cp" +
      "m\030\270\001 \001(\001H\001\210\001\001\022\035\n\017active_view_ctr\030\271\001 \001(\001H" +
      "\002\210\001\001\022%\n\027active_view_impressions\030\272\001 \001(\003H\003" +
      "\210\001\001\022\'\n\031active_view_measurability\030\273\001 \001(\001H" +
      "\004\210\001\001\0220\n\"active_view_measurable_cost_micr" +
      "os\030\274\001 \001(\003H\005\210\001\001\0220\n\"active_view_measurable" +
      "_impressions\030\275\001 \001(\003H\006\210\001\001\022%\n\027active_view_" +
      "viewability\030\276\001 \001(\001H\007\210\001\001\0224\n&all_conversio" +
      "ns_from_interactions_rate\030\277\001 \001(\001H\010\210\001\001\022#\n" +
      "\025all_conversions_value\030\300\001 \001(\001H\t\210\001\001\0221\n(al" +
      "l_conversions_value_by_conversion_date\030\360" +
      "\001 \001(\001\022\035\n\017all_conversions\030\301\001 \001(\001H\n\210\001\001\022+\n\"" +
      "all_conversions_by_conversion_date\030\361\001 \001(" +
      "\001\022,\n\036all_conversions_value_per_cost\030\302\001 \001" +
      "(\001H\013\210\001\001\0220\n\"all_conversions_from_click_to" +
      "_call\030\303\001 \001(\001H\014\210\001\001\022-\n\037all_conversions_fro" +
      "m_directions\030\304\001 \001(\001H\r\210\001\001\022E\n7all_conversi" +
      "ons_from_interactions_value_per_interact" +
      "ion\030\305\001 \001(\001H\016\210\001\001\022\'\n\031all_conversions_from_" +
      "menu\030\306\001 \001(\001H\017\210\001\001\022(\n\032all_conversions_from" +
      "_order\030\307\001 \001(\001H\020\210\001\001\0223\n%all_conversions_fr" +
      "om_other_engagement\030\310\001 \001(\001H\021\210\001\001\022.\n all_c" +
      "onversions_from_store_visit\030\311\001 \001(\001H\022\210\001\001\022" +
      "0\n\"all_conversions_from_store_website\030\312\001" +
      " \001(\001H\023\210\001\001\022G\n9auction_insight_search_abso" +
      "lute_top_impression_percentage\030\202\002 \001(\001H\024\210" +
      "\001\001\0225\n\'auction_insight_search_impression_" +
      "share\030\203\002 \001(\001H\025\210\001\001\0225\n\'auction_insight_sea" +
      "rch_outranking_share\030\204\002 \001(\001H\026\210\001\001\0221\n#auct" +
      "ion_insight_search_overlap_rate\030\205\002 \001(\001H\027" +
      "\210\001\001\0228\n*auction_insight_search_position_a" +
      "bove_rate\030\206\002 \001(\001H\030\210\001\001\022>\n0auction_insight" +
      "_search_top_impression_percentage\030\207\002 \001(\001" +
      "H\031\210\001\001\022\032\n\014average_cost\030\313\001 \001(\001H\032\210\001\001\022\031\n\013ave" +
      "rage_cpc\030\314\001 \001(\001H\033\210\001\001\022\031\n\013average_cpe\030\315\001 \001" +
      "(\001H\034\210\001\001\022\031\n\013average_cpm\030\316\001 \001(\001H\035\210\001\001\022\031\n\013av" +
      "erage_cpv\030\317\001 \001(\001H\036\210\001\001\022 \n\022average_page_vi" +
      "ews\030\320\001 \001(\001H\037\210\001\001\022\"\n\024average_time_on_site\030" +
      "\321\001 \001(\001H \210\001\001\022\'\n\031benchmark_average_max_cpc" +
      "\030\322\001 \001(\001H!\210\001\001\022.\n biddable_app_install_con" +
      "versions\030\376\001 \001(\001H\"\210\001\001\0223\n%biddable_app_pos" +
      "t_install_conversions\030\377\001 \001(\001H#\210\001\001\022\033\n\rben" +
      "chmark_ctr\030\323\001 \001(\001H$\210\001\001\022\031\n\013bounce_rate\030\324\001" +
      " \001(\001H%\210\001\001\022\024\n\006clicks\030\203\001 \001(\003H&\210\001\001\022\035\n\017combi" +
      "ned_clicks\030\234\001 \001(\003H\'\210\001\001\022\'\n\031combined_click" +
      "s_per_query\030\235\001 \001(\001H(\210\001\001\022\036\n\020combined_quer" +
      "ies\030\236\001 \001(\003H)\210\001\001\0222\n$content_budget_lost_i" +
      "mpression_share\030\237\001 \001(\001H*\210\001\001\022&\n\030content_i" +
      "mpression_share\030\240\001 \001(\001H+\210\001\001\0228\n*conversio" +
      "n_last_received_request_date_time\030\241\001 \001(\t" +
      "H,\210\001\001\022-\n\037conversion_last_conversion_date" +
      "\030\242\001 \001(\tH-\210\001\001\0220\n\"content_rank_lost_impres" +
      "sion_share\030\243\001 \001(\001H.\210\001\001\0220\n\"conversions_fr" +
      "om_interactions_rate\030\244\001 \001(\001H/\210\001\001\022\037\n\021conv" +
      "ersions_value\030\245\001 \001(\001H0\210\001\001\022-\n$conversions" +
      "_value_by_conversion_date\030\362\001 \001(\001\022(\n\032conv" +
      "ersions_value_per_cost\030\246\001 \001(\001H1\210\001\001\022A\n3co" +
      "nversions_from_interactions_value_per_in" +
      "teraction\030\247\001 \001(\001H2\210\001\001\022\031\n\013conversions\030\250\001 " +
      "\001(\001H3\210\001\001\022\'\n\036conversions_by_conversion_da" +
      "te\030\363\001 \001(\001\022\031\n\013cost_micros\030\251\001 \001(\003H4\210\001\001\022&\n\030" +
      "cost_per_all_conversions\030\252\001 \001(\001H5\210\001\001\022!\n\023" +
      "cost_per_conversion\030\253\001 \001(\001H6\210\001\001\022:\n,cost_" +
      "per_current_model_attributed_conversion\030" +
      "\254\001 \001(\001H7\210\001\001\022&\n\030cross_device_conversions\030" +
      "\255\001 \001(\001H8\210\001\001\022\021\n\003ctr\030\256\001 \001(\001H9\210\001\001\0222\n$curren" +
      "t_model_attributed_conversions\030\257\001 \001(\001H:\210" +
      "\001\001\022I\n;current_model_attributed_conversio" +
      "ns_from_interactions_rate\030\260\001 \001(\001H;\210\001\001\022Z\n" +
      "Lcurrent_model_attributed_conversions_fr" +
      "om_interactions_value_per_interaction\030\261\001" +
      " \001(\001H<\210\001\001\0228\n*current_model_attributed_co" +
      "nversions_value\030\262\001 \001(\001H=\210\001\001\022A\n3current_m" +
      "odel_attributed_conversions_value_per_co" +
      "st\030\263\001 \001(\001H>\210\001\001\022\035\n\017engagement_rate\030\264\001 \001(\001" +
      "H?\210\001\001\022\031\n\013engagements\030\265\001 \001(\003H@\210\001\001\022-\n\037hote" +
      "l_average_lead_value_micros\030\325\001 \001(\001HA\210\001\001\022" +
      "*\n\034hotel_commission_rate_micros\030\200\002 \001(\003HB" +
      "\210\001\001\022,\n\036hotel_expected_commission_cost\030\201\002" +
      " \001(\001HC\210\001\001\022/\n!hotel_price_difference_perc" +
      "entage\030\326\001 \001(\001HD\210\001\001\022(\n\032hotel_eligible_imp" +
      "ressions\030\327\001 \001(\003HE\210\001\001\022t\n!historical_creat" +
      "ive_quality_score\030P \001(\0162I.google.ads.goo" +
      "gleads.v11.enums.QualityScoreBucketEnum." +
      "QualityScoreBucket\022x\n%historical_landing" +
      "_page_quality_score\030Q \001(\0162I.google.ads.g" +
      "oogleads.v11.enums.QualityScoreBucketEnu" +
      "m.QualityScoreBucket\022&\n\030historical_quali" +
      "ty_score\030\330\001 \001(\003HF\210\001\001\022r\n\037historical_searc" +
      "h_predicted_ctr\030S \001(\0162I.google.ads.googl" +
      "eads.v11.enums.QualityScoreBucketEnum.Qu" +
      "alityScoreBucket\022\034\n\016gmail_forwards\030\331\001 \001(" +
      "\003HG\210\001\001\022\031\n\013gmail_saves\030\332\001 \001(\003HH\210\001\001\022$\n\026gma" +
      "il_secondary_clicks\030\333\001 \001(\003HI\210\001\001\022*\n\034impre" +
      "ssions_from_store_reach\030\334\001 \001(\003HJ\210\001\001\022\031\n\013i" +
      "mpressions\030\335\001 \001(\003HK\210\001\001\022\036\n\020interaction_ra" +
      "te\030\336\001 \001(\001HL\210\001\001\022\032\n\014interactions\030\337\001 \001(\003HM\210" +
      "\001\001\022n\n\027interaction_event_types\030d \003(\0162M.go" +
      "ogle.ads.googleads.v11.enums.Interaction" +
      "EventTypeEnum.InteractionEventType\022 \n\022in" +
      "valid_click_rate\030\340\001 \001(\001HN\210\001\001\022\034\n\016invalid_" +
      "clicks\030\341\001 \001(\003HO\210\001\001\022\033\n\rmessage_chats\030\342\001 \001" +
      "(\003HP\210\001\001\022!\n\023message_impressions\030\343\001 \001(\003HQ\210" +
      "\001\001\022\037\n\021message_chat_rate\030\344\001 \001(\001HR\210\001\001\022/\n!m" +
      "obile_friendly_clicks_percentage\030\345\001 \001(\001H" +
      "S\210\001\001\022\'\n\031optimization_score_uplift\030\367\001 \001(\001" +
      "HT\210\001\001\022$\n\026optimization_score_url\030\370\001 \001(\tHU" +
      "\210\001\001\022\034\n\016organic_clicks\030\346\001 \001(\003HV\210\001\001\022&\n\030org" +
      "anic_clicks_per_query\030\347\001 \001(\001HW\210\001\001\022!\n\023org" +
      "anic_impressions\030\350\001 \001(\003HX\210\001\001\022+\n\035organic_" +
      "impressions_per_query\030\351\001 \001(\001HY\210\001\001\022\035\n\017org" +
      "anic_queries\030\352\001 \001(\003HZ\210\001\001\022\"\n\024percent_new_" +
      "visitors\030\353\001 \001(\001H[\210\001\001\022\031\n\013phone_calls\030\354\001 \001" +
      "(\003H\\\210\001\001\022\037\n\021phone_impressions\030\355\001 \001(\003H]\210\001\001" +
      "\022 \n\022phone_through_rate\030\356\001 \001(\001H^\210\001\001\022\032\n\014re" +
      "lative_ctr\030\357\001 \001(\001H_\210\001\001\0222\n$search_absolut" +
      "e_top_impression_share\030\210\001 \001(\001H`\210\001\001\022>\n0se" +
      "arch_budget_lost_absolute_top_impression" +
      "_share\030\211\001 \001(\001Ha\210\001\001\0221\n#search_budget_lost" +
      "_impression_share\030\212\001 \001(\001Hb\210\001\001\0225\n\'search_" +
      "budget_lost_top_impression_share\030\213\001 \001(\001H" +
      "c\210\001\001\022 \n\022search_click_share\030\214\001 \001(\001Hd\210\001\001\0221" +
      "\n#search_exact_match_impression_share\030\215\001" +
      " \001(\001He\210\001\001\022%\n\027search_impression_share\030\216\001 " +
      "\001(\001Hf\210\001\001\022<\n.search_rank_lost_absolute_to" +
      "p_impression_share\030\217\001 \001(\001Hg\210\001\001\022/\n!search" +
      "_rank_lost_impression_share\030\220\001 \001(\001Hh\210\001\001\022" +
      "3\n%search_rank_lost_top_impression_share" +
      "\030\221\001 \001(\001Hi\210\001\001\022)\n\033search_top_impression_sh" +
      "are\030\222\001 \001(\001Hj\210\001\001\022\031\n\013speed_score\030\223\001 \001(\003Hk\210" +
      "\001\001\022\'\n\031top_impression_percentage\030\224\001 \001(\001Hl" +
      "\210\001\001\022>\n0valid_accelerated_mobile_pages_cl" +
      "icks_percentage\030\225\001 \001(\001Hm\210\001\001\022\'\n\031value_per" +
      "_all_conversions\030\226\001 \001(\001Hn\210\001\001\022:\n,value_pe" +
      "r_all_conversions_by_conversion_date\030\364\001 " +
      "\001(\001Ho\210\001\001\022\"\n\024value_per_conversion\030\227\001 \001(\001H" +
      "p\210\001\001\0226\n(value_per_conversions_by_convers" +
      "ion_date\030\365\001 \001(\001Hq\210\001\001\022;\n-value_per_curren" +
      "t_model_attributed_conversion\030\230\001 \001(\001Hr\210\001" +
      "\001\022&\n\030video_quartile_p100_rate\030\204\001 \001(\001Hs\210\001" +
      "\001\022%\n\027video_quartile_p25_rate\030\205\001 \001(\001Ht\210\001\001" +
      "\022%\n\027video_quartile_p50_rate\030\206\001 \001(\001Hu\210\001\001\022" +
      "%\n\027video_quartile_p75_rate\030\207\001 \001(\001Hv\210\001\001\022\035" +
      "\n\017video_view_rate\030\231\001 \001(\001Hw\210\001\001\022\031\n\013video_v" +
      "iews\030\232\001 \001(\003Hx\210\001\001\022&\n\030view_through_convers" +
      "ions\030\233\001 \001(\003Hy\210\001\001\022\"\n\031sk_ad_network_conver" +
      "sions\030\366\001 \001(\003B%\n#_absolute_top_impression" +
      "_percentageB\022\n\020_active_view_cpmB\022\n\020_acti" +
      "ve_view_ctrB\032\n\030_active_view_impressionsB" +
      "\034\n\032_active_view_measurabilityB%\n#_active" +
      "_view_measurable_cost_microsB%\n#_active_" +
      "view_measurable_impressionsB\032\n\030_active_v" +
      "iew_viewabilityB)\n\'_all_conversions_from" +
      "_interactions_rateB\030\n\026_all_conversions_v" +
      "alueB\022\n\020_all_conversionsB!\n\037_all_convers" +
      "ions_value_per_costB%\n#_all_conversions_" +
      "from_click_to_callB\"\n _all_conversions_f" +
      "rom_directionsB:\n8_all_conversions_from_" +
      "interactions_value_per_interactionB\034\n\032_a" +
      "ll_conversions_from_menuB\035\n\033_all_convers" +
      "ions_from_orderB(\n&_all_conversions_from" +
      "_other_engagementB#\n!_all_conversions_fr" +
      "om_store_visitB%\n#_all_conversions_from_" +
      "store_websiteB<\n:_auction_insight_search" +
      "_absolute_top_impression_percentageB*\n(_" +
      "auction_insight_search_impression_shareB" +
      "*\n(_auction_insight_search_outranking_sh" +
      "areB&\n$_auction_insight_search_overlap_r" +
      "ateB-\n+_auction_insight_search_position_" +
      "above_rateB3\n1_auction_insight_search_to" +
      "p_impression_percentageB\017\n\r_average_cost" +
      "B\016\n\014_average_cpcB\016\n\014_average_cpeB\016\n\014_ave" +
      "rage_cpmB\016\n\014_average_cpvB\025\n\023_average_pag" +
      "e_viewsB\027\n\025_average_time_on_siteB\034\n\032_ben" +
      "chmark_average_max_cpcB#\n!_biddable_app_" +
      "install_conversionsB(\n&_biddable_app_pos" +
      "t_install_conversionsB\020\n\016_benchmark_ctrB" +
      "\016\n\014_bounce_rateB\t\n\007_clicksB\022\n\020_combined_" +
      "clicksB\034\n\032_combined_clicks_per_queryB\023\n\021" +
      "_combined_queriesB\'\n%_content_budget_los" +
      "t_impression_shareB\033\n\031_content_impressio" +
      "n_shareB-\n+_conversion_last_received_req" +
      "uest_date_timeB\"\n _conversion_last_conve" +
      "rsion_dateB%\n#_content_rank_lost_impress" +
      "ion_shareB%\n#_conversions_from_interacti" +
      "ons_rateB\024\n\022_conversions_valueB\035\n\033_conve" +
      "rsions_value_per_costB6\n4_conversions_fr" +
      "om_interactions_value_per_interactionB\016\n" +
      "\014_conversionsB\016\n\014_cost_microsB\033\n\031_cost_p" +
      "er_all_conversionsB\026\n\024_cost_per_conversi" +
      "onB/\n-_cost_per_current_model_attributed" +
      "_conversionB\033\n\031_cross_device_conversions" +
      "B\006\n\004_ctrB\'\n%_current_model_attributed_co" +
      "nversionsB>\n<_current_model_attributed_c" +
      "onversions_from_interactions_rateBO\nM_cu" +
      "rrent_model_attributed_conversions_from_" +
      "interactions_value_per_interactionB-\n+_c" +
      "urrent_model_attributed_conversions_valu" +
      "eB6\n4_current_model_attributed_conversio" +
      "ns_value_per_costB\022\n\020_engagement_rateB\016\n" +
      "\014_engagementsB\"\n _hotel_average_lead_val" +
      "ue_microsB\037\n\035_hotel_commission_rate_micr" +
      "osB!\n\037_hotel_expected_commission_costB$\n" +
      "\"_hotel_price_difference_percentageB\035\n\033_" +
      "hotel_eligible_impressionsB\033\n\031_historica" +
      "l_quality_scoreB\021\n\017_gmail_forwardsB\016\n\014_g" +
      "mail_savesB\031\n\027_gmail_secondary_clicksB\037\n" +
      "\035_impressions_from_store_reachB\016\n\014_impre" +
      "ssionsB\023\n\021_interaction_rateB\017\n\r_interact" +
      "ionsB\025\n\023_invalid_click_rateB\021\n\017_invalid_" +
      "clicksB\020\n\016_message_chatsB\026\n\024_message_imp" +
      "ressionsB\024\n\022_message_chat_rateB$\n\"_mobil" +
      "e_friendly_clicks_percentageB\034\n\032_optimiz" +
      "ation_score_upliftB\031\n\027_optimization_scor" +
      "e_urlB\021\n\017_organic_clicksB\033\n\031_organic_cli" +
      "cks_per_queryB\026\n\024_organic_impressionsB \n" +
      "\036_organic_impressions_per_queryB\022\n\020_orga" +
      "nic_queriesB\027\n\025_percent_new_visitorsB\016\n\014" +
      "_phone_callsB\024\n\022_phone_impressionsB\025\n\023_p" +
      "hone_through_rateB\017\n\r_relative_ctrB\'\n%_s" +
      "earch_absolute_top_impression_shareB3\n1_" +
      "search_budget_lost_absolute_top_impressi" +
      "on_shareB&\n$_search_budget_lost_impressi" +
      "on_shareB*\n(_search_budget_lost_top_impr" +
      "ession_shareB\025\n\023_search_click_shareB&\n$_" +
      "search_exact_match_impression_shareB\032\n\030_" +
      "search_impression_shareB1\n/_search_rank_" +
      "lost_absolute_top_impression_shareB$\n\"_s" +
      "earch_rank_lost_impression_shareB(\n&_sea" +
      "rch_rank_lost_top_impression_shareB\036\n\034_s" +
      "earch_top_impression_shareB\016\n\014_speed_sco" +
      "reB\034\n\032_top_impression_percentageB3\n1_val" +
      "id_accelerated_mobile_pages_clicks_perce" +
      "ntageB\034\n\032_value_per_all_conversionsB/\n-_" +
      "value_per_all_conversions_by_conversion_" +
      "dateB\027\n\025_value_per_conversionB+\n)_value_" +
      "per_conversions_by_conversion_dateB0\n._v" +
      "alue_per_current_model_attributed_conver" +
      "sionB\033\n\031_video_quartile_p100_rateB\032\n\030_vi" +
      "deo_quartile_p25_rateB\032\n\030_video_quartile" +
      "_p50_rateB\032\n\030_video_quartile_p75_rateB\022\n" +
      "\020_video_view_rateB\016\n\014_video_viewsB\033\n\031_vi" +
      "ew_through_conversionsB\354\001\n#com.google.ad" +
      "s.googleads.v11.commonB\014MetricsProtoP\001ZE" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v11/common;common\242\002\003GAA\252\002\037Go" +
      "ogle.Ads.GoogleAds.V11.Common\312\002\037Google\\A" +
      "ds\\GoogleAds\\V11\\Common\352\002#Google::Ads::G" +
      "oogleAds::V11::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.QualityScoreBucketProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversionsValueByConversionDate", "AllConversions", "AllConversionsByConversionDate", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AuctionInsightSearchAbsoluteTopImpressionPercentage", "AuctionInsightSearchImpressionShare", "AuctionInsightSearchOutrankingShare", "AuctionInsightSearchOverlapRate", "AuctionInsightSearchPositionAboveRate", "AuctionInsightSearchTopImpressionPercentage", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValueByConversionDate", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "ConversionsByConversionDate", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", "SkAdNetworkConversions", "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AuctionInsightSearchAbsoluteTopImpressionPercentage", "AuctionInsightSearchImpressionShare", "AuctionInsightSearchOutrankingShare", "AuctionInsightSearchOverlapRate", "AuctionInsightSearchPositionAboveRate", "AuctionInsightSearchTopImpressionPercentage", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalQualityScore", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", });
    com.google.ads.googleads.v11.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.QualityScoreBucketProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
