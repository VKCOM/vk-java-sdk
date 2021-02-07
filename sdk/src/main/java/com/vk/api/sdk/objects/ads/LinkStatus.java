package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * LinkStatus object
 */
public class LinkStatus implements Validable {
    /**
     * Reject reason
     */
    @SerializedName("description")
    @Required
    private String description;

    /**
     * URL
     */
    @SerializedName("redirect_url")
    private URI redirectUrl;

    /**
     * Link status
     */
    @SerializedName("status")
    @Required
    private String status;

    public String getDescription() {
        return description;
    }

    public LinkStatus setDescription(String description) {
        this.description = description;
        return this;
    }

    public URI getRedirectUrl() {
        return redirectUrl;
    }

    public LinkStatus setRedirectUrl(URI redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LinkStatus setStatus(String status) {
        this.status = status;
        return this;
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
        return Objects.equals(description, linkStatus.description) &&
                Objects.equals(redirectUrl, linkStatus.redirectUrl) &&
                Objects.equals(status, linkStatus.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkStatus{");
        sb.append("description='").append(description).append("'");
        sb.append(", redirectUrl=").append(redirectUrl);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
