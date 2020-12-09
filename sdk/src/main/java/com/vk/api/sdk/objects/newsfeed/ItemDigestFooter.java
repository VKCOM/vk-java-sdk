package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemDigestFooter object
 */
public class ItemDigestFooter implements Validable {
    @SerializedName("style")
    @Required
    private ItemDigestFooterStyle style;

    /**
     * text for invite to enable smart feed
     */
    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("button")
    private ItemDigestButton button;

    public ItemDigestFooterStyle getStyle() {
        return style;
    }

    public ItemDigestFooter setStyle(ItemDigestFooterStyle style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return text;
    }

    public ItemDigestFooter setText(String text) {
        this.text = text;
        return this;
    }

    public ItemDigestButton getButton() {
        return button;
    }

    public ItemDigestFooter setButton(ItemDigestButton button) {
        this.button = button;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, style, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigestFooter itemDigestFooter = (ItemDigestFooter) o;
        return Objects.equals(button, itemDigestFooter.button) &&
                Objects.equals(style, itemDigestFooter.style) &&
                Objects.equals(text, itemDigestFooter.text);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestFooter{");
        sb.append("button=").append(button);
        sb.append(", style='").append(style).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
