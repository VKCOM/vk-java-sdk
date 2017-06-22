package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AttachmentsHistory object
 */
public class AttachmentsHistory {
    @SerializedName("message_id")
    private Integer messageId;

    @SerializedName("attachment")
    private Attachment attachment;

    public Integer getMessageId() {
        return messageId;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachmentsHistory that = (AttachmentsHistory) o;
        return Objects.equals(messageId, that.messageId) &&
                Objects.equals(attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, attachment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttachmentsHistory{");
        sb.append("messageId=").append(messageId);
        sb.append(", attachment=").append(attachment);
        sb.append('}');
        return sb.toString();
    }
}
