package com.vk.api.sdk.objects.wall.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.CommentsInfo;
import com.vk.api.sdk.objects.wall.Wallpost;
import com.vk.api.sdk.objects.wall.WallpostDonut;
import java.util.List;
import java.util.Objects;

/**
 * GetByIdLegacyResponse object
 */
public class GetByIdLegacyResponse extends Wallpost implements Validable {
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

    public GetByIdLegacyResponse setCopyHistory(List<Wallpost> copyHistory) {
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

    public GetByIdLegacyResponse setCreatedBy(Integer createdBy) {
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

    public GetByIdLegacyResponse setDonut(WallpostDonut donut) {
        this.donut = donut;
        return this;
    }

    public Integer getIsPinned() {
        return isPinned;
    }

    public GetByIdLegacyResponse setIsPinned(Integer isPinned) {
        this.isPinned = isPinned;
        return this;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public GetByIdLegacyResponse setComments(CommentsInfo comments) {
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

    public GetByIdLegacyResponse setShortTextRate(Float shortTextRate) {
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
        GetByIdLegacyResponse getByIdLegacyResponse = (GetByIdLegacyResponse) o;
        return Objects.equals(shortTextRate, getByIdLegacyResponse.shortTextRate) &&
                Objects.equals(comments, getByIdLegacyResponse.comments) &&
                Objects.equals(canDelete, getByIdLegacyResponse.canDelete) &&
                Objects.equals(donut, getByIdLegacyResponse.donut) &&
                Objects.equals(canEdit, getByIdLegacyResponse.canEdit) &&
                Objects.equals(markedAsAds, getByIdLegacyResponse.markedAsAds) &&
                Objects.equals(createdBy, getByIdLegacyResponse.createdBy) &&
                Objects.equals(copyHistory, getByIdLegacyResponse.copyHistory) &&
                Objects.equals(canPin, getByIdLegacyResponse.canPin) &&
                Objects.equals(isPinned, getByIdLegacyResponse.isPinned);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdLegacyResponse{");
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
