package com.vk.api.sdk.objects.updates;

import java.util.Set;

/**
 * @author Denis Kokorin
 */
public class AddMessageFlags implements Update {
    private final Integer messageId;
    private final Set<MessageFlag> flags;
    private final Integer userId;

    public AddMessageFlags(Integer messageId, Set<MessageFlag> flags, Integer userId) {
        this.messageId = messageId;
        this.flags = flags;
        this.userId = userId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public Set<MessageFlag> getFlags() {
        return flags;
    }

    public Integer getUserId() {
        return userId;
    }
}
