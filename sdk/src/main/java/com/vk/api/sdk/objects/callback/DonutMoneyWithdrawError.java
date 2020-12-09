package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * DonutMoneyWithdrawError object
 */
public class DonutMoneyWithdrawError implements Validable {
    @SerializedName("reason")
    @Required
    private String reason;

    public String getReason() {
        return reason;
    }

    public DonutMoneyWithdrawError setReason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonutMoneyWithdrawError donutMoneyWithdrawError = (DonutMoneyWithdrawError) o;
        return Objects.equals(reason, donutMoneyWithdrawError.reason);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DonutMoneyWithdrawError{");
        sb.append("reason='").append(reason).append("'");
        sb.append('}');
        return sb.toString();
    }
}
