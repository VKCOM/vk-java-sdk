package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.wall.Wallpost;
import java.util.List;
import java.util.Objects;

/**
 * ItemDigest object
 */
public class ItemDigest extends ItemBase implements Validable {
    @SerializedName("button_text")
    private String buttonText;

    /**
     * id of feed in digest
     */
    @SerializedName("feed_id")
    private String feedId;

    @SerializedName("items")
    private List<Wallpost> items;

    @SerializedName("main_post_ids")
    private List<String> mainPostIds;

    /**
     * type of digest
     */
    @SerializedName("template")
    private ItemDigestTemplate template;

    @SerializedName("title")
    private String title;

    @SerializedName("track_code")
    private String trackCode;

    public String getButtonText() {
        return buttonText;
    }

    public ItemDigest setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public String getFeedId() {
        return feedId;
    }

    public ItemDigest setFeedId(String feedId) {
        this.feedId = feedId;
        return this;
    }

    public List<Wallpost> getItems() {
        return items;
    }

    public ItemDigest setItems(List<Wallpost> items) {
        this.items = items;
        return this;
    }

    public List<String> getMainPostIds() {
        return mainPostIds;
    }

    public ItemDigest setMainPostIds(List<String> mainPostIds) {
        this.mainPostIds = mainPostIds;
        return this;
    }

    public ItemDigestTemplate getTemplate() {
        return template;
    }

    public ItemDigest setTemplate(ItemDigestTemplate template) {
        this.template = template;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ItemDigest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public ItemDigest setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(template, trackCode, buttonText, mainPostIds, feedId, title, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigest itemDigest = (ItemDigest) o;
        return Objects.equals(template, itemDigest.template) &&
                Objects.equals(mainPostIds, itemDigest.mainPostIds) &&
                Objects.equals(trackCode, itemDigest.trackCode) &&
                Objects.equals(buttonText, itemDigest.buttonText) &&
                Objects.equals(title, itemDigest.title) &&
                Objects.equals(items, itemDigest.items) &&
                Objects.equals(feedId, itemDigest.feedId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigest{");
        sb.append("template='").append(template).append("'");
        sb.append(", mainPostIds='").append(mainPostIds).append("'");
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", buttonText='").append(buttonText).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", items=").append(items);
        sb.append(", feedId='").append(feedId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
