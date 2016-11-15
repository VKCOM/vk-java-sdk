package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Requests object
 */
public class Requests {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * ID of the user by whom friend has been suggested
     */
    @SerializedName("from")
    private String from;

    @SerializedName("mutual")
    private RequestsManual mutual;

    public Integer getUserId() {
        return userId;
    }

    public String getFrom() {
        return from;
    }

    public RequestsManual getMutual() {
        return mutual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutual, from, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Requests requests = (Requests) o;
        return Objects.equals(userId, requests.userId) &&
                Objects.equals(from, requests.from) &&
                Objects.equals(mutual, requests.mutual);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Requests{");
        sb.append("userId=").append(userId);
        sb.append(", from='").append(from).append("'");
        sb.append(", mutual=").append(mutual);
        sb.append('}');
        return sb.toString();
    }
}
