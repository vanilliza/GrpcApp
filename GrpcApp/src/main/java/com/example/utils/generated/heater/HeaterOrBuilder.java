// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HeatingDevice.proto

package com.example.utils.generated.heater;

public interface HeaterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.Heater)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 heater_id = 1;</code>
   * @return The heaterId.
   */
  int getHeaterId();

  /**
   * <code>string device = 2;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <code>string device = 2;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <code>string device_location = 3;</code>
   * @return The deviceLocation.
   */
  java.lang.String getDeviceLocation();
  /**
   * <code>string device_location = 3;</code>
   * @return The bytes for deviceLocation.
   */
  com.google.protobuf.ByteString
      getDeviceLocationBytes();

  /**
   * <code>string status = 4;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 4;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>int32 exactTemp = 5;</code>
   * @return The exactTemp.
   */
  int getExactTemp();
}