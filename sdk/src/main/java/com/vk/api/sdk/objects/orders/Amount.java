package com.vk.api.sdk.objects.orders;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Amount object
 */
public class Amount {

    @SerializedName("amounts")
    private List<AmountItem> amounts;

    @SerializedName("currency")
    private String currency;

    public List<AmountItem> getAmounts() {
        return amounts;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return Objects.equals(amounts, amount.amounts) &&
                Objects.equals(currency, amount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amounts, currency);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Amount{");
        sb.append("amounts=").append(amounts);
        sb.append(", currency='").append(currency).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
