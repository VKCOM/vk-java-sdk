package com.vk.api.sdk.callback.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class CallbackVideoComment {

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

    /**
     * video owner ID
     */
    @SerializedName("video_owner_od")
    private Integer videoOwnerId;

    /**
     * video ID
     */
    @SerializedName("video_id")
    private Integer videoId;

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

    public Integer getVideoOwnerId() {
        return videoOwnerId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackVideoComment that = (CallbackVideoComment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(fromId, that.fromId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(text, that.text) &&
                Objects.equals(videoOwnerId, that.videoOwnerId) &&
                Objects.equals(videoId, that.videoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromId, date, text, videoOwnerId, videoId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackVideoComment{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append('\'');
        sb.append(", videoOwnerId=").append(videoOwnerId);
        sb.append(", videoId=").append(videoId);
        sb.append('}');
        return sb.toString();
    }
}
