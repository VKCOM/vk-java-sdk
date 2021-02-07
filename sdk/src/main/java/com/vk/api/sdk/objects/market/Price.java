package com.vk.api.sdk.objects.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Price object
 */
public class Price implements Validable {
    /**
     * Amount
     */
    @SerializedName("amount")
    private String amount;

    @SerializedName("currency")
    private Currency currency;

    @SerializedName("discount_rate")
    private Integer discountRate;

    @SerializedName("old_amount")
    private String oldAmount;

    /**
     * Text
     */
    @SerializedName("text")
    private String text;

    /**
     * Textual representation of old price
     */
    @SerializedName("old_amount_text")
    private String oldAmountText;

    public String getAmount() {
        return amount;
    }

    public Price setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Price setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Integer getDiscountRate() {
        return discountRate;
    }

    public Price setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public String getOldAmount() {
        return oldAmount;
    }

    public Price setOldAmount(String oldAmount) {
        this.oldAmount = oldAmount;
        return this;
    }

    public String getText() {
        return text;
    }

    public Price setText(String text) {
        this.text = text;
        return this;
    }

    public String getOldAmountText() {
        return oldAmountText;
    }

    public Price setOldAmountText(String oldAmountText) {
        this.oldAmountText = oldAmountText;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountRate, amount, oldAmount, oldAmountText, currency, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount) &&
                Objects.equals(oldAmount, price.oldAmount) &&
                Objects.equals(currency, price.currency) &&
                Objects.equals(text, price.text) &&
                Objects.equals(discountRate, price.discountRate) &&
                Objects.equals(oldAmountText, price.oldAmountText);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Price{");
        sb.append("amount='").append(amount).append("'");
        sb.append(", oldAmount='").append(oldAmount).append("'");
        sb.append(", currency=").append(currency);
        sb.append(", text='").append(text).append("'");
        sb.append(", discountRate=").append(discountRate);
        sb.append(", oldAmountText='").append(oldAmountText).append("'");
        sb.append('}');
        return sb.toString();
    }
}
