// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarParkOperations.proto

package com.example.utils.generated.carpark;

public final class CarParkOperations {
  private CarParkOperations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_CarPark_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_CarPark_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_carparkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_carparkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_CarParkToUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_CarParkToUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_allCarp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_allCarp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_carParkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_carParkResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CarParkOperations.proto\022\013com.example\"?" +
      "\n\007CarPark\022\022\n\ncarPark_id\030\001 \001(\005\022\016\n\006status\030" +
      "\002 \001(\t\022\020\n\010location\030\003 \001(\t\"$\n\016carparkReques" +
      "t\022\022\n\ncarPark_id\030\001 \001(\005\"+\n\026CarParkToUpdate" +
      "Request\022\021\n\tdevice_id\030\001 \001(\005\"\031\n\007allCarp\022\016\n" +
      "\006status\030\001 \001(\t\"8\n\017carParkResponse\022%\n\007carP" +
      "ark\030\001 \001(\0132\024.com.example.CarPark2\304\002\n\016carP" +
      "arkService\022I\n\nshowStatus\022\033.com.example.c" +
      "arparkRequest\032\034.com.example.carParkRespo" +
      "nse\"\000\022N\n\007setFull\022#.com.example.CarParkTo" +
      "UpdateRequest\032\034.com.example.carParkRespo" +
      "nse\"\000\022P\n\tsetSpaces\022#.com.example.CarPark" +
      "ToUpdateRequest\032\034.com.example.carParkRes" +
      "ponse\"\000\022E\n\013allCarParks\022\024.com.example.all" +
      "Carp\032\034.com.example.carParkResponse\"\0000\001B\'" +
      "\n#com.example.utils.generated.carparkP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_CarPark_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_CarPark_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_CarPark_descriptor,
        new java.lang.String[] { "CarParkId", "Status", "Location", });
    internal_static_com_example_carparkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_carparkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_carparkRequest_descriptor,
        new java.lang.String[] { "CarParkId", });
    internal_static_com_example_CarParkToUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_CarParkToUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_CarParkToUpdateRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_com_example_allCarp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_allCarp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_allCarp_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_com_example_carParkResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_carParkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_carParkResponse_descriptor,
        new java.lang.String[] { "CarPark", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
