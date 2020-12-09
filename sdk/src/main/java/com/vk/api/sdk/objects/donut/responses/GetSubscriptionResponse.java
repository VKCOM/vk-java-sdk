package com.vk.api.sdk.objects.donut.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Info about user VK Donut subscription
 */
public class GetSubscriptionResponse implements Validable {
    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("next_payment_date")
    private Integer nextPaymentDate;

    @SerializedName("amount")
    @Required
    private Integer amount;

    @SerializedName("status")
    @Required
    private GetSubscriptionResponseStatus status;

    public Integer getOwnerId() {
        return ownerId;
    }

    public GetSubscriptionResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getNextPaymentDate() {
        return nextPaymentDate;
    }

    public GetSubscriptionResponse setNextPaymentDate(Integer nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public GetSubscriptionResponse setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public GetSubscriptionResponseStatus getStatus() {
        return status;
    }

    public GetSubscriptionResponse setStatus(GetSubscriptionResponseStatus status) {
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
        GetSubscriptionResponse getSubscriptionResponse = (GetSubscriptionResponse) o;
        return Objects.equals(amount, getSubscriptionResponse.amount) &&
                Objects.equals(ownerId, getSubscriptionResponse.ownerId) &&
                Objects.equals(nextPaymentDate, getSubscriptionResponse.nextPaymentDate) &&
                Objects.equals(status, getSubscriptionResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionResponse{");
        sb.append("amount=").append(amount);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", nextPaymentDate=").append(nextPaymentDate);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
