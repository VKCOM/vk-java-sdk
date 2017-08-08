package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.queries.EnumParam;

/**
 * Created by Anton Tsivarev on 08.08.17.
 */
public enum DocsGetMessagesUploadServerType implements EnumParam {

    /**
     * Document
     */
    DOC("doc"),

    /**
     * Graffiti
     */
    GRAFFITI("graffiti"),

    /**
     * Audio message
     */
    AUDIO_MESSAGE("audio_message");

    private final String value;

    DocsGetMessagesUploadServerType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
