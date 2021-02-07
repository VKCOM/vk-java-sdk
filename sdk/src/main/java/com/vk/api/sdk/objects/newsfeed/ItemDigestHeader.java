package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemDigestHeader object
 */
public class ItemDigestHeader implements Validable {
    /**
     * Title of the header
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Subtitle of the header, when title have two strings
     */
    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("style")
    @Required
    private ItemDigestHeaderStyle style;

    @SerializedName("button")
    private ItemDigestButton button;

    public String getTitle() {
        return title;
    }

    public ItemDigestHeader setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public ItemDigestHeader setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ItemDigestHeaderStyle getStyle() {
        return style;
    }

    public ItemDigestHeader setStyle(ItemDigestHeaderStyle style) {
        this.style = style;
        return this;
    }

    public ItemDigestButton getButton() {
        return button;
    }

    public ItemDigestHeader setButton(ItemDigestButton button) {
        this.button = button;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, subtitle, style, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigestHeader itemDigestHeader = (ItemDigestHeader) o;
        return Objects.equals(button, itemDigestHeader.button) &&
                Objects.equals(subtitle, itemDigestHeader.subtitle) &&
                Objects.equals(style, itemDigestHeader.style) &&
                Objects.equals(title, itemDigestHeader.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestHeader{");
        sb.append("button=").append(button);
        sb.append(", subtitle='").append(subtitle).append("'");
        sb.append(", style='").append(style).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
