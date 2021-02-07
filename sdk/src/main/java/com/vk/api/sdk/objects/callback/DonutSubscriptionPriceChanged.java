package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DonutSubscriptionPriceChanged object
 */
public class DonutSubscriptionPriceChanged implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("amount_old")
    private Integer amountOld;

    @SerializedName("amount_new")
    private Integer amountNew;

    @SerializedName("amount_diff")
    private Float amountDiff;

    @SerializedName("amount_diff_without_fee")
    private Float amountDiffWithoutFee;

    public Integer getUserId() {
        return userId;
    }

    public DonutSubscriptionPriceChanged setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getAmountOld() {
        return amountOld;
    }

    public DonutSubscriptionPriceChanged setAmountOld(Integer amountOld) {
        this.amountOld = amountOld;
        return this;
    }

    public Integer getAmountNew() {
        return amountNew;
    }

    public DonutSubscriptionPriceChanged setAmountNew(Integer amountNew) {
        this.amountNew = amountNew;
        return this;
    }

    public Float getAmountDiff() {
        return amountDiff;
    }

    public DonutSubscriptionPriceChanged setAmountDiff(Float amountDiff) {
        this.amountDiff = amountDiff;
        return this;
    }

    public Float getAmountDiffWithoutFee() {
        return amountDiffWithoutFee;
    }

    public DonutSubscriptionPriceChanged setAmountDiffWithoutFee(Float amountDiffWithoutFee) {
        this.amountDiffWithoutFee = amountDiffWithoutFee;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOld, amountNew, amountDiff, amountDiffWithoutFee, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonutSubscriptionPriceChanged donutSubscriptionPriceChanged = (DonutSubscriptionPriceChanged) o;
        return Objects.equals(amountDiffWithoutFee, donutSubscriptionPriceChanged.amountDiffWithoutFee) &&
                Objects.equals(userId, donutSubscriptionPriceChanged.userId) &&
                Objects.equals(amountOld, donutSubscriptionPriceChanged.amountOld) &&
                Objects.equals(amountDiff, donutSubscriptionPriceChanged.amountDiff) &&
                Objects.equals(amountNew, donutSubscriptionPriceChanged.amountNew);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonutSubscriptionPriceChanged{");
        sb.append("amountDiffWithoutFee=").append(amountDiffWithoutFee);
        sb.append(", userId=").append(userId);
        sb.append(", amountOld=").append(amountOld);
        sb.append(", amountDiff=").append(amountDiff);
        sb.append(", amountNew=").append(amountNew);
        sb.append('}');
        return sb.toString();
    }
}
