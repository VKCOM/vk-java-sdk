package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemWallpostFeedbackAnswer object
 */
public class ItemWallpostFeedbackAnswer implements Validable {
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("id")
    @Required
    private String id;

    public String getTitle() {
        return title;
    }

    public ItemWallpostFeedbackAnswer setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getId() {
        return id;
    }

    public ItemWallpostFeedbackAnswer setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemWallpostFeedbackAnswer itemWallpostFeedbackAnswer = (ItemWallpostFeedbackAnswer) o;
        return Objects.equals(id, itemWallpostFeedbackAnswer.id) &&
                Objects.equals(title, itemWallpostFeedbackAnswer.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemWallpostFeedbackAnswer{");
        sb.append("id='").append(id).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
