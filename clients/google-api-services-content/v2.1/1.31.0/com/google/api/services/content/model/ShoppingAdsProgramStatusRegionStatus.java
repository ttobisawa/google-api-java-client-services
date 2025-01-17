/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Status of program and region.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShoppingAdsProgramStatusRegionStatus extends com.google.api.client.json.GenericJson {

  /**
   * Date by which `eligibility_status` will go from `WARNING` to `DISAPPROVED`. It will be present
   * when `eligibility_status` is `WARNING`. Date will be provided in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DD
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disapprovalDate;

  /**
   * Eligibility status of the Shopping Ads program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eligibilityStatus;

  /**
   * These issues must be fixed to become eligible for the review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> onboardingIssues;

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regionCodes;

  /**
   * If a program in a given country is eligible for review. It will be present only if eligibility
   * status is `DISAPPROVED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewEligibilityStatus;

  /**
   * Review ineligibility reason if account is not eligible for review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewIneligibilityReason;

  /**
   * Reason if a program in a given country is not eligible for review. Populated only if
   * `review_eligibility_status` is `INELIGIBLE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewIneligibilityReasonDescription;

  /**
   * This contains additional information specific to review ineligibility reasons. If review is
   * ineligible because of `IN_COOLDOWN_PERIOD`, it will contain timestamp for cooldown period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShoppingAdsProgramStatusReviewIneligibilityReasonDetails reviewIneligibilityReasonDetails;

  /**
   * These issues will be evaluated in review process. Fix all the issues before requesting the
   * review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reviewIssues;

  /**
   * Date by which `eligibility_status` will go from `WARNING` to `DISAPPROVED`. It will be present
   * when `eligibility_status` is `WARNING`. Date will be provided in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DD
   * @return value or {@code null} for none
   */
  public java.lang.String getDisapprovalDate() {
    return disapprovalDate;
  }

  /**
   * Date by which `eligibility_status` will go from `WARNING` to `DISAPPROVED`. It will be present
   * when `eligibility_status` is `WARNING`. Date will be provided in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: YYYY-MM-DD
   * @param disapprovalDate disapprovalDate or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setDisapprovalDate(java.lang.String disapprovalDate) {
    this.disapprovalDate = disapprovalDate;
    return this;
  }

  /**
   * Eligibility status of the Shopping Ads program.
   * @return value or {@code null} for none
   */
  public java.lang.String getEligibilityStatus() {
    return eligibilityStatus;
  }

  /**
   * Eligibility status of the Shopping Ads program.
   * @param eligibilityStatus eligibilityStatus or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setEligibilityStatus(java.lang.String eligibilityStatus) {
    this.eligibilityStatus = eligibilityStatus;
    return this;
  }

  /**
   * These issues must be fixed to become eligible for the review.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOnboardingIssues() {
    return onboardingIssues;
  }

  /**
   * These issues must be fixed to become eligible for the review.
   * @param onboardingIssues onboardingIssues or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setOnboardingIssues(java.util.List<java.lang.String> onboardingIssues) {
    this.onboardingIssues = onboardingIssues;
    return this;
  }

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegionCodes() {
    return regionCodes;
  }

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * @param regionCodes regionCodes or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setRegionCodes(java.util.List<java.lang.String> regionCodes) {
    this.regionCodes = regionCodes;
    return this;
  }

  /**
   * If a program in a given country is eligible for review. It will be present only if eligibility
   * status is `DISAPPROVED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewEligibilityStatus() {
    return reviewEligibilityStatus;
  }

  /**
   * If a program in a given country is eligible for review. It will be present only if eligibility
   * status is `DISAPPROVED`.
   * @param reviewEligibilityStatus reviewEligibilityStatus or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewEligibilityStatus(java.lang.String reviewEligibilityStatus) {
    this.reviewEligibilityStatus = reviewEligibilityStatus;
    return this;
  }

  /**
   * Review ineligibility reason if account is not eligible for review.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewIneligibilityReason() {
    return reviewIneligibilityReason;
  }

  /**
   * Review ineligibility reason if account is not eligible for review.
   * @param reviewIneligibilityReason reviewIneligibilityReason or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReason(java.lang.String reviewIneligibilityReason) {
    this.reviewIneligibilityReason = reviewIneligibilityReason;
    return this;
  }

  /**
   * Reason if a program in a given country is not eligible for review. Populated only if
   * `review_eligibility_status` is `INELIGIBLE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewIneligibilityReasonDescription() {
    return reviewIneligibilityReasonDescription;
  }

  /**
   * Reason if a program in a given country is not eligible for review. Populated only if
   * `review_eligibility_status` is `INELIGIBLE`.
   * @param reviewIneligibilityReasonDescription reviewIneligibilityReasonDescription or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReasonDescription(java.lang.String reviewIneligibilityReasonDescription) {
    this.reviewIneligibilityReasonDescription = reviewIneligibilityReasonDescription;
    return this;
  }

  /**
   * This contains additional information specific to review ineligibility reasons. If review is
   * ineligible because of `IN_COOLDOWN_PERIOD`, it will contain timestamp for cooldown period.
   * @return value or {@code null} for none
   */
  public ShoppingAdsProgramStatusReviewIneligibilityReasonDetails getReviewIneligibilityReasonDetails() {
    return reviewIneligibilityReasonDetails;
  }

  /**
   * This contains additional information specific to review ineligibility reasons. If review is
   * ineligible because of `IN_COOLDOWN_PERIOD`, it will contain timestamp for cooldown period.
   * @param reviewIneligibilityReasonDetails reviewIneligibilityReasonDetails or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReasonDetails(ShoppingAdsProgramStatusReviewIneligibilityReasonDetails reviewIneligibilityReasonDetails) {
    this.reviewIneligibilityReasonDetails = reviewIneligibilityReasonDetails;
    return this;
  }

  /**
   * These issues will be evaluated in review process. Fix all the issues before requesting the
   * review.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReviewIssues() {
    return reviewIssues;
  }

  /**
   * These issues will be evaluated in review process. Fix all the issues before requesting the
   * review.
   * @param reviewIssues reviewIssues or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIssues(java.util.List<java.lang.String> reviewIssues) {
    this.reviewIssues = reviewIssues;
    return this;
  }

  @Override
  public ShoppingAdsProgramStatusRegionStatus set(String fieldName, Object value) {
    return (ShoppingAdsProgramStatusRegionStatus) super.set(fieldName, value);
  }

  @Override
  public ShoppingAdsProgramStatusRegionStatus clone() {
    return (ShoppingAdsProgramStatusRegionStatus) super.clone();
  }

}
