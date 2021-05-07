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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * Alerts from Reporting Rules configured by Admin.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportingRule extends com.google.api.client.json.GenericJson {

  /**
   * Any other associated alert details, for example, AlertConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alertDetails;

  /**
   * Rule name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Alert Rule query Sample Query query { condition { filter { expected_application_id:
   * 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
   * conjunction_operator: OR }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Any other associated alert details, for example, AlertConfiguration.
   * @see #decodeAlertDetails()
   * @return value or {@code null} for none
   */
  public java.lang.String getAlertDetails() {
    return alertDetails;
  }

  /**
   * Any other associated alert details, for example, AlertConfiguration.
   * @see #getAlertDetails()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAlertDetails() {
    return com.google.api.client.util.Base64.decodeBase64(alertDetails);
  }

  /**
   * Any other associated alert details, for example, AlertConfiguration.
   * @see #encodeAlertDetails()
   * @param alertDetails alertDetails or {@code null} for none
   */
  public ReportingRule setAlertDetails(java.lang.String alertDetails) {
    this.alertDetails = alertDetails;
    return this;
  }

  /**
   * Any other associated alert details, for example, AlertConfiguration.
   * @see #setAlertDetails()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ReportingRule encodeAlertDetails(byte[] alertDetails) {
    this.alertDetails = com.google.api.client.util.Base64.encodeBase64URLSafeString(alertDetails);
    return this;
  }

  /**
   * Rule name
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Rule name
   * @param name name or {@code null} for none
   */
  public ReportingRule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Alert Rule query Sample Query query { condition { filter { expected_application_id:
   * 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
   * conjunction_operator: OR }
   * @see #decodeQuery()
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Alert Rule query Sample Query query { condition { filter { expected_application_id:
   * 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
   * conjunction_operator: OR }
   * @see #getQuery()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeQuery() {
    return com.google.api.client.util.Base64.decodeBase64(query);
  }

  /**
   * Alert Rule query Sample Query query { condition { filter { expected_application_id:
   * 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
   * conjunction_operator: OR }
   * @see #encodeQuery()
   * @param query query or {@code null} for none
   */
  public ReportingRule setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Alert Rule query Sample Query query { condition { filter { expected_application_id:
   * 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
   * conjunction_operator: OR }
   * @see #setQuery()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ReportingRule encodeQuery(byte[] query) {
    this.query = com.google.api.client.util.Base64.encodeBase64URLSafeString(query);
    return this;
  }

  @Override
  public ReportingRule set(String fieldName, Object value) {
    return (ReportingRule) super.set(fieldName, value);
  }

  @Override
  public ReportingRule clone() {
    return (ReportingRule) super.clone();
  }

}