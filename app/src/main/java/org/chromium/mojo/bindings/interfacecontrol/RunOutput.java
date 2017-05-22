
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/interfaces/bindings/interface_control_messages.mojom
//

package org.chromium.mojo.bindings.interfacecontrol;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class RunOutput extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int QueryVersionResult = 0;
    };

    private int mTag_ = -1;
    private QueryVersionResult mQueryVersionResult;

    public int which() {
      return mTag_;
    }

    public boolean isUnknown() {
      return mTag_ == -1;
    }

    // TODO(rockot): Fix the findbugs error and remove this suppression.
    // See http://crbug.com/570386.
    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public void setQueryVersionResult(QueryVersionResult queryVersionResult) {
        mTag_ = Tag.QueryVersionResult;
        mQueryVersionResult = queryVersionResult;
    }

    // TODO(rockot): Fix the findbugs error and remove this suppression.
    // See http://crbug.com/570386.
    @SuppressFBWarnings("EI_EXPOSE_REP")
    public QueryVersionResult getQueryVersionResult() {
        assert mTag_ == Tag.QueryVersionResult;
        return mQueryVersionResult;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(mTag_, offset + 4);
        switch (mTag_) {
            case Tag.QueryVersionResult: {
                
                encoder0.encode(mQueryVersionResult, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static RunOutput deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final RunOutput decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        RunOutput result = new RunOutput();
        switch (dataHeader.elementsOrVersion) {
            case Tag.QueryVersionResult: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mQueryVersionResult = QueryVersionResult.decode(decoder1);
                result.mTag_ = Tag.QueryVersionResult;
                break;
            }
            default: {
                break;
            }
        }
        return result;
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
        RunOutput other = (RunOutput) object;
        if (mTag_ != other.mTag_)
            return false;
        switch (mTag_) {
            case Tag.QueryVersionResult:
                return org.chromium.mojo.bindings.BindingsHelper.equals(mQueryVersionResult, other.mQueryVersionResult);
            default:
                break;
        }
        return false;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(mTag_);
        switch (mTag_) {
            case Tag.QueryVersionResult: {
                result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(mQueryVersionResult);
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}