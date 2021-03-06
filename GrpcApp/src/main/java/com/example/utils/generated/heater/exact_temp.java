// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HeatingDevice.proto

package com.example.utils.generated.heater;

/**
 * Protobuf type {@code com.example.exact_temp}
 */
public  final class exact_temp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.exact_temp)
    exact_tempOrBuilder {
private static final long serialVersionUID = 0L;
  // Use exact_temp.newBuilder() to construct.
  private exact_temp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private exact_temp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new exact_temp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private exact_temp(
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
          case 8: {

            heaterId_ = input.readInt32();
            break;
          }
          case 16: {

            exactTemp_ = input.readInt32();
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
    return com.example.utils.generated.heater.HeatingDevice.internal_static_com_example_exact_temp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.utils.generated.heater.HeatingDevice.internal_static_com_example_exact_temp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.utils.generated.heater.exact_temp.class, com.example.utils.generated.heater.exact_temp.Builder.class);
  }

  public static final int HEATER_ID_FIELD_NUMBER = 1;
  private int heaterId_;
  /**
   * <code>int32 heater_id = 1;</code>
   * @return The heaterId.
   */
  public int getHeaterId() {
    return heaterId_;
  }

  public static final int EXACTTEMP_FIELD_NUMBER = 2;
  private int exactTemp_;
  /**
   * <code>int32 exactTemp = 2;</code>
   * @return The exactTemp.
   */
  public int getExactTemp() {
    return exactTemp_;
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
    if (heaterId_ != 0) {
      output.writeInt32(1, heaterId_);
    }
    if (exactTemp_ != 0) {
      output.writeInt32(2, exactTemp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (heaterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, heaterId_);
    }
    if (exactTemp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, exactTemp_);
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
    if (!(obj instanceof com.example.utils.generated.heater.exact_temp)) {
      return super.equals(obj);
    }
    com.example.utils.generated.heater.exact_temp other = (com.example.utils.generated.heater.exact_temp) obj;

    if (getHeaterId()
        != other.getHeaterId()) return false;
    if (getExactTemp()
        != other.getExactTemp()) return false;
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
    hash = (37 * hash) + HEATER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHeaterId();
    hash = (37 * hash) + EXACTTEMP_FIELD_NUMBER;
    hash = (53 * hash) + getExactTemp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.utils.generated.heater.exact_temp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.utils.generated.heater.exact_temp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.heater.exact_temp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.utils.generated.heater.exact_temp parseFrom(
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
  public static Builder newBuilder(com.example.utils.generated.heater.exact_temp prototype) {
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
   * Protobuf type {@code com.example.exact_temp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.exact_temp)
      com.example.utils.generated.heater.exact_tempOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.utils.generated.heater.HeatingDevice.internal_static_com_example_exact_temp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.utils.generated.heater.HeatingDevice.internal_static_com_example_exact_temp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.utils.generated.heater.exact_temp.class, com.example.utils.generated.heater.exact_temp.Builder.class);
    }

    // Construct using com.example.utils.generated.heater.exact_temp.newBuilder()
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
      heaterId_ = 0;

      exactTemp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.utils.generated.heater.HeatingDevice.internal_static_com_example_exact_temp_descriptor;
    }

    @java.lang.Override
    public com.example.utils.generated.heater.exact_temp getDefaultInstanceForType() {
      return com.example.utils.generated.heater.exact_temp.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.utils.generated.heater.exact_temp build() {
      com.example.utils.generated.heater.exact_temp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.utils.generated.heater.exact_temp buildPartial() {
      com.example.utils.generated.heater.exact_temp result = new com.example.utils.generated.heater.exact_temp(this);
      result.heaterId_ = heaterId_;
      result.exactTemp_ = exactTemp_;
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
      if (other instanceof com.example.utils.generated.heater.exact_temp) {
        return mergeFrom((com.example.utils.generated.heater.exact_temp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.utils.generated.heater.exact_temp other) {
      if (other == com.example.utils.generated.heater.exact_temp.getDefaultInstance()) return this;
      if (other.getHeaterId() != 0) {
        setHeaterId(other.getHeaterId());
      }
      if (other.getExactTemp() != 0) {
        setExactTemp(other.getExactTemp());
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
      com.example.utils.generated.heater.exact_temp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.utils.generated.heater.exact_temp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int heaterId_ ;
    /**
     * <code>int32 heater_id = 1;</code>
     * @return The heaterId.
     */
    public int getHeaterId() {
      return heaterId_;
    }
    /**
     * <code>int32 heater_id = 1;</code>
     * @param value The heaterId to set.
     * @return This builder for chaining.
     */
    public Builder setHeaterId(int value) {
      
      heaterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 heater_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeaterId() {
      
      heaterId_ = 0;
      onChanged();
      return this;
    }

    private int exactTemp_ ;
    /**
     * <code>int32 exactTemp = 2;</code>
     * @return The exactTemp.
     */
    public int getExactTemp() {
      return exactTemp_;
    }
    /**
     * <code>int32 exactTemp = 2;</code>
     * @param value The exactTemp to set.
     * @return This builder for chaining.
     */
    public Builder setExactTemp(int value) {
      
      exactTemp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exactTemp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExactTemp() {
      
      exactTemp_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.example.exact_temp)
  }

  // @@protoc_insertion_point(class_scope:com.example.exact_temp)
  private static final com.example.utils.generated.heater.exact_temp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.utils.generated.heater.exact_temp();
  }

  public static com.example.utils.generated.heater.exact_temp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<exact_temp>
      PARSER = new com.google.protobuf.AbstractParser<exact_temp>() {
    @java.lang.Override
    public exact_temp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new exact_temp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<exact_temp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<exact_temp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.utils.generated.heater.exact_temp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

