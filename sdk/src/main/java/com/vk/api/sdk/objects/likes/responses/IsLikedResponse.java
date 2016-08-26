package com.vk.api.sdk.objects.likes.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * IsLikedResponse object
 */
public class IsLikedResponse {
    /**
     * Information whether user liked the object
     */
    @SerializedName("liked")
    private BoolInt liked;

    /**
     * Information whether user reposted the object
     */
    @SerializedName("copied")
    private BoolInt copied;

    public boolean isLiked() {
        return liked == BoolInt.YES;
    }

    public boolean isCopied() {
        return copied == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(copied, liked);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsLikedResponse isLikedResponse = (IsLikedResponse) o;
        return Objects.equals(liked, isLikedResponse.liked) &&
                Objects.equals(copied, isLikedResponse.copied);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IsLikedResponse{");
        sb.append("liked=").append(liked);
        sb.append(", copied=").append(copied);
        sb.append('}');
        return sb.toString();
    }
}
