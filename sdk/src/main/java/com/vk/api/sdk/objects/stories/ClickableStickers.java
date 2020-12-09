package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * ClickableStickers object
 */
public class ClickableStickers implements Validable {
    @SerializedName("clickable_stickers")
    private List<ClickableSticker> clickableStickers;

    @SerializedName("original_height")
    private Integer originalHeight;

    @SerializedName("original_width")
    private Integer originalWidth;

    public List<ClickableSticker> getClickableStickers() {
        return clickableStickers;
    }

    public ClickableStickers setClickableStickers(List<ClickableSticker> clickableStickers) {
        this.clickableStickers = clickableStickers;
        return this;
    }

    public Integer getOriginalHeight() {
        return originalHeight;
    }

    public ClickableStickers setOriginalHeight(Integer originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }

    public Integer getOriginalWidth() {
        return originalWidth;
    }

    public ClickableStickers setOriginalWidth(Integer originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalHeight, clickableStickers, originalWidth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClickableStickers clickableStickers = (ClickableStickers) o;
        return Objects.equals(originalWidth, clickableStickers.originalWidth) &&
                Objects.equals(clickableStickers, clickableStickers.clickableStickers) &&
                Objects.equals(originalHeight, clickableStickers.originalHeight);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ClickableStickers{");
        sb.append("originalWidth=").append(originalWidth);
        sb.append(", clickableStickers=").append(clickableStickers);
        sb.append(", originalHeight=").append(originalHeight);
        sb.append('}');
        return sb.toString();
    }
}
