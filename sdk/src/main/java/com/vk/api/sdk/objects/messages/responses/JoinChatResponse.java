package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Response which contains chat_id the current user joined to
 */

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
        JoinChatResponse response = (JoinChatResponse) o;
        return Objects.equals(chatId, response.chatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JoinChatResponse{");
        sb.append("chatId=").append(chatId);
        sb.append('}');
        return sb.toString();
    }
}
