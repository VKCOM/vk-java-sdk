package com.vk.api.sdk.objects.notifications;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.board.Topic;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallPost;

import java.util.Objects;

/**
 * NotificationsComment object
 */
public class NotificationsComment {
    /**
     * Comment ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Author ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

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

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("video")
    private Video video;

    @SerializedName("post")
    private WallPost post;

    @SerializedName("topic")
    private Topic topic;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }

    public WallPost getPost() {
        return post;
    }

    public Topic getTopic() {
        return topic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, post, photo, topic, id, text, video, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationsComment notificationsComment = (NotificationsComment) o;
        return Objects.equals(id, notificationsComment.id) &&
                Objects.equals(ownerId, notificationsComment.ownerId) &&
                Objects.equals(date, notificationsComment.date) &&
                Objects.equals(text, notificationsComment.text) &&
                Objects.equals(photo, notificationsComment.photo) &&
                Objects.equals(video, notificationsComment.video) &&
                Objects.equals(post, notificationsComment.post) &&
                Objects.equals(topic, notificationsComment.topic);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificationsComment{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", post=").append(post);
        sb.append(", topic=").append(topic);
        sb.append('}');
        return sb.toString();
    }
}
