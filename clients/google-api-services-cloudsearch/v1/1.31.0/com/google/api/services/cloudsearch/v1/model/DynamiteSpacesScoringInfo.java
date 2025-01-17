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

package com.google.api.services.cloudsearch.v1.model;

/**
 * This is the proto for holding space level scoring information. This data is used for logging in
 * query-api server and for testing purposes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DynamiteSpacesScoringInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double finalScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double freshnessScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double messageScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double spaceAgeInDays;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double topicalityScore;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getFinalScore() {
    return finalScore;
  }

  /**
   * @param finalScore finalScore or {@code null} for none
   */
  public DynamiteSpacesScoringInfo setFinalScore(java.lang.Double finalScore) {
    this.finalScore = finalScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getFreshnessScore() {
    return freshnessScore;
  }

  /**
   * @param freshnessScore freshnessScore or {@code null} for none
   */
  public DynamiteSpacesScoringInfo setFreshnessScore(java.lang.Double freshnessScore) {
    this.freshnessScore = freshnessScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMessageScore() {
    return messageScore;
  }

  /**
   * @param messageScore messageScore or {@code null} for none
   */
  public DynamiteSpacesScoringInfo setMessageScore(java.lang.Double messageScore) {
    this.messageScore = messageScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getSpaceAgeInDays() {
    return spaceAgeInDays;
  }

  /**
   * @param spaceAgeInDays spaceAgeInDays or {@code null} for none
   */
  public DynamiteSpacesScoringInfo setSpaceAgeInDays(java.lang.Double spaceAgeInDays) {
    this.spaceAgeInDays = spaceAgeInDays;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getTopicalityScore() {
    return topicalityScore;
  }

  /**
   * @param topicalityScore topicalityScore or {@code null} for none
   */
  public DynamiteSpacesScoringInfo setTopicalityScore(java.lang.Double topicalityScore) {
    this.topicalityScore = topicalityScore;
    return this;
  }

  @Override
  public DynamiteSpacesScoringInfo set(String fieldName, Object value) {
    return (DynamiteSpacesScoringInfo) super.set(fieldName, value);
  }

  @Override
  public DynamiteSpacesScoringInfo clone() {
    return (DynamiteSpacesScoringInfo) super.clone();
  }

}
