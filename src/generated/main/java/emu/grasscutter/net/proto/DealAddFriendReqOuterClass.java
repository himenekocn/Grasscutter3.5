// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DealAddFriendReq.proto

package emu.grasscutter.net.proto;

public final class DealAddFriendReqOuterClass {
  private DealAddFriendReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DealAddFriendReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DealAddFriendReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 targetUid = 1;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    int getDealAddFriendResultValue();
    /**
     * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
     * @return The dealAddFriendResult.
     */
    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult();
  }
  /**
   * Protobuf type {@code DealAddFriendReq}
   */
  public static final class DealAddFriendReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DealAddFriendReq)
      DealAddFriendReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DealAddFriendReq.newBuilder() to construct.
    private DealAddFriendReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DealAddFriendReq() {
      dealAddFriendResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DealAddFriendReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DealAddFriendReq(
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

              targetUid_ = input.readUInt32();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              dealAddFriendResult_ = rawValue;
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
      return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.class, emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.Builder.class);
    }

    /**
     * Protobuf enum {@code DealAddFriendReq.DHDJDMLDIDK}
     */
    public enum DHDJDMLDIDK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4080;</code>
       */
      PEPPOHPHJOJ(1, 4080),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DHDJDMLDIDK DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final DHDJDMLDIDK EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4080;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4080;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DHDJDMLDIDK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DHDJDMLDIDK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4080: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DHDJDMLDIDK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DHDJDMLDIDK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DHDJDMLDIDK>() {
              public DHDJDMLDIDK findValueByNumber(int number) {
                return DHDJDMLDIDK.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final DHDJDMLDIDK[] VALUES = getStaticValuesArray();
      private static DHDJDMLDIDK[] getStaticValuesArray() {
        return new DHDJDMLDIDK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static DHDJDMLDIDK valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private DHDJDMLDIDK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DealAddFriendReq.DHDJDMLDIDK)
    }

    public static final int TARGETUID_FIELD_NUMBER = 1;
    private int targetUid_;
    /**
     * <code>uint32 targetUid = 1;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int DEALADDFRIENDRESULT_FIELD_NUMBER = 6;
    private int dealAddFriendResult_;
    /**
     * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    @java.lang.Override public int getDealAddFriendResultValue() {
      return dealAddFriendResult_;
    }
    /**
     * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
     * @return The dealAddFriendResult.
     */
    @java.lang.Override public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
      return result == null ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
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
      if (targetUid_ != 0) {
        output.writeUInt32(1, targetUid_);
      }
      if (dealAddFriendResult_ != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        output.writeEnum(6, dealAddFriendResult_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetUid_);
      }
      if (dealAddFriendResult_ != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, dealAddFriendResult_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq other = (emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (dealAddFriendResult_ != other.dealAddFriendResult_) return false;
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
      hash = (37 * hash) + TARGETUID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + DEALADDFRIENDRESULT_FIELD_NUMBER;
      hash = (53 * hash) + dealAddFriendResult_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq prototype) {
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
     * Protobuf type {@code DealAddFriendReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DealAddFriendReq)
        emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.class, emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.newBuilder()
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
        targetUid_ = 0;

        dealAddFriendResult_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.internal_static_DealAddFriendReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq build() {
        emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq buildPartial() {
        emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq result = new emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq(this);
        result.targetUid_ = targetUid_;
        result.dealAddFriendResult_ = dealAddFriendResult_;
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
        if (other instanceof emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) {
          return mergeFrom((emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq other) {
        if (other == emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.dealAddFriendResult_ != 0) {
          setDealAddFriendResultValue(other.getDealAddFriendResultValue());
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
        emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 targetUid = 1;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 targetUid = 1;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetUid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int dealAddFriendResult_ = 0;
      /**
       * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
       * @return The enum numeric value on the wire for dealAddFriendResult.
       */
      @java.lang.Override public int getDealAddFriendResultValue() {
        return dealAddFriendResult_;
      }
      /**
       * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
       * @param value The enum numeric value on the wire for dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResultValue(int value) {
        
        dealAddFriendResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
       * @return The dealAddFriendResult.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
        return result == null ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
      }
      /**
       * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
       * @param value The dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResult(emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dealAddFriendResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType dealAddFriendResult = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDealAddFriendResult() {
        
        dealAddFriendResult_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DealAddFriendReq)
    }

    // @@protoc_insertion_point(class_scope:DealAddFriendReq)
    private static final emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq();
    }

    public static emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DealAddFriendReq>
        PARSER = new com.google.protobuf.AbstractParser<DealAddFriendReq>() {
      @java.lang.Override
      public DealAddFriendReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DealAddFriendReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DealAddFriendReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DealAddFriendReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DealAddFriendReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DealAddFriendReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DealAddFriendReq.proto\032\035DealAddFriendR" +
      "esultType.proto\"\276\001\n\020DealAddFriendReq\022\021\n\t" +
      "targetUid\030\001 \001(\r\0225\n\023dealAddFriendResult\030\006" +
      " \001(\0162\030.DealAddFriendResultType\"`\n\013DHDJDM" +
      "LDIDK\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\360\037\022\017\n\013DCD" +
      "NILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAO" +
      "CI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor(),
        });
    internal_static_DealAddFriendReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DealAddFriendReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DealAddFriendReq_descriptor,
        new java.lang.String[] { "TargetUid", "DealAddFriendResult", });
    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}