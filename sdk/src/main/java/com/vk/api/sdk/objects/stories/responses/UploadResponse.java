package com.vk.api.sdk.objects.stories.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.stories.Story;
import java.util.Objects;

/**
 * UploadResponse object
 */
public class UploadResponse implements Validable {
    @SerializedName("story")
    @Required
    private Story story;

    public Story getStory() {
        return story;
    }

    public UploadResponse setStory(Story story) {
        this.story = story;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(story);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UploadResponse uploadResponse = (UploadResponse) o;
        return Objects.equals(story, uploadResponse.story);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UploadResponse{");
        sb.append("story=").append(story);
        sb.append('}');
        return sb.toString();
    }
}
