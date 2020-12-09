package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Info about paid wall post
 */
public class WallpostDonut implements Validable {
    /**
     * Post only for dons
     */
    @SerializedName("is_donut")
    private Boolean isDonut;

    /**
     * Value of this field need to pass in wall.post/edit in donut_paid_duration
     */
    @SerializedName("paid_duration")
    private Integer paidDuration;

    /**
     * If placeholder was respond, text and all attachments will be hidden
     */
    @SerializedName("placeholder")
    private WallpostDonutPlaceholder placeholder;

    /**
     * Says whether group admin can post free copy of this donut post
     */
    @SerializedName("can_publish_free_copy")
    private Boolean canPublishFreeCopy;

    /**
     * Says what user can edit in post about donut properties
     */
    @SerializedName("edit_mode")
    private WallpostDonutEditMode editMode;

    public Boolean getIsDonut() {
        return isDonut;
    }

    public WallpostDonut setIsDonut(Boolean isDonut) {
        this.isDonut = isDonut;
        return this;
    }

    public Integer getPaidDuration() {
        return paidDuration;
    }

    public WallpostDonut setPaidDuration(Integer paidDuration) {
        this.paidDuration = paidDuration;
        return this;
    }

    public WallpostDonutPlaceholder getPlaceholder() {
        return placeholder;
    }

    public WallpostDonut setPlaceholder(WallpostDonutPlaceholder placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public Boolean getCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public WallpostDonut setCanPublishFreeCopy(Boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
        return this;
    }

    public WallpostDonutEditMode getEditMode() {
        return editMode;
    }

    public WallpostDonut setEditMode(WallpostDonutEditMode editMode) {
        this.editMode = editMode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDonut, editMode, canPublishFreeCopy, paidDuration, placeholder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostDonut wallpostDonut = (WallpostDonut) o;
        return Objects.equals(isDonut, wallpostDonut.isDonut) &&
                Objects.equals(placeholder, wallpostDonut.placeholder) &&
                Objects.equals(editMode, wallpostDonut.editMode) &&
                Objects.equals(canPublishFreeCopy, wallpostDonut.canPublishFreeCopy) &&
                Objects.equals(paidDuration, wallpostDonut.paidDuration);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostDonut{");
        sb.append("isDonut=").append(isDonut);
        sb.append(", placeholder=").append(placeholder);
        sb.append(", editMode='").append(editMode).append("'");
        sb.append(", canPublishFreeCopy=").append(canPublishFreeCopy);
        sb.append(", paidDuration=").append(paidDuration);
        sb.append('}');
        return sb.toString();
    }
}
