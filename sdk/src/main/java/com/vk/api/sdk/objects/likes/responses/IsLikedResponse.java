package com.vk.api.sdk.objects.likes.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * IsLikedResponse object
 */
public class IsLikedResponse implements Validable {
    /**
     * Information whether user liked the object
     */
    @SerializedName("liked")
    @Required
    private BoolInt liked;

    /**
     * Information whether user reposted the object
     */
    @SerializedName("copied")
    @Required
    private BoolInt copied;

    public boolean isLiked() {
        return liked == BoolInt.YESBOOL;
    }

    public BoolInt getLiked() {
        return liked;
    }

    public boolean isCopied() {
        return copied == BoolInt.YESBOOL;
    }

    public BoolInt getCopied() {
        return copied;
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
        return Objects.equals(copied, isLikedResponse.copied) &&
                Objects.equals(liked, isLikedResponse.liked);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("IsLikedResponse{");
        sb.append("copied=").append(copied);
        sb.append(", liked=").append(liked);
        sb.append('}');
        return sb.toString();
    }
}
