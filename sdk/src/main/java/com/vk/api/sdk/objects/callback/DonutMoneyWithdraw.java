package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * DonutMoneyWithdraw object
 */
public class DonutMoneyWithdraw implements Validable {
    @SerializedName("amount")
    @Required
    private Float amount;

    @SerializedName("amount_without_fee")
    private Float amountWithoutFee;

    public Float getAmount() {
        return amount;
    }

    public DonutMoneyWithdraw setAmount(Float amount) {
        this.amount = amount;
        return this;
    }

    public Float getAmountWithoutFee() {
        return amountWithoutFee;
    }

    public DonutMoneyWithdraw setAmountWithoutFee(Float amountWithoutFee) {
        this.amountWithoutFee = amountWithoutFee;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, amountWithoutFee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonutMoneyWithdraw donutMoneyWithdraw = (DonutMoneyWithdraw) o;
        return Objects.equals(amount, donutMoneyWithdraw.amount) &&
                Objects.equals(amountWithoutFee, donutMoneyWithdraw.amountWithoutFee);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonutMoneyWithdraw{");
        sb.append("amount=").append(amount);
        sb.append(", amountWithoutFee=").append(amountWithoutFee);
        sb.append('}');
        return sb.toString();
    }
}
