package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Geo;
import java.util.List;
import java.util.Objects;

/**
 * ForeignMessage object
 */
public class ForeignMessage implements Validable {
    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * Conversation message ID
     */
    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    /**
     * Date when the message was created
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    @SerializedName("fwd_messages")
    private List<ForeignMessage> fwdMessages;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Message ID
     */
    @SerializedName("id")
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

    /**
     * Date when the message has been updated in Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    /**
     * Was the audio message inside already listened by you
     */
    @SerializedName("was_listened")
    private Boolean wasListened;

    /**
     * Additional data sent along with message for developer convenience
     */
    @SerializedName("payload")
    private String payload;

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public ForeignMessage setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public ForeignMessage setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public ForeignMessage setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public ForeignMessage setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public List<ForeignMessage> getFwdMessages() {
        return fwdMessages;
    }

    public ForeignMessage setFwdMessages(List<ForeignMessage> fwdMessages) {
        this.fwdMessages = fwdMessages;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public ForeignMessage setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ForeignMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public ForeignMessage setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public ForeignMessage getReplyMessage() {
        return replyMessage;
    }

    public ForeignMessage setReplyMessage(ForeignMessage replyMessage) {
        this.replyMessage = replyMessage;
        return this;
    }

    public String getText() {
        return text;
    }

    public ForeignMessage setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public ForeignMessage setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Boolean getWasListened() {
        return wasListened;
    }

    public ForeignMessage setWasListened(Boolean wasListened) {
        this.wasListened = wasListened;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public ForeignMessage setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, peerId, attachments, updateTime, fromId, geo, fwdMessages, conversationMessageId, payload, replyMessage, wasListened, id, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForeignMessage foreignMessage = (ForeignMessage) o;
        return Objects.equals(date, foreignMessage.date) &&
                Objects.equals(attachments, foreignMessage.attachments) &&
                Objects.equals(fromId, foreignMessage.fromId) &&
                Objects.equals(wasListened, foreignMessage.wasListened) &&
                Objects.equals(conversationMessageId, foreignMessage.conversationMessageId) &&
                Objects.equals(peerId, foreignMessage.peerId) &&
                Objects.equals(geo, foreignMessage.geo) &&
                Objects.equals(updateTime, foreignMessage.updateTime) &&
                Objects.equals(payload, foreignMessage.payload) &&
                Objects.equals(fwdMessages, foreignMessage.fwdMessages) &&
                Objects.equals(id, foreignMessage.id) &&
                Objects.equals(text, foreignMessage.text) &&
                Objects.equals(replyMessage, foreignMessage.replyMessage);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ForeignMessage{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", wasListened=").append(wasListened);
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", peerId=").append(peerId);
        sb.append(", geo=").append(geo);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", payload='").append(payload).append("'");
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", replyMessage=").append(replyMessage);
        sb.append('}');
        return sb.toString();
    }
}
