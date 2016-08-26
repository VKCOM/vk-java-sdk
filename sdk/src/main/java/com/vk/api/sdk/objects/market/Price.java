package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Price object
 */
public class Price {
    /**
     * Amount
     */
    @SerializedName("amount")
    private String amount;

    @SerializedName("currency")
    private Currency currency;

    /**
     * Text
     */
    @SerializedName("text")
    private String text;

    public String getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount) &&
                Objects.equals(currency, price.currency) &&
                Objects.equals(text, price.text);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Price{");
        sb.append("amount='").append(amount).append("'");
        sb.append(", currency=").append(currency);
        sb.append(", text='").append(text).append("'");
        sb.append('}');
        return sb.toString();
    }
}
