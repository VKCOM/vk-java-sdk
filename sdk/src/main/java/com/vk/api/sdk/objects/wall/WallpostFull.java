package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.CommentsInfo;
import java.util.List;
import java.util.Objects;

/**
 * WallpostFull object
 */
public class WallpostFull extends Wallpost implements Validable {
    @SerializedName("copy_history")
    private List<Wallpost> copyHistory;

    /**
     * Information whether current user can edit the post
     */
    @SerializedName("can_edit")
    private BoolInt canEdit;

    /**
     * Post creator ID (if post still can be edited)
     */
    @SerializedName("created_by")
    private Integer createdBy;

    /**
     * Information whether current user can delete the post
     */
    @SerializedName("can_delete")
    private BoolInt canDelete;

    /**
     * Information whether current user can pin the post
     */
    @SerializedName("can_pin")
    private BoolInt canPin;

    @SerializedName("donut")
    private WallpostDonut donut;

    /**
     * Information whether the post is pinned
     */
    @SerializedName("is_pinned")
    private Integer isPinned;

    @SerializedName("comments")
    private CommentsInfo comments;

    /**
     * Information whether the post is marked as ads
     */
    @SerializedName("marked_as_ads")
    private BoolInt markedAsAds;

    /**
     * Preview length control parameter
     */
    @SerializedName("short_text_rate")
    private Float shortTextRate;

    public List<Wallpost> getCopyHistory() {
        return copyHistory;
    }

    public WallpostFull setCopyHistory(List<Wallpost> copyHistory) {
        this.copyHistory = copyHistory;
        return this;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public WallpostFull setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public boolean canDelete() {
        return canDelete == BoolInt.YES;
    }

    public BoolInt getCanDelete() {
        return canDelete;
    }

    public boolean canPin() {
        return canPin == BoolInt.YES;
    }

    public BoolInt getCanPin() {
        return canPin;
    }

    public WallpostDonut getDonut() {
        return donut;
    }

    public WallpostFull setDonut(WallpostDonut donut) {
        this.donut = donut;
        return this;
    }

    public Integer getIsPinned() {
        return isPinned;
    }

    public WallpostFull setIsPinned(Integer isPinned) {
        this.isPinned = isPinned;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public WallpostFull setComments(CommentsInfo comments) {
        this.comments = comments;
        return this;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds == BoolInt.YES;
    }

    public BoolInt getMarkedAsAds() {
        return markedAsAds;
    }

    public Float getShortTextRate() {
        return shortTextRate;
    }

    public WallpostFull setShortTextRate(Float shortTextRate) {
        this.shortTextRate = shortTextRate;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, createdBy, isPinned, shortTextRate, donut, canEdit, canDelete, markedAsAds, canPin, copyHistory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostFull wallpostFull = (WallpostFull) o;
        return Objects.equals(shortTextRate, wallpostFull.shortTextRate) &&
                Objects.equals(comments, wallpostFull.comments) &&
                Objects.equals(canDelete, wallpostFull.canDelete) &&
                Objects.equals(donut, wallpostFull.donut) &&
                Objects.equals(canEdit, wallpostFull.canEdit) &&
                Objects.equals(markedAsAds, wallpostFull.markedAsAds) &&
                Objects.equals(createdBy, wallpostFull.createdBy) &&
                Objects.equals(copyHistory, wallpostFull.copyHistory) &&
                Objects.equals(canPin, wallpostFull.canPin) &&
                Objects.equals(isPinned, wallpostFull.isPinned);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostFull{");
        sb.append("shortTextRate=").append(shortTextRate);
        sb.append(", comments=").append(comments);
        sb.append(", canDelete=").append(canDelete);
        sb.append(", donut=").append(donut);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", markedAsAds=").append(markedAsAds);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", copyHistory=").append(copyHistory);
        sb.append(", canPin=").append(canPin);
        sb.append(", isPinned=").append(isPinned);
        sb.append('}');
        return sb.toString();
    }
}
