package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.market.Order;
import java.util.Objects;

/**
 * GetOrderByIdResponse object
 */
public class GetOrderByIdResponse implements Validable {
    @SerializedName("order")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public GetOrderByIdResponse setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrderByIdResponse getOrderByIdResponse = (GetOrderByIdResponse) o;
        return Objects.equals(order, getOrderByIdResponse.order);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetOrderByIdResponse{");
        sb.append("order=").append(order);
        sb.append('}');
        return sb.toString();
    }
}
