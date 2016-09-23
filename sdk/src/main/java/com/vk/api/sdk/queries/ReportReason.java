package com.vk.api.sdk.queries;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum ReportReason implements EnumParam {

    SPAM("0"),
    CHILD_PORN("1"),
    EXTREMISM("2"),
    VIOLINCE("3"),
    DRUGS("4"),
    ADULT_MATERIALS("5"),
    INSULT("6");

    private final String value;

    ReportReason(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
