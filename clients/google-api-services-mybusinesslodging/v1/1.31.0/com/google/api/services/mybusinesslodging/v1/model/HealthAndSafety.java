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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Health and safety measures implemented by the hotel during COVID-19.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HealthAndSafety extends com.google.api.client.json.GenericJson {

  /**
   * Enhanced cleaning measures implemented by the hotel during COVID-19.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnhancedCleaning enhancedCleaning;

  /**
   * Increased food safety measures implemented by the hotel during COVID-19.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IncreasedFoodSafety increasedFoodSafety;

  /**
   * Minimized contact measures implemented by the hotel during COVID-19.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MinimizedContact minimizedContact;

  /**
   * Personal protection measures implemented by the hotel during COVID-19.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PersonalProtection personalProtection;

  /**
   * Physical distancing measures implemented by the hotel during COVID-19.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PhysicalDistancing physicalDistancing;

  /**
   * Enhanced cleaning measures implemented by the hotel during COVID-19.
   * @return value or {@code null} for none
   */
  public EnhancedCleaning getEnhancedCleaning() {
    return enhancedCleaning;
  }

  /**
   * Enhanced cleaning measures implemented by the hotel during COVID-19.
   * @param enhancedCleaning enhancedCleaning or {@code null} for none
   */
  public HealthAndSafety setEnhancedCleaning(EnhancedCleaning enhancedCleaning) {
    this.enhancedCleaning = enhancedCleaning;
    return this;
  }

  /**
   * Increased food safety measures implemented by the hotel during COVID-19.
   * @return value or {@code null} for none
   */
  public IncreasedFoodSafety getIncreasedFoodSafety() {
    return increasedFoodSafety;
  }

  /**
   * Increased food safety measures implemented by the hotel during COVID-19.
   * @param increasedFoodSafety increasedFoodSafety or {@code null} for none
   */
  public HealthAndSafety setIncreasedFoodSafety(IncreasedFoodSafety increasedFoodSafety) {
    this.increasedFoodSafety = increasedFoodSafety;
    return this;
  }

  /**
   * Minimized contact measures implemented by the hotel during COVID-19.
   * @return value or {@code null} for none
   */
  public MinimizedContact getMinimizedContact() {
    return minimizedContact;
  }

  /**
   * Minimized contact measures implemented by the hotel during COVID-19.
   * @param minimizedContact minimizedContact or {@code null} for none
   */
  public HealthAndSafety setMinimizedContact(MinimizedContact minimizedContact) {
    this.minimizedContact = minimizedContact;
    return this;
  }

  /**
   * Personal protection measures implemented by the hotel during COVID-19.
   * @return value or {@code null} for none
   */
  public PersonalProtection getPersonalProtection() {
    return personalProtection;
  }

  /**
   * Personal protection measures implemented by the hotel during COVID-19.
   * @param personalProtection personalProtection or {@code null} for none
   */
  public HealthAndSafety setPersonalProtection(PersonalProtection personalProtection) {
    this.personalProtection = personalProtection;
    return this;
  }

  /**
   * Physical distancing measures implemented by the hotel during COVID-19.
   * @return value or {@code null} for none
   */
  public PhysicalDistancing getPhysicalDistancing() {
    return physicalDistancing;
  }

  /**
   * Physical distancing measures implemented by the hotel during COVID-19.
   * @param physicalDistancing physicalDistancing or {@code null} for none
   */
  public HealthAndSafety setPhysicalDistancing(PhysicalDistancing physicalDistancing) {
    this.physicalDistancing = physicalDistancing;
    return this;
  }

  @Override
  public HealthAndSafety set(String fieldName, Object value) {
    return (HealthAndSafety) super.set(fieldName, value);
  }

  @Override
  public HealthAndSafety clone() {
    return (HealthAndSafety) super.clone();
  }

}