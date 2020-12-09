package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * MarketItem object
 */
public class MarketItem implements Validable {
    /**
     * Access key for the market item
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("availability")
    @Required
    private MarketItemAvailability availability;

    /**
     * Title for button for url
     */
    @SerializedName("button_title")
    private String buttonTitle;

    @SerializedName("category")
    @Required
    private MarketCategory category;

    /**
     * Date when the item has been created in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Item description
     */
    @SerializedName("description")
    @Required
    private String description;

    @SerializedName("external_id")
    private String externalId;

    /**
     * Item ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Item owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("price")
    @Required
    private Price price;

    /**
     * URL of the preview image
     */
    @SerializedName("thumb_photo")
    private URI thumbPhoto;

    /**
     * Item title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * URL to item
     */
    @SerializedName("url")
    private URI url;

    @SerializedName("variants_grouping_id")
    private Integer variantsGroupingId;

    @SerializedName("is_main_variant")
    private Boolean isMainVariant;

    public String getAccessKey() {
        return accessKey;
    }

    public MarketItem setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public MarketItemAvailability getAvailability() {
        return availability;
    }

    public MarketItem setAvailability(MarketItemAvailability availability) {
        this.availability = availability;
        return this;
    }

    public String getButtonTitle() {
        return buttonTitle;
    }

    public MarketItem setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    public MarketCategory getCategory() {
        return category;
    }

    public MarketItem setCategory(MarketCategory category) {
        this.category = category;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public MarketItem setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MarketItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public MarketItem setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public MarketItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public MarketItem setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public MarketItem setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public MarketItem setPrice(Price price) {
        this.price = price;
        return this;
    }

    public URI getThumbPhoto() {
        return thumbPhoto;
    }

    public MarketItem setThumbPhoto(URI thumbPhoto) {
        this.thumbPhoto = thumbPhoto;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MarketItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public MarketItem setUrl(URI url) {
        this.url = url;
        return this;
    }

    public Integer getVariantsGroupingId() {
        return variantsGroupingId;
    }

    public MarketItem setVariantsGroupingId(Integer variantsGroupingId) {
        this.variantsGroupingId = variantsGroupingId;
        return this;
    }

    public Boolean getIsMainVariant() {
        return isMainVariant;
    }

    public MarketItem setIsMainVariant(Boolean isMainVariant) {
        this.isMainVariant = isMainVariant;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, variantsGroupingId, thumbPhoto, buttonTitle, description, externalId, availability, ownerId, title, url, isMainVariant, accessKey, price, id, category, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketItem marketItem = (MarketItem) o;
        return Objects.equals(date, marketItem.date) &&
                Objects.equals(isFavorite, marketItem.isFavorite) &&
                Objects.equals(ownerId, marketItem.ownerId) &&
                Objects.equals(description, marketItem.description) &&
                Objects.equals(externalId, marketItem.externalId) &&
                Objects.equals(isMainVariant, marketItem.isMainVariant) &&
                Objects.equals(availability, marketItem.availability) &&
                Objects.equals(title, marketItem.title) &&
                Objects.equals(url, marketItem.url) &&
                Objects.equals(thumbPhoto, marketItem.thumbPhoto) &&
                Objects.equals(variantsGroupingId, marketItem.variantsGroupingId) &&
                Objects.equals(price, marketItem.price) &&
                Objects.equals(accessKey, marketItem.accessKey) &&
                Objects.equals(buttonTitle, marketItem.buttonTitle) &&
                Objects.equals(id, marketItem.id) &&
                Objects.equals(category, marketItem.category);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketItem{");
        sb.append("date=").append(date);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", description='").append(description).append("'");
        sb.append(", externalId='").append(externalId).append("'");
        sb.append(", isMainVariant=").append(isMainVariant);
        sb.append(", availability=").append(availability);
        sb.append(", title='").append(title).append("'");
        sb.append(", url=").append(url);
        sb.append(", thumbPhoto=").append(thumbPhoto);
        sb.append(", variantsGroupingId=").append(variantsGroupingId);
        sb.append(", price=").append(price);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", buttonTitle='").append(buttonTitle).append("'");
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append('}');
        return sb.toString();
    }
}
