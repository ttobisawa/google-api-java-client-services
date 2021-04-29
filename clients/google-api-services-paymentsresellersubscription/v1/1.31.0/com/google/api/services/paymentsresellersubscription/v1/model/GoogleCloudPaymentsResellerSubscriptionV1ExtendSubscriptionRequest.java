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
 * Request message for extending a Subscription resource. A new recurrence will be made based on the
 * subscription schedule defined by the original product.
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
public final class GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Specifies details of the extension. Currently, the duration of the extension must be
   * exactly one billing cycle of the original subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1Extension extension;

  /**
   * Required. Restricted to 36 ASCII characters. A random UUID is recommended. The idempotency key
   * for the request. The ID generation logic is controlled by the partner. request_id should be the
   * same as on retries of the same request. A different request_id must be used for a extension of
   * a different cycle. A random UUID is recommended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. Specifies details of the extension. Currently, the duration of the extension must be
   * exactly one billing cycle of the original subscription.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Extension getExtension() {
    return extension;
  }

  /**
   * Required. Specifies details of the extension. Currently, the duration of the extension must be
   * exactly one billing cycle of the original subscription.
   * @param extension extension or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest setExtension(GoogleCloudPaymentsResellerSubscriptionV1Extension extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Required. Restricted to 36 ASCII characters. A random UUID is recommended. The idempotency key
   * for the request. The ID generation logic is controlled by the partner. request_id should be the
   * same as on retries of the same request. A different request_id must be used for a extension of
   * a different cycle. A random UUID is recommended.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Required. Restricted to 36 ASCII characters. A random UUID is recommended. The idempotency key
   * for the request. The ID generation logic is controlled by the partner. request_id should be the
   * same as on retries of the same request. A different request_id must be used for a extension of
   * a different cycle. A random UUID is recommended.
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest) super.clone();
  }

}