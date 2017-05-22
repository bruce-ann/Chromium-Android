// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.content.browser.input;

import android.text.Editable;
import android.text.InputType;
import android.text.Selection;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;

import org.chromium.base.ThreadUtils;
import org.chromium.blink_public.web.WebTextInputFlags;
import org.chromium.blink_public.web.WebTextInputMode;
import org.chromium.ui.base.ime.TextInputType;

import java.util.Locale;

/**
 * Utilities for IME such as computing outAttrs, and dumping object information.
 */
public class ImeUtils {
    /**
     * Compute {@link EditorInfo} based on the given parameters. This is needed for
     * {@link View#onCreateInputConnection(EditorInfo)}.
     *
     * @param inputType Type defined in {@link TextInputType}.
     * @param inputFlags Flags defined in {@link WebTextInputFlags}.
     * @param inputMode Flags defined in {@link WebTextInputMode}.
     * @param initialSelStart The initial selection start position.
     * @param initialSelEnd The initial selection end position.
     * @param outAttrs An instance of {@link EditorInfo} that we are going to change.
     */
    public static void computeEditorInfo(int inputType, int inputFlags, int inputMode,
            int initialSelStart, int initialSelEnd, EditorInfo outAttrs) {
        outAttrs.imeOptions = EditorInfo.IME_FLAG_NO_FULLSCREEN | EditorInfo.IME_FLAG_NO_EXTRACT_UI;
        outAttrs.inputType =
                EditorInfo.TYPE_CLASS_TEXT | EditorInfo.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT;

        if ((inputFlags & WebTextInputFlags.AutocompleteOff) != 0) {
            outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }

        int imeAction = 0;
        if (inputMode == WebTextInputMode.kDefault) {
            if (inputType == TextInputType.TEXT) {
                // Normal text field
                imeAction = EditorInfo.IME_ACTION_GO;
                if ((inputFlags & WebTextInputFlags.AutocorrectOff) == 0) {
                    outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_AUTO_CORRECT;
                }
            } else if (inputType == TextInputType.TEXT_AREA
                    || inputType == TextInputType.CONTENT_EDITABLE) {
                outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE;
                if ((inputFlags & WebTextInputFlags.AutocorrectOff) == 0) {
                    outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_AUTO_CORRECT;
                }
                imeAction = EditorInfo.IME_ACTION_NONE;
            } else if (inputType == TextInputType.PASSWORD) {
                outAttrs.inputType =
                        InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD;
                imeAction = EditorInfo.IME_ACTION_GO;
            } else if (inputType == TextInputType.SEARCH) {
                imeAction = EditorInfo.IME_ACTION_SEARCH;
            } else if (inputType == TextInputType.URL) {
                outAttrs.inputType = InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_URI;
                imeAction = EditorInfo.IME_ACTION_GO;
            } else if (inputType == TextInputType.EMAIL) {
                // Email
                outAttrs.inputType =
                        InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS;
                imeAction = EditorInfo.IME_ACTION_GO;
            } else if (inputType == TextInputType.TELEPHONE) {
                // Telephone
                // Number and telephone do not have both a Tab key and an
                // action in default OSK, so set the action to NEXT
                outAttrs.inputType = InputType.TYPE_CLASS_PHONE;
                imeAction = EditorInfo.IME_ACTION_NEXT;
            } else if (inputType == TextInputType.NUMBER) {
                // Number
                outAttrs.inputType = InputType.TYPE_CLASS_NUMBER
                        | InputType.TYPE_NUMBER_VARIATION_NORMAL
                        | InputType.TYPE_NUMBER_FLAG_DECIMAL;
                imeAction = EditorInfo.IME_ACTION_NEXT;
            }
        } else {
            switch (inputMode) {
                default:
                case WebTextInputMode.kDefault:
                case WebTextInputMode.kVerbatim:
                case WebTextInputMode.kLatin:
                case WebTextInputMode.kLatinName:
                case WebTextInputMode.kLatinProse:
                case WebTextInputMode.kFullWidthLatin:
                case WebTextInputMode.kKana:
                case WebTextInputMode.kKanaName:
                case WebTextInputMode.kKataKana:
                    outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE;
                    if ((inputFlags & WebTextInputFlags.AutocorrectOff) == 0) {
                        outAttrs.inputType |= EditorInfo.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    }
                    imeAction = EditorInfo.IME_ACTION_NONE;
                    break;
                case WebTextInputMode.kNumeric:
                    outAttrs.inputType =
                            InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_NORMAL;
                    imeAction = EditorInfo.IME_ACTION_NEXT;
                    break;
                case WebTextInputMode.kTel:
                    outAttrs.inputType = InputType.TYPE_CLASS_PHONE;
                    imeAction = EditorInfo.IME_ACTION_NEXT;
                    break;
                case WebTextInputMode.kEmail:
                    outAttrs.inputType = InputType.TYPE_CLASS_TEXT
                            | InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS;
                    imeAction = EditorInfo.IME_ACTION_GO;
                    break;
                case WebTextInputMode.kUrl:
                    outAttrs.inputType =
                            InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_URI;
                    imeAction = EditorInfo.IME_ACTION_NEXT;
                    break;
            }
        }

        outAttrs.imeOptions |= imeAction;
        // Handling of autocapitalize. Blink will send the flag taking into account the element's
        // type. This is not using AutocapitalizeNone because Android does not autocapitalize by
        // default and there is no way to express no capitalization.
        // Autocapitalize is meant as a hint to the virtual keyboard.
        if ((inputFlags & WebTextInputFlags.AutocapitalizeCharacters) != 0) {
            outAttrs.inputType |= InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS;
        } else if ((inputFlags & WebTextInputFlags.AutocapitalizeWords) != 0) {
            outAttrs.inputType |= InputType.TYPE_TEXT_FLAG_CAP_WORDS;
        } else if ((inputFlags & WebTextInputFlags.AutocapitalizeSentences) != 0) {
            outAttrs.inputType |= InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        // Content editable doesn't use autocapitalize so we need to set it manually.
        if (inputType == TextInputType.CONTENT_EDITABLE) {
            outAttrs.inputType |= InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }

        outAttrs.initialSelStart = initialSelStart;
        outAttrs.initialSelEnd = initialSelEnd;
    }

    /**
     * @param editorInfo The EditorInfo
     * @return Debug string for the given {@EditorInfo}.
     */
    static String getEditorInfoDebugString(EditorInfo editorInfo) {
        StringBuilder builder = new StringBuilder();
        StringBuilderPrinter printer = new StringBuilderPrinter(builder);
        editorInfo.dump(printer, "");
        return builder.toString();
    }

    /**
     * @param editable The editable.
     * @return Debug string for the given {@Editable}.
     */
    static String getEditableDebugString(Editable editable) {
        return String.format(Locale.US, "Editable {[%s] SEL[%d %d] COM[%d %d]}",
                editable.toString(), Selection.getSelectionStart(editable),
                Selection.getSelectionEnd(editable),
                BaseInputConnection.getComposingSpanStart(editable),
                BaseInputConnection.getComposingSpanEnd(editable));
    }

    /**
     * @param correctionInfo The correction info.
     * @return Debug string for the given {@CorrectionInfo}.
     */
    static String getCorrectionInfoDebugString(CorrectionInfo correctionInfo) {
        // TODO(changwan): implement it properly if needed.
        return correctionInfo.toString();
    }

    /**
     * Check the given condition and raise an error if it is false.
     * @param condition The condition to check.
     */
    static void checkCondition(boolean condition) {
        if (!condition) throw new AssertionError();
    }

    /**
     * Check the given condition and raise an error if it is false.
     * @param msg A message to show when raising an error.
     * @param condition The condition to check.
     */
    static void checkCondition(String msg, boolean condition) {
        if (!condition) throw new AssertionError(msg);
    }

    /**
     * Check that the current thread is UI thread, and raise an error if it is not.
     */
    static void checkOnUiThread() {
        checkCondition("Should be on UI thread.", ThreadUtils.runningOnUiThread());
    }
}
