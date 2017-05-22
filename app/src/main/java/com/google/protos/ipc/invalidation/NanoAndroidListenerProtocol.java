// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.protos.ipc.invalidation;

@SuppressWarnings("hiding")
public interface NanoAndroidListenerProtocol {

  public static final class AndroidListenerState extends
      com.google.protobuf.nano.ExtendableMessageNano<AndroidListenerState> {

    public static final class RetryRegistrationState extends
        com.google.protobuf.nano.ExtendableMessageNano<RetryRegistrationState> {

      private static volatile RetryRegistrationState[] _emptyArray;
      public static RetryRegistrationState[] emptyArray() {
        // Lazily initializes the empty array
        if (_emptyArray == null) {
          synchronized (
              com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
            if (_emptyArray == null) {
              _emptyArray = new RetryRegistrationState[0];
            }
          }
        }
        return _emptyArray;
      }

      // optional .com.google.protos.ipc.invalidation.ObjectIdP object_id = 1;
      public com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP objectId;

      // optional .com.google.protos.ipc.invalidation.ExponentialBackoffState exponential_backoff_state = 2;
      public com.google.protos.ipc.invalidation.nano.NanoClient.ExponentialBackoffState exponentialBackoffState;

      public RetryRegistrationState() {
        clear();
      }

      public RetryRegistrationState clear() {
        objectId = null;
        exponentialBackoffState = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
      }

      @Override
      public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
          throws java.io.IOException {
        if (this.objectId != null) {
          output.writeMessage(1, this.objectId);
        }
        if (this.exponentialBackoffState != null) {
          output.writeMessage(2, this.exponentialBackoffState);
        }
        super.writeTo(output);
      }

      @Override
      protected int computeSerializedSize() {
        int size = super.computeSerializedSize();
        if (this.objectId != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(1, this.objectId);
        }
        if (this.exponentialBackoffState != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(2, this.exponentialBackoffState);
        }
        return size;
      }

      @Override
      public RetryRegistrationState mergeFrom(
              com.google.protobuf.nano.CodedInputByteBufferNano input)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              return this;
            default: {
              if (!storeUnknownField(input, tag)) {
                return this;
              }
              break;
            }
            case 10: {
              if (this.objectId == null) {
                this.objectId = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP();
              }
              input.readMessage(this.objectId);
              break;
            }
            case 18: {
              if (this.exponentialBackoffState == null) {
                this.exponentialBackoffState = new com.google.protos.ipc.invalidation.nano.NanoClient.ExponentialBackoffState();
              }
              input.readMessage(this.exponentialBackoffState);
              break;
            }
          }
        }
      }

      public static RetryRegistrationState parseFrom(byte[] data)
          throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
        return com.google.protobuf.nano.MessageNano.mergeFrom(new RetryRegistrationState(), data);
      }

      public static RetryRegistrationState parseFrom(
              com.google.protobuf.nano.CodedInputByteBufferNano input)
          throws java.io.IOException {
        return new RetryRegistrationState().mergeFrom(input);
      }
    }

    public static final class ScheduledRegistrationRetry extends
        com.google.protobuf.nano.ExtendableMessageNano<ScheduledRegistrationRetry> {

      private static volatile ScheduledRegistrationRetry[] _emptyArray;
      public static ScheduledRegistrationRetry[] emptyArray() {
        // Lazily initializes the empty array
        if (_emptyArray == null) {
          synchronized (
              com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
            if (_emptyArray == null) {
              _emptyArray = new ScheduledRegistrationRetry[0];
            }
          }
        }
        return _emptyArray;
      }

      // optional .com.google.protos.ipc.invalidation.RegistrationCommand command = 1;
      public com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.RegistrationCommand command;

      // optional int64 execute_time_ms = 2;
      public java.lang.Long executeTimeMs;

      public ScheduledRegistrationRetry() {
        clear();
      }

      public ScheduledRegistrationRetry clear() {
        command = null;
        executeTimeMs = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
      }

      @Override
      public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
          throws java.io.IOException {
        if (this.command != null) {
          output.writeMessage(1, this.command);
        }
        if (this.executeTimeMs != null) {
          output.writeInt64(2, this.executeTimeMs);
        }
        super.writeTo(output);
      }

      @Override
      protected int computeSerializedSize() {
        int size = super.computeSerializedSize();
        if (this.command != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(1, this.command);
        }
        if (this.executeTimeMs != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeInt64Size(2, this.executeTimeMs);
        }
        return size;
      }

      @Override
      public ScheduledRegistrationRetry mergeFrom(
              com.google.protobuf.nano.CodedInputByteBufferNano input)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              return this;
            default: {
              if (!storeUnknownField(input, tag)) {
                return this;
              }
              break;
            }
            case 10: {
              if (this.command == null) {
                this.command = new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.RegistrationCommand();
              }
              input.readMessage(this.command);
              break;
            }
            case 16: {
              this.executeTimeMs = input.readInt64();
              break;
            }
          }
        }
      }

      public static ScheduledRegistrationRetry parseFrom(byte[] data)
          throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
        return com.google.protobuf.nano.MessageNano.mergeFrom(new ScheduledRegistrationRetry(), data);
      }

      public static ScheduledRegistrationRetry parseFrom(
              com.google.protobuf.nano.CodedInputByteBufferNano input)
          throws java.io.IOException {
        return new ScheduledRegistrationRetry().mergeFrom(input);
      }
    }

    private static volatile AndroidListenerState[] _emptyArray;
    public static AndroidListenerState[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new AndroidListenerState[0];
          }
        }
      }
      return _emptyArray;
    }

    // repeated .com.google.protos.ipc.invalidation.ObjectIdP registration = 1;
    public com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[] registration;

    // repeated .com.google.protos.ipc.invalidation.AndroidListenerState.RetryRegistrationState retry_registration_state = 2;
    public com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState[] retryRegistrationState;

    // optional bytes client_id = 3;
    public byte[] clientId;

    // optional int32 request_code_seq_num = 4;
    public java.lang.Integer requestCodeSeqNum;

    // repeated .com.google.protos.ipc.invalidation.AndroidListenerState.ScheduledRegistrationRetry registration_retry = 5;
    public com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry[] registrationRetry;

    public AndroidListenerState() {
      clear();
    }

    public AndroidListenerState clear() {
      registration = com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP.emptyArray();
      retryRegistrationState = com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState.emptyArray();
      clientId = null;
      requestCodeSeqNum = null;
      registrationRetry = com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry.emptyArray();
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.registration != null && this.registration.length > 0) {
        for (int i = 0; i < this.registration.length; i++) {
          com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP element = this.registration[i];
          if (element != null) {
            output.writeMessage(1, element);
          }
        }
      }
      if (this.retryRegistrationState != null && this.retryRegistrationState.length > 0) {
        for (int i = 0; i < this.retryRegistrationState.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState element = this.retryRegistrationState[i];
          if (element != null) {
            output.writeMessage(2, element);
          }
        }
      }
      if (this.clientId != null) {
        output.writeBytes(3, this.clientId);
      }
      if (this.requestCodeSeqNum != null) {
        output.writeInt32(4, this.requestCodeSeqNum);
      }
      if (this.registrationRetry != null && this.registrationRetry.length > 0) {
        for (int i = 0; i < this.registrationRetry.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry element = this.registrationRetry[i];
          if (element != null) {
            output.writeMessage(5, element);
          }
        }
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.registration != null && this.registration.length > 0) {
        for (int i = 0; i < this.registration.length; i++) {
          com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP element = this.registration[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(1, element);
          }
        }
      }
      if (this.retryRegistrationState != null && this.retryRegistrationState.length > 0) {
        for (int i = 0; i < this.retryRegistrationState.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState element = this.retryRegistrationState[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(2, element);
          }
        }
      }
      if (this.clientId != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(3, this.clientId);
      }
      if (this.requestCodeSeqNum != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(4, this.requestCodeSeqNum);
      }
      if (this.registrationRetry != null && this.registrationRetry.length > 0) {
        for (int i = 0; i < this.registrationRetry.length; i++) {
          com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry element = this.registrationRetry[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(5, element);
          }
        }
      }
      return size;
    }

    @Override
    public AndroidListenerState mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 10);
            int i = this.registration == null ? 0 : this.registration.length;
            com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[] newArray =
                new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.registration, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP();
            input.readMessage(newArray[i]);
            this.registration = newArray;
            break;
          }
          case 18: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 18);
            int i = this.retryRegistrationState == null ? 0 : this.retryRegistrationState.length;
            com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState[] newArray =
                new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.retryRegistrationState, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.RetryRegistrationState();
            input.readMessage(newArray[i]);
            this.retryRegistrationState = newArray;
            break;
          }
          case 26: {
            this.clientId = input.readBytes();
            break;
          }
          case 32: {
            this.requestCodeSeqNum = input.readInt32();
            break;
          }
          case 42: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 42);
            int i = this.registrationRetry == null ? 0 : this.registrationRetry.length;
            com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry[] newArray =
                new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.registrationRetry, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.protos.ipc.invalidation.NanoAndroidListenerProtocol.AndroidListenerState.ScheduledRegistrationRetry();
            input.readMessage(newArray[i]);
            this.registrationRetry = newArray;
            break;
          }
        }
      }
    }

    public static AndroidListenerState parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new AndroidListenerState(), data);
    }

    public static AndroidListenerState parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new AndroidListenerState().mergeFrom(input);
    }
  }

  public static final class RegistrationCommand extends
      com.google.protobuf.nano.ExtendableMessageNano<RegistrationCommand> {

    private static volatile RegistrationCommand[] _emptyArray;
    public static RegistrationCommand[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new RegistrationCommand[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional bool is_register = 1;
    public java.lang.Boolean isRegister;

    // repeated .com.google.protos.ipc.invalidation.ObjectIdP object_id = 2;
    public com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[] objectId;

    // optional bytes client_id = 3;
    public byte[] clientId;

    // optional bool is_delayed = 4;
    public java.lang.Boolean isDelayed;

    public RegistrationCommand() {
      clear();
    }

    public RegistrationCommand clear() {
      isRegister = null;
      objectId = com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP.emptyArray();
      clientId = null;
      isDelayed = null;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.isRegister != null) {
        output.writeBool(1, this.isRegister);
      }
      if (this.objectId != null && this.objectId.length > 0) {
        for (int i = 0; i < this.objectId.length; i++) {
          com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP element = this.objectId[i];
          if (element != null) {
            output.writeMessage(2, element);
          }
        }
      }
      if (this.clientId != null) {
        output.writeBytes(3, this.clientId);
      }
      if (this.isDelayed != null) {
        output.writeBool(4, this.isDelayed);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.isRegister != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(1, this.isRegister);
      }
      if (this.objectId != null && this.objectId.length > 0) {
        for (int i = 0; i < this.objectId.length; i++) {
          com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP element = this.objectId[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(2, element);
          }
        }
      }
      if (this.clientId != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(3, this.clientId);
      }
      if (this.isDelayed != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(4, this.isDelayed);
      }
      return size;
    }

    @Override
    public RegistrationCommand mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.isRegister = input.readBool();
            break;
          }
          case 18: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 18);
            int i = this.objectId == null ? 0 : this.objectId.length;
            com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[] newArray =
                new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.objectId, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.protos.ipc.invalidation.nano.NanoClientProtocol.ObjectIdP();
            input.readMessage(newArray[i]);
            this.objectId = newArray;
            break;
          }
          case 26: {
            this.clientId = input.readBytes();
            break;
          }
          case 32: {
            this.isDelayed = input.readBool();
            break;
          }
        }
      }
    }

    public static RegistrationCommand parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new RegistrationCommand(), data);
    }

    public static RegistrationCommand parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new RegistrationCommand().mergeFrom(input);
    }
  }

  public static final class StartCommand extends
      com.google.protobuf.nano.ExtendableMessageNano<StartCommand> {

    private static volatile StartCommand[] _emptyArray;
    public static StartCommand[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new StartCommand[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 client_type = 1;
    public java.lang.Integer clientType;

    // optional bytes client_name = 2;
    public byte[] clientName;

    // optional bool allow_suppression = 3;
    public java.lang.Boolean allowSuppression;

    public StartCommand() {
      clear();
    }

    public StartCommand clear() {
      clientType = null;
      clientName = null;
      allowSuppression = null;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.clientType != null) {
        output.writeInt32(1, this.clientType);
      }
      if (this.clientName != null) {
        output.writeBytes(2, this.clientName);
      }
      if (this.allowSuppression != null) {
        output.writeBool(3, this.allowSuppression);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.clientType != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.clientType);
      }
      if (this.clientName != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(2, this.clientName);
      }
      if (this.allowSuppression != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(3, this.allowSuppression);
      }
      return size;
    }

    @Override
    public StartCommand mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.clientType = input.readInt32();
            break;
          }
          case 18: {
            this.clientName = input.readBytes();
            break;
          }
          case 24: {
            this.allowSuppression = input.readBool();
            break;
          }
        }
      }
    }

    public static StartCommand parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new StartCommand(), data);
    }

    public static StartCommand parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new StartCommand().mergeFrom(input);
    }
  }
}
