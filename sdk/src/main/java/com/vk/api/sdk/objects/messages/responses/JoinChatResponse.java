package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;

public class JoinChatResponse {

    @SerializedName("chat_id")
    private Integer chatId;

    public Integer getChatId() {
        return chatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoinChatResponse that = (JoinChatResponse) o;
        return chatId != null ? chatId.equals(that.chatId) : that.chatId == null;
    }

    @Override
    public int hashCode() {
        return chatId != null ? chatId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "JoinChatResponse{" +
                "chatId=" + chatId +
                '}';
    }
}