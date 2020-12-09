package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * Forward object
 */
public class Forward implements Validable {
    /**
     * Messages owner_id
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Messages peer_id
     */
    @SerializedName("peer_id")
    private Integer peerId;

    @SerializedName("conversation_message_ids")
    private List<Integer> conversationMessageIds;

    @SerializedName("message_ids")
    private List<Integer> messageIds;

    /**
     * If you need to reply to a message
     */
    @SerializedName("is_reply")
    private Boolean isReply;

    public Integer getOwnerId() {
        return ownerId;
    }

    public Forward setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public Forward setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public List<Integer> getConversationMessageIds() {
        return conversationMessageIds;
    }

    public Forward setConversationMessageIds(List<Integer> conversationMessageIds) {
        this.conversationMessageIds = conversationMessageIds;
        return this;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public Forward setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
        return this;
    }

    public Boolean getIsReply() {
        return isReply;
    }

    public Forward setIsReply(Boolean isReply) {
        this.isReply = isReply;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, messageIds, conversationMessageIds, ownerId, isReply);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forward forward = (Forward) o;
        return Objects.equals(conversationMessageIds, forward.conversationMessageIds) &&
                Objects.equals(ownerId, forward.ownerId) &&
                Objects.equals(messageIds, forward.messageIds) &&
                Objects.equals(peerId, forward.peerId) &&
                Objects.equals(isReply, forward.isReply);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Forward{");
        sb.append("conversationMessageIds=").append(conversationMessageIds);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", messageIds=").append(messageIds);
        sb.append(", peerId=").append(peerId);
        sb.append(", isReply=").append(isReply);
        sb.append('}');
        return sb.toString();
    }
}
