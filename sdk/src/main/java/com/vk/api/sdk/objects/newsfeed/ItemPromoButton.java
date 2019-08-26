package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * ItemPromoButton object
 */
public class ItemPromoButton extends ItemBase implements Validable {
    @SerializedName("text")
    private String text;

    @SerializedName("title")
    private String title;

    @SerializedName("action")
    private ItemPromoButtonAction action;

    @SerializedName("images")
    private List<ItemPromoButtonImage> images;

    @SerializedName("track_code")
    private String trackCode;

    public String getText() {
        return text;
    }

    public ItemPromoButton setText(String text) {
        this.text = text;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ItemPromoButton setTitle(String title) {
        this.title = title;
        return this;
    }

    public ItemPromoButtonAction getAction() {
        return action;
    }

    public ItemPromoButton setAction(ItemPromoButtonAction action) {
        this.action = action;
        return this;
    }

    public List<ItemPromoButtonImage> getImages() {
        return images;
    }

    public ItemPromoButton setImages(List<ItemPromoButtonImage> images) {
        this.images = images;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public ItemPromoButton setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackCode, images, action, text, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPromoButton itemPromoButton = (ItemPromoButton) o;
        return Objects.equals(images, itemPromoButton.images) &&
                Objects.equals(action, itemPromoButton.action) &&
                Objects.equals(trackCode, itemPromoButton.trackCode) &&
                Objects.equals(text, itemPromoButton.text) &&
                Objects.equals(title, itemPromoButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemPromoButton{");
        sb.append("images=").append(images);
        sb.append(", action=").append(action);
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
