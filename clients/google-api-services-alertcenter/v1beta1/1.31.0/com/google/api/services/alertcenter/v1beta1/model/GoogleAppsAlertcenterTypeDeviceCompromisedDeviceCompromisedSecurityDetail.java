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
 * Detailed information of a single MDM device compromised event.
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
public final class GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail extends com.google.api.client.json.GenericJson {

  /**
   * The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceCompromisedState;

  /**
   * Required. The device ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceId;

  /**
   * The model of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceModel;

  /**
   * The type of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceType;

  /**
   * Required for iOS, empty for others.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosVendorId;

  /**
   * The device resource ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceId;

  /**
   * The serial number of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`".
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceCompromisedState() {
    return deviceCompromisedState;
  }

  /**
   * The device compromised state. Possible values are "`Compromised`" or "`Not Compromised`".
   * @param deviceCompromisedState deviceCompromisedState or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setDeviceCompromisedState(java.lang.String deviceCompromisedState) {
    this.deviceCompromisedState = deviceCompromisedState;
    return this;
  }

  /**
   * Required. The device ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * Required. The device ID.
   * @param deviceId deviceId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setDeviceId(java.lang.String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The model of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceModel() {
    return deviceModel;
  }

  /**
   * The model of the device.
   * @param deviceModel deviceModel or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setDeviceModel(java.lang.String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  /**
   * The type of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceType() {
    return deviceType;
  }

  /**
   * The type of the device.
   * @param deviceType deviceType or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setDeviceType(java.lang.String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Required for iOS, empty for others.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosVendorId() {
    return iosVendorId;
  }

  /**
   * Required for iOS, empty for others.
   * @param iosVendorId iosVendorId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setIosVendorId(java.lang.String iosVendorId) {
    this.iosVendorId = iosVendorId;
    return this;
  }

  /**
   * The device resource ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * The device resource ID.
   * @param resourceId resourceId or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setResourceId(java.lang.String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The serial number of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * The serial number of the device.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  @Override
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail set(String fieldName, Object value) {
    return (GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail clone() {
    return (GoogleAppsAlertcenterTypeDeviceCompromisedDeviceCompromisedSecurityDetail) super.clone();
  }

}