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

package com.google.api.services.transcoder.v1.model;

/**
 * Input asset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Input extends com.google.api.client.json.GenericJson {

  /**
   * A unique key for this input. Must be specified when using advanced mapping and edit lists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Preprocessing configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreprocessingConfig preprocessingConfig;

  /**
   * URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud
   * Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value will be populated
   * from `Job.input_uri`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * A unique key for this input. Must be specified when using advanced mapping and edit lists.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * A unique key for this input. Must be specified when using advanced mapping and edit lists.
   * @param key key or {@code null} for none
   */
  public Input setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Preprocessing configurations.
   * @return value or {@code null} for none
   */
  public PreprocessingConfig getPreprocessingConfig() {
    return preprocessingConfig;
  }

  /**
   * Preprocessing configurations.
   * @param preprocessingConfig preprocessingConfig or {@code null} for none
   */
  public Input setPreprocessingConfig(PreprocessingConfig preprocessingConfig) {
    this.preprocessingConfig = preprocessingConfig;
    return this;
  }

  /**
   * URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud
   * Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value will be populated
   * from `Job.input_uri`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud
   * Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value will be populated
   * from `Job.input_uri`.
   * @param uri uri or {@code null} for none
   */
  public Input setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public Input set(String fieldName, Object value) {
    return (Input) super.set(fieldName, value);
  }

  @Override
  public Input clone() {
    return (Input) super.clone();
  }

}
