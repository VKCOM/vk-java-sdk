package com.vk.api.sdk.objects.board;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.wall.CommentAttachment;

import java.util.List;
import java.util.Objects;

/**
 * TopicComment object
 */
public class TopicComment {
    /**
     * Comment ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Comment text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Real position of the comment
     */
    @SerializedName("real_offset")
    private Integer realOffset;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, realOffset, attachments, id, text, fromId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicComment topicComment = (TopicComment) o;
        return Objects.equals(id, topicComment.id) &&
                Objects.equals(fromId, topicComment.fromId) &&
                Objects.equals(date, topicComment.date) &&
                Objects.equals(text, topicComment.text) &&
                Objects.equals(attachments, topicComment.attachments) &&
                Objects.equals(realOffset, topicComment.realOffset);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TopicComment{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", attachments=").append(attachments);
        sb.append(", realOffset=").append(realOffset);
        sb.append('}');
        return sb.toString();
    }
}
