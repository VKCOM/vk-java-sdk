package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemDigestFooterButton object
 */
public class ItemDigestFooterButton implements Validable {
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("style")
    @Required
    private ItemDigestFooterButtonStyle style;

    public String getTitle() {
        return title;
    }

    public ItemDigestFooterButton setTitle(String title) {
        this.title = title;
        return this;
    }

    public ItemDigestFooterButtonStyle getStyle() {
        return style;
    }

    public ItemDigestFooterButton setStyle(ItemDigestFooterButtonStyle style) {
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
        ItemDigestFooterButton itemDigestFooterButton = (ItemDigestFooterButton) o;
        return Objects.equals(style, itemDigestFooterButton.style) &&
                Objects.equals(title, itemDigestFooterButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestFooterButton{");
        sb.append("style='").append(style).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
