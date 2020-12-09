package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.MessageError;
import java.util.Objects;

/**
 * SendUserIdsResponse object
 */
public class SendUserIdsResponse implements Validable {
    @SerializedName("peer_id")
    private Integer peerId;

    @SerializedName("message_id")
    private Integer messageId;

    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    @SerializedName("error")
    private MessageError error;

    public Integer getPeerId() {
        return peerId;
    }

    public SendUserIdsResponse setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public SendUserIdsResponse setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public SendUserIdsResponse setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public MessageError getError() {
        return error;
    }

    public SendUserIdsResponse setError(MessageError error) {
        this.error = error;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, conversationMessageId, messageId, error);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendUserIdsResponse sendUserIdsResponse = (SendUserIdsResponse) o;
        return Objects.equals(messageId, sendUserIdsResponse.messageId) &&
                Objects.equals(error, sendUserIdsResponse.error) &&
                Objects.equals(peerId, sendUserIdsResponse.peerId) &&
                Objects.equals(conversationMessageId, sendUserIdsResponse.conversationMessageId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SendUserIdsResponse{");
        sb.append("messageId=").append(messageId);
        sb.append(", error=").append(error);
        sb.append(", peerId=").append(peerId);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append('}');
        return sb.toString();
    }
}
