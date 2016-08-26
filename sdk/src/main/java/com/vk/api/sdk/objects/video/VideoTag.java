package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * VideoTag object
 */
public class VideoTag {
    /**
     * Tagged user ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Tag ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * ID of the tag creator
     */
    @SerializedName("placer_id")
    private Integer placerId;

    /**
     * Tag description
     */
    @SerializedName("tagged_name")
    private String taggedName;

    /**
     * Date when tag has been added in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Information whether tha tag is reviewed
     */
    @SerializedName("viewed")
    private BoolInt viewed;

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public String getTaggedName() {
        return taggedName;
    }

    public Integer getDate() {
        return date;
    }

    public boolean isViewed() {
        return viewed == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, viewed, taggedName, id, placerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoTag videoTag = (VideoTag) o;
        return Objects.equals(userId, videoTag.userId) &&
                Objects.equals(id, videoTag.id) &&
                Objects.equals(placerId, videoTag.placerId) &&
                Objects.equals(taggedName, videoTag.taggedName) &&
                Objects.equals(date, videoTag.date) &&
                Objects.equals(viewed, videoTag.viewed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoTag{");
        sb.append("userId=").append(userId);
        sb.append(", id=").append(id);
        sb.append(", placerId=").append(placerId);
        sb.append(", taggedName='").append(taggedName).append("'");
        sb.append(", date=").append(date);
        sb.append(", viewed=").append(viewed);
        sb.append('}');
        return sb.toString();
    }
}
