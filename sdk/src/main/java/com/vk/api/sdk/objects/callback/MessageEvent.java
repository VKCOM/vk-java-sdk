package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * MessageEvent object
 */
public class MessageEvent implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("peer_id")
    private Integer peerId;

    @SerializedName("event_id")
    private String eventId;

    @SerializedName("payload")
    private JsonObject payload;

    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    public Integer getUserId() {
        return userId;
    }

    public MessageEvent setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public MessageEvent setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public MessageEvent setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public JsonObject getPayload() {
        return payload;
    }

    public MessageEvent setPayload(JsonObject payload) {
        this.payload = payload;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public MessageEvent setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, peerId, eventId, payload, conversationMessageId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEvent messageEvent = (MessageEvent) o;
        return Objects.equals(userId, messageEvent.userId) &&
                Objects.equals(peerId, messageEvent.peerId) &&
                Objects.equals(eventId, messageEvent.eventId) &&
                Objects.equals(payload, messageEvent.payload) &&
                Objects.equals(conversationMessageId, messageEvent.conversationMessageId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageEvent{");
        sb.append("userId=").append(userId);
        sb.append(", peerId='").append(peerId).append("'");
        sb.append(", eventId='").append(eventId).append("'");
        sb.append(", payload='").append(payload).append("'");
        sb.append(", conversationMessageId='").append(conversationMessageId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
