package com.vk.api.sdk.queries.messages;

public enum MessagesGetLongPollHistoryMode {
    ATTACHMENTS(2),
    EXTENDED_EVENTS(8),
    NEED_PTS(32),
    /**
     * Receive extra data about friends' platform, when they come online
     */
    EXTRA_ONLINE_DATA(64),
    RANDOM_ID(128);

    private final int value;

    MessagesGetLongPollHistoryMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
