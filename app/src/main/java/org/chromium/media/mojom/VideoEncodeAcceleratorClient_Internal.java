
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


class VideoEncodeAcceleratorClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy>() {
    
        public String getName() {
            return "media::mojom::VideoEncodeAcceleratorClient";
        }
    
        public int getVersion() {
          return 0;
        }
    
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        public Stub buildStub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorClient impl) {
            return new Stub(core, impl);
        }
    
        public VideoEncodeAcceleratorClient[] buildArray(int size) {
          return new VideoEncodeAcceleratorClient[size];
        }
    };


    private static final int REQUIRE_BITSTREAM_BUFFERS_ORDINAL = 0;

    private static final int BITSTREAM_BUFFER_READY_ORDINAL = 1;

    private static final int NOTIFY_ERROR_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements VideoEncodeAcceleratorClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void requireBitstreamBuffers(
int inputCount, org.chromium.gfx.mojom.Size inputCodedSize, int outputBufferSize) {

            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams _message = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams();

            _message.inputCount = inputCount;

            _message.inputCodedSize = inputCodedSize;

            _message.outputBufferSize = outputBufferSize;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REQUIRE_BITSTREAM_BUFFERS_ORDINAL)));

        }


        @Override
        public void bitstreamBufferReady(
int bitstreamBufferId, int payloadSize, boolean keyFrame, org.chromium.mojo.common.mojom.TimeDelta timestamp) {

            VideoEncodeAcceleratorClientBitstreamBufferReadyParams _message = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams();

            _message.bitstreamBufferId = bitstreamBufferId;

            _message.payloadSize = payloadSize;

            _message.keyFrame = keyFrame;

            _message.timestamp = timestamp;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BITSTREAM_BUFFER_READY_ORDINAL)));

        }


        @Override
        public void notifyError(
int error) {

            VideoEncodeAcceleratorClientNotifyErrorParams _message = new VideoEncodeAcceleratorClientNotifyErrorParams();

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(NOTIFY_ERROR_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<VideoEncodeAcceleratorClient> {

        Stub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case REQUIRE_BITSTREAM_BUFFERS_ORDINAL: {
            
                        VideoEncodeAcceleratorClientRequireBitstreamBuffersParams data =
                                VideoEncodeAcceleratorClientRequireBitstreamBuffersParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().requireBitstreamBuffers(data.inputCount, data.inputCodedSize, data.outputBufferSize);
                        return true;
                    }
            
            
            
            
            
                    case BITSTREAM_BUFFER_READY_ORDINAL: {
            
                        VideoEncodeAcceleratorClientBitstreamBufferReadyParams data =
                                VideoEncodeAcceleratorClientBitstreamBufferReadyParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().bitstreamBufferReady(data.bitstreamBufferId, data.payloadSize, data.keyFrame, data.timestamp);
                        return true;
                    }
            
            
            
            
            
                    case NOTIFY_ERROR_ORDINAL: {
            
                        VideoEncodeAcceleratorClientNotifyErrorParams data =
                                VideoEncodeAcceleratorClientNotifyErrorParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().notifyError(data.error);
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class VideoEncodeAcceleratorClientRequireBitstreamBuffersParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int inputCount;
        public org.chromium.gfx.mojom.Size inputCodedSize;
        public int outputBufferSize;
    
        private VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public VideoEncodeAcceleratorClientRequireBitstreamBuffersParams() {
            this(0);
        }
    
        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.inputCount = decoder0.readInt(8);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.outputBufferSize = decoder0.readInt(12);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.inputCodedSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.inputCount, 8);
            
            encoder0.encode(this.outputBufferSize, 12);
            
            encoder0.encode(this.inputCodedSize, 16, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams other = (VideoEncodeAcceleratorClientRequireBitstreamBuffersParams) object;
            if (this.inputCount!= other.inputCount)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.inputCodedSize, other.inputCodedSize))
                return false;
            if (this.outputBufferSize!= other.outputBufferSize)
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.inputCount);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.inputCodedSize);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.outputBufferSize);
            return result;
        }
    }



    
    static final class VideoEncodeAcceleratorClientBitstreamBufferReadyParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int bitstreamBufferId;
        public int payloadSize;
        public boolean keyFrame;
        public org.chromium.mojo.common.mojom.TimeDelta timestamp;
    
        private VideoEncodeAcceleratorClientBitstreamBufferReadyParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public VideoEncodeAcceleratorClientBitstreamBufferReadyParams() {
            this(0);
        }
    
        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientBitstreamBufferReadyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.bitstreamBufferId = decoder0.readInt(8);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.payloadSize = decoder0.readInt(12);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.keyFrame = decoder0.readBoolean(16, 0);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.timestamp = org.chromium.mojo.common.mojom.TimeDelta.decode(decoder1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.bitstreamBufferId, 8);
            
            encoder0.encode(this.payloadSize, 12);
            
            encoder0.encode(this.keyFrame, 16, 0);
            
            encoder0.encode(this.timestamp, 24, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            VideoEncodeAcceleratorClientBitstreamBufferReadyParams other = (VideoEncodeAcceleratorClientBitstreamBufferReadyParams) object;
            if (this.bitstreamBufferId!= other.bitstreamBufferId)
                return false;
            if (this.payloadSize!= other.payloadSize)
                return false;
            if (this.keyFrame!= other.keyFrame)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.timestamp, other.timestamp))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.bitstreamBufferId);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.payloadSize);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.keyFrame);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.timestamp);
            return result;
        }
    }



    
    static final class VideoEncodeAcceleratorClientNotifyErrorParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;
    
        private VideoEncodeAcceleratorClientNotifyErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public VideoEncodeAcceleratorClientNotifyErrorParams() {
            this(0);
        }
    
        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientNotifyErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientNotifyErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new VideoEncodeAcceleratorClientNotifyErrorParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.error = decoder0.readInt(8);
                        VideoEncodeAccelerator.Error.validate(result.error);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.error, 8);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            VideoEncodeAcceleratorClientNotifyErrorParams other = (VideoEncodeAcceleratorClientNotifyErrorParams) object;
            if (this.error!= other.error)
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.error);
            return result;
        }
    }



}
