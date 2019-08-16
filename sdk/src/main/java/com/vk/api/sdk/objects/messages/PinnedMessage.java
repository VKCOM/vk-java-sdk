package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Geo;
import java.util.List;
import java.util.Objects;

/**
 * PinnedMessage object
 */
public class PinnedMessage implements Validable {
    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * Unique auto-incremented number for all messages with this peer
     */
    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Forwarded messages
     */
    @SerializedName("fwd_messages")
    private List<ForeignMessage> fwdMessages;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Message ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Peer ID
     */
    @SerializedName("peer_id")
    private Integer peerId;

    @SerializedName("reply_message")
    private ForeignMessage replyMessage;

    /**
     * Message text
     */
    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("keyboard")
    private Keyboard keyboard;

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public PinnedMessage setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public PinnedMessage setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PinnedMessage setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public PinnedMessage setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public List<ForeignMessage> getFwdMessages() {
        return fwdMessages;
    }

    public PinnedMessage setFwdMessages(List<ForeignMessage> fwdMessages) {
        this.fwdMessages = fwdMessages;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public PinnedMessage setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PinnedMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public PinnedMessage setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public ForeignMessage getReplyMessage() {
        return replyMessage;
    }

    public PinnedMessage setReplyMessage(ForeignMessage replyMessage) {
        this.replyMessage = replyMessage;
        return this;
    }

    public String getText() {
        return text;
    }

    public PinnedMessage setText(String text) {
        this.text = text;
        return this;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public PinnedMessage setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, geo, peerId, keyboard, fwdMessages, attachments, conversationMessageId, replyMessage, id, text, fromId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PinnedMessage pinnedMessage = (PinnedMessage) o;
        return Objects.equals(date, pinnedMessage.date) &&
                Objects.equals(geo, pinnedMessage.geo) &&
                Objects.equals(keyboard, pinnedMessage.keyboard) &&
                Objects.equals(attachments, pinnedMessage.attachments) &&
                Objects.equals(fromId, pinnedMessage.fromId) &&
                Objects.equals(fwdMessages, pinnedMessage.fwdMessages) &&
                Objects.equals(id, pinnedMessage.id) &&
                Objects.equals(text, pinnedMessage.text) &&
                Objects.equals(replyMessage, pinnedMessage.replyMessage) &&
                Objects.equals(conversationMessageId, pinnedMessage.conversationMessageId) &&
                Objects.equals(peerId, pinnedMessage.peerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PinnedMessage{");
        sb.append("date=").append(date);
        sb.append(", geo=").append(geo);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", replyMessage=").append(replyMessage);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", peerId=").append(peerId);
        sb.append('}');
        return sb.toString();
    }
}
