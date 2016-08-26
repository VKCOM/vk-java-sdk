package com.vk.api.sdk.client;

/**
 * Supported languages
 */
public enum Lang {
    RU("ru"),
    UA("ua"),
    BE("be"),
    EN("en"),
    ES("es"),
    FI("fi"),
    DE("de"),
    IT("it");

    private final String value;

    Lang(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
