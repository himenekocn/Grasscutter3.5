// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CABODJPEHAN.proto

package emu.grasscutter.net.proto;

public final class CABODJPEHANOuterClass {
  private CABODJPEHANOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CABODJPEHANOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CABODJPEHAN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_score = 14;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>bool AFFBBBPHIHH = 1;</code>
     * @return The aFFBBBPHIHH.
     */
    boolean getAFFBBBPHIHH();

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @return A list containing the chosenAvatarList.
     */
    java.util.List<java.lang.Integer> getChosenAvatarListList();
    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @return The count of chosenAvatarList.
     */
    int getChosenAvatarListCount();
    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @param index The index of the element to return.
     * @return The chosenAvatarList at the given index.
     */
    int getChosenAvatarList(int index);

    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @return A list containing the chosenSkillList.
     */
    java.util.List<java.lang.Integer> getChosenSkillListList();
    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @return The count of chosenSkillList.
     */
    int getChosenSkillListCount();
    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @param index The index of the element to return.
     * @return The chosenSkillList at the given index.
     */
    int getChosenSkillList(int index);

    /**
     * <code>bool is_finish = 6;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();
  }
  /**
   * <pre>
   * Name: CABODJPEHAN
   * </pre>
   *
   * Protobuf type {@code CABODJPEHAN}
   */
  public static final class CABODJPEHAN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CABODJPEHAN)
      CABODJPEHANOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CABODJPEHAN.newBuilder() to construct.
    private CABODJPEHAN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CABODJPEHAN() {
      chosenAvatarList_ = emptyIntList();
      chosenSkillList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CABODJPEHAN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CABODJPEHANOuterClass.internal_static_CABODJPEHAN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CABODJPEHANOuterClass.internal_static_CABODJPEHAN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.class, emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.Builder.class);
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 14;
    private int maxScore_ = 0;
    /**
     * <code>uint32 max_score = 14;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int AFFBBBPHIHH_FIELD_NUMBER = 1;
    private boolean aFFBBBPHIHH_ = false;
    /**
     * <code>bool AFFBBBPHIHH = 1;</code>
     * @return The aFFBBBPHIHH.
     */
    @java.lang.Override
    public boolean getAFFBBBPHIHH() {
      return aFFBBBPHIHH_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHOSEN_AVATAR_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList chosenAvatarList_;
    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @return A list containing the chosenAvatarList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChosenAvatarListList() {
      return chosenAvatarList_;
    }
    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @return The count of chosenAvatarList.
     */
    public int getChosenAvatarListCount() {
      return chosenAvatarList_.size();
    }
    /**
     * <code>repeated uint32 chosen_avatar_list = 9;</code>
     * @param index The index of the element to return.
     * @return The chosenAvatarList at the given index.
     */
    public int getChosenAvatarList(int index) {
      return chosenAvatarList_.getInt(index);
    }
    private int chosenAvatarListMemoizedSerializedSize = -1;

    public static final int CHOSEN_SKILL_LIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList chosenSkillList_;
    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @return A list containing the chosenSkillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChosenSkillListList() {
      return chosenSkillList_;
    }
    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @return The count of chosenSkillList.
     */
    public int getChosenSkillListCount() {
      return chosenSkillList_.size();
    }
    /**
     * <code>repeated uint32 chosen_skill_list = 15;</code>
     * @param index The index of the element to return.
     * @return The chosenSkillList at the given index.
     */
    public int getChosenSkillList(int index) {
      return chosenSkillList_.getInt(index);
    }
    private int chosenSkillListMemoizedSerializedSize = -1;

    public static final int IS_FINISH_FIELD_NUMBER = 6;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 6;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
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
      getSerializedSize();
      if (aFFBBBPHIHH_ != false) {
        output.writeBool(1, aFFBBBPHIHH_);
      }
      if (isFinish_ != false) {
        output.writeBool(6, isFinish_);
      }
      if (getChosenAvatarListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(chosenAvatarListMemoizedSerializedSize);
      }
      for (int i = 0; i < chosenAvatarList_.size(); i++) {
        output.writeUInt32NoTag(chosenAvatarList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      if (maxScore_ != 0) {
        output.writeUInt32(14, maxScore_);
      }
      if (getChosenSkillListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(chosenSkillListMemoizedSerializedSize);
      }
      for (int i = 0; i < chosenSkillList_.size(); i++) {
        output.writeUInt32NoTag(chosenSkillList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aFFBBBPHIHH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, aFFBBBPHIHH_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isFinish_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < chosenAvatarList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(chosenAvatarList_.getInt(i));
        }
        size += dataSize;
        if (!getChosenAvatarListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        chosenAvatarListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, maxScore_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < chosenSkillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(chosenSkillList_.getInt(i));
        }
        size += dataSize;
        if (!getChosenSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        chosenSkillListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN other = (emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN) obj;

      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getAFFBBBPHIHH()
          != other.getAFFBBBPHIHH()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getChosenAvatarListList()
          .equals(other.getChosenAvatarListList())) return false;
      if (!getChosenSkillListList()
          .equals(other.getChosenSkillListList())) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
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
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + AFFBBBPHIHH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAFFBBBPHIHH());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getChosenAvatarListCount() > 0) {
        hash = (37 * hash) + CHOSEN_AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenAvatarListList().hashCode();
      }
      if (getChosenSkillListCount() > 0) {
        hash = (37 * hash) + CHOSEN_SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenSkillListList().hashCode();
      }
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN prototype) {
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
     * Name: CABODJPEHAN
     * </pre>
     *
     * Protobuf type {@code CABODJPEHAN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CABODJPEHAN)
        emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHANOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CABODJPEHANOuterClass.internal_static_CABODJPEHAN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CABODJPEHANOuterClass.internal_static_CABODJPEHAN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.class, emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.newBuilder()
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
        maxScore_ = 0;
        aFFBBBPHIHH_ = false;
        levelId_ = 0;
        chosenAvatarList_ = emptyIntList();
        chosenSkillList_ = emptyIntList();
        isFinish_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CABODJPEHANOuterClass.internal_static_CABODJPEHAN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN build() {
        emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN buildPartial() {
        emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN result = new emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN result) {
        if (((bitField0_ & 0x00000008) != 0)) {
          chosenAvatarList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.chosenAvatarList_ = chosenAvatarList_;
        if (((bitField0_ & 0x00000010) != 0)) {
          chosenSkillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.chosenSkillList_ = chosenSkillList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maxScore_ = maxScore_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.aFFBBBPHIHH_ = aFFBBBPHIHH_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isFinish_ = isFinish_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN) {
          return mergeFrom((emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN other) {
        if (other == emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN.getDefaultInstance()) return this;
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getAFFBBBPHIHH() != false) {
          setAFFBBBPHIHH(other.getAFFBBBPHIHH());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.chosenAvatarList_.isEmpty()) {
          if (chosenAvatarList_.isEmpty()) {
            chosenAvatarList_ = other.chosenAvatarList_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureChosenAvatarListIsMutable();
            chosenAvatarList_.addAll(other.chosenAvatarList_);
          }
          onChanged();
        }
        if (!other.chosenSkillList_.isEmpty()) {
          if (chosenSkillList_.isEmpty()) {
            chosenSkillList_ = other.chosenSkillList_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureChosenSkillListIsMutable();
            chosenSkillList_.addAll(other.chosenSkillList_);
          }
          onChanged();
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
                aFFBBBPHIHH_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 48: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 72: {
                int v = input.readUInt32();
                ensureChosenAvatarListIsMutable();
                chosenAvatarList_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureChosenAvatarListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  chosenAvatarList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
              case 88: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 112: {
                maxScore_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              case 120: {
                int v = input.readUInt32();
                ensureChosenSkillListIsMutable();
                chosenSkillList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureChosenSkillListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  chosenSkillList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 14;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 14;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private boolean aFFBBBPHIHH_ ;
      /**
       * <code>bool AFFBBBPHIHH = 1;</code>
       * @return The aFFBBBPHIHH.
       */
      @java.lang.Override
      public boolean getAFFBBBPHIHH() {
        return aFFBBBPHIHH_;
      }
      /**
       * <code>bool AFFBBBPHIHH = 1;</code>
       * @param value The aFFBBBPHIHH to set.
       * @return This builder for chaining.
       */
      public Builder setAFFBBBPHIHH(boolean value) {
        
        aFFBBBPHIHH_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool AFFBBBPHIHH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAFFBBBPHIHH() {
        bitField0_ = (bitField0_ & ~0x00000002);
        aFFBBBPHIHH_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList chosenAvatarList_ = emptyIntList();
      private void ensureChosenAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          chosenAvatarList_ = mutableCopy(chosenAvatarList_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @return A list containing the chosenAvatarList.
       */
      public java.util.List<java.lang.Integer>
          getChosenAvatarListList() {
        return ((bitField0_ & 0x00000008) != 0) ?
                 java.util.Collections.unmodifiableList(chosenAvatarList_) : chosenAvatarList_;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @return The count of chosenAvatarList.
       */
      public int getChosenAvatarListCount() {
        return chosenAvatarList_.size();
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @param index The index of the element to return.
       * @return The chosenAvatarList at the given index.
       */
      public int getChosenAvatarList(int index) {
        return chosenAvatarList_.getInt(index);
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The chosenAvatarList to set.
       * @return This builder for chaining.
       */
      public Builder setChosenAvatarList(
          int index, int value) {
        
        ensureChosenAvatarListIsMutable();
        chosenAvatarList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @param value The chosenAvatarList to add.
       * @return This builder for chaining.
       */
      public Builder addChosenAvatarList(int value) {
        
        ensureChosenAvatarListIsMutable();
        chosenAvatarList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @param values The chosenAvatarList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChosenAvatarList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChosenAvatarListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chosenAvatarList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearChosenAvatarList() {
        chosenAvatarList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList chosenSkillList_ = emptyIntList();
      private void ensureChosenSkillListIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          chosenSkillList_ = mutableCopy(chosenSkillList_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @return A list containing the chosenSkillList.
       */
      public java.util.List<java.lang.Integer>
          getChosenSkillListList() {
        return ((bitField0_ & 0x00000010) != 0) ?
                 java.util.Collections.unmodifiableList(chosenSkillList_) : chosenSkillList_;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @return The count of chosenSkillList.
       */
      public int getChosenSkillListCount() {
        return chosenSkillList_.size();
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @param index The index of the element to return.
       * @return The chosenSkillList at the given index.
       */
      public int getChosenSkillList(int index) {
        return chosenSkillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The chosenSkillList to set.
       * @return This builder for chaining.
       */
      public Builder setChosenSkillList(
          int index, int value) {
        
        ensureChosenSkillListIsMutable();
        chosenSkillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @param value The chosenSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addChosenSkillList(int value) {
        
        ensureChosenSkillListIsMutable();
        chosenSkillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @param values The chosenSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChosenSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChosenSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chosenSkillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChosenSkillList() {
        chosenSkillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 6;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 6;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:CABODJPEHAN)
    }

    // @@protoc_insertion_point(class_scope:CABODJPEHAN)
    private static final emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN();
    }

    public static emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CABODJPEHAN>
        PARSER = new com.google.protobuf.AbstractParser<CABODJPEHAN>() {
      @java.lang.Override
      public CABODJPEHAN parsePartialFrom(
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

    public static com.google.protobuf.Parser<CABODJPEHAN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CABODJPEHAN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CABODJPEHANOuterClass.CABODJPEHAN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CABODJPEHAN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CABODJPEHAN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CABODJPEHAN.proto\"\221\001\n\013CABODJPEHAN\022\021\n\tm" +
      "ax_score\030\016 \001(\r\022\023\n\013AFFBBBPHIHH\030\001 \001(\010\022\020\n\010l" +
      "evel_id\030\013 \001(\r\022\032\n\022chosen_avatar_list\030\t \003(" +
      "\r\022\031\n\021chosen_skill_list\030\017 \003(\r\022\021\n\tis_finis" +
      "h\030\006 \001(\010B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CABODJPEHAN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CABODJPEHAN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CABODJPEHAN_descriptor,
        new java.lang.String[] { "MaxScore", "AFFBBBPHIHH", "LevelId", "ChosenAvatarList", "ChosenSkillList", "IsFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}