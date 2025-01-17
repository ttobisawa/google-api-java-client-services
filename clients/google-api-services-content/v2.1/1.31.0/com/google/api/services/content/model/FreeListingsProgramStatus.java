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
 * Response message for GetFreeListingsProgramStatus.
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
public final class FreeListingsProgramStatus extends com.google.api.client.json.GenericJson {

  /**
   * State of the program, It is set to enabled if there are offers for at least one region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String globalState;

  /**
   * Status of the program in each region. Regions with the same status and review eligibility are
   * grouped together in `regionCodes`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FreeListingsProgramStatusRegionStatus> regionStatuses;

  /**
   * State of the program, It is set to enabled if there are offers for at least one region.
   * @return value or {@code null} for none
   */
  public java.lang.String getGlobalState() {
    return globalState;
  }

  /**
   * State of the program, It is set to enabled if there are offers for at least one region.
   * @param globalState globalState or {@code null} for none
   */
  public FreeListingsProgramStatus setGlobalState(java.lang.String globalState) {
    this.globalState = globalState;
    return this;
  }

  /**
   * Status of the program in each region. Regions with the same status and review eligibility are
   * grouped together in `regionCodes`.
   * @return value or {@code null} for none
   */
  public java.util.List<FreeListingsProgramStatusRegionStatus> getRegionStatuses() {
    return regionStatuses;
  }

  /**
   * Status of the program in each region. Regions with the same status and review eligibility are
   * grouped together in `regionCodes`.
   * @param regionStatuses regionStatuses or {@code null} for none
   */
  public FreeListingsProgramStatus setRegionStatuses(java.util.List<FreeListingsProgramStatusRegionStatus> regionStatuses) {
    this.regionStatuses = regionStatuses;
    return this;
  }

  @Override
  public FreeListingsProgramStatus set(String fieldName, Object value) {
    return (FreeListingsProgramStatus) super.set(fieldName, value);
  }

  @Override
  public FreeListingsProgramStatus clone() {
    return (FreeListingsProgramStatus) super.clone();
  }

}
