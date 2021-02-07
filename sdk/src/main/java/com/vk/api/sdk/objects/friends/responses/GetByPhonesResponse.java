package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.Objects;

/**
 * GetByPhonesResponse object
 */
public class GetByPhonesResponse extends UserFull implements Validable {
    /**
     * User phone
     */
    @SerializedName("phone")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public GetByPhonesResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetByPhonesResponse getByPhonesResponse = (GetByPhonesResponse) o;
        return Objects.equals(phone, getByPhonesResponse.phone);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByPhonesResponse{");
        sb.append("phone='").append(phone).append("'");
        sb.append('}');
        return sb.toString();
    }
}
