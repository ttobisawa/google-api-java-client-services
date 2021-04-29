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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * Describes the length of a period of a time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1Duration extends com.google.api.client.json.GenericJson {

  /**
   * number of duration units to be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * The unit used for the duration
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * number of duration units to be included.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * number of duration units to be included.
   * @param count count or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Duration setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The unit used for the duration
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The unit used for the duration
   * @param unit unit or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Duration setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1Duration set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1Duration) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1Duration clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1Duration) super.clone();
  }

}