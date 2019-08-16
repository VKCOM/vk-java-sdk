package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.stories.Story;
import java.util.List;
import java.util.Objects;

/**
 * ItemStoriesBlock object
 */
public class ItemStoriesBlock extends ItemBase implements Validable {
    @SerializedName("block_type")
    private ItemStoriesBlockBlockType blockType;

    @SerializedName("stories")
    private List<Story> stories;

    @SerializedName("title")
    private String title;

    @SerializedName("track_code")
    private String trackCode;

    public ItemStoriesBlockBlockType getBlockType() {
        return blockType;
    }

    public ItemStoriesBlock setBlockType(ItemStoriesBlockBlockType blockType) {
        this.blockType = blockType;
        return this;
    }

    public List<Story> getStories() {
        return stories;
    }

    public ItemStoriesBlock setStories(List<Story> stories) {
        this.stories = stories;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ItemStoriesBlock setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public ItemStoriesBlock setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackCode, stories, blockType, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemStoriesBlock itemStoriesBlock = (ItemStoriesBlock) o;
        return Objects.equals(blockType, itemStoriesBlock.blockType) &&
                Objects.equals(stories, itemStoriesBlock.stories) &&
                Objects.equals(trackCode, itemStoriesBlock.trackCode) &&
                Objects.equals(title, itemStoriesBlock.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemStoriesBlock{");
        sb.append("blockType='").append(blockType).append("'");
        sb.append(", stories=").append(stories);
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
