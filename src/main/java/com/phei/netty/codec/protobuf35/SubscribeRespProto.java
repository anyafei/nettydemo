// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeResp3.proto

package com.phei.netty.codec.protobuf35;

public final class SubscribeRespProto {
  private SubscribeRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscribeRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.SubscribeResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 subReqID = 1;</code>
     */
    int getSubReqID();

    /**
     * <code>int32 respCode = 2;</code>
     */
    int getRespCode();

    /**
     * <code>string desc = 3;</code>
     */
    java.lang.String getDesc();
    /**
     * <code>string desc = 3;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();
  }
  /**
   * Protobuf type {@code netty.SubscribeResp}
   */
  public  static final class SubscribeResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:netty.SubscribeResp)
      SubscribeRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscribeResp.newBuilder() to construct.
    private SubscribeResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscribeResp() {
      subReqID_ = 0;
      respCode_ = 0;
      desc_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubscribeResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              subReqID_ = input.readInt32();
              break;
            }
            case 16: {

              respCode_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              desc_ = s;
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
      return com.phei.netty.codec.protobuf35.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.phei.netty.codec.protobuf35.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.class, com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.Builder.class);
    }

    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_;
    /**
     * <code>int32 subReqID = 1;</code>
     */
    public int getSubReqID() {
      return subReqID_;
    }

    public static final int RESPCODE_FIELD_NUMBER = 2;
    private int respCode_;
    /**
     * <code>int32 respCode = 2;</code>
     */
    public int getRespCode() {
      return respCode_;
    }

    public static final int DESC_FIELD_NUMBER = 3;
    private volatile java.lang.Object desc_;
    /**
     * <code>string desc = 3;</code>
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      }
    }
    /**
     * <code>string desc = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (subReqID_ != 0) {
        output.writeInt32(1, subReqID_);
      }
      if (respCode_ != 0) {
        output.writeInt32(2, respCode_);
      }
      if (!getDescBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, desc_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (subReqID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (respCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, respCode_);
      }
      if (!getDescBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, desc_);
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
      if (!(obj instanceof com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp)) {
        return super.equals(obj);
      }
      com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp other = (com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp) obj;

      boolean result = true;
      result = result && (getSubReqID()
          == other.getSubReqID());
      result = result && (getRespCode()
          == other.getRespCode());
      result = result && getDesc()
          .equals(other.getDesc());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SUBREQID_FIELD_NUMBER;
      hash = (53 * hash) + getSubReqID();
      hash = (37 * hash) + RESPCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRespCode();
      hash = (37 * hash) + DESC_FIELD_NUMBER;
      hash = (53 * hash) + getDesc().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code netty.SubscribeResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.SubscribeResp)
        com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.phei.netty.codec.protobuf35.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.phei.netty.codec.protobuf35.SubscribeRespProto.internal_static_netty_SubscribeResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.class, com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.Builder.class);
      }

      // Construct using com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.newBuilder()
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
      public Builder clear() {
        super.clear();
        subReqID_ = 0;

        respCode_ = 0;

        desc_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.phei.netty.codec.protobuf35.SubscribeRespProto.internal_static_netty_SubscribeResp_descriptor;
      }

      public com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
        return com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.getDefaultInstance();
      }

      public com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp build() {
        com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp buildPartial() {
        com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp result = new com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp(this);
        result.subReqID_ = subReqID_;
        result.respCode_ = respCode_;
        result.desc_ = desc_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp) {
          return mergeFrom((com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp other) {
        if (other == com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp.getDefaultInstance()) return this;
        if (other.getSubReqID() != 0) {
          setSubReqID(other.getSubReqID());
        }
        if (other.getRespCode() != 0) {
          setRespCode(other.getRespCode());
        }
        if (!other.getDesc().isEmpty()) {
          desc_ = other.desc_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int subReqID_ ;
      /**
       * <code>int32 subReqID = 1;</code>
       */
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>int32 subReqID = 1;</code>
       */
      public Builder setSubReqID(int value) {
        
        subReqID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 subReqID = 1;</code>
       */
      public Builder clearSubReqID() {
        
        subReqID_ = 0;
        onChanged();
        return this;
      }

      private int respCode_ ;
      /**
       * <code>int32 respCode = 2;</code>
       */
      public int getRespCode() {
        return respCode_;
      }
      /**
       * <code>int32 respCode = 2;</code>
       */
      public Builder setRespCode(int value) {
        
        respCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 respCode = 2;</code>
       */
      public Builder clearRespCode() {
        
        respCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object desc_ = "";
      /**
       * <code>string desc = 3;</code>
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string desc = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string desc = 3;</code>
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 3;</code>
       */
      public Builder clearDesc() {
        
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>string desc = 3;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        desc_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:netty.SubscribeResp)
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeResp)
    private static final com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp();
    }

    public static com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubscribeResp>
        PARSER = new com.google.protobuf.AbstractParser<SubscribeResp>() {
      public SubscribeResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubscribeResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscribeResp> getParserForType() {
      return PARSER;
    }

    public com.phei.netty.codec.protobuf35.SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_netty_SubscribeResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SubscribeResp3.proto\022\005netty\"A\n\rSubscri" +
      "beResp\022\020\n\010subReqID\030\001 \001(\005\022\020\n\010respCode\030\002 \001" +
      "(\005\022\014\n\004desc\030\003 \001(\tB5\n\037com.phei.netty.codec" +
      ".protobuf35B\022SubscribeRespProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_netty_SubscribeResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_SubscribeResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_netty_SubscribeResp_descriptor,
        new java.lang.String[] { "SubReqID", "RespCode", "Desc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
