package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * Conversation object
 */
public class Conversation implements Validable {
    @SerializedName("peer")
    @Required
    private ConversationPeer peer;

    @SerializedName("sort_id")
    private ConversationSortId sortId;

    /**
     * ID of the last message in conversation
     */
    @SerializedName("last_message_id")
    private Integer lastMessageId;

    /**
     * Last message user have read
     */
    @SerializedName("in_read")
    private Integer inRead;

    /**
     * Last outcoming message have been read by the opponent
     */
    @SerializedName("out_read")
    private Integer outRead;

    /**
     * Unread messages number
     */
    @SerializedName("unread_count")
    private Integer unreadCount;

    /**
     * Is this conversation uread
     */
    @SerializedName("is_marked_unread")
    private Boolean isMarkedUnread;

    @SerializedName("out_read_by")
    private OutReadBy outReadBy;

    @SerializedName("important")
    private Boolean important;

    @SerializedName("unanswered")
    private Boolean unanswered;

    @SerializedName("special_service_type")
    private ConversationSpecialServiceType specialServiceType;

    @SerializedName("message_request_data")
    private MessageRequestData messageRequestData;

    /**
     * Ids of messages with mentions
     */
    @SerializedName("mentions")
    private List<Integer> mentions;

    @SerializedName("current_keyboard")
    private Keyboard currentKeyboard;

    @SerializedName("push_settings")
    private PushSettings pushSettings;

    @SerializedName("can_write")
    private ConversationCanWrite canWrite;

    @SerializedName("chat_settings")
    private ChatSettings chatSettings;

    public ConversationPeer getPeer() {
        return peer;
    }

    public Conversation setPeer(ConversationPeer peer) {
        this.peer = peer;
        return this;
    }

    public ConversationSortId getSortId() {
        return sortId;
    }

    public Conversation setSortId(ConversationSortId sortId) {
        this.sortId = sortId;
        return this;
    }

    public Integer getLastMessageId() {
        return lastMessageId;
    }

    public Conversation setLastMessageId(Integer lastMessageId) {
        this.lastMessageId = lastMessageId;
        return this;
    }

    public Integer getInRead() {
        return inRead;
    }

    public Conversation setInRead(Integer inRead) {
        this.inRead = inRead;
        return this;
    }

    public Integer getOutRead() {
        return outRead;
    }

    public Conversation setOutRead(Integer outRead) {
        this.outRead = outRead;
        return this;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public Conversation setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    public Boolean getIsMarkedUnread() {
        return isMarkedUnread;
    }

    public Conversation setIsMarkedUnread(Boolean isMarkedUnread) {
        this.isMarkedUnread = isMarkedUnread;
        return this;
    }

    public OutReadBy getOutReadBy() {
        return outReadBy;
    }

    public Conversation setOutReadBy(OutReadBy outReadBy) {
        this.outReadBy = outReadBy;
        return this;
    }

    public Boolean getImportant() {
        return important;
    }

    public Conversation setImportant(Boolean important) {
        this.important = important;
        return this;
    }

    public Boolean getUnanswered() {
        return unanswered;
    }

    public Conversation setUnanswered(Boolean unanswered) {
        this.unanswered = unanswered;
        return this;
    }

    public ConversationSpecialServiceType getSpecialServiceType() {
        return specialServiceType;
    }

    public Conversation setSpecialServiceType(ConversationSpecialServiceType specialServiceType) {
        this.specialServiceType = specialServiceType;
        return this;
    }

    public MessageRequestData getMessageRequestData() {
        return messageRequestData;
    }

    public Conversation setMessageRequestData(MessageRequestData messageRequestData) {
        this.messageRequestData = messageRequestData;
        return this;
    }

    public List<Integer> getMentions() {
        return mentions;
    }

    public Conversation setMentions(List<Integer> mentions) {
        this.mentions = mentions;
        return this;
    }

    public Keyboard getCurrentKeyboard() {
        return currentKeyboard;
    }

    public Conversation setCurrentKeyboard(Keyboard currentKeyboard) {
        this.currentKeyboard = currentKeyboard;
        return this;
    }

    public PushSettings getPushSettings() {
        return pushSettings;
    }

    public Conversation setPushSettings(PushSettings pushSettings) {
        this.pushSettings = pushSettings;
        return this;
    }

    public ConversationCanWrite getCanWrite() {
        return canWrite;
    }

    public Conversation setCanWrite(ConversationCanWrite canWrite) {
        this.canWrite = canWrite;
        return this;
    }

    public ChatSettings getChatSettings() {
        return chatSettings;
    }

    public Conversation setChatSettings(ChatSettings chatSettings) {
        this.chatSettings = chatSettings;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(outRead, unanswered, unreadCount, outReadBy, canWrite, isMarkedUnread, messageRequestData, important, chatSettings, sortId, peer, mentions, currentKeyboard, inRead, lastMessageId, pushSettings, specialServiceType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversation conversation = (Conversation) o;
        return Objects.equals(inRead, conversation.inRead) &&
                Objects.equals(canWrite, conversation.canWrite) &&
                Objects.equals(unanswered, conversation.unanswered) &&
                Objects.equals(chatSettings, conversation.chatSettings) &&
                Objects.equals(isMarkedUnread, conversation.isMarkedUnread) &&
                Objects.equals(sortId, conversation.sortId) &&
                Objects.equals(important, conversation.important) &&
                Objects.equals(lastMessageId, conversation.lastMessageId) &&
                Objects.equals(unreadCount, conversation.unreadCount) &&
                Objects.equals(specialServiceType, conversation.specialServiceType) &&
                Objects.equals(pushSettings, conversation.pushSettings) &&
                Objects.equals(peer, conversation.peer) &&
                Objects.equals(mentions, conversation.mentions) &&
                Objects.equals(currentKeyboard, conversation.currentKeyboard) &&
                Objects.equals(messageRequestData, conversation.messageRequestData) &&
                Objects.equals(outRead, conversation.outRead) &&
                Objects.equals(outReadBy, conversation.outReadBy);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Conversation{");
        sb.append("inRead=").append(inRead);
        sb.append(", canWrite=").append(canWrite);
        sb.append(", unanswered=").append(unanswered);
        sb.append(", chatSettings=").append(chatSettings);
        sb.append(", isMarkedUnread=").append(isMarkedUnread);
        sb.append(", sortId=").append(sortId);
        sb.append(", important=").append(important);
        sb.append(", lastMessageId=").append(lastMessageId);
        sb.append(", unreadCount=").append(unreadCount);
        sb.append(", specialServiceType='").append(specialServiceType).append("'");
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", peer=").append(peer);
        sb.append(", mentions=").append(mentions);
        sb.append(", currentKeyboard=").append(currentKeyboard);
        sb.append(", messageRequestData=").append(messageRequestData);
        sb.append(", outRead=").append(outRead);
        sb.append(", outReadBy=").append(outReadBy);
        sb.append('}');
        return sb.toString();
    }
}
