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
 * Response message for an alert feedback listing request.
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
public final class GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of alert feedback. Feedback entries for each alert are ordered by creation time
   * descending.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsAlertcenterV1beta1AlertFeedback> feedback;

  static {
    // hack to force ProGuard to consider GoogleAppsAlertcenterV1beta1AlertFeedback used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAppsAlertcenterV1beta1AlertFeedback.class);
  }

  /**
   * The list of alert feedback. Feedback entries for each alert are ordered by creation time
   * descending.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsAlertcenterV1beta1AlertFeedback> getFeedback() {
    return feedback;
  }

  /**
   * The list of alert feedback. Feedback entries for each alert are ordered by creation time
   * descending.
   * @param feedback feedback or {@code null} for none
   */
  public GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse setFeedback(java.util.List<GoogleAppsAlertcenterV1beta1AlertFeedback> feedback) {
    this.feedback = feedback;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse clone() {
    return (GoogleAppsAlertcenterV1beta1ListAlertFeedbackResponse) super.clone();
  }

}