package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * ItemDigest object
 */
public class ItemDigest extends ItemBase implements Validable {
    /**
     * id of feed in digest
     */
    @SerializedName("feed_id")
    private String feedId;

    @SerializedName("items")
    private List<ItemDigestItem> items;

    @SerializedName("main_post_ids")
    private List<String> mainPostIds;

    /**
     * type of digest
     */
    @SerializedName("template")
    private ItemDigestTemplate template;

    @SerializedName("header")
    private ItemDigestHeader header;

    @SerializedName("footer")
    private ItemDigestFooter footer;

    @SerializedName("track_code")
    private String trackCode;

    public String getFeedId() {
        return feedId;
    }

    public ItemDigest setFeedId(String feedId) {
        this.feedId = feedId;
        return this;
    }

    public List<ItemDigestItem> getItems() {
        return items;
    }

    public ItemDigest setItems(List<ItemDigestItem> items) {
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

    public ItemDigestHeader getHeader() {
        return header;
    }

    public ItemDigest setHeader(ItemDigestHeader header) {
        this.header = header;
        return this;
    }

    public ItemDigestFooter getFooter() {
        return footer;
    }

    public ItemDigest setFooter(ItemDigestFooter footer) {
        this.footer = footer;
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
        return Objects.hash(template, trackCode, mainPostIds, footer, feedId, header, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigest itemDigest = (ItemDigest) o;
        return Objects.equals(template, itemDigest.template) &&
                Objects.equals(mainPostIds, itemDigest.mainPostIds) &&
                Objects.equals(footer, itemDigest.footer) &&
                Objects.equals(header, itemDigest.header) &&
                Objects.equals(trackCode, itemDigest.trackCode) &&
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
        sb.append(", footer=").append(footer);
        sb.append(", header=").append(header);
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", items=").append(items);
        sb.append(", feedId='").append(feedId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
