
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/WebKit/public/platform/modules/remoteplayback/WebRemotePlaybackAvailability.h

package org.chromium.blink_public.platform.modules.remoteplayback;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WebRemotePlaybackAvailability {
  @IntDef({
      Unknown, SourceNotSupported, DeviceNotAvailable, SourceNotCompatible, DeviceAvailable, Last
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface WebRemotePlaybackAvailabilityEnum {}
  /**
   * The availability is unknown.
   */
  public static final int Unknown = 0;
  /**
   * The media source is not supported by the browser - device availability monitoring is
   * unnecessary.
   */
  public static final int SourceNotSupported = 1;
  /**
   * The media source is compatible with some supported device types but no devices were found.
   */
  public static final int DeviceNotAvailable = 2;
  /**
   * There're available devices but the current media source is not compatible with any of those.
   */
  public static final int SourceNotCompatible = 3;
  /**
   * There're available remote playback devices and the media source is compatible with at least one
   * of them.
   */
  public static final int DeviceAvailable = 4;
  public static final int Last = 4;
}
