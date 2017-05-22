// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.preferences.privacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.chromium.chrome.R;

/**
 * The base class for a clear browsing data tab.
 */
public class ClearBrowsingDataPreferencesTab extends ClearBrowsingDataPreferences {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Replace default preferences view with custom XML that contains a footer.
        View view = inflater.inflate(R.layout.clear_browsing_data_tab_content, container, false);

        Button clearButton = (Button) view.findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClicked();
            }
        });

        return view;
    }

    @Override
    protected int getPreferenceXmlId() {
        return R.xml.clear_browsing_data_preferences_tab;
    }

    @Override
    protected void initClearButtonPreference() {
        // This view has a Button instead of a ButtonPreference. The Button can only be initialized
        // while or after onCreateView was called.
    }

    @Override
    protected void initFootnote() {
        // This view doesn't have a footnote.
    }

    @Override
    protected void updateButtonState() {
        // The clear button in this view is part of the footer, so it can't be a PreferenceButton
        // like the clear button in ClearBrowsingDataPreferences. This makes it necessary to have a
        // different listener and a different method to disable the button.
        Button clearButton = (Button) getView().findViewById(R.id.clear_button);
        boolean isEnabled = !getSelectedOptions().isEmpty();
        clearButton.setEnabled(isEnabled);
    }
}
