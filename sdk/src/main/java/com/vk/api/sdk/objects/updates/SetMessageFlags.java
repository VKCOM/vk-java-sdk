package com.vk.api.sdk.objects.updates;

import java.util.Set;

public class SetMessageFlags implements Update {
    private final Integer messageId;
    private final Set<MessageFlag> flags;

    public SetMessageFlags(Integer messageId, Set<MessageFlag> flags) {
        this.messageId = messageId;
        this.flags = flags;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public Set<MessageFlag> getFlags() {
        return flags;
    }
}
