package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Chat;

import java.util.Objects;

/**
 * SetChatPhotoResponse object
 */
public class SetChatPhotoResponse {
    /**
     * Service message ID
     */
    @SerializedName("message_id")
    private Integer messageId;

    @SerializedName("chat")
    private Chat chat;

    public Integer getMessageId() {
        return messageId;
    }

    public Chat getChat() {
        return chat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, messageId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetChatPhotoResponse setChatPhotoResponse = (SetChatPhotoResponse) o;
        return Objects.equals(messageId, setChatPhotoResponse.messageId) &&
                Objects.equals(chat, setChatPhotoResponse.chat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SetChatPhotoResponse{");
        sb.append("messageId=").append(messageId);
        sb.append(", chat=").append(chat);
        sb.append('}');
        return sb.toString();
    }
}
