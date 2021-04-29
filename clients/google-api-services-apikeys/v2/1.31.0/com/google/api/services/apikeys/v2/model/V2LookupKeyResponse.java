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

package com.google.api.services.apikeys.v2.model;

/**
 * Response message for `LookupKey` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Keys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V2LookupKeyResponse extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the API key. If the API key has been purged, resource name is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The project that owns the key with the value specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The resource name of the API key. If the API key has been purged, resource name is empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the API key. If the API key has been purged, resource name is empty.
   * @param name name or {@code null} for none
   */
  public V2LookupKeyResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The project that owns the key with the value specified in the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The project that owns the key with the value specified in the request.
   * @param parent parent or {@code null} for none
   */
  public V2LookupKeyResponse setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public V2LookupKeyResponse set(String fieldName, Object value) {
    return (V2LookupKeyResponse) super.set(fieldName, value);
  }

  @Override
  public V2LookupKeyResponse clone() {
    return (V2LookupKeyResponse) super.clone();
  }

}