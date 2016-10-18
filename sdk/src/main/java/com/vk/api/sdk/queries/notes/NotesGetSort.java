package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 22.09.16.
 */
public enum NotesGetSort implements EnumParam {

    /**
     * Default sorting. By creation date in desc order
     */
    BY_CREATION_DATE_DESC("0"),

    /**
     * By creation date in asc order
     */
    BY_CREATION_DATE_ASC("1");

    private final String value;

    NotesGetSort(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
