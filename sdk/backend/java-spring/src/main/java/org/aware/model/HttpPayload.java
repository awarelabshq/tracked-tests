// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.aware.model;

/**
 * <pre>
 * Represents an arbitrary http(s) payload of requests / responses.
 * </pre>
 *
 * Protobuf type {@code org.aware.model.HttpPayload}
 */
public final class HttpPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.aware.model.HttpPayload)
    HttpPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpPayload.newBuilder() to construct.
  private HttpPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpPayload() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpPayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.aware.model.Model.internal_static_org_aware_model_HttpPayload_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetHeaderMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.aware.model.Model.internal_static_org_aware_model_HttpPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.aware.model.HttpPayload.class, org.aware.model.HttpPayload.Builder.class);
  }

  private int bodyCase_ = 0;
  private java.lang.Object body_;
  public enum BodyCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    JSON_BODY(2),
    BODY_NOT_SET(0);
    private final int value;
    private BodyCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BodyCase valueOf(int value) {
      return forNumber(value);
    }

    public static BodyCase forNumber(int value) {
      switch (value) {
        case 2: return JSON_BODY;
        case 0: return BODY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public BodyCase
  getBodyCase() {
    return BodyCase.forNumber(
        bodyCase_);
  }

  public static final int HEADER_MAP_FIELD_NUMBER = 1;
  private static final class HeaderMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.aware.model.Model.internal_static_org_aware_model_HttpPayload_HeaderMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> headerMap_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetHeaderMap() {
    if (headerMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HeaderMapDefaultEntryHolder.defaultEntry);
    }
    return headerMap_;
  }
  public int getHeaderMapCount() {
    return internalGetHeaderMap().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; header_map = 1;</code>
   */
  @java.lang.Override
  public boolean containsHeaderMap(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHeaderMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHeaderMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
    return getHeaderMapMap();
  }
  /**
   * <code>map&lt;string, string&gt; header_map = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getHeaderMapMap() {
    return internalGetHeaderMap().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; header_map = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getHeaderMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeaderMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; header_map = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getHeaderMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeaderMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int JSON_BODY_FIELD_NUMBER = 2;
  /**
   * <code>string json_body = 2;</code>
   * @return Whether the jsonBody field is set.
   */
  public boolean hasJsonBody() {
    return bodyCase_ == 2;
  }
  /**
   * <code>string json_body = 2;</code>
   * @return The jsonBody.
   */
  public java.lang.String getJsonBody() {
    java.lang.Object ref = "";
    if (bodyCase_ == 2) {
      ref = body_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bodyCase_ == 2) {
        body_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string json_body = 2;</code>
   * @return The bytes for jsonBody.
   */
  public com.google.protobuf.ByteString
      getJsonBodyBytes() {
    java.lang.Object ref = "";
    if (bodyCase_ == 2) {
      ref = body_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (bodyCase_ == 2) {
        body_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetHeaderMap(),
        HeaderMapDefaultEntryHolder.defaultEntry,
        1);
    if (bodyCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, body_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetHeaderMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      headerMap__ = HeaderMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, headerMap__);
    }
    if (bodyCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, body_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.aware.model.HttpPayload)) {
      return super.equals(obj);
    }
    org.aware.model.HttpPayload other = (org.aware.model.HttpPayload) obj;

    if (!internalGetHeaderMap().equals(
        other.internalGetHeaderMap())) return false;
    if (!getBodyCase().equals(other.getBodyCase())) return false;
    switch (bodyCase_) {
      case 2:
        if (!getJsonBody()
            .equals(other.getJsonBody())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetHeaderMap().getMap().isEmpty()) {
      hash = (37 * hash) + HEADER_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeaderMap().hashCode();
    }
    switch (bodyCase_) {
      case 2:
        hash = (37 * hash) + JSON_BODY_FIELD_NUMBER;
        hash = (53 * hash) + getJsonBody().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.aware.model.HttpPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.aware.model.HttpPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.aware.model.HttpPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.aware.model.HttpPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.aware.model.HttpPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.aware.model.HttpPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.aware.model.HttpPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.aware.model.HttpPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.aware.model.HttpPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.aware.model.HttpPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.aware.model.HttpPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.aware.model.HttpPayload parseFrom(
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
  public static Builder newBuilder(org.aware.model.HttpPayload prototype) {
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
   * <pre>
   * Represents an arbitrary http(s) payload of requests / responses.
   * </pre>
   *
   * Protobuf type {@code org.aware.model.HttpPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.aware.model.HttpPayload)
      org.aware.model.HttpPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.aware.model.Model.internal_static_org_aware_model_HttpPayload_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetHeaderMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableHeaderMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.aware.model.Model.internal_static_org_aware_model_HttpPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.aware.model.HttpPayload.class, org.aware.model.HttpPayload.Builder.class);
    }

    // Construct using org.aware.model.HttpPayload.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableHeaderMap().clear();
      bodyCase_ = 0;
      body_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.aware.model.Model.internal_static_org_aware_model_HttpPayload_descriptor;
    }

    @java.lang.Override
    public org.aware.model.HttpPayload getDefaultInstanceForType() {
      return org.aware.model.HttpPayload.getDefaultInstance();
    }

    @java.lang.Override
    public org.aware.model.HttpPayload build() {
      org.aware.model.HttpPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.aware.model.HttpPayload buildPartial() {
      org.aware.model.HttpPayload result = new org.aware.model.HttpPayload(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.aware.model.HttpPayload result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headerMap_ = internalGetHeaderMap();
        result.headerMap_.makeImmutable();
      }
    }

    private void buildPartialOneofs(org.aware.model.HttpPayload result) {
      result.bodyCase_ = bodyCase_;
      result.body_ = this.body_;
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
      if (other instanceof org.aware.model.HttpPayload) {
        return mergeFrom((org.aware.model.HttpPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.aware.model.HttpPayload other) {
      if (other == org.aware.model.HttpPayload.getDefaultInstance()) return this;
      internalGetMutableHeaderMap().mergeFrom(
          other.internalGetHeaderMap());
      bitField0_ |= 0x00000001;
      switch (other.getBodyCase()) {
        case JSON_BODY: {
          bodyCase_ = 2;
          body_ = other.body_;
          onChanged();
          break;
        }
        case BODY_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              headerMap__ = input.readMessage(
                  HeaderMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableHeaderMap().getMutableMap().put(
                  headerMap__.getKey(), headerMap__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              bodyCase_ = 2;
              body_ = s;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bodyCase_ = 0;
    private java.lang.Object body_;
    public BodyCase
        getBodyCase() {
      return BodyCase.forNumber(
          bodyCase_);
    }

    public Builder clearBody() {
      bodyCase_ = 0;
      body_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> headerMap_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetHeaderMap() {
      if (headerMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeaderMapDefaultEntryHolder.defaultEntry);
      }
      return headerMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableHeaderMap() {
      if (headerMap_ == null) {
        headerMap_ = com.google.protobuf.MapField.newMapField(
            HeaderMapDefaultEntryHolder.defaultEntry);
      }
      if (!headerMap_.isMutable()) {
        headerMap_ = headerMap_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return headerMap_;
    }
    public int getHeaderMapCount() {
      return internalGetHeaderMap().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    @java.lang.Override
    public boolean containsHeaderMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHeaderMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeaderMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
      return getHeaderMapMap();
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getHeaderMapMap() {
      return internalGetHeaderMap().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getHeaderMapOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeaderMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getHeaderMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeaderMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearHeaderMap() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableHeaderMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    public Builder removeHeaderMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHeaderMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableHeaderMap() {
      bitField0_ |= 0x00000001;
      return internalGetMutableHeaderMap().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    public Builder putHeaderMap(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableHeaderMap().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; header_map = 1;</code>
     */
    public Builder putAllHeaderMap(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableHeaderMap().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     * <code>string json_body = 2;</code>
     * @return Whether the jsonBody field is set.
     */
    @java.lang.Override
    public boolean hasJsonBody() {
      return bodyCase_ == 2;
    }
    /**
     * <code>string json_body = 2;</code>
     * @return The jsonBody.
     */
    @java.lang.Override
    public java.lang.String getJsonBody() {
      java.lang.Object ref = "";
      if (bodyCase_ == 2) {
        ref = body_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bodyCase_ == 2) {
          body_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string json_body = 2;</code>
     * @return The bytes for jsonBody.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJsonBodyBytes() {
      java.lang.Object ref = "";
      if (bodyCase_ == 2) {
        ref = body_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (bodyCase_ == 2) {
          body_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string json_body = 2;</code>
     * @param value The jsonBody to set.
     * @return This builder for chaining.
     */
    public Builder setJsonBody(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bodyCase_ = 2;
      body_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string json_body = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsonBody() {
      if (bodyCase_ == 2) {
        bodyCase_ = 0;
        body_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string json_body = 2;</code>
     * @param value The bytes for jsonBody to set.
     * @return This builder for chaining.
     */
    public Builder setJsonBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bodyCase_ = 2;
      body_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.aware.model.HttpPayload)
  }

  // @@protoc_insertion_point(class_scope:org.aware.model.HttpPayload)
  private static final org.aware.model.HttpPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.aware.model.HttpPayload();
  }

  public static org.aware.model.HttpPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpPayload>
      PARSER = new com.google.protobuf.AbstractParser<HttpPayload>() {
    @java.lang.Override
    public HttpPayload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HttpPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.aware.model.HttpPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

