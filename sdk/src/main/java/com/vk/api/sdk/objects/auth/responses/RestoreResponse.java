package com.vk.api.sdk.objects.auth.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * RestoreResponse object
 */
public class RestoreResponse {
    /**
     * 1 if success
     */
    @SerializedName("success")
    private RestoreResponseSuccess success;

    /**
     * Parameter needed to grant access by code
     */
    @SerializedName("sid")
    private String sid;

    public RestoreResponseSuccess getSuccess() {
        return success;
    }

    public String getSid() {
        return sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, sid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestoreResponse restoreResponse = (RestoreResponse) o;
        return Objects.equals(success, restoreResponse.success) &&
                Objects.equals(sid, restoreResponse.sid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RestoreResponse{");
        sb.append("success=").append(success);
        sb.append(", sid='").append(sid).append("'");
        sb.append('}');
        return sb.toString();
    }
}
