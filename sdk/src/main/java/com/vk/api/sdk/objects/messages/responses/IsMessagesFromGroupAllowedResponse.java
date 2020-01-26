package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * IsMessagesFromGroupAllowedResponse object
 */
public class IsMessagesFromGroupAllowedResponse implements Validable {
    @SerializedName("is_allowed")
    private BoolInt isAllowed;

    public boolean isAllowed() {
        return isAllowed == BoolInt.YESBOOL;
    }

    public BoolInt getIsAllowed() {
        return isAllowed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsMessagesFromGroupAllowedResponse isMessagesFromGroupAllowedResponse = (IsMessagesFromGroupAllowedResponse) o;
        return Objects.equals(isAllowed, isMessagesFromGroupAllowedResponse.isAllowed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("IsMessagesFromGroupAllowedResponse{");
        sb.append("isAllowed=").append(isAllowed);
        sb.append('}');
        return sb.toString();
    }
}
