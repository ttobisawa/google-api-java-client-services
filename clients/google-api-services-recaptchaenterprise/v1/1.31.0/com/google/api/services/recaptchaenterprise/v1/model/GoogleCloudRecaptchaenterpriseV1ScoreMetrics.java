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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * Metrics related to scoring.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1ScoreMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Action-based metrics. The map key is the action name which specified by the site owners at time
   * of the "execute" client-side call. Populated only for SCORE keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> actionMetrics;

  static {
    // hack to force ProGuard to consider GoogleCloudRecaptchaenterpriseV1ScoreDistribution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecaptchaenterpriseV1ScoreDistribution.class);
  }

  /**
   * Aggregated score metrics for all traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1ScoreDistribution overallMetrics;

  /**
   * Action-based metrics. The map key is the action name which specified by the site owners at time
   * of the "execute" client-side call. Populated only for SCORE keys.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> getActionMetrics() {
    return actionMetrics;
  }

  /**
   * Action-based metrics. The map key is the action name which specified by the site owners at time
   * of the "execute" client-side call. Populated only for SCORE keys.
   * @param actionMetrics actionMetrics or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics setActionMetrics(java.util.Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> actionMetrics) {
    this.actionMetrics = actionMetrics;
    return this;
  }

  /**
   * Aggregated score metrics for all traffic.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1ScoreDistribution getOverallMetrics() {
    return overallMetrics;
  }

  /**
   * Aggregated score metrics for all traffic.
   * @param overallMetrics overallMetrics or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics setOverallMetrics(GoogleCloudRecaptchaenterpriseV1ScoreDistribution overallMetrics) {
    this.overallMetrics = overallMetrics;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1ScoreMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics clone() {
    return (GoogleCloudRecaptchaenterpriseV1ScoreMetrics) super.clone();
  }

}