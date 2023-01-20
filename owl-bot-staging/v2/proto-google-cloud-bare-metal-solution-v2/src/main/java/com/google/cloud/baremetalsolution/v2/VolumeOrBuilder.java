// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/volume.proto

package com.google.cloud.baremetalsolution.v2;

public interface VolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of this `Volume`.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * Format:
   * `projects/{project}/locations/{location}/volumes/{volume}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of this `Volume`.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * Format:
   * `projects/{project}/locations/{location}/volumes/{volume}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * An identifier for the `Volume`, generated by the backend.
   * </pre>
   *
   * <code>string id = 11;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * An identifier for the `Volume`, generated by the backend.
   * </pre>
   *
   * <code>string id = 11;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The storage type for this volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.StorageType storage_type = 2;</code>
   * @return The enum numeric value on the wire for storageType.
   */
  int getStorageTypeValue();
  /**
   * <pre>
   * The storage type for this volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.StorageType storage_type = 2;</code>
   * @return The storageType.
   */
  com.google.cloud.baremetalsolution.v2.Volume.StorageType getStorageType();

  /**
   * <pre>
   * The state of this storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.State state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state of this storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.State state = 3;</code>
   * @return The state.
   */
  com.google.cloud.baremetalsolution.v2.Volume.State getState();

  /**
   * <pre>
   * The requested size of this storage volume, in GiB.
   * </pre>
   *
   * <code>int64 requested_size_gib = 4;</code>
   * @return The requestedSizeGib.
   */
  long getRequestedSizeGib();

  /**
   * <pre>
   * The current size of this storage volume, in GiB, including space reserved
   * for snapshots. This size might be different than the requested size if the
   * storage volume has been configured with auto grow or auto shrink.
   * </pre>
   *
   * <code>int64 current_size_gib = 5;</code>
   * @return The currentSizeGib.
   */
  long getCurrentSizeGib();

  /**
   * <pre>
   * Additional emergency size that was requested for this Volume, in GiB.
   * current_size_gib includes this value.
   * </pre>
   *
   * <code>int64 emergency_size_gib = 14;</code>
   * @return The emergencySizeGib.
   */
  long getEmergencySizeGib();

  /**
   * <pre>
   * The size, in GiB, that this storage volume has expanded as a result of an
   * auto grow policy. In the absence of auto-grow, the value is 0.
   * </pre>
   *
   * <code>int64 auto_grown_size_gib = 6;</code>
   * @return The autoGrownSizeGib.
   */
  long getAutoGrownSizeGib();

  /**
   * <pre>
   * The space remaining in the storage volume for new LUNs, in GiB, excluding
   * space reserved for snapshots.
   * </pre>
   *
   * <code>int64 remaining_space_gib = 7;</code>
   * @return The remainingSpaceGib.
   */
  long getRemainingSpaceGib();

  /**
   * <pre>
   * Details about snapshot space reservation and usage on the storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.SnapshotReservationDetail snapshot_reservation_detail = 8;</code>
   * @return Whether the snapshotReservationDetail field is set.
   */
  boolean hasSnapshotReservationDetail();
  /**
   * <pre>
   * Details about snapshot space reservation and usage on the storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.SnapshotReservationDetail snapshot_reservation_detail = 8;</code>
   * @return The snapshotReservationDetail.
   */
  com.google.cloud.baremetalsolution.v2.Volume.SnapshotReservationDetail getSnapshotReservationDetail();
  /**
   * <pre>
   * Details about snapshot space reservation and usage on the storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.SnapshotReservationDetail snapshot_reservation_detail = 8;</code>
   */
  com.google.cloud.baremetalsolution.v2.Volume.SnapshotReservationDetailOrBuilder getSnapshotReservationDetailOrBuilder();

  /**
   * <pre>
   * The behavior to use when snapshot reserved space is full.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.SnapshotAutoDeleteBehavior snapshot_auto_delete_behavior = 9;</code>
   * @return The enum numeric value on the wire for snapshotAutoDeleteBehavior.
   */
  int getSnapshotAutoDeleteBehaviorValue();
  /**
   * <pre>
   * The behavior to use when snapshot reserved space is full.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Volume.SnapshotAutoDeleteBehavior snapshot_auto_delete_behavior = 9;</code>
   * @return The snapshotAutoDeleteBehavior.
   */
  com.google.cloud.baremetalsolution.v2.Volume.SnapshotAutoDeleteBehavior getSnapshotAutoDeleteBehavior();

  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Whether snapshots are enabled.
   * </pre>
   *
   * <code>bool snapshot_enabled = 13;</code>
   * @return The snapshotEnabled.
   */
  boolean getSnapshotEnabled();

  /**
   * <pre>
   * Immutable. Pod name.
   * </pre>
   *
   * <code>string pod = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The pod.
   */
  java.lang.String getPod();
  /**
   * <pre>
   * Immutable. Pod name.
   * </pre>
   *
   * <code>string pod = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for pod.
   */
  com.google.protobuf.ByteString
      getPodBytes();
}