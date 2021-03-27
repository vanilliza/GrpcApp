// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HeatingDevice.proto

package com.example.utils.generated.heater;

public final class HeatingDevice {
  private HeatingDevice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_Heater_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_Heater_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_HeaterStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_HeaterStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_exact_temp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_exact_temp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_HeaterUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_HeaterUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_HeaterStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_HeaterStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_HeaterDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_HeaterDetailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023HeatingDevice.proto\022\013com.example\"g\n\006He" +
      "ater\022\021\n\theater_id\030\001 \001(\005\022\016\n\006device\030\002 \001(\t\022" +
      "\027\n\017device_location\030\003 \001(\t\022\016\n\006status\030\004 \001(\t" +
      "\022\021\n\texactTemp\030\005 \001(\005\"(\n\023HeaterStatusReque" +
      "st\022\021\n\theater_id\030\001 \001(\005\"2\n\nexact_temp\022\021\n\th" +
      "eater_id\030\001 \001(\005\022\021\n\texactTemp\030\002 \001(\005\"(\n\023Hea" +
      "terUpdateRequest\022\021\n\tdevice_id\030\001 \001(\005\";\n\024H" +
      "eaterStatusResponse\022#\n\006heater\030\001 \001(\0132\023.co" +
      "m.example.Heater\";\n\024HeaterDetailResponse" +
      "\022#\n\006heater\030\001 \001(\0132\023.com.example.Heater2\210\004" +
      "\n\rHeaterService\022S\n\nshowStatus\022 .com.exam" +
      "ple.HeaterStatusRequest\032!.com.example.He" +
      "aterStatusResponse\"\000\022Y\n\020setTempatureHigh" +
      "\022 .com.example.HeaterUpdateRequest\032!.com" +
      ".example.HeaterDetailResponse\"\000\022X\n\017setTe" +
      "mpaturelow\022 .com.example.HeaterUpdateReq" +
      "uest\032!.com.example.HeaterDetailResponse\"" +
      "\000\022L\n\014setExactTemp\022\027.com.example.exact_te" +
      "mp\032!.com.example.HeaterDetailResponse\"\000\022" +
      "O\n\006setOff\022 .com.example.HeaterUpdateRequ" +
      "est\032!.com.example.HeaterDetailResponse\"\000" +
      "\022N\n\005setOn\022 .com.example.HeaterUpdateRequ" +
      "est\032!.com.example.HeaterDetailResponse\"\000" +
      "B&\n\"com.example.utils.generated.heaterP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_Heater_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_Heater_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_Heater_descriptor,
        new java.lang.String[] { "HeaterId", "Device", "DeviceLocation", "Status", "ExactTemp", });
    internal_static_com_example_HeaterStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_HeaterStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_HeaterStatusRequest_descriptor,
        new java.lang.String[] { "HeaterId", });
    internal_static_com_example_exact_temp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_exact_temp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_exact_temp_descriptor,
        new java.lang.String[] { "HeaterId", "ExactTemp", });
    internal_static_com_example_HeaterUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_HeaterUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_HeaterUpdateRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_com_example_HeaterStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_HeaterStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_HeaterStatusResponse_descriptor,
        new java.lang.String[] { "Heater", });
    internal_static_com_example_HeaterDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_HeaterDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_HeaterDetailResponse_descriptor,
        new java.lang.String[] { "Heater", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}