package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.wall.CommentAttachment;

import java.util.List;
import java.util.Objects;

/**
 * CommentXtrPid object
 */
public class CommentXtrPid {
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

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Replied user ID
     */
    @SerializedName("reply_to_user")
    private Integer replyToUser;

    /**
     * Replied comment ID
     */
    @SerializedName("reply_to_comment")
    private Integer replyToComment;

    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Photo ID
     */
    @SerializedName("pid")
    private Integer pid;

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

    public LikesInfo getLikes() {
        return likes;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public Integer getReplyToComment() {
        return replyToComment;
    }

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public Integer getPid() {
        return pid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, pid, id, text, fromId, replyToUser, replyToComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentXtrPid commentXtrPid = (CommentXtrPid) o;
        return Objects.equals(id, commentXtrPid.id) &&
                Objects.equals(fromId, commentXtrPid.fromId) &&
                Objects.equals(date, commentXtrPid.date) &&
                Objects.equals(text, commentXtrPid.text) &&
                Objects.equals(likes, commentXtrPid.likes) &&
                Objects.equals(replyToUser, commentXtrPid.replyToUser) &&
                Objects.equals(replyToComment, commentXtrPid.replyToComment) &&
                Objects.equals(attachments, commentXtrPid.attachments) &&
                Objects.equals(pid, commentXtrPid.pid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentXtrPid{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", attachments=").append(attachments);
        sb.append(", pid=").append(pid);
        sb.append('}');
        return sb.toString();
    }
}
