package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.audio.Audio;
import java.util.List;
import java.util.Objects;

/**
 * ItemAudioAudio object
 */
public class ItemAudioAudio implements Validable {
    /**
     * Audios number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Audio> items;

    public Integer getCount() {
        return count;
    }

    public ItemAudioAudio setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Audio> getItems() {
        return items;
    }

    public ItemAudioAudio setItems(List<Audio> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAudioAudio itemAudioAudio = (ItemAudioAudio) o;
        return Objects.equals(count, itemAudioAudio.count) &&
                Objects.equals(items, itemAudioAudio.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemAudioAudio{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
