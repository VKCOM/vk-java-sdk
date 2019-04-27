package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * Conversation object
 */
public class Conversation {
    @SerializedName("current_keyboard")
    private Keyboard currentKeyboard;

    @SerializedName("important")
    private Boolean important;

    /**
     * Last message user have read
     */
    @SerializedName("in_read")
    private Integer inRead;

    /**
     * ID of the last message in conversation
     */
    @SerializedName("last_message_id")
    private Integer lastMessageId;

    /**
     * Ids of messages with mentions
     */
    @SerializedName("mentions")
    private List<Integer> mentions;

    @SerializedName("message_request")
    private ConversationMessageRequest messageRequest;

    /**
     * Last outcoming message have been read by the opponent
     */
    @SerializedName("out_read")
    private Integer outRead;

    @SerializedName("peer")
    private ConversationPeer peer;

    @SerializedName("unanswered")
    private Boolean unanswered;

    /**
     * Unread messages number
     */
    @SerializedName("unread_count")
    private Integer unreadCount;

    public Keyboard getCurrentKeyboard() {
        return currentKeyboard;
    }

    public Conversation setCurrentKeyboard(Keyboard currentKeyboard) {
        this.currentKeyboard = currentKeyboard;
        return this;
    }

    public Boolean getImportant() {
        return important;
    }

    public Conversation setImportant(Boolean important) {
        this.important = important;
        return this;
    }

    public Integer getInRead() {
        return inRead;
    }

    public Conversation setInRead(Integer inRead) {
        this.inRead = inRead;
        return this;
    }

    public Integer getLastMessageId() {
        return lastMessageId;
    }

    public Conversation setLastMessageId(Integer lastMessageId) {
        this.lastMessageId = lastMessageId;
        return this;
    }

    public List<Integer> getMentions() {
        return mentions;
    }

    public Conversation setMentions(List<Integer> mentions) {
        this.mentions = mentions;
        return this;
    }

    public ConversationMessageRequest getMessageRequest() {
        return messageRequest;
    }

    public Conversation setMessageRequest(ConversationMessageRequest messageRequest) {
        this.messageRequest = messageRequest;
        return this;
    }

    public Integer getOutRead() {
        return outRead;
    }

    public Conversation setOutRead(Integer outRead) {
        this.outRead = outRead;
        return this;
    }

    public ConversationPeer getPeer() {
        return peer;
    }

    public Conversation setPeer(ConversationPeer peer) {
        this.peer = peer;
        return this;
    }

    public Boolean getUnanswered() {
        return unanswered;
    }

    public Conversation setUnanswered(Boolean unanswered) {
        this.unanswered = unanswered;
        return this;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public Conversation setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(important, outRead, peer, mentions, unanswered, currentKeyboard, unreadCount, inRead, lastMessageId, messageRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversation conversation = (Conversation) o;
        return Objects.equals(important, conversation.important) &&
                Objects.equals(lastMessageId, conversation.lastMessageId) &&
                Objects.equals(unreadCount, conversation.unreadCount) &&
                Objects.equals(inRead, conversation.inRead) &&
                Objects.equals(peer, conversation.peer) &&
                Objects.equals(currentKeyboard, conversation.currentKeyboard) &&
                Objects.equals(mentions, conversation.mentions) &&
                Objects.equals(unanswered, conversation.unanswered) &&
                Objects.equals(outRead, conversation.outRead) &&
                Objects.equals(messageRequest, conversation.messageRequest);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Conversation{");
        sb.append("important=").append(important);
        sb.append(", lastMessageId=").append(lastMessageId);
        sb.append(", unreadCount=").append(unreadCount);
        sb.append(", inRead=").append(inRead);
        sb.append(", peer=").append(peer);
        sb.append(", currentKeyboard=").append(currentKeyboard);
        sb.append(", mentions=").append(mentions);
        sb.append(", unanswered=").append(unanswered);
        sb.append(", outRead=").append(outRead);
        sb.append(", messageRequest='").append(messageRequest).append("'");
        sb.append('}');
        return sb.toString();
    }
}
