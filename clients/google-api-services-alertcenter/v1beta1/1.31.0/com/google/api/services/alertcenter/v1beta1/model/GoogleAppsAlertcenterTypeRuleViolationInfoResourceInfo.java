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
 * Proto that contains resource information.
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
public final class GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo extends com.google.api.client.json.GenericJson {

  /**
   * Drive file ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentId;

  /**
   * Title of the resource, for example email subject, or document title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceTitle;

  /**
   * Drive file ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentId() {
    return documentId;
  }

  /**
   * Drive file ID.
   * @param documentId documentId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo setDocumentId(java.lang.String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Title of the resource, for example email subject, or document title.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceTitle() {
    return resourceTitle;
  }

  /**
   * Title of the resource, for example email subject, or document title.
   * @param resourceTitle resourceTitle or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo setResourceTitle(java.lang.String resourceTitle) {
    this.resourceTitle = resourceTitle;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo clone() {
    return (GoogleAppsAlertcenterTypeRuleViolationInfoResourceInfo) super.clone();
  }

}