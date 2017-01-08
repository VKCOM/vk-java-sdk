package com.vk.api.sdk.objects.updates;

import com.vk.api.sdk.objects.messages.Message;

public class AddMessage implements Update {
    private final Message message;

    public AddMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
