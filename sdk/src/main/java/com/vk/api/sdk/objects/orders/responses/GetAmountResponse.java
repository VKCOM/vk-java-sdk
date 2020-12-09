package com.vk.api.sdk.objects.orders.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.orders.AmountItem;
import java.util.List;
import java.util.Objects;

/**
 * GetAmountResponse object
 */
public class GetAmountResponse implements Validable {
    @SerializedName("amounts")
    private List<AmountItem> amounts;

    /**
     * Currency name
     */
    @SerializedName("currency")
    private String currency;

    public List<AmountItem> getAmounts() {
        return amounts;
    }

    public GetAmountResponse setAmounts(List<AmountItem> amounts) {
        this.amounts = amounts;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public GetAmountResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amounts, currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAmountResponse getAmountResponse = (GetAmountResponse) o;
        return Objects.equals(amounts, getAmountResponse.amounts) &&
                Objects.equals(currency, getAmountResponse.currency);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAmountResponse{");
        sb.append("amounts=").append(amounts);
        sb.append(", currency='").append(currency).append("'");
        sb.append('}');
        return sb.toString();
    }
}
