
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/permissions/permission.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface PermissionObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PermissionObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PermissionObserver, PermissionObserver.Proxy> MANAGER = PermissionObserver_Internal.MANAGER;


    void onPermissionStatusChange(
int status);


}
