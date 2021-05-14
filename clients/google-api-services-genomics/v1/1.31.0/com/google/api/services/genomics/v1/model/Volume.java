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

package com.google.api.services.genomics.v1.model;

/**
 * Carries information about storage that can be attached to a VM. Specify either `Volume` or
 * `Disk`, but not both.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Volume extends com.google.api.client.json.GenericJson {

  /**
   * Configuration for a existing disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExistingDisk existingDisk;

  /**
   * Configuration for an NFS mount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NFSMount nfsMount;

  /**
   * Configuration for a persistent disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PersistentDisk persistentDisk;

  /**
   * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name
   * must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with
   * a hyphen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volume;

  /**
   * Configuration for a existing disk.
   * @return value or {@code null} for none
   */
  public ExistingDisk getExistingDisk() {
    return existingDisk;
  }

  /**
   * Configuration for a existing disk.
   * @param existingDisk existingDisk or {@code null} for none
   */
  public Volume setExistingDisk(ExistingDisk existingDisk) {
    this.existingDisk = existingDisk;
    return this;
  }

  /**
   * Configuration for an NFS mount.
   * @return value or {@code null} for none
   */
  public NFSMount getNfsMount() {
    return nfsMount;
  }

  /**
   * Configuration for an NFS mount.
   * @param nfsMount nfsMount or {@code null} for none
   */
  public Volume setNfsMount(NFSMount nfsMount) {
    this.nfsMount = nfsMount;
    return this;
  }

  /**
   * Configuration for a persistent disk.
   * @return value or {@code null} for none
   */
  public PersistentDisk getPersistentDisk() {
    return persistentDisk;
  }

  /**
   * Configuration for a persistent disk.
   * @param persistentDisk persistentDisk or {@code null} for none
   */
  public Volume setPersistentDisk(PersistentDisk persistentDisk) {
    this.persistentDisk = persistentDisk;
    return this;
  }

  /**
   * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name
   * must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with
   * a hyphen.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolume() {
    return volume;
  }

  /**
   * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name
   * must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with
   * a hyphen.
   * @param volume volume or {@code null} for none
   */
  public Volume setVolume(java.lang.String volume) {
    this.volume = volume;
    return this;
  }

  @Override
  public Volume set(String fieldName, Object value) {
    return (Volume) super.set(fieldName, value);
  }

  @Override
  public Volume clone() {
    return (Volume) super.clone();
  }

}