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
 * Alerts for user account warning events.
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
public final class GoogleAppsAlertcenterTypeAccountWarning extends com.google.api.client.json.GenericJson {

  /**
   * Required. The email of the user that this event belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Optional. Details of the login action associated with the warning event. This is only available
   * for: * Suspicious login * Suspicious login (less secure app) * Suspicious programmatic login *
   * User suspended (suspicious activity)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsAlertcenterTypeAccountWarningLoginDetails loginDetails;

  /**
   * Required. The email of the user that this event belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. The email of the user that this event belongs to.
   * @param email email or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeAccountWarning setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Optional. Details of the login action associated with the warning event. This is only available
   * for: * Suspicious login * Suspicious login (less secure app) * Suspicious programmatic login *
   * User suspended (suspicious activity)
   * @return value or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeAccountWarningLoginDetails getLoginDetails() {
    return loginDetails;
  }

  /**
   * Optional. Details of the login action associated with the warning event. This is only available
   * for: * Suspicious login * Suspicious login (less secure app) * Suspicious programmatic login *
   * User suspended (suspicious activity)
   * @param loginDetails loginDetails or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeAccountWarning setLoginDetails(GoogleAppsAlertcenterTypeAccountWarningLoginDetails loginDetails) {
    this.loginDetails = loginDetails;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeAccountWarning set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeAccountWarning) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeAccountWarning clone() {
    return (GoogleAppsAlertcenterTypeAccountWarning) super.clone();
  }

}