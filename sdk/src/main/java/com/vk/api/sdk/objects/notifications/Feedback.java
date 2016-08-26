package com.vk.api.sdk.objects.notifications;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.Geo;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.wall.WallpostAttachment;

import java.util.List;
import java.util.Objects;

/**
 * Feedback object
 */
public class Feedback {
    /**
     * Item ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Wall owner's ID
     */
    @SerializedName("to_id")
    private Integer toId;

    /**
     * Reply author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Reply text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("likes")
    private LikesInfo likes;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    @SerializedName("geo")
    private Geo geo;

    public Integer getId() {
        return id;
    }

    public Integer getToId() {
        return toId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public String getText() {
        return text;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, geo, attachments, id, text, fromId, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(id, feedback.id) &&
                Objects.equals(toId, feedback.toId) &&
                Objects.equals(fromId, feedback.fromId) &&
                Objects.equals(text, feedback.text) &&
                Objects.equals(likes, feedback.likes) &&
                Objects.equals(attachments, feedback.attachments) &&
                Objects.equals(geo, feedback.geo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Feedback{");
        sb.append("id=").append(id);
        sb.append(", toId=").append(toId);
        sb.append(", fromId=").append(fromId);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }
}
