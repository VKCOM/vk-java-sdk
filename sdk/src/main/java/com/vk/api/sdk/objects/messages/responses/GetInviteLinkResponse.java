package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;

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
        return link != null ? link.equals(that.link) : that.link == null;
    }

    @Override
    public int hashCode() {
        return link != null ? link.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "GetInviteLinkResponse{" +
                "link='" + link + '\'' +
                '}';
    }
}
