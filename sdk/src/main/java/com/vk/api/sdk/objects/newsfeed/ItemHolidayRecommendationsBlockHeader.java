package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Image;
import com.vk.api.sdk.objects.base.LinkButtonAction;
import java.util.List;
import java.util.Objects;

/**
 * ItemHolidayRecommendationsBlockHeader object
 */
public class ItemHolidayRecommendationsBlockHeader implements Validable {
    /**
     * Title of the header
     */
    @SerializedName("title")
    private String title;

    /**
     * Subtitle of the header
     */
    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("image")
    private List<Image> image;

    @SerializedName("action")
    private LinkButtonAction action;

    public String getTitle() {
        return title;
    }

    public ItemHolidayRecommendationsBlockHeader setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public ItemHolidayRecommendationsBlockHeader setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public List<Image> getImage() {
        return image;
    }

    public ItemHolidayRecommendationsBlockHeader setImage(List<Image> image) {
        this.image = image;
        return this;
    }

    public LinkButtonAction getAction() {
        return action;
    }

    public ItemHolidayRecommendationsBlockHeader setAction(LinkButtonAction action) {
        this.action = action;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, subtitle, action, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemHolidayRecommendationsBlockHeader itemHolidayRecommendationsBlockHeader = (ItemHolidayRecommendationsBlockHeader) o;
        return Objects.equals(image, itemHolidayRecommendationsBlockHeader.image) &&
                Objects.equals(subtitle, itemHolidayRecommendationsBlockHeader.subtitle) &&
                Objects.equals(action, itemHolidayRecommendationsBlockHeader.action) &&
                Objects.equals(title, itemHolidayRecommendationsBlockHeader.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemHolidayRecommendationsBlockHeader{");
        sb.append("image=").append(image);
        sb.append(", subtitle='").append(subtitle).append("'");
        sb.append(", action=").append(action);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
