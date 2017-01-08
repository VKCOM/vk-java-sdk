package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class ReadAllIncomingMessages implements Update{
    private final Integer peerId;
    private final Integer messageId;

    public ReadAllIncomingMessages(Integer peerId, Integer messageId) {
        this.peerId = peerId;
        this.messageId = messageId;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public Integer getMessageId() {
        return messageId;
    }
}
