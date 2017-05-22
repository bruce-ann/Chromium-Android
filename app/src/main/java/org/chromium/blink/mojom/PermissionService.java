
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


public interface PermissionService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PermissionService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PermissionService, PermissionService.Proxy> MANAGER = PermissionService_Internal.MANAGER;


    void hasPermission(
PermissionDescriptor permission, org.chromium.url.mojom.Origin origin, 
HasPermissionResponse callback);

    interface HasPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermission(
PermissionDescriptor permission, org.chromium.url.mojom.Origin origin, boolean userGesture, 
RequestPermissionResponse callback);

    interface RequestPermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void requestPermissions(
PermissionDescriptor[] permission, org.chromium.url.mojom.Origin origin, boolean userGesture, 
RequestPermissionsResponse callback);

    interface RequestPermissionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<int[]> { }



    void revokePermission(
PermissionDescriptor permission, org.chromium.url.mojom.Origin origin, 
RevokePermissionResponse callback);

    interface RevokePermissionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void addPermissionObserver(
PermissionDescriptor permission, org.chromium.url.mojom.Origin origin, int lastKnownStatus, PermissionObserver observer);


}
