// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/simulation.proto

package com.google.ads.googleads.v8.common;

public interface TargetRoasSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.TargetRoasSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated target ROAS upon which projected metrics are based.
   * </pre>
   *
   * <code>double target_roas = 8;</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * The simulated target ROAS upon which projected metrics are based.
   * </pre>
   *
   * <code>double target_roas = 8;</code>
   * @return The targetRoas.
   */
  double getTargetRoas();

  /**
   * <pre>
   * Projected required daily budget that the advertiser must set in order to
   * receive the estimated traffic, in micros of advertiser currency.
   * </pre>
   *
   * <code>int64 required_budget_amount_micros = 15;</code>
   * @return The requiredBudgetAmountMicros.
   */
  long getRequiredBudgetAmountMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 9;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 9;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 10;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 10;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 11;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 11;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 12;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 12;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 13;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 13;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only Search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 14;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only Search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 14;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();
}
