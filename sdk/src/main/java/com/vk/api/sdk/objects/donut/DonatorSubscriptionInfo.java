package com.vk.api.sdk.objects.donut;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Info about user VK Donut subscription
 */
public class DonatorSubscriptionInfo implements Validable {
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("next_payment_date")
    private Integer nextPaymentDate;

    @SerializedName("amount")
    @Required
    private Integer amount;

    @SerializedName("status")
    @Required
    private DonatorSubscriptionInfoStatus status;

    public Integer getOwnerId() {
        return ownerId;
    }

    public DonatorSubscriptionInfo setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getNextPaymentDate() {
        return nextPaymentDate;
    }

    public DonatorSubscriptionInfo setNextPaymentDate(Integer nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public DonatorSubscriptionInfo setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public DonatorSubscriptionInfoStatus getStatus() {
        return status;
    }

    public DonatorSubscriptionInfo setStatus(DonatorSubscriptionInfoStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, nextPaymentDate, ownerId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonatorSubscriptionInfo donatorSubscriptionInfo = (DonatorSubscriptionInfo) o;
        return Objects.equals(amount, donatorSubscriptionInfo.amount) &&
                Objects.equals(ownerId, donatorSubscriptionInfo.ownerId) &&
                Objects.equals(nextPaymentDate, donatorSubscriptionInfo.nextPaymentDate) &&
                Objects.equals(status, donatorSubscriptionInfo.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonatorSubscriptionInfo{");
        sb.append("amount=").append(amount);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", nextPaymentDate=").append(nextPaymentDate);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
