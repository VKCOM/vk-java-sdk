package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * MarketItem object
 */
public class MarketItem {
    /**
     * Item ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Item owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Item title
     */
    @SerializedName("title")
    private String title;

    /**
     * Item description
     */
    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private Price price;

    @SerializedName("category")
    private MarketCategory category;

    /**
     * Date when the item has been created in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * URL of the preview image
     */
    @SerializedName("thumb_photo")
    private String thumbPhoto;

    /**
     * Information whether the item is available
     */
    @SerializedName("availability")
    private MarketItemAvailability availability;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }

    public MarketCategory getCategory() {
        return category;
    }

    public Integer getDate() {
        return date;
    }

    public String getThumbPhoto() {
        return thumbPhoto;
    }

    public MarketItemAvailability getAvailability() {
        return availability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, thumbPhoto, price, description, id, availability, ownerId, title, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketItem marketItem = (MarketItem) o;
        return Objects.equals(id, marketItem.id) &&
                Objects.equals(ownerId, marketItem.ownerId) &&
                Objects.equals(title, marketItem.title) &&
                Objects.equals(description, marketItem.description) &&
                Objects.equals(price, marketItem.price) &&
                Objects.equals(category, marketItem.category) &&
                Objects.equals(date, marketItem.date) &&
                Objects.equals(thumbPhoto, marketItem.thumbPhoto) &&
                Objects.equals(availability, marketItem.availability);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketItem{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", price=").append(price);
        sb.append(", category=").append(category);
        sb.append(", date=").append(date);
        sb.append(", thumbPhoto='").append(thumbPhoto).append("'");
        sb.append(", availability=").append(availability);
        sb.append('}');
        return sb.toString();
    }
}
