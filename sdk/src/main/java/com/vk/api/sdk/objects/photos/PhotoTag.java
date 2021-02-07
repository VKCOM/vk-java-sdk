package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * PhotoTag object
 */
public class PhotoTag implements Validable {
    /**
     * Date when tag has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Tag ID
     */
    @SerializedName("id")
    @Required
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
     * Tagged description.
     */
    @SerializedName("description")
    private String description;

    /**
     * Tagged user ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Information whether the tag is reviewed
     */
    @SerializedName("viewed")
    @Required
    private BoolInt viewed;

    /**
     * Coordinate X of the left upper corner
     */
    @SerializedName("x")
    @Required
    private Float x;

    /**
     * Coordinate X of the right lower corner
     */
    @SerializedName("x2")
    @Required
    private Float x2;

    /**
     * Coordinate Y of the left upper corner
     */
    @SerializedName("y")
    @Required
    private Float y;

    /**
     * Coordinate Y of the right lower corner
     */
    @SerializedName("y2")
    @Required
    private Float y2;

    public Integer getDate() {
        return date;
    }

    public PhotoTag setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public PhotoTag setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public PhotoTag setPlacerId(Integer placerId) {
        this.placerId = placerId;
        return this;
    }

    public String getTaggedName() {
        return taggedName;
    }

    public PhotoTag setTaggedName(String taggedName) {
        this.taggedName = taggedName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PhotoTag setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PhotoTag setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public boolean isViewed() {
        return viewed == BoolInt.YES;
    }

    public BoolInt getViewed() {
        return viewed;
    }

    public Float getX() {
        return x;
    }

    public PhotoTag setX(Float x) {
        this.x = x;
        return this;
    }

    public Float getX2() {
        return x2;
    }

    public PhotoTag setX2(Float x2) {
        this.x2 = x2;
        return this;
    }

    public Float getY() {
        return y;
    }

    public PhotoTag setY(Float y) {
        this.y = y;
        return this;
    }

    public Float getY2() {
        return y2;
    }

    public PhotoTag setY2(Float y2) {
        this.y2 = y2;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, viewed, taggedName, x, description, y, y2, x2, id, placerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoTag photoTag = (PhotoTag) o;
        return Objects.equals(date, photoTag.date) &&
                Objects.equals(taggedName, photoTag.taggedName) &&
                Objects.equals(userId, photoTag.userId) &&
                Objects.equals(viewed, photoTag.viewed) &&
                Objects.equals(x, photoTag.x) &&
                Objects.equals(description, photoTag.description) &&
                Objects.equals(y, photoTag.y) &&
                Objects.equals(y2, photoTag.y2) &&
                Objects.equals(x2, photoTag.x2) &&
                Objects.equals(id, photoTag.id) &&
                Objects.equals(placerId, photoTag.placerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoTag{");
        sb.append("date=").append(date);
        sb.append(", taggedName='").append(taggedName).append("'");
        sb.append(", userId=").append(userId);
        sb.append(", viewed=").append(viewed);
        sb.append(", x=").append(x);
        sb.append(", description='").append(description).append("'");
        sb.append(", y=").append(y);
        sb.append(", y2=").append(y2);
        sb.append(", x2=").append(x2);
        sb.append(", id=").append(id);
        sb.append(", placerId=").append(placerId);
        sb.append('}');
        return sb.toString();
    }
}
