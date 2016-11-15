package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ItemAudio object
 */
public class ItemAudio {

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

    public Integer getPostId() {
        return postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAudio itemAudio = (ItemAudio) o;
        return Objects.equals(audio, itemAudio.audio) &&
                Objects.equals(postId, itemAudio.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audio, postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemAudio{");
        sb.append("audio=").append(audio);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
