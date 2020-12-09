package com.vk.api.sdk.objects.utils.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.utils.LinkCheckedStatus;
import java.net.URI;
import java.util.Objects;

/**
 * CheckLinkResponse object
 */
public class CheckLinkResponse implements Validable {
    /**
     * Link URL
     */
    @SerializedName("link")
    private URI link;

    @SerializedName("status")
    private LinkCheckedStatus status;

    public URI getLink() {
        return link;
    }

    public CheckLinkResponse setLink(URI link) {
        this.link = link;
        return this;
    }

    public LinkCheckedStatus getStatus() {
        return status;
    }

    public CheckLinkResponse setStatus(LinkCheckedStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckLinkResponse checkLinkResponse = (CheckLinkResponse) o;
        return Objects.equals(link, checkLinkResponse.link) &&
                Objects.equals(status, checkLinkResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CheckLinkResponse{");
        sb.append("link=").append(link);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
