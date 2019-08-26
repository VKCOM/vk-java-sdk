package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.market.Price;
import java.util.Objects;

/**
 * LinkProduct object
 */
public class LinkProduct implements Validable {
    @SerializedName("price")
    @Required
    private Price price;

    @SerializedName("merchant")
    private String merchant;

    @SerializedName("orders_count")
    private Integer ordersCount;

    public Price getPrice() {
        return price;
    }

    public LinkProduct setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getMerchant() {
        return merchant;
    }

    public LinkProduct setMerchant(String merchant) {
        this.merchant = merchant;
        return this;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public LinkProduct setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersCount, price, merchant);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkProduct linkProduct = (LinkProduct) o;
        return Objects.equals(ordersCount, linkProduct.ordersCount) &&
                Objects.equals(price, linkProduct.price) &&
                Objects.equals(merchant, linkProduct.merchant);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkProduct{");
        sb.append("ordersCount=").append(ordersCount);
        sb.append(", price=").append(price);
        sb.append(", merchant='").append(merchant).append("'");
        sb.append('}');
        return sb.toString();
    }
}
