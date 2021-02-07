package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.ads.Accesses;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetOfficeUsersResponse object
 */
public class GetOfficeUsersResponse implements Validable {
    @SerializedName("accesses")
    @Required
    private List<Accesses> accesses;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    public List<Accesses> getAccesses() {
        return accesses;
    }

    public GetOfficeUsersResponse setAccesses(List<Accesses> accesses) {
        this.accesses = accesses;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public GetOfficeUsersResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accesses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOfficeUsersResponse getOfficeUsersResponse = (GetOfficeUsersResponse) o;
        return Objects.equals(userId, getOfficeUsersResponse.userId) &&
                Objects.equals(accesses, getOfficeUsersResponse.accesses);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetOfficeUsersResponse{");
        sb.append("userId=").append(userId);
        sb.append(", accesses=").append(accesses);
        sb.append('}');
        return sb.toString();
    }
}
