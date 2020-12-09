package com.vk.api.sdk.objects.utils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * LinkChecked object
 */
public class LinkChecked implements Validable {
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

    public LinkChecked setLink(URI link) {
        this.link = link;
        return this;
    }

    public LinkCheckedStatus getStatus() {
        return status;
    }

    public LinkChecked setStatus(LinkCheckedStatus status) {
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
        LinkChecked linkChecked = (LinkChecked) o;
        return Objects.equals(link, linkChecked.link) &&
                Objects.equals(status, linkChecked.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkChecked{");
        sb.append("link=").append(link);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
