
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../net/base/network_change_notifier.h

package org.chromium.net;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ConnectionSubtype {
  @IntDef({
      SUBTYPE_UNKNOWN, SUBTYPE_NONE, SUBTYPE_OTHER, SUBTYPE_GSM, SUBTYPE_IDEN, SUBTYPE_CDMA,
      SUBTYPE_1XRTT, SUBTYPE_GPRS, SUBTYPE_EDGE, SUBTYPE_UMTS, SUBTYPE_EVDO_REV_0,
      SUBTYPE_EVDO_REV_A, SUBTYPE_HSPA, SUBTYPE_EVDO_REV_B, SUBTYPE_HSDPA, SUBTYPE_HSUPA,
      SUBTYPE_EHRPD, SUBTYPE_HSPAP, SUBTYPE_LTE, SUBTYPE_LTE_ADVANCED, SUBTYPE_BLUETOOTH_1_2,
      SUBTYPE_BLUETOOTH_2_1, SUBTYPE_BLUETOOTH_3_0, SUBTYPE_BLUETOOTH_4_0, SUBTYPE_ETHERNET,
      SUBTYPE_FAST_ETHERNET, SUBTYPE_GIGABIT_ETHERNET, SUBTYPE_10_GIGABIT_ETHERNET, SUBTYPE_WIFI_B,
      SUBTYPE_WIFI_G, SUBTYPE_WIFI_N, SUBTYPE_WIFI_AC, SUBTYPE_WIFI_AD, SUBTYPE_LAST
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface ConnectionSubtypeEnum {}
  public static final int SUBTYPE_UNKNOWN = 0;
  public static final int SUBTYPE_NONE = 1;
  public static final int SUBTYPE_OTHER = 2;
  public static final int SUBTYPE_GSM = 3;
  public static final int SUBTYPE_IDEN = 4;
  public static final int SUBTYPE_CDMA = 5;
  public static final int SUBTYPE_1XRTT = 6;
  public static final int SUBTYPE_GPRS = 7;
  public static final int SUBTYPE_EDGE = 8;
  public static final int SUBTYPE_UMTS = 9;
  public static final int SUBTYPE_EVDO_REV_0 = 10;
  public static final int SUBTYPE_EVDO_REV_A = 11;
  public static final int SUBTYPE_HSPA = 12;
  public static final int SUBTYPE_EVDO_REV_B = 13;
  public static final int SUBTYPE_HSDPA = 14;
  public static final int SUBTYPE_HSUPA = 15;
  public static final int SUBTYPE_EHRPD = 16;
  public static final int SUBTYPE_HSPAP = 17;
  public static final int SUBTYPE_LTE = 18;
  public static final int SUBTYPE_LTE_ADVANCED = 19;
  public static final int SUBTYPE_BLUETOOTH_1_2 = 20;
  public static final int SUBTYPE_BLUETOOTH_2_1 = 21;
  public static final int SUBTYPE_BLUETOOTH_3_0 = 22;
  public static final int SUBTYPE_BLUETOOTH_4_0 = 23;
  public static final int SUBTYPE_ETHERNET = 24;
  public static final int SUBTYPE_FAST_ETHERNET = 25;
  public static final int SUBTYPE_GIGABIT_ETHERNET = 26;
  public static final int SUBTYPE_10_GIGABIT_ETHERNET = 27;
  public static final int SUBTYPE_WIFI_B = 28;
  public static final int SUBTYPE_WIFI_G = 29;
  public static final int SUBTYPE_WIFI_N = 30;
  public static final int SUBTYPE_WIFI_AC = 31;
  public static final int SUBTYPE_WIFI_AD = 32;
  public static final int SUBTYPE_LAST = 32;
}
