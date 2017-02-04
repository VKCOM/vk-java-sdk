package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class UserTypedInChat implements Update {
    private final int userId;
    private final int chatId;

    public UserTypedInChat(int userId, int chatId) {
        this.userId = userId;
        this.chatId = chatId;
    }

    public int getUserId() {
        return userId;
    }

    public int getChatId() {
        return chatId;
    }
}
