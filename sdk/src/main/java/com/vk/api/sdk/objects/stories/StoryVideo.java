package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.video.Video;

import java.util.Objects;

public class StoryVideo extends Video {

    @SerializedName("first_frame_800")
    private String firstFrame800;

    @SerializedName("first_frame_320")
    private String firstFrame320;

    @SerializedName("first_frame_160")
    private String firstFrame160;

    @SerializedName("first_frame_130")
    private String firstFrame130;

    @SerializedName("is_private")
    private BoolInt isPrivate;

    public String getFirstFrame800() {
        return firstFrame800;
    }

    public String getFirstFrame320() {
        return firstFrame320;
    }

    public String getFirstFrame160() {
        return firstFrame160;
    }

    public String getFirstFrame130() {
        return firstFrame130;
    }

    public boolean isPrivate() {
        return isPrivate == BoolInt.YES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StoryVideo that = (StoryVideo) o;
        return Objects.equals(firstFrame800, that.firstFrame800) &&
            Objects.equals(firstFrame320, that.firstFrame320) &&
            Objects.equals(firstFrame160, that.firstFrame160) &&
            Objects.equals(firstFrame130, that.firstFrame130) &&
            isPrivate == that.isPrivate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstFrame800, firstFrame320, firstFrame160, firstFrame130, isPrivate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoryVideo{");
        sb.append("id=").append(getId());
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", title='").append(getTitle()).append("'");
        sb.append(", duration=").append(getDuration());
        sb.append(", description='").append(getDescription()).append("'");
        sb.append(", date=").append(getDate());
        sb.append(", views=").append(getViews());
        sb.append(", comments=").append(getComments());
        sb.append(", photo130='").append(getPhoto130()).append("'");
        sb.append(", photo320='").append(getPhoto320()).append("'");
        sb.append(", photo800='").append(getPhoto800()).append("'");
        sb.append(", accessKey='").append(getAccessKey()).append("'");
        sb.append(", addingDate=").append(getAddingDate());
        sb.append(", player='").append(getPlayer()).append("'");
        sb.append(", canEdit=").append(canEdit());
        sb.append(", canAdd=").append(canAdd());
        sb.append(", processing=").append(isProcessing());
        sb.append(", live=").append(isLive());
        sb.append(", files=").append(getFiles());
        sb.append(", firstFrame800='").append(firstFrame800).append('\'');
        sb.append(", firstFrame320='").append(firstFrame320).append('\'');
        sb.append(", firstFrame160='").append(firstFrame160).append('\'');
        sb.append(", firstFrame130='").append(firstFrame130).append('\'');
        sb.append(", isPrivate=").append(isPrivate);
        sb.append('}');
        return sb.toString();
    }
}
