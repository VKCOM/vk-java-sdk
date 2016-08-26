package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Objects;

/**
 * EditPlaceResponse object
 */
public class EditPlaceResponse {
    @SerializedName("success")
    private OkResponse success;

    /**
     * Place address
     */
    @SerializedName("address")
    private String address;

    public OkResponse getSuccess() {
        return success;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, success);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditPlaceResponse editPlaceResponse = (EditPlaceResponse) o;
        return Objects.equals(success, editPlaceResponse.success) &&
                Objects.equals(address, editPlaceResponse.address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EditPlaceResponse{");
        sb.append("success=").append(success);
        sb.append(", address='").append(address).append("'");
        sb.append('}');
        return sb.toString();
    }
}
