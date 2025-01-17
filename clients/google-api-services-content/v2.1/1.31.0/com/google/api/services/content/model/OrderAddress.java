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

package com.google.api.services.content.model;

/**
 * Model definition for OrderAddress.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderAddress extends com.google.api.client.json.GenericJson {

  /**
   * CLDR country code (for example, "US").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * Strings representing the lines of the printed label for mailing the order, for example: John
   * Smith 1600 Amphitheatre Parkway Mountain View, CA, 94043 United States
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fullAddress;

  /**
   * Whether the address is a post office box.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPostOfficeBox;

  /**
   * City, town or commune. May also include dependent localities or sublocalities (for example,
   * neighborhoods or suburbs).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Postal Code or ZIP (for example, "94043").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * Name of the recipient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recipientName;

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Street-level part of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> streetAddress;

  /**
   * CLDR country code (for example, "US").
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * CLDR country code (for example, "US").
   * @param country country or {@code null} for none
   */
  public OrderAddress setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * Strings representing the lines of the printed label for mailing the order, for example: John
   * Smith 1600 Amphitheatre Parkway Mountain View, CA, 94043 United States
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFullAddress() {
    return fullAddress;
  }

  /**
   * Strings representing the lines of the printed label for mailing the order, for example: John
   * Smith 1600 Amphitheatre Parkway Mountain View, CA, 94043 United States
   * @param fullAddress fullAddress or {@code null} for none
   */
  public OrderAddress setFullAddress(java.util.List<java.lang.String> fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * Whether the address is a post office box.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPostOfficeBox() {
    return isPostOfficeBox;
  }

  /**
   * Whether the address is a post office box.
   * @param isPostOfficeBox isPostOfficeBox or {@code null} for none
   */
  public OrderAddress setIsPostOfficeBox(java.lang.Boolean isPostOfficeBox) {
    this.isPostOfficeBox = isPostOfficeBox;
    return this;
  }

  /**
   * City, town or commune. May also include dependent localities or sublocalities (for example,
   * neighborhoods or suburbs).
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * City, town or commune. May also include dependent localities or sublocalities (for example,
   * neighborhoods or suburbs).
   * @param locality locality or {@code null} for none
   */
  public OrderAddress setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Postal Code or ZIP (for example, "94043").
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * Postal Code or ZIP (for example, "94043").
   * @param postalCode postalCode or {@code null} for none
   */
  public OrderAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Name of the recipient.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecipientName() {
    return recipientName;
  }

  /**
   * Name of the recipient.
   * @param recipientName recipientName or {@code null} for none
   */
  public OrderAddress setRecipientName(java.lang.String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * @param region region or {@code null} for none
   */
  public OrderAddress setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Street-level part of the address.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStreetAddress() {
    return streetAddress;
  }

  /**
   * Street-level part of the address.
   * @param streetAddress streetAddress or {@code null} for none
   */
  public OrderAddress setStreetAddress(java.util.List<java.lang.String> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  @Override
  public OrderAddress set(String fieldName, Object value) {
    return (OrderAddress) super.set(fieldName, value);
  }

  @Override
  public OrderAddress clone() {
    return (OrderAddress) super.clone();
  }

}
