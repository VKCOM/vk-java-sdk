package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class DeleteMessage implements Update {
    private final Integer messageId;

    public DeleteMessage(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageId() {
        return messageId;
    }
}
