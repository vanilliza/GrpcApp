// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirConditioningDevice.proto

package com.example.utils.generated.aircon;

/**
 * Protobuf type {@code com.example.ACResponse}
 */
public  final class ACResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.ACResponse)
    ACResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACResponse.newBuilder() to construct.
  private ACResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ACResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ACResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.example.utils.generated.aircon.AirConditioning.Builder subBuilder = null;
            if (airConditioning_ != null) {
              subBuilder = airConditioning_.toBuilder();
            }
            airConditioning_ = input.readMessage(com.example.utils.generated.aircon.AirConditioning.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(airConditioning_);
              airConditioning_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.utils.generated.aircon.AirConditioningDevice.internal_static_com_example_ACResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.utils.generated.aircon.AirConditioningDevice.internal_static_com_example_ACResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.utils.generated.aircon.ACResponse.class, com.example.utils.generated.aircon.ACResponse.Builder.class);
  }

  public static final int AIRCONDITIONING_FIELD_NUMBER = 1;
  private com.example.utils.generated.aircon.AirConditioning airConditioning_;
  /**
   * <code>.com.example.AirConditioning airConditioning = 1;</code>
   * @return Whether the airConditioning field is set.
   */
  public boolean hasAirConditioning() {
    return airConditioning_ != null;
  }
  /**
   * <code>.com.example.AirConditioning airConditioning = 1;</code>
   * @return The airConditioning.
   */
  public com.example.utils.generated.aircon.AirConditioning getAirConditioning() {
    return airConditioning_ == null ? com.example.utils.generated.aircon.AirConditioning.getDefaultInstance() : airConditioning_;
  }
  /**
   * <code>.com.example.AirConditioning airConditioning = 1;</code>
   */
  public com.example.utils.generated.aircon.AirConditioningOrBuilder getAirConditioningOrBuilder() {
    return getAirConditioning();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (airConditioning_ != null) {
      output.writeMessage(1, getAirConditioning());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (airConditioning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAirConditioning());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.utils.generated.aircon.ACResponse)) {
      return super.equals(obj);
    }
    com.example.utils.generated.aircon.ACResponse other = (com.example.utils.generated.aircon.ACResponse) obj;

    if (hasAirConditioning() != other.hasAirConditioning()) return false;
    if (hasAirConditioning()) {
      if (!getAirConditioning()
          .equals(other.getAirConditioning())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAirConditioning()) {
      hash = (37 * hash) + AIRCONDITIONING_FIELD_NUMBER;
      hash = (53 * hash) + getAirConditioning().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.utils.generated.aircon.ACResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.aircon.ACResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.aircon.ACResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.utils.generated.aircon.ACResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.ACResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.ACResponse)
      com.example.utils.generated.aircon.ACResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.utils.generated.aircon.AirConditioningDevice.internal_static_com_example_ACResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.utils.generated.aircon.AirConditioningDevice.internal_static_com_example_ACResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.utils.generated.aircon.ACResponse.class, com.example.utils.generated.aircon.ACResponse.Builder.class);
    }

    // Construct using com.example.utils.generated.aircon.ACResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (airConditioningBuilder_ == null) {
        airConditioning_ = null;
      } else {
        airConditioning_ = null;
        airConditioningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.utils.generated.aircon.AirConditioningDevice.internal_static_com_example_ACResponse_descriptor;
    }

    @java.lang.Override
    public com.example.utils.generated.aircon.ACResponse getDefaultInstanceForType() {
      return com.example.utils.generated.aircon.ACResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.utils.generated.aircon.ACResponse build() {
      com.example.utils.generated.aircon.ACResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.utils.generated.aircon.ACResponse buildPartial() {
      com.example.utils.generated.aircon.ACResponse result = new com.example.utils.generated.aircon.ACResponse(this);
      if (airConditioningBuilder_ == null) {
        result.airConditioning_ = airConditioning_;
      } else {
        result.airConditioning_ = airConditioningBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.utils.generated.aircon.ACResponse) {
        return mergeFrom((com.example.utils.generated.aircon.ACResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.utils.generated.aircon.ACResponse other) {
      if (other == com.example.utils.generated.aircon.ACResponse.getDefaultInstance()) return this;
      if (other.hasAirConditioning()) {
        mergeAirConditioning(other.getAirConditioning());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.utils.generated.aircon.ACResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.utils.generated.aircon.ACResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.utils.generated.aircon.AirConditioning airConditioning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.utils.generated.aircon.AirConditioning, com.example.utils.generated.aircon.AirConditioning.Builder, com.example.utils.generated.aircon.AirConditioningOrBuilder> airConditioningBuilder_;
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     * @return Whether the airConditioning field is set.
     */
    public boolean hasAirConditioning() {
      return airConditioningBuilder_ != null || airConditioning_ != null;
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     * @return The airConditioning.
     */
    public com.example.utils.generated.aircon.AirConditioning getAirConditioning() {
      if (airConditioningBuilder_ == null) {
        return airConditioning_ == null ? com.example.utils.generated.aircon.AirConditioning.getDefaultInstance() : airConditioning_;
      } else {
        return airConditioningBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public Builder setAirConditioning(com.example.utils.generated.aircon.AirConditioning value) {
      if (airConditioningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        airConditioning_ = value;
        onChanged();
      } else {
        airConditioningBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public Builder setAirConditioning(
        com.example.utils.generated.aircon.AirConditioning.Builder builderForValue) {
      if (airConditioningBuilder_ == null) {
        airConditioning_ = builderForValue.build();
        onChanged();
      } else {
        airConditioningBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public Builder mergeAirConditioning(com.example.utils.generated.aircon.AirConditioning value) {
      if (airConditioningBuilder_ == null) {
        if (airConditioning_ != null) {
          airConditioning_ =
            com.example.utils.generated.aircon.AirConditioning.newBuilder(airConditioning_).mergeFrom(value).buildPartial();
        } else {
          airConditioning_ = value;
        }
        onChanged();
      } else {
        airConditioningBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public Builder clearAirConditioning() {
      if (airConditioningBuilder_ == null) {
        airConditioning_ = null;
        onChanged();
      } else {
        airConditioning_ = null;
        airConditioningBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public com.example.utils.generated.aircon.AirConditioning.Builder getAirConditioningBuilder() {
      
      onChanged();
      return getAirConditioningFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    public com.example.utils.generated.aircon.AirConditioningOrBuilder getAirConditioningOrBuilder() {
      if (airConditioningBuilder_ != null) {
        return airConditioningBuilder_.getMessageOrBuilder();
      } else {
        return airConditioning_ == null ?
            com.example.utils.generated.aircon.AirConditioning.getDefaultInstance() : airConditioning_;
      }
    }
    /**
     * <code>.com.example.AirConditioning airConditioning = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.utils.generated.aircon.AirConditioning, com.example.utils.generated.aircon.AirConditioning.Builder, com.example.utils.generated.aircon.AirConditioningOrBuilder> 
        getAirConditioningFieldBuilder() {
      if (airConditioningBuilder_ == null) {
        airConditioningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.utils.generated.aircon.AirConditioning, com.example.utils.generated.aircon.AirConditioning.Builder, com.example.utils.generated.aircon.AirConditioningOrBuilder>(
                getAirConditioning(),
                getParentForChildren(),
                isClean());
        airConditioning_ = null;
      }
      return airConditioningBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.ACResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.ACResponse)
  private static final com.example.utils.generated.aircon.ACResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.utils.generated.aircon.ACResponse();
  }

  public static com.example.utils.generated.aircon.ACResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACResponse>
      PARSER = new com.google.protobuf.AbstractParser<ACResponse>() {
    @java.lang.Override
    public ACResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ACResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ACResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.utils.generated.aircon.ACResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
