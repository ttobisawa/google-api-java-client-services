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

package com.google.api.services.dataproc.model;

/**
 * Metadata describing the Batch operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Name of the batch for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String batch;

  /**
   * Batch UUID for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String batchUuid;

  /**
   * The time when the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Short description of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The time when the operation was finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String doneTime;

  /**
   * Labels associated with the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * Warnings encountered during operation execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> warnings;

  /**
   * Name of the batch for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getBatch() {
    return batch;
  }

  /**
   * Name of the batch for the operation.
   * @param batch batch or {@code null} for none
   */
  public BatchOperationMetadata setBatch(java.lang.String batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Batch UUID for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getBatchUuid() {
    return batchUuid;
  }

  /**
   * Batch UUID for the operation.
   * @param batchUuid batchUuid or {@code null} for none
   */
  public BatchOperationMetadata setBatchUuid(java.lang.String batchUuid) {
    this.batchUuid = batchUuid;
    return this;
  }

  /**
   * The time when the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public BatchOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Short description of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Short description of the operation.
   * @param description description or {@code null} for none
   */
  public BatchOperationMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The time when the operation was finished.
   * @return value or {@code null} for none
   */
  public String getDoneTime() {
    return doneTime;
  }

  /**
   * The time when the operation was finished.
   * @param doneTime doneTime or {@code null} for none
   */
  public BatchOperationMetadata setDoneTime(String doneTime) {
    this.doneTime = doneTime;
    return this;
  }

  /**
   * Labels associated with the operation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with the operation.
   * @param labels labels or {@code null} for none
   */
  public BatchOperationMetadata setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * The operation type.
   * @param operationType operationType or {@code null} for none
   */
  public BatchOperationMetadata setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Warnings encountered during operation execution.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWarnings() {
    return warnings;
  }

  /**
   * Warnings encountered during operation execution.
   * @param warnings warnings or {@code null} for none
   */
  public BatchOperationMetadata setWarnings(java.util.List<java.lang.String> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public BatchOperationMetadata set(String fieldName, Object value) {
    return (BatchOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public BatchOperationMetadata clone() {
    return (BatchOperationMetadata) super.clone();
  }

}