package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * CheckLinkResponse object
 */
public class CheckLinkResponse implements Validable {
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

    public CheckLinkResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public URI getRedirectUrl() {
        return redirectUrl;
    }

    public CheckLinkResponse setRedirectUrl(URI redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CheckLinkResponse setStatus(String status) {
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
        CheckLinkResponse checkLinkResponse = (CheckLinkResponse) o;
        return Objects.equals(description, checkLinkResponse.description) &&
                Objects.equals(redirectUrl, checkLinkResponse.redirectUrl) &&
                Objects.equals(status, checkLinkResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CheckLinkResponse{");
        sb.append("description='").append(description).append("'");
        sb.append(", redirectUrl=").append(redirectUrl);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
