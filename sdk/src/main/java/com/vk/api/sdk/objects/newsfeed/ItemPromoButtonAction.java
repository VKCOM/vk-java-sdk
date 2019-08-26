package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemPromoButtonAction object
 */
public class ItemPromoButtonAction implements Validable {
    @SerializedName("url")
    private String url;

    @SerializedName("type")
    private String type;

    @SerializedName("target")
    private String target;

    public String getUrl() {
        return url;
    }

    public ItemPromoButtonAction setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getType() {
        return type;
    }

    public ItemPromoButtonAction setType(String type) {
        this.type = type;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public ItemPromoButtonAction setTarget(String target) {
        this.target = target;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url, target);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPromoButtonAction itemPromoButtonAction = (ItemPromoButtonAction) o;
        return Objects.equals(type, itemPromoButtonAction.type) &&
                Objects.equals(url, itemPromoButtonAction.url) &&
                Objects.equals(target, itemPromoButtonAction.target);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemPromoButtonAction{");
        sb.append("type='").append(type).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", target='").append(target).append("'");
        sb.append('}');
        return sb.toString();
    }
}
