package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LinkStatus object
 */
public class LinkStatus {
    /**
     * Link status
     */
    @SerializedName("status")
    private String status;

    /**
     * Reject reason
     */
    @SerializedName("description")
    private String description;

    /**
     * URL
     */
    @SerializedName("redirect_url")
    private String redirectUrl;

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, description, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkStatus linkStatus = (LinkStatus) o;
        return Objects.equals(status, linkStatus.status) &&
                Objects.equals(description, linkStatus.description) &&
                Objects.equals(redirectUrl, linkStatus.redirectUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkStatus{");
        sb.append("status='").append(status).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", redirectUrl='").append(redirectUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
