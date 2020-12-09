package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.messages.ForeignMessage;
import com.vk.api.sdk.objects.messages.Keyboard;
import com.vk.api.sdk.objects.messages.MessageAttachment;
import java.util.List;
import java.util.Objects;

/**
 * PinResponse object
 */
public class PinResponse implements Validable {
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

    public PinResponse setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public PinResponse setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public PinResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public PinResponse setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public List<ForeignMessage> getFwdMessages() {
        return fwdMessages;
    }

    public PinResponse setFwdMessages(List<ForeignMessage> fwdMessages) {
        this.fwdMessages = fwdMessages;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public PinResponse setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PinResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public PinResponse setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public ForeignMessage getReplyMessage() {
        return replyMessage;
    }

    public PinResponse setReplyMessage(ForeignMessage replyMessage) {
        this.replyMessage = replyMessage;
        return this;
    }

    public String getText() {
        return text;
    }

    public PinResponse setText(String text) {
        this.text = text;
        return this;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public PinResponse setKeyboard(Keyboard keyboard) {
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
        PinResponse pinResponse = (PinResponse) o;
        return Objects.equals(date, pinResponse.date) &&
                Objects.equals(geo, pinResponse.geo) &&
                Objects.equals(keyboard, pinResponse.keyboard) &&
                Objects.equals(attachments, pinResponse.attachments) &&
                Objects.equals(fromId, pinResponse.fromId) &&
                Objects.equals(fwdMessages, pinResponse.fwdMessages) &&
                Objects.equals(id, pinResponse.id) &&
                Objects.equals(text, pinResponse.text) &&
                Objects.equals(replyMessage, pinResponse.replyMessage) &&
                Objects.equals(conversationMessageId, pinResponse.conversationMessageId) &&
                Objects.equals(peerId, pinResponse.peerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PinResponse{");
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
