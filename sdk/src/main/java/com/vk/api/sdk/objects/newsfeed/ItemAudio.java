package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemAudio object
 */
public class ItemAudio extends ItemBase implements Validable {
    @SerializedName("audio")
    private ItemAudioAudio audio;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    public ItemAudioAudio getAudio() {
        return audio;
    }

    public ItemAudio setAudio(ItemAudioAudio audio) {
        this.audio = audio;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ItemAudio setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, audio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAudio itemAudio = (ItemAudio) o;
        return Objects.equals(postId, itemAudio.postId) &&
                Objects.equals(audio, itemAudio.audio);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemAudio{");
        sb.append("postId=").append(postId);
        sb.append(", audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }
}
