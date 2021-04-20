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
 * Alert for setting the domain or IP that malicious email comes from as whitelisted domain or IP in
 * Gmail advanced settings.
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
public final class GoogleAppsAlertcenterTypeBadWhitelist extends com.google.api.client.json.GenericJson {

  /**
   * The domain ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsAlertcenterTypeDomainId domainId;

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsAlertcenterTypeMaliciousEntity maliciousEntity;

  /**
   * The list of messages contained by this alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> messages;

  /**
   * The source IP address of the malicious email, for example, `127.0.0.1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceIp;

  /**
   * The domain ID.
   * @return value or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDomainId getDomainId() {
    return domainId;
  }

  /**
   * The domain ID.
   * @param domainId domainId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeBadWhitelist setDomainId(GoogleAppsAlertcenterTypeDomainId domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * @return value or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeMaliciousEntity getMaliciousEntity() {
    return maliciousEntity;
  }

  /**
   * The entity whose actions triggered a Gmail phishing alert.
   * @param maliciousEntity maliciousEntity or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeBadWhitelist setMaliciousEntity(GoogleAppsAlertcenterTypeMaliciousEntity maliciousEntity) {
    this.maliciousEntity = maliciousEntity;
    return this;
  }

  /**
   * The list of messages contained by this alert.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> getMessages() {
    return messages;
  }

  /**
   * The list of messages contained by this alert.
   * @param messages messages or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeBadWhitelist setMessages(java.util.List<GoogleAppsAlertcenterTypeGmailMessageInfo> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * The source IP address of the malicious email, for example, `127.0.0.1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceIp() {
    return sourceIp;
  }

  /**
   * The source IP address of the malicious email, for example, `127.0.0.1`.
   * @param sourceIp sourceIp or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeBadWhitelist setSourceIp(java.lang.String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeBadWhitelist set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeBadWhitelist) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeBadWhitelist clone() {
    return (GoogleAppsAlertcenterTypeBadWhitelist) super.clone();
  }

}