package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemDigestButton object
 */
public class ItemDigestButton implements Validable {
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("style")
    private ItemDigestButtonStyle style;

    public String getTitle() {
        return title;
    }

    public ItemDigestButton setTitle(String title) {
        this.title = title;
        return this;
    }

    public ItemDigestButtonStyle getStyle() {
        return style;
    }

    public ItemDigestButton setStyle(ItemDigestButtonStyle style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(style, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigestButton itemDigestButton = (ItemDigestButton) o;
        return Objects.equals(style, itemDigestButton.style) &&
                Objects.equals(title, itemDigestButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestButton{");
        sb.append("style='").append(style).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
