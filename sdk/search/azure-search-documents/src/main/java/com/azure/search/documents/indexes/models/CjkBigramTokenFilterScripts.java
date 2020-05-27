// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CjkBigramTokenFilterScripts.
 */
public enum CjkBigramTokenFilterScripts {
    /**
     * Enum value han.
     */
    HAN("han"),

    /**
     * Enum value hiragana.
     */
    HIRAGANA("hiragana"),

    /**
     * Enum value katakana.
     */
    KATAKANA("katakana"),

    /**
     * Enum value hangul.
     */
    HANGUL("hangul");

    /**
     * The actual serialized value for a CjkBigramTokenFilterScripts instance.
     */
    private final String value;

    CjkBigramTokenFilterScripts(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CjkBigramTokenFilterScripts instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CjkBigramTokenFilterScripts object, or null if unable to parse.
     */
    @JsonCreator
    public static CjkBigramTokenFilterScripts fromString(String value) {
        CjkBigramTokenFilterScripts[] items = CjkBigramTokenFilterScripts.values();
        for (CjkBigramTokenFilterScripts item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}