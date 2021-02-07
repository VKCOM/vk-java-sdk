package com.vk.api.sdk.objects.board;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.wall.CommentAttachment;
import java.util.List;
import java.util.Objects;

/**
 * TopicComment object
 */
public class TopicComment implements Validable {
    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Comment ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Real position of the comment
     */
    @SerializedName("real_offset")
    private Integer realOffset;

    /**
     * Comment text
     */
    @SerializedName("text")
    @Required
    private String text;

    /**
     * Information whether current user can edit the comment
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    @SerializedName("likes")
    private LikesInfo likes;

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public TopicComment setAttachments(List<CommentAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public TopicComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public TopicComment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public TopicComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public TopicComment setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public String getText() {
        return text;
    }

    public TopicComment setText(String text) {
        this.text = text;
        return this;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public TopicComment setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, realOffset, attachments, canEdit, id, text, fromId, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicComment topicComment = (TopicComment) o;
        return Objects.equals(date, topicComment.date) &&
                Objects.equals(realOffset, topicComment.realOffset) &&
                Objects.equals(attachments, topicComment.attachments) &&
                Objects.equals(fromId, topicComment.fromId) &&
                Objects.equals(canEdit, topicComment.canEdit) &&
                Objects.equals(id, topicComment.id) &&
                Objects.equals(text, topicComment.text) &&
                Objects.equals(likes, topicComment.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TopicComment{");
        sb.append("date=").append(date);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
