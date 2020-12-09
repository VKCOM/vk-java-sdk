package com.vk.api.sdk.objects.downloadedgames.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * PaidStatusResponse object
 */
public class PaidStatusResponse implements Validable {
    /**
     * Game has been paid
     */
    @SerializedName("is_paid")
    private Boolean isPaid;

    public Boolean getIsPaid() {
        return isPaid;
    }

    public PaidStatusResponse setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPaid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaidStatusResponse paidStatusResponse = (PaidStatusResponse) o;
        return Objects.equals(isPaid, paidStatusResponse.isPaid);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PaidStatusResponse{");
        sb.append("isPaid=").append(isPaid);
        sb.append('}');
        return sb.toString();
    }
}
