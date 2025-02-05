/*
 * Copyright 2016-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.game.pb;

public final class CommonMsgProto {
  private CommonMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PingMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 time = 1;
    /**
     * <code>required int64 time = 1;</code>
     *
     * <pre>
     *  服务器时间
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required int64 time = 1;</code>
     *
     * <pre>
     *  服务器时间
     * </pre>
     */
    long getTime();
  }
  /**
   * Protobuf type {@code com.game.proto.PingMessage}
   */
  public static final class PingMessage extends
      com.google.protobuf.GeneratedMessage
      implements PingMessageOrBuilder {
    // Use PingMessage.newBuilder() to construct.
    private PingMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PingMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PingMessage defaultInstance;
    public static PingMessage getDefaultInstance() {
      return defaultInstance;
    }

    public PingMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PingMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              time_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.game.pb.CommonMsgProto.internal_static_com_game_proto_PingMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.game.pb.CommonMsgProto.internal_static_com_game_proto_PingMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.game.pb.CommonMsgProto.PingMessage.class, com.game.pb.CommonMsgProto.PingMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<PingMessage> PARSER =
        new com.google.protobuf.AbstractParser<PingMessage>() {
      public PingMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PingMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PingMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private long time_;
    /**
     * <code>required int64 time = 1;</code>
     *
     * <pre>
     *  服务器时间
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 time = 1;</code>
     *
     * <pre>
     *  服务器时间
     * </pre>
     */
    public long getTime() {
      return time_;
    }

    private void initFields() {
      time_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, time_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, time_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.game.pb.CommonMsgProto.PingMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.game.pb.CommonMsgProto.PingMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.game.proto.PingMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.game.pb.CommonMsgProto.PingMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_PingMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_PingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.game.pb.CommonMsgProto.PingMessage.class, com.game.pb.CommonMsgProto.PingMessage.Builder.class);
      }

      // Construct using com.game.pb.CommonMsgProto.PingMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        time_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_PingMessage_descriptor;
      }

      public com.game.pb.CommonMsgProto.PingMessage getDefaultInstanceForType() {
        return com.game.pb.CommonMsgProto.PingMessage.getDefaultInstance();
      }

      public com.game.pb.CommonMsgProto.PingMessage build() {
        com.game.pb.CommonMsgProto.PingMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.game.pb.CommonMsgProto.PingMessage buildPartial() {
        com.game.pb.CommonMsgProto.PingMessage result = new com.game.pb.CommonMsgProto.PingMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.time_ = time_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.game.pb.CommonMsgProto.PingMessage) {
          return mergeFrom((com.game.pb.CommonMsgProto.PingMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.game.pb.CommonMsgProto.PingMessage other) {
        if (other == com.game.pb.CommonMsgProto.PingMessage.getDefaultInstance()) return this;
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.game.pb.CommonMsgProto.PingMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.game.pb.CommonMsgProto.PingMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 time = 1;
      private long time_ ;
      /**
       * <code>required int64 time = 1;</code>
       *
       * <pre>
       *  服务器时间
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 time = 1;</code>
       *
       * <pre>
       *  服务器时间
       * </pre>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>required int64 time = 1;</code>
       *
       * <pre>
       *  服务器时间
       * </pre>
       */
      public Builder setTime(long value) {
        bitField0_ |= 0x00000001;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 time = 1;</code>
       *
       * <pre>
       *  服务器时间
       * </pre>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.game.proto.PingMessage)
    }

    static {
      defaultInstance = new PingMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.game.proto.PingMessage)
  }

  public interface CommonMsgPBOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 code = 1;
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 协议号
     * </pre>
     */
    boolean hasCode();
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 协议号
     * </pre>
     */
    int getCode();

    // optional bytes body = 2;
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * 包体
     * </pre>
     */
    boolean hasBody();
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * 包体
     * </pre>
     */
    com.google.protobuf.ByteString getBody();

    // optional int32 msgType = 3;
    /**
     * <code>optional int32 msgType = 3;</code>
     *
     * <pre>
     * 错误消息类型
     * </pre>
     */
    boolean hasMsgType();
    /**
     * <code>optional int32 msgType = 3;</code>
     *
     * <pre>
     * 错误消息类型
     * </pre>
     */
    int getMsgType();

    // optional string errorMsg = 4;
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    boolean hasErrorMsg();
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    java.lang.String getErrorMsg();
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    com.google.protobuf.ByteString
        getErrorMsgBytes();
  }
  /**
   * Protobuf type {@code com.game.proto.CommonMsgPB}
   */
  public static final class CommonMsgPB extends
      com.google.protobuf.GeneratedMessage
      implements CommonMsgPBOrBuilder {
    // Use CommonMsgPB.newBuilder() to construct.
    private CommonMsgPB(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CommonMsgPB(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CommonMsgPB defaultInstance;
    public static CommonMsgPB getDefaultInstance() {
      return defaultInstance;
    }

    public CommonMsgPB getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CommonMsgPB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              code_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              body_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              msgType_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              errorMsg_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.game.pb.CommonMsgProto.internal_static_com_game_proto_CommonMsgPB_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.game.pb.CommonMsgProto.internal_static_com_game_proto_CommonMsgPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.game.pb.CommonMsgProto.CommonMsgPB.class, com.game.pb.CommonMsgProto.CommonMsgPB.Builder.class);
    }

    public static com.google.protobuf.Parser<CommonMsgPB> PARSER =
        new com.google.protobuf.AbstractParser<CommonMsgPB>() {
      public CommonMsgPB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CommonMsgPB(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CommonMsgPB> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 code = 1;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 协议号
     * </pre>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 协议号
     * </pre>
     */
    public int getCode() {
      return code_;
    }

    // optional bytes body = 2;
    public static final int BODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString body_;
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * 包体
     * </pre>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes body = 2;</code>
     *
     * <pre>
     * 包体
     * </pre>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    // optional int32 msgType = 3;
    public static final int MSGTYPE_FIELD_NUMBER = 3;
    private int msgType_;
    /**
     * <code>optional int32 msgType = 3;</code>
     *
     * <pre>
     * 错误消息类型
     * </pre>
     */
    public boolean hasMsgType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 msgType = 3;</code>
     *
     * <pre>
     * 错误消息类型
     * </pre>
     */
    public int getMsgType() {
      return msgType_;
    }

    // optional string errorMsg = 4;
    public static final int ERRORMSG_FIELD_NUMBER = 4;
    private java.lang.Object errorMsg_;
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    public boolean hasErrorMsg() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    public java.lang.String getErrorMsg() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string errorMsg = 4;</code>
     *
     * <pre>
     * 错误消息
     * </pre>
     */
    public com.google.protobuf.ByteString
        getErrorMsgBytes() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      code_ = 0;
      body_ = com.google.protobuf.ByteString.EMPTY;
      msgType_ = 0;
      errorMsg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, body_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, msgType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getErrorMsgBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, body_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, msgType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getErrorMsgBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.game.pb.CommonMsgProto.CommonMsgPB parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.game.pb.CommonMsgProto.CommonMsgPB prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.game.proto.CommonMsgPB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.game.pb.CommonMsgProto.CommonMsgPBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_CommonMsgPB_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_CommonMsgPB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.game.pb.CommonMsgProto.CommonMsgPB.class, com.game.pb.CommonMsgProto.CommonMsgPB.Builder.class);
      }

      // Construct using com.game.pb.CommonMsgProto.CommonMsgPB.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        msgType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        errorMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.game.pb.CommonMsgProto.internal_static_com_game_proto_CommonMsgPB_descriptor;
      }

      public com.game.pb.CommonMsgProto.CommonMsgPB getDefaultInstanceForType() {
        return com.game.pb.CommonMsgProto.CommonMsgPB.getDefaultInstance();
      }

      public com.game.pb.CommonMsgProto.CommonMsgPB build() {
        com.game.pb.CommonMsgProto.CommonMsgPB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.game.pb.CommonMsgProto.CommonMsgPB buildPartial() {
        com.game.pb.CommonMsgProto.CommonMsgPB result = new com.game.pb.CommonMsgProto.CommonMsgPB(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.body_ = body_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msgType_ = msgType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.errorMsg_ = errorMsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.game.pb.CommonMsgProto.CommonMsgPB) {
          return mergeFrom((com.game.pb.CommonMsgProto.CommonMsgPB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.game.pb.CommonMsgProto.CommonMsgPB other) {
        if (other == com.game.pb.CommonMsgProto.CommonMsgPB.getDefaultInstance()) return this;
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        if (other.hasMsgType()) {
          setMsgType(other.getMsgType());
        }
        if (other.hasErrorMsg()) {
          bitField0_ |= 0x00000008;
          errorMsg_ = other.errorMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCode()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.game.pb.CommonMsgProto.CommonMsgPB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.game.pb.CommonMsgProto.CommonMsgPB) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 code = 1;
      private int code_ ;
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 协议号
       * </pre>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 协议号
       * </pre>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 协议号
       * </pre>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 协议号
       * </pre>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      // optional bytes body = 2;
      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes body = 2;</code>
       *
       * <pre>
       * 包体
       * </pre>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes body = 2;</code>
       *
       * <pre>
       * 包体
       * </pre>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <code>optional bytes body = 2;</code>
       *
       * <pre>
       * 包体
       * </pre>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes body = 2;</code>
       *
       * <pre>
       * 包体
       * </pre>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000002);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }

      // optional int32 msgType = 3;
      private int msgType_ ;
      /**
       * <code>optional int32 msgType = 3;</code>
       *
       * <pre>
       * 错误消息类型
       * </pre>
       */
      public boolean hasMsgType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 msgType = 3;</code>
       *
       * <pre>
       * 错误消息类型
       * </pre>
       */
      public int getMsgType() {
        return msgType_;
      }
      /**
       * <code>optional int32 msgType = 3;</code>
       *
       * <pre>
       * 错误消息类型
       * </pre>
       */
      public Builder setMsgType(int value) {
        bitField0_ |= 0x00000004;
        msgType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 msgType = 3;</code>
       *
       * <pre>
       * 错误消息类型
       * </pre>
       */
      public Builder clearMsgType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msgType_ = 0;
        onChanged();
        return this;
      }

      // optional string errorMsg = 4;
      private java.lang.Object errorMsg_ = "";
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public boolean hasErrorMsg() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public java.lang.String getErrorMsg() {
        java.lang.Object ref = errorMsg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          errorMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public com.google.protobuf.ByteString
          getErrorMsgBytes() {
        java.lang.Object ref = errorMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public Builder setErrorMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        errorMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public Builder clearErrorMsg() {
        bitField0_ = (bitField0_ & ~0x00000008);
        errorMsg_ = getDefaultInstance().getErrorMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorMsg = 4;</code>
       *
       * <pre>
       * 错误消息
       * </pre>
       */
      public Builder setErrorMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        errorMsg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.game.proto.CommonMsgPB)
    }

    static {
      defaultInstance = new CommonMsgPB(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.game.proto.CommonMsgPB)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_game_proto_PingMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_game_proto_PingMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_game_proto_CommonMsgPB_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_game_proto_CommonMsgPB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025proto/CommonMsg.proto\022\016com.game.proto\"" +
      "\033\n\013PingMessage\022\014\n\004time\030\001 \002(\003\"L\n\013CommonMs" +
      "gPB\022\014\n\004code\030\001 \002(\005\022\014\n\004body\030\002 \001(\014\022\017\n\007msgTy" +
      "pe\030\003 \001(\005\022\020\n\010errorMsg\030\004 \001(\tB\035\n\013com.game.p" +
      "bB\016CommonMsgProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_game_proto_PingMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_game_proto_PingMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_game_proto_PingMessage_descriptor,
              new java.lang.String[] { "Time", });
          internal_static_com_game_proto_CommonMsgPB_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_game_proto_CommonMsgPB_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_game_proto_CommonMsgPB_descriptor,
              new java.lang.String[] { "Code", "Body", "MsgType", "ErrorMsg", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
