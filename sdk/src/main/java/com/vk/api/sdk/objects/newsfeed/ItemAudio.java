package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ItemAudio object
 */
public class ItemAudio {
    @SerializedName("audio")
    private JsonObject audio;

    public JsonObject getAudio() {
        return audio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(audio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAudio itemAudio = (ItemAudio) o;
        return Objects.equals(audio, itemAudio.audio);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemAudio{");
        sb.append("audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }
}
