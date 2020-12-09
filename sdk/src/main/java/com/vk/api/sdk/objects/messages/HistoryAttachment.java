package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * HistoryAttachment object
 */
public class HistoryAttachment implements Validable {
    @SerializedName("attachment")
    @Required
    private HistoryMessageAttachment attachment;

    /**
     * Message ID
     */
    @SerializedName("message_id")
    private Integer messageId;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Forward level (optional)
     */
    @SerializedName("forward_level")
    private Integer forwardLevel;

    public HistoryMessageAttachment getAttachment() {
        return attachment;
    }

    public HistoryAttachment setAttachment(HistoryMessageAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public HistoryAttachment setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public HistoryAttachment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getForwardLevel() {
        return forwardLevel;
    }

    public HistoryAttachment setForwardLevel(Integer forwardLevel) {
        this.forwardLevel = forwardLevel;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachment, messageId, fromId, forwardLevel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryAttachment historyAttachment = (HistoryAttachment) o;
        return Objects.equals(fromId, historyAttachment.fromId) &&
                Objects.equals(attachment, historyAttachment.attachment) &&
                Objects.equals(messageId, historyAttachment.messageId) &&
                Objects.equals(forwardLevel, historyAttachment.forwardLevel);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("HistoryAttachment{");
        sb.append("fromId=").append(fromId);
        sb.append(", attachment=").append(attachment);
        sb.append(", messageId=").append(messageId);
        sb.append(", forwardLevel=").append(forwardLevel);
        sb.append('}');
        return sb.toString();
    }
}
