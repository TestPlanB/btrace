// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/metrics/chrome/histogram_hashes.proto

package perfetto.protos;

public final class HistogramHashes {
  private HistogramHashes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChromeHistogramHashesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.ChromeHistogramHashes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int64 hash = 1;</code>
     * @return A list containing the hash.
     */
    java.util.List<java.lang.Long> getHashList();
    /**
     * <code>repeated int64 hash = 1;</code>
     * @return The count of hash.
     */
    int getHashCount();
    /**
     * <code>repeated int64 hash = 1;</code>
     * @param index The index of the element to return.
     * @return The hash at the given index.
     */
    long getHash(int index);
  }
  /**
   * <pre>
   * The list of Chrome Histogram hashes in trace track events.
   * Use cases include translating histogram hashes to histogram
   * names by getting this list, and prepending a translation table to the trace.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.ChromeHistogramHashes}
   */
  public static final class ChromeHistogramHashes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.ChromeHistogramHashes)
      ChromeHistogramHashesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChromeHistogramHashes.newBuilder() to construct.
    private ChromeHistogramHashes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChromeHistogramHashes() {
      hash_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChromeHistogramHashes();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.HistogramHashes.internal_static_perfetto_protos_ChromeHistogramHashes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.HistogramHashes.internal_static_perfetto_protos_ChromeHistogramHashes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.HistogramHashes.ChromeHistogramHashes.class, perfetto.protos.HistogramHashes.ChromeHistogramHashes.Builder.class);
    }

    public static final int HASH_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList hash_;
    /**
     * <code>repeated int64 hash = 1;</code>
     * @return A list containing the hash.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getHashList() {
      return hash_;
    }
    /**
     * <code>repeated int64 hash = 1;</code>
     * @return The count of hash.
     */
    public int getHashCount() {
      return hash_.size();
    }
    /**
     * <code>repeated int64 hash = 1;</code>
     * @param index The index of the element to return.
     * @return The hash at the given index.
     */
    public long getHash(int index) {
      return hash_.getLong(index);
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
      for (int i = 0; i < hash_.size(); i++) {
        output.writeInt64(1, hash_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < hash_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(hash_.getLong(i));
        }
        size += dataSize;
        size += 1 * getHashList().size();
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
      if (!(obj instanceof perfetto.protos.HistogramHashes.ChromeHistogramHashes)) {
        return super.equals(obj);
      }
      perfetto.protos.HistogramHashes.ChromeHistogramHashes other = (perfetto.protos.HistogramHashes.ChromeHistogramHashes) obj;

      if (!getHashList()
          .equals(other.getHashList())) return false;
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
      if (getHashCount() > 0) {
        hash = (37 * hash) + HASH_FIELD_NUMBER;
        hash = (53 * hash) + getHashList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes parseFrom(
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
    public static Builder newBuilder(perfetto.protos.HistogramHashes.ChromeHistogramHashes prototype) {
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
     * The list of Chrome Histogram hashes in trace track events.
     * Use cases include translating histogram hashes to histogram
     * names by getting this list, and prepending a translation table to the trace.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.ChromeHistogramHashes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.ChromeHistogramHashes)
        perfetto.protos.HistogramHashes.ChromeHistogramHashesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.HistogramHashes.internal_static_perfetto_protos_ChromeHistogramHashes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.HistogramHashes.internal_static_perfetto_protos_ChromeHistogramHashes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.HistogramHashes.ChromeHistogramHashes.class, perfetto.protos.HistogramHashes.ChromeHistogramHashes.Builder.class);
      }

      // Construct using perfetto.protos.HistogramHashes.ChromeHistogramHashes.newBuilder()
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
        hash_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.HistogramHashes.internal_static_perfetto_protos_ChromeHistogramHashes_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.HistogramHashes.ChromeHistogramHashes getDefaultInstanceForType() {
        return perfetto.protos.HistogramHashes.ChromeHistogramHashes.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.HistogramHashes.ChromeHistogramHashes build() {
        perfetto.protos.HistogramHashes.ChromeHistogramHashes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.HistogramHashes.ChromeHistogramHashes buildPartial() {
        perfetto.protos.HistogramHashes.ChromeHistogramHashes result = new perfetto.protos.HistogramHashes.ChromeHistogramHashes(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(perfetto.protos.HistogramHashes.ChromeHistogramHashes result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hash_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hash_ = hash_;
      }

      private void buildPartial0(perfetto.protos.HistogramHashes.ChromeHistogramHashes result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof perfetto.protos.HistogramHashes.ChromeHistogramHashes) {
          return mergeFrom((perfetto.protos.HistogramHashes.ChromeHistogramHashes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.HistogramHashes.ChromeHistogramHashes other) {
        if (other == perfetto.protos.HistogramHashes.ChromeHistogramHashes.getDefaultInstance()) return this;
        if (!other.hash_.isEmpty()) {
          if (hash_.isEmpty()) {
            hash_ = other.hash_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHashIsMutable();
            hash_.addAll(other.hash_);
          }
          onChanged();
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
              case 8: {
                long v = input.readInt64();
                ensureHashIsMutable();
                hash_.addLong(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureHashIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  hash_.addLong(input.readInt64());
                }
                input.popLimit(limit);
                break;
              } // case 10
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
      private int bitField0_;

      private com.google.protobuf.Internal.LongList hash_ = emptyLongList();
      private void ensureHashIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          hash_ = mutableCopy(hash_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @return A list containing the hash.
       */
      public java.util.List<java.lang.Long>
          getHashList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(hash_) : hash_;
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @return The count of hash.
       */
      public int getHashCount() {
        return hash_.size();
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @param index The index of the element to return.
       * @return The hash at the given index.
       */
      public long getHash(int index) {
        return hash_.getLong(index);
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @param index The index to set the value at.
       * @param value The hash to set.
       * @return This builder for chaining.
       */
      public Builder setHash(
          int index, long value) {
        
        ensureHashIsMutable();
        hash_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @param value The hash to add.
       * @return This builder for chaining.
       */
      public Builder addHash(long value) {
        
        ensureHashIsMutable();
        hash_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @param values The hash to add.
       * @return This builder for chaining.
       */
      public Builder addAllHash(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureHashIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hash_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 hash = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHash() {
        hash_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:perfetto.protos.ChromeHistogramHashes)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.ChromeHistogramHashes)
    private static final perfetto.protos.HistogramHashes.ChromeHistogramHashes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.HistogramHashes.ChromeHistogramHashes();
    }

    public static perfetto.protos.HistogramHashes.ChromeHistogramHashes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ChromeHistogramHashes>
        PARSER = new com.google.protobuf.AbstractParser<ChromeHistogramHashes>() {
      @java.lang.Override
      public ChromeHistogramHashes parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChromeHistogramHashes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChromeHistogramHashes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.HistogramHashes.ChromeHistogramHashes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_ChromeHistogramHashes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_perfetto_protos_ChromeHistogramHashes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5protos/perfetto/metrics/chrome/histogr" +
      "am_hashes.proto\022\017perfetto.protos\"%\n\025Chro" +
      "meHistogramHashes\022\014\n\004hash\030\001 \003(\003"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_ChromeHistogramHashes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_ChromeHistogramHashes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_perfetto_protos_ChromeHistogramHashes_descriptor,
        new java.lang.String[] { "Hash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}