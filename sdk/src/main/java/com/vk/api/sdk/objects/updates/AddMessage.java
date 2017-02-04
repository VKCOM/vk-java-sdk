package com.vk.api.sdk.objects.updates;

import com.vk.api.sdk.objects.messages.Message;

/**
 * @author Denis Kokorin
 */
public class AddMessage implements Update {
    private final Message message;

    public AddMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
