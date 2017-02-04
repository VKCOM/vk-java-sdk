package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class ChatChanged implements Update {
    private final int chatId;
    private final boolean byOneself;

    public ChatChanged(int chatId, boolean byOneself) {
        this.chatId = chatId;
        this.byOneself = byOneself;
    }

    public int getChatId() {
        return chatId;
    }

    public boolean isByOneself() {
        return byOneself;
    }
}
