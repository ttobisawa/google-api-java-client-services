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

package com.google.api.services.compute.model;

/**
 * Model definition for InterconnectDiagnosticsLinkStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectDiagnosticsLinkStatus extends com.google.api.client.json.GenericJson {

  /**
   * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on
   * this link. This will be empty if the link is bundled
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InterconnectDiagnosticsARPEntry> arpCaches;

  static {
    // hack to force ProGuard to consider InterconnectDiagnosticsARPEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InterconnectDiagnosticsARPEntry.class);
  }

  /**
   * The unique ID for this link assigned during turn up by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String circuitId;

  /**
   * The Demarc address assigned by Google and provided in the LoA.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleDemarc;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectDiagnosticsLinkLACPStatus lacpStatus;

  /**
   * Describes the status of MACsec encryption on this link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectDiagnosticsMacsecStatus macsec;

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the received light level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectDiagnosticsLinkOpticalPower receivingOpticalPower;

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the transmitted light level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectDiagnosticsLinkOpticalPower transmittingOpticalPower;

  /**
   * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on
   * this link. This will be empty if the link is bundled
   * @return value or {@code null} for none
   */
  public java.util.List<InterconnectDiagnosticsARPEntry> getArpCaches() {
    return arpCaches;
  }

  /**
   * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP neighbor entries seen on
   * this link. This will be empty if the link is bundled
   * @param arpCaches arpCaches or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setArpCaches(java.util.List<InterconnectDiagnosticsARPEntry> arpCaches) {
    this.arpCaches = arpCaches;
    return this;
  }

  /**
   * The unique ID for this link assigned during turn up by Google.
   * @return value or {@code null} for none
   */
  public java.lang.String getCircuitId() {
    return circuitId;
  }

  /**
   * The unique ID for this link assigned during turn up by Google.
   * @param circuitId circuitId or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setCircuitId(java.lang.String circuitId) {
    this.circuitId = circuitId;
    return this;
  }

  /**
   * The Demarc address assigned by Google and provided in the LoA.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleDemarc() {
    return googleDemarc;
  }

  /**
   * The Demarc address assigned by Google and provided in the LoA.
   * @param googleDemarc googleDemarc or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setGoogleDemarc(java.lang.String googleDemarc) {
    this.googleDemarc = googleDemarc;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public InterconnectDiagnosticsLinkLACPStatus getLacpStatus() {
    return lacpStatus;
  }

  /**
   * @param lacpStatus lacpStatus or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setLacpStatus(InterconnectDiagnosticsLinkLACPStatus lacpStatus) {
    this.lacpStatus = lacpStatus;
    return this;
  }

  /**
   * Describes the status of MACsec encryption on this link.
   * @return value or {@code null} for none
   */
  public InterconnectDiagnosticsMacsecStatus getMacsec() {
    return macsec;
  }

  /**
   * Describes the status of MACsec encryption on this link.
   * @param macsec macsec or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setMacsec(InterconnectDiagnosticsMacsecStatus macsec) {
    this.macsec = macsec;
    return this;
  }

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the received light level.
   * @return value or {@code null} for none
   */
  public InterconnectDiagnosticsLinkOpticalPower getReceivingOpticalPower() {
    return receivingOpticalPower;
  }

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the received light level.
   * @param receivingOpticalPower receivingOpticalPower or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setReceivingOpticalPower(InterconnectDiagnosticsLinkOpticalPower receivingOpticalPower) {
    this.receivingOpticalPower = receivingOpticalPower;
    return this;
  }

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the transmitted light level.
   * @return value or {@code null} for none
   */
  public InterconnectDiagnosticsLinkOpticalPower getTransmittingOpticalPower() {
    return transmittingOpticalPower;
  }

  /**
   * An InterconnectDiagnostics.LinkOpticalPower object, describing the current value and status of
   * the transmitted light level.
   * @param transmittingOpticalPower transmittingOpticalPower or {@code null} for none
   */
  public InterconnectDiagnosticsLinkStatus setTransmittingOpticalPower(InterconnectDiagnosticsLinkOpticalPower transmittingOpticalPower) {
    this.transmittingOpticalPower = transmittingOpticalPower;
    return this;
  }

  @Override
  public InterconnectDiagnosticsLinkStatus set(String fieldName, Object value) {
    return (InterconnectDiagnosticsLinkStatus) super.set(fieldName, value);
  }

  @Override
  public InterconnectDiagnosticsLinkStatus clone() {
    return (InterconnectDiagnosticsLinkStatus) super.clone();
  }

}
