package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Additional data for promo stories
 */
public class PromoBlock implements Validable {
    /**
     * Promo story title
     */
    @SerializedName("name")
    private String name;

    /**
     * RL of square photo of the story with 50 pixels in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * RL of square photo of the story with 100 pixels in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * Hide animation for promo story
     */
    @SerializedName("not_animated")
    private Boolean notAnimated;

    public String getName() {
        return name;
    }

    public PromoBlock setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto50() {
        return photo50;
    }

    public PromoBlock setPhoto50(String photo50) {
        this.photo50 = photo50;
        return this;
    }

    public String getPhoto100() {
        return photo100;
    }

    public PromoBlock setPhoto100(String photo100) {
        this.photo100 = photo100;
        return this;
    }

    public Boolean getNotAnimated() {
        return notAnimated;
    }

    public PromoBlock setNotAnimated(Boolean notAnimated) {
        this.notAnimated = notAnimated;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, notAnimated, name, photo50);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromoBlock promoBlock = (PromoBlock) o;
        return Objects.equals(photo50, promoBlock.photo50) &&
                Objects.equals(name, promoBlock.name) &&
                Objects.equals(notAnimated, promoBlock.notAnimated) &&
                Objects.equals(photo100, promoBlock.photo100);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PromoBlock{");
        sb.append("photo50='").append(photo50).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", notAnimated=").append(notAnimated);
        sb.append(", photo100='").append(photo100).append("'");
        sb.append('}');
        return sb.toString();
    }
}
