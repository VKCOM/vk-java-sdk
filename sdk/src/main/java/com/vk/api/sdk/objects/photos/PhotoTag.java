package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * PhotoTag object
 */
public class PhotoTag {
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
     * Coordinate X of the left upper corner
     */
    @SerializedName("x")
    private Float x;

    /**
     * Coordinate Y of the left upper corner
     */
    @SerializedName("y")
    private Float y;

    /**
     * Coordinate X of the right lower corner
     */
    @SerializedName("x2")
    private Float x2;

    /**
     * Coordinate Y of the right lower corner
     */
    @SerializedName("y2")
    private Float y2;

    /**
     * Information whether the tag is reviewed
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

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public Float getX2() {
        return x2;
    }

    public Float getY2() {
        return y2;
    }

    public boolean isViewed() {
        return viewed == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, viewed, taggedName, x, y, y2, x2, id, placerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoTag photoTag = (PhotoTag) o;
        return Objects.equals(userId, photoTag.userId) &&
                Objects.equals(id, photoTag.id) &&
                Objects.equals(placerId, photoTag.placerId) &&
                Objects.equals(taggedName, photoTag.taggedName) &&
                Objects.equals(date, photoTag.date) &&
                Objects.equals(x, photoTag.x) &&
                Objects.equals(y, photoTag.y) &&
                Objects.equals(x2, photoTag.x2) &&
                Objects.equals(y2, photoTag.y2) &&
                Objects.equals(viewed, photoTag.viewed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoTag{");
        sb.append("userId=").append(userId);
        sb.append(", id=").append(id);
        sb.append(", placerId=").append(placerId);
        sb.append(", taggedName='").append(taggedName).append("'");
        sb.append(", date=").append(date);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", x2=").append(x2);
        sb.append(", y2=").append(y2);
        sb.append(", viewed=").append(viewed);
        sb.append('}');
        return sb.toString();
    }
}
