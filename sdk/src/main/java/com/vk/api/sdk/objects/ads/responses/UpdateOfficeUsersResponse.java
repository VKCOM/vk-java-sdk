package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Error;
import java.util.Objects;

/**
 * UpdateOfficeUsersResponse object
 */
public class UpdateOfficeUsersResponse implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("is_success")
    private Boolean isSuccess;

    @SerializedName("error")
    private Error error;

    public Integer getUserId() {
        return userId;
    }

    public UpdateOfficeUsersResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public UpdateOfficeUsersResponse setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    public Error getError() {
        return error;
    }

    public UpdateOfficeUsersResponse setError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, userId, isSuccess);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateOfficeUsersResponse updateOfficeUsersResponse = (UpdateOfficeUsersResponse) o;
        return Objects.equals(userId, updateOfficeUsersResponse.userId) &&
                Objects.equals(isSuccess, updateOfficeUsersResponse.isSuccess) &&
                Objects.equals(error, updateOfficeUsersResponse.error);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UpdateOfficeUsersResponse{");
        sb.append("userId=").append(userId);
        sb.append(", isSuccess=").append(isSuccess);
        sb.append(", error=").append(error);
        sb.append('}');
        return sb.toString();
    }
}
