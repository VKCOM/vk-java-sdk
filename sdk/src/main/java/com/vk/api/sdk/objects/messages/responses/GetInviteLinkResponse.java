package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Response which contains chat invite link
 */

public class GetInviteLinkResponse {

    @SerializedName("link")
    private String link;

    public String getLink() {
        return link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInviteLinkResponse that = (GetInviteLinkResponse) o;
        return Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetInviteLinkResponse{");
        sb.append("link='").append(link).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
