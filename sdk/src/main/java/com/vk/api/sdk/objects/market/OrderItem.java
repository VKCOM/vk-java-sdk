package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.util.List;
import java.util.Objects;

/**
 * OrderItem object
 */
public class OrderItem implements Validable {
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("item_id")
    private Integer itemId;

    @SerializedName("price")
    @Required
    private Price price;

    @SerializedName("quantity")
    @Required
    private Integer quantity;

    @SerializedName("item")
    @Required
    private MarketItem item;

    @SerializedName("title")
    private String title;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("variants")
    private List<String> variants;

    public Integer getOwnerId() {
        return ownerId;
    }

    public OrderItem setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getItemId() {
        return itemId;
    }

    public OrderItem setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public OrderItem setPrice(Price price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public MarketItem getItem() {
        return item;
    }

    public OrderItem setItem(MarketItem item) {
        this.item = item;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OrderItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public OrderItem setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public List<String> getVariants() {
        return variants;
    }

    public OrderItem setVariants(List<String> variants) {
        this.variants = variants;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, item, quantity, price, photo, variants, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(item, orderItem.item) &&
                Objects.equals(quantity, orderItem.quantity) &&
                Objects.equals(itemId, orderItem.itemId) &&
                Objects.equals(ownerId, orderItem.ownerId) &&
                Objects.equals(price, orderItem.price) &&
                Objects.equals(photo, orderItem.photo) &&
                Objects.equals(variants, orderItem.variants) &&
                Objects.equals(title, orderItem.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OrderItem{");
        sb.append("item=").append(item);
        sb.append(", quantity=").append(quantity);
        sb.append(", itemId=").append(itemId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", price=").append(price);
        sb.append(", photo=").append(photo);
        sb.append(", variants='").append(variants).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
